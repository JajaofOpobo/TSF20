package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;
/* loaded from: classes.dex */
class f {
    public static String a(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static int a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }
}
