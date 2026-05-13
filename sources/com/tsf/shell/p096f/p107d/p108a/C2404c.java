package com.tsf.shell.p096f.p107d.p108a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p107d.p108a.p109a.C2375a;
import com.tsf.shell.p096f.p107d.p108a.p109a.C2380b;
import com.tsf.shell.p096f.p107d.p108a.p109a.C2383c;
import com.tsf.shell.p096f.p107d.p108a.p109a.C2386d;
import com.tsf.shell.p096f.p107d.p108a.p109a.C2391e;
import com.tsf.shell.p096f.p107d.p108a.p109a.C2392f;
import com.tsf.shell.p096f.p107d.p108a.p109a.C2395g;
import com.tsf.shell.p096f.p107d.p108a.p109a.C2398h;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4171h;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.d.a.c */
/* loaded from: classes.dex */
public class C2404c {

    /* renamed from: a */
    private ArrayList<AbstractC2374a> f7945a;

    /* renamed from: b */
    private ArrayList<AbstractC2374a> f7946b;

    /* renamed from: c */
    private ArrayList<AbstractC2374a> f7947c;

    /* renamed from: d */
    private AbstractC2374a f7948d;

    /* renamed from: e */
    private Number3d f7949e;

    /* renamed from: f */
    private Number3d f7950f;

    /* renamed from: g */
    private boolean f7951g = false;

    /* renamed from: h */
    private AbstractC2374a f7952h;

    /* renamed from: a */
    public void m5648a() {
        this.f7951g = C3430e.m2443m();
        this.f7949e = new Number3d();
        this.f7950f = new Number3d();
        this.f7946b = new ArrayList<>();
        this.f7947c = new ArrayList<>();
        this.f7945a = new ArrayList<>();
        this.f7945a.add(new C2380b(70, false));
        this.f7945a.add(new C2398h(0, false));
        this.f7945a.add(new C2395g(10, false));
        this.f7945a.add(new C2386d(40, true));
        this.f7945a.add(new C2375a(30, true));
        this.f7945a.add(new C2383c(20, true));
        this.f7945a.add(new C2392f(60, true));
        this.f7952h = new C2391e(100, false);
        if (!this.f7951g) {
            this.f7945a.add(this.f7952h);
        }
        Iterator<Integer> it = C4171h.m680a(C3430e.m2440n(), ",", false).iterator();
        while (it.hasNext()) {
            AbstractC2374a m5640b = m5640b(it.next().intValue());
            if (m5640b != null) {
                m5640b.m5683a(true);
                this.f7946b.add(m5640b);
            }
        }
        if (this.f7946b.size() == 0) {
            AbstractC2374a abstractC2374a = this.f7945a.get(0);
            abstractC2374a.m5683a(true);
            this.f7946b.add(abstractC2374a);
        }
        this.f7948d = this.f7946b.get(0);
    }

    /* renamed from: f */
    private void m5635f() {
        this.f7952h.m5683a(false);
        this.f7945a.remove(this.f7952h);
    }

    /* renamed from: g */
    private void m5634g() {
        if (!this.f7945a.contains(this.f7952h)) {
            this.f7945a.add(this.f7952h);
        }
    }

    /* renamed from: a */
    public void m5642a(boolean z) {
        this.f7951g = z;
        if (z) {
            m5635f();
            this.f7945a.remove(this.f7952h);
            this.f7946b.clear();
            Iterator<AbstractC2374a> it = this.f7945a.iterator();
            while (it.hasNext()) {
                AbstractC2374a next = it.next();
                next.m5683a(true);
                this.f7946b.add(next);
            }
            return;
        }
        m5634g();
        Iterator<AbstractC2374a> it2 = this.f7946b.iterator();
        while (it2.hasNext()) {
            it2.next().m5683a(false);
        }
        m5633h();
    }

    /* renamed from: h */
    private void m5633h() {
        if (this.f7946b.size() > 0) {
            this.f7948d = this.f7946b.get(0);
        } else {
            this.f7948d = this.f7945a.get(0);
        }
        this.f7948d.m5683a(true);
    }

    /* renamed from: b */
    public boolean m5641b() {
        return this.f7951g;
    }

