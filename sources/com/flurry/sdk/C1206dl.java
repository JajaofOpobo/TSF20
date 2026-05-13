package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: com.flurry.sdk.dl */
/* loaded from: classes.dex */
public class C1206dl {

    /* renamed from: a */
    private static final String f3874a = C1206dl.class.getSimpleName();

    /* renamed from: b */
    private static C1206dl f3875b;

    /* renamed from: c */
    private final Map<String, C1195dj> f3876c = new HashMap();

    /* renamed from: d */
    private final Map<Context, C1195dj> f3877d = new WeakHashMap();

    /* renamed from: e */
    private final Object f3878e = new Object();

    /* renamed from: f */
    private C1195dj f3879f;

    /* renamed from: a */
    public static synchronized C1206dl m9414a() {
        C1206dl c1206dl;
        synchronized (C1206dl.class) {
            if (f3875b == null) {
                f3875b = new C1206dl();
            }
            c1206dl = f3875b;
        }
        return c1206dl;
    }

    private C1206dl() {
    }

    /* renamed from: b */
    public synchronized int m9409b() {
        return this.f3877d.size();
    }

    /* renamed from: c */
    public C1195dj m9408c() {
        C1195dj c1195dj;
        synchronized (this.f3878e) {
            c1195dj = this.f3879f;
        }
        return c1195dj;
    }

    /* renamed from: a */
    public void m9411a(C1195dj c1195dj) {
        synchronized (this.f3878e) {
            this.f3879f = c1195dj;
        }
    }

    /* renamed from: a */
    public synchronized void m9412a(Context context, String str) {
        C1195dj c1195dj;
        C1211do.m9389a(context);
        C1265ev.m9207a().m9204b();
        C1225dz.m9343a().m9337b();
        C1195dj c1195dj2 = this.f3877d.get(context);
        if (c1195dj2 != null) {
            C1258eo.m9218d(f3874a, "Session already started with context: " + context + " count:" + c1195dj2.m9443g());
        } else {
            if (this.f3876c.containsKey(str)) {
                c1195dj = this.f3876c.get(str);
            } else {
                c1195dj = new C1195dj(str);
                this.f3876c.put(str, c1195dj);
                c1195dj.m9466a(context);
            }
            this.f3877d.put(context, c1195dj);
            m9411a(c1195dj);
            c1195dj.m9454b(context);
        }
    }

    /* renamed from: a */
    public synchronized void m9413a(Context context) {
        C1195dj remove = this.f3877d.remove(context);
        if (remove == null) {
            C1258eo.m9218d(f3874a, "Session cannot be ended, session not found for context: " + context);
        } else {
            remove.m9451c(context);
        }
    }

    /* renamed from: a */
    public synchronized void m9410a(String str) {
        if (!this.f3876c.containsKey(str)) {
            C1258eo.m9234a(6, f3874a, "Ended session is not in the session map! Maybe it was already destroyed.");
        } else {
            C1195dj m9408c = m9408c();
            if (m9408c != null && TextUtils.equals(m9408c.m9440j(), str)) {
                m9411a((C1195dj) null);
            }
            this.f3876c.remove(str);
        }
    }

    /* renamed from: d */
    public synchronized void m9407d() {
        for (Map.Entry<Context, C1195dj> entry : this.f3877d.entrySet()) {
            entry.getValue().m9451c(entry.getKey());
        }
        this.f3877d.clear();
        for (C1195dj c1195dj : new ArrayList(this.f3876c.values())) {
            c1195dj.m9452c();
        }
        this.f3876c.clear();
        m9411a((C1195dj) null);
    }
}
