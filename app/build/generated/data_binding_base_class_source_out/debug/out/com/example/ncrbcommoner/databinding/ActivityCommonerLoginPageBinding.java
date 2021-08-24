// Generated by view binder compiler. Do not edit!
package com.example.ncrbcommoner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ncrbcommoner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCommonerLoginPageBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnCommonerLogin;

  @NonNull
  public final EditText commEmailEdittxt;

  @NonNull
  public final EditText commPasswordEdittxt;

  @NonNull
  public final TextView dontHaveAc;

  @NonNull
  public final ProgressBar progressBar1;

  private ActivityCommonerLoginPageBinding(@NonNull RelativeLayout rootView,
      @NonNull Button btnCommonerLogin, @NonNull EditText commEmailEdittxt,
      @NonNull EditText commPasswordEdittxt, @NonNull TextView dontHaveAc,
      @NonNull ProgressBar progressBar1) {
    this.rootView = rootView;
    this.btnCommonerLogin = btnCommonerLogin;
    this.commEmailEdittxt = commEmailEdittxt;
    this.commPasswordEdittxt = commPasswordEdittxt;
    this.dontHaveAc = dontHaveAc;
    this.progressBar1 = progressBar1;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCommonerLoginPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCommonerLoginPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_commoner_login_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCommonerLoginPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_commoner_Login;
      Button btnCommonerLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnCommonerLogin == null) {
        break missingId;
      }

      id = R.id.comm_email_edittxt;
      EditText commEmailEdittxt = ViewBindings.findChildViewById(rootView, id);
      if (commEmailEdittxt == null) {
        break missingId;
      }

      id = R.id.comm_password_edittxt;
      EditText commPasswordEdittxt = ViewBindings.findChildViewById(rootView, id);
      if (commPasswordEdittxt == null) {
        break missingId;
      }

      id = R.id.dont_have_ac;
      TextView dontHaveAc = ViewBindings.findChildViewById(rootView, id);
      if (dontHaveAc == null) {
        break missingId;
      }

      id = R.id.progressBar1;
      ProgressBar progressBar1 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar1 == null) {
        break missingId;
      }

      return new ActivityCommonerLoginPageBinding((RelativeLayout) rootView, btnCommonerLogin,
          commEmailEdittxt, commPasswordEdittxt, dontHaveAc, progressBar1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}