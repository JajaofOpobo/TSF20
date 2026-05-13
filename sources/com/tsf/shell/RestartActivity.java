package com.tsf.shell;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.tsf.C1306b;
/* loaded from: classes.dex */
public class RestartActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        boolean booleanExtra = getIntent().getBooleanExtra("restart", true);
        if (!extras.containsKey("pid")) {
            finish();
        }
        Thread thread = new Thread(new RunnableC2271f(extras.getInt("pid"), this, booleanExtra));
        showDialog(0);
        thread.start();
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(C1306b.C1315i.tsf_loading_content));
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
