package com.censivn.C3DEngine.b.h.b;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.f.e.d.a.c;
import com.tsf.shell.f.i.a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends j implements b.a, e.a, d, a.InterfaceC0113a {
    private static j Q;
    private static c.a R;
    private Number3d A;
    private Number3d B;
    private Number3d C;
    private Number3d D;
    private Number3d E;
    private Number3d F;
    private float G;
    private float H;
    private int I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private com.tsf.shell.f.f.g O;
    private a P;
    private j a;
    private k b;
    private k c;
    private j d;
    private TextureElement e;
    private TextureElement f;
    private com.censivn.C3DEngine.b.d.a g;
    private e h;
    private com.tsf.shell.f.i.a i;
    private ArrayList<Number3d> j;
    private float k;
    private float l;
    private boolean m;
    private boolean n;
    private Number3d o;
    private Number3d p;
    private Number3d q;
    private Number3d r;
    private Number3d s;
    private Number3d t;
    private Number3d u;
    private Number3d v;
    private Number3d w;
    private Number3d x;
    private Number3d y;
    private Number3d z;

    public static class a {
        public void a() {
        }
    }

    public c(com.tsf.shell.f.f.g gVar, boolean z) {
        this(gVar, z, null);
    }

    public c(com.tsf.shell.f.f.g gVar, boolean z, a aVar) {
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = false;
        this.n = false;
        this.M = false;
        this.N = true;
        this.O = gVar;
        this.P = aVar;
        a(z);
        this.O.a(this);
        com.tsf.shell.manager.a.b.a(this);
        com.tsf.shell.manager.a.h.a().b();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (!this.N && !this.n) {
            this.a.position().x += (this.k - this.a.position().x) * 0.36f;
            this.a.position().y += (this.l - this.a.position().y) * 0.36f;
            if (Math.abs(this.a.position().x - this.k) < 0.2f && Math.abs(this.a.position().y - this.l) < 0.2f) {
                this.a.position().x = this.k;
                this.a.position().y = this.l;
                this.N = true;
            }
        }
        if (this.M && !this.n) {
            g();
        }
    }

    private void a(boolean z) {
        int i = 3;
        float f = 128.0f;
        this.G = 32.0f * com.censivn.C3DEngine.b.b.a.a;
        this.H = 32.0f * com.censivn.C3DEngine.b.b.a.a;
        this.E = new Number3d();
        this.F = new Number3d();
        this.a = this;
        this.j = new ArrayList<>();
        int iA = (int) com.censivn.C3DEngine.b.b.a.a(128.0f);
        this.e = ThemeManager.mix.interactiveArrange.getTextureElement(ThemeShellDescription.INTERACTIVE_ARRANGE_BG, iA, iA);
        this.b = new k(f, f, i, i) { // from class: com.censivn.C3DEngine.b.h.b.c.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
                if (c.this.i.e()) {
                    c.this.i.g();
                }
                c.this.d();
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void calAABB() {
                super.calAABB();
            }
        };
        this.b.textures().addElement(this.e);
        this.b.useVBO(false);
        this.b.setAnimationObjectState(true);
        this.b.mouseAreaDynamic(true);
        this.g = new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.censivn.C3DEngine.b.h.b.c.2
            boolean a = false;
            private float d;
            private float e;
            private float f;
            private float g;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.a = false;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!c.this.n) {
                    if (!this.a) {
                        if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 10.0f) {
                            this.f = motionEvent2.getX();
                            this.g = motionEvent2.getY();
                            this.d = c.this.a.position().x;
                            this.e = c.this.a.position().y;
                            this.a = true;
                            return;
                        }
                        return;
                    }
                    float x = (int) (this.d + (motionEvent2.getX() - this.f));
                    float y = (int) (this.e - (motionEvent2.getY() - this.g));
                    if (c.this.F.x + x > com.censivn.C3DEngine.b.b.a.A) {
                        this.d -= (x + c.this.F.x) - com.censivn.C3DEngine.b.b.a.A;
                        x = (int) (com.censivn.C3DEngine.b.b.a.A - c.this.F.x);
                    } else if (c.this.E.x + x < com.censivn.C3DEngine.b.b.a.z) {
                        this.d = (com.censivn.C3DEngine.b.b.a.z - (x + c.this.E.x)) + this.d;
                        x = (int) (com.censivn.C3DEngine.b.b.a.z - c.this.E.x);
                    }
                    if (c.this.E.y + y > com.censivn.C3DEngine.b.b.a.B) {
                        this.e -= (y + c.this.E.y) - com.censivn.C3DEngine.b.b.a.B;
                        y = (int) (com.censivn.C3DEngine.b.b.a.B - c.this.E.y);
                    } else if (c.this.F.y + y < com.censivn.C3DEngine.b.b.a.C) {
                        this.e = (com.censivn.C3DEngine.b.b.a.C - (y + c.this.F.y)) + this.e;
                        y = (int) (com.censivn.C3DEngine.b.b.a.C - c.this.F.y);
                    }
                    c.this.N = false;
                    c.this.k = x;
                    c.this.l = y;
                }
            }
        };
        this.b.setMouseEventListener(this.g);
        this.o = this.b.points().getAsNumber3dPX(13);
        this.p = this.b.points().getAsNumber3dPX(9);
        this.q = this.b.points().getAsNumber3dPX(5);
        this.r = this.b.points().getAsNumber3dPX(1);
        this.s = this.b.points().getAsNumber3dPX(12);
        this.t = this.b.points().getAsNumber3dPX(8);
        this.u = this.b.points().getAsNumber3dPX(4);
        this.w = this.b.points().getAsNumber3dPX(2);
        this.x = this.b.points().getAsNumber3dPX(3);
        this.y = this.b.points().getAsNumber3dPX(6);
        this.z = this.b.points().getAsNumber3dPX(7);
        this.A = this.b.points().getAsNumber3dPX(10);
        this.B = this.b.points().getAsNumber3dPX(11);
        this.C = this.b.points().getAsNumber3dPX(14);
        this.D = this.b.points().getAsNumber3dPX(15);
        this.v = this.b.points().getAsNumber3dPX(0);
        addChild(this.b);
        this.h = new e() { // from class: com.censivn.C3DEngine.b.h.b.c.3
            @Override // com.censivn.C3DEngine.b.h.b.e
            public void a(MotionEvent motionEvent) {
                e(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.h.b.e
            public void b(MotionEvent motionEvent) {
                com.tsf.shell.f.i.b bVarE = e(motionEvent);
                if (bVarE != null && c.this.i.e()) {
                    ((com.tsf.shell.f.i.c) bVarE).ap();
                }
            }
        };
        this.i = new com.tsf.shell.f.i.a(this, this) { // from class: com.censivn.C3DEngine.b.h.b.c.4
            @Override // com.tsf.shell.f.i.a
            public void a() {
                c.this.f();
            }
        };
        this.h.getMouseEventListener().c = this.b;
        this.h.a(this);
        this.d = this.h.b();
        addChild(this.h);
        this.f = ThemeManager.mix.interactiveArrange.getTextureElement(ThemeShellDescription.INTERACTIVE_ARRANGE_SCALE_BUTTON, com.tsf.shell.manager.g.a.a, com.tsf.shell.manager.g.a.a);
        this.c = new k(com.tsf.shell.manager.g.a.a, com.tsf.shell.manager.g.a.a, false);
        this.c.textures().addElement(this.f);
        this.c.calAABB(1.3f, 1.3f, 1.0f);
        this.c.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.censivn.C3DEngine.b.h.b.c.5
            private boolean b = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                c.this.K = c.this.I;
                c.this.L = c.this.J;
                c.this.M = true;
                this.b = false;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                c.this.M = false;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!this.b) {
                    if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                        this.b = true;
                    }
                } else if (c.this.M) {
                    float[] fArrA = x.a(motionEvent2);
                    c.this.K = (int) (fArrA[0] - c.this.a.position().x);
                    c.this.L = (int) (fArrA[1] - c.this.a.position().y);
                }
            }
        });
        addChild(this.c);
        if (z) {
            this.b.setFocus();
        }
        com.censivn.C3DEngine.b.c.b.a(this);
        if (Q == null) {
            Q = new j();
            c.b bVar = new c.b();
            bVar.a = com.censivn.C3DEngine.b.b.a.a(-130.0f);
            bVar.b = com.censivn.C3DEngine.b.b.a.a(128.0f);
            bVar.c = com.censivn.C3DEngine.b.b.a.a(50.0f);
            bVar.d = 0.0f;
            bVar.e = 38;
            bVar.f = com.censivn.C3DEngine.b.b.a.a(54.0f);
            bVar.g = 0;
            R = new c.a(b.i.menu_multiple_choice, b.d.widget_folder_multi_choice, bVar);
            Q.addChild(R);
        }
        R.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.censivn.C3DEngine.b.h.b.c.6
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                c.this.a();
            }
        });
        R.alpha(0.0f);
        Q.removeFromParent();
        f();
        addChild(Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(R);
        com.censivn.C3DEngine.b.g.c.a(R, VEasing.Back.easeIn, dVar);
    }

    private void b(int i) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(i);
        com.censivn.C3DEngine.b.g.c.a(R);
        com.censivn.C3DEngine.b.g.c.a(R, VEasing.Back.easeIn, dVar);
    }

    public void a() {
        if (this.i.e()) {
            this.i.g();
            f();
        } else {
            this.i.f();
            b(100);
        }
    }

    @Override // com.tsf.shell.f.i.a.InterfaceC0113a
    public ArrayList<i> b() {
        return this.h.b().children();
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            d();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    private void g() {
        this.I = (int) (this.I + ((this.K - this.I) * 0.36f));
        this.J = (int) (this.J + ((this.L - this.J) * 0.36f));
        if (this.a.position().x == 0.0f && this.a.position().y == 0.0f) {
            if (this.J < com.censivn.C3DEngine.b.b.a.C) {
                this.J = com.censivn.C3DEngine.b.b.a.C;
            }
            if (this.I > com.censivn.C3DEngine.b.b.a.A) {
                this.I = com.censivn.C3DEngine.b.b.a.A;
            }
            a(this.I, -this.J);
        } else {
            if (this.J + this.a.position().y < com.censivn.C3DEngine.b.b.a.C) {
                this.J = (int) (com.censivn.C3DEngine.b.b.a.C + this.a.position().y);
            }
            if (this.I + this.a.position().x > com.censivn.C3DEngine.b.b.a.A) {
                this.I = (int) (com.censivn.C3DEngine.b.b.a.A - this.a.position().x);
            }
            b(this.I, -this.J);
        }
        h();
    }

    public void a(com.tsf.shell.f.i.b bVar) {
        this.j.add(bVar.position().m4clone());
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.e(0.0f);
        com.censivn.C3DEngine.b.g.c.a(bVar, 500, dVar);
        bVar.a(this.i);
        this.h.a(bVar);
        h();
    }

    public void a(ArrayList<com.tsf.shell.f.i.b> arrayList) {
        for (com.tsf.shell.f.i.b bVar : arrayList) {
            this.j.add(bVar.position().m4clone());
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.e(0.0f);
            com.censivn.C3DEngine.b.g.c.a(bVar, 500, dVar);
            bVar.a(this.i);
        }
        this.h.b(arrayList);
        h();
    }

    private void h() {
        int i;
        int i2;
        int iRound;
        float f;
        this.E.x = this.b.points().pxX(15);
        this.E.y = this.b.points().pxY(15);
        this.F.x = this.b.points().pxX(0);
        this.F.y = this.b.points().pxY(0);
        int i3 = 2;
        int i4 = (int) (this.F.x - this.E.x);
        int i5 = (int) (this.E.y - this.F.y);
        int size = this.j.size();
        if (size < 2) {
            i2 = 2;
            i = 2;
        } else if (i4 / (size - 1) > 130.0f * com.censivn.C3DEngine.b.b.a.a || i5 / (size - 1) > 130.0f * com.censivn.C3DEngine.b.b.a.a) {
            if (i4 > i5 / 2) {
                int i6 = 2;
                while (i4 / (i6 - 1) > 130.0f * com.censivn.C3DEngine.b.b.a.a && i6 < size) {
                    i6++;
                }
                if (size % i6 == 0) {
                    i2 = i6;
                    i = size / i6;
                } else {
                    i2 = i6;
                    i = (size / i6) + 1;
                }
            } else {
                i = 2;
                while (i5 / (i - 1) > 130.0f * com.censivn.C3DEngine.b.b.a.a && i < size) {
                    i++;
                }
                if (size % i == 0) {
                    i2 = size / i;
                } else {
                    i2 = (size / i) + 1;
                }
            }
        } else {
            if (i4 > i5) {
                iRound = (int) Math.round(((double) i4) / ((double) i5));
            } else {
                iRound = (int) Math.round(((double) i5) / ((double) i4));
            }
            while (true) {
                if (i4 > i5) {
                    i2 = i3 * iRound;
                    i = i3;
                } else {
                    i = i3 * iRound;
                    i2 = i3;
                }
                if (i2 * i >= size) {
                    break;
                } else {
                    i3++;
                }
            }
            if (iRound != 1) {
                if (i4 > i5) {
                    while ((i2 - 1) * i >= size && i2 != 2) {
                        i2--;
                    }
                } else {
                    while ((i - 1) * i2 >= size && i != 2) {
                        i--;
                    }
                }
            } else if (i5 > i4) {
                while ((i2 - 1) * i >= size && i2 != 2) {
                    i2--;
                }
            } else {
                while ((i - 1) * i2 >= size && i != 2) {
                    i--;
                }
            }
        }
        int i7 = (int) (60.0f * com.censivn.C3DEngine.b.b.a.a);
        int i8 = (int) (68.0f * com.censivn.C3DEngine.b.b.a.a);
        if (i2 == 1) {
            f = 0.0f;
        } else {
            f = (i4 - (i7 * 2)) / (i2 - 1);
        }
        float f2 = 0.0f;
        if (i != 1) {
            f2 = (i5 - (i8 * 2)) / (i - 1);
        }
        int i9 = (int) (this.E.x + i7);
        int i10 = (int) (this.E.y - i8);
        for (int i11 = 0; i11 < size; i11++) {
            Number3d number3d = this.j.get(i11);
            number3d.x = ((i11 % i2) * f) + i9;
            number3d.y = i10 - ((i11 / i2) * f2);
        }
        this.h.a(this.j);
        this.h.a((int) this.E.x, (int) this.F.y, (int) this.F.x, (int) this.E.y);
    }

    public void c() {
        int i;
        if (400 > com.censivn.C3DEngine.b.b.a.D) {
            i = (com.censivn.C3DEngine.b.b.a.D / 2) - 20;
        } else {
            i = VEasing.Back.easeIn;
        }
        a(i, i);
    }

    public void a(int i, int i2) {
        this.I = i;
        this.J = -i2;
        if (i < com.censivn.C3DEngine.b.b.a.a * 64.0f) {
            i = (int) (com.censivn.C3DEngine.b.b.a.a * 64.0f);
        }
        if (i2 < com.censivn.C3DEngine.b.b.a.a * 64.0f) {
            i2 = (int) (com.censivn.C3DEngine.b.b.a.a * 64.0f);
        }
        int i3 = i - (((int) (com.censivn.C3DEngine.b.b.a.a * 128.0f)) / 2);
        int i4 = i2 - (((int) (com.censivn.C3DEngine.b.b.a.a * 128.0f)) / 2);
        this.c.position().x = i - this.G;
        this.c.position().y = (-i2) + this.H;
        Q.position().x = 0.0f;
        Q.position().y = this.c.position().y - com.censivn.C3DEngine.b.b.a.a(100.0f);
        this.b.points().pxX(13, this.o.x + i3);
        this.b.points().pxX(9, this.p.x + i3);
        this.b.points().pxX(5, this.q.x + i3);
        this.b.points().pxX(1, this.r.x + i3);
        this.b.points().pxX(12, this.s.x + i3);
        this.b.points().pxX(8, this.t.x + i3);
        this.b.points().pxX(4, this.u.x + i3);
        this.b.points().pxX(0, this.v.x + i3);
        this.b.points().pxY(0, this.v.y - i4);
        this.b.points().pxY(1, this.r.y - i4);
        this.b.points().pxY(2, this.w.y - i4);
        this.b.points().pxY(3, this.x.y - i4);
        this.b.points().pxY(4, this.u.y - i4);
        this.b.points().pxY(5, this.q.y - i4);
        this.b.points().pxY(6, this.y.y - i4);
        this.b.points().pxY(7, this.z.y - i4);
        this.b.points().pxX(2, this.w.x - i3);
        this.b.points().pxX(6, this.y.x - i3);
        this.b.points().pxX(10, this.A.x - i3);
        this.b.points().pxX(14, this.C.x - i3);
        this.b.points().pxX(3, this.x.x - i3);
        this.b.points().pxX(7, this.z.x - i3);
        this.b.points().pxX(11, this.B.x - i3);
        this.b.points().pxX(15, this.D.x - i3);
        this.b.points().pxY(8, this.t.y + i4);
        this.b.points().pxY(9, this.p.y + i4);
        this.b.points().pxY(10, this.A.y + i4);
        this.b.points().pxY(11, this.B.y + i4);
        this.b.points().pxY(12, this.s.y + i4);
        this.b.points().pxY(13, this.o.y + i4);
        this.b.points().pxY(14, this.C.y + i4);
        this.b.points().pxY(15, i4 + this.D.y);
    }

    private void b(int i, int i2) {
        float fPxX = i - ((com.censivn.C3DEngine.b.b.a.a * 128.0f) / 2.0f);
        float fPxY = i2 - ((com.censivn.C3DEngine.b.b.a.a * 128.0f) / 2.0f);
        if ((this.v.x + fPxX) - this.b.points().pxX(15) < com.censivn.C3DEngine.b.b.a.a * 128.0f) {
            fPxX = ((com.censivn.C3DEngine.b.b.a.a * 128.0f) + this.b.points().pxX(15)) - this.v.x;
        }
        if ((this.b.points().pxY(15) - this.v.y) + fPxY < com.censivn.C3DEngine.b.b.a.a * 128.0f) {
            fPxY = ((com.censivn.C3DEngine.b.b.a.a * 128.0f) - this.b.points().pxY(15)) + this.v.y;
        }
        this.c.position().x = this.G + fPxX;
        this.c.position().y = (-this.H) - fPxY;
        Q.position().x = (this.b.points().pxX(15) + this.b.points().pxX(0)) / 2.0f;
        Q.position().y = this.c.position().y - com.censivn.C3DEngine.b.b.a.a(100.0f);
        this.b.points().pxX(13, this.o.x + fPxX);
        this.b.points().pxX(9, this.p.x + fPxX);
        this.b.points().pxX(5, this.q.x + fPxX);
        this.b.points().pxX(1, this.r.x + fPxX);
        this.b.points().pxX(12, this.s.x + fPxX);
        this.b.points().pxX(8, this.t.x + fPxX);
        this.b.points().pxX(4, this.u.x + fPxX);
        this.b.points().pxX(0, fPxX + this.v.x);
        this.b.points().pxY(0, this.v.y - fPxY);
        this.b.points().pxY(1, this.r.y - fPxY);
        this.b.points().pxY(2, this.w.y - fPxY);
        this.b.points().pxY(3, this.x.y - fPxY);
        this.b.points().pxY(4, this.u.y - fPxY);
        this.b.points().pxY(5, this.q.y - fPxY);
        this.b.points().pxY(6, this.y.y - fPxY);
        this.b.points().pxY(7, this.z.y - fPxY);
    }

    public void d() {
        if (!this.n && !this.m) {
            b(0);
            com.censivn.C3DEngine.b.c.b.b(this);
            com.tsf.shell.manager.a.b.b(this);
            com.tsf.shell.manager.a.h.a().c();
            this.i.g();
            this.n = true;
            float f = this.a.position().x;
            float f2 = this.a.position().y;
            for (i iVar : this.h.c()) {
                iVar.position().x += f;
                iVar.position().y += f2;
                iVar.mouseEnabled(true);
                iVar.removeFromParent();
                this.O.a(iVar);
                ((com.tsf.shell.f.i.b) iVar).ad();
            }
            this.j.clear();
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.h.b.c.7
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f3) {
                    c.this.c.alpha(c.this.b.alpha());
                }

                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    c.this.a.destroy();
                    c.this.b.destroy();
                    c.this.c.destroy();
                    c.this.h.destroy();
                    c.this.O = null;
                    com.censivn.C3DEngine.a.g().a(c.this.e);
                    com.censivn.C3DEngine.a.g().a(c.this.f);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.b);
            com.censivn.C3DEngine.b.g.c.a(this.b, 300, dVar);
            com.tsf.shell.f.e.g.d.onTempleteShow();
            if (this.P != null) {
                this.P.a();
                this.P = null;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void e() {
        if (!this.m) {
            int iNumChildren = this.d.numChildren();
            for (int i = 0; i < iNumChildren; i++) {
                i childAt = this.d.getChildAt(i);
                Number3d number3d = this.j.get(i);
                PositionNumber3d positionNumber3dPosition = childAt.position();
                positionNumber3dPosition.x = (float) (((double) positionNumber3dPosition.x) + (((double) (number3d.x - childAt.position().x)) * 0.2d));
                PositionNumber3d positionNumber3dPosition2 = childAt.position();
                positionNumber3dPosition2.y = (float) (((double) positionNumber3dPosition2.y) + (((double) (number3d.y - childAt.position().y)) * 0.2d));
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.g.a(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void a(MotionEvent motionEvent) {
        this.g.e(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void b(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void c(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void b(com.tsf.shell.f.i.b bVar) {
        this.m = true;
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void c(com.tsf.shell.f.i.b bVar) {
        this.m = false;
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public boolean a(int i) {
        return false;
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void d(com.tsf.shell.f.i.b bVar) {
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void d(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void e(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void f(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void e(com.tsf.shell.f.i.b bVar) {
    }

    @Override // com.censivn.C3DEngine.b.h.b.d
    public void a(com.tsf.shell.f.i.b bVar, Number3d number3d) {
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        if (!this.n) {
            c();
            h();
            this.N = false;
            this.k = 0.0f;
            this.l = 0.0f;
        }
    }
}
