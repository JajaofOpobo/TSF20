package com.tsf.shell.p096f;

import android.app.ProgressDialog;
import com.censivn.C3DEngine.C0853a;
/* renamed from: com.tsf.shell.f.a */
/* loaded from: classes.dex */
public class C2272a {

    /* renamed from: a */
    private static ProgressDialog f7427a;

    /* renamed from: a */
    public static void m5979a(String str) {
        if (f7427a == null) {
            f7427a = new ProgressDialog(C0853a.m10856d());
            f7427a.setIndeterminate(true);
            f7427a.setCancelable(false);
        }
        f7427a.setMessage(str);
        f7427a.show();
    }

    /* renamed from: a */
    public static void m5980a() {
        f7427a.dismiss();
    }
}
