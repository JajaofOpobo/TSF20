package com.censivn.C3DEngine.b.h.d;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends com.censivn.C3DEngine.b.f.a.a {
    private a a;
    private a c;
    private a d;
    private a e;
    private TextureElement f;
    private float g;
    private float h;
    private float i;
    private float j;
    private com.censivn.C3DEngine.b.g.b.b k;
    private C0038b l;
    private float m;
    private float n;

    /* JADX INFO: renamed from: com.censivn.C3DEngine.b.h.d.b$b, reason: collision with other inner class name */
    class C0038b {
        C0038b() {
        }

        public Bitmap a() {
            return null;
        }
    }

    public b(float f, final int i) {
        super(4, 32, 32);
        this.g = 0.0f;
        this.h = 0.0f;
        a(f, new C0038b() { // from class: com.censivn.C3DEngine.b.h.d.b.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.censivn.C3DEngine.b.h.d.b.C0038b
            public Bitmap a() {
                return x.a(i);
            }
        });
    }

    private void a(float f, C0038b c0038b) {
        this.l = c0038b;
        this.f = new TextureElement(0, false);
        this.j = f;
        this.g = f;
        this.h = f;
        this.i = (f / 2.0f) + 1.0f;
        textures().addElement(this.f);
        this.a = new a(0.0f, 0.0f, 0.0f);
        this.c = new a(0.0f, this.i, 0.0f);
        this.e = new a(this.i, this.i, 0.0f);
        this.d = new a(this.i, 0.0f, 0.0f);
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
        d dVar = new d() { // from class: com.censivn.C3DEngine.b.h.d.b.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f3) {
                b.this.a(f2 + ((f - f2) * f3));
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.k);
        com.censivn.C3DEngine.b.g.c.a(this.k, i, dVar);
    }

    public void e() {
        com.censivn.C3DEngine.b.g.c.a(this.k);
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
                float fTan = ((float) (Math.tan((((double) (90.0f - f2)) * 3.141592653589793d) / 180.0d) * ((double) (this.i - 1.0f)))) + 1.0f;
                g();
                a aVar = this.d;
                this.d.y = fTan;
                aVar.y = fTan;
                h();
                uvs().set(bVar.a, 0.0f, 1.0f);
                uvs().set(bVar.b, 0.0f, 0.0f);
                uvs().set(bVar.d, 1.0f, 0.0f);
                uvs().set(bVar.c, 1.0f, (this.i - fTan) / this.i);
                a(bVar, z);
                g();
                a aVar2 = this.d;
                this.d.y = fTan;
                aVar2.y = fTan;
                h();
                i();
                c(-f);
                uvs().set(bVar2.a, 0.0f, 1.0f);
                uvs().set(bVar2.b, 0.0f, 0.0f);
                uvs().set(bVar2.d, 1.0f, 0.0f);
                uvs().set(bVar2.c, 1.0f, (this.i - fTan) / this.i);
                a(bVar2, z);
                return;
            }
            return;
        }
        float fTan2 = ((float) (Math.tan((((double) f2) * 3.141592653589793d) / 180.0d) * ((double) (this.i - 1.0f)))) + 1.0f;
        g();
        a aVar3 = this.d;
        this.e.x = fTan2;
        aVar3.x = fTan2;
        a aVar4 = this.d;
        a aVar5 = this.e;
        float f3 = this.i;
        aVar5.y = f3;
        aVar4.y = f3;
        h();
        uvs().set(bVar.a, 0.0f, 1.0f);
        uvs().set(bVar.b, 0.0f, 0.0f);
        uvs().set(bVar.c, fTan2 / this.i, 0.0f);
        uvs().set(bVar.d, fTan2 / this.i, 0.0f);
        a(bVar, z);
        g();
        a aVar6 = this.d;
        this.e.x = fTan2;
        aVar6.x = fTan2;
        a aVar7 = this.d;
        a aVar8 = this.e;
        float f4 = this.i;
        aVar8.y = f4;
        aVar7.y = f4;
        h();
        i();
        c(-f);
        uvs().set(bVar2.a, 0.0f, 1.0f);
        uvs().set(bVar2.b, 0.0f, 0.0f);
        uvs().set(bVar2.c, fTan2 / this.i, 0.0f);
        uvs().set(bVar2.d, fTan2 / this.i, 0.0f);
        a(bVar2, z);
    }

    @Override // com.censivn.C3DEngine.b.f.a.a, com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        f();
        if (this.n != this.m) {
            b(this.n);
        }
    }

    public void f() {
        if (this.f.id == 0) {
            Bitmap bitmapA = this.l.a();
            com.censivn.C3DEngine.a.g().a(this.f, bitmapA);
            bitmapA.recycle();
        }
    }

    public void b(float f) {
        this.n = f;
        this.m = f;
        if (f <= 90.0f) {
            a(f, a(0), a(1), true);
            com.censivn.C3DEngine.b.f.a.b bVarA = a(2);
            bVarA.a((Boolean) false);
            bVarA.h();
            com.censivn.C3DEngine.b.f.a.b bVarA2 = a(3);
            bVarA2.a((Boolean) false);
            bVarA2.h();
        } else if (f <= 180.0f) {
            a(f, a(0), a(1), true);
            com.censivn.C3DEngine.b.f.a.b bVarA3 = a(2);
            bVarA3.a((Boolean) false);
            bVarA3.h();
            com.censivn.C3DEngine.b.f.a.b bVarA4 = a(3);
            bVarA4.a((Boolean) false);
            bVarA4.h();
        } else if (f <= 360.0f) {
            com.censivn.C3DEngine.b.f.a.b bVarA5 = a(0);
            g();
            c(bVarA5);
            h();
            a(bVarA5, true);
            com.censivn.C3DEngine.b.f.a.b bVarA6 = a(1);
            g();
            c(bVarA6);
            h();
            i();
            c(-180.0f);
            a(bVarA6, true);
            a(f - 180.0f, a(2), a(3), false);
        }
        if (f == 0.0f) {
            visible(false);
        }
        updatePointsVBO();
        updateUvsVBO();
    }

    class a extends Number3d {
        private float b;
        private float c;
        private float d;

        public a(float f, float f2, float f3) {
            super(f, f2, f3);
            this.b = f;
            this.c = f2;
            this.d = f3;
        }

        public void a() {
            this.x = this.b;
            this.y = this.c;
            this.z = this.d;
        }
    }
}
