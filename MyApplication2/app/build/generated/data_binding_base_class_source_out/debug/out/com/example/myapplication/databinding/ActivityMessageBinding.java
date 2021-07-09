// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.myapplication.R;
import com.google.android.material.appbar.AppBarLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMessageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button acceptBtn;

  @NonNull
  public final AppBarLayout barLayout;

  @NonNull
  public final ImageButton btnSend;

  @NonNull
  public final Button completeBtn;

  @NonNull
  public final RelativeLayout msgBottom;

  @NonNull
  public final RecyclerView msgRecyclerView;

  @NonNull
  public final Toolbar msgToolbar;

  @NonNull
  public final CircleImageView profileImageRight;

  @NonNull
  public final EditText textSend;

  @NonNull
  public final TextView userName;

  private ActivityMessageBinding(@NonNull ConstraintLayout rootView, @NonNull Button acceptBtn,
      @NonNull AppBarLayout barLayout, @NonNull ImageButton btnSend, @NonNull Button completeBtn,
      @NonNull RelativeLayout msgBottom, @NonNull RecyclerView msgRecyclerView,
      @NonNull Toolbar msgToolbar, @NonNull CircleImageView profileImageRight,
      @NonNull EditText textSend, @NonNull TextView userName) {
    this.rootView = rootView;
    this.acceptBtn = acceptBtn;
    this.barLayout = barLayout;
    this.btnSend = btnSend;
    this.completeBtn = completeBtn;
    this.msgBottom = msgBottom;
    this.msgRecyclerView = msgRecyclerView;
    this.msgToolbar = msgToolbar;
    this.profileImageRight = profileImageRight;
    this.textSend = textSend;
    this.userName = userName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_message, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMessageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.accept_btn;
      Button acceptBtn = rootView.findViewById(id);
      if (acceptBtn == null) {
        break missingId;
      }

      id = R.id.bar_layout;
      AppBarLayout barLayout = rootView.findViewById(id);
      if (barLayout == null) {
        break missingId;
      }

      id = R.id.btn_send;
      ImageButton btnSend = rootView.findViewById(id);
      if (btnSend == null) {
        break missingId;
      }

      id = R.id.complete_btn;
      Button completeBtn = rootView.findViewById(id);
      if (completeBtn == null) {
        break missingId;
      }

      id = R.id.msg_bottom;
      RelativeLayout msgBottom = rootView.findViewById(id);
      if (msgBottom == null) {
        break missingId;
      }

      id = R.id.msg_recyclerView;
      RecyclerView msgRecyclerView = rootView.findViewById(id);
      if (msgRecyclerView == null) {
        break missingId;
      }

      id = R.id.msg_toolbar;
      Toolbar msgToolbar = rootView.findViewById(id);
      if (msgToolbar == null) {
        break missingId;
      }

      id = R.id.profile_image_right;
      CircleImageView profileImageRight = rootView.findViewById(id);
      if (profileImageRight == null) {
        break missingId;
      }

      id = R.id.text_send;
      EditText textSend = rootView.findViewById(id);
      if (textSend == null) {
        break missingId;
      }

      id = R.id.user_name;
      TextView userName = rootView.findViewById(id);
      if (userName == null) {
        break missingId;
      }

      return new ActivityMessageBinding((ConstraintLayout) rootView, acceptBtn, barLayout, btnSend,
          completeBtn, msgBottom, msgRecyclerView, msgToolbar, profileImageRight, textSend,
          userName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
