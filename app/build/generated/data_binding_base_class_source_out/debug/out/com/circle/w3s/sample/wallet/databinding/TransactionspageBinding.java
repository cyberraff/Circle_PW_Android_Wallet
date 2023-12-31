// Generated by view binder compiler. Do not edit!
package com.circle.w3s.sample.wallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TableLayout;
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

public final class TransactionspageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView amountTextView;

  @NonNull
  public final Button backBtn;

  @NonNull
  public final Button backToTransactionsTableButton;

  @NonNull
  public final TextView blockchainTextView;

  @NonNull
  public final TextView circleHeader7;

  @NonNull
  public final TextView createDateTextView;

  @NonNull
  public final TextView destinationAddressTextView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView pageHeaderTextView;

  @NonNull
  public final TextView sourceAddressTextView;

  @NonNull
  public final TextView stateTextView;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TextView tokenTextView;

  @NonNull
  public final ScrollView transactionDetailsScrollView;

  @NonNull
  public final ScrollView transactionTablescrollView;

  @NonNull
  public final TextView transactionTypeTextView;

  @NonNull
  public final TextView txHashTextView;

  @NonNull
  public final TextView updateDateTextView;

  @NonNull
  public final TextView walletIdTextView;

  private TransactionspageBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView amountTextView, @NonNull Button backBtn,
      @NonNull Button backToTransactionsTableButton, @NonNull TextView blockchainTextView,
      @NonNull TextView circleHeader7, @NonNull TextView createDateTextView,
      @NonNull TextView destinationAddressTextView, @NonNull ImageView imageView2,
      @NonNull TextView pageHeaderTextView, @NonNull TextView sourceAddressTextView,
      @NonNull TextView stateTextView, @NonNull TableLayout tableLayout,
      @NonNull TextView tokenTextView, @NonNull ScrollView transactionDetailsScrollView,
      @NonNull ScrollView transactionTablescrollView, @NonNull TextView transactionTypeTextView,
      @NonNull TextView txHashTextView, @NonNull TextView updateDateTextView,
      @NonNull TextView walletIdTextView) {
    this.rootView = rootView;
    this.amountTextView = amountTextView;
    this.backBtn = backBtn;
    this.backToTransactionsTableButton = backToTransactionsTableButton;
    this.blockchainTextView = blockchainTextView;
    this.circleHeader7 = circleHeader7;
    this.createDateTextView = createDateTextView;
    this.destinationAddressTextView = destinationAddressTextView;
    this.imageView2 = imageView2;
    this.pageHeaderTextView = pageHeaderTextView;
    this.sourceAddressTextView = sourceAddressTextView;
    this.stateTextView = stateTextView;
    this.tableLayout = tableLayout;
    this.tokenTextView = tokenTextView;
    this.transactionDetailsScrollView = transactionDetailsScrollView;
    this.transactionTablescrollView = transactionTablescrollView;
    this.transactionTypeTextView = transactionTypeTextView;
    this.txHashTextView = txHashTextView;
    this.updateDateTextView = updateDateTextView;
    this.walletIdTextView = walletIdTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TransactionspageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TransactionspageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.transactionspage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TransactionspageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amountTextView;
      TextView amountTextView = ViewBindings.findChildViewById(rootView, id);
      if (amountTextView == null) {
        break missingId;
      }

      id = R.id.backBtn;
      Button backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.backToTransactionsTableButton;
      Button backToTransactionsTableButton = ViewBindings.findChildViewById(rootView, id);
      if (backToTransactionsTableButton == null) {
        break missingId;
      }

      id = R.id.blockchainTextView;
      TextView blockchainTextView = ViewBindings.findChildViewById(rootView, id);
      if (blockchainTextView == null) {
        break missingId;
      }

      id = R.id.circleHeader7;
      TextView circleHeader7 = ViewBindings.findChildViewById(rootView, id);
      if (circleHeader7 == null) {
        break missingId;
      }

      id = R.id.createDateTextView;
      TextView createDateTextView = ViewBindings.findChildViewById(rootView, id);
      if (createDateTextView == null) {
        break missingId;
      }

      id = R.id.destinationAddressTextView;
      TextView destinationAddressTextView = ViewBindings.findChildViewById(rootView, id);
      if (destinationAddressTextView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.pageHeaderTextView;
      TextView pageHeaderTextView = ViewBindings.findChildViewById(rootView, id);
      if (pageHeaderTextView == null) {
        break missingId;
      }

      id = R.id.sourceAddressTextView;
      TextView sourceAddressTextView = ViewBindings.findChildViewById(rootView, id);
      if (sourceAddressTextView == null) {
        break missingId;
      }

      id = R.id.stateTextView;
      TextView stateTextView = ViewBindings.findChildViewById(rootView, id);
      if (stateTextView == null) {
        break missingId;
      }

      id = R.id.tableLayout;
      TableLayout tableLayout = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout == null) {
        break missingId;
      }

      id = R.id.tokenTextView;
      TextView tokenTextView = ViewBindings.findChildViewById(rootView, id);
      if (tokenTextView == null) {
        break missingId;
      }

      id = R.id.transactionDetailsScrollView;
      ScrollView transactionDetailsScrollView = ViewBindings.findChildViewById(rootView, id);
      if (transactionDetailsScrollView == null) {
        break missingId;
      }

      id = R.id.transactionTablescrollView;
      ScrollView transactionTablescrollView = ViewBindings.findChildViewById(rootView, id);
      if (transactionTablescrollView == null) {
        break missingId;
      }

      id = R.id.transactionTypeTextView;
      TextView transactionTypeTextView = ViewBindings.findChildViewById(rootView, id);
      if (transactionTypeTextView == null) {
        break missingId;
      }

      id = R.id.txHashTextView;
      TextView txHashTextView = ViewBindings.findChildViewById(rootView, id);
      if (txHashTextView == null) {
        break missingId;
      }

      id = R.id.updateDateTextView;
      TextView updateDateTextView = ViewBindings.findChildViewById(rootView, id);
      if (updateDateTextView == null) {
        break missingId;
      }

      id = R.id.walletIdTextView;
      TextView walletIdTextView = ViewBindings.findChildViewById(rootView, id);
      if (walletIdTextView == null) {
        break missingId;
      }

      return new TransactionspageBinding((ConstraintLayout) rootView, amountTextView, backBtn,
          backToTransactionsTableButton, blockchainTextView, circleHeader7, createDateTextView,
          destinationAddressTextView, imageView2, pageHeaderTextView, sourceAddressTextView,
          stateTextView, tableLayout, tokenTextView, transactionDetailsScrollView,
          transactionTablescrollView, transactionTypeTextView, txHashTextView, updateDateTextView,
          walletIdTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
