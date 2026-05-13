package com.flurry.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.flurry.sdk.ep */
/* loaded from: classes.dex */
public final class C1259ep implements InterfaceC1263et {

    /* renamed from: a */
    private static C1259ep f4021a;

    /* renamed from: b */
    private final List<InterfaceC1263et> f4022b = m9216b();

    /* renamed from: a */
    public static synchronized C1259ep m9217a() {
        C1259ep c1259ep;
        synchronized (C1259ep.class) {
            if (f4021a == null) {
                f4021a = new C1259ep();
            }
            c1259ep = f4021a;
        }
        return c1259ep;
    }

    private C1259ep() {
    }

    @Override // com.flurry.sdk.InterfaceC1263et
    /* renamed from: a */
    public void mo9211a(C1195dj c1195dj, Context context) {
        for (InterfaceC1263et interfaceC1263et : this.f4022b) {
            interfaceC1263et.mo9211a(c1195dj, context);
        }
    }

    @Override // com.flurry.sdk.InterfaceC1263et
    /* renamed from: b */
    public void mo9210b(C1195dj c1195dj, Context context) {
        for (InterfaceC1263et interfaceC1263et : this.f4022b) {
            interfaceC1263et.mo9210b(c1195dj, context);
        }
    }

    @Override // com.flurry.sdk.InterfaceC1263et
    /* renamed from: c */
    public void mo9209c(C1195dj c1195dj, Context context) {
        for (InterfaceC1263et interfaceC1263et : this.f4022b) {
            interfaceC1263et.mo9209c(c1195dj, context);
        }
    }

    @Override // com.flurry.sdk.InterfaceC1263et
    /* renamed from: a */
    public void mo9212a(C1195dj c1195dj) {
        for (InterfaceC1263et interfaceC1263et : this.f4022b) {
            interfaceC1263et.mo9212a(c1195dj);
        }
    }

    /* renamed from: b */
    private static List<InterfaceC1263et> m9216b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1260eq("com.flurry.android.impl.analytics.FlurryAnalyticsModule", 10));
        arrayList.add(new C1260eq("com.flurry.android.impl.ads.FlurryAdModule", 10));
        return Collections.unmodifiableList(arrayList);
    }
}
