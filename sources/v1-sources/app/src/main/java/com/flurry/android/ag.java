package com.flurry.android;

import java.util.List;

/* loaded from: classes.dex */
public final class ag extends com.flurry.a.a.a.d.i {
    private CharSequence a;
    private List b;
    private List c;
    private long d;
    private boolean e;

    /* synthetic */ ag(byte b) {
        this();
    }

    private ag() {
        super(af.a);
    }

    public final ag a(CharSequence charSequence) {
        a(d()[0], charSequence);
        this.a = charSequence;
        e()[0] = true;
        return this;
    }

    public final ag a(List list) {
        a(d()[1], list);
        this.b = list;
        e()[1] = true;
        return this;
    }

    public final ag b(List list) {
        a(d()[2], list);
        this.c = list;
        e()[2] = true;
        return this;
    }

    public final ag a(long j) {
        a(d()[3], Long.valueOf(j));
        this.d = j;
        e()[3] = true;
        return this;
    }

    public final ag a() {
        a(d()[4], false);
        this.e = false;
        e()[4] = true;
        return this;
    }

    public final af b() {
        try {
            af afVar = new af();
            afVar.b = e()[0] ? this.a : (CharSequence) a(d()[0]);
            afVar.c = e()[1] ? this.b : (List) a(d()[1]);
            afVar.d = e()[2] ? this.c : (List) a(d()[2]);
            afVar.e = e()[3] ? this.d : ((Long) a(d()[3])).longValue();
            afVar.f = e()[4] ? this.e : ((Boolean) a(d()[4])).booleanValue();
            return afVar;
        } catch (Exception e) {
            throw new com.flurry.a.a.a.a(e);
        }
    }
}
