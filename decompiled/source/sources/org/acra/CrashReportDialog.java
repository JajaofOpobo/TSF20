package org.acra;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
/* loaded from: classes.dex */
public class CrashReportDialog extends BaseCrashReportDialog implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, View.OnClickListener {
    private static final String STATE_COMMENT = "comment";
    private static final String STATE_EMAIL = "email";
    boolean autoKeyboard = true;
    AlertDialog mDialog;
    private EditText userCommentView;
    private EditText userEmailView;

    @Override // org.acra.BaseCrashReportDialog, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        int resDialogTitle = ACRA.getConfig().resDialogTitle();
        if (resDialogTitle != 0) {
            builder.setTitle(resDialogTitle);
        }
        int resDialogIcon = ACRA.getConfig().resDialogIcon();
        if (resDialogIcon != 0) {
            builder.setIcon(resDialogIcon);
        }
        builder.setView(buildCustomView(bundle));
        builder.setPositiveButton(getText(ACRA.getConfig().resDialogPositiveButtonText()), this);
        builder.setNegativeButton(getText(ACRA.getConfig().resDialogNegativeButtonText()), this);
        this.mDialog = builder.create();
        this.mDialog.setCanceledOnTouchOutside(false);
        this.mDialog.setOnDismissListener(this);
        this.mDialog.show();
        this.mDialog.getButton(-1).setOnClickListener(this);
        this.mDialog.getButton(-1).setTag(-1);
        this.mDialog.getButton(-2).setOnClickListener(this);
        this.mDialog.getButton(-2).setTag(-2);
    }

    protected View buildCustomView(Bundle bundle) {
        String string;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(10, 10, 10, 10);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setFocusable(true);
        linearLayout.setFocusableInTouchMode(true);
        ScrollView scrollView = new ScrollView(this);
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, -1, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        scrollView.addView(linearLayout2);
        TextView textView = new TextView(this);
        int resDialogText = ACRA.getConfig().resDialogText();
        if (resDialogText != 0) {
            textView.setText(getText(resDialogText));
        }
        linearLayout2.addView(textView);
        int resDialogCommentPrompt = ACRA.getConfig().resDialogCommentPrompt();
        if (resDialogCommentPrompt != 0) {
            TextView textView2 = new TextView(this);
            textView2.setText(getText(resDialogCommentPrompt));
            textView2.setPadding(textView2.getPaddingLeft(), 10, textView2.getPaddingRight(), textView2.getPaddingBottom());
            linearLayout2.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
            this.userCommentView = new EditText(this);
            this.userCommentView.setLines(2);
            if (bundle != null && (string = bundle.getString(STATE_COMMENT)) != null) {
                this.userCommentView.setText(string);
            }
            linearLayout2.addView(this.userCommentView);
        }
        int resDialogEmailPrompt = ACRA.getConfig().resDialogEmailPrompt();
        if (resDialogEmailPrompt != 0) {
            TextView textView3 = new TextView(this);
            textView3.setText(getText(resDialogEmailPrompt));
            textView3.setPadding(textView3.getPaddingLeft(), 10, textView3.getPaddingRight(), textView3.getPaddingBottom());
            linearLayout2.addView(textView3);
            this.userEmailView = new EditText(this);
            this.userEmailView.setSingleLine();
            this.userEmailView.setInputType(33);
            String str = null;
            if (bundle != null) {
                str = bundle.getString(STATE_EMAIL);
            }
            if (str != null) {
                this.userEmailView.setText(str);
            } else {
                this.userEmailView.setText(ACRA.getACRASharedPreferences().getString(ACRA.PREF_USER_EMAIL_ADDRESS, ""));
            }
            linearLayout2.addView(this.userEmailView);
        }
        return linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String string;
        if (((Integer) view.getTag()).intValue() == -1) {
            String editable = this.userCommentView != null ? this.userCommentView.getText().toString() : "";
            if (editable.equals("") && this.autoKeyboard) {
                this.autoKeyboard = false;
                if (this.userCommentView != null) {
                    this.userCommentView.setFocusable(true);
                    this.userCommentView.requestFocus();
                    ((InputMethodManager) this.userCommentView.getContext().getSystemService("input_method")).toggleSoftInput(0, 2);
                    return;
                }
            }
            SharedPreferences aCRASharedPreferences = ACRA.getACRASharedPreferences();
            if (this.userEmailView != null) {
                string = this.userEmailView.getText().toString();
                SharedPreferences.Editor edit = aCRASharedPreferences.edit();
                edit.putString(ACRA.PREF_USER_EMAIL_ADDRESS, string);
                edit.commit();
            } else {
                string = aCRASharedPreferences.getString(ACRA.PREF_USER_EMAIL_ADDRESS, "");
            }
            sendCrash(editable, string);
        } else {
            cancelReports();
        }
        this.mDialog.cancel();
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String string;
        if (i == -1) {
            String editable = this.userCommentView != null ? this.userCommentView.getText().toString() : "";
            if (editable.equals("") && this.autoKeyboard) {
                this.autoKeyboard = false;
                if (this.userCommentView != null) {
                    this.userCommentView.setFocusable(true);
                    return;
                }
            }
            SharedPreferences aCRASharedPreferences = ACRA.getACRASharedPreferences();
            if (this.userEmailView != null) {
                string = this.userEmailView.getText().toString();
                SharedPreferences.Editor edit = aCRASharedPreferences.edit();
                edit.putString(ACRA.PREF_USER_EMAIL_ADDRESS, string);
                edit.commit();
            } else {
                string = aCRASharedPreferences.getString(ACRA.PREF_USER_EMAIL_ADDRESS, "");
            }
            sendCrash(editable, string);
        } else {
            cancelReports();
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.userCommentView != null && this.userCommentView.getText() != null) {
            bundle.putString(STATE_COMMENT, this.userCommentView.getText().toString());
        }
        if (this.userEmailView != null && this.userEmailView.getText() != null) {
            bundle.putString(STATE_EMAIL, this.userEmailView.getText().toString());
        }
    }
}
