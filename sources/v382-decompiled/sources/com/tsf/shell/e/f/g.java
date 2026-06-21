package com.tsf.shell.e.f;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VPage;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends com.censivn.C3DEngine.b.f.l implements com.censivn.C3DEngine.b.c.k, com.tsf.shell.e.i.b {
    public static com.tsf.shell.e.a.a.a f;
    public static com.censivn.C3DEngine.b.f.j i;
    private static com.censivn.C3DEngine.b.f.m r;
    private int A;
    private m I;
    private com.tsf.shell.e.d.e.a.b J;
    private com.censivn.C3DEngine.b.g.b.a L;
    protected g a;
    protected com.tsf.shell.d.e b;
    protected com.tsf.shell.e.e.f.e c;
    protected com.tsf.shell.e.i.a h;
    protected p k;
    private com.censivn.C3DEngine.b.f.m q;
    private com.censivn.C3DEngine.b.f.b.a s;
    private com.censivn.C3DEngine.b.f.b.a t;
    private com.censivn.C3DEngine.b.d.a v;
    private com.censivn.C3DEngine.b.d.a w;
    private g x;
    private g y;
    private int z;
    private static TextureElement m = null;
    private static TextureElement n = null;
    private static TextureElement o = null;
    private static TextureElement p = null;
    public static int d = 0;
    public static int e = 0;
    private TextureElement l = null;
    public float g = 0.0f;
    private boolean B = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private boolean K = false;
    private float M = 255.0f;
    private boolean N = true;
    boolean j = true;
    private boolean O = false;
    private boolean P = false;
    private ArrayList C = new ArrayList();
    private VPage u = new VPage();

    public g() {
        this.u.vTarget = this;
        this.L = new com.censivn.C3DEngine.b.g.b.b();
        this.a = this;
        com.tsf.shell.manager.a.b.a(this);
    }

    public boolean c() {
        return this.G;
    }

    public void d() {
        com.tsf.shell.manager.a.h.d.a(this);
    }

    public void e() {
        com.tsf.shell.manager.a.h.d.d();
    }

    public void f() {
        this.G = true;
    }

    public void g() {
        this.G = false;
    }

    public m a(com.tsf.shell.e.d.e.a.b bVar, com.censivn.C3DEngine.b.f.j jVar, boolean z) {
        this.H = true;
        mouseEnabled(false);
        i = jVar;
        this.J = bVar;
        m a = a(z, false);
        this.I = a;
        if (z) {
            com.tsf.shell.manager.a.f.g().visible(false);
        }
        return a;
    }

    public void h() {
        this.H = false;
        mouseEnabled(true);
        com.tsf.shell.manager.a.f.g().visible(true);
        if (this.I != null) {
            this.I.a = null;
        }
        this.J = null;
    }

    private void a() {
        this.J.a(this);
    }

    public void i() {
        this.K = true;
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void dispatchDraw() {
        if (this.K) {
            this.K = false;
            return;
        }
        if (visible()) {
            if (this.H) {
                MatrixStack.glPushMatrix();
                draw();
                MatrixStack.glColor(alpha(), getDefaultColor());
                i.dispatchDraw();
                MatrixStack.glPopMatrix();
                return;
            }
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int numChildren = numChildren();
                for (int i2 = 0; i2 < numChildren; i2++) {
                    com.censivn.C3DEngine.b.f.j childAt = getChildAt(i2);
                    onDrawChildStart(childAt);
                    childAt.dispatchDraw();
                    onDrawChildEnd(childAt);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    public m j() {
        return a(false, false);
    }

    public m a(boolean z, boolean z2) {
        m c = l.c(this);
        if (c.a != this || z2) {
            c.a = this;
            Number3d clone = position().m4clone();
            i.a.visible(false);
            position().setAll(0.0f, 0.0f, 0.0f);
            com.tsf.shell.manager.a.t.b(l.c(), c.b);
            if (z) {
                com.tsf.shell.manager.a.f.a(this);
            }
            boolean visible = this.c.visible();
            this.c.visible(true);
            this.c.dispatchDraw();
            this.c.visible(Boolean.valueOf(visible));
            com.tsf.shell.manager.a.t.b();
            position().setAllFrom(clone);
            i.a.visible(true);
        }
        return c;
    }

    public void k() {
        com.tsf.shell.manager.a.b.a(this);
    }

    public VPage l() {
        return this.u;
    }

    public void a(com.censivn.C3DEngine.b.d.a aVar) {
        this.v = aVar;
    }

    public void b(com.censivn.C3DEngine.b.d.a aVar) {
        this.w = aVar;
    }

    public com.tsf.shell.e.i.a m() {
        return this.h;
    }

    public com.censivn.C3DEngine.b.f.j n() {
        return this.s;
    }

    public void o() {
        this.s.setMouseEventListener(this.v);
    }

    public void p() {
        this.s.setMouseEventListener(this.w);
    }

    public void a(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.f.m b = com.tsf.shell.manager.a.h.i().b();
            b.removeFromParent();
            addChild(b);
        } else {
            com.tsf.shell.manager.a.h.i().b().removeFromParent();
        }
        this.B = z;
    }

    public boolean q() {
        return this.B;
    }

    public void a(int i2) {
        this.A = i2;
    }

    public int r() {
        return this.A;
    }

    public com.tsf.shell.d.e s() {
        return this.b;
    }

    public void b(int i2) {
        this.z = i2;
    }

    public int t() {
        return this.z;
    }

    public void a(Number3d number3d) {
        if (i.c() && this.k.a(this, i.a)) {
            i.a.position().setAllFrom(number3d);
            i.a.dispatchDraw();
            i.a.position().reset();
        }
    }

    public void u() {
        if (i.c() && this.k.a(this, i.a)) {
            i.a.dispatchDraw();
        }
    }

    private void aj() {
        this.c = new com.tsf.shell.e.e.f.e() { // from class: com.tsf.shell.e.f.g.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (g.this.g != 0.0f && g.this.k != null) {
                    g.this.u();
                }
            }

            @Override // com.tsf.shell.e.e.f.e
            public void a(com.tsf.shell.e.i.e eVar) {
                if (eVar instanceof com.tsf.shell.e.i.b.d.b) {
                    com.tsf.shell.manager.r.c.i.a(eVar, null, null);
                } else {
                    com.tsf.shell.manager.r.c.i.a(eVar, (Runnable) null);
                }
            }

            @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
            public void addChild(com.censivn.C3DEngine.b.f.j jVar) {
                super.addChild(jVar);
                g.this.h.a(jVar);
            }
        };
        this.h = new com.tsf.shell.e.i.a(this, this) { // from class: com.tsf.shell.e.f.g.2
            @Override // com.tsf.shell.e.i.a
            public void b(com.tsf.shell.e.i.c cVar) {
                g.this.N();
            }
        };
        addChild(this.c);
    }

    @Override // com.tsf.shell.e.i.b
    public ArrayList b() {
        return this.c.children();
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void destroy() {
        com.tsf.shell.manager.a.b.b(this);
        v();
        this.h.c();
        this.C.clear();
        if (this.l != null) {
            com.censivn.C3DEngine.a.g().a(this.l);
            this.l = null;
            this.q.textures().removeAll();
        }
        if (this instanceof o) {
            ((o) this).aj();
        }
    }

    public void v() {
        Iterator it = ((ArrayList) this.c.children().clone()).iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                com.tsf.shell.manager.a.i.a((com.tsf.shell.e.i.c) jVar);
            }
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.s.b(r.a, r.b);
        r.position().y = ((-r.b) / 2) + (80.0f * com.censivn.C3DEngine.b.b.a.c);
        this.q.a(com.censivn.C3DEngine.b.b.a.F);
        this.q.b(com.censivn.C3DEngine.b.b.a.G);
        this.t.b(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
        Iterator it = this.c.children().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) jVar;
                cVar.a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
                cVar.ac();
            }
        }
        if (this.H) {
            a();
        }
    }

    public static void w() {
        ThemeDescription theme = ThemeManager.mix.page.getTheme();
        Bitmap bitmap = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_BACKGROUND);
        o = com.censivn.C3DEngine.a.g().a(o, bitmap, true);
        bitmap.recycle();
        Bitmap bitmap2 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_UNSELECT);
        m = com.censivn.C3DEngine.a.g().a(m, bitmap2, true);
        bitmap2.recycle();
        Bitmap bitmap3 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_SELECT);
        n = com.censivn.C3DEngine.a.g().a(n, bitmap3, true);
        bitmap3.recycle();
        Bitmap bitmap4 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_HOMEPAGE_MARK, com.tsf.shell.manager.g.a.f, com.tsf.shell.manager.g.a.f);
        p = com.censivn.C3DEngine.a.g().a(p, bitmap4, true);
        bitmap4.recycle();
    }

    public void x() {
        if (!this.F) {
            this.F = true;
            aj();
            this.s = new com.censivn.C3DEngine.b.f.b.a(r.a, r.b, new com.censivn.C3DEngine.b.f.b.b(50, 78, 50, 78, 128.0f, 128.0f));
            this.t = new com.censivn.C3DEngine.b.f.b.a(r.a, r.b, new com.censivn.C3DEngine.b.f.b.b(4.0f, 124.0f, 4.0f, 124.0f, 128.0f, 128.0f));
            this.t.b(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
            this.t.doubleSidedEnabled(true);
            this.t.position().z = (-200.0f) * com.censivn.C3DEngine.b.b.a.b;
            ThemeDescription theme = ThemeManager.mix.page.getTheme();
            if (o == null) {
                Bitmap bitmap = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_BACKGROUND);
                o = com.censivn.C3DEngine.a.g().a(bitmap, true);
                bitmap.recycle();
            }
            this.t.textures().addElement(o);
            if (m == null) {
                Bitmap bitmap2 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_UNSELECT);
                m = com.censivn.C3DEngine.a.g().a(bitmap2, true);
                bitmap2.recycle();
            }
            if (n == null) {
                Bitmap bitmap3 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_SELECT);
                n = com.censivn.C3DEngine.a.g().a(bitmap3, true);
                bitmap3.recycle();
            }
            if (p == null) {
                Bitmap bitmap4 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_HOMEPAGE_MARK, com.tsf.shell.manager.g.a.f, com.tsf.shell.manager.g.a.f);
                p = com.censivn.C3DEngine.a.g().a(bitmap4, true);
                bitmap4.recycle();
            }
            if (r == null) {
                r = new com.censivn.C3DEngine.b.f.m(com.tsf.shell.manager.g.a.f, com.tsf.shell.manager.g.a.f, false);
                r.textures().addElement(p);
                r.position().y = ((-r.b) / 2) + (80.0f * com.censivn.C3DEngine.b.b.a.c);
            }
            this.s.textures().addElement(m);
            this.q = new com.censivn.C3DEngine.b.f.m(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, 1, 1, false);
            this.q.uvs().set(0, 1.0f, 0.0f);
            this.q.uvs().set(1, 0.0f, 0.0f);
            this.q.uvs().set(2, 1.0f, 1.0f);
            this.q.uvs().set(3, 0.0f, 1.0f);
            addChild(this.q);
        }
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public static void y() {
        if (f != null) {
            com.tsf.shell.manager.a.t.a(f);
        }
        if (r.a > r.b) {
            d = (int) (0.4f * com.censivn.C3DEngine.b.b.a.F);
            e = (r.b * d) / r.a;
        } else {
            e = (int) (0.4f * com.censivn.C3DEngine.b.b.a.G);
            d = (r.a * e) / r.b;
        }
        f = com.tsf.shell.manager.a.t.a(d, e);
    }

    public void b(boolean z) {
        if (visible()) {
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            if (z) {
                this.t.dispatchDraw();
                this.q.dispatchDraw();
            } else {
                this.q.dispatchDraw();
                this.t.dispatchDraw();
            }
            MatrixStack.glPopMatrix();
        }
    }

    public void z() {
    }

    public void A() {
        this.M = this.t.alpha();
    }

    public float B() {
        return this.M;
    }

    public void a(float f2) {
        this.t.alpha(f2);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void killFocus() {
        F();
        com.tsf.shell.manager.a.h.r().b(this, this.L);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void setFocus() {
        E();
        com.tsf.shell.manager.a.h.r().a(this, this.L);
    }

    public void C() {
        r.removeFromParent();
        addChild(r);
    }

    public void D() {
        r.removeFromParent();
    }

    public void E() {
        this.s.textures().clear();
        this.s.textures().addElement(n);
        setZOrderOnTop();
    }

    public void F() {
        this.s.textures().clear();
        this.s.textures().addElement(m);
    }

    public void c(boolean z) {
        this.s.removeFromParent();
        if (z) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.l(1.0f);
            xVar.m(1.0f);
            com.censivn.C3DEngine.b.g.w.a(this.q);
            com.censivn.C3DEngine.b.g.w.a(this.q, 500, xVar);
            return;
        }
        this.q.scale().x = 1.0f;
        this.q.scale().y = 1.0f;
    }

    public void G() {
        c(true);
    }

    public void H() {
        this.s.removeFromParent();
    }

    public void I() {
        if (this.s.parent() == null) {
            addChildAt(this.s, 0);
        }
    }

    public void d(boolean z) {
        I();
        this.q.scale().setAll(1.0f, 1.0f, 1.0f);
        L();
        if (z) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.l(0.28f);
            xVar.m(0.28f);
            com.censivn.C3DEngine.b.g.w.a(this.q);
            com.censivn.C3DEngine.b.g.w.a(this.q, 500, xVar);
            return;
        }
        this.q.scale().x = 0.28f;
        this.q.scale().y = 0.28f;
    }

    public com.censivn.C3DEngine.b.f.j J() {
        return this.q;
    }

    public void e(boolean z) {
        this.q.doubleSidedEnabled(z);
    }

    public void K() {
        this.N = true;
        this.c.visible(false);
        ab();
        if (this.l == null) {
            this.q.visible(false);
        } else {
            this.q.visible(true);
        }
    }

    public void L() {
        if (!this.N) {
            this.N = true;
            this.c.visible(false);
            ab();
            P();
            if (this.l == null) {
                this.q.visible(false);
                return;
            } else {
                this.q.visible(true);
                return;
            }
        }
        if (this.l != null && !this.q.visible()) {
            this.q.visible(true);
        }
    }

    public void M() {
        if (this.N) {
            this.N = false;
            ac();
            this.q.visible(false);
            this.c.visible(true);
        }
    }

    public void N() {
        this.D = true;
    }

    public void O() {
        if (this.D) {
            P();
        }
    }

    public void P() {
        if (Q() == 0 && t() != -1) {
            if (this.l != null) {
                com.censivn.C3DEngine.a.g().a(this.l);
                this.l = null;
                this.q.textures().clear();
            }
            this.D = false;
            return;
        }
        Number3d clone = position().m4clone();
        position().setAll(0.0f, 0.0f, 0.0f);
        if (this.l == null || this.l.width != d || this.l.height != e) {
            if (this.l != null) {
                com.censivn.C3DEngine.a.g().a(this.l);
                this.l = null;
                this.q.textures().clear();
            }
            this.l = com.censivn.C3DEngine.a.g().a(d, e, false);
            this.q.textures().addElement(this.l);
        }
        com.tsf.shell.manager.a.t.b(f, this.l);
        GLES20.glViewport(0, 0, d, e);
        boolean visible = this.c.visible();
        this.c.visible(true);
        this.c.drawQuietly();
        this.c.visible(Boolean.valueOf(visible));
        com.tsf.shell.manager.a.t.b();
        GLES20.glViewport(0, 0, com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
        position().setAllFrom(clone);
        this.D = false;
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar) {
        if (jVar instanceof com.tsf.shell.e.i.c) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) jVar;
            cVar.a(m());
            if (cVar.K() != null) {
                cVar.K().screen = this.z;
                cVar.K().updateContainer(null, -1);
            }
        }
        this.c.addChild(jVar);
        N();
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar, int i2) {
        if (jVar instanceof com.tsf.shell.e.i.c) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) jVar;
            cVar.a(m());
            if (cVar.K() != null) {
                cVar.K().screen = this.z;
            }
        }
        this.c.addChildAt(jVar, i2);
        N();
    }

    public void b(com.censivn.C3DEngine.b.f.j jVar) {
        if (this.c.children().contains(jVar)) {
            this.c.removeChild(jVar);
            if (jVar instanceof com.tsf.shell.e.i.c) {
                ((com.tsf.shell.e.i.c) jVar).B();
            }
            N();
        }
    }

    public boolean c(com.censivn.C3DEngine.b.f.j jVar) {
        return this.c.children().contains(jVar);
    }

    public int Q() {
        Iterator it = this.c.children().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((com.censivn.C3DEngine.b.f.j) it.next()) instanceof com.tsf.shell.e.i.c) {
                i2++;
            }
        }
        return i2;
    }

    public ArrayList R() {
        return this.c.children();
    }

    public int d(com.censivn.C3DEngine.b.f.j jVar) {
        return this.c.getChildIndexOf(jVar);
    }

    public com.censivn.C3DEngine.b.f.l S() {
        return this.c;
    }

    public void T() {
        this.O = false;
        if (!this.O && !this.P && this.j) {
            aa();
        }
    }

    public void U() {
        this.O = true;
        if (!this.j) {
            Z();
        }
    }

    public void V() {
        this.P = true;
        if (!this.j) {
            Z();
        }
    }

    public void W() {
        this.P = false;
        if (!this.O && !this.P && this.j) {
            aa();
        }
    }

    public boolean X() {
        return true;
    }

    public boolean Y() {
        return (((p) com.tsf.shell.manager.a.v.a.a.h()).a() && this.j) ? false : true;
    }

    public void Z() {
        this.j = true;
        if (((p) com.tsf.shell.manager.a.v.a.a.h()).a() || t() == -1) {
            ab();
        }
        if (this.G) {
            e();
        }
        if (this.b != null) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.f.g.3
                @Override // java.lang.Runnable
                public void run() {
                    if (g.this.j) {
                        g.this.b.a();
                    } else {
                        g.this.b.b();
                    }
                }
            });
        }
    }

    public void aa() {
        this.j = false;
        if (((p) com.tsf.shell.manager.a.v.a.a.h()).a() || t() == -1) {
            ac();
        }
        this.g = 0.0f;
        if (this.b != null) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.f.g.4
                @Override // java.lang.Runnable
                public void run() {
                    if (g.this.j) {
                        g.this.b.a();
                    } else {
                        g.this.b.b();
                    }
                }
            });
        }
    }

    public void ab() {
        if (!this.E) {
            this.E = true;
            mouseEnabled(false);
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a();
            }
        }
    }

    public void ac() {
        if (this.E) {
            this.E = false;
            mouseEnabled(true);
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                ((h) it.next()).b();
            }
        }
    }

    public boolean ad() {
        return this.E;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (com.tsf.shell.manager.a.v.c.b.a()) {
            Iterator it = R().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
                if (jVar instanceof com.tsf.shell.e.i.c) {
                    com.tsf.shell.manager.a.v.c.b.a((com.tsf.shell.e.i.c) jVar);
                }
            }
        }
    }

    public void ae() {
        Iterator it = R().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                ((com.tsf.shell.e.i.c) jVar).y();
            }
        }
    }

    private void a(float f2, p pVar) {
        if (this.k != pVar) {
            this.k = pVar;
            ai();
        }
        this.k.a(this, f2);
    }

    public void af() {
        if (this.k != null) {
            this.k.b(this, this.g);
        }
    }

    public void a(g gVar) {
        this.y = gVar;
    }

    public g ag() {
        return this.y;
    }

    public void b(g gVar) {
        this.x = gVar;
    }

    public g ah() {
        return this.x;
    }

    public void f(boolean z) {
        if (z) {
            if (parent() == null) {
                com.tsf.shell.manager.a.h.u().addChild(this);
                M();
                this.s.removeFromParent();
                return;
            }
            return;
        }
        if (parent() != null) {
            ae();
            removeFromParent();
            L();
            I();
            ai();
        }
    }

    public void ai() {
        Number3d scale = scale();
        scale().y = 1.0f;
        scale.x = 1.0f;
        rotation().x = 0.0f;
        rotation().y = 0.0f;
        rotation().z = 0.0f;
        position().z = 0.0f;
        position().y = 0.0f;
        position().x = 0.0f;
    }

    public void a(p pVar) {
        a(this, 0.0f, true, true, pVar);
    }

    public void a(g gVar, float f2, boolean z, boolean z2, p pVar) {
        if (this.g * f2 < 0.0f) {
            if (f2 < 0.0f) {
                if (this.y != null && this.y != gVar) {
                    this.y.f(false);
                }
            } else if (this.x != null && this.x != gVar) {
                this.x.f(false);
            }
        }
        this.g = f2;
        if (f2 < 1.0f && f2 > -1.0f) {
            f(true);
            a(f2, pVar);
        } else {
            f(false);
        }
        if (z && this.x != null && this.x != gVar) {
            this.x.a(gVar, f2 + 1.0f, true, false, pVar);
        }
        if (z2 && this.y != null && this.y != gVar) {
            this.y.a(gVar, f2 - 1.0f, false, true, pVar);
        }
    }

    public void a(Runnable runnable, float f2) {
        a(com.tsf.shell.manager.a.v.d.b(), runnable, f2);
    }

    public void a(com.tsf.shell.e.d.e.a.b bVar, Runnable runnable, float f2) {
        if (this instanceof com.tsf.shell.e.f.a.m) {
            if (bVar.a()) {
                bVar.a(this, f2, ((com.tsf.shell.e.f.a.m) this).ap().children(), runnable);
                return;
            } else {
                ((com.tsf.shell.e.f.a.m) this).c(runnable, true);
                return;
            }
        }
        bVar.a(this, f2, this.c.children(), runnable);
    }

    public void a(Runnable runnable, boolean z) {
        a(com.tsf.shell.manager.a.v.d.b(), runnable, z);
    }

    public void a(com.tsf.shell.e.d.e.a.b bVar, final Runnable runnable, boolean z) {
        Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.e.f.g.5
            @Override // java.lang.Runnable
            public void run() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        if (this instanceof com.tsf.shell.e.f.a.m) {
            if (bVar.a()) {
                bVar.a(this, ((com.tsf.shell.e.f.a.m) this).ap().children(), runnable2, z);
                return;
            } else {
                ((com.tsf.shell.e.f.a.m) this).b(runnable2, z);
                return;
            }
        }
        bVar.a(this, this.c.children(), runnable2, z);
    }
}
