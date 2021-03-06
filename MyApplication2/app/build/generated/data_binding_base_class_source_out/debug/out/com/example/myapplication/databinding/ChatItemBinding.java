// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.myapplication.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChatItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView chatItemProfileImage;

  @NonNull
  public final TextView chatItemStatus;

  @NonNull
  public final TextView chatItemTitle;

  @NonNull
  public final TextView chatItemUsername;

  @NonNull
  public final CircleImageView imgOff;

  @NonNull
  public final CircleImageView imgOn;

  @NonNull
  public final TextView inboxUnread;

  private ChatItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircleImageView chatItemProfileImage, @NonNull TextView chatItemStatus,
      @NonNull TextView chatItemTitle, @NonNull TextView chatItemUsername,
      @NonNull CircleImageView imgOff, @NonNull CircleImageView imgOn,
      @NonNull TextView inboxUnread) {
    this.rootView = rootView;
    this.chatItemProfileImage = chatItemProfileImage;
    this.chatItemStatus = chatItemStatus;
    this.chatItemTitle = chatItemTitle;
    this.chatItemUsername = chatItemUsername;
    this.imgOff = imgOff;
    this.imgOn = imgOn;
    this.inboxUnread = inboxUnread;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChatItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChatItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.chat_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChatItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chat_item_profile_image;
      CircleImageView chatItemProfileImage = rootView.findViewById(id);
      if (chatItemProfileImage == null) {
        break missingId;
      }

      id = R.id.chat_item_status;
      TextView chatItemStatus = rootView.findViewById(id);
      if (chatItemStatus == null) {
        break missingId;
      }

      id = R.id.chat_item_title;
      TextView chatItemTitle = rootView.findViewById(id);
      if (chatItemTitle == null) {
        break missingId;
      }

      id = R.id.chat_item_username;
      TextView chatItemUsername = rootView.findViewById(id);
      if (chatItemUsername == null) {
        break missingId;
      }

      id = R.id.img_off;
      CircleImageView imgOff = rootView.findViewById(id);
      if (imgOff == null) {
        break missingId;
      }

      id = R.id.img_on;
      CircleImageView imgOn = rootView.findViewById(id);
      if (imgOn == null) {
        break missingId;
      }

      id = R.id.inbox_unread;
      TextView inboxUnread = rootView.findViewById(id);
      if (inboxUnread == null) {
        break missingId;
      }

      return new ChatItemBinding((ConstraintLayout) rootView, chatItemProfileImage, chatItemStatus,
          chatItemTitle, chatItemUsername, imgOff, imgOn, inboxUnread);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
