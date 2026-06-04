package com.flurry.android;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e extends com.flurry.a.a.a.d.i {
    private int a;
    private ByteBuffer b;

    /* synthetic */ e(byte b) {
        this();
    }

    private e() {
        super(d.a);
    }

    public final e a(int i) {
        a(d()[0], Integer.valueOf(i));
        this.a = i;
        e()[0] = true;
        return this;
    }

    public final e a(ByteBuffer byteBuffer) {
        a(d()[1], byteBuffer);
        this.b = byteBuffer;
        e()[1] = true;
        return this;
    }

    public final d a() {
        try {
            d dVar = new d();
            dVar.b = e()[0] ? this.a : ((Integer) a(d()[0])).intValue();
            dVar.c = e()[1] ? this.b : (ByteBuffer) a(d()[1]);
            return dVar;
        } catch (Exception e) {
            throw new com.flurry.a.a.a.a(e);
        }
    }
}
