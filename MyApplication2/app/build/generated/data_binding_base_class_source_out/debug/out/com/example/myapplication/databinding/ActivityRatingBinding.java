// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
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

public final class ActivityRatingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline23;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final Guideline guideline9;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final EditText reviewComment;

  @NonNull
  public final Button reviewConfirm;

  @NonNull
  public final TextView textView2;

  private ActivityRatingBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline2,
      @NonNull Guideline guideline23, @NonNull Guideline guideline3, @NonNull Guideline guideline4,
      @NonNull Guideline guideline9, @NonNull RatingBar ratingBar, @NonNull EditText reviewComment,
      @NonNull Button reviewConfirm, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.guideline2 = guideline2;
    this.guideline23 = guideline23;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
    this.guideline9 = guideline9;
    this.ratingBar = ratingBar;
    this.reviewComment = reviewComment;
    this.reviewConfirm = reviewConfirm;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRatingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRatingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_rating, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRatingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.guideline23;
      Guideline guideline23 = rootView.findViewById(id);
      if (guideline23 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = rootView.findViewById(id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.guideline4;
      Guideline guideline4 = rootView.findViewById(id);
      if (guideline4 == null) {
        break missingId;
      }

      id = R.id.guideline9;
      Guideline guideline9 = rootView.findViewById(id);
      if (guideline9 == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = rootView.findViewById(id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.reviewComment;
      EditText reviewComment = rootView.findViewById(id);
      if (reviewComment == null) {
        break missingId;
      }

      id = R.id.review_confirm;
      Button reviewConfirm = rootView.findViewById(id);
      if (reviewConfirm == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = rootView.findViewById(id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityRatingBinding((ConstraintLayout) rootView, guideline2, guideline23,
          guideline3, guideline4, guideline9, ratingBar, reviewComment, reviewConfirm, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
