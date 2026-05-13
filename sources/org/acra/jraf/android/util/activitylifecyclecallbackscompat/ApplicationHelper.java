package org.acra.jraf.android.util.activitylifecyclecallbackscompat;

import android.app.Application;
/* loaded from: classes.dex */
public final class ApplicationHelper {
    public static void registerActivityLifecycleCallbacks(Application application, ActivityLifecycleCallbacksCompat activityLifecycleCallbacksCompat) {
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksWrapper(activityLifecycleCallbacksCompat));
    }

    public void unregisterActivityLifecycleCallbacks(Application application, ActivityLifecycleCallbacksCompat activityLifecycleCallbacksCompat) {
        application.unregisterActivityLifecycleCallbacks(new ActivityLifecycleCallbacksWrapper(activityLifecycleCallbacksCompat));
    }
}
