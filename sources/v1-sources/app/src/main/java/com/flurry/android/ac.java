package com.flurry.android;

/* loaded from: classes.dex */
public final class ac extends com.flurry.a.a.a.d.i {
    private float a;
    private float b;

    /* synthetic */ ac(byte b) {
        this();
    }

    private ac() {
        super(ab.a);
    }

    public final ac a(float f) {
        a(d()[0], Float.valueOf(f));
        this.a = f;
        e()[0] = true;
        return this;
    }

    public final ac b(float f) {
        a(d()[1], Float.valueOf(f));
        this.b = f;
        e()[1] = true;
        return this;
    }

    public final ab a() {
        try {
            ab abVar = new ab();
            abVar.b = e()[0] ? this.a : ((Float) a(d()[0])).floatValue();
            abVar.c = e()[1] ? this.b : ((Float) a(d()[1])).floatValue();
            return abVar;
        } catch (Exception e) {
            throw new com.flurry.a.a.a.a(e);
        }
    }
}
