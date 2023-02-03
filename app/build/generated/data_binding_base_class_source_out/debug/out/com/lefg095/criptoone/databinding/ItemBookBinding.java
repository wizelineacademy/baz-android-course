// Generated by view binder compiler. Do not edit!
package com.lefg095.criptoone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.lefg095.criptoone.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemBookBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout lyBook;

  @NonNull
  public final TextView tvBookName;

  private ItemBookBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView,
      @NonNull ConstraintLayout lyBook, @NonNull TextView tvBookName) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.lyBook = lyBook;
    this.tvBookName = tvBookName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_book, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBookBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      ConstraintLayout lyBook = (ConstraintLayout) rootView;

      id = R.id.tv_book_name;
      TextView tvBookName = rootView.findViewById(id);
      if (tvBookName == null) {
        break missingId;
      }

      return new ItemBookBinding((ConstraintLayout) rootView, imageView, lyBook, tvBookName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
