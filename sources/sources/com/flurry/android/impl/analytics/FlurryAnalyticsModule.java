package com.flurry.android.impl.analytics;

import android.content.Context;
import com.flurry.sdk.dd;
import com.flurry.sdk.dj;
import com.flurry.sdk.et;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FlurryAnalyticsModule implements et {
    private static FlurryAnalyticsModule a;
    private dd b;

    public static synchronized FlurryAnalyticsModule getInstance() {
        if (a == null) {
            a = new FlurryAnalyticsModule();
        }
        return a;
    }

    private FlurryAnalyticsModule() {
    }

    @Override // com.flurry.sdk.et
    public void a(dj djVar, Context context) {
        if (this.b == null) {
            this.b = new dd();
        }
    }

    @Override // com.flurry.sdk.et
    public void b(dj djVar, Context context) {
    }

    @Override // com.flurry.sdk.et
    public void c(dj djVar, Context context) {
    }

    @Override // com.flurry.sdk.et
    public void a(dj djVar) {
    }

    public dd a() {
        return this.b;
    }
}
