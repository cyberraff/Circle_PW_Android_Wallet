// Generated by view binder compiler. Do not edit!
package com.circle.w3s.sample.wallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.circle.w3s.sample.wallet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCustomBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView btMain;

  @NonNull
  public final TextView msg;

  private ActivityCustomBinding(@NonNull ConstraintLayout rootView, @NonNull TextView btMain,
      @NonNull TextView msg) {
    this.rootView = rootView;
    this.btMain = btMain;
    this.msg = msg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCustomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCustomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_custom, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCustomBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btMain;
      TextView btMain = ViewBindings.findChildViewById(rootView, id);
      if (btMain == null) {
        break missingId;
      }

      id = R.id.msg;
      TextView msg = ViewBindings.findChildViewById(rootView, id);
      if (msg == null) {
        break missingId;
      }

      return new ActivityCustomBinding((ConstraintLayout) rootView, btMain, msg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
