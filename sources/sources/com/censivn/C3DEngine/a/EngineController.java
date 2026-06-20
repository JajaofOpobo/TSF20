package com.censivn.C3DEngine.a;

import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class EngineController implements com.censivn.C3DEngine.d.UpdateCallback {
    public SceneGraph a = new SceneGraph();
    public TouchDispatcher b;

    public f(GLSurfaceView gLSurfaceView, String str) {
        this.b = new TouchDispatcher(gLSurfaceView);
        this.a.a(true);
        RendererImpl rendererImpl = new RendererImpl(this, gLSurfaceView) { // from class: com.censivn.C3DEngine.a.EngineController.1
            @Override // com.censivn.C3DEngine.a.RendererImpl
            public boolean a() {
                return EngineController.this.a();
            }
        };
        rendererImpl.a(str);
        rendererImpl.a(this.a);
        gLSurfaceView.setRenderer(rendererImpl);
    }

    public boolean a() {
        return true;
    }

    @Override // com.censivn.C3DEngine.d.UpdateCallback
    public void b() {
    }
}
