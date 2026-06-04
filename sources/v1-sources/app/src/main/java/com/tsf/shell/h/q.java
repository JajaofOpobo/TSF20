package com.tsf.shell.h;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes.dex */
public final class q extends GLSurfaceView {
    public q(Context context) {
        super(context);
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        com.censivn.C3DEngine.a.d().f();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        com.censivn.C3DEngine.a.d().e();
    }
}
