package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.ac;

/* loaded from: classes.dex */
final class i extends d {
    private final Class a;
    private final ac b;

    public i(Class cls, ac acVar) {
        this.a = cls;
        this.b = acVar;
    }

    @Override // com.flurry.a.b.a.d.g.a.d
    public final ac a(Class cls) {
        if (cls == this.a) {
            return this.b;
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.g.a.d
    public final d a(Class cls, ac acVar) {
        return new e(this.a, this.b, cls, acVar);
    }
}
