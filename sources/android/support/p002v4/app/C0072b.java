package android.support.p002v4.app;

import android.app.Activity;
/* renamed from: android.support.v4.app.b */
/* loaded from: classes.dex */
class C0072b {

    /* renamed from: android.support.v4.app.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0073a {
        /* renamed from: a_ */
        void mo13685a_(int i);
    }

    /* renamed from: a */
    public static void m13686a(Activity activity, String[] strArr, int i) {
        if (activity instanceof InterfaceC0073a) {
            ((InterfaceC0073a) activity).mo13685a_(i);
        }
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: a */
    public static boolean m13687a(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
