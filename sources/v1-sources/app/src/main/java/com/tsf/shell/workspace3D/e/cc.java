package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
final class cc extends Number3d {
    final /* synthetic */ by a;
    private float b;
    private float c;
    private float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(by byVar, float f, float f2) {
        super(f, f2, 0.0f);
        this.a = byVar;
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
