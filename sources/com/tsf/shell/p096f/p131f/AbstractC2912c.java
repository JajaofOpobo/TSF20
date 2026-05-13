package com.tsf.shell.p096f.p131f;

import com.tsf.shell.utils.C4171h;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.c */
/* loaded from: classes.dex */
public abstract class AbstractC2912c<E> {

    /* renamed from: b */
    private ArrayList<C2931f> f9438b;

    /* renamed from: c */
    private ArrayList<C2931f> f9439c;

    /* renamed from: d */
    private ArrayList<C2931f> f9440d;

    /* renamed from: e */
    private C2931f f9441e;

    /* renamed from: a */
    private boolean f9437a = false;

    /* renamed from: f */
    private boolean f9442f = false;

    /* renamed from: a */
    public abstract void mo4279a(E e);

    /* renamed from: a */
    public abstract void mo4278a(boolean z, String str);

    /* renamed from: b */
    public abstract boolean mo4277b();

    /* renamed from: c */
    public abstract String mo4274c();

    public AbstractC2912c(ArrayList<C2931f> arrayList) {
        m4349a(arrayList);
    }

    public AbstractC2912c() {
    }

    /* renamed from: a */
    public void m4349a(ArrayList<C2931f> arrayList) {
        this.f9438b = arrayList;
        m4352a();
    }

    /* renamed from: f */
    public void mo4273f() {
        if (this.f9442f) {
            this.f9441e.m4270b(true);
            m4345d();
        }
    }

    /* renamed from: a */
    private void m4352a() {
        this.f9442f = mo4277b();
        this.f9439c = new ArrayList<>();
        this.f9440d = new ArrayList<>();
        Iterator<Integer> it = C4171h.m680a(mo4274c(), ",", false).iterator();
        while (it.hasNext()) {
            C2931f c2931f = (C2931f) m4346c(it.next().intValue());
            if (c2931f != null) {
                c2931f.m4271a(true);
                this.f9439c.add(c2931f);
            }
        }
        if (this.f9439c.size() == 0) {
            C2931f c2931f2 = this.f9438b.get(0);
            c2931f2.m4271a(true);
            this.f9439c.add(c2931f2);
        }
        this.f9441e = this.f9439c.get(0);
        this.f9437a = true;
    }

    /* renamed from: a */
    public void m4348a(boolean z) {
        this.f9442f = z;
        if (z) {
            this.f9439c.clear();
            Iterator<C2931f> it = this.f9438b.iterator();
            while (it.hasNext()) {
                C2931f next = it.next();
                next.m4271a(true);
                this.f9439c.add(next);
            }
            return;
        }
        Iterator<C2931f> it2 = this.f9439c.iterator();
        while (it2.hasNext()) {
            it2.next().m4271a(false);
        }
        m4350a(this.f9438b.get(0));
    }

    /* renamed from: g */
    public boolean m4344g() {
        return this.f9442f;
    }

    /* renamed from: a */
    public E m4351a(int i) {
        return (E) this.f9438b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.tsf.shell.f.f.f, E] */
    /* renamed from: c */
    private E m4346c(int i) {
        Iterator<C2931f> it = this.f9438b.iterator();
        while (it.hasNext()) {
            ?? r0 = (E) it.next();
            if (r0.mo4264k() == i) {
                return r0;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m4347b(int i) {
        return m4350a(this.f9438b.get((i < 0 || i > m4342i() + (-1)) ? 0 : 0));
    }

    /* renamed from: a */
    public boolean m4350a(C2931f c2931f) {
        if (!this.f9442f) {
            if (this.f9441e != null) {
                this.f9441e.m4271a(false);
            }
            this.f9441e = c2931f;
            this.f9441e.m4271a(true);
            mo4279a((AbstractC2912c<E>) this.f9441e);
            return true;
        } else if (!this.f9439c.contains(c2931f)) {
            c2931f.m4271a(true);
            this.f9439c.add(c2931f);
            this.f9441e = c2931f;
            mo4279a((AbstractC2912c<E>) this.f9441e);
            return true;
        } else {
            if (this.f9439c.size() > 1) {
                c2931f.m4271a(false);
                this.f9439c.remove(c2931f);
                if (this.f9441e == c2931f) {
                    if (this.f9439c.size() > 0) {
                        this.f9441e = this.f9439c.get(0);
                    } else {
                        this.f9441e = this.f9438b.get(0);
                    }
                    mo4279a((AbstractC2912c<E>) this.f9441e);
                }
            }
            return false;
        }
    }

    /* renamed from: h */
    public E m4343h() {
        return (E) this.f9441e;
    }

    /* renamed from: d */
    private void m4345d() {
        this.f9440d.clear();
        Iterator<C2931f> it = this.f9439c.iterator();
        while (it.hasNext()) {
            C2931f next = it.next();
            if (!next.m4265j()) {
                this.f9440d.add(next);
            }
        }
        if (this.f9440d.size() == 0) {
            Iterator<C2931f> it2 = this.f9439c.iterator();
            while (it2.hasNext()) {
                C2931f next2 = it2.next();
                next2.m4270b(false);
                this.f9440d.add(next2);
            }
        }
        int random = (int) (Math.random() * this.f9440d.size());
        if (random == this.f9440d.size()) {
            random--;
        }
        this.f9441e = this.f9440d.get(random);
        mo4279a((AbstractC2912c<E>) this.f9441e);
    }

    /* renamed from: i */
    public int m4342i() {
        if (this.f9438b == null) {
            return 0;
        }
        return this.f9438b.size();
    }

    /* renamed from: j */
    public void m4341j() {
        String str;
        String str2;
        String str3 = "";
        if (!this.f9442f) {
            str = "" + this.f9441e.mo4264k();
        } else {
            int size = this.f9439c.size();
            int i = 0;
            while (i < size) {
                C2931f c2931f = this.f9439c.get(i);
                if (i == size - 1) {
                    str2 = str3 + c2931f.mo4264k();
                } else {
                    str2 = str3 + c2931f.mo4264k() + ",";
                }
                i++;
                str3 = str2;
            }
            str = str3;
        }
        mo4278a(this.f9442f, str);
    }
}
