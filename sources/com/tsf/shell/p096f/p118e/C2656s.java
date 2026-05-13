package com.tsf.shell.p096f.p118e;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0968b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
/* renamed from: com.tsf.shell.f.e.s */
/* loaded from: classes.dex */
public class C2656s extends C0980j implements C0915b.InterfaceC0918a, C0925e.InterfaceC0934a {

    /* renamed from: a */
    private static C2656s f8727a;

    /* renamed from: b */
    private static C2659a f8728b;

    /* renamed from: c */
    private static boolean f8729c = false;

    /* renamed from: d */
    private static C3112b f8730d;

    /* renamed from: e */
    private static Runnable f8731e;

    /* renamed from: a */
    public static void m5049a() {
        if (f8729c) {
            C0853a.m10865a().m10583c(f8731e);
        }
    }

    /* renamed from: a */
    public static void m5048a(float f, float f2) {
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(f8727a.position().f2526x + f);
        c1017d.mo10298h(f8727a.position().f2527y + f2);
        C1014c.m10326a(f8727a);
        C1014c.m10325a(f8727a, 250, c1017d);
    }

    /* renamed from: b */
    public static void m5046b() {
        f8727a.m5044d();
    }

    /* renamed from: c */
    public static void m5045c() {
        f8727a = new C2656s();
        f8731e = new Runnable() { // from class: com.tsf.shell.f.e.s.1
            @Override // java.lang.Runnable
            public void run() {
                C2656s.m5046b();
            }
        };
        f8728b = new C2659a(500.0f, 500.0f, new C0968b(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f));
        f8727a.addChild(f8728b);
    }

    /* renamed from: a */
    public static void m5047a(C3112b c3112b) {
        f8729c = true;
        f8730d = c3112b;
        f8730d.mo3471W();
        f8727a.removeFromParent();
        f8727a.rotation().f2528z = c3112b.rotation().f2528z;
        f8727a.position().setAllFrom(c3112b.position());
        C3359a.f11096j.m2232a(f8727a);
        f8727a.m5043e().m5039a(Math.abs(c3112b.minX() * c3112b.m3491u()), Math.abs(c3112b.maxX() * c3112b.m3491u()), Math.abs(c3112b.minY() * c3112b.m3491u()), Math.abs(c3112b.maxY() * c3112b.m3491u()));
        f8727a.m5043e().setFocus();
        f8727a.m5043e().m5030h();
        C0915b.m10597a(f8727a);
        C3359a.f11088b.m10565a(f8727a);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(f8727a);
        C1014c.m10325a(f8727a, 250, c1017d);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        m5044d();
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m5044d();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    /* renamed from: d */
    public void m5044d() {
        if (f8729c) {
            f8728b.m5029i();
            f8730d.mo3440X();
            f8730d = null;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.s.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2656s.f8727a.removeFromParent();
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this);
            C1014c.m10325a(this, 250, c1017d);
            C0915b.m10594b(this);
            C3359a.f11088b.m10557b(f8727a);
            f8729c = false;
        }
    }

