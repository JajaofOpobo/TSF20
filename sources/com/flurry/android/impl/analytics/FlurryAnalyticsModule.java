package com.flurry.android.impl.analytics;

import android.content.Context;
import com.flurry.sdk.C1180dd;
import com.flurry.sdk.C1195dj;
import com.flurry.sdk.InterfaceC1263et;
/* loaded from: classes.dex */
public class FlurryAnalyticsModule implements InterfaceC1263et {

    /* renamed from: a */
    private static FlurryAnalyticsModule f3728a;

    /* renamed from: b */
    private C1180dd f3729b;

    public static synchronized FlurryAnalyticsModule getInstance() {
        FlurryAnalyticsModule flurryAnalyticsModule;
        synchronized (FlurryAnalyticsModule.class) {
            if (f3728a == null) {
                f3728a = new FlurryAnalyticsModule();
            }
            flurryAnalyticsModule = f3728a;
        }
        return flurryAnalyticsModule;
    }

    private FlurryAnalyticsModule() {
    }

    @Override // com.flurry.sdk.InterfaceC1263et
    /* renamed from: a */
    public void mo9211a(C1195dj c1195dj, Context context) {
        if (this.f3729b == null) {
            this.f3729b = new C1180dd();
        }
    }

    @Override // com.flurry.sdk.InterfaceC1263et
    /* renamed from: b */
    public void mo9210b(C1195dj c1195dj, Context context) {
    }

    @Override // com.flurry.sdk.InterfaceC1263et
    /* renamed from: c */
    public void mo9209c(C1195dj c1195dj, Context context) {
    }

    @Override // com.flurry.sdk.InterfaceC1263et
    /* renamed from: a */
    public void mo9212a(C1195dj c1195dj) {
    }

    /* renamed from: a */
    public C1180dd m9588a() {
        return this.f3729b;
    }
}
