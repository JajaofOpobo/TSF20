package com.flurry.sdk;

import android.app.Activity;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface du {

    public enum a {
        kCreated,
        kDestroyed,
        kPaused,
        kResumed,
        kStarted,
        kStopped,
        kSaveState
    }

    void a(Activity activity, a aVar);
}
