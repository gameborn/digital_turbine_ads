// Generated by view binder compiler. Do not edit!
package com.digitalturbine.dtproductlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.digitalturbine.dtproductlist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView adDownloads;

  @NonNull
  public final ImageView adItemIcon;

  @NonNull
  public final TextView adItemName;

  @NonNull
  public final TextView adRating;

  @NonNull
  public final ImageView adStarsImage;

  private AdListItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView adDownloads,
      @NonNull ImageView adItemIcon, @NonNull TextView adItemName, @NonNull TextView adRating,
      @NonNull ImageView adStarsImage) {
    this.rootView = rootView;
    this.adDownloads = adDownloads;
    this.adItemIcon = adItemIcon;
    this.adItemName = adItemName;
    this.adRating = adRating;
    this.adStarsImage = adStarsImage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ad_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adDownloads;
      TextView adDownloads = rootView.findViewById(id);
      if (adDownloads == null) {
        break missingId;
      }

      id = R.id.adItemIcon;
      ImageView adItemIcon = rootView.findViewById(id);
      if (adItemIcon == null) {
        break missingId;
      }

      id = R.id.adItemName;
      TextView adItemName = rootView.findViewById(id);
      if (adItemName == null) {
        break missingId;
      }

      id = R.id.adRating;
      TextView adRating = rootView.findViewById(id);
      if (adRating == null) {
        break missingId;
      }

      id = R.id.adStarsImage;
      ImageView adStarsImage = rootView.findViewById(id);
      if (adStarsImage == null) {
        break missingId;
      }

      return new AdListItemBinding((ConstraintLayout) rootView, adDownloads, adItemIcon, adItemName,
          adRating, adStarsImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
