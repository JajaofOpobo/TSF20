package org.acra.jraf.android.util.activitylifecyclecallbackscompat;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MainLifecycleDispatcher implements ActivityLifecycleCallbacksCompat {
    private static final MainLifecycleDispatcher INSTANCE = new MainLifecycleDispatcher();
    private ArrayList<ActivityLifecycleCallbacksCompat> mActivityLifecycleCallbacks = new ArrayList<>();

    public static MainLifecycleDispatcher get() {
        return INSTANCE;
    }

    private MainLifecycleDispatcher() {
    }

    void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacksCompat activityLifecycleCallbacksCompat) {
        synchronized (this.mActivityLifecycleCallbacks) {
            this.mActivityLifecycleCallbacks.add(activityLifecycleCallbacksCompat);
        }
    }

    void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacksCompat activityLifecycleCallbacksCompat) {
        synchronized (this.mActivityLifecycleCallbacks) {
            this.mActivityLifecycleCallbacks.remove(activityLifecycleCallbacksCompat);
        }
    }

    private Object[] collectActivityLifecycleCallbacks() {
        Object[] array = null;
        synchronized (this.mActivityLifecycleCallbacks) {
            if (this.mActivityLifecycleCallbacks.size() > 0) {
                array = this.mActivityLifecycleCallbacks.toArray();
            }
        }
        return array;
    }

    @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArrCollectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (objArrCollectActivityLifecycleCallbacks != null) {
            for (Object obj : objArrCollectActivityLifecycleCallbacks) {
                ((ActivityLifecycleCallbacksCompat) obj).onActivityCreated(activity, bundle);
            }
        }
    }

    @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
    public void onActivityStarted(Activity activity) {
        Object[] objArrCollectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (objArrCollectActivityLifecycleCallbacks != null) {
            for (Object obj : objArrCollectActivityLifecycleCallbacks) {
                ((ActivityLifecycleCallbacksCompat) obj).onActivityStarted(activity);
            }
        }
    }

    @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
    public void onActivityResumed(Activity activity) {
        Object[] objArrCollectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (objArrCollectActivityLifecycleCallbacks != null) {
            for (Object obj : objArrCollectActivityLifecycleCallbacks) {
                ((ActivityLifecycleCallbacksCompat) obj).onActivityResumed(activity);
            }
        }
    }

    @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
    public void onActivityPaused(Activity activity) {
        Object[] objArrCollectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (objArrCollectActivityLifecycleCallbacks != null) {
            for (Object obj : objArrCollectActivityLifecycleCallbacks) {
                ((ActivityLifecycleCallbacksCompat) obj).onActivityPaused(activity);
            }
        }
    }

    @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
    public void onActivityStopped(Activity activity) {
        Object[] objArrCollectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (objArrCollectActivityLifecycleCallbacks != null) {
            for (Object obj : objArrCollectActivityLifecycleCallbacks) {
                ((ActivityLifecycleCallbacksCompat) obj).onActivityStopped(activity);
            }
        }
    }

    @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArrCollectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (objArrCollectActivityLifecycleCallbacks != null) {
            for (Object obj : objArrCollectActivityLifecycleCallbacks) {
                ((ActivityLifecycleCallbacksCompat) obj).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
    public void onActivityDestroyed(Activity activity) {
        Object[] objArrCollectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (objArrCollectActivityLifecycleCallbacks != null) {
            for (Object obj : objArrCollectActivityLifecycleCallbacks) {
                ((ActivityLifecycleCallbacksCompat) obj).onActivityDestroyed(activity);
            }
        }
    }
}
