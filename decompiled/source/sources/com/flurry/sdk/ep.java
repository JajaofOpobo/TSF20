package com.flurry.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ep implements et {
    private static ep a;
    private final List<et> b = b();

    public static synchronized ep a() {
        ep epVar;
        synchronized (ep.class) {
            if (a == null) {
                a = new ep();
            }
            epVar = a;
        }
        return epVar;
    }

    private ep() {
    }

    @Override // com.flurry.sdk.et
    public void a(dj djVar, Context context) {
        for (et etVar : this.b) {
            etVar.a(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void b(dj djVar, Context context) {
        for (et etVar : this.b) {
            etVar.b(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void c(dj djVar, Context context) {
        for (et etVar : this.b) {
            etVar.c(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void a(dj djVar) {
        for (et etVar : this.b) {
            etVar.a(djVar);
        }
    }

    private static List<et> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new eq("com.flurry.android.impl.analytics.FlurryAnalyticsModule", 10));
        arrayList.add(new eq("com.flurry.android.impl.ads.FlurryAdModule", 10));
        return Collections.unmodifiableList(arrayList);
    }
}
