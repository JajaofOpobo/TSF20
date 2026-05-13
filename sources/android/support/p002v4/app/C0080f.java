package android.support.p002v4.app;

import android.app.AppOpsManager;
import android.content.Context;
/* renamed from: android.support.v4.app.f */
/* loaded from: classes.dex */
class C0080f {
    /* renamed from: a */
    public static String m13676a(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    /* renamed from: a */
    public static int m13677a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }
}
