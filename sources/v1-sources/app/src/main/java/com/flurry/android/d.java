package com.flurry.android;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class d extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"AdReportedId\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"type\",\"type\":\"int\"},{\"name\":\"id\",\"type\":\"bytes\"}]}");
    public int b;
    public ByteBuffer c;

    d() {
    }

    @Override // com.flurry.a.a.a.d.h, com.flurry.a.a.a.b.b
    public final com.flurry.a.a.a.c a() {
        return a;
    }

    @Override // com.flurry.a.a.a.b.r
    public final Object a(int i) {
        switch (i) {
            case 0:
                return Integer.valueOf(this.b);
            case 1:
                return this.c;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    @Override // com.flurry.a.a.a.b.r
    public final void a(int i, Object obj) {
        switch (i) {
            case 0:
                this.b = ((Integer) obj).intValue();
                return;
            case 1:
                this.c = (ByteBuffer) obj;
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public static e b() {
        return new e((byte) 0);
    }
}
