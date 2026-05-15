package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class d {
    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void a(Activity activity) {
        activity.finishAffinity();
    }
}
