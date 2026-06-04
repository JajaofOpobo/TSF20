package com.flurry.a.a.a.d;

import com.flurry.a.a.a.b.j;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class e extends j {
    public e() {
        this(null, null, a.c());
    }

    public e(Class cls) {
        this(a.c().a((Type) cls));
    }

    private e(com.flurry.a.a.a.c cVar) {
        this(cVar, cVar, a.c());
    }

    public e(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2, a aVar) {
        super(cVar, cVar2, aVar);
    }

    @Override // com.flurry.a.a.a.b.j
    protected final Object a(String str, com.flurry.a.a.a.c cVar) {
        Class b = ((a) a()).b(cVar);
        return b == null ? super.a(str, cVar) : Enum.valueOf(b, str);
    }
}
