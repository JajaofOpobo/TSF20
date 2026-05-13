package android.support.p002v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
/* renamed from: android.support.v4.app.y */
/* loaded from: classes.dex */
class C0125y {
    /* renamed from: a */
    public static Intent m13428a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    /* renamed from: a */
    public static boolean m13427a(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    /* renamed from: b */
    public static void m13425b(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* renamed from: a */
    public static String m13426a(ActivityInfo activityInfo) {
        return activityInfo.parentActivityName;
    }
}
