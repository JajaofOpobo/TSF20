package com.flurry.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.flurry.sdk.InterfaceC1218du;
import java.util.List;
/* renamed from: com.flurry.sdk.dv */
/* loaded from: classes.dex */
public class C1220dv {

    /* renamed from: b */
    private static C1220dv f3925b;

    /* renamed from: a */
    private final C1217dt<InterfaceC1218du> f3926a = new C1217dt<>();

    /* renamed from: a */
    public static synchronized C1220dv m9358a() {
        C1220dv c1220dv;
        synchronized (C1220dv.class) {
            if (f3925b == null) {
                f3925b = new C1220dv();
            }
            c1220dv = f3925b;
        }
        return c1220dv;
    }

    /* renamed from: b */
    public boolean m9355b() {
        return Build.VERSION.SDK_INT >= 14;
    }

    @TargetApi(14)
    private C1220dv() {
        if (Build.VERSION.SDK_INT >= 14) {
            ((Application) C1211do.m9390a().m9386b()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.flurry.sdk.dv.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    m9353a(activity, InterfaceC1218du.EnumC1219a.kCreated);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    m9353a(activity, InterfaceC1218du.EnumC1219a.kStarted);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    m9353a(activity, InterfaceC1218du.EnumC1219a.kResumed);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    m9353a(activity, InterfaceC1218du.EnumC1219a.kPaused);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    m9353a(activity, InterfaceC1218du.EnumC1219a.kStopped);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    m9353a(activity, InterfaceC1218du.EnumC1219a.kSaveState);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    m9353a(activity, InterfaceC1218du.EnumC1219a.kDestroyed);
                }

                /* renamed from: a */
                protected void m9353a(Activity activity, InterfaceC1218du.EnumC1219a enumC1219a) {
                    for (InterfaceC1218du interfaceC1218du : C1220dv.this.m9354c()) {
                        interfaceC1218du.m9359a(activity, enumC1219a);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public synchronized void m9357a(InterfaceC1218du interfaceC1218du) {
        this.f3926a.m9362a(interfaceC1218du);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public synchronized List<InterfaceC1218du> m9354c() {
        return this.f3926a.m9363a();
    }
}
