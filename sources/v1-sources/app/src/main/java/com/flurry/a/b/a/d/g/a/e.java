package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.ac;

/* loaded from: classes.dex */
final class e extends d {
    private final Class a;
    private final Class b;
    private final ac c;
    private final ac d;

    public e(Class cls, ac acVar, Class cls2, ac acVar2) {
        this.a = cls;
        this.c = acVar;
        this.b = cls2;
        this.d = acVar2;
    }

    @Override // com.flurry.a.b.a.d.g.a.d
    public final ac a(Class cls) {
        if (cls == this.a) {
            return this.c;
        }
        if (cls == this.b) {
            return this.d;
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.g.a.d
    public final d a(Class cls, ac acVar) {
        return new g(new j[]{new j(this.a, this.c), new j(this.b, this.d)});
    }
}
