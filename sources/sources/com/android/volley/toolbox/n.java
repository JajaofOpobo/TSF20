package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class n {
    public static com.android.volley.m a(Context context, f fVar) {
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = packageName + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (fVar == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                fVar = new g();
            } else {
                fVar = new d(AndroidHttpClient.newInstance(str));
            }
        }
        com.android.volley.m mVar = new com.android.volley.m(new c(file), new a(fVar));
        mVar.a();
        return mVar;
    }

    public static com.android.volley.m a(Context context) {
        return a(context, null);
    }
}
