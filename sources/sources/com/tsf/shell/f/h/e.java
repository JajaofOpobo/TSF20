package com.tsf.shell.f.h;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends com.censivn.C3DEngine.b.f.a.a {
    private static TextureElement k;
    private static TextureElement l;
    public float a;
    private a c;
    private a d;
    private a e;
    private a f;
    private a g;
    private a h;
    private a i;
    private a j;
    private float m;
    private float n;
    private float o;
    private com.censivn.C3DEngine.b.g.b.b p;
    private k q;

    public e() {
        super(2, 32, 32);
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        if (k == null) {
            Bitmap bitmapA = x.a(b.d.dock_operation_border);
            k = com.censivn.C3DEngine.a.g().a(bitmapA, false);
            bitmapA.recycle();
            Bitmap bitmapA2 = x.a(b.d.dock_operation_border_point);
            l = com.censivn.C3DEngine.a.g().a(bitmapA2, false);
            bitmapA2.recycle();
        }
        this.m = com.censivn.C3DEngine.b.b.a.b * 158.0f;
        this.n = com.censivn.C3DEngine.b.b.a.b * 158.0f;
        this.a = this.m;
        textures().addElement(k);
        this.q = new k(28.0f * com.censivn.C3DEngine.b.b.a.b, 21.0f * com.censivn.C3DEngine.b.b.a.b, false);
        this.q.textures().addElement(l);
        this.q.alpha(0.0f);
        addChild(this.q);
        this.g = new a(0.0f, 0.0f, 0.0f);
        this.h = new a(-this.m, 0.0f, 0.0f);
        this.i = new a(0.0f, this.n, 0.0f);
        this.j = new a(-this.m, this.n, 0.0f);
        this.c = new a(this.m, 0.0f, 0.0f);
        this.d = new a(0.0f, 0.0f, 0.0f);
        this.e = new a(this.m, this.n, 0.0f);
        this.f = new a(0.0f, this.n, 0.0f);
        com.censivn.C3DEngine.b.f.a.b bVarA = a(0);
        uvs().set(bVarA.a, 1.0f, 1.0f);
        uvs().set(bVarA.b, 0.0f, 1.0f);
        uvs().set(bVarA.c, 1.0f, 0.0f);
        uvs().set(bVarA.d, 0.0f, 0.0f);
        com.censivn.C3DEngine.b.f.a.b bVarA2 = a(1);
        uvs().set(bVarA2.b, 1.0f, 1.0f);
        uvs().set(bVarA2.a, 0.0f, 1.0f);
        uvs().set(bVarA2.d, 1.0f, 0.0f);
        uvs().set(bVarA2.c, 0.0f, 0.0f);
        this.p = new com.censivn.C3DEngine.b.g.b.b();
        e();
    }

    public void c() {
        this.q.position().y = 0.0f;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.e.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar.h(this.a + (20.0f * com.censivn.C3DEngine.b.b.a.b));
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.q);
        com.censivn.C3DEngine.b.g.c.a(this.q, 300, dVar);
    }

    public void d() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.e.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.q);
        com.censivn.C3DEngine.b.g.c.a(this.q, 300, dVar);
    }

    public void a(float f) {
        a(f, (Runnable) null);
    }

    public void a(final float f, final Runnable runnable) {
        final float f2 = this.o;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.e.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f3) {
                e.this.b(f2 + ((f - f2) * f3));
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.p);
        com.censivn.C3DEngine.b.g.c.a(this.p, 300, dVar);
        if (f == 0.0f) {
            d();
        } else {
            c();
        }
    }

    public void b(float f) {
        this.o = f;
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.c.a();
        this.d.a();
        this.e.a();
        this.f.a();
        float f2 = 90.0f - (f / 2.0f);
        if (f2 < 45.0f) {
            float fCos = (float) (((double) this.a) / Math.cos((((double) f2) * 3.141592653589793d) / 180.0d));
            float fTan = (float) (Math.tan((((double) f2) * 3.141592653589793d) / 180.0d) * ((double) this.a));
            this.h.rotateDegressZ(-f2);
            this.i.x = 0.0f;
            this.i.y = fCos;
            this.j.rotateDegressZ(-f2);
            this.c.rotateDegressZ(f2);
            this.f.x = 0.0f;
            this.f.y = fCos;
            this.e.rotateDegressZ(f2);
            com.censivn.C3DEngine.b.f.a.b bVarA = a(0);
            uvs().set(bVarA.a, 1.0f, 1.0f);
            uvs().set(bVarA.b, 0.0f, 1.0f);
            uvs().set(bVarA.c, (this.a - fTan) / this.a, 0.0f);
            uvs().set(bVarA.d, 0.0f, 0.0f);
            com.censivn.C3DEngine.b.f.a.b bVarA2 = a(1);
            uvs().set(bVarA2.a, 0.0f, 1.0f);
            uvs().set(bVarA2.b, 1.0f, 1.0f);
            uvs().set(bVarA2.c, 0.0f, 0.0f);
            uvs().set(bVarA2.d, (this.a - fTan) / this.a, 0.0f);
        } else {
            float f3 = f / 2.0f;
            float fTan2 = (float) (Math.tan((((double) f3) * 3.141592653589793d) / 180.0d) * ((double) this.a));
            float fCos2 = (float) (((double) this.a) / Math.cos((((double) f3) * 3.141592653589793d) / 180.0d));
            this.h.rotateDegressZ((-90.0f) + f3);
            a aVar = this.i;
            this.j.x = 0.0f;
            aVar.x = 0.0f;
            a aVar2 = this.i;
            this.j.y = fCos2;
            aVar2.y = fCos2;
            this.c.rotateDegressZ(90.0f - f3);
            a aVar3 = this.e;
            this.f.x = 0.0f;
            aVar3.x = 0.0f;
            a aVar4 = this.e;
            this.f.y = fCos2;
            aVar4.y = fCos2;
            com.censivn.C3DEngine.b.f.a.b bVarA3 = a(0);
            uvs().set(bVarA3.a, 1.0f, 1.0f);
            uvs().set(bVarA3.b, 0.0f, 1.0f);
            uvs().set(bVarA3.c, 0.0f, (this.a - fTan2) / this.a);
            uvs().set(bVarA3.d, 0.0f, (this.a - fTan2) / this.a);
            bVarA3.m.x = 1.0f;
            com.censivn.C3DEngine.b.f.a.b bVarA4 = a(1);
            uvs().set(bVarA4.a, 0.0f, 1.0f);
            uvs().set(bVarA4.b, 1.0f, 1.0f);
            uvs().set(bVarA4.c, 0.0f, (this.a - fTan2) / this.a);
            uvs().set(bVarA4.d, 0.0f, (this.a - fTan2) / this.a);
            bVarA4.m.x = -1.0f;
        }
        e();
    }

    private void e() {
        com.censivn.C3DEngine.b.f.a.b bVarA = a(0);
        points().setPX(bVarA.a, this.g);
        points().setPX(bVarA.b, this.h);
        points().setPX(bVarA.c, this.i);
        points().setPX(bVarA.d, this.j);
        com.censivn.C3DEngine.b.f.a.b bVarA2 = a(1);
        points().setPX(bVarA2.a, this.c);
        points().setPX(bVarA2.b, this.d);
        points().setPX(bVarA2.c, this.e);
        points().setPX(bVarA2.d, this.f);
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
