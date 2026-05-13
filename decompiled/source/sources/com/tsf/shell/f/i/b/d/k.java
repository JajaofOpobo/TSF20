package com.tsf.shell.f.i.b.d;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.tsf.shell.Home;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class k {
    private static int b = 800;
    private b c;
    private com.censivn.C3DEngine.b.f.j d;
    private com.tsf.shell.f.i.b e;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float r;
    private com.tsf.shell.f.i.b.e.b u;
    private boolean n = false;
    private boolean o = false;
    private boolean p = true;
    private boolean s = false;
    private boolean t = false;
    boolean a = false;
    private ArrayList<float[]> g = new ArrayList<>();
    private com.censivn.C3DEngine.b.f.j f = new com.censivn.C3DEngine.b.f.j() { // from class: com.tsf.shell.f.i.b.d.k.1
        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawEnd() {
            k.this.i();
        }
    };
    private com.tsf.shell.f.b.a q = new com.tsf.shell.f.b.a() { // from class: com.tsf.shell.f.i.b.d.k.2
        @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
        public void a(int i, KeyEvent keyEvent) {
            if (i == 4 && k.this.t) {
                k.this.b();
            }
        }

        @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
        public void b(int i, KeyEvent keyEvent) {
        }
    };

    public k(b bVar) {
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
            this.u = com.tsf.shell.f.c.a(this.e);
            ((com.censivn.C3DEngine.b.f.j) this.e.parent()).replaceChild(this.e, this.u);
            this.e.position().setAllFrom(Number3d.TEMPNUMBER3D);
        }
        this.r = this.e.rotation().z;
        if (this.r != 0.0f) {
            this.s = true;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.e(0.0f);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(this.e);
            com.censivn.C3DEngine.b.g.c.a(this.e, 250, dVar);
        } else {
            if (this.e.scale().x != 1.0f) {
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.c.a(this.e);
                com.censivn.C3DEngine.b.g.c.a(this.e, 250, dVar2);
            }
            this.s = false;
        }
        b.m.b(this.c);
        com.tsf.shell.d.a().a("LineViewer");
        this.c.o(false);
        this.e.mouseSkip(true);
        this.e.removeFromParent();
        com.censivn.C3DEngine.b.f.j a = com.tsf.shell.manager.a.j.a(this.q);
        com.tsf.shell.manager.a.j.c();
        a.addChild(this.e);
        com.tsf.shell.manager.a.b.b(Home.b());
    }

    public void a(final boolean z) {
        this.t = false;
        Iterator<com.censivn.C3DEngine.b.f.i> it = this.d.children().iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.f.i.b.e.b) it.next()).mouseEnabled(false);
        }
        if (this.u != null) {
            this.r = this.u.rotation().z;
        }
        if (!z) {
            this.e.rotation().z = this.r;
        }
        this.c.a(new Runnable() { // from class: com.tsf.shell.f.i.b.d.k.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.a.j.b(new Runnable() { // from class: com.tsf.shell.f.i.b.d.k.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!k.this.s) {
                            if (k.this.u != null && k.this.e.scale().x != k.this.u.scale().x) {
                                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                                dVar.l(k.this.u.scale().x);
                                dVar.m(k.this.u.scale().y);
                                com.censivn.C3DEngine.b.g.c.a(k.this.e);
                                com.censivn.C3DEngine.b.g.c.a(k.this.e, 250, dVar);
                            }
                        } else if (!z) {
                            if (k.this.u != null) {
                                k.this.e.scale().setAllFrom(k.this.u.scale());
                            }
                        } else {
                            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                            if (k.this.u != null) {
                                dVar2.l(k.this.u.scale().x);
                                dVar2.m(k.this.u.scale().y);
                            }
                            dVar2.e(k.this.r);
                            com.censivn.C3DEngine.b.g.c.a(k.this.e);
                            com.censivn.C3DEngine.b.g.c.a(k.this.e, 250, dVar2);
                        }
                        com.tsf.shell.f.f.g n = com.tsf.shell.manager.a.h.n();
                        k.this.e.removeFromParent();
                        if (k.this.u != null) {
                            ((com.censivn.C3DEngine.b.f.j) k.this.u.parent()).replaceChild(k.this.u, k.this.e);
                            com.tsf.shell.f.c.a(k.this.u);
                            k.this.u = null;
                        } else {
                            n.a(k.this.e);
                        }
                        k.this.e.mouseSkip(false);
                        k.this.c.o(true);
                        com.tsf.shell.manager.a.j.b();
                        com.tsf.shell.d.a().b("LineViewer");
                        k.this.i = 0;
                        k.this.f();
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
                    com.censivn.C3DEngine.b.f.i childAt = this.d.getChildAt(i2);
                    float[] fArr = this.g.get((int) ((((i2 / this.h) * 0.9f) + 0.1f) * this.i));
                    PositionNumber3d position = childAt.position();
                    position.x = (float) (position.x + ((fArr[0] - childAt.position().x) * 0.2d));
                    PositionNumber3d position2 = childAt.position();
                    position2.y = (float) (position2.y + ((fArr[1] - childAt.position().y) * 0.2d));
                    Number3d rotation = childAt.rotation();
                    rotation.z = (float) (rotation.z + ((0.0f - childAt.rotation().z) * 0.5d));
                    if (childAt.scale().x < 1.0f) {
                        Number3d scale = childAt.scale();
                        scale.x = (float) (scale.x + ((1.0f - childAt.scale().x) * 0.1d));
                        childAt.scale().y = childAt.scale().x;
                        if (1.0f - childAt.scale().x < 0.05d) {
                            childAt.scale().x = 1.0f;
                            childAt.scale().y = 1.0f;
                        }
                    }
                    if (this.n && i2 == 0 && x.b(childAt.position().x, childAt.position().y, fArr[0], fArr[1]) < 5.0f) {
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
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.i.b.d.k.4
                @Override // java.lang.Runnable
                public void run() {
                    k.this.g();
                    k.this.n = false;
                    k.this.f.setAnimationObjectState(true);
                    k.this.e.addChild(k.this.f);
                    k.this.g.clear();
                    k.this.d = k.this.c.aF();
                    k.this.h = k.this.d.numChildren();
                    for (int i = 0; i < k.this.h; i++) {
                        k.this.g.add(new float[]{0.0f, 0.0f});
                    }
                    k.this.i = k.this.h;
                    Number3d localToGlobal = k.this.d.localToGlobal(new Number3d(0.0f, 0.0f, 0.0f));
                    k.this.j = (int) (com.censivn.C3DEngine.b.b.a.H + localToGlobal.x);
                    k.this.k = (int) (com.censivn.C3DEngine.b.b.a.I - localToGlobal.y);
                    k.this.l = motionEvent2.getX();
                    k.this.m = motionEvent2.getY();
                    Iterator<com.censivn.C3DEngine.b.f.i> it = k.this.d.children().iterator();
                    while (it.hasNext()) {
                        com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) it.next();
                        bVar.alpha(255.0f);
                        bVar.visible(true);
                        bVar.g(1.0f);
                        bVar.mouseEnabled(true);
                    }
                    k.this.a = true;
                }
            });
        }
        if (this.i <= b && this.a) {
            float x = motionEvent2.getX();
            float y = motionEvent2.getY();
            int b2 = (int) (x.b(x, y, this.l, this.m) / 5.0f);
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
