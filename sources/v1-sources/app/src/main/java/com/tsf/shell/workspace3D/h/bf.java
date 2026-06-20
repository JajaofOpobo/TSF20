package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class bf extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ba a;

    bf(ba baVar) {
        this.a = baVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        int i;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float[] fArr6;
        com.censivn.C3DEngine.c.b.WavePhysicsSystem aVar;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            i = this.a.r;
            if (i3 < i) {
                fArr = this.a.q;
                float f2 = fArr[i3];
                fArr2 = this.a.q;
                float f3 = fArr2[i3 + 1];
                fArr3 = this.a.q;
                float f4 = fArr3[i3 + 2];
                fArr4 = this.a.p;
                float f5 = fArr4[i3];
                fArr5 = this.a.p;
                float f6 = fArr5[i3 + 1];
                fArr6 = this.a.p;
                float f7 = fArr6[i3 + 2];
                aVar = this.a.k;
                ((com.censivn.C3DEngine.c.a.a.DampedSpringConstraint) aVar.b().get(i3 / 3)).a(f2 + ((f5 - f2) * f), f3 + ((f6 - f3) * f), f4 + ((f7 - f4) * f));
                i2 = i3 + 3;
            } else {
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.e.b bVar;
        bVar = this.a.c;
        bVar.a_(false);
    }
}
