package com.tsf.shell.workspace3D.j.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.tsf.shell.R;
import com.tsf.shell.aq;
import com.tsf.shell.at;
import com.tsf.shell.bd;
import com.tsf.shell.bj;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements at, bj {
    private static float j;
    private v a;
    private com.censivn.C3DEngine.e.b.a b;
    private com.censivn.C3DEngine.e.b.a c;
    private TextureElement d;
    private ArrayList e;
    private ArrayList f;
    private float g;
    private float h;
    private com.tsf.shell.workspace3D.h.j i;
    private TextureElement k;
    private com.censivn.C3DEngine.e.b l;
    private TextureElement m;
    private com.censivn.C3DEngine.e.b n;
    private com.tsf.shell.workspace3D.h.d.a q;
    private com.tsf.shell.workspace3D.h.b.g r;
    private Runnable t;
    private boolean v;
    private boolean s = false;
    private boolean u = false;
    private boolean w = false;
    private float p = com.censivn.C3DEngine.a.b * 60.0f;
    private Paint o = new Paint();

    public a() {
        this.o.setColor(-1118482);
        this.o.setTypeface(com.tsf.shell.workspace3D.i.a.a);
        this.o.setTextSize(24.0f);
        this.o.setAntiAlias(true);
        this.o.setTextAlign(Paint.Align.LEFT);
        j = 100.0f * com.censivn.C3DEngine.a.b;
        this.i = bf.j().f();
        this.e = new ArrayList();
        this.a = new b(this);
        this.f = this.i.a;
        float size = this.f.size();
        float f = j * (size - 1.0f);
        this.b = new f(this, j + f + (20.0f * com.censivn.C3DEngine.a.b), com.censivn.C3DEngine.a.b * 126.0f, new com.censivn.C3DEngine.e.b.b(60.0f, 66.0f, 60.0f, 66.0f, 126.0f, 126.0f));
        this.b.a(1.2f, 1.4f, 1.0f);
        this.a.d(this.b);
        this.b.a(new com.censivn.C3DEngine.b.l(this.b));
        this.b.L().y = this.p;
        this.l = new com.censivn.C3DEngine.e.b(0.0f, 0.0f, (byte) 0);
        this.b.d(this.l);
        this.l.L().y = 80.0f * com.censivn.C3DEngine.a.b;
        float f2 = (-f) / 2.0f;
        for (int i = 0; i < size; i++) {
            com.tsf.shell.workspace3D.h.b.g gVar = (com.tsf.shell.workspace3D.h.b.g) this.f.get(i);
            k kVar = new k(gVar.a(), gVar == com.tsf.shell.workspace3D.h.j.b);
            gVar.a(kVar);
            kVar.a((com.censivn.C3DEngine.b.l) new c(this, this.b, gVar));
            kVar.L().x = (j * i) + f2;
            kVar.L().y = this.p;
            this.a.d(kVar);
        }
        float size2 = com.tsf.shell.workspace3D.h.d.i.a.size();
        float f3 = j * (size2 - 1.0f);
        float f4 = (-f3) / 2.0f;
        this.c = new e(this, j + f3 + (20.0f * com.censivn.C3DEngine.a.b), com.censivn.C3DEngine.a.b * 126.0f, new com.censivn.C3DEngine.e.b.b(60.0f, 66.0f, 60.0f, 66.0f, 126.0f, 126.0f));
        this.c.a(1.2f, 1.4f, 1.0f);
        this.a.d(this.c);
        this.c.a(new com.censivn.C3DEngine.b.l(this.b));
        this.c.L().y = -this.p;
        this.n = new com.censivn.C3DEngine.e.b(0.0f, 0.0f, (byte) 0);
        this.c.d(this.n);
        this.n.L().y = (-80.0f) * com.censivn.C3DEngine.a.b;
        for (int i2 = 0; i2 < size2; i2++) {
            com.tsf.shell.workspace3D.h.d.a aVar = (com.tsf.shell.workspace3D.h.d.a) com.tsf.shell.workspace3D.h.d.i.a.get(i2);
            k kVar2 = new k(R.drawable.setting_desktop_effect_desktop_icon, com.tsf.shell.workspace3D.h.d.i.b == aVar);
            kVar2.a((com.censivn.C3DEngine.b.l) new d(this, this.b, kVar2));
            kVar2.L().x = (j * i2) + f4;
            kVar2.L().y = -this.p;
            kVar2.a = aVar;
            this.e.add(kVar2);
            this.a.d(kVar2);
        }
    }

    static /* synthetic */ void a(a aVar, k kVar) {
        Iterator it = aVar.f.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.h.b.g gVar = (com.tsf.shell.workspace3D.h.b.g) it.next();
            if (gVar.b() != kVar) {
                gVar.b().h(false);
            }
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            c();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    private TextureElement a(String str) {
        Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.setting_desktop_effect_lable_bg);
        float width = a.getWidth();
        float height = a.getHeight();
        Canvas canvas = new Canvas(a);
        Bitmap a2 = com.tsf.shell.setting.a.v.a(str, (int) width, (int) height, this.o, true, true, 0);
        canvas.drawBitmap(a2, 0.0f, 0.0f, (Paint) null);
        a2.recycle();
        TextureElement a3 = com.censivn.C3DEngine.a.f().a(a, false);
        a.recycle();
        return a3;
    }

    static /* synthetic */ void h(a aVar) {
        if (aVar.d != null) {
            aVar.b.z().d();
            com.censivn.C3DEngine.a.f().a(aVar.d);
            aVar.d = null;
        }
        if (aVar.k != null) {
            aVar.l.z().d();
            com.censivn.C3DEngine.a.f().a(aVar.k);
            aVar.k = null;
        }
        if (aVar.m != null) {
            aVar.n.z().d();
            com.censivn.C3DEngine.a.f().a(aVar.m);
            aVar.m = null;
        }
    }

    public final void a() {
        if (!this.s) {
            aq.a(this);
            bd.a(this);
            this.s = true;
            this.a.e(true);
            this.a.L().x = 0.0f;
            this.a.L().y = com.censivn.C3DEngine.a.h - (com.censivn.C3DEngine.a.b * 200.0f);
            if (this.d == null) {
                Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.setting_desktop_effect_bg);
                this.d = com.censivn.C3DEngine.a.f().a(a, false);
                a.recycle();
                this.b.z().d();
                this.b.z().c(this.d);
                this.c.z().d();
                this.c.z().c(this.d);
            }
            if (this.k == null) {
                this.k = a(com.censivn.C3DEngine.h.a.c(R.string.effect_scroll));
                this.l.z().c(this.k);
                this.l.a_(this.k.width * com.censivn.C3DEngine.a.b);
                this.l.h(this.k.height * com.censivn.C3DEngine.a.b);
            }
            if (this.m == null) {
                this.m = a(com.censivn.C3DEngine.h.a.c(R.string.effect_icon));
                this.n.z().c(this.m);
                this.n.a_(this.m.width * com.censivn.C3DEngine.a.b);
                this.n.h(this.m.height * com.censivn.C3DEngine.a.b);
            }
            bf.m().a(this.a);
            this.g = 0.0f;
            this.h = com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.b * 200.0f);
            this.a.a_(true);
            v vVar = this.a;
            v.u();
            this.b.az();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((k) it.next()).i();
            }
        }
    }

    public final void c() {
        if (this.s) {
            this.s = false;
            aq.b(this);
            bd.b(this);
            this.a.a_(false);
            this.a.e(false);
            g gVar = new g(this);
            gVar.h(com.censivn.C3DEngine.a.h - (200.0f * com.censivn.C3DEngine.a.b));
            s.a(this.a);
            s.a(this.a, ThemeShellDescription.PAGE_PREVIEW_SELECT, gVar);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((k) it.next()).j();
            }
        }
        if (this.u) {
            this.u = false;
            com.censivn.C3DEngine.a.a().f(this.t);
        }
        if (this.w) {
            this.w = false;
        }
    }

    public final void d() {
        boolean z;
        this.w = false;
        if (this.s) {
            if (this.r != null) {
                r0 = bf.j().f().a(this.r);
                this.r = null;
            }
            if (this.q != null) {
                z = com.tsf.shell.workspace3D.h.d.i.a(this.q) ? true : r0;
                this.q = null;
            } else {
                z = r0;
            }
            if (z) {
                com.censivn.C3DEngine.a.a().c(new h(this));
                return;
            }
            return;
        }
        this.r = null;
        this.q = null;
    }

    public final void e() {
        this.w = true;
        com.tsf.shell.workspace3D.h.a k = bf.j().k();
        if (k.aG() != -1) {
            if (k.bh() != null) {
                this.v = true;
            } else {
                this.v = false;
            }
            bf.j().o().b = 0.07f;
            bf.j().o().e();
            if (this.v) {
                bf.j().o().k();
            } else {
                bf.j().o().l();
            }
            if (this.t == null) {
                this.t = new i(this);
            }
            this.u = true;
            com.censivn.C3DEngine.a.a().b(this.t, 500L);
        }
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        this.g = 0.0f;
        this.h = com.censivn.C3DEngine.a.h + (200.0f * com.censivn.C3DEngine.a.b);
        this.a.a_(true);
        v vVar = this.a;
        v.u();
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
