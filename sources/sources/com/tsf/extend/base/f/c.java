package com.tsf.extend.base.f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.android.volley.m;
import com.android.volley.toolbox.d;
import com.android.volley.toolbox.f;
import com.android.volley.toolbox.g;
import com.android.volley.toolbox.n;
import java.io.File;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    private static m a = null;

    public static m a(Context context) {
        if (a == null) {
            a = n.a(context);
        }
        return a;
    }

    public static m a(Context context, f fVar, com.android.volley.f fVar2, com.android.volley.b bVar) {
        if (bVar == null) {
            bVar = new com.android.volley.toolbox.c(new File(context.getCacheDir(), "volley"));
        }
        f fVarA = a(context, fVar);
        if (fVar2 == null) {
            fVar2 = new com.android.volley.toolbox.a(fVarA);
        }
        m mVar = new m(bVar, fVar2);
        mVar.a();
        return mVar;
    }

    public static f a(Context context, f fVar) {
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = packageName + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (fVar == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                return new g();
            }
            return new d(AndroidHttpClient.newInstance(str));
        }
        return fVar;
    }
}
