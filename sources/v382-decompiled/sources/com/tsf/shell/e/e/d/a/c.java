package com.tsf.shell.e.e.d.a;

import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
class c extends m {
    final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(10.0f, 10.0f);
        this.a = bVar;
        c(10.0f);
    }

    public void c(float f) {
        points().setPX(0, f / 2.0f, (-f) / 2.0f, 0.0f);
        points().setPX(1, (-f) / 2.0f, (-f) / 2.0f, 0.0f);
        points().setPX(2, f / 2.0f, f / 2.0f, 0.0f);
        points().setPX(3, (-f) / 2.0f, f / 2.0f, 0.0f);
    }
}
