package com.tsf.shell.action;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
final class k implements Runnable {
    private final /* synthetic */ Context a;

    k(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PackageManager packageManager = this.a.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            HashMap hashMap = new HashMap();
            hashMap.put("icon", resolveInfo.activityInfo.loadIcon(packageManager));
            hashMap.put("appName", resolveInfo.activityInfo.loadLabel(packageManager));
            hashMap.put("packageName", resolveInfo.activityInfo.applicationInfo.packageName);
            hashMap.put("className", resolveInfo.activityInfo.name);
            arrayList.add(hashMap);
        }
        if (j.e != null) {
            j.h.post(new l(this, arrayList));
        }
    }
}
