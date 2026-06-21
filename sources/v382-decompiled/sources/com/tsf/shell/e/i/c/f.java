package com.tsf.shell.e.i.c;

import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
class f extends m {
    float a;
    int d;
    double e;
    float f;
    float g;
    boolean h;
    boolean i;
    float j;
    final /* synthetic */ e k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        super(f, f2, false);
        this.k = eVar;
        this.a = 30.0f * com.censivn.C3DEngine.b.b.a.c;
        this.d = 10;
        this.e = 0.017453292519943295d;
        this.h = true;
        this.i = false;
        this.i = z2;
        this.h = z;
        this.j = f4;
        this.f = f3;
        this.g = -f3;
        doubleSidedEnabled(true);
        if (z) {
            position().x = this.g;
            this.d = 90;
        } else {
            position().x = this.f;
            rotation().y = 180.0f;
            this.d = 180;
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.i) {
            position().y = this.a + (((float) Math.sin(this.e * this.d)) * 30.0f * com.censivn.C3DEngine.b.b.a.c);
            this.d += 2;
        }
        if (this.h) {
            position().x += this.j;
            if (position().x > this.f) {
                this.k.a(this);
                this.h = false;
                return;
            }
            return;
        }
        position().x -= this.j;
        if (position().x < this.g) {
            this.k.a(this);
            this.h = true;
        }
    }
}
