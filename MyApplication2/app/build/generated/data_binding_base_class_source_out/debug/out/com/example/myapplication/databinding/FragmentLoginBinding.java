// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline34;

  @NonNull
  public final Guideline guideline35;

  @NonNull
  public final Guideline guideline36;

  @NonNull
  public final ImageButton imageButton16;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textView16;

  private FragmentLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline34,
      @NonNull Guideline guideline35, @NonNull Guideline guideline36,
      @NonNull ImageButton imageButton16, @NonNull ImageView imageView3,
      @NonNull TextView textView16) {
    this.rootView = rootView;
    this.guideline34 = guideline34;
    this.guideline35 = guideline35;
    this.guideline36 = guideline36;
    this.imageButton16 = imageButton16;
    this.imageView3 = imageView3;
    this.textView16 = textView16;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline34;
      Guideline guideline34 = rootView.findViewById(id);
      if (guideline34 == null) {
        break missingId;
      }

      id = R.id.guideline35;
      Guideline guideline35 = rootView.findViewById(id);
      if (guideline35 == null) {
        break missingId;
      }

      id = R.id.guideline36;
      Guideline guideline36 = rootView.findViewById(id);
      if (guideline36 == null) {
        break missingId;
      }

      id = R.id.imageButton16;
      ImageButton imageButton16 = rootView.findViewById(id);
      if (imageButton16 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = rootView.findViewById(id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = rootView.findViewById(id);
      if (textView16 == null) {
        break missingId;
      }

      return new FragmentLoginBinding((ConstraintLayout) rootView, guideline34, guideline35,
          guideline36, imageButton16, imageView3, textView16);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}