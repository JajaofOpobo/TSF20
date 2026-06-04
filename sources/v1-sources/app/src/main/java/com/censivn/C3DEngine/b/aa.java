package com.censivn.C3DEngine.b;

import android.opengl.GLSurfaceView;

/* loaded from: classes.dex */
public class aa implements com.censivn.C3DEngine.d.c {
    public z a;
    public GLSurfaceView b;
    public ab c = new ab();
    public m d;

    public aa(GLSurfaceView gLSurfaceView) {
        this.b = gLSurfaceView;
        this.d = new m(this.b);
        this.c.c();
        this.a = new z(this);
        com.censivn.C3DEngine.a.a(this.a);
        this.a.a(this.c);
        this.b.setRenderer(this.a);
    }

    @Override // com.censivn.C3DEngine.d.c
    public void a() {
    }

    public void b() {
    }

    public void c() {
    }
}
