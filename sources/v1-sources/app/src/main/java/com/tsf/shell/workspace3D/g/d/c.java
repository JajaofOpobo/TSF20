package com.tsf.shell.workspace3D.g.d;

import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
final class c extends Number3d {
    final /* synthetic */ a a;
    private float b;
    private float c;
    private float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, float f, float f2) {
        super(f, f2, 0.0f);
        this.a = aVar;
        this.b = f;
        this.c = f2;
        this.d = 0.0f;
    }

    public final void a() {
        this.x = this.b;
        this.y = this.c;
        this.z = this.d;
    }
}
