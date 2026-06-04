package com.flurry.android;

import java.util.Map;

/* loaded from: classes.dex */
final class ad extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"SdkAdEvent\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"params\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"timeOffset\",\"type\":\"long\"}]}");
    public CharSequence b;
    public Map c;
    public long d;

    ad() {
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
                return this.c;
            case 2:
                return Long.valueOf(this.d);
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
                this.c = (Map) obj;
                return;
            case 2:
                this.d = ((Long) obj).longValue();
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public final void a(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final void a(Map map) {
        this.c = map;
    }

    public final void a(Long l) {
        this.d = l.longValue();
    }
}
