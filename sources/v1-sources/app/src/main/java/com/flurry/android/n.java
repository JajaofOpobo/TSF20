package com.flurry.android;

import java.util.List;

/* loaded from: classes.dex */
final class n extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"Callback\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"event\",\"type\":\"string\"},{\"name\":\"actions\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");
    public CharSequence b;
    public List c;

    n() {
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
                this.c = (List) obj;
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public final CharSequence b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }
}
