package android.support.p002v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/* renamed from: android.support.v4.app.d */
/* loaded from: classes.dex */
class C0075d {
    /* renamed from: a */
    public static void m13682a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: a */
    public static void m13683a(Activity activity) {
        activity.finishAffinity();
    }
}
