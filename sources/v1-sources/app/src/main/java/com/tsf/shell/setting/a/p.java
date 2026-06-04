package com.tsf.shell.setting.a;

import android.app.ProgressDialog;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class p implements Runnable {
    final /* synthetic */ g a;

    p(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressDialog progressDialog;
        ProgressDialog progressDialog2;
        ProgressDialog progressDialog3;
        ProgressDialog progressDialog4;
        ProgressDialog progressDialog5;
        ProgressDialog progressDialog6;
        progressDialog = this.a.r;
        if (progressDialog != null) {
            progressDialog6 = this.a.r;
            progressDialog6.cancel();
        }
        this.a.r = new ProgressDialog(com.censivn.C3DEngine.a.c());
        progressDialog2 = this.a.r;
        progressDialog2.setMessage(com.censivn.C3DEngine.h.a.c(R.string.public_notic_loading));
        progressDialog3 = this.a.r;
        progressDialog3.setIndeterminate(true);
        progressDialog4 = this.a.r;
        progressDialog4.setCancelable(false);
        progressDialog5 = this.a.r;
        progressDialog5.show();
    }
}
