package com.tsf.shell.workspace3D.e.a;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.tsf.shell.aq;
import com.tsf.shell.at;
import com.tsf.shell.theme.inside.ThemeDockDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.workspace3D.e.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements at, com.tsf.shell.workspace3D.h.f {
    private static float a;
    private static float b;
    private static float c;
    private static float d;
    private com.censivn.C3DEngine.e.b e;
    private TextureElement f;
    private TextureElement g;
    private v h;
    private v i;
    private h j;
    private h k;
    private ArrayList l;
    private ThemeDockDescription m;
    private boolean n;
    private boolean o = false;
    private TextureElement p;
    private com.censivn.C3DEngine.e.a.a q;

    public a(v vVar, com.censivn.C3DEngine.e.b bVar, TextureElement textureElement, TextureElement textureElement2) {
        this.e = bVar;
        this.f = textureElement;
        this.g = textureElement2;
        a = 120.0f * com.censivn.C3DEngine.a.b;
        b = 74.0f * com.censivn.C3DEngine.a.b;
        c = 20.0f * com.censivn.C3DEngine.a.b;
        d = (a - (b / 2.0f)) - (c * 2.0f);
        this.h = vVar;
        this.i = new b(this);
        this.i.a(new l(this.i));
        this.i.f(true);
        this.l = new ArrayList();
        this.m = ThemeManager.mix.dock.getTheme();
        Bitmap bitmap = this.m.getBitmap(ThemeDockDescription.DOCK_MENU_POINT);
        this.p = com.censivn.C3DEngine.a.f().a(this.p, bitmap);
        bitmap.recycle();
        this.q = new com.censivn.C3DEngine.e.a.a(10, this.p.width, this.p.width);
        for (int i = 0; i < 10; i++) {
            com.censivn.C3DEngine.e.a.c a2 = this.q.a(i);
            a2.a(this.p.width * com.censivn.C3DEngine.a.b, this.p.height * com.censivn.C3DEngine.a.b);
            a2.e();
            a2.a((Boolean) false);
        }
        this.q.z().c(this.p);
        this.i.d(this.q);
        e();
    }

    public final void a() {
        this.m = ThemeManager.mix.dock.getTheme();
        this.p = com.censivn.C3DEngine.a.f().a(this.p, this.m.getBitmap(ThemeDockDescription.DOCK_MENU_POINT));
        this.q = new com.censivn.C3DEngine.e.a.a(10, this.p.width, this.p.width);
        for (int i = 0; i < 10; i++) {
            com.censivn.C3DEngine.e.a.c a2 = this.q.a(i);
            a2.a(this.p.width * com.censivn.C3DEngine.a.b, this.p.height * com.censivn.C3DEngine.a.b);
            a2.e();
            a2.a((Boolean) false);
        }
    }

    public final void a(h hVar) {
        if (this.n || this.o) {
            this.k = hVar;
        } else {
            this.j = hVar;
        }
    }

    private void e() {
        this.e.z().d();
        this.e.z().c(this.f);
    }

    public final void b() {
        com.censivn.C3DEngine.e.b bVar;
        if (!this.n) {
            this.j.a();
            this.e.z().d();
            this.e.z().c(this.g);
            aq.a(this);
            this.n = true;
            for (int i = 0; i < this.j.a.size() + 2; i++) {
                com.censivn.C3DEngine.e.a.c a2 = this.q.a(i);
                a2.o.setAll(0.0f, 0.0f, 1.0f);
                a2.a((Boolean) true);
                com.censivn.C3DEngine.g.c.a.a aVar = new com.censivn.C3DEngine.g.c.a.a(a2, (i / 3) + 1, (float) ((Math.random() * 100.0d) + 20.0d));
                aVar.j(1.0f);
                aVar.k(1.0f);
                if (i < 3) {
                    p.p.a(aVar, d + (i * c));
                } else {
                    p.p.a(aVar, a + (b / 2.0f) + ((i - 3) * b));
                }
                aVar.b(i % 2 == 0);
                aVar.a(false);
                s.a(a2);
                s.a(a2, (i * 100) + 250, aVar);
            }
            for (int i2 = 0; i2 < this.j.a.size(); i2++) {
                g gVar = (g) this.j.a.get(i2);
                if (this.l.isEmpty()) {
                    bVar = new com.censivn.C3DEngine.e.b(0.0f, 0.0f);
                    bVar.a((l) new f(this, this.i, bVar));
                } else {
                    bVar = (com.censivn.C3DEngine.e.b) this.l.remove(0);
                }
                bVar.a(gVar);
                gVar.d = bVar;
                a(gVar, gVar.c);
                bVar.L().setAll(0.0f, 0.0f, 0.0f);
                bVar.N().setAll(0.0f, 0.0f, 1.0f);
                com.censivn.C3DEngine.g.c.a.a aVar2 = new com.censivn.C3DEngine.g.c.a.a(bVar, (i2 / 3) + 1, (float) ((Math.random() * 100.0d) + 20.0d));
                aVar2.j(1.0f);
                aVar2.k(1.0f);
                p.p.a(aVar2, (b * i2) + a);
                aVar2.b(i2 % 2 == 0);
                aVar2.a(false);
                this.i.d(bVar);
                s.a(bVar);
                s.a(bVar, (i2 * 100) + 250, aVar2);
            }
            this.i.az();
            this.h.d(this.i);
        }
    }

    public final void c() {
        com.censivn.C3DEngine.g.c.a.a eVar;
        if (this.n && !this.o) {
            e();
            aq.b(this);
            this.o = true;
            for (int i = 0; i < this.j.a.size() + 2; i++) {
                com.censivn.C3DEngine.e.a.c a2 = this.q.a(i);
                a2.a((Boolean) true);
                c cVar = new c(this, a2, (i / 3) + 1, (float) (20.0d + (Math.random() * 100.0d)), a2);
                cVar.j(0.0f);
                cVar.k(0.0f);
                cVar.f(0.0f);
                cVar.h(0.0f);
                cVar.b(i % 2 == 0);
                cVar.a(true);
                s.a(a2);
                s.a(a2, (i * 100) + 250, cVar);
            }
            for (int i2 = 0; i2 < this.j.a.size(); i2++) {
                float f = (i2 * 20) + 10;
                g gVar = (g) this.j.a.get(i2);
                com.censivn.C3DEngine.e.b bVar = gVar.d;
                a(gVar, 0);
                if (i2 == this.j.a.size() - 1) {
                    eVar = new d(this, bVar, (i2 / 3) + 1, f, gVar);
                } else {
                    eVar = new e(this, bVar, (i2 / 3) + 1, f, gVar);
                }
                eVar.j(0.0f);
                eVar.k(0.0f);
                eVar.f(0.0f);
                eVar.h(0.0f);
                eVar.b(i2 % 2 == 0);
                s.a(bVar);
                s.a(bVar, (i2 * 100) + 250, eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g gVar, int i) {
        boolean z = true;
        gVar.d.z().e();
        Bitmap bitmap = this.m.getBitmap(gVar.a[i]);
        gVar.d.z().c(com.censivn.C3DEngine.a.f().a(bitmap, true));
        boolean z2 = false;
        if (gVar.d.n_() != bitmap.getWidth()) {
            gVar.d.a_(bitmap.getWidth() * com.censivn.C3DEngine.a.b);
            z2 = true;
        }
        if (gVar.d.o_() != bitmap.getHeight()) {
            gVar.d.h(bitmap.getHeight() * com.censivn.C3DEngine.a.b);
        } else {
            z = z2;
        }
        if (z) {
            gVar.d.a(1.2f, 1.2f, 1.2f);
        }
        bitmap.recycle();
    }

    static /* synthetic */ void a(a aVar, g gVar) {
        gVar.d.z().e();
        gVar.d.a((Object) null);
        aVar.l.add(gVar.d);
        gVar.d = null;
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

    @Override // com.tsf.shell.workspace3D.h.f
    public final void d() {
        this.i.Q();
    }
}
