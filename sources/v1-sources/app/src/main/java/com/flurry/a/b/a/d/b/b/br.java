package com.flurry.a.b.a.d.b.b;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
final class br extends bf {
    protected final Constructor b;

    public br(Constructor constructor) {
        super(constructor.getDeclaringClass());
        this.b = constructor;
    }

    @Override // com.flurry.a.b.a.d.b.b.bf
    public final Object b(String str, com.flurry.a.b.a.d.p pVar) {
        return this.b.newInstance(str);
    }
}
