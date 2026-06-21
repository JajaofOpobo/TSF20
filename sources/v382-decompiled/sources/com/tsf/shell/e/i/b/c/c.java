package com.tsf.shell.e.i.b.c;

import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
class c extends m {
    final /* synthetic */ a a;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i * com.censivn.C3DEngine.b.b.a.b, i2 * com.censivn.C3DEngine.b.b.a.b, false);
        this.a = aVar;
        this.f = 0;
        this.d = i3;
        this.e = i4;
        this.g = i / i5;
        this.h = i2 / i6;
        this.f = (int) (Math.random() * (i4 - 1));
        a();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        boolean z;
        z = this.a.m;
        if (!z && com.tsf.shell.manager.r.c.b.c) {
            a();
        }
    }

    private void a() {
        int i = this.f % this.d;
        int i2 = this.f / this.d;
        uvs().set(0, this.g * i, (i2 + 1) * this.h);
        uvs().set(1, (i + 1) * this.g, (i2 + 1) * this.h);
        uvs().set(2, this.g * i, this.h * i2);
        uvs().set(3, (i + 1) * this.g, i2 * this.h);
        updateUvsVBO();
        this.f++;
        if (this.f >= this.e) {
            this.f = 0;
        }
    }
}
