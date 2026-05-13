package org.acra.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import org.acra.ACRA;
/* loaded from: classes.dex */
public final class PackageManagerWrapper {
    private final Context context;

    public PackageManagerWrapper(Context context) {
        this.context = context;
    }

    public boolean hasPermission(String str) {
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        try {
            return packageManager.checkPermission(str, this.context.getPackageName()) == 0;
        } catch (RuntimeException e) {
            return false;
        }
    }

    public PackageInfo getPackageInfo() {
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(this.context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            ACRA.log.mo5v(ACRA.LOG_TAG, "Failed to find PackageInfo for current App : " + this.context.getPackageName());
            return null;
        } catch (RuntimeException e2) {
            return null;
        }
    }
}