    /* renamed from: b */
    private void m5639b(AbstractC2374a abstractC2374a) {
        if (!this.f7946b.contains(abstractC2374a)) {
            abstractC2374a.m5683a(true);
            this.f7946b.add(abstractC2374a);
        } else if (this.f7946b.size() > 1) {
            abstractC2374a.m5683a(false);
            this.f7946b.remove(abstractC2374a);
            if (this.f7948d == abstractC2374a) {
                m5633h();
            }
        }
    }

    /* renamed from: a */
    public AbstractC2374a m5647a(int i) {
        return this.f7945a.get(i);
    }

    /* renamed from: b */
    private AbstractC2374a m5640b(int i) {
        Iterator<AbstractC2374a> it = this.f7945a.iterator();
        while (it.hasNext()) {
            AbstractC2374a next = it.next();
            if (next.m5680c() == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m5646a(AbstractC2374a abstractC2374a) {
        if (!this.f7951g) {
            if (abstractC2374a != this.f7948d) {
                if (this.f7948d != null) {
                    this.f7948d.m5683a(false);
                }
                this.f7948d = abstractC2374a;
                this.f7948d.m5683a(true);
                return true;
            }
            return false;
        }
        m5639b(abstractC2374a);
        return true;
    }

    /* renamed from: c */
    public AbstractC2374a m5638c() {
        AbstractC2374a abstractC2374a = this.f7948d;
        if (this.f7951g) {
            abstractC2374a.m5681b(true);
            m5632i();
        }
        return abstractC2374a;
    }

    /* renamed from: i */
    private void m5632i() {
        this.f7947c.clear();
        Iterator<AbstractC2374a> it = this.f7946b.iterator();
        while (it.hasNext()) {
            AbstractC2374a next = it.next();
            if (!next.m5679d()) {
                this.f7947c.add(next);
            }
        }
        if (this.f7947c.size() == 0) {
            Iterator<AbstractC2374a> it2 = this.f7946b.iterator();
            while (it2.hasNext()) {
                AbstractC2374a next2 = it2.next();
                next2.m5681b(false);
                this.f7947c.add(next2);
            }
        }
        this.f7948d = this.f7947c.get((int) (Math.random() * this.f7947c.size()));
    }

    /* renamed from: a */
    public AbstractC2374a m5644a(AbstractC3208b abstractC3208b, Number3d number3d, Number3d number3d2) {
        AbstractC2374a m5638c = m5638c();
        m5638c.mo5652a(abstractC3208b.f10495k, number3d, number3d2, null);
        return m5638c;
    }

    /* renamed from: a */
    public AbstractC2374a m5643a(AbstractC3208b abstractC3208b, AbstractC2374a abstractC2374a) {
        this.f7949e.reset();
        this.f7950f.reset();
        abstractC2374a.mo5652a(abstractC3208b.f10495k, abstractC3208b.localToGlobal(this.f7949e), abstractC3208b.localRotationToGlobal(this.f7950f), null);
        return abstractC2374a;
    }

    /* renamed from: a */
    public AbstractC2374a m5645a(AbstractC3208b abstractC3208b) {
        this.f7949e.reset();
        this.f7950f.reset();
        Number3d localToGlobal = abstractC3208b.localToGlobal(this.f7949e);
        Number3d localRotationToGlobal = abstractC3208b.localRotationToGlobal(this.f7950f);
        AbstractC2374a m5638c = m5638c();
        m5638c.mo5652a(abstractC3208b.f10495k, localToGlobal, localRotationToGlobal, null);
        return m5638c;
    }

    /* renamed from: d */
    public int m5637d() {
        if (this.f7945a == null) {
            return 0;
        }
        return this.f7945a.size();
    }

    /* renamed from: e */
    public void m5636e() {
        String str;
        String str2;
        C3430e.m2484c(this.f7951g);
        String str3 = "";
        if (!this.f7951g) {
            str = "" + this.f7948d.m5680c();
        } else {
            int size = this.f7946b.size();
            int i = 0;
            while (i < size) {
                AbstractC2374a abstractC2374a = this.f7946b.get(i);
                if (i == size - 1) {
                    str2 = str3 + abstractC2374a.m5680c();
                } else {
                    str2 = str3 + abstractC2374a.m5680c() + ",";
                }
                i++;
                str3 = str2;
            }
            str = str3;
        }
        C3430e.m2492b(str);
    }
}
