package com.censivn.C3DEngine.b.g.a;

import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class d extends c {
    private x c;
    private com.censivn.C3DEngine.b.g.b.a d;
    private int e;
    private long f;
    private long g;
    private Runnable h;
    private v i;

    public d(com.censivn.C3DEngine.b.g.b.a aVar, int i, x xVar) {
        this.d = aVar;
        xVar.a(aVar);
        aVar.setTweenChild(this);
        this.e = i;
        this.c = xVar;
        this.i = xVar.e();
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public x a() {
        return this.c;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void c() {
        if (this.a == 0 || this.a == 2) {
            if (this.a == 2) {
                this.f = System.currentTimeMillis() - this.g;
                this.a = 0;
            }
            if (this.f == 0) {
                this.f = System.currentTimeMillis();
                this.c.b();
            }
            this.g = (int) (System.currentTimeMillis() - this.f);
            if (this.g >= this.e) {
                this.g = this.e;
                w.b(this);
                this.c.b(1.0f);
                this.c.a(1.0f);
                this.d.setTweenChild(null);
                this.c.a();
                if (this.c.g() != null) {
                    this.c.g().run();
                    return;
                }
                return;
            }
            float f = this.g / this.e;
            float a = this.i.a(f);
            this.c.b(f);
            this.c.a(a);
        }
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void a(Runnable runnable) {
        this.h = runnable;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public Runnable d() {
        return this.h;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void e() {
        this.a = 1;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void f() {
        this.a = 2;
    }
}
