package com.flurry.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class ep implements et {
    private static ep a;
    private final List<et> b = b();

    public static synchronized ep a() {
        if (a == null) {
            a = new ep();
        }
        return a;
    }

    private ep() {
    }

    @Override // com.flurry.sdk.et
    public void a(dj djVar, Context context) {
        Iterator<et> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void b(dj djVar, Context context) {
        Iterator<et> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void c(dj djVar, Context context) {
        Iterator<et> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().c(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void a(dj djVar) {
        Iterator<et> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(djVar);
        }
    }

    private static List<et> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new eq("com.flurry.android.impl.analytics.FlurryAnalyticsModule", 10));
        arrayList.add(new eq("com.flurry.android.impl.ads.FlurryAdModule", 10));
        return Collections.unmodifiableList(arrayList);
    }
}
