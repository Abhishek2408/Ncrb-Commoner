// Generated by view binder compiler. Do not edit!
package com.example.ncrbcommoner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ncrbcommoner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button dateBtn;

  @NonNull
  public final EditText dateEdit;

  @NonNull
  public final EditText editEmail;

  @NonNull
  public final EditText editName;

  @NonNull
  public final EditText editNumber;

  @NonNull
  public final EditText editSuspect;

  @NonNull
  public final TextView evPointer;

  @NonNull
  public final Switch evidenceSwap;

  @NonNull
  public final EditText localityEdit;

  @NonNull
  public final EditText statementEdit;

  @NonNull
  public final TextView statementTxt;

  @NonNull
  public final Button submitFirBtn;

  @NonNull
  public final Button timeBtn;

  @NonNull
  public final EditText timeEdit;

  private FragmentFirBinding(@NonNull ScrollView rootView, @NonNull Button dateBtn,
      @NonNull EditText dateEdit, @NonNull EditText editEmail, @NonNull EditText editName,
      @NonNull EditText editNumber, @NonNull EditText editSuspect, @NonNull TextView evPointer,
      @NonNull Switch evidenceSwap, @NonNull EditText localityEdit, @NonNull EditText statementEdit,
      @NonNull TextView statementTxt, @NonNull Button submitFirBtn, @NonNull Button timeBtn,
      @NonNull EditText timeEdit) {
    this.rootView = rootView;
    this.dateBtn = dateBtn;
    this.dateEdit = dateEdit;
    this.editEmail = editEmail;
    this.editName = editName;
    this.editNumber = editNumber;
    this.editSuspect = editSuspect;
    this.evPointer = evPointer;
    this.evidenceSwap = evidenceSwap;
    this.localityEdit = localityEdit;
    this.statementEdit = statementEdit;
    this.statementTxt = statementTxt;
    this.submitFirBtn = submitFirBtn;
    this.timeBtn = timeBtn;
    this.timeEdit = timeEdit;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_fir, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.date_btn;
      Button dateBtn = ViewBindings.findChildViewById(rootView, id);
      if (dateBtn == null) {
        break missingId;
      }

      id = R.id.date_edit;
      EditText dateEdit = ViewBindings.findChildViewById(rootView, id);
      if (dateEdit == null) {
        break missingId;
      }

      id = R.id.edit_email;
      EditText editEmail = ViewBindings.findChildViewById(rootView, id);
      if (editEmail == null) {
        break missingId;
      }

      id = R.id.edit_name;
      EditText editName = ViewBindings.findChildViewById(rootView, id);
      if (editName == null) {
        break missingId;
      }

      id = R.id.edit_number;
      EditText editNumber = ViewBindings.findChildViewById(rootView, id);
      if (editNumber == null) {
        break missingId;
      }

      id = R.id.edit_suspect;
      EditText editSuspect = ViewBindings.findChildViewById(rootView, id);
      if (editSuspect == null) {
        break missingId;
      }

      id = R.id.ev_pointer;
      TextView evPointer = ViewBindings.findChildViewById(rootView, id);
      if (evPointer == null) {
        break missingId;
      }

      id = R.id.evidence_swap;
      Switch evidenceSwap = ViewBindings.findChildViewById(rootView, id);
      if (evidenceSwap == null) {
        break missingId;
      }

      id = R.id.locality_edit;
      EditText localityEdit = ViewBindings.findChildViewById(rootView, id);
      if (localityEdit == null) {
        break missingId;
      }

      id = R.id.statement_edit;
      EditText statementEdit = ViewBindings.findChildViewById(rootView, id);
      if (statementEdit == null) {
        break missingId;
      }

      id = R.id.statement_txt;
      TextView statementTxt = ViewBindings.findChildViewById(rootView, id);
      if (statementTxt == null) {
        break missingId;
      }

      id = R.id.submit_firBtn;
      Button submitFirBtn = ViewBindings.findChildViewById(rootView, id);
      if (submitFirBtn == null) {
        break missingId;
      }

      id = R.id.time_btn;
      Button timeBtn = ViewBindings.findChildViewById(rootView, id);
      if (timeBtn == null) {
        break missingId;
      }

      id = R.id.time_edit;
      EditText timeEdit = ViewBindings.findChildViewById(rootView, id);
      if (timeEdit == null) {
        break missingId;
      }

      return new FragmentFirBinding((ScrollView) rootView, dateBtn, dateEdit, editEmail, editName,
          editNumber, editSuspect, evPointer, evidenceSwap, localityEdit, statementEdit,
          statementTxt, submitFirBtn, timeBtn, timeEdit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}