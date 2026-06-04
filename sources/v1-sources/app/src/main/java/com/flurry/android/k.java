package com.flurry.android;

/* loaded from: classes.dex */
final class k extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"AdViewContainer\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"viewWidth\",\"type\":\"int\",\"default\":0},{\"name\":\"viewHeight\",\"type\":\"int\",\"default\":0},{\"name\":\"screenWidth\",\"type\":\"int\",\"default\":0},{\"name\":\"screenHeight\",\"type\":\"int\",\"default\":0}]}");
    public int b;
    public int c;
    public int d;
    public int e;

    k() {
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
                return Integer.valueOf(this.c);
            case 2:
                return Integer.valueOf(this.d);
            case 3:
                return Integer.valueOf(this.e);
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
                this.c = ((Integer) obj).intValue();
                return;
            case 2:
                this.d = ((Integer) obj).intValue();
                return;
            case 3:
                this.e = ((Integer) obj).intValue();
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public static l b() {
        return new l((byte) 0);
    }
}
