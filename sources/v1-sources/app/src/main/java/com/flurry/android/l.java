package com.flurry.android;

/* loaded from: classes.dex */
public final class l extends com.flurry.a.a.a.d.i {
    private int a;
    private int b;
    private int c;
    private int d;

    /* synthetic */ l(byte b) {
        this();
    }

    private l() {
        super(k.a);
    }

    public final l a(int i) {
        a(d()[0], Integer.valueOf(i));
        this.a = i;
        e()[0] = true;
        return this;
    }

    public final l b(int i) {
        a(d()[1], Integer.valueOf(i));
        this.b = i;
        e()[1] = true;
        return this;
    }

    public final l c(int i) {
        a(d()[2], Integer.valueOf(i));
        this.c = i;
        e()[2] = true;
        return this;
    }

    public final l d(int i) {
        a(d()[3], Integer.valueOf(i));
        this.d = i;
        e()[3] = true;
        return this;
    }

    public final k a() {
        try {
            k kVar = new k();
            kVar.b = e()[0] ? this.a : ((Integer) a(d()[0])).intValue();
            kVar.c = e()[1] ? this.b : ((Integer) a(d()[1])).intValue();
            kVar.d = e()[2] ? this.c : ((Integer) a(d()[2])).intValue();
            kVar.e = e()[3] ? this.d : ((Integer) a(d()[3])).intValue();
            return kVar;
        } catch (Exception e) {
            throw new com.flurry.a.a.a.a(e);
        }
    }
}
