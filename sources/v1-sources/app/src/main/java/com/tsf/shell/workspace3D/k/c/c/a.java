package com.tsf.shell.workspace3D.k.c.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.b.ad;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a implements com.tsf.shell.workspace3D.g.e.e {
    private com.tsf.shell.workspace3D.k.j a;
    private r b;
    private v c;
    private v d;
    private TextureElement g;
    private TextureElement h;
    private float j;
    private com.censivn.C3DEngine.e.b k;
    private com.censivn.C3DEngine.c.a l;
    private com.censivn.C3DEngine.c.b.WavePhysicsSystem m;
    private TextureElement n;
    private int o;
    private int p;
    private boolean e = false;
    private boolean f = false;
    private boolean i = false;
    private int q = 10;

    public com.tsf.shell.workspace3D.k.j getWidget(Context context) {
        this.a = new b(this);
        com.censivn.C3DEngine.a.a().d(new c(this));
        return this.a;
    }

    static /* synthetic */ void j(a aVar) {
        aVar.d = new v();
        aVar.c = new e(aVar);
        Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.widget_airship_body);
        aVar.g = com.censivn.C3DEngine.a.f().a(a, false);
        a.recycle();
        aVar.b.z().c(aVar.g);
        aVar.b.N().setAll(7.0f, 7.0f, 7.0f);
        aVar.b.M().z = 28.0f;
        f fVar = new f(aVar);
        Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.widget_airship_propeller);
        aVar.h = com.censivn.C3DEngine.a.f().a(a2, false);
        a2.recycle();
        fVar.L().z = -210.0f;
        fVar.z().c(aVar.h);
        fVar.b(true);
        aVar.c.d(aVar.b);
        aVar.d.d(fVar);
        aVar.d.d(aVar.c);
        aVar.d.M().y = 75.0f;
        aVar.d.N().setAll(com.censivn.C3DEngine.a.b * 1.1f, com.censivn.C3DEngine.a.b * 1.1f, com.censivn.C3DEngine.a.b * 1.1f);
        aVar.a.d(aVar.d);
        aVar.d.a((com.censivn.C3DEngine.b.l) new g(aVar, aVar.d));
        aVar.d.b(com.censivn.C3DEngine.a.b * (-180.0f), com.censivn.C3DEngine.a.b * (-300.0f), 0.0f, 180.0f * com.censivn.C3DEngine.a.b, 100.0f * com.censivn.C3DEngine.a.b);
        aVar.a.b(com.censivn.C3DEngine.a.b * (-180.0f), com.censivn.C3DEngine.a.b * (-300.0f), 0.0f, 180.0f * com.censivn.C3DEngine.a.b, 100.0f * com.censivn.C3DEngine.a.b);
        aVar.o = aVar.q * (aVar.q + 1);
        aVar.p = aVar.o + aVar.q;
        aVar.k = new com.censivn.C3DEngine.e.b(250.0f, 150.0f, aVar.q, aVar.q, false);
        aVar.k.L().y = -150.0f;
        aVar.k.L().x = 30.0f;
        aVar.k.L().z = -10.0f;
        aVar.k.M().y = -90.0f;
        aVar.k.M().z = -2.5f;
        aVar.k.c((Boolean) false);
        aVar.l = new com.censivn.C3DEngine.c.a(aVar.k);
        aVar.m = new com.censivn.C3DEngine.c.b.WavePhysicsSystem(0.7f, 2.0f);
        aVar.l.a(aVar.m);
        aVar.m.b(-0.3f);
        aVar.c.d(aVar.k);
        aVar.c.a_(true);
        aVar.c.v();
        ArrayList b = aVar.m.b();
        com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar = (com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint) b.get(aVar.o);
        bVar.d = false;
        bVar.f = false;
        bVar.e = false;
        com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar2 = (com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint) b.get(aVar.p);
        bVar2.d = false;
        bVar2.f = false;
        bVar2.e = false;
        aVar.a();
    }

    @Override // com.tsf.shell.workspace3D.g.e.e
    public final void a(Bitmap bitmap) {
        this.a.be().data = com.censivn.C3DEngine.h.a.a(bitmap);
        this.a.a((Runnable) new h(this));
        com.censivn.C3DEngine.a.a().a((RenderRunnable) new i(this, bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (!this.f) {
            if (this.a.be().data == null) {
                b((Bitmap) null);
            } else {
                b(BitmapFactory.decodeByteArray(this.a.be().data, 0, this.a.be().data.length));
                this.a.be().data = null;
            }
            this.f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.widget_airship_flag);
        }
        if (this.n == null) {
            this.n = com.censivn.C3DEngine.a.f().a(bitmap, false);
            this.k.z().c(this.n);
        } else {
            com.censivn.C3DEngine.a.f();
            ad.b(this.n, bitmap);
        }
        bitmap.recycle();
    }
}
