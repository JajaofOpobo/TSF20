package org.acra.jraf.android.util.activitylifecyclecallbackscompat;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface ActivityLifecycleCallbacksCompat {
    void onActivityCreated(Activity activity, Bundle bundle);

    void onActivityDestroyed(Activity activity);

    void onActivityPaused(Activity activity);

    void onActivityResumed(Activity activity);

    void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    void onActivityStarted(Activity activity);

    void onActivityStopped(Activity activity);
}
