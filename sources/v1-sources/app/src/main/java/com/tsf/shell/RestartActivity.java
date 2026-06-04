package com.tsf.shell;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class RestartActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (!extras.containsKey("pid")) {
            finish();
        }
        Thread thread = new Thread(new bc(extras.getInt("pid"), this));
        showDialog(0);
        thread.start();
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.tsf_loading_content));
        return progressDialog;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }
}
