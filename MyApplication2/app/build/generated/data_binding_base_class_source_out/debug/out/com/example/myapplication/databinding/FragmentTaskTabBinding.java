// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.example.myapplication.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTaskTabBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ViewPager2 pager;

  @NonNull
  public final TabLayout tablayout;

  @NonNull
  public final TabItem tasksMine;

  @NonNull
  public final TabItem tasksOther;

  private FragmentTaskTabBinding(@NonNull CoordinatorLayout rootView, @NonNull ViewPager2 pager,
      @NonNull TabLayout tablayout, @NonNull TabItem tasksMine, @NonNull TabItem tasksOther) {
    this.rootView = rootView;
    this.pager = pager;
    this.tablayout = tablayout;
    this.tasksMine = tasksMine;
    this.tasksOther = tasksOther;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTaskTabBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTaskTabBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_task_tab, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTaskTabBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pager;
      ViewPager2 pager = rootView.findViewById(id);
      if (pager == null) {
        break missingId;
      }

      id = R.id.tablayout;
      TabLayout tablayout = rootView.findViewById(id);
      if (tablayout == null) {
        break missingId;
      }

      id = R.id.tasks_mine;
      TabItem tasksMine = rootView.findViewById(id);
      if (tasksMine == null) {
        break missingId;
      }

      id = R.id.tasks_other;
      TabItem tasksOther = rootView.findViewById(id);
      if (tasksOther == null) {
        break missingId;
      }

      return new FragmentTaskTabBinding((CoordinatorLayout) rootView, pager, tablayout, tasksMine,
          tasksOther);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
