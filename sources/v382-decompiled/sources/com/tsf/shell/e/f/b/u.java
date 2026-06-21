package com.tsf.shell.e.f.b;

import com.tsf.shell.R;

/* loaded from: classes.dex */
public class u extends com.tsf.shell.e.f.p {
    final float a;

    public u(int i, boolean z) {
        super(i, R.drawable.desktop_transition_windmill, z);
        this.a = 32.0f;
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
        float f2 = 32.0f * f;
        float tan = (float) (((com.censivn.C3DEngine.b.b.a.D / 2) / Math.tan(Math.toRadians(16.0d))) + (com.censivn.C3DEngine.b.b.a.E / 2));
        gVar.position().x = (float) (Math.sin(Math.toRadians(f2)) * tan);
        gVar.position().y = tan - ((float) (Math.cos(Math.toRadians(f2)) * tan));
        gVar.rotation().z = f2;
    }
}
