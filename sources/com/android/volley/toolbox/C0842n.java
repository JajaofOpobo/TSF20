package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.android.volley.C0798m;
import java.io.File;
/* renamed from: com.android.volley.toolbox.n */
/* loaded from: classes.dex */
public class C0842n {
    /* renamed from: a */
    public static C0798m m10898a(Context context, InterfaceC0825f interfaceC0825f) {
        String packageName;
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            str = context.getPackageName() + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (interfaceC0825f == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                interfaceC0825f = new C0826g();
            } else {
                interfaceC0825f = new C0822d(AndroidHttpClient.newInstance(str));
            }
        }
        C0798m c0798m = new C0798m(new C0818c(file), new C0815a(interfaceC0825f));
        c0798m.m11011a();
        return c0798m;
    }

    /* renamed from: a */
    public static C0798m m10899a(Context context) {
        return m10898a(context, null);
    }
}
