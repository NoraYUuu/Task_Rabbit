package com.example.myapplication;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class ProfileFragment extends Fragment {

    //all user info is stored using user's Uid as key
    private FirebaseAuth firebaseAuth;
    private FirebaseDatabase rtNode;
    private FirebaseUser user;
    private DatabaseReference reference;
    private FirebaseStorage storage;
    private StorageReference storageReference;

    private TextInputLayout name, hp, addr;
    private Button save, logout;
    private ImageButton photoBtn;
    public Uri imageUri;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment profile.
     */

    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        firebaseAuth = FirebaseAuth.getInstance();
        rtNode = FirebaseDatabase.
                getInstance("https://taskrabbits-1621680681859-default-rtdb.asia-southeast1.firebasedatabase.app/");
        reference = rtNode.getReference("Users");
        user = firebaseAuth.getCurrentUser();
        storage = FirebaseStorage.getInstance();

        displayInfo();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view,
                              @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //handle logout button
        logout = getView().findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n= firebaseAuth.getCurrentUser().getDisplayName();
                firebaseAuth.signOut();
                Toast.makeText(getContext(), "Bye, " + n, Toast.LENGTH_SHORT).show();

                //redirect to loginpg
                startActivity(new Intent(getContext(), LoginActivity.class));
            }
        });

        //handle save button
        save = getView().findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateProfile();
                //redirect to main page

            }
        });

        //handle photo button
        photoBtn  = getView().findViewById(R.id.upload);
        photoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //redirect to helper activity
                startActivity(new Intent(getContext(), PhotoProfile.class));
                setImage(getView());
            }
        });
    }

    private void updateProfile() {
        name = getView().findViewById(R.id.editUsername);
        hp = getView().findViewById(R.id.editPhone);
        addr = getView().findViewById(R.id.editAddress);

        String username = name.getEditText().getText().toString();
        String phone = hp.getEditText().getText().toString();
        String address = addr.getEditText().getText().toString();

        //update details of existing use  r in database
        reference.child(user.getUid()).child("name").setValue(username);
        reference.child(user.getUid()).child("address").setValue(address);

        if (phone.length() == 8) {
            Toast.makeText(getContext(), "Profile updated successfully!", Toast.LENGTH_SHORT).show();
            reference.child(user.getUid()).child("hp").setValue(phone);
            startActivity(new Intent(getContext(), MainActivity.class));
        } else {
            Toast.makeText(getContext(), "This phone number is invalid. Try again!", Toast.LENGTH_SHORT).show();
        }
    }

    private void displayInfo() {
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                String uName = snapshot.child(firebaseAuth.getUid()).child("name").getValue(String.class);
                String uPhone = snapshot.child(firebaseAuth.getUid()).child("hp").getValue(String.class);
                String uAddress = snapshot.child(firebaseAuth.getUid()).child("address").getValue(String.class);

                //get the relevant input fields in profile
                TextInputLayout nameField = getView().findViewById(R.id.editUsername);
                TextInputLayout hp = getView().findViewById(R.id.editPhone);
                TextInputLayout addr = getView().findViewById(R.id.editAddress);

                //display user info
                nameField.getEditText().setText(uName);
                hp.getEditText().setText(uPhone);
                addr.getEditText().setText(uAddress);

                setImage(getView());
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {
                Toast.makeText(getContext(), "Unable to access database", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //no photo uploaded - set grey profile image
    //photo uploaded - get user photo from db using user's Uid and display it
    private void setImage(View v) {
        ImageView iv = v.findViewById(R.id.editPhoto);
        reference.child(firebaseAuth.getUid()).addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if (snapshot.hasChild("photo")) {
                    setUploadPhoto(iv);
                } else {
                    iv.setImageResource(R.drawable.greyprof);
                }
            }
            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) { }
        });
    }

    private void setUploadPhoto(ImageView iv) {
        storageReference = storage
                .getReferenceFromUrl("gs://taskrabbits-1621680681859.appspot.com/images/"
                        + firebaseAuth.getUid() + ".jpg");

        storageReference.getDownloadUrl()
                .addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Glide.with(getContext()).load(uri).into(iv);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull @NotNull Exception e) {
                    }
                });
    }
}









