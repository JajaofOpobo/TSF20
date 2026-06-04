package com.censivn.C3DEngine.c.a;

import com.censivn.C3DEngine.api.element.PointBufferManager;
import com.censivn.C3DEngine.b.r;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {
    protected ArrayList a = new ArrayList();
    protected ArrayList b = new ArrayList();
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected int i;
    protected int j;
    protected int k;
    protected float l;
    protected float m;
    protected float n;

    public final void a(r rVar) {
        PointBufferManager E = rVar.E();
        com.censivn.C3DEngine.b.a y = rVar.y();
        int size = E.size();
        int a = y.a();
        for (int i = 0; i < size; i++) {
            e eVar = new e();
            eVar.a(i, E);
            this.a.add(eVar);
        }
        for (int i2 = 0; i2 < a; i2++) {
            a aVar = new a();
            short a2 = y.a(i2);
            short b = y.b(i2);
            int c = (int) y.c(i2);
            aVar.a((e) this.a.get(a2));
            aVar.a((e) this.a.get(b));
            aVar.a((e) this.a.get(c));
            this.b.add(aVar);
        }
    }

    public final ArrayList a() {
        return this.a;
    }

    public final ArrayList b() {
        return this.b;
    }

    public final void c() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) this.a.get(i);
            if (i == 0) {
                float a = eVar.a();
                this.c = a;
                this.f = a;
                float b = eVar.b();
                this.d = b;
                this.g = b;
                float c = eVar.c();
                this.e = c;
                this.h = c;
            } else {
                this.f = Math.min(this.f, eVar.a());
                this.g = Math.min(this.g, eVar.b());
                this.h = Math.min(this.h, eVar.c());
                this.c = Math.max(this.c, eVar.a());
                this.d = Math.max(this.d, eVar.b());
                this.e = Math.max(this.e, eVar.c());
            }
            eVar.b(eVar.a(), eVar.b(), eVar.c());
        }
        this.l = this.c - this.f;
        this.m = this.d - this.g;
        this.n = this.e - this.h;
        float max = Math.max(this.l, Math.max(this.m, this.n));
        float min = Math.min(this.l, Math.min(this.m, this.n));
        if (max == this.l && min == this.m) {
            this.k = 2;
            this.j = 4;
            this.i = 1;
        } else if (max == this.l && min == this.n) {
            this.k = 4;
            this.j = 2;
            this.i = 1;
        } else if (max == this.m && min == this.l) {
            this.k = 1;
            this.j = 4;
            this.i = 2;
        } else if (max == this.m && min == this.n) {
            this.k = 4;
            this.j = 1;
            this.i = 2;
        } else if (max == this.n && min == this.l) {
            this.k = 1;
            this.j = 2;
            this.i = 4;
        } else if (max == this.n && min == this.m) {
            this.k = 2;
            this.j = 1;
            this.i = 4;
        }
        for (int i2 = 0; i2 < size; i2++) {
            e eVar2 = (e) this.a.get(i2);
            eVar2.a((eVar2.a() - this.f) / this.l, (eVar2.b() - this.g) / this.m, (eVar2.c() - this.h) / this.n);
        }
    }

    public final float d() {
        return this.f;
    }

    public final float e() {
        return this.g;
    }

    public final float f() {
        return this.c;
    }

    public final float g() {
        return this.d;
    }

    public final float h() {
        return this.e;
    }
}
