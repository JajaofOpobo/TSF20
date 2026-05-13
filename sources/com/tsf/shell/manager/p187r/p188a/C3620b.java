package com.tsf.shell.manager.p187r.p188a;

import android.view.View;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p187r.p193c.C3743g;
import com.tsf.shell.p096f.p153i.p155b.p157b.C3124a;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.r.a.b */
/* loaded from: classes.dex */
public class C3620b {

    /* renamed from: c */
    private Object f11998c = new Object();

    /* renamed from: a */
    public C3614a f11996a = new C3614a();

    /* renamed from: b */
    private ArrayList<C3124a> f11997b = new ArrayList<>();

    /* renamed from: a */
    public void m1869a() {
    }

    /* renamed from: b */
    public void m1865b() {
    }

    /* renamed from: a */
    public C3124a m1868a(View view) {
        int size = this.f11997b.size();
        for (int i = 0; i < size; i++) {
            C3124a c3124a = this.f11997b.get(i);
            if (c3124a.f10163g == view) {
                if (c3124a.f10160a) {
                    return null;
                } else {
                    return c3124a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m1867a(C3124a c3124a) {
        if (!this.f11997b.contains(c3124a)) {
            synchronized (this.f11998c) {
                this.f11997b.add(c3124a);
            }
        }
    }

    /* renamed from: a */
    public void m1866a(ArrayList<C3377f> arrayList) {
        Iterator<C3377f> it = arrayList.iterator();
        while (it.hasNext()) {
            String packageName = it.next().f11169b.getPackageName();
            Iterator<C3124a> it2 = this.f11997b.iterator();
            while (it2.hasNext()) {
                C3124a next = it2.next();
                if (packageName.equals(next.f10162f)) {
                    m1862c(next);
                }
            }
        }
    }

    /* renamed from: c */
    private void m1862c(C3124a c3124a) {
        c3124a.mo3050p_();
        C3743g.m1619a(c3124a, (Runnable) null);
    }

    /* renamed from: b */
    public void m1864b(C3124a c3124a) {
        synchronized (this.f11998c) {
            this.f11997b.remove(c3124a);
        }
    }

    /* renamed from: c */
    public void m1863c() {
    }

    /* renamed from: d */
    public void m1861d() {
    }
}
