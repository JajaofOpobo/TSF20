package com.flurry.android;

import java.util.List;

/* loaded from: classes.dex */
final class ae extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"SdkAdLog\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"sessionId\",\"type\":\"long\"},{\"name\":\"adLogGUID\",\"type\":\"string\"},{\"name\":\"sdkAdEvents\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SdkAdEvent\",\"fields\":[{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"params\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"timeOffset\",\"type\":\"long\"}]}}}]}");
    public long b;
    public CharSequence c;
    public List d;

    ae() {
    }

    @Override // com.flurry.a.a.a.d.h, com.flurry.a.a.a.b.b
    public final com.flurry.a.a.a.c a() {
        return a;
    }

    @Override // com.flurry.a.a.a.b.r
    public final Object a(int i) {
        switch (i) {
            case 0:
                return Long.valueOf(this.b);
            case 1:
                return this.c;
            case 2:
                return this.d;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    @Override // com.flurry.a.a.a.b.r
    public final void a(int i, Object obj) {
        switch (i) {
            case 0:
                this.b = ((Long) obj).longValue();
                return;
            case 1:
                this.c = (CharSequence) obj;
                return;
            case 2:
                this.d = (List) obj;
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public final void a(Long l) {
        this.b = l.longValue();
    }

    public final void a(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void a(List list) {
        this.d = list;
    }
}
