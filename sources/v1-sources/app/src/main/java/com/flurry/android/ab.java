package com.flurry.android;

/* loaded from: classes.dex */
final class ab extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"Location\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"lat\",\"type\":\"float\",\"default\":0.0},{\"name\":\"lon\",\"type\":\"float\",\"default\":0.0}]}");
    public float b;
    public float c;

    ab() {
    }

    @Override // com.flurry.a.a.a.d.h, com.flurry.a.a.a.b.b
    public final com.flurry.a.a.a.c a() {
        return a;
    }

    @Override // com.flurry.a.a.a.b.r
    public final Object a(int i) {
        switch (i) {
            case 0:
                return Float.valueOf(this.b);
            case 1:
                return Float.valueOf(this.c);
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    @Override // com.flurry.a.a.a.b.r
    public final void a(int i, Object obj) {
        switch (i) {
            case 0:
                this.b = ((Float) obj).floatValue();
                return;
            case 1:
                this.c = ((Float) obj).floatValue();
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public static ac b() {
        return new ac((byte) 0);
    }
}
