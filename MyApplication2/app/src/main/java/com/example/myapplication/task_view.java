package com.example.myapplication;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

import org.jetbrains.annotations.NotNull;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link task_view#newInstance} factory method to
 * create an instance of this fragment.
 */
public class task_view extends Fragment {
    private TextInputEditText title, description, date, price, time;
    private String uDate, uDesc, uUserId, utaskId, uLocation, uPrice, uTitle, uTime, uType;
    private AutoCompleteTextView location, category;
    private Button chatButton;
    private int sourceFrag = 2;
    private BottomNavigationView navigation;
    private int width, height;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public task_view() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static task_view newInstance(String param1, String param2) {
        task_view fragment = new task_view();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_task_view, container, false);
        navigation = getActivity().findViewById(R.id.bottomNavigationView);
        ViewGroup.LayoutParams params = navigation.getLayoutParams();
        width = params.width;
        height = params.height;
        params.height = 0;
        navigation.setLayoutParams(params);

        Bundle b = getArguments();

        uDate = b.getString("uDate");
        uDesc = b.getString("uDesc");
        uUserId = b.getString("uUserId");
        utaskId = b.getString("utaskId");
        uLocation = b.getString("uLocation");
        uPrice = b.getString("uPrice");
        uTitle = b.getString("uTitle");
        uTime = b.getString("uTime");
        uType = b.getString("uCategory");

        sourceFrag = b.getInt("source");
        title = v.findViewById(R.id.taskViewTitle);
        description = v.findViewById(R.id.taskViewDesc);
        location = v.findViewById(R.id.taskViewLocation);
        category = v.findViewById(R.id.taskViewCategory);
        price = v.findViewById(R.id.taskViewPrice);
        date = v.findViewById(R.id.taskViewDate);
        time = v.findViewById(R.id.taskViewTime);
        chatButton = v.findViewById(R.id.taskViewChat);

        title.setText(uTitle);
        description.setText(uDesc);
        date.setText(uDate);
        location.setText(uLocation, false);
        category.setText(uType, false);
        price.setText(uPrice);
        time.setText(uTime);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (FirebaseAuth.getInstance().getCurrentUser().getUid().equals(uUserId)) {
            ((AppCompatActivity)getActivity()).findViewById(R.id.taskViewChat).setVisibility(View.GONE);
        }
        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MessageActivity.class);
                i.putExtra("userID", uUserId);
                i.putExtra("taskID", utaskId);
                i.putExtra("taskTitle", uTitle);
                startActivity(i);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        ViewGroup.LayoutParams params = navigation.getLayoutParams();
        params.height = 0;
        navigation.setLayoutParams(params);
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
    }

    @Override
    public void onPause() {
        super.onPause();
        ViewGroup.LayoutParams params = navigation.getLayoutParams();
        params.height = height;
        params.width = width;
        navigation.setLayoutParams(params);
    }

}