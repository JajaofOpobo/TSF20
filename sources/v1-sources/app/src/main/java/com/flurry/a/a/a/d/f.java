package com.flurry.a.a.a.d;

import com.flurry.a.a.a.b.m;
import com.flurry.a.a.a.c.t;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class f extends m {
    public f() {
        super(a.c());
    }

    public f(Class cls) {
        super(a.c().a((Type) cls), a.c());
    }

    @Override // com.flurry.a.a.a.b.m
    protected final void a(com.flurry.a.a.a.c cVar, Object obj, t tVar) {
        if (!(obj instanceof Enum)) {
            super.a(cVar, obj, tVar);
        } else {
            tVar.a(((Enum) obj).ordinal());
        }
    }
}
