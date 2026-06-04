package com.flurry.android;

/* loaded from: classes.dex */
public final class z extends com.flurry.a.a.a.d.i {
    private CharSequence a;
    private long b;
    private long c;
    private int d;
    private int e;
    private int f;
    private int g;

    /* synthetic */ z(byte b) {
        this();
    }

    private z() {
        super(y.a);
    }

    public final z a(CharSequence charSequence) {
        a(d()[0], charSequence);
        this.a = charSequence;
        e()[0] = true;
        return this;
    }

    public final z a(long j) {
        a(d()[1], Long.valueOf(j));
        this.b = j;
        e()[1] = true;
        return this;
    }

    public final z b(long j) {
        a(d()[2], Long.valueOf(j));
        this.c = j;
        e()[2] = true;
        return this;
    }

    public final z a(int i) {
        a(d()[3], Integer.valueOf(i));
        this.d = i;
        e()[3] = true;
        return this;
    }

    public final z b(int i) {
        a(d()[4], Integer.valueOf(i));
        this.e = i;
        e()[4] = true;
        return this;
    }

    public final z c(int i) {
        a(d()[5], Integer.valueOf(i));
        this.f = i;
        e()[5] = true;
        return this;
    }

    public final z d(int i) {
        a(d()[6], Integer.valueOf(i));
        this.g = i;
        e()[6] = true;
        return this;
    }

    public final y a() {
        try {
            y yVar = new y();
            yVar.b = e()[0] ? this.a : (CharSequence) a(d()[0]);
            yVar.c = e()[1] ? this.b : ((Long) a(d()[1])).longValue();
            yVar.d = e()[2] ? this.c : ((Long) a(d()[2])).longValue();
            yVar.e = e()[3] ? this.d : ((Integer) a(d()[3])).intValue();
            yVar.f = e()[4] ? this.e : ((Integer) a(d()[4])).intValue();
            yVar.g = e()[5] ? this.f : ((Integer) a(d()[5])).intValue();
            yVar.h = e()[6] ? this.g : ((Integer) a(d()[6])).intValue();
            return yVar;
        } catch (Exception e) {
            throw new com.flurry.a.a.a.a(e);
        }
    }
}
