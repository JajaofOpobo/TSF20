package com.flurry.android;

/* loaded from: classes.dex */
final class i extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"AdSpaceLayout\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"adWidth\",\"type\":\"int\"},{\"name\":\"adHeight\",\"type\":\"int\"},{\"name\":\"fix\",\"type\":\"string\"},{\"name\":\"format\",\"type\":\"string\"},{\"name\":\"alignment\",\"type\":\"string\"}]}");
    public int b;
    public int c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;

    i() {
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
                return this.d;
            case 3:
                return this.e;
            case 4:
                return this.f;
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
                this.d = (CharSequence) obj;
                return;
            case 3:
                this.e = (CharSequence) obj;
                return;
            case 4:
                this.f = (CharSequence) obj;
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public final Integer b() {
        return Integer.valueOf(this.b);
    }

    public final Integer c() {
        return Integer.valueOf(this.c);
    }

    public final CharSequence d() {
        return this.d;
    }

    public final CharSequence e() {
        return this.e;
    }

    public final CharSequence f() {
        return this.f;
    }
}
