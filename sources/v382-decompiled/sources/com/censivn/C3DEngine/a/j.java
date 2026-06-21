package com.censivn.C3DEngine.a;

import android.opengl.GLSurfaceView;

/* loaded from: classes.dex */
public class j implements com.censivn.C3DEngine.d.b {
    public k a = new k();
    public h b;

    public j(GLSurfaceView gLSurfaceView, String str) {
        this.b = new h(gLSurfaceView);
        this.a.a(true);
        i iVar = new i(this, gLSurfaceView) { // from class: com.censivn.C3DEngine.a.j.1
            @Override // com.censivn.C3DEngine.a.i
            public boolean a() {
                return j.this.a();
            }
        };
        iVar.a(str);
        iVar.a(this.a);
        gLSurfaceView.setRenderer(iVar);
    }

    public boolean a() {
        return true;
    }

    @Override // com.censivn.C3DEngine.d.b
    public void b() {
    }
}
