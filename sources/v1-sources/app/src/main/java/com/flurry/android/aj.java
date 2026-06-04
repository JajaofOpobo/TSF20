package com.flurry.android;

/* loaded from: classes.dex */
public final class aj extends com.flurry.a.a.a.d.i {
    private int a;

    /* synthetic */ aj(byte b) {
        this();
    }

    private aj() {
        super(ai.a);
    }

    public final aj a(int i) {
        a(d()[0], Integer.valueOf(i));
        this.a = i;
        e()[0] = true;
        return this;
    }

    public final ai a() {
        try {
            ai aiVar = new ai();
            aiVar.b = e()[0] ? this.a : ((Integer) a(d()[0])).intValue();
            return aiVar;
        } catch (Exception e) {
            throw new com.flurry.a.a.a.a(e);
        }
    }
}
