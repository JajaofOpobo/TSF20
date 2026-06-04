package com.flurry.android;

/* loaded from: classes.dex */
final class y extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"FrequencyCapInfo\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"idHash\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"serveTime\",\"type\":\"long\"},{\"name\":\"expirationTime\",\"type\":\"long\"},{\"name\":\"views\",\"type\":\"int\"},{\"name\":\"newCap\",\"type\":\"int\"},{\"name\":\"previousCap\",\"type\":\"int\"},{\"name\":\"previousCapType\",\"type\":\"int\"}]}");
    public CharSequence b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;

    y() {
    }

    @Override // com.flurry.a.a.a.d.h, com.flurry.a.a.a.b.b
    public final com.flurry.a.a.a.c a() {
        return a;
    }

    @Override // com.flurry.a.a.a.b.r
    public final Object a(int i) {
        switch (i) {
            case 0:
                return this.b;
            case 1:
                return Long.valueOf(this.c);
            case 2:
                return Long.valueOf(this.d);
            case 3:
                return Integer.valueOf(this.e);
            case 4:
                return Integer.valueOf(this.f);
            case 5:
                return Integer.valueOf(this.g);
            case 6:
                return Integer.valueOf(this.h);
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    @Override // com.flurry.a.a.a.b.r
    public final void a(int i, Object obj) {
        switch (i) {
            case 0:
                this.b = (CharSequence) obj;
                return;
            case 1:
                this.c = ((Long) obj).longValue();
                return;
            case 2:
                this.d = ((Long) obj).longValue();
                return;
            case 3:
                this.e = ((Integer) obj).intValue();
                return;
            case 4:
                this.f = ((Integer) obj).intValue();
                return;
            case 5:
                this.g = ((Integer) obj).intValue();
                return;
            case 6:
                this.h = ((Integer) obj).intValue();
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public static z b() {
        return new z((byte) 0);
    }
}
