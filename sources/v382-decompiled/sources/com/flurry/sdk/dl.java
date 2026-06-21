package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class dl {
    private static final String a = dl.class.getSimpleName();
    private static dl b;
    private final Map c = new HashMap();
    private final Map d = new WeakHashMap();
    private final Object e = new Object();
    private dj f;

    public static synchronized dl a() {
        dl dlVar;
        synchronized (dl.class) {
            if (b == null) {
                b = new dl();
            }
            dlVar = b;
        }
        return dlVar;
    }

    private dl() {
    }

    public synchronized int b() {
        return this.d.size();
    }

    public dj c() {
        dj djVar;
        synchronized (this.e) {
            djVar = this.f;
        }
        return djVar;
    }

    public void a(dj djVar) {
        synchronized (this.e) {
            this.f = djVar;
        }
    }

    public synchronized void a(Context context, String str) {
        dj djVar;
        Cdo.a(context);
        ev.a().b();
        dz.a().b();
        dj djVar2 = (dj) this.d.get(context);
        if (djVar2 != null) {
            eo.d(a, "Session already started with context: " + context + " count:" + djVar2.g());
        } else {
            if (this.c.containsKey(str)) {
                djVar = (dj) this.c.get(str);
            } else {
                djVar = new dj(str);
                this.c.put(str, djVar);
                djVar.a(context);
            }
            this.d.put(context, djVar);
            a(djVar);
            djVar.b(context);
        }
    }

    public synchronized void a(Context context) {
        dj djVar = (dj) this.d.remove(context);
        if (djVar == null) {
            eo.d(a, "Session cannot be ended, session not found for context: " + context);
        } else {
            djVar.c(context);
        }
    }

    public synchronized void a(String str) {
        if (!this.c.containsKey(str)) {
            eo.a(6, a, "Ended session is not in the session map! Maybe it was already destroyed.");
        } else {
            dj c = c();
            if (c != null && TextUtils.equals(c.j(), str)) {
                a((dj) null);
            }
            this.c.remove(str);
        }
    }

    public synchronized void d() {
        for (Map.Entry entry : this.d.entrySet()) {
            ((dj) entry.getValue()).c((Context) entry.getKey());
        }
        this.d.clear();
        Iterator it = new ArrayList(this.c.values()).iterator();
        while (it.hasNext()) {
            ((dj) it.next()).c();
        }
        this.c.clear();
        a((dj) null);
    }
}
