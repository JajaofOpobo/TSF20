package com.tsf.shell.manager.j;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.h;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.f.n;
import com.censivn.C3DEngine.b.f.o;
import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.Home;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class b extends l {
    public static int c;
    public static int d;
    public static float j;
    public static float k;
    public static float l;
    public static float m;
    public com.tsf.shell.e.e.i.b a;
    private a n;
    private d o;
    private m p;
    private h q;
    private h r;
    private n s;
    private n t;
    private o u = new o();
    public static final int b = com.censivn.C3DEngine.b.b.a.b(820.0f);
    public static int e = com.censivn.C3DEngine.b.b.a.b(100.0f);
    public static int f = com.censivn.C3DEngine.b.b.a.b(60.0f);
    public static final int g = com.censivn.C3DEngine.b.b.a.b(400.0f);
    public static final int h = com.censivn.C3DEngine.b.b.a.b(125.0f);
    public static final int i = com.censivn.C3DEngine.b.b.a.b(23.0f);

    public b() {
        this.u.d(45);
        this.u.c(R.string.text_rate_message);
        this.u.e(-10066330);
        this.u.a(true);
        this.u.a(1);
        this.u.b(0);
        this.u.f(b - e);
        this.u.b();
        d = (int) this.u.minY();
        c = ((g + f) - d) + f + h + i + h;
        this.o = new d(b, c, com.censivn.C3DEngine.b.b.a.c, new com.censivn.C3DEngine.b.f.b.b(19.0f, 119.0f, 1.0f, 101.0f, 138.0f, 160.0f), R.drawable.rate_window_shadow);
        this.o.c(b, c);
        this.p = new m(b, c, false);
        this.p.setDefaultColor(new Color4(-2236963));
        addChild(this.p);
        this.q = new h() { // from class: com.tsf.shell.manager.j.b.1
            @Override // com.censivn.C3DEngine.b.f.h, com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                super.onDrawStart();
                position().y = ((b.c - b.g) / 2.0f) + b.this.p.position().y;
            }
        };
        this.q.a(R.drawable.rate_window_blue_background);
        this.q.a(b, g);
        this.n = new a();
        this.n.position().y = -com.censivn.C3DEngine.b.b.a.a(120.0f);
        this.q.addChild(this.n);
        m = ((c / 2.0f) - g) - f;
        addChild(this.u);
        this.s = new n(b, h, -32768, -3841536) { // from class: com.tsf.shell.manager.j.b.2
            @Override // com.censivn.C3DEngine.b.f.n
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.j.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.utils.l.a(Home.b(), com.censivn.C3DEngine.a.b());
                    }
                });
            }
        };
        this.s.b(45);
        this.s.a(R.string.text_rate_first_rate);
        addChild(this.s);
        this.t = new n(b, h, -16735271, -16748909) { // from class: com.tsf.shell.manager.j.b.3
            @Override // com.censivn.C3DEngine.b.f.n
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.j.b.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.utils.o.a(Home.b());
                    }
                });
            }

            @Override // com.censivn.C3DEngine.b.f.n
            public void b() {
                b.this.n.a();
            }

            @Override // com.censivn.C3DEngine.b.f.n
            public void c() {
                b.this.n.b();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                float f2 = (b.this.t.position().y - (b.h / 2.0f)) + b.this.p.position().y;
                float f3 = b.this.p.points().getAsNumber3dPX(0).y;
                float f4 = ((f2 - f3) * 0.25f) + f3;
                b.this.p.points().setYPX(0, f4);
                b.this.p.points().setYPX(1, f4);
                b.this.p.updatePointsVBO();
            }
        };
        this.t.b(45);
        this.t.a(R.string.text_rate_dislike);
        addChild(this.t);
        k = ((-c) / 2.0f) + (h / 2.0f);
        j = k + h + i;
        this.a = new com.tsf.shell.e.e.i.b();
        this.a.position().y = com.censivn.C3DEngine.b.b.a.a(50.0f);
        this.q.addChild(this.a);
        this.r = new h();
        this.r.position().x = (b / 2.0f) - com.censivn.C3DEngine.b.b.a.a(40.0f);
        l = (c / 2.0f) - com.censivn.C3DEngine.b.b.a.a(40.0f);
        this.r.a(R.drawable.rate_window_close);
        this.r.a(com.censivn.C3DEngine.b.b.a.a(32.0f), com.censivn.C3DEngine.b.b.a.a(32.0f));
        this.r.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.r) { // from class: com.tsf.shell.manager.j.b.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.a.D.b();
            }
        });
        this.r.calAABB(4.0f, 4.0f, 1.0f);
        addChild(this.q);
        addChild(this.r);
    }

    private void f() {
        float f2 = (this.t.position().y - (h / 2.0f)) + this.p.position().y;
        this.p.points().setYPX(0, f2);
        this.p.points().setYPX(1, f2);
        this.p.updatePointsVBO();
    }

    public void a() {
        this.a.b();
        a(this.p, 0.0f, 750, 0, com.censivn.C3DEngine.b.g.a.n, new Runnable() { // from class: com.tsf.shell.manager.j.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.a.c();
            }
        });
        a(this.r, l, 750, 0, com.censivn.C3DEngine.b.g.a.n, null);
        a(this.u, m, 750, 100, com.censivn.C3DEngine.b.g.a.n, null);
        a(this.s, j, 750, VEasing.Back.easeIn, com.censivn.C3DEngine.b.g.a.n, null);
        a(this.t, k, 750, 300, com.censivn.C3DEngine.b.g.a.n, null);
        f();
    }

    private void a(j jVar, float f2, int i2, int i3, v vVar, Runnable runnable) {
        jVar.position().y = (com.censivn.C3DEngine.b.b.a.C - c) - f2;
        x xVar = new x();
        xVar.a(runnable);
        xVar.h(f2);
        xVar.a(vVar);
        xVar.b(i3);
        w.a(jVar);
        w.a(jVar, i2, xVar);
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
        this.a.a();
        this.r.a();
        this.u.a();
        this.s.d();
        this.t.d();
        this.q.a();
        this.n.c();
    }

    public void e() {
    }
}
