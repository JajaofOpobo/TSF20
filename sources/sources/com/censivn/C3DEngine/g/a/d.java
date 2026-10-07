package com.censivn.C3DEngine.g.a;

import android.os.Handler;
import com.censivn.C3DEngine.g.r;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
public final class d implements c {
    private u a;
    private com.censivn.C3DEngine.g.b.a b;
    private int c;
    private long d;
    private long e;
    private int f = 1;
    private int g = 2;
    private int h = 0;
    private int i = this.h;
    private Handler j;
    private Runnable k;
    private r l;

    public d(com.censivn.C3DEngine.g.b.a aVar, int i, u uVar) {
        this.b = aVar;
        uVar.a(aVar);
        aVar.a(this);
        this.c = i;
        this.a = uVar;
        this.l = uVar.c();
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final u a() {
        return this.a;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void c() {
        if (this.i == this.h || this.i == this.g) {
            if (this.i == this.g) {
                this.d = System.currentTimeMillis() - this.e;
                this.i = this.h;
            }
            if (this.d == 0) {
                this.d = System.currentTimeMillis();
                u uVar = this.a;
            }
            this.e = (int) (System.currentTimeMillis() - this.d);
            if (this.e >= this.c) {
                this.e = this.c;
                s.b(this);
                this.a.b(1.0f);
                this.a.a(1.0f);
                this.b.a(null);
                this.a.a();
                if (this.a.d() != null) {
                    this.a.d().run();
                    return;
                }
                return;
            }
            float f = this.e / this.c;
            float a = this.l.a(f);
            this.a.b(f);
            this.a.a(a);
        }
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void d() {
        this.j = null;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final Handler e() {
        return this.j;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void f() {
        this.k = null;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final Runnable g() {
        return this.k;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void h() {
        this.i = this.f;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void i() {
        this.i = this.g;
    }
}
