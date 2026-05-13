package com.tsf.extend.base.p076f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.android.volley.C0798m;
import com.android.volley.InterfaceC0781b;
import com.android.volley.InterfaceC0789f;
import com.android.volley.toolbox.C0815a;
import com.android.volley.toolbox.C0818c;
import com.android.volley.toolbox.C0822d;
import com.android.volley.toolbox.C0826g;
import com.android.volley.toolbox.C0842n;
import com.android.volley.toolbox.InterfaceC0825f;
import java.io.File;
/* renamed from: com.tsf.extend.base.f.c */
/* loaded from: classes.dex */
public class C1406c {

    /* renamed from: a */
    private static C0798m f4374a = null;

    /* renamed from: a */
    public static C0798m m8766a(Context context) {
        if (f4374a == null) {
            f4374a = C0842n.m10899a(context);
        }
        return f4374a;
    }

    /* renamed from: a */
    public static C0798m m8764a(Context context, InterfaceC0825f interfaceC0825f, InterfaceC0789f interfaceC0789f, InterfaceC0781b interfaceC0781b) {
        if (interfaceC0781b == null) {
            interfaceC0781b = new C0818c(new File(context.getCacheDir(), "volley"));
        }
        InterfaceC0825f m8765a = m8765a(context, interfaceC0825f);
        if (interfaceC0789f == null) {
            interfaceC0789f = new C0815a(m8765a);
        }
        C0798m c0798m = new C0798m(interfaceC0781b, interfaceC0789f);
        c0798m.m11011a();
        return c0798m;
    }

    /* renamed from: a */
    public static InterfaceC0825f m8765a(Context context, InterfaceC0825f interfaceC0825f) {
        String packageName;
        String str = "volley/0";
        try {
            str = context.getPackageName() + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (interfaceC0825f == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                return new C0826g();
            }
            return new C0822d(AndroidHttpClient.newInstance(str));
        }
        return interfaceC0825f;
    }
}
