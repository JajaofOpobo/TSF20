package com.flurry.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ep implements et {
    private static ep a;
    private final List b = b();

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
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((et) it.next()).a(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void b(dj djVar, Context context) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((et) it.next()).b(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void c(dj djVar, Context context) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((et) it.next()).c(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void a(dj djVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((et) it.next()).a(djVar);
        }
    }

    private static List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new eq("com.flurry.android.impl.analytics.FlurryAnalyticsModule", 10));
        arrayList.add(new eq("com.flurry.android.impl.ads.FlurryAdModule", 10));
        return Collections.unmodifiableList(arrayList);
    }
}
