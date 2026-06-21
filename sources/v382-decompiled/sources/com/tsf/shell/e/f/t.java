package com.tsf.shell.e.f;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class t {
    private g C;
    private DynamicTextureElement D;
    final /* synthetic */ r a;
    private boolean e;
    private float f;
    private float g;
    private float l;
    private float t;
    private g u;
    private Number3d v;
    private int y;
    private float m = 32.0f;
    private float n = -50.0f;
    private boolean r = false;
    private boolean s = false;
    private boolean x = false;
    private int z = 1;
    private int A = 2;
    private int B = 0;
    private boolean G = false;
    private com.tsf.shell.e.e.e.d F = com.tsf.shell.manager.a.p.d();
    private com.censivn.C3DEngine.b.f.m E = new com.censivn.C3DEngine.b.f.m(com.tsf.shell.manager.g.a.g, com.tsf.shell.manager.g.a.g, false);
    private float b = 0.017453292f;
    private float h = com.censivn.C3DEngine.b.b.a.D;
    private float o = (-this.h) - (200.0f * com.censivn.C3DEngine.b.b.a.b);
    private float p = (com.censivn.C3DEngine.b.b.a.B + ((int) (Math.sin(this.b * this.m) * this.h))) - (100.0f * com.censivn.C3DEngine.b.b.a.b);
    private float w = (float) (this.o + (Math.cos(this.b * this.m) * this.h));
    private float q = ((float) (this.p - (Math.sin(this.b * this.m) * this.h))) - (r.b / 2);
    private float i = 360.0f / (((float) ((2.0f * this.h) * 3.141592653589793d)) / (r.a - 40));
    private float k = this.i / (r.a - 40);
    private float j = this.i * this.b;
    private com.censivn.C3DEngine.b.f.l d = new com.censivn.C3DEngine.b.f.l();
    private com.censivn.C3DEngine.b.f.l c = new com.censivn.C3DEngine.b.f.l() { // from class: com.tsf.shell.e.f.t.1
        @Override // com.censivn.C3DEngine.b.f.j
        public void onDrawStart() {
            if (!t.this.r) {
                if (t.this.s) {
                    rotation().y += (t.this.t - rotation().y) * 0.5f;
                    return;
                }
                rotation().y += (t.this.t - rotation().y) * 0.2f;
                if (rotation().y < t.this.f && t.this.t < t.this.f) {
                    t.this.t += (t.this.f - t.this.t) * 0.3f;
                } else if (rotation().y > t.this.g && t.this.t > t.this.g) {
                    t.this.t += (t.this.g - t.this.t) * 0.3f;
                }
                if (Math.abs(rotation().y - t.this.t) < 0.01d && getAnimationObjectState()) {
                    setAnimationObjectState(false);
                    rotation().y = t.this.t;
                }
                if (t.this.y != t.this.z) {
                    if (t.this.y == t.this.A) {
                        t.this.t += 2.0f;
                        if (t.this.t > t.this.g) {
                            t.this.t = t.this.g;
                            return;
                        }
                        return;
                    }
                    return;
                }
                t.this.t -= 2.0f;
                if (t.this.t < t.this.f) {
                    t.this.t = t.this.f;
                }
            }
        }
    };

    public t(r rVar) {
        this.a = rVar;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.h = com.censivn.C3DEngine.b.b.a.D;
        this.o = (-this.h) - (200.0f * com.censivn.C3DEngine.b.b.a.b);
        this.p = (com.censivn.C3DEngine.b.b.a.B + ((int) (Math.sin(this.b * this.m) * this.h))) - (100.0f * com.censivn.C3DEngine.b.b.a.b);
        this.w = (float) (this.o + (Math.cos(this.b * this.m) * this.h));
        this.q = ((float) (this.p - (Math.sin(this.b * this.m) * this.h))) - (r.b / 2);
        this.i = 360.0f / (((float) ((2.0f * this.h) * 3.141592653589793d)) / (r.a - 40));
        this.k = this.i / (r.a - 40);
        this.j = this.i * this.b;
        if (this.e) {
            com.censivn.C3DEngine.b.g.w.a(this.c);
            this.c.position().z = this.o;
            this.c.rotation().x = this.m;
            this.c.position().y = this.p;
            this.c.rotation().y = this.t;
            Iterator it = this.a.k.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar != this.C) {
                    b(gVar);
                }
            }
        }
    }

    public boolean a() {
        return this.e;
    }

    public com.censivn.C3DEngine.b.f.m b() {
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (!this.e && !this.r) {
            com.tsf.shell.manager.a.o.k();
            this.E.textures().clear();
            if (this.D != null) {
                com.censivn.C3DEngine.a.g().a(this.D);
            }
            this.D = ThemeManager.mix.page.getTextureElement(ThemeShellDescription.PAGE_ADD_BUTTON, com.tsf.shell.manager.g.a.g, com.tsf.shell.manager.g.a.g);
            this.E.textures().addElement(this.D);
            this.a.T();
            this.e = true;
            this.r = true;
            this.g = 90.0f;
            this.t = this.g - (this.a.m.r() * this.i);
            Iterator it = this.a.k.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                gVar.p();
                Number3d localToGlobal = gVar.localToGlobal(new Number3d());
                Number3d localRotationToGlobal = gVar.localRotationToGlobal(new Number3d());
                gVar.removeFromParent();
                this.c.globalToLocal(localToGlobal);
                gVar.position().setAllFrom(localToGlobal);
                gVar.rotation().setAllFrom(localRotationToGlobal);
                gVar.removeFromParent();
                this.c.addChild(gVar);
                b(gVar, 750);
            }
            k();
            this.d.removeFromParent();
            this.c.removeFromParent();
            this.a.h.addChildAt(this.d, 1);
            this.a.h.addChildAt(this.c, 1);
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.t.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    t.this.r = false;
                }
            };
            if (this.a.n < 16) {
                j();
            }
            com.censivn.C3DEngine.b.g.w.a(this.c);
            xVar.j(this.o);
            xVar.c(this.m);
            xVar.h(this.p);
            xVar.d(this.t);
            com.censivn.C3DEngine.b.g.w.a(this.c, 750, xVar);
        }
    }

    private void h() {
        this.F.removeFromParent();
        this.F.position().x = 0.0f;
        this.F.a(0.0f, com.censivn.C3DEngine.b.b.a.C + (100.0f * com.censivn.C3DEngine.b.b.a.b), true);
        this.a.h.addChild(this.F);
        this.F.b();
    }

    private void i() {
        this.F.c();
    }

    public void c() {
        com.tsf.shell.utils.w.a(3);
    }

    public void d() {
    }

    public void a(float f, float f2) {
        this.F.a(com.tsf.shell.utils.x.b(this.F.c, this.F.d, f, f2), f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.C = this.a.V();
        this.C.x();
        this.a.d(this.C);
        this.C.p();
        this.C.a(-1);
        this.C.rotation().x = this.n;
        this.C.rotation().y = 0.0f;
        this.C.rotation().z = 0.0f;
        this.C.position().x = 0.0f;
        this.C.position().z = this.w - (((0.0f - this.q) + 50.0f) / 2.0f);
        this.C.position().y = com.censivn.C3DEngine.b.b.a.C;
        this.C.a(true);
        this.C.d(false);
        this.d.addChild(this.C);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.h(0.0f);
        xVar.f(0.0f);
        xVar.l(1.0f);
        xVar.m(1.0f);
        com.censivn.C3DEngine.b.g.w.a(this.C, 500, xVar);
    }

    private void k() {
        this.f = this.g - ((this.c.numChildren() - 1) * this.i);
    }

    private void b(final g gVar, int i) {
        gVar.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.t.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                gVar.mouseEnabled(true);
            }
        };
        com.censivn.C3DEngine.b.g.w.a(gVar);
        u c = c(gVar);
        xVar.f(c.a);
        xVar.j(c.b);
        xVar.h(0.0f);
        xVar.c(0.0f);
        xVar.d(c.c);
        xVar.l(1.0f);
        xVar.m(1.0f);
        com.censivn.C3DEngine.b.g.w.a(gVar, i, xVar);
    }

    private void b(g gVar) {
        com.censivn.C3DEngine.b.g.w.a(gVar);
        u c = c(gVar);
        gVar.position().setAll(c.a, 0.0f, c.b);
        gVar.rotation().setAll(0.0f, c.c, 0.0f);
        gVar.scale().setAll(1.0f, 1.0f, 1.0f);
    }

    private u c(g gVar) {
        u uVar = new u(this);
        int r = gVar.r();
        uVar.a = (float) (Math.cos((r * (-this.j)) - 3.141592653589793d) * this.h);
        uVar.b = (float) (Math.sin((r * (-this.j)) - 3.141592653589793d) * this.h);
        uVar.c = (r * this.i) - 90.0f;
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.e && !this.r && !this.G) {
            com.tsf.shell.manager.a.o.i();
            ArrayList arrayList = (ArrayList) this.d.children().clone();
            if (this.d.numChildren() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g gVar = (g) ((com.censivn.C3DEngine.b.f.j) it.next());
                    if (gVar.r() == -1) {
                        if (gVar.q()) {
                            f(gVar);
                        } else {
                            a(gVar, 500);
                        }
                    }
                }
            }
            this.a.F.a(this.a.m);
            this.r = true;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.a.n) {
                    g gVar2 = (g) this.a.k.get(i2);
                    if (i2 > 0) {
                        if (i2 == 1) {
                            if (this.a.n != 2) {
                                gVar2.b((g) this.a.k.get(i2 + 1));
                                gVar2.a((g) this.a.k.get(this.a.n - 1));
                            } else {
                                gVar2.b((g) null);
                                gVar2.a((g) null);
                            }
                        } else if (i2 != this.a.n - 1) {
                            gVar2.b((g) this.a.k.get(i2 + 1));
                            gVar2.a((g) this.a.k.get(i2 - 1));
                        } else if (this.a.n != 3) {
                            gVar2.b((g) this.a.k.get(1));
                            gVar2.a((g) this.a.k.get(i2 - 1));
                        } else {
                            gVar2.b((g) null);
                            gVar2.a((g) this.a.k.get(i2 - 1));
                        }
                    }
                    gVar2.o();
                    Number3d localToGlobal = gVar2.localToGlobal(new Number3d());
                    Number3d localRotationToGlobal = gVar2.localRotationToGlobal(new Number3d());
                    gVar2.removeFromParent();
                    gVar2.mouseEnabled(true);
                    this.a.i.globalToLocal(localToGlobal);
                    gVar2.position().setAllFrom(localToGlobal);
                    gVar2.rotation().setAllFrom(localRotationToGlobal);
                    this.a.i.addChild(gVar2);
                    com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
                    com.censivn.C3DEngine.b.g.w.a(gVar2);
                    this.a.F.a(xVar, gVar2);
                    com.censivn.C3DEngine.b.g.w.a(gVar2, 500, xVar);
                    i = i2 + 1;
                } else {
                    com.censivn.C3DEngine.b.g.w.a(this.c, 500, new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.t.4
                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a() {
                            t.this.E.textures().clear();
                            if (t.this.D != null) {
                                com.censivn.C3DEngine.a.g().a(t.this.D);
                                t.this.D = null;
                            }
                            t.this.c.removeFromParent();
                            t.this.d.removeFromParent();
                            t.this.r = false;
                            t.this.e = false;
                            t.this.a.U();
                            String str = "";
                            Iterator it2 = t.this.a.k.iterator();
                            while (true) {
                                String str2 = str;
                                if (it2.hasNext()) {
                                    str = String.valueOf(str2) + ((g) it2.next()).t() + ",";
                                } else {
                                    com.tsf.shell.manager.b.g.i(str2.substring(0, str2.length() - 1));
                                    return;
                                }
                            }
                        }
                    });
                    this.c.position().z = 0.0f;
                    this.c.position().y = 0.0f;
                    this.c.rotation().x = 0.0f;
                    this.c.rotation().y = 0.0f;
                    this.a.m.setFocus();
                    this.a.g();
                    return;
                }
            }
        }
    }

    public void e() {
        this.s = true;
        float f = this.c.rotation().y;
        this.l = f;
        this.t = f;
        this.c.setAnimationObjectState(true);
        this.c.invalidate();
    }

    public void f() {
        this.s = false;
    }

    public void a(float f) {
        this.t += this.k * f;
    }

    public void b(float f) {
        this.t = this.l + (this.k * f);
    }

    public void a(g gVar, MotionEvent motionEvent) {
        if (gVar.t() != -1 && !gVar.q() && this.a.n > 2) {
            h();
        }
        com.tsf.shell.utils.w.a();
        this.u = gVar;
        gVar.setAnimationObjectState(true);
        Number3d localToGlobal = gVar.localToGlobal(new Number3d());
        Number3d localRotationToGlobal = gVar.localRotationToGlobal(new Number3d());
        gVar.removeFromParent();
        this.d.globalToLocal(localToGlobal);
        this.d.globalRotationToLocal(localRotationToGlobal);
        gVar.position().setAllFrom(localToGlobal);
        gVar.rotation().setAllFrom(localRotationToGlobal);
        this.d.addChild(gVar);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        com.censivn.C3DEngine.b.g.w.a(gVar);
        xVar.l(1.1f);
        xVar.m(1.1f);
        xVar.d(0.0f);
        com.censivn.C3DEngine.b.g.w.a(gVar, 250, xVar);
        if (gVar.getTag() != null && (gVar.getTag() instanceof Number3d)) {
            this.v = (Number3d) gVar.getTag();
            this.v.x = this.u.position().x;
            this.v.y = this.u.position().y;
            return;
        }
        this.v = this.u.position().m4clone();
        this.v.z = this.w;
    }

    public void b(g gVar, MotionEvent motionEvent) {
        boolean z;
        if (gVar.t() == -1 || gVar.q() || this.a.n <= 2) {
            z = false;
        } else {
            i();
            e(gVar);
            z = true;
        }
        this.y = this.B;
        gVar.setAnimationObjectState(false);
        float[] a = com.tsf.shell.utils.x.a(motionEvent);
        if (a[1] - this.q > -50.0f) {
            a(a[0], a[1], gVar, true);
            a(gVar, 250);
            if (gVar.q()) {
                gVar.a(false);
                this.a.ac();
                this.C = null;
                if (this.a.n < 16) {
                    j();
                }
            }
        } else {
            if (gVar.r() != -1) {
                gVar.setTag(this.v.m4clone());
                g(gVar);
            }
            if (gVar.Q() == 0 && z) {
                f(gVar);
                z = false;
            } else {
                com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
                com.censivn.C3DEngine.b.g.w.a(gVar);
                xVar.l(1.0f);
                xVar.m(1.0f);
                xVar.d(0.0f);
                xVar.e(0.0f);
                com.censivn.C3DEngine.b.g.w.a(gVar, 250, xVar);
            }
        }
        if (z) {
            float[] a2 = com.tsf.shell.utils.x.a(motionEvent);
            if (this.F.calTouchCollision(a2[0], a2[1])) {
                f(gVar);
            }
        }
        this.a.G.a(this.a.m);
    }

    public void a(final g gVar, MotionEvent motionEvent, final MotionEvent motionEvent2) {
        final float[] a = com.tsf.shell.utils.x.a(motionEvent2);
        this.u.position().x = this.v.x + ((motionEvent2.getX() - motionEvent.getX()) * 1.3f);
        this.u.position().y = this.v.y - (motionEvent2.getY() - motionEvent.getY());
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.f.t.5
            @Override // java.lang.Runnable
            public void run() {
                t.this.a(a[0], a[1]);
                float f = a[1] - t.this.q;
                if (f > 50.0f) {
                    t.this.u.rotation().x = t.this.m;
                    t.this.u.position().z = t.this.v.z;
                    t.this.a(a[0], a[1], gVar);
                } else if (f < -50.0f) {
                    t.this.u.rotation().x = t.this.n;
                    t.this.u.position().z = t.this.v.z - ((f + 50.0f) / 2.0f);
                } else {
                    t.this.u.rotation().x = (((f + 50.0f) / 100.0f) * (t.this.m - t.this.n)) + t.this.n;
                    t.this.u.position().z = t.this.v.z;
                    t.this.a(a[0], a[1], gVar);
                }
                if (gVar.t() != -1 && !gVar.q() && t.this.a.n > 2) {
                    float[] a2 = com.tsf.shell.utils.x.a(motionEvent2);
                    if (t.this.F.calTouchCollision(a2[0], a2[1])) {
                        t.this.d(gVar);
                    } else {
                        t.this.e(gVar);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(g gVar) {
        if (!this.x) {
            this.x = true;
            gVar.setDefaultColor(com.tsf.shell.manager.o.c.c);
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(g gVar) {
        if (this.x) {
            this.x = false;
            gVar.clearDefaultColor();
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2, g gVar) {
        if (f > (com.censivn.C3DEngine.b.b.a.D / 2) - (com.censivn.C3DEngine.b.b.a.a * 50.0f)) {
            this.y = this.z;
        } else if (f < (-r0) + (com.censivn.C3DEngine.b.b.a.a * 50.0f)) {
            this.y = this.A;
        } else {
            a(f, f2, gVar, false);
        }
    }

    private void a(float f, float f2, g gVar, boolean z) {
        g gVar2;
        this.y = this.B;
        com.censivn.C3DEngine.b.f.j hittingTarget = this.c.getHittingTarget(f, f2, true);
        if (hittingTarget != null) {
            if (hittingTarget == null) {
                float f3 = this.c.rotation().y;
                if (f3 > this.g) {
                    f3 = this.g;
                } else if (f3 < this.f) {
                    f3 = this.f;
                }
                gVar2 = (g) this.a.k.get(((int) (((this.g - f3) / (this.g - this.f)) * (this.c.numChildren() - 1))) + 1);
            } else {
                gVar2 = (g) hittingTarget.parent();
            }
            if (gVar2.t() == -1 && gVar == (gVar2 = this.a.o())) {
                gVar.a(1);
                return;
            }
            int r = gVar2.r();
            int size = r == -1 ? this.a.k.size() - 1 : r;
            int r2 = gVar.r();
            if (r2 == -1) {
                int size2 = this.a.k.size();
                for (int i = size; i < size2; i++) {
                    g gVar3 = (g) this.a.k.get(i);
                    if (gVar3.r() != -1) {
                        gVar3.a(i + 1);
                        b(gVar3, 250);
                    }
                }
                this.a.k.remove(gVar);
                this.a.k.add(size, gVar);
                gVar.a(size);
                return;
            }
            if (size > r2) {
                int i2 = r2 + 1;
                while (true) {
                    int i3 = i2;
                    if (i3 >= size + 1) {
                        this.a.k.remove(gVar);
                        this.a.k.add(size, gVar);
                        gVar.a(size);
                        return;
                    } else {
                        g gVar4 = (g) this.a.k.get(i3);
                        gVar4.a(i3 - 1);
                        b(gVar4, 250);
                        i2 = i3 + 1;
                    }
                }
            } else {
                for (int i4 = size; i4 < r2; i4++) {
                    g gVar5 = (g) this.a.k.get(i4);
                    gVar5.a(i4 + 1);
                    b(gVar5, 250);
                }
                this.a.k.remove(gVar);
                this.a.k.add(size, gVar);
                gVar.a(size);
            }
        }
    }

    private void f(final g gVar) {
        this.G = true;
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.t.6
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                t.this.a.c(gVar);
                gVar.removeFromParent();
                gVar.destroy();
                gVar.scale().setAll(1.0f, 1.0f, 1.0f);
                if (gVar.q()) {
                    gVar.a(false);
                }
                if (t.this.a.n < 16 && t.this.C == null) {
                    t.this.j();
                }
                t.this.G = false;
            }
        };
        xVar.l(0.0f);
        xVar.m(0.0f);
        xVar.n(0.0f);
        xVar.f(0.0f);
        xVar.h(com.censivn.C3DEngine.b.b.a.C);
        com.censivn.C3DEngine.b.g.w.a(gVar);
        com.censivn.C3DEngine.b.g.w.a(gVar, 500, xVar);
        this.a.k.remove(gVar);
        this.a.ac();
        if (this.a.m == gVar) {
            this.a.a((g) this.a.k.get(1), false, true);
        }
        if (this.a.r == gVar) {
            this.a.a((g) this.a.k.get(1));
        }
    }

    private void g(g gVar) {
        int r = gVar.r();
        int size = this.a.k.size();
        gVar.a(-1);
        this.a.k.remove(gVar);
        this.a.k.add(gVar);
        for (int i = r; i < size; i++) {
            g gVar2 = (g) this.a.k.get(i);
            if (gVar2.r() != -1) {
                gVar2.a(i);
                b(gVar2, 250);
            }
        }
        k();
    }

    public void a(g gVar, int i) {
        Number3d localToGlobal = gVar.localToGlobal(new Number3d());
        Number3d localRotationToGlobal = gVar.localRotationToGlobal(new Number3d());
        gVar.removeFromParent();
        this.c.globalToLocal(localToGlobal);
        this.c.globalRotationToLocal(localRotationToGlobal);
        localRotationToGlobal.z = 0.0f;
        localRotationToGlobal.x = 0.0f;
        localRotationToGlobal.y = 0.0f;
        gVar.position().setAllFrom(localToGlobal);
        gVar.rotation().x = 0.0f;
        gVar.rotation().y = -this.c.rotation().y;
        gVar.rotation().z = 0.0f;
        gVar.setTag(null);
        if (gVar.r() == -1) {
            gVar.a(this.c.numChildren());
        }
        this.c.addChild(gVar);
        k();
        this.a.k.remove(gVar);
        this.a.k.add(gVar.r(), gVar);
        b(gVar, i);
    }

    public void a(g gVar) {
        if (!gVar.q()) {
            if (this.a.r == gVar) {
                this.a.a(gVar, false, true);
                return;
            } else {
                this.a.a(gVar);
                return;
            }
        }
        a(0.0f, this.q, gVar, true);
        a(gVar, 500);
        gVar.a(false);
        this.a.ac();
        this.C = null;
        if (this.a.n < 16) {
            j();
        }
    }
}
