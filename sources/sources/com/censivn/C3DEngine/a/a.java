package com.censivn.C3DEngine.a;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends GLSurfaceView {
    public a(Context context) {
        super(context);
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        com.censivn.C3DEngine.a.e().i();
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        com.censivn.C3DEngine.a.e().h();
    }
}
