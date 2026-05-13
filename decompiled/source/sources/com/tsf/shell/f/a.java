package com.tsf.shell.f;

import android.app.ProgressDialog;
/* loaded from: classes.dex */
public class a {
    private static ProgressDialog a;

    public static void a(String str) {
        if (a == null) {
            a = new ProgressDialog(com.censivn.C3DEngine.a.d());
            a.setIndeterminate(true);
            a.setCancelable(false);
        }
        a.setMessage(str);
        a.show();
    }

    public static void a() {
        a.dismiss();
    }
}
