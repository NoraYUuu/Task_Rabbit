// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.myapplication.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LeaderBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardbg;

  @NonNull
  public final Guideline guideline24;

  @NonNull
  public final Guideline guideline25;

  @NonNull
  public final CircleImageView leaderImg;

  @NonNull
  public final TextView leaderName;

  @NonNull
  public final TextView leaderRank;

  private LeaderBinding(@NonNull CardView rootView, @NonNull CardView cardbg,
      @NonNull Guideline guideline24, @NonNull Guideline guideline25,
      @NonNull CircleImageView leaderImg, @NonNull TextView leaderName,
      @NonNull TextView leaderRank) {
    this.rootView = rootView;
    this.cardbg = cardbg;
    this.guideline24 = guideline24;
    this.guideline25 = guideline25;
    this.leaderImg = leaderImg;
    this.leaderName = leaderName;
    this.leaderRank = leaderRank;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LeaderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.leader, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardbg = (CardView) rootView;

      id = R.id.guideline24;
      Guideline guideline24 = rootView.findViewById(id);
      if (guideline24 == null) {
        break missingId;
      }

      id = R.id.guideline25;
      Guideline guideline25 = rootView.findViewById(id);
      if (guideline25 == null) {
        break missingId;
      }

      id = R.id.leader_img;
      CircleImageView leaderImg = rootView.findViewById(id);
      if (leaderImg == null) {
        break missingId;
      }

      id = R.id.leader_name;
      TextView leaderName = rootView.findViewById(id);
      if (leaderName == null) {
        break missingId;
      }

      id = R.id.leader_rank;
      TextView leaderRank = rootView.findViewById(id);
      if (leaderRank == null) {
        break missingId;
      }

      return new LeaderBinding((CardView) rootView, cardbg, guideline24, guideline25, leaderImg,
          leaderName, leaderRank);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
