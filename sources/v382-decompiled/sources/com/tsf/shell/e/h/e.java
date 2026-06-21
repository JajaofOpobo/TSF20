package com.tsf.shell.e.h;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class e extends com.censivn.C3DEngine.b.f.a.a {
    private static TextureElement k;
    private static TextureElement l;
    public float a;
    private f c;
    private f d;
    private f e;
    private f f;
    private f g;
    private f h;
    private f i;
    private f j;
    private float m;
    private float n;
    private float o;
    private com.censivn.C3DEngine.b.g.b.b p;
    private m q;

    public e() {
        super(2, 32, 32);
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        if (k == null) {
            Bitmap a = x.a(R.drawable.dock_operation_border);
            k = com.censivn.C3DEngine.a.g().a(a, false);
            a.recycle();
            Bitmap a2 = x.a(R.drawable.dock_operation_border_point);
            l = com.censivn.C3DEngine.a.g().a(a2, false);
            a2.recycle();
        }
        this.m = com.censivn.C3DEngine.b.b.a.b * 158.0f;
        this.n = com.censivn.C3DEngine.b.b.a.b * 158.0f;
        this.a = this.m;
        textures().addElement(k);
        this.q = new m(28.0f * com.censivn.C3DEngine.b.b.a.b, 21.0f * com.censivn.C3DEngine.b.b.a.b, false);
        this.q.textures().addElement(l);
        this.q.alpha(0.0f);
        addChild(this.q);
        this.g = new f(this, 0.0f, 0.0f, 0.0f);
        this.h = new f(this, -this.m, 0.0f, 0.0f);
        this.i = new f(this, 0.0f, this.n, 0.0f);
        this.j = new f(this, -this.m, this.n, 0.0f);
        this.c = new f(this, this.m, 0.0f, 0.0f);
        this.d = new f(this, 0.0f, 0.0f, 0.0f);
        this.e = new f(this, this.m, this.n, 0.0f);
        this.f = new f(this, 0.0f, this.n, 0.0f);
        com.censivn.C3DEngine.b.f.a.b a3 = a(0);
        uvs().set(a3.a, 1.0f, 1.0f);
        uvs().set(a3.b, 0.0f, 1.0f);
        uvs().set(a3.c, 1.0f, 0.0f);
        uvs().set(a3.d, 0.0f, 0.0f);
        com.censivn.C3DEngine.b.f.a.b a4 = a(1);
        uvs().set(a4.b, 1.0f, 1.0f);
        uvs().set(a4.a, 0.0f, 1.0f);
        uvs().set(a4.d, 1.0f, 0.0f);
        uvs().set(a4.c, 0.0f, 0.0f);
        this.p = new com.censivn.C3DEngine.b.g.b.b();
        e();
    }

    public void c() {
        this.q.position().y = 0.0f;
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.h.e.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar.h(this.a + (20.0f * com.censivn.C3DEngine.b.b.a.b));
        xVar.a(255);
        w.a(this.q);
        w.a(this.q, 300, xVar);
    }

    public void d() {
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.h.e.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar.a(0);
        w.a(this.q);
        w.a(this.q, 300, xVar);
    }

    public void a(float f) {
        a(f, (Runnable) null);
    }

    public void a(final float f, final Runnable runnable) {
        final float f2 = this.o;
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.h.e.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f3) {
                e.this.b(f2 + ((f - f2) * f3));
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        w.a(this.p);
        w.a(this.p, 300, xVar);
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
            float cos = (float) (this.a / Math.cos((f2 * 3.141592653589793d) / 180.0d));
            float tan = (float) (Math.tan((f2 * 3.141592653589793d) / 180.0d) * this.a);
            this.h.rotateDegressZ(-f2);
            this.i.x = 0.0f;
            this.i.y = cos;
            this.j.rotateDegressZ(-f2);
            this.c.rotateDegressZ(f2);
            this.f.x = 0.0f;
            this.f.y = cos;
            this.e.rotateDegressZ(f2);
            com.censivn.C3DEngine.b.f.a.b a = a(0);
            uvs().set(a.a, 1.0f, 1.0f);
            uvs().set(a.b, 0.0f, 1.0f);
            uvs().set(a.c, (this.a - tan) / this.a, 0.0f);
            uvs().set(a.d, 0.0f, 0.0f);
            com.censivn.C3DEngine.b.f.a.b a2 = a(1);
            uvs().set(a2.a, 0.0f, 1.0f);
            uvs().set(a2.b, 1.0f, 1.0f);
            uvs().set(a2.c, 0.0f, 0.0f);
            uvs().set(a2.d, (this.a - tan) / this.a, 0.0f);
        } else {
            float f3 = f / 2.0f;
            float tan2 = (float) (Math.tan((f3 * 3.141592653589793d) / 180.0d) * this.a);
            float cos2 = (float) (this.a / Math.cos((f3 * 3.141592653589793d) / 180.0d));
            this.h.rotateDegressZ((-90.0f) + f3);
            f fVar = this.i;
            this.j.x = 0.0f;
            fVar.x = 0.0f;
            f fVar2 = this.i;
            this.j.y = cos2;
            fVar2.y = cos2;
            this.c.rotateDegressZ(90.0f - f3);
            f fVar3 = this.e;
            this.f.x = 0.0f;
            fVar3.x = 0.0f;
            f fVar4 = this.e;
            this.f.y = cos2;
            fVar4.y = cos2;
            com.censivn.C3DEngine.b.f.a.b a3 = a(0);
            uvs().set(a3.a, 1.0f, 1.0f);
            uvs().set(a3.b, 0.0f, 1.0f);
            uvs().set(a3.c, 0.0f, (this.a - tan2) / this.a);
            uvs().set(a3.d, 0.0f, (this.a - tan2) / this.a);
            a3.m.x = 1.0f;
            com.censivn.C3DEngine.b.f.a.b a4 = a(1);
            uvs().set(a4.a, 0.0f, 1.0f);
            uvs().set(a4.b, 1.0f, 1.0f);
            uvs().set(a4.c, 0.0f, (this.a - tan2) / this.a);
            uvs().set(a4.d, 0.0f, (this.a - tan2) / this.a);
            a4.m.x = -1.0f;
        }
        e();
    }

    private void e() {
        com.censivn.C3DEngine.b.f.a.b a = a(0);
        points().setPX(a.a, this.g);
        points().setPX(a.b, this.h);
        points().setPX(a.c, this.i);
        points().setPX(a.d, this.j);
        com.censivn.C3DEngine.b.f.a.b a2 = a(1);
        points().setPX(a2.a, this.c);
        points().setPX(a2.b, this.d);
        points().setPX(a2.c, this.e);
        points().setPX(a2.d, this.f);
        updatePointsVBO();
        updateUvsVBO();
    }
}
