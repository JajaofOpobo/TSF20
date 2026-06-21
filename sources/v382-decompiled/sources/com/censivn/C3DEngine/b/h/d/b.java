package com.censivn.C3DEngine.b.h.d;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class b extends com.censivn.C3DEngine.b.f.a.a {
    private c a;
    private c c;
    private c d;
    private c e;
    private TextureElement f;
    private float g;
    private float h;
    private float i;
    private float j;
    private com.censivn.C3DEngine.b.g.b.b k;
    private d l;
    private float m;
    private float n;

    public b(float f, final int i) {
        super(4, 32, 32);
        this.g = 0.0f;
        this.h = 0.0f;
        a(f, new d() { // from class: com.censivn.C3DEngine.b.h.d.b.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(b.this);
            }

            @Override // com.censivn.C3DEngine.b.h.d.d
            public Bitmap a() {
                return x.a(i);
            }
        });
    }

    private void a(float f, d dVar) {
        this.l = dVar;
        this.f = new TextureElement(0, false);
        this.j = f;
        this.g = f;
        this.h = f;
        this.i = (f / 2.0f) + 1.0f;
        textures().addElement(this.f);
        this.a = new c(this, 0.0f, 0.0f, 0.0f);
        this.c = new c(this, 0.0f, this.i, 0.0f);
        this.e = new c(this, this.i, this.i, 0.0f);
        this.d = new c(this, this.i, 0.0f, 0.0f);
        doubleSidedEnabled(true);
        this.k = new com.censivn.C3DEngine.b.g.b.b();
    }

    public void c() {
        if (this.f.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.f);
        }
    }

    public float d() {
        return this.j;
    }

    public void a(float f, int i) {
        a(f, i, (Runnable) null);
    }

    public void a(final float f, int i, final Runnable runnable) {
        final float f2 = this.m;
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.censivn.C3DEngine.b.h.d.b.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f3) {
                b.this.a(f2 + ((f - f2) * f3));
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        w.a(this.k);
        w.a(this.k, i, xVar);
    }

    public void e() {
        w.a(this.k);
    }

    public void a(float f) {
        this.n = f;
        visible(true);
    }

    private void g() {
        this.a.a();
        this.c.a();
        this.d.a();
        this.e.a();
    }

    private void h() {
        this.a.x -= 1.0f;
        this.c.x -= 1.0f;
        this.d.x -= 1.0f;
        this.e.x -= 1.0f;
        this.a.y -= 1.0f;
        this.c.y -= 1.0f;
        this.d.y -= 1.0f;
        this.e.y -= 1.0f;
    }

    private void i() {
        this.a.x *= -1.0f;
        this.c.x *= -1.0f;
        this.d.x *= -1.0f;
        this.e.x *= -1.0f;
    }

    private void j() {
        this.a.y *= -1.0f;
        this.c.y *= -1.0f;
        this.d.y *= -1.0f;
        this.e.y *= -1.0f;
    }

    private void c(float f) {
        this.a.rotateDegressZ(f);
        this.c.rotateDegressZ(f);
        this.d.rotateDegressZ(f);
        this.e.rotateDegressZ(f);
    }

    private void a(com.censivn.C3DEngine.b.f.a.b bVar, boolean z) {
        if (!z) {
            i();
            j();
        }
        points().setPX(bVar.a, this.a);
        points().setPX(bVar.b, this.c);
        points().setPX(bVar.c, this.d);
        points().setPX(bVar.d, this.e);
    }

    private void c(com.censivn.C3DEngine.b.f.a.b bVar) {
        uvs().set(bVar.a, 0.0f, 1.0f);
        uvs().set(bVar.b, 0.0f, 0.0f);
        uvs().set(bVar.d, 1.0f, 0.0f);
        uvs().set(bVar.c, 1.0f, 1.0f);
    }

    private void a(float f, com.censivn.C3DEngine.b.f.a.b bVar, com.censivn.C3DEngine.b.f.a.b bVar2, boolean z) {
        float f2 = f / 2.0f;
        if (f > 90.0f) {
            if (f <= 180.0f) {
                float tan = ((float) (Math.tan(((90.0f - f2) * 3.141592653589793d) / 180.0d) * (this.i - 1.0f))) + 1.0f;
                g();
                c cVar = this.d;
                this.d.y = tan;
                cVar.y = tan;
                h();
                uvs().set(bVar.a, 0.0f, 1.0f);
                uvs().set(bVar.b, 0.0f, 0.0f);
                uvs().set(bVar.d, 1.0f, 0.0f);
                uvs().set(bVar.c, 1.0f, (this.i - tan) / this.i);
                a(bVar, z);
                g();
                c cVar2 = this.d;
                this.d.y = tan;
                cVar2.y = tan;
                h();
                i();
                c(-f);
                uvs().set(bVar2.a, 0.0f, 1.0f);
                uvs().set(bVar2.b, 0.0f, 0.0f);
                uvs().set(bVar2.d, 1.0f, 0.0f);
                uvs().set(bVar2.c, 1.0f, (this.i - tan) / this.i);
                a(bVar2, z);
                return;
            }
            return;
        }
        float tan2 = ((float) (Math.tan((f2 * 3.141592653589793d) / 180.0d) * (this.i - 1.0f))) + 1.0f;
        g();
        c cVar3 = this.d;
        this.e.x = tan2;
        cVar3.x = tan2;
        c cVar4 = this.d;
        c cVar5 = this.e;
        float f3 = this.i;
        cVar5.y = f3;
        cVar4.y = f3;
        h();
        uvs().set(bVar.a, 0.0f, 1.0f);
        uvs().set(bVar.b, 0.0f, 0.0f);
        uvs().set(bVar.c, tan2 / this.i, 0.0f);
        uvs().set(bVar.d, tan2 / this.i, 0.0f);
        a(bVar, z);
        g();
        c cVar6 = this.d;
        this.e.x = tan2;
        cVar6.x = tan2;
        c cVar7 = this.d;
        c cVar8 = this.e;
        float f4 = this.i;
        cVar8.y = f4;
        cVar7.y = f4;
        h();
        i();
        c(-f);
        uvs().set(bVar2.a, 0.0f, 1.0f);
        uvs().set(bVar2.b, 0.0f, 0.0f);
        uvs().set(bVar2.c, tan2 / this.i, 0.0f);
        uvs().set(bVar2.d, tan2 / this.i, 0.0f);
        a(bVar2, z);
    }

    @Override // com.censivn.C3DEngine.b.f.a.a, com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        f();
        if (this.n != this.m) {
            b(this.n);
        }
    }

    public void f() {
        if (this.f.id == 0) {
            Bitmap a = this.l.a();
            com.censivn.C3DEngine.a.g().a(this.f, a);
            a.recycle();
        }
    }

    public void b(float f) {
        this.n = f;
        this.m = f;
        if (f <= 90.0f) {
            a(f, a(0), a(1), true);
            com.censivn.C3DEngine.b.f.a.b a = a(2);
            a.a((Boolean) false);
            a.h();
            com.censivn.C3DEngine.b.f.a.b a2 = a(3);
            a2.a((Boolean) false);
            a2.h();
        } else if (f <= 180.0f) {
            a(f, a(0), a(1), true);
            com.censivn.C3DEngine.b.f.a.b a3 = a(2);
            a3.a((Boolean) false);
            a3.h();
            com.censivn.C3DEngine.b.f.a.b a4 = a(3);
            a4.a((Boolean) false);
            a4.h();
        } else if (f <= 360.0f) {
            com.censivn.C3DEngine.b.f.a.b a5 = a(0);
            g();
            c(a5);
            h();
            a(a5, true);
            com.censivn.C3DEngine.b.f.a.b a6 = a(1);
            g();
            c(a6);
            h();
            i();
            c(-180.0f);
            a(a6, true);
            a(f - 180.0f, a(2), a(3), false);
        }
        if (f == 0.0f) {
            visible(false);
        }
        updatePointsVBO();
        updateUvsVBO();
    }
}
