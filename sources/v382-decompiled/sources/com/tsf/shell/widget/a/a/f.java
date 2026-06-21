package com.tsf.shell.widget.a.a;

import android.graphics.Color;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
class f extends x {
    int A;
    int B;
    int C;
    int D;
    int E;
    final /* synthetic */ e F;
    boolean a = true;
    int x = -1;
    int y = -1;
    int z;

    f(e eVar) {
        this.F = eVar;
    }

    @Override // com.censivn.C3DEngine.b.g.x
    public void a(float f) {
        if (this.a) {
            d(((com.censivn.C3DEngine.b.f.a.b) d()).H.color);
            this.a = false;
        }
        o(f);
    }

    private void o(float f) {
        ((com.censivn.C3DEngine.b.f.a.b) d()).H.set(255, (int) (this.z + ((this.C - this.z) * f)), (int) (this.A + ((this.D - this.A) * f)), (int) (this.B + ((this.E - this.B) * f)));
    }

    private void d(int i) {
        this.x = i;
        this.z = Color.red(i);
        this.A = Color.green(i);
        this.B = Color.blue(i);
    }

    public void c(int i) {
        this.y = i;
        this.C = Color.red(i);
        this.D = Color.green(i);
        this.E = Color.blue(i);
    }
}
