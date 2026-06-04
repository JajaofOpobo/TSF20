package com.tsf.shell.action;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
final class m implements Runnable {
    private final /* synthetic */ Context a;

    m(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.CREATE_SHORTCUT"), 0);
        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            HashMap hashMap = new HashMap();
            if (resolveInfo.loadLabel(packageManager) == null && resolveInfo.activityInfo != null) {
                String str = resolveInfo.activityInfo.name;
            }
            CharSequence loadLabel = resolveInfo.activityInfo.loadLabel(packageManager);
            String charSequence = loadLabel == null ? "" : loadLabel.toString();
            hashMap.put("icon", resolveInfo.activityInfo.loadIcon(packageManager));
            hashMap.put("appName", charSequence);
            hashMap.put("packageName", resolveInfo.activityInfo.applicationInfo.packageName);
            hashMap.put("className", resolveInfo.activityInfo.name);
            arrayList.add(hashMap);
        }
        if (j.d != null) {
            j.h.post(new n(this, arrayList));
        }
    }
}
