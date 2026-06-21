package com.tsf.shell.e.i.b.d;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.Home;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l {
    private static int b = 800;
    private b c;
    private com.censivn.C3DEngine.b.f.l d;
    private com.tsf.shell.e.i.c e;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float r;
    private com.tsf.shell.e.i.b.e.b u;
    private boolean n = false;
    private boolean o = false;
    private boolean p = true;
    private boolean s = false;
    private boolean t = false;
    boolean a = false;
    private ArrayList g = new ArrayList();
    private com.censivn.C3DEngine.b.f.l f = new com.censivn.C3DEngine.b.f.l() { // from class: com.tsf.shell.e.i.b.d.l.1
        @Override // com.censivn.C3DEngine.b.f.j
        public void onDrawEnd() {
            l.this.i();
        }
    };
    private com.tsf.shell.e.b.a q = new com.tsf.shell.e.b.a() { // from class: com.tsf.shell.e.i.b.d.l.2
        @Override // com.tsf.shell.e.b.a, com.censivn.C3DEngine.b.c.d
        public void a(int i, KeyEvent keyEvent) {
            if (i == 4 && l.this.t) {
                l.this.b();
            }
        }

        @Override // com.tsf.shell.e.b.a, com.censivn.C3DEngine.b.c.d
        public void b(int i, KeyEvent keyEvent) {
        }
    };

    public l(b bVar) {
        this.c = bVar;
        this.e = this.c;
    }

    public void a() {
        this.f.destroy();
        this.g.clear();
        this.g = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f.removeFromParent();
        this.n = false;
        this.o = false;
        this.p = true;
        this.g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.e.K().container != -1 || (this.e.K() instanceof LauncherDrawerFolder3DInfo)) {
            Number3d.TEMPNUMBER3D.reset();
            this.e.localToGlobal(Number3d.TEMPNUMBER3D);
            this.u = com.tsf.shell.e.d.a(this.e);
            ((com.censivn.C3DEngine.b.f.l) this.e.parent()).replaceChild(this.e, this.u);
            this.e.position().setAllFrom(Number3d.TEMPNUMBER3D);
        }
        this.r = this.e.rotation().z;
        if (this.r != 0.0f) {
            this.s = true;
            x xVar = new x();
            xVar.e(0.0f);
            xVar.l(1.0f);
            xVar.m(1.0f);
            w.a(this.e);
            w.a(this.e, 250, xVar);
        } else {
            if (this.e.scale().x != 1.0f) {
                x xVar2 = new x();
                xVar2.l(1.0f);
                xVar2.m(1.0f);
                w.a(this.e);
                w.a(this.e, 250, xVar2);
            }
            this.s = false;
        }
        b.m.b(this.c);
        com.tsf.shell.g.a().a("LineViewer");
        this.c.o(false);
        this.e.mouseSkip(true);
        this.e.removeFromParent();
        com.censivn.C3DEngine.b.f.l a = com.tsf.shell.manager.a.j.a(this.q);
        com.tsf.shell.manager.a.j.c();
        a.addChild(this.e);
        com.tsf.shell.manager.a.b.b(Home.b());
    }

    public void a(final boolean z) {
        this.t = false;
        Iterator it = this.d.children().iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.e.i.b.e.b) ((com.censivn.C3DEngine.b.f.j) it.next())).mouseEnabled(false);
        }
        if (this.u != null) {
            this.r = this.u.rotation().z;
        }
        if (!z) {
            this.e.rotation().z = this.r;
        }
        this.c.a(new Runnable() { // from class: com.tsf.shell.e.i.b.d.l.3
            @Override // java.lang.Runnable
            public void run() {
                final boolean z2 = z;
                com.tsf.shell.manager.a.j.b(new Runnable() { // from class: com.tsf.shell.e.i.b.d.l.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!l.this.s) {
                            if (l.this.u != null && l.this.e.scale().x != l.this.u.scale().x) {
                                x xVar = new x();
                                xVar.l(l.this.u.scale().x);
                                xVar.m(l.this.u.scale().y);
                                w.a(l.this.e);
                                w.a(l.this.e, 250, xVar);
                            }
                        } else if (!z2) {
                            if (l.this.u != null) {
                                l.this.e.scale().setAllFrom(l.this.u.scale());
                            }
                        } else {
                            x xVar2 = new x();
                            if (l.this.u != null) {
                                xVar2.l(l.this.u.scale().x);
                                xVar2.m(l.this.u.scale().y);
                            }
                            xVar2.e(l.this.r);
                            w.a(l.this.e);
                            w.a(l.this.e, 250, xVar2);
                        }
                        com.tsf.shell.e.f.g n = com.tsf.shell.manager.a.h.n();
                        l.this.e.removeFromParent();
                        if (l.this.u != null) {
                            ((com.censivn.C3DEngine.b.f.l) l.this.u.parent()).replaceChild(l.this.u, l.this.e);
                            com.tsf.shell.e.d.a(l.this.u);
                            l.this.u = null;
                        } else {
                            n.a(l.this.e);
                        }
                        l.this.e.mouseSkip(false);
                        l.this.c.o(true);
                        com.tsf.shell.manager.a.j.b();
                        com.tsf.shell.g.a().b("LineViewer");
                        l.this.i = 0;
                        l.this.f();
                        com.tsf.shell.manager.a.b.c(Home.b());
                    }
                });
            }
        }, z);
        this.a = false;
    }

    public void b() {
        a(true);
    }

    private void h() {
        this.f.setAnimationObjectState(false);
        this.t = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.o && this.i > 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.h) {
                    com.censivn.C3DEngine.b.f.j childAt = this.d.getChildAt(i2);
                    float[] fArr = (float[]) this.g.get((int) ((((i2 / this.h) * 0.9f) + 0.1f) * this.i));
                    childAt.position().x = (float) (r3.x + ((fArr[0] - childAt.position().x) * 0.2d));
                    childAt.position().y = (float) (r3.y + ((fArr[1] - childAt.position().y) * 0.2d));
                    childAt.rotation().z = (float) (r3.z + ((0.0f - childAt.rotation().z) * 0.5d));
                    if (childAt.scale().x < 1.0f) {
                        childAt.scale().x = (float) (r3.x + ((1.0f - childAt.scale().x) * 0.1d));
                        childAt.scale().y = childAt.scale().x;
                        if (1.0f - childAt.scale().x < 0.05d) {
                            childAt.scale().x = 1.0f;
                            childAt.scale().y = 1.0f;
                        }
                    }
                    if (this.n && i2 == 0 && com.tsf.shell.utils.x.b(childAt.position().x, childAt.position().y, fArr[0], fArr[1]) < 5.0f) {
                        this.o = true;
                        h();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public boolean c() {
        return this.a;
    }

    public void a(MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (this.p) {
            this.a = false;
            this.p = false;
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.i.b.d.l.4
                @Override // java.lang.Runnable
                public void run() {
                    l.this.g();
                    l.this.n = false;
                    l.this.f.setAnimationObjectState(true);
                    l.this.e.addChild(l.this.f);
                    l.this.g.clear();
                    l.this.d = l.this.c.aF();
                    l.this.h = l.this.d.numChildren();
                    for (int i = 0; i < l.this.h; i++) {
                        l.this.g.add(new float[]{0.0f, 0.0f});
                    }
                    l.this.i = l.this.h;
                    Number3d localToGlobal = l.this.d.localToGlobal(new Number3d(0.0f, 0.0f, 0.0f));
                    l.this.j = (int) (com.censivn.C3DEngine.b.b.a.H + localToGlobal.x);
                    l.this.k = (int) (com.censivn.C3DEngine.b.b.a.I - localToGlobal.y);
                    l.this.l = motionEvent2.getX();
                    l.this.m = motionEvent2.getY();
                    Iterator it = l.this.d.children().iterator();
                    while (it.hasNext()) {
                        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) ((com.censivn.C3DEngine.b.f.j) it.next());
                        bVar.alpha(255.0f);
                        bVar.visible(true);
                        bVar.g(1.0f);
                        bVar.mouseEnabled(true);
                    }
                    l.this.a = true;
                }
            });
        }
        if (this.i <= b && this.a) {
            float x = motionEvent2.getX();
            float y = motionEvent2.getY();
            int b2 = (int) (com.tsf.shell.utils.x.b(x, y, this.l, this.m) / 5.0f);
            if (b2 >= 1) {
                float f = (x - this.l) / b2;
                float f2 = (y - this.m) / b2;
                for (int i = 0; i < b2; i++) {
                    this.g.add(new float[]{(((i + 1) * f) + this.l) - this.j, this.k - (((i + 1) * f2) + this.m)});
                    this.i++;
                }
                this.l = x;
                this.m = y;
            }
        }
    }

    public void d() {
        this.p = true;
        this.n = true;
    }

    public void e() {
    }
}
