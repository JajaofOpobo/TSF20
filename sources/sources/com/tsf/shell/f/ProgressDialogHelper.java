package com.tsf.shell.f;

import android.app.ProgressDialog;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ProgressDialogHelper {
    private static ProgressDialog a;

    public static void a(String str) {
        if (a == null) {
            a = new ProgressDialog(com.censivn.C3DEngine.C3DEngine.d());
            ProgressDialogHelper.setIndeterminate(true);
            ProgressDialogHelper.setCancelable(false);
        }
        ProgressDialogHelper.setMessage(str);
        ProgressDialogHelper.show();
    }

    public static void a() {
        ProgressDialogHelper.dismiss();
    }
}
