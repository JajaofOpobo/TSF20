package com.censivn.C3DEngine.a;

import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f implements com.censivn.C3DEngine.d.b {
    public g a = new g();
    public d b;

    public f(GLSurfaceView gLSurfaceView, String str) {
        this.b = new d(gLSurfaceView);
        this.a.a(true);
        e eVar = new e(this, gLSurfaceView) { // from class: com.censivn.C3DEngine.a.f.1
            @Override // com.censivn.C3DEngine.a.e
            public boolean a() {
                return f.this.a();
            }
        };
        eVar.a(str);
        eVar.a(this.a);
        gLSurfaceView.setRenderer(eVar);
    }

    public boolean a() {
        return true;
    }

    @Override // com.censivn.C3DEngine.d.b
    public void b() {
    }
}
