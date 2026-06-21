package com.censivn.C3DEngine.b.h.d;

import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
class c extends Number3d {
    final /* synthetic */ b a;
    private float b;
    private float c;
    private float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, float f, float f2, float f3) {
        super(f, f2, f3);
        this.a = bVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public void a() {
        this.x = this.b;
        this.y = this.c;
        this.z = this.d;
    }
}
