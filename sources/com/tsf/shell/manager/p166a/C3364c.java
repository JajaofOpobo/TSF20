package com.tsf.shell.manager.p166a;

import android.content.ComponentName;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.a.c */
/* loaded from: classes.dex */
public class C3364c {

    /* renamed from: b */
    private ArrayList<C3222g> f11128b;

    /* renamed from: d */
    private C3372e f11130d;

    /* renamed from: e */
    private C3381g f11131e = new C3381g();

    /* renamed from: c */
    private ArrayList<InterfaceC3365a> f11129c = new ArrayList<>();

    /* renamed from: a */
    public C3361b f11127a = new C3361b(this);

    /* renamed from: com.tsf.shell.manager.a.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3365a {
        /* renamed from: a */
        void mo2679a();

        /* renamed from: a */
        void mo2678a(C3222g c3222g);

        /* renamed from: a */
        void mo2677a(C3222g c3222g, boolean z);

        /* renamed from: b */
        void mo2676b(C3222g c3222g, boolean z);

        /* renamed from: k_ */
        void mo2675k_();
    }

    public C3364c(C3372e c3372e) {
        this.f11130d = c3372e;
    }

    /* renamed from: a */
    public C3381g m2749a() {
        return this.f11131e;
    }

    /* renamed from: b */
    public boolean m2740b() {
        return this.f11128b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m2741a(ArrayList<C3222g> arrayList) {
        this.f11128b = arrayList;
        Iterator<InterfaceC3365a> it = this.f11129c.iterator();
        while (it.hasNext()) {
            it.next().mo2675k_();
        }
    }

    /* renamed from: a */
    public void m2745a(C3222g c3222g, boolean z) {
        m2744a(c3222g, z, true);
    }

    /* renamed from: a */
    public void m2744a(C3222g c3222g, boolean z, boolean z2) {
        this.f11128b.add(c3222g);
        if (z2) {
            m2737c();
            Iterator<InterfaceC3365a> it = this.f11129c.iterator();
            while (it.hasNext()) {
                it.next().mo2677a(c3222g, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public boolean m2739b(C3222g c3222g, boolean z) {
        boolean remove = this.f11128b.remove(c3222g);
        m2737c();
        Iterator<InterfaceC3365a> it = this.f11129c.iterator();
        while (it.hasNext()) {
            it.next().mo2676b(c3222g, z);
        }
        return remove;
    }

    /* renamed from: a */
    public void m2746a(C3222g c3222g) {
        m2737c();
        Iterator<InterfaceC3365a> it = this.f11129c.iterator();
        while (it.hasNext()) {
            it.next().mo2678a(c3222g);
        }
    }

    /* renamed from: c */
    public void m2737c() {
        Iterator<InterfaceC3365a> it = this.f11129c.iterator();
        while (it.hasNext()) {
            it.next().mo2679a();
        }
    }

    /* renamed from: a */
    public C3222g m2747a(ComponentName componentName) {
        Iterator<C3222g> it = this.f11128b.iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            if (next.m3106bd().f11169b.equals(componentName)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C3222g m2748a(int i) {
        Iterator<C3222g> it = this.f11128b.iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            if (next.m3534K() != null && next.m3534K().f2532id == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C3222g m2742a(C3377f c3377f) {
        Iterator<C3222g> it = this.f11128b.iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            if (next.m3106bd() == c3377f) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public ArrayList<C3222g> m2736d() {
        return this.f11128b;
    }

    /* renamed from: a */
    public void m2743a(InterfaceC3365a interfaceC3365a) {
        if (!this.f11129c.contains(interfaceC3365a)) {
            this.f11129c.add(interfaceC3365a);
        }
    }

    /* renamed from: b */
    public void m2738b(InterfaceC3365a interfaceC3365a) {
        this.f11129c.remove(interfaceC3365a);
    }
}
