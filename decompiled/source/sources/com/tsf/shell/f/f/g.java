package com.tsf.shell.f.f;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VPage;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.f.f.j;
import com.tsf.shell.f.i.a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class g extends com.censivn.C3DEngine.b.f.j implements e.a, a.InterfaceC0113a {
    public static com.tsf.shell.f.a.a.a f;
    public static com.censivn.C3DEngine.b.f.i i;
    private static com.censivn.C3DEngine.b.f.k r;
    private int A;
    private j.a I;
    private com.tsf.shell.f.d.e.a.b J;
    private com.censivn.C3DEngine.b.g.b.a L;
    protected g a;
    protected com.tsf.shell.e.d b;
    protected com.tsf.shell.f.e.f.b c;
    protected com.tsf.shell.f.i.a h;
    protected l k;
    private com.censivn.C3DEngine.b.f.k q;
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
    private ArrayList<a> C = new ArrayList<>();
    private VPage u = new VPage();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

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

    public j.a a(com.tsf.shell.f.d.e.a.b bVar, com.censivn.C3DEngine.b.f.i iVar, boolean z) {
        this.H = true;
        mouseEnabled(false);
        i = iVar;
        this.J = bVar;
        j.a a2 = a(z, false);
        this.I = a2;
        if (z) {
            com.tsf.shell.manager.a.f.g().visible(false);
        }
        return a2;
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

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        if (this.K) {
            this.K = false;
        } else if (visible()) {
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
                    com.censivn.C3DEngine.b.f.i childAt = getChildAt(i2);
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

    public j.a j() {
        return a(false, false);
    }

    public j.a a(boolean z, boolean z2) {
        j.a c = j.c(this);
        if (c.a != this || z2) {
            c.a = this;
            Number3d clone = position().m4clone();
            h.a.visible(false);
            position().setAll(0.0f, 0.0f, 0.0f);
            com.tsf.shell.manager.a.t.b(j.c(), c.b);
            if (z) {
                com.tsf.shell.manager.a.f.a(this);
            }
            boolean visible = this.c.visible();
            this.c.visible(true);
            this.c.dispatchDraw();
            this.c.visible(Boolean.valueOf(visible));
            com.tsf.shell.manager.a.t.b();
            position().setAllFrom(clone);
            h.a.visible(true);
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

    public com.tsf.shell.f.i.a m() {
        return this.h;
    }

    public com.censivn.C3DEngine.b.f.i n() {
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
            com.censivn.C3DEngine.b.f.k b = com.tsf.shell.manager.a.h.i().b();
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

    public com.tsf.shell.e.d s() {
        return this.b;
    }

    public void b(int i2) {
        this.z = i2;
    }

    public int t() {
        return this.z;
    }

    public void a(Number3d number3d) {
        if (h.c() && this.k.a(this, h.a)) {
            h.a.position().setAllFrom(number3d);
            h.a.dispatchDraw();
            h.a.position().reset();
        }
    }

    public void u() {
        if (h.c() && this.k.a(this, h.a)) {
            h.a.dispatchDraw();
        }
    }

    private void aj() {
        this.c = new com.tsf.shell.f.e.f.b() { // from class: com.tsf.shell.f.f.g.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (g.this.g != 0.0f && g.this.k != null) {
                    g.this.u();
                }
            }

            @Override // com.tsf.shell.f.e.f.b
            public void a(com.tsf.shell.f.i.c cVar) {
                if (cVar instanceof com.tsf.shell.f.i.b.d.b) {
                    com.tsf.shell.manager.r.c.g.a(cVar, null, null);
                } else {
                    com.tsf.shell.manager.r.c.g.a(cVar, (Runnable) null);
                }
            }

            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public void addChild(com.censivn.C3DEngine.b.f.i iVar) {
                super.addChild(iVar);
                g.this.h.a(iVar);
            }
        };
        this.h = new com.tsf.shell.f.i.a(this, this) { // from class: com.tsf.shell.f.f.g.2
            @Override // com.tsf.shell.f.i.a
            public void b(com.tsf.shell.f.i.b bVar) {
                g.this.N();
            }
        };
        addChild(this.c);
    }

    @Override // com.tsf.shell.f.i.a.InterfaceC0113a
    public ArrayList<com.censivn.C3DEngine.b.f.i> b() {
        return this.c.children();
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
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
        if (this instanceof k) {
            ((k) this).aj();
        }
    }

    public void v() {
        Iterator it = ((ArrayList) this.c.children().clone()).iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.i iVar = (com.censivn.C3DEngine.b.f.i) it.next();
            if (iVar instanceof com.tsf.shell.f.i.b) {
                com.tsf.shell.manager.a.i.a((com.tsf.shell.f.i.b) iVar);
            }
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.s.b(n.a, n.b);
        r.position().y = ((-n.b) / 2) + (80.0f * com.censivn.C3DEngine.b.b.a.c);
        this.q.a(com.censivn.C3DEngine.b.b.a.F);
        this.q.b(com.censivn.C3DEngine.b.b.a.G);
        this.t.b(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
        Iterator<com.censivn.C3DEngine.b.f.i> it = this.c.children().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.i next = it.next();
            if (next instanceof com.tsf.shell.f.i.b) {
                com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) next;
                bVar.a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
                bVar.ac();
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
            this.s = new com.censivn.C3DEngine.b.f.b.a(n.a, n.b, new com.censivn.C3DEngine.b.f.b.b(50, 78, 50, 78, 128.0f, 128.0f));
            this.t = new com.censivn.C3DEngine.b.f.b.a(n.a, n.b, new com.censivn.C3DEngine.b.f.b.b(4.0f, 124.0f, 4.0f, 124.0f, 128.0f, 128.0f));
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
                r = new com.censivn.C3DEngine.b.f.k(com.tsf.shell.manager.g.a.f, com.tsf.shell.manager.g.a.f, false);
                r.textures().addElement(p);
                r.position().y = ((-n.b) / 2) + (80.0f * com.censivn.C3DEngine.b.b.a.c);
            }
            this.s.textures().addElement(m);
            this.q = new com.censivn.C3DEngine.b.f.k(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, 1, 1, false);
            this.q.uvs().set(0, 1.0f, 0.0f);
            this.q.uvs().set(1, 0.0f, 0.0f);
            this.q.uvs().set(2, 1.0f, 1.0f);
            this.q.uvs().set(3, 0.0f, 1.0f);
            addChild(this.q);
        }
        if (this instanceof k) {
            ((k) this).a();
        }
    }

    public static void y() {
        if (f != null) {
            com.tsf.shell.manager.a.t.a(f);
        }
        if (n.a > n.b) {
            d = (int) (0.4f * com.censivn.C3DEngine.b.b.a.F);
            e = (n.b * d) / n.a;
        } else {
            e = (int) (0.4f * com.censivn.C3DEngine.b.b.a.G);
            d = (n.a * e) / n.b;
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

    @Override // com.censivn.C3DEngine.b.f.i
    public void killFocus() {
        F();
        com.tsf.shell.manager.a.h.r().b(this, this.L);
    }

    @Override // com.censivn.C3DEngine.b.f.i
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
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(this.q);
            com.censivn.C3DEngine.b.g.c.a(this.q, 500, dVar);
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
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(0.28f);
            dVar.m(0.28f);
            com.censivn.C3DEngine.b.g.c.a(this.q);
            com.censivn.C3DEngine.b.g.c.a(this.q, 500, dVar);
            return;
        }
        this.q.scale().x = 0.28f;
        this.q.scale().y = 0.28f;
    }

    public com.censivn.C3DEngine.b.f.i J() {
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
            } else {
                this.q.visible(true);
            }
        } else if (this.l != null && !this.q.visible()) {
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

    public void a(com.censivn.C3DEngine.b.f.i iVar) {
        if (iVar instanceof com.tsf.shell.f.i.b) {
            com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) iVar;
            bVar.a(m());
            if (bVar.K() != null) {
                bVar.K().screen = this.z;
                bVar.K().updateContainer(null, -1);
            }
        }
        this.c.addChild(iVar);
        N();
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar, int i2) {
        if (iVar instanceof com.tsf.shell.f.i.b) {
            com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) iVar;
            bVar.a(m());
            if (bVar.K() != null) {
                bVar.K().screen = this.z;
            }
        }
        this.c.addChildAt(iVar, i2);
        N();
    }

    public void b(com.censivn.C3DEngine.b.f.i iVar) {
        if (this.c.children().contains(iVar)) {
            this.c.removeChild(iVar);
            if (iVar instanceof com.tsf.shell.f.i.b) {
                ((com.tsf.shell.f.i.b) iVar).B();
            }
            N();
        }
    }

    public boolean c(com.censivn.C3DEngine.b.f.i iVar) {
        return this.c.children().contains(iVar);
    }

    public int Q() {
        int i2 = 0;
        Iterator<com.censivn.C3DEngine.b.f.i> it = this.c.children().iterator();
        while (true) {
            int i3 = i2;
            if (it.hasNext()) {
                i2 = it.next() instanceof com.tsf.shell.f.i.b ? i3 + 1 : i3;
            } else {
                return i3;
            }
        }
    }

    public ArrayList<com.censivn.C3DEngine.b.f.i> R() {
        return this.c.children();
    }

    public int d(com.censivn.C3DEngine.b.f.i iVar) {
        return this.c.getChildIndexOf(iVar);
    }

    public com.censivn.C3DEngine.b.f.j S() {
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
        return (com.tsf.shell.manager.a.v.a.a.h().a() && this.j) ? false : true;
    }

    public void Z() {
        this.j = true;
        if (com.tsf.shell.manager.a.v.a.a.h().a() || t() == -1) {
            ab();
        }
        if (this.G) {
            e();
        }
        if (this.b != null) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.f.g.3
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
        if (com.tsf.shell.manager.a.v.a.a.h().a() || t() == -1) {
            ac();
        }
        this.g = 0.0f;
        if (this.b != null) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.f.g.4
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
            Iterator<a> it = this.C.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void ac() {
        if (this.E) {
            this.E = false;
            mouseEnabled(true);
            Iterator<a> it = this.C.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public boolean ad() {
        return this.E;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (com.tsf.shell.manager.a.v.c.b.a()) {
            Iterator<com.censivn.C3DEngine.b.f.i> it = R().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.i next = it.next();
                if (next instanceof com.tsf.shell.f.i.b) {
                    com.tsf.shell.manager.a.v.c.b.a((com.tsf.shell.f.i.b) next);
                }
            }
        }
    }

    public void ae() {
        Iterator<com.censivn.C3DEngine.b.f.i> it = R().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.i next = it.next();
            if (next instanceof com.tsf.shell.f.i.b) {
                ((com.tsf.shell.f.i.b) next).y();
            }
        }
    }

    private void a(float f2, l lVar) {
        if (this.k != lVar) {
            this.k = lVar;
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
            }
        } else if (parent() != null) {
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

    public void a(l lVar) {
        a(this, 0.0f, true, true, lVar);
    }

    public void a(g gVar, float f2, boolean z, boolean z2, l lVar) {
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
            a(f2, lVar);
        } else {
            f(false);
        }
        if (z && this.x != null && this.x != gVar) {
            this.x.a(gVar, f2 + 1.0f, true, false, lVar);
        }
        if (z2 && this.y != null && this.y != gVar) {
            this.y.a(gVar, f2 - 1.0f, false, true, lVar);
        }
    }

    public void a(Runnable runnable, float f2) {
        a(com.tsf.shell.manager.a.v.d.b(), runnable, f2);
    }

    public void a(com.tsf.shell.f.d.e.a.b bVar, Runnable runnable, float f2) {
        if (this instanceof com.tsf.shell.f.f.a.h) {
            if (bVar.a()) {
                bVar.a(this, f2, ((com.tsf.shell.f.f.a.h) this).ap().children(), runnable);
                return;
            } else {
                ((com.tsf.shell.f.f.a.h) this).c(runnable, true);
                return;
            }
        }
        bVar.a(this, f2, this.c.children(), runnable);
    }

    public void a(Runnable runnable, boolean z) {
        a(com.tsf.shell.manager.a.v.d.b(), runnable, z);
    }

    public void a(com.tsf.shell.f.d.e.a.b bVar, final Runnable runnable, boolean z) {
        Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.f.g.5
            @Override // java.lang.Runnable
            public void run() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        if (this instanceof com.tsf.shell.f.f.a.h) {
            if (bVar.a()) {
                bVar.a(this, ((com.tsf.shell.f.f.a.h) this).ap().children(), runnable2, z);
                return;
            } else {
                ((com.tsf.shell.f.f.a.h) this).b(runnable2, z);
                return;
            }
        }
        bVar.a(this, this.c.children(), runnable2, z);
    }
}
