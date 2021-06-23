// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.myapplication.R;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAcceptTaskBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextInputEditText TaskDetails;

  @NonNull
  public final Button acceptConfirm;

  @NonNull
  public final TextInputLayout acceptDate;

  @NonNull
  public final TextInputLayout acceptDesc;

  @NonNull
  public final MaterialAutoCompleteTextView acceptOutlinedExposedDropdownEditable;

  @NonNull
  public final MaterialAutoCompleteTextView acceptOutlinedExposedDropdownEditableCategory;

  @NonNull
  public final TextInputLayout acceptPrice;

  @NonNull
  public final TextInputLayout acceptTaskMsg;

  @NonNull
  public final TextInputLayout acceptTime;

  @NonNull
  public final TextInputLayout acceptTitle;

  @NonNull
  public final LinearLayout container;

  @NonNull
  public final EditText editTextDate;

  @NonNull
  public final EditText editTextTime;

  @NonNull
  public final EditText price;

  private ActivityAcceptTaskBinding(@NonNull ScrollView rootView,
      @NonNull TextInputEditText TaskDetails, @NonNull Button acceptConfirm,
      @NonNull TextInputLayout acceptDate, @NonNull TextInputLayout acceptDesc,
      @NonNull MaterialAutoCompleteTextView acceptOutlinedExposedDropdownEditable,
      @NonNull MaterialAutoCompleteTextView acceptOutlinedExposedDropdownEditableCategory,
      @NonNull TextInputLayout acceptPrice, @NonNull TextInputLayout acceptTaskMsg,
      @NonNull TextInputLayout acceptTime, @NonNull TextInputLayout acceptTitle,
      @NonNull LinearLayout container, @NonNull EditText editTextDate,
      @NonNull EditText editTextTime, @NonNull EditText price) {
    this.rootView = rootView;
    this.TaskDetails = TaskDetails;
    this.acceptConfirm = acceptConfirm;
    this.acceptDate = acceptDate;
    this.acceptDesc = acceptDesc;
    this.acceptOutlinedExposedDropdownEditable = acceptOutlinedExposedDropdownEditable;
    this.acceptOutlinedExposedDropdownEditableCategory = acceptOutlinedExposedDropdownEditableCategory;
    this.acceptPrice = acceptPrice;
    this.acceptTaskMsg = acceptTaskMsg;
    this.acceptTime = acceptTime;
    this.acceptTitle = acceptTitle;
    this.container = container;
    this.editTextDate = editTextDate;
    this.editTextTime = editTextTime;
    this.price = price;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAcceptTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAcceptTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_accept_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAcceptTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TaskDetails;
      TextInputEditText TaskDetails = rootView.findViewById(id);
      if (TaskDetails == null) {
        break missingId;
      }

      id = R.id.accept_confirm;
      Button acceptConfirm = rootView.findViewById(id);
      if (acceptConfirm == null) {
        break missingId;
      }

      id = R.id.accept_date;
      TextInputLayout acceptDate = rootView.findViewById(id);
      if (acceptDate == null) {
        break missingId;
      }

      id = R.id.accept_desc;
      TextInputLayout acceptDesc = rootView.findViewById(id);
      if (acceptDesc == null) {
        break missingId;
      }

      id = R.id.accept_outlined_exposed_dropdown_editable;
      MaterialAutoCompleteTextView acceptOutlinedExposedDropdownEditable = rootView.findViewById(id);
      if (acceptOutlinedExposedDropdownEditable == null) {
        break missingId;
      }

      id = R.id.accept_outlined_exposed_dropdown_editable_category;
      MaterialAutoCompleteTextView acceptOutlinedExposedDropdownEditableCategory = rootView.findViewById(id);
      if (acceptOutlinedExposedDropdownEditableCategory == null) {
        break missingId;
      }

      id = R.id.accept_price;
      TextInputLayout acceptPrice = rootView.findViewById(id);
      if (acceptPrice == null) {
        break missingId;
      }

      id = R.id.accept_task_msg;
      TextInputLayout acceptTaskMsg = rootView.findViewById(id);
      if (acceptTaskMsg == null) {
        break missingId;
      }

      id = R.id.accept_time;
      TextInputLayout acceptTime = rootView.findViewById(id);
      if (acceptTime == null) {
        break missingId;
      }

      id = R.id.accept_title;
      TextInputLayout acceptTitle = rootView.findViewById(id);
      if (acceptTitle == null) {
        break missingId;
      }

      id = R.id.container;
      LinearLayout container = rootView.findViewById(id);
      if (container == null) {
        break missingId;
      }

      id = R.id.editTextDate;
      EditText editTextDate = rootView.findViewById(id);
      if (editTextDate == null) {
        break missingId;
      }

      id = R.id.editTextTime;
      EditText editTextTime = rootView.findViewById(id);
      if (editTextTime == null) {
        break missingId;
      }

      id = R.id.price;
      EditText price = rootView.findViewById(id);
      if (price == null) {
        break missingId;
      }

      return new ActivityAcceptTaskBinding((ScrollView) rootView, TaskDetails, acceptConfirm,
          acceptDate, acceptDesc, acceptOutlinedExposedDropdownEditable,
          acceptOutlinedExposedDropdownEditableCategory, acceptPrice, acceptTaskMsg, acceptTime,
          acceptTitle, container, editTextDate, editTextTime, price);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
