package com.censivn.C3DEngine.i;

import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class c extends a {
    private short c;
    private short d;
    private short e;
    private short f;
    private FloatBuffer g;

    public c(com.censivn.C3DEngine.d.AnimationCallback aVar) {
        super(aVar);
        this.c = (short) 0;
        this.d = (short) 0;
        this.e = (short) 0;
        this.f = (short) 255;
        this.g = com.censivn.C3DEngine.h.a.a(this.c / 255.0f, this.d / 255.0f, this.e / 255.0f, this.f / 255.0f);
        a();
    }

    public final String toString() {
        return "r:" + ((int) this.c) + ", g:" + ((int) this.d) + ", b:" + ((int) this.e) + ", a:" + ((int) this.f);
    }
}