    /* renamed from: e */
    public C2659a m5043e() {
        return f8728b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.s$a */
    /* loaded from: classes.dex */
    public static class C2659a extends C0967a {

        /* renamed from: a */
        private int f8733a;

        /* renamed from: d */
        private DynamicTextureElement f8734d;

        /* renamed from: e */
        private C2659a f8735e;

        /* renamed from: f */
        private C0981k f8736f;

        /* renamed from: g */
        private C0981k f8737g;

        /* renamed from: h */
        private C0981k f8738h;

        /* renamed from: i */
        private C0981k f8739i;

        /* renamed from: j */
        private C1013b f8740j;

        /* renamed from: k */
        private int f8741k;

        /* renamed from: l */
        private float f8742l;

        /* renamed from: m */
        private float f8743m;

        /* renamed from: n */
        private boolean f8744n;

        public C2659a(float f, float f2, C0968b c0968b) {
            super(f, f2, c0968b);
            this.f8741k = 3;
            this.f8742l = 1.0f;
            this.f8743m = 1.0f;
            this.f8744n = false;
            this.f8735e = this;
            this.f8740j = new C1013b();
            this.f8734d = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON, 64, 64);
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.s.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C2659a.this.f8733a = C2659a.this.f8734d.f2529id;
                }
            };
            this.f8734d.setReloadThemeRunnable(runnable);
            runnable.run();
            textures().addElement(C2463b.f8097g);
            this.f8736f = m5032c(0);
            this.f8737g = m5032c(1);
            this.f8738h = m5032c(2);
            this.f8739i = m5032c(3);
            setMouseEventListener(new C0937a(this));
            mouseSkip(true);
            m5034b(0);
        }

        /* renamed from: a */
        public int m5037a(C0975i c0975i) {
            Number3d.TEMPNUMBER3D3.reset();
            Number3d localToGlobal = this.f8736f.localToGlobal(Number3d.TEMPNUMBER3D3);
            Number3d.TEMPNUMBER3D3.reset();
            Number3d localToGlobal2 = this.f8737g.localToGlobal(Number3d.TEMPNUMBER3D3);
            Number3d.TEMPNUMBER3D3.reset();
            Number3d localToGlobal3 = this.f8738h.localToGlobal(Number3d.TEMPNUMBER3D3);
            Number3d.TEMPNUMBER3D3.reset();
            Number3d localToGlobal4 = this.f8739i.localToGlobal(Number3d.TEMPNUMBER3D3);
            float[] fArr = {localToGlobal.f2526x, localToGlobal2.f2526x, localToGlobal3.f2526x, localToGlobal4.f2526x};
            float[] fArr2 = {localToGlobal.f2527y, localToGlobal2.f2527y, localToGlobal3.f2527y, localToGlobal4.f2527y};
            Number3d.TEMPNUMBER3D3.reset();
            Number3d localToGlobal5 = c0975i.localToGlobal(Number3d.TEMPNUMBER3D3);
            float f = localToGlobal5.f2526x;
            float f2 = localToGlobal5.f2527y;
            float f3 = 2.1474836E9f;
            float f4 = -2.1474836E9f;
            float f5 = 2.1474836E9f;
            float f6 = -2.1474836E9f;
            int i = 0;
            while (i < 4) {
                float f7 = fArr[i];
                float f8 = fArr2[i];
                if (f7 > f4) {
                    f4 = f7;
                }
                if (f7 >= f3) {
                    f7 = f3;
                }
                if (f8 > f6) {
                    f6 = f8;
                }
                if (f8 >= f5) {
                    f8 = f5;
                }
                i++;
                f3 = f7;
                f5 = f8;
            }
            if (f == f4) {
                return 3;
            }
            if (f == f3) {
                return 2;
            }
            if (f2 == f5) {
                return 1;
            }
            if (f2 == f6) {
                return 0;
            }
            return 0;
        }

        /* renamed from: b */
        private void m5034b(int i) {
            switch (i) {
                case 0:
                    textures().removeAll();
                    textures().addElement(C2463b.f8097g);
                    this.f8734d.f2529id = this.f8733a;
                    return;
                default:
                    return;
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onKillFocus() {
            C2656s.f8727a.m5044d();
        }

        /* renamed from: c */
        private C0981k m5032c(int i) {
            C0981k c0981k = new C0981k(64.0f, 64.0f);
            switch (i) {
                case 0:
                    c0981k.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    c0981k.calAABB();
                    break;
                case 1:
                    c0981k.rotation().f2528z = 180.0f;
                    c0981k.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    c0981k.calAABB();
                    break;
                case 2:
                    c0981k.rotation().f2528z = 90.0f;
                    c0981k.moveAllPointsSP(0.0f, -33.0f, 0.0f);
                    c0981k.calAABB();
                    break;
                case 3:
                    c0981k.rotation().f2528z = 270.0f;
                    c0981k.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    c0981k.calAABB();
                    break;
            }
            c0981k.maxY(c0981k.maxY() + (70.0f * C0892a.f2566b));
            c0981k.minY(c0981k.minY() + (38.0f * C0892a.f2566b));
            c0981k.minX(c0981k.minX() - (C0892a.f2566b * 25.0f));
            c0981k.maxX(c0981k.maxX() + (C0892a.f2566b * 25.0f));
            c0981k.textures().addElement(this.f8734d);
            c0981k.setMouseEventListener(new C2662a(this.f8735e, this, c0981k));
            addChild(c0981k);
            return c0981k;
        }

        /* renamed from: a */
        public void m5039a(final float f, final float f2, final float f3, final float f4) {
            mo4988i(f * 2.0f);
            mo4992g(f2 * 2.0f);
            mo5000c(f4 * 2.0f);
            mo4996e(f3 * 2.0f);
            this.f8735e.updatePointsVBO();
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.s.a.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f5) {
                    float f6 = f + (f * (1.0f - f5));
                    float f7 = f2 + (f2 * (1.0f - f5));
                    float f8 = (f4 * (1.0f - f5)) + f4;
                    float f9 = f3 + (f3 * (1.0f - f5));
                    if (f6 < 0.0f) {
                        f6 = 0.0f;
                    }
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    }
                    float f10 = f9 >= 0.0f ? f9 : 0.0f;
                    C2659a.this.mo4988i(f6);
                    C2659a.this.mo4992g(f7);
                    C2659a.this.mo5000c(f8);
                    C2659a.this.mo4996e(f10);
                    C2659a.this.m5031g();
                    C2659a.this.f8735e.updatePointsVBO();
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                }
            };
            c1017d.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.f8740j);
            C1014c.m10325a(this.f8740j, 250, c1017d);
        }

        /* renamed from: g */
        public void m5031g() {
            PositionNumber3d position = this.f8738h.position();
            PositionNumber3d position2 = this.f8739i.position();
            float a = (m10392a() - m10387d()) / 2.0f;
            position2.f2527y = a;
            position.f2527y = a;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.p040b.C0967a
        /* renamed from: i */
        public void mo4988i(float f) {
            super.m10380j(f);
            this.f8738h.position().f2526x = (-f) + this.f8741k;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.p040b.C0967a
        /* renamed from: g */
        public void mo4992g(float f) {
            super.m10381h(f);
            this.f8739i.position().f2526x = (f - this.f8741k) - 3.0f;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.p040b.C0967a
        /* renamed from: c */
        public void mo5000c(float f) {
            super.m10386d(f);
            this.f8736f.position().f2527y = (f - this.f8741k) - 1.0f;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.p040b.C0967a
        /* renamed from: e */
        public void mo4996e(float f) {
            super.m10383f(f);
            this.f8737g.position().f2527y = (-f) + this.f8741k + 1.0f;
        }

        /* renamed from: h */
        public void m5030h() {
        }

        /* renamed from: i */
        public void m5029i() {
            this.f8744n = false;
            setAnimationObjectState(false);
        }

        /* renamed from: j */
        public void m5028j() {
            float m3491u = C2656s.f8730d.m3491u();
            this.f8743m = m3491u;
            this.f8742l = m3491u;
            this.f8744n = true;
            setAnimationObjectState(true);
            C1014c.m10326a(this.f8740j);
        }

        /* renamed from: a */
        public void m5038a(int i) {
            this.f8744n = false;
        }

        /* renamed from: k */
        public void m5027k(float f) {
            this.f8742l = f;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (this.f8744n || getAnimationObjectState()) {
                if (this.f8742l > C2656s.f8730d.m3523V()) {
                    this.f8742l = C2656s.f8730d.m3523V();
                } else if (this.f8742l < C2656s.f8730d.m3524U()) {
                    this.f8742l = C2656s.f8730d.m3524U();
                }
                this.f8743m += (this.f8742l - this.f8743m) * 0.2f;
                if (!this.f8744n && Math.abs(this.f8743m - this.f8742l) < 0.005d) {
                    setAnimationObjectState(false);
                    this.f8743m = this.f8742l;
                }
                C2656s.f8730d.m3519a(this.f8743m);
                mo4988i((-C2656s.f8730d.minX()) * this.f8743m);
                mo4992g(C2656s.f8730d.maxX() * this.f8743m);
                mo5000c(C2656s.f8730d.maxY() * this.f8743m);
                mo4996e((-C2656s.f8730d.minY()) * this.f8743m);
                m5031g();
                this.f8735e.updatePointsVBO();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tsf.shell.f.e.s$a$a */
        /* loaded from: classes.dex */
        public static class C2662a extends C0937a {

            /* renamed from: a */
            private float f8751a;

            /* renamed from: b */
            private float f8752b;

            /* renamed from: d */
            private float f8753d;

            /* renamed from: e */
            private C2659a f8754e;

            /* renamed from: f */
            private boolean f8755f;

            /* renamed from: g */
            private int f8756g;

            /* renamed from: h */
            private C0975i f8757h;

            public C2662a(C0975i c0975i, C2659a c2659a, C0975i c0975i2) {
                super(c0975i);
                this.f8755f = false;
                this.f8754e = c2659a;
                this.f8757h = c0975i2;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f8755f && C2656s.f8729c) {
                    switch (this.f8756g) {
                        case 0:
                            this.f8754e.m5027k((this.f8753d - (motionEvent2.getY() - this.f8752b)) / C2656s.f8730d.maxY());
                            return;
                        case 1:
                            this.f8754e.m5027k((this.f8753d - (this.f8752b - motionEvent2.getY())) / Math.abs(C2656s.f8730d.minY()));
                            return;
                        case 2:
                            this.f8754e.m5027k((this.f8753d - (motionEvent2.getX() - this.f8751a)) / Math.abs(C2656s.f8730d.minX()));
                            return;
                        case 3:
                            this.f8754e.m5027k((this.f8753d - (this.f8751a - motionEvent2.getX())) / C2656s.f8730d.maxX());
                            return;
                        default:
                            return;
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                if (C2656s.f8729c) {
                    this.f8755f = true;
                    this.f8754e.m5028j();
                    this.f8751a = motionEvent.getX();
                    this.f8752b = motionEvent.getY();
                    this.f8756g = this.f8754e.m5037a(this.f8757h);
                    switch (this.f8756g) {
                        case 0:
                            this.f8753d = this.f8754e.m10392a();
                            return;
                        case 1:
                            this.f8753d = this.f8754e.m10387d();
                            return;
                        case 2:
                            this.f8753d = this.f8754e.m10384f();
                            return;
                        case 3:
                            this.f8753d = this.f8754e.m10385e();
                            return;
                        default:
                            return;
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (this.f8755f) {
                    this.f8755f = false;
                    if (C2656s.f8729c) {
                        this.f8754e.m5038a(this.f8756g);
                    }
                }
            }
        }
    }
}
