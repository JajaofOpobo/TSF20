package com.tsf.shell;

import android.os.AsyncTask;

/* loaded from: classes.dex */
final class aa extends AsyncTask {
    final /* synthetic */ Home a;

    aa(Home home) {
        this.a = home;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object... objArr) {
        ap apVar = new ap((byte) 0);
        Home.a(this.a, apVar);
        return apVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        Home.s = (ap) obj;
        this.a.t();
    }
}
