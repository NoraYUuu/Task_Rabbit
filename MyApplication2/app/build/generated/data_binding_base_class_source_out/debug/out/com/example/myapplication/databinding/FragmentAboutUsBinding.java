// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class FragmentAboutUsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline28;

  @NonNull
  public final Guideline guideline29;

  @NonNull
  public final Guideline guideline30;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView13;

  private FragmentAboutUsBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline28,
      @NonNull Guideline guideline29, @NonNull Guideline guideline30, @NonNull TextView textView12,
      @NonNull TextView textView13) {
    this.rootView = rootView;
    this.guideline28 = guideline28;
    this.guideline29 = guideline29;
    this.guideline30 = guideline30;
    this.textView12 = textView12;
    this.textView13 = textView13;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutUsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutUsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about_us, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutUsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline28;
      Guideline guideline28 = rootView.findViewById(id);
      if (guideline28 == null) {
        break missingId;
      }

      id = R.id.guideline29;
      Guideline guideline29 = rootView.findViewById(id);
      if (guideline29 == null) {
        break missingId;
      }

      id = R.id.guideline30;
      Guideline guideline30 = rootView.findViewById(id);
      if (guideline30 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = rootView.findViewById(id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = rootView.findViewById(id);
      if (textView13 == null) {
        break missingId;
      }

      return new FragmentAboutUsBinding((ConstraintLayout) rootView, guideline28, guideline29,
          guideline30, textView12, textView13);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}