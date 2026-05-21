package com.tsf.shell.f.f.b;

import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class t extends com.tsf.shell.f.f.l {
    final float a;

    public t(int i, boolean z) {
        super(i, b.d.desktop_transition_windmill, z);
        this.a = 32.0f;
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        float f2 = 32.0f * f;
        float fTan = (float) ((((double) (com.censivn.C3DEngine.b.b.a.D / 2)) / Math.tan(Math.toRadians(16.0d))) + ((double) (com.censivn.C3DEngine.b.b.a.E / 2)));
        gVar.position().x = (float) (Math.sin(Math.toRadians(f2)) * ((double) fTan));
        gVar.position().y = fTan - ((float) (Math.cos(Math.toRadians(f2)) * ((double) fTan)));
        gVar.rotation().z = f2;
    }
}
