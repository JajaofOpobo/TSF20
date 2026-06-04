package com.flurry.android;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends com.flurry.a.a.a.d.i {
    private CharSequence a;
    private CharSequence b;
    private CharSequence c;
    private long d;
    private List e;
    private ab f;
    private boolean g;
    private List h;
    private k i;
    private CharSequence j;
    private CharSequence k;
    private CharSequence l;
    private CharSequence m;
    private ai n;
    private Map o;
    private boolean p;
    private int q;
    private boolean r;
    private List s;

    /* synthetic */ g(byte b) {
        this();
    }

    private g() {
        super(f.a);
    }

    public final g a(CharSequence charSequence) {
        a(d()[0], charSequence);
        this.a = charSequence;
        e()[0] = true;
        return this;
    }

    public final g b(CharSequence charSequence) {
        a(d()[1], charSequence);
        this.b = charSequence;
        e()[1] = true;
        return this;
    }

    public final g c(CharSequence charSequence) {
        a(d()[2], charSequence);
        this.c = charSequence;
        e()[2] = true;
        return this;
    }

    public final g a(long j) {
        a(d()[3], Long.valueOf(j));
        this.d = j;
        e()[3] = true;
        return this;
    }

    public final g a(List list) {
        a(d()[4], list);
        this.e = list;
        e()[4] = true;
        return this;
    }

    public final g a(ab abVar) {
        a(d()[5], abVar);
        this.f = abVar;
        e()[5] = true;
        return this;
    }

    public final g a(boolean z) {
        a(d()[6], Boolean.valueOf(z));
        this.g = z;
        e()[6] = true;
        return this;
    }

    public final g b(List list) {
        a(d()[7], list);
        this.h = list;
        e()[7] = true;
        return this;
    }

    public final g a(k kVar) {
        a(d()[8], kVar);
        this.i = kVar;
        e()[8] = true;
        return this;
    }

    public final g d(CharSequence charSequence) {
        a(d()[9], charSequence);
        this.j = charSequence;
        e()[9] = true;
        return this;
    }

    public final g e(CharSequence charSequence) {
        a(d()[10], charSequence);
        this.k = charSequence;
        e()[10] = true;
        return this;
    }

    public final g f(CharSequence charSequence) {
        a(d()[11], charSequence);
        this.l = charSequence;
        e()[11] = true;
        return this;
    }

    public final g g(CharSequence charSequence) {
        a(d()[12], charSequence);
        this.m = charSequence;
        e()[12] = true;
        return this;
    }

    public final g a() {
        a(d()[16], 1);
        this.q = 1;
        e()[16] = true;
        return this;
    }

    public final g b() {
        a(d()[17], false);
        this.r = false;
        e()[17] = true;
        return this;
    }

    public final g c(List list) {
        a(d()[18], list);
        this.s = list;
        e()[18] = true;
        return this;
    }

    public final f c() {
        try {
            f fVar = new f();
            fVar.b = e()[0] ? this.a : (CharSequence) a(d()[0]);
            fVar.c = e()[1] ? this.b : (CharSequence) a(d()[1]);
            fVar.d = e()[2] ? this.c : (CharSequence) a(d()[2]);
            fVar.e = e()[3] ? this.d : ((Long) a(d()[3])).longValue();
            fVar.f = e()[4] ? this.e : (List) a(d()[4]);
            fVar.g = e()[5] ? this.f : (ab) a(d()[5]);
            fVar.h = e()[6] ? this.g : ((Boolean) a(d()[6])).booleanValue();
            fVar.i = e()[7] ? this.h : (List) a(d()[7]);
            fVar.j = e()[8] ? this.i : (k) a(d()[8]);
            fVar.k = e()[9] ? this.j : (CharSequence) a(d()[9]);
            fVar.l = e()[10] ? this.k : (CharSequence) a(d()[10]);
            fVar.m = e()[11] ? this.l : (CharSequence) a(d()[11]);
            fVar.n = e()[12] ? this.m : (CharSequence) a(d()[12]);
            fVar.o = e()[13] ? this.n : (ai) a(d()[13]);
            fVar.p = e()[14] ? this.o : (Map) a(d()[14]);
            fVar.q = e()[15] ? this.p : ((Boolean) a(d()[15])).booleanValue();
            fVar.r = e()[16] ? this.q : ((Integer) a(d()[16])).intValue();
            fVar.s = e()[17] ? this.r : ((Boolean) a(d()[17])).booleanValue();
            fVar.t = e()[18] ? this.s : (List) a(d()[18]);
            return fVar;
        } catch (Exception e) {
            throw new com.flurry.a.a.a.a(e);
        }
    }
}
