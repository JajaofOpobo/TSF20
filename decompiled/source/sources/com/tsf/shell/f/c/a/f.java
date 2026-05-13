package com.tsf.shell.f.c.a;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.f.c.a.a.a;
import com.tsf.shell.f.f.o;
import com.tsf.shell.g;
import com.tsf.shell.utils.q;
import com.tsf.shell.utils.w;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class f implements e.a {
    public static int a;
    public static int b;
    public static float c;
    public static float d;
    public static float e;
    public static float f;
    public static float g;
    public static com.tsf.shell.f.c.a.a.a h;
    public static com.tsf.shell.f.c.a.a.a i;
    public static com.tsf.shell.f.c.a.a.a j;
    public static com.tsf.shell.f.c.a.a.a k;
    public static com.tsf.shell.f.c.a.a.a l;
    public static com.tsf.shell.f.c.a.a.a m;
    public static float o = 0.0f;
    public static float p = 0.0f;
    public static float q = 0.0f;
    private j C;
    private j D;
    private j E;
    private com.tsf.shell.f.h.e F;
    private com.tsf.shell.f.h.e G;
    private com.censivn.C3DEngine.b.g.d K;
    private com.censivn.C3DEngine.b.g.d L;
    private k M;
    private g N;
    private float O;
    private k P;
    private k Q;
    private com.tsf.shell.f.c.a.a R;
    private b S;
    private float T;
    private float U;
    private float V;
    private float W;
    private boolean Y;
    private boolean Z;
    private com.censivn.C3DEngine.b.g.b.b ae;
    private boolean af;
    private com.censivn.C3DEngine.b.g.d ag;
    private com.censivn.C3DEngine.b.g.d ah;
    private com.censivn.C3DEngine.b.g.d am;
    private com.censivn.C3DEngine.b.g.d an;
    public com.tsf.shell.f.c.a.a.a n;
    public Runnable r;
    private j s;
    private j t;
    private float w;
    private float u = 0.0f;
    private float v = 0.0f;
    private float x = 0.4f;
    private boolean y = true;
    private boolean z = true;
    private boolean A = false;
    private TextureElement H = new TextureElement(0, false);
    private TextureElement I = new TextureElement(0, false);
    private TextureElement J = new TextureElement(0, false);
    private boolean X = false;
    private int aa = 255;
    private boolean ab = false;
    private float ac = 0.0f;
    private boolean ad = false;
    private boolean ai = false;
    private float aj = 0.0f;
    private float ak = 0.0f;
    private boolean al = false;
    private e B = new e(this);

    /* loaded from: classes.dex */
    public static class a {
        public float a;
        public float b;
        public float c;
    }

    public boolean a() {
        return this.Y;
    }

    public static String b() {
        Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(g.h.a, null, null, null, null);
        String str = "";
        while (query.moveToNext()) {
            str = query.getString(query.getColumnIndex("child"));
        }
        if (str == null) {
            str = "";
        }
        query.close();
        return str;
    }

    public f(boolean z) {
        boolean z2 = true;
        this.Y = false;
        this.Z = false;
        this.af = false;
        this.Y = z;
        if (!z && com.tsf.shell.manager.a.g.c() != 1) {
            z2 = false;
        }
        this.Z = z2;
        if (!z) {
            com.tsf.shell.manager.a.b.a(this);
        }
        if (z) {
            this.af = false;
        } else {
            this.af = com.tsf.shell.manager.b.e.e();
        }
        h = new com.tsf.shell.f.c.a.a.f();
        i = new com.tsf.shell.f.c.a.a.h();
        j = new com.tsf.shell.f.c.a.a.e();
        k = new com.tsf.shell.f.c.a.a.g();
        l = new com.tsf.shell.f.c.a.a.b();
        m = new com.tsf.shell.f.c.a.a.c();
        e = 200.0f * com.censivn.C3DEngine.b.b.a.b;
        f = 360.0f * com.censivn.C3DEngine.b.b.a.b;
        g = 150.0f * com.censivn.C3DEngine.b.b.a.b;
        c = 138.0f * com.censivn.C3DEngine.b.b.a.b;
        A();
    }

    public void c() {
        if (this.Z) {
            a(true);
        } else {
            d();
        }
    }

    public void d() {
        this.Z = true;
        z();
    }

    public void a(boolean z) {
        this.Z = false;
        b(z);
    }

    public boolean e() {
        return this.Z;
    }

    public e f() {
        return this.B;
    }

    private void A() {
        this.T = com.censivn.C3DEngine.b.b.a.a(54.0f);
        this.U = com.censivn.C3DEngine.b.b.a.a(54.0f);
        this.V = com.censivn.C3DEngine.b.b.a.a(80.0f);
        this.W = com.censivn.C3DEngine.b.b.a.a(80.0f);
        o = com.censivn.C3DEngine.b.b.a.a(60.0f);
        p = com.censivn.C3DEngine.b.b.a.a(60.0f);
        q = com.censivn.C3DEngine.b.b.a.a(60.0f);
    }

    private void B() {
        Bitmap b2 = q.b(18.0f, -1);
        com.censivn.C3DEngine.a.g().a(this.I, b2);
        b2.recycle();
    }

    public b g() {
        return this.S;
    }

    public j h() {
        return this.t;
    }

    public void a(ArrayList<ItemInfo> arrayList, String str) {
        Iterator<ItemInfo> it = com.tsf.shell.utils.h.a(arrayList, str, ",", false).iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        float a2 = this.n.a(this.u, this.v);
        if (this.O > a2) {
            this.S.b(a2);
        } else {
            this.S.b(this.O);
        }
        if (this.af) {
            this.S.j();
            this.S.h();
            return;
        }
        a((Runnable) null, false);
    }

    private void a(ItemInfo itemInfo) {
        com.tsf.shell.f.i.b a2;
        if (itemInfo.itemType == 1) {
            a2 = com.tsf.shell.f.i.b.d.b.a((LauncherFolder3DInfo) itemInfo);
        } else {
            a2 = com.tsf.shell.manager.l.a.a(itemInfo, true);
        }
        this.S.a(a2, false);
        this.S.addChild(a2);
    }

    public void a(int i2, boolean z) {
        if (this.aa != i2) {
            this.aa = i2;
            int a2 = com.tsf.shell.utils.f.a(i2);
            this.C.alpha(a2);
            this.P.alpha(a2);
            if (z) {
                com.tsf.shell.manager.b.e.a(i2);
            }
        }
    }

    public int i() {
        return this.aa;
    }

    public void a(j jVar, a aVar) {
        float f2;
        float f3;
        float f4;
        boolean z;
        float f5;
        float f6;
        float f7;
        boolean z2 = true;
        this.ag = new com.censivn.C3DEngine.b.g.d();
        this.ag.l(1.0f);
        this.ag.m(1.0f);
        this.ah = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.c.a.f.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                f.this.P.visible(false);
            }
        };
        this.ah.l(0.0f);
        this.ah.m(0.0f);
        this.s = jVar;
        a = (int) (50.0f * com.censivn.C3DEngine.b.b.a.b);
        b = (int) (100.0f * com.censivn.C3DEngine.b.b.a.b);
        this.S = new b(this);
        if (this.Y) {
            this.S.a = 0.1f;
        }
        a(m);
        C();
        this.D = new j();
        this.C = new j();
        this.ae = new com.censivn.C3DEngine.b.g.b.b();
        this.t = new j() { // from class: com.tsf.shell.f.c.a.f.9
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (!f.this.y && !f.this.al) {
                    position().x += (f.this.u - position().x) * f.this.x;
                    position().y += (f.this.v - position().y) * f.this.x;
                    if (Math.abs(position().x - f.this.u) < 0.2f && Math.abs(position().y - f.this.v) < 0.2f && !f.this.A) {
                        position().x = f.this.u;
                        position().y = f.this.v;
                        f.this.y = true;
                        f.this.t.setAnimationObjectState(false);
                    }
                }
                if (!f.this.z) {
                    if (f.this.S.a(f.this.ac) > 0.32f || f.this.ac > f.this.w) {
                        f.this.w = f.this.ac;
                    }
                    float a2 = f.this.N.a();
                    f.this.O = a2 + ((f.this.w - a2) * f.this.x);
                    f.this.a(f.this.O, true);
                    f.this.S.c(f.this.O);
                    if (Math.abs(f.this.O - f.this.w) < 0.2f) {
                        f.this.O = f.this.w;
                        f.this.a(f.this.O, true);
                        f.this.S.c(f.this.O);
                        f.this.N.setAnimationObjectState(false);
                        f.this.z = true;
                        if (!f.this.Y) {
                            if (com.censivn.C3DEngine.b.b.a.O) {
                                com.tsf.shell.manager.b.e.a(f.this.O);
                            } else {
                                com.tsf.shell.manager.b.e.b(f.this.O);
                            }
                        }
                    }
                }
            }
        };
        this.s.addChild(this.t);
        PositionNumber3d position = this.t.position();
        float f8 = com.censivn.C3DEngine.b.b.a.z + a;
        this.u = f8;
        position.x = f8;
        PositionNumber3d position2 = this.t.position();
        float f9 = com.censivn.C3DEngine.b.b.a.C + a;
        this.v = f9;
        position2.y = f9;
        B();
        this.E = new j();
        this.F = new com.tsf.shell.f.h.e();
        this.F.b(0.0f);
        this.E.addChild(this.F);
        this.G = new com.tsf.shell.f.h.e();
        this.G.b(0.0f);
        this.E.addChild(this.G);
        this.R = new com.tsf.shell.f.c.a.a(this.C, this);
        this.C.setMouseEventListener(this.R);
        this.P = new k(this.I.width, this.I.height, false);
        this.P.rotation().z = 90.0f;
        this.P.calAABB(3.0f, 3.0f, 1.0f);
        this.P.scale().setAll(0.0f, 0.0f, 1.0f);
        this.P.visible(false);
        this.P.textures().addElement(this.I);
        this.Q = new k(this.I.width, this.I.height, false);
        this.Q.textures().addElement(this.I);
        this.C.addChild(this.Q);
        this.C.calAABB(3.0f, 3.0f, 1.0f);
        this.P.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.P) { // from class: com.tsf.shell.f.c.a.f.10
            private float b;
            private boolean d = false;
            private float e;

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                w.b();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.d = false;
                this.b = f.this.N.a();
                this.e = f.this.n.a(f.this.u, f.this.v);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!f.this.af) {
                    boolean z3 = f.this.N.rotation().z % 180.0f == 0.0f;
                    if (this.d) {
                        float a2 = f.this.n.a(this.b, motionEvent, motionEvent2);
                        if (a2 > this.e) {
                            a2 = this.e;
                        }
                        if (a2 < f.c * com.censivn.C3DEngine.b.b.a.b) {
                            a2 = f.c * com.censivn.C3DEngine.b.b.a.b;
                        }
                        f.this.ac = a2;
                        f.this.z = false;
                        f.this.N.setAnimationObjectState(true);
                        f.this.N.invalidate();
                    } else if (z3) {
                        if (Math.abs(motionEvent2.getX() - motionEvent.getX()) > 20.0f) {
                            this.d = true;
                        }
                    } else if (Math.abs(motionEvent2.getY() - motionEvent.getY()) > 20.0f) {
                        this.d = true;
                    }
                }
            }
        });
        this.M = new k(0.0f, this.J.height * com.censivn.C3DEngine.b.b.a.b);
        this.M.textures().addElement(this.J);
        this.M.alpha(0.0f);
        this.K = new com.censivn.C3DEngine.b.g.d();
        this.K.a(255);
        this.L = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.c.a.f.11
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                f.this.M.removeFromParent();
            }
        };
        this.L.a(0);
        d = com.censivn.C3DEngine.b.b.a.a(130.0f);
        this.N = new g(this.H.width, this.H.height, new h(this.H.width / 2, this.H.height / 2, this.H.height)) { // from class: com.tsf.shell.f.c.a.f.12
            @Override // com.censivn.C3DEngine.b.f.i
            public i getHittingTarget(float f10, float f11, boolean z3) {
                if (f.this.P.calTouchCollision(f10, f11)) {
                    return f.this.P;
                }
                if (!calTouchCollision(f10, f11)) {
                    return null;
                }
                return this;
            }
        };
        this.N.textures().addElement(this.H);
        this.N.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.N) { // from class: com.tsf.shell.f.c.a.f.13
            boolean a = true;
            boolean b = true;
            i d;
            com.censivn.C3DEngine.b.d.a e;

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
                if (this.a) {
                    this.a = false;
                    f.this.S.a(motionEvent2.getX(), motionEvent2.getY());
                }
                f.this.S.b(motionEvent2.getX(), motionEvent2.getY());
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.d = null;
                this.e = null;
                this.d = f.this.S.getHittingObjectTarget(motionEvent, true);
                if (this.d != null && this.d.getMouseEventListener() != null) {
                    this.e = this.d.getMouseEventListener();
                    this.e.e(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (!this.a) {
                    this.a = true;
                    f.this.S.c();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (this.e != null) {
                    this.e.a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.e != null) {
                    this.e.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                this.b = false;
                if (this.e != null) {
                    this.e.c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                this.b = false;
                if (this.e != null) {
                    this.e.d(motionEvent);
                }
            }
        });
        this.D.addChild(this.P);
        this.N.addChild(this.D);
        this.t.addChild(this.S);
        this.t.addChild(this.N);
        this.t.addChild(this.C);
        a(0.0f, true);
        float c2 = com.censivn.C3DEngine.b.b.a.O ? com.tsf.shell.manager.b.e.c() : com.tsf.shell.manager.b.e.d();
        if (!this.Y) {
            if (com.tsf.shell.manager.b.e.c() != 0.0f || com.tsf.shell.manager.b.e.d() != 0.0f) {
                z2 = false;
            }
            if (c2 == 0.0f) {
                f6 = (int) (com.tsf.shell.manager.o.b.a.H * 6 * 0.95f);
                f5 = (-f6) / 2.0f;
                f7 = com.censivn.C3DEngine.b.b.a.C;
            } else {
                Number3d f10 = com.censivn.C3DEngine.b.b.a.O ? com.tsf.shell.manager.b.e.f() : com.tsf.shell.manager.b.e.g();
                float f11 = f10.x;
                float f12 = f10.y;
                f5 = f11;
                f6 = c2;
                f7 = f12;
            }
            if (f6 < c) {
                boolean z3 = z2;
                f2 = c;
                f3 = f5;
                f4 = f7;
                z = z3;
            } else {
                boolean z4 = z2;
                f2 = f6;
                f3 = f5;
                f4 = f7;
                z = z4;
            }
        } else {
            f2 = aVar.a;
            f3 = aVar.b;
            f4 = aVar.c;
            z = false;
        }
        this.w = f2;
        this.O = f2;
        a(f3, f4, false);
        if (!this.Y && z) {
            if (com.censivn.C3DEngine.b.b.a.O) {
                com.tsf.shell.manager.b.e.a(this.O);
                com.tsf.shell.manager.b.e.a(this.u, this.v);
            } else {
                com.tsf.shell.manager.b.e.b(this.O);
                com.tsf.shell.manager.b.e.b(this.u, this.v);
            }
        }
        a(com.tsf.shell.manager.b.e.b(), false);
        com.tsf.shell.manager.a.h.c().a(new o.a() { // from class: com.tsf.shell.f.c.a.f.14
            @Override // com.tsf.shell.f.f.o.a
            public void a(com.tsf.shell.f.f.g gVar) {
                if (gVar.t() == -1) {
                    if (f.this.ad) {
                        f.this.v();
                    }
                } else if (!f.this.af && !f.this.ad) {
                    f.this.x();
                }
            }

            @Override // com.tsf.shell.f.f.o.a
            public void a() {
                if (f.this.ad) {
                    f.this.v();
                }
            }

            @Override // com.tsf.shell.f.f.o.a
            public void b() {
                if (!f.this.af && !f.this.ad && com.tsf.shell.manager.a.h.n().t() != -1) {
                    f.this.x();
                }
            }
        });
        if (this.Z) {
            d();
        } else {
            a(false);
        }
    }

    public int a(float f2) {
        return this.n.a(f2, this.G.rotation().z, 0.0f);
    }

    public void j() {
        a.C0080a a2 = this.n.a(this.t, this.G.a, 8.0f, 4.0f, 24.0f);
        if (a2 != null) {
            this.G.visible(Boolean.valueOf(!this.ad));
            this.G.rotation().z = a2.d;
            this.F.rotation().z = a2.e;
            this.G.a(a2.a);
            this.F.a(a2.b);
            this.E.removeFromParent();
            this.E.position().setAllFrom(this.t.position());
            com.tsf.shell.manager.a.j.a(this.E);
        }
    }

    public void k() {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.c.a.f.15
            @Override // java.lang.Runnable
            public void run() {
                f.this.l();
            }
        });
    }

    public void l() {
        if (this.r == null) {
            this.r = new Runnable() { // from class: com.tsf.shell.f.c.a.f.16
                @Override // java.lang.Runnable
                public void run() {
                    f.this.G.b(0.0f);
                    f.this.F.b(0.0f);
                    f.this.E.removeFromParent();
                }
            };
        }
        this.G.a(0.0f, this.r);
        this.F.a(0.0f);
    }

    public void m() {
        if (!this.ab) {
            this.ab = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.c.a.f.2
                @Override // java.lang.Runnable
                public void run() {
                    if (f.this.M.parent() == null) {
                        f.this.t.addChildAt(f.this.M, 0);
                    }
                    if (!f.this.X) {
                        f.this.M.rotation().z = 90.0f;
                        f.this.M.a(com.censivn.C3DEngine.b.b.a.G * 2);
                    } else {
                        f.this.M.rotation().z = 0.0f;
                        f.this.M.a(com.censivn.C3DEngine.b.b.a.F * 2);
                    }
                    com.censivn.C3DEngine.b.g.c.a(f.this.M);
                    com.censivn.C3DEngine.b.g.c.a(f.this.M, VEasing.Linear.easeNone, f.this.K);
                }
            });
        }
    }

    public void n() {
        if (this.ab) {
            this.ab = false;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.c.a.f.3
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.b.g.c.a(f.this.M);
                    com.censivn.C3DEngine.b.g.c.a(f.this.M, VEasing.Linear.easeNone, f.this.L);
                }
            });
        }
    }

    public void a(float f2, boolean z) {
        this.N.setAABBPX(0.0f, (-d) / 2.0f, 0.0f, f2, d / 2.0f, 0.0f);
        this.N.c(f2);
        if (z) {
            this.D.position().x = f2;
        }
    }

    private void a(com.tsf.shell.f.c.a.a.a aVar) {
        this.n = aVar;
        this.S.e();
    }

    private void b(com.tsf.shell.f.c.a.a.a aVar) {
        if (aVar != this.n) {
            this.n = aVar;
            this.S.e();
        }
    }

    private void C() {
        this.S.c(this.T, this.U);
    }

    public void o() {
        w.a();
        this.A = true;
        this.y = false;
        this.t.setAnimationObjectState(true);
        this.t.invalidate();
        this.u = this.t.position().x;
        this.v = this.t.position().y;
        v();
    }

    public void a(float f2, float f3) {
        this.u = f2;
        this.v = f3;
    }

    public void a(float f2, float f3, float f4) {
        this.u = f3;
        this.v = f4;
        this.t.position().setAll(this.u, this.v, 0.0f);
        this.O = f2;
        if (this.ad) {
            this.S.c(f2);
            a(f2, true);
        }
    }

    public float p() {
        return this.O;
    }

    public void q() {
        this.A = false;
        c(false);
        if (!this.Y) {
            if (com.censivn.C3DEngine.b.b.a.O) {
                com.tsf.shell.manager.b.e.a(this.u, this.v);
            } else {
                com.tsf.shell.manager.b.e.b(this.u, this.v);
            }
        }
        if (!this.af) {
            x();
            return;
        }
        float f2 = this.O;
        float a2 = this.n.a(this.u, this.v);
        if (f2 <= a2) {
            a2 = f2;
        }
        this.S.e(a2);
    }

    private void a(float f2, float f3, boolean z) {
        this.u = f2;
        this.v = f3;
        c(z);
        this.t.position().setAll(this.u, this.v, 0.0f);
    }

    private void c(boolean z) {
        float abs = Math.abs(this.u - com.censivn.C3DEngine.b.b.a.z);
        float abs2 = Math.abs(com.censivn.C3DEngine.b.b.a.A - this.u);
        float abs3 = Math.abs(this.v - com.censivn.C3DEngine.b.b.a.C);
        if (z && this.n != null) {
            if (this.n instanceof com.tsf.shell.f.c.a.a.d) {
                this.v = com.censivn.C3DEngine.b.b.a.C + a;
                F();
            } else {
                if (abs > abs2) {
                    this.u = com.censivn.C3DEngine.b.b.a.A - a;
                } else {
                    this.u = com.censivn.C3DEngine.b.b.a.z + a;
                }
                E();
            }
        } else if (abs < abs2 && abs < abs3) {
            this.u = com.censivn.C3DEngine.b.b.a.z + a;
            E();
        } else if (abs2 < abs && abs2 < abs3) {
            this.u = com.censivn.C3DEngine.b.b.a.A - a;
            E();
        } else {
            this.v = com.censivn.C3DEngine.b.b.a.C + a;
            F();
        }
        if (z && !this.Y) {
            if (this.n instanceof com.tsf.shell.f.c.a.a.d) {
                com.tsf.shell.manager.b.e.a(this.u, this.v);
            } else {
                com.tsf.shell.manager.b.e.b(this.u, this.v);
            }
        }
    }

    private void D() {
        if (!this.Y) {
            if (this.n.c == 3) {
                this.v = com.censivn.C3DEngine.b.b.a.C + a;
            } else if (this.n.c == 0) {
                this.u = com.censivn.C3DEngine.b.b.a.z + a;
            } else if (this.n.c == 1) {
                this.v = com.censivn.C3DEngine.b.b.a.A - a;
            }
        }
    }

    private void E() {
        if (!this.Y) {
            if (this.v > com.censivn.C3DEngine.b.b.a.B - a) {
                this.v = com.censivn.C3DEngine.b.b.a.B - a;
            } else if (this.v < com.censivn.C3DEngine.b.b.a.C + a) {
                this.v = com.censivn.C3DEngine.b.b.a.C + a;
            }
            boolean z = this.N.a() != 0.0f;
            if (this.v > 0.0f) {
                if (z) {
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                    dVar.e(-90.0f);
                    com.censivn.C3DEngine.b.g.c.a(this.N);
                    com.censivn.C3DEngine.b.g.c.a(this.N, 300, dVar);
                } else {
                    this.N.rotation().z = -90.0f;
                }
                this.D.rotation().z = 90.0f;
                if (this.u < 0.0f) {
                    this.X = false;
                    b(j);
                    return;
                }
                this.X = false;
                b(k);
                return;
            }
            if (z) {
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.e(90.0f);
                com.censivn.C3DEngine.b.g.c.a(this.N);
                com.censivn.C3DEngine.b.g.c.a(this.N, 300, dVar2);
            } else {
                this.N.rotation().z = 90.0f;
            }
            this.D.rotation().z = -90.0f;
            if (this.u < 0.0f) {
                this.X = false;
                b(h);
                return;
            }
            this.X = false;
            b(i);
        }
    }

    private void F() {
        if (!this.Y) {
            if (this.u > com.censivn.C3DEngine.b.b.a.A - a) {
                this.u = com.censivn.C3DEngine.b.b.a.A - a;
            } else if (this.u < com.censivn.C3DEngine.b.b.a.z + a) {
                this.u = com.censivn.C3DEngine.b.b.a.z + a;
            }
            boolean z = this.N.a() != 0.0f;
            if (this.u > 0.0f) {
                if (z) {
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                    dVar.e(180.0f);
                    com.censivn.C3DEngine.b.g.c.a(this.N);
                    com.censivn.C3DEngine.b.g.c.a(this.N, 300, dVar);
                } else {
                    this.N.rotation().z = 180.0f;
                }
                this.D.rotation().z = -180.0f;
                this.X = true;
                b(l);
                return;
            }
            if (z) {
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.e(0.0f);
                com.censivn.C3DEngine.b.g.c.a(this.N);
                com.censivn.C3DEngine.b.g.c.a(this.N, 300, dVar2);
            } else {
                this.N.rotation().z = 0.0f;
            }
            this.D.rotation().z = 0.0f;
            this.X = true;
            b(m);
        }
    }

    public boolean r() {
        return this.ad;
    }

    public boolean s() {
        return this.af;
    }

    private void G() {
        if (!this.Y) {
            com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.f.c.a.f.4
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.b.e.a(f.this.af);
                }
            });
        }
    }

    public void t() {
        if (this.Z) {
            w.a();
            this.af = false;
            x();
            G();
        }
    }

    public void u() {
        if (this.Z) {
            w.a();
            this.af = true;
            v();
            G();
        }
    }

    public void v() {
        if (this.ad) {
            this.S.f();
            this.ad = false;
            final float a2 = this.N.a();
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.c.a.f.5
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f2) {
                    f.this.a(a2 * (1.0f - f2), true);
                }
            };
            com.censivn.C3DEngine.b.g.c.a(this.ae);
            com.censivn.C3DEngine.b.g.c.a(this.ae, 600, dVar);
            H();
        }
    }

    private void d(boolean z) {
        this.P.visible(true);
        if (z) {
            com.censivn.C3DEngine.b.g.c.a(this.P);
            com.censivn.C3DEngine.b.g.c.a(this.P, 600, this.ag);
            return;
        }
        this.P.scale().setAll(1.0f, 1.0f, 1.0f);
    }

    private void H() {
        com.censivn.C3DEngine.b.g.c.a(this.P);
        com.censivn.C3DEngine.b.g.c.a(this.P, 600, this.ah);
    }

    public float w() {
        return this.v;
    }

    public void x() {
        a((Runnable) null, true);
    }

    public void a(final Runnable runnable, boolean z) {
        if (!this.ad) {
            this.ad = true;
            float f2 = this.O;
            final float a2 = this.n.a(this.u, this.v);
            if (f2 <= a2) {
                a2 = f2;
            }
            this.S.e(a2);
            this.S.a(z);
            final float a3 = this.N.a();
            final boolean z2 = this.af ? false : true;
            if (z) {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.c.a.f.6
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f3) {
                        f.this.a(a3 + ((a2 - a3) * f3), z2);
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                };
                com.censivn.C3DEngine.b.g.c.a(this.ae);
                com.censivn.C3DEngine.b.g.c.a(this.ae, 500, dVar);
            } else {
                a(a2, z2);
                if (runnable != null) {
                    runnable.run();
                }
            }
            d(z);
        }
    }

    public void y() {
        b(true);
    }

    public void b(boolean z) {
        if (!this.al) {
            this.al = true;
            this.t.mouseEnabled(false);
            Number3d a2 = this.n.a(this.t);
            if (z) {
                if (this.an == null) {
                    this.an = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.c.a.f.7
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            f.this.t.visible(false);
                        }
                    };
                }
                this.an.f(a2.x);
                this.an.h(a2.y);
                com.censivn.C3DEngine.b.g.c.a(this.t);
                com.censivn.C3DEngine.b.g.c.a(this.t, 600, this.an);
                return;
            }
            this.t.visible(false);
            this.t.position().x = a2.x;
            this.t.position().y = a2.y;
        }
    }

    public void z() {
        if (this.al && this.Z) {
            this.al = false;
            this.t.visible(true);
            Number3d b2 = this.n.b(this.t);
            if (this.am == null) {
                this.am = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.c.a.f.8
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        f.this.t.mouseEnabled(true);
                    }
                };
            }
            this.am.f(b2.x);
            this.am.h(b2.y);
            com.censivn.C3DEngine.b.g.c.a(this.t);
            com.censivn.C3DEngine.b.g.c.a(this.t, 600, this.am);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        boolean z = false;
        if (((this.n instanceof com.tsf.shell.f.c.a.a.d) && com.censivn.C3DEngine.b.b.a.O) || ((this.n instanceof com.tsf.shell.f.c.a.a.i) && !com.censivn.C3DEngine.b.b.a.O)) {
            z = true;
        }
        Number3d f4 = com.censivn.C3DEngine.b.b.a.O ? com.tsf.shell.manager.b.e.f() : com.tsf.shell.manager.b.e.g();
        if (f4.x == 0.0f && f4.y == 0.0f) {
            D();
            f2 = this.u;
            f3 = this.v;
        } else {
            f2 = f4.x;
            f3 = f4.y;
        }
        a(f2, f3, z);
        float c2 = com.censivn.C3DEngine.b.b.a.O ? com.tsf.shell.manager.b.e.c() : com.tsf.shell.manager.b.e.d();
        if (c2 == 0.0f) {
            c2 = this.O;
        }
        if (c2 != 0.0f) {
            if (c2 < c * com.censivn.C3DEngine.b.b.a.b) {
                c2 = c * com.censivn.C3DEngine.b.b.a.b;
            }
            float a2 = this.n.a(this.u, this.v);
            if (c2 > a2) {
                c2 = a2;
            }
            this.w = c2;
            this.O = c2;
            if (this.ad) {
                a(this.O, true);
                this.S.d(this.O);
                this.S.invalidate();
            }
        }
    }
}
