package com.tsf.shell.p096f.p131f.p132a.p139d;

import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3372e;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p131f.p132a.p139d.p140a.C2820a;
import com.tsf.shell.p096f.p131f.p132a.p139d.p140a.C2823b;
import com.tsf.shell.p096f.p131f.p132a.p139d.p140a.C2826c;
import com.tsf.shell.p096f.p131f.p132a.p139d.p140a.C2827d;
import com.tsf.shell.p096f.p131f.p132a.p139d.p140a.C2829e;
import com.tsf.shell.p096f.p131f.p132a.p139d.p140a.C2832f;
import com.tsf.shell.p096f.p153i.C3112b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.d.a */
/* loaded from: classes.dex */
public class C2817a {

    /* renamed from: b */
    private C3372e f9189b;

    /* renamed from: d */
    private C2826c f9191d;

    /* renamed from: e */
    private C2827d f9192e;

    /* renamed from: a */
    private boolean f9188a = false;

    /* renamed from: f */
    private int f9193f = -1;

    /* renamed from: c */
    private ArrayList<C2826c> f9190c = new ArrayList<>();

    public C2817a(C3372e c3372e) {
        this.f9189b = c3372e;
        this.f9190c.add(new C2823b(0));
        this.f9190c.add(new C2829e(2));
        this.f9190c.add(new C2832f(1));
        this.f9190c.add(new C2820a(3));
        this.f9192e = new C2827d(0);
        m4588c(C3430e.m2511an());
    }

    /* renamed from: a */
    public int m4598a() {
        return this.f9190c.size();
    }

    /* renamed from: a */
    public C2826c m4597a(int i) {
        return this.f9190c.get(i);
    }

    /* renamed from: b */
    public C2826c m4591b() {
        return this.f9191d;
    }

    /* renamed from: e */
    private Comparator<? super C3112b> m4586e() {
        return this.f9191d.m4575a();
    }

    /* renamed from: a */
    public int m4592a(ArrayList<C3112b> arrayList, C3112b c3112b) {
        int binarySearch = Collections.binarySearch(arrayList, c3112b, this.f9191d.m4575a());
        if (binarySearch < 0) {
            return -(binarySearch + 1);
        }
        return binarySearch;
    }

    /* renamed from: c */
    public boolean m4589c() {
        return this.f9188a;
    }

    /* renamed from: a */
    public void m4593a(ArrayList<C3112b> arrayList) {
        Collections.sort(arrayList, this.f9192e.m4575a());
    }

    /* renamed from: d */
    public void m4587d() {
        Collections.sort(C3359a.f11094h.m4019t().m4452ao().m4815a(), m4586e());
    }

    /* renamed from: c */
    private void m4588c(int i) {
        Iterator<C2826c> it = this.f9190c.iterator();
        while (it.hasNext()) {
            C2826c next = it.next();
            if (next.mo4264k() == i) {
                this.f9191d = next;
            }
        }
        if (this.f9191d == null) {
            this.f9191d = this.f9190c.get(0);
        }
    }

    /* renamed from: b */
    public void m4590b(int i) {
        C3430e.m2433p(i);
        m4588c(i);
        if (this.f9188a) {
            this.f9193f = i;
        } else if (!C3359a.f11094h.m4019t().m4452ao().m4815a().isEmpty()) {
            this.f9188a = true;
            m4587d();
            C3359a.f11109w.m2707d().m4807c();
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.f.a.d.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C3359a.f11094h.m4019t().m4442ay();
                    C2817a.this.f9188a = false;
                    if (C2817a.this.f9193f != -1) {
                        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.a.d.a.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C2817a.this.m4590b(C2817a.this.f9193f);
                                C2817a.this.f9193f = -1;
                            }
                        });
                        return;
                    }
                    C3359a.f11088b.m10552c(Home.m6177b());
                }
            };
            C3359a.f11088b.m10559b(Home.m6177b());
            C3359a.f11094h.m4019t().m4434b(runnable);
        }
    }
}
