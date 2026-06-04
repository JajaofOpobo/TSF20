package com.tsf.shell.setting.a;

import android.app.ProgressDialog;

/* loaded from: classes.dex */
final class q implements Runnable {
    final /* synthetic */ g a;

    q(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressDialog progressDialog;
        ProgressDialog progressDialog2;
        progressDialog = this.a.r;
        if (progressDialog != null) {
            progressDialog2 = this.a.r;
            progressDialog2.cancel();
            this.a.r = null;
        }
    }
}
