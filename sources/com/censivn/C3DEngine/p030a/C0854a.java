package com.censivn.C3DEngine.p030a;

import android.content.Context;
import android.opengl.GLSurfaceView;
import com.censivn.C3DEngine.C0853a;
/* renamed from: com.censivn.C3DEngine.a.a */
/* loaded from: classes.dex */
public class C0854a extends GLSurfaceView {
    public C0854a(Context context) {
        super(context);
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        C0853a.m10855e().m10761i();
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        C0853a.m10855e().m10762h();
    }
}
