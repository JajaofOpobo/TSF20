package com.tsf.shell.p096f.p118e;

import android.content.ContentValues;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0985n;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0968b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p187r.C3613a;
import com.tsf.shell.p095e.C2262d;
import com.tsf.shell.p096f.p153i.p155b.p157b.C3124a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
/* renamed from: com.tsf.shell.f.e.t */
/* loaded from: classes.dex */
public class C2663t extends C0980j implements C0915b.InterfaceC0918a {

    /* renamed from: a */
    private static C2663t f8758a;

    /* renamed from: b */
    private static C2668c f8759b;

    /* renamed from: c */
    private static C3124a f8760c;

    /* renamed from: d */
    private static C2262d.C2264b f8761d;

    /* renamed from: e */
    private static boolean f8762e = false;

    /* renamed from: f */
    private static C2667b f8763f;

    /* renamed from: com.tsf.shell.f.e.t$b */
    /* loaded from: classes.dex */
    public static class C2667b {
        /* renamed from: a */
        public void mo1870a() {
        }
    }

    /* renamed from: a */
    public static void m5026a() {
        f8758a.m5016h();
    }

    /* renamed from: b */
    public static void m5022b() {
        f8758a = new C2663t();
        f8759b = new C2668c(500.0f, 500.0f, new C0968b(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f), f8758a);
        f8758a.addChild(f8759b);
    }

    /* renamed from: a */
    public static void m5024a(C3124a c3124a) {
        m5023a(c3124a, (C2667b) null);
    }

    /* renamed from: a */
    public static void m5023a(C3124a c3124a, C2667b c2667b) {
        f8762e = true;
        f8763f = c2667b;
        f8760c = c3124a;
        C2262d.C2264b c2264b = (C2262d.C2264b) c3124a.f10163g.getLayoutParams();
        f8761d = c2264b;
        int i = c2264b.f7393d;
        int i2 = c2264b.f7394e;
        int i3 = (c2264b.f7390a - (C0892a.f2555F / 2)) + (i / 2);
        int i4 = ((C0892a.f2556G / 2) - c2264b.f7391b) - (i2 / 2);
        f8758a.removeFromParent();
        C3359a.f11096j.m2232a(f8758a);
        f8758a.position().f2526x = i3;
        f8758a.position().f2527y = i4;
        f8758a.m5021c().m5009a(i, i2);
        f8758a.m5021c().setFocus();
        f8758a.m5021c().m4990h();
        f8758a.m5021c().m5012a((-i) / 2, (-i2) / 2, i / 2, i2 / 2);
        C0915b.m10597a(f8758a);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(f8758a);
        C1014c.m10325a(f8758a, 250, c1017d);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m5016h();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m5016h() {
        if (f8762e) {
            f8759b.m4989i();
            f8760c = null;
            C0915b.m10594b(this);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.t.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2663t.f8758a.removeFromParent();
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this);
            C1014c.m10325a(this, 250, c1017d);
            f8762e = false;
            if (f8763f != null) {
                f8763f.mo1870a();
                f8763f = null;
            }
        }
    }

    /* renamed from: c */
    public C2668c m5021c() {
        return f8759b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.t$c */
    /* loaded from: classes.dex */
    public static class C2668c extends C0967a {

        /* renamed from: a */
        public static int f8772a = 120;

        /* renamed from: d */
        private int f8773d;

        /* renamed from: e */
        private int f8774e;

        /* renamed from: f */
        private DynamicTextureElement f8775f;

        /* renamed from: g */
        private C2668c f8776g;

        /* renamed from: h */
        private C2663t f8777h;

        /* renamed from: i */
        private C0981k f8778i;

        /* renamed from: j */
        private C0981k f8779j;

        /* renamed from: k */
        private C0981k f8780k;

        /* renamed from: l */
        private C0981k f8781l;

        /* renamed from: m */
        private C0985n f8782m;

        /* renamed from: n */
        private C1013b f8783n;

        /* renamed from: o */
        private int f8784o;

        /* renamed from: p */
        private float f8785p;

        /* renamed from: q */
        private float f8786q;

        /* renamed from: r */
        private float f8787r;

        /* renamed from: s */
        private float f8788s;

        /* renamed from: t */
        private int[] f8789t;

        public C2668c(float f, float f2, C0968b c0968b, C2663t c2663t) {
            super(f, f2, c0968b);
            this.f8784o = 3;
            this.f8789t = new int[4];
            this.f8776g = this;
            this.f8777h = c2663t;
            this.f8783n = new C1013b();
            this.f8775f = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON, 64, 64);
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.t.c.1
                @Override // java.lang.Runnable
                public void run() {
                    C2668c.this.f8773d = C2668c.this.f8775f.f2529id;
                }
            };
            this.f8775f.setReloadThemeRunnable(runnable);
            runnable.run();
            final DynamicTextureElement textureElement = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_RESIZE_UNMATCH_BUTTON, 64, 64);
            Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.e.t.c.2
                @Override // java.lang.Runnable
                public void run() {
                    C2668c.this.f8774e = textureElement.f2529id;
                }
            };
            textureElement.setReloadThemeRunnable(runnable2);
            runnable2.run();
            textures().addElement(C2463b.f8095e);
            this.f8782m = new C0985n();
            this.f8782m.setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.e.t.c.3

                /* renamed from: b */
                private float f8794b;

                /* renamed from: d */
                private float f8795d;

                /* renamed from: e */
                private float f8796e;

                /* renamed from: f */
                private float f8797f;

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: e */
                public void mo1654e(MotionEvent motionEvent) {
                    if (C2663t.f8762e) {
                        this.f8794b = C2663t.f8760c.position().f2526x;
                        this.f8795d = C2663t.f8760c.position().f2527y;
                        this.f8796e = C2668c.this.f8777h.position().f2526x;
                        this.f8797f = C2668c.this.f8777h.position().f2527y;
                        C2668c.this.f8777h.setAnimationObjectState(true);
                        C2668c.this.f8777h.invalidate();
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
                    if (C2663t.f8762e) {
                        float x = motionEvent2.getX() - motionEvent.getX();
                        float y = motionEvent2.getY() - motionEvent.getY();
                        if (this.f8794b + x + (C2663t.f8760c.f10161b.mo10366b() / 2.0f) <= C0892a.f2584t) {
                            if ((this.f8794b + x) - (C2663t.f8760c.f10161b.mo10366b() / 2.0f) < C0892a.f2582r) {
                                x = (C0892a.f2582r + (C2663t.f8760c.f10161b.mo10366b() / 2.0f)) - this.f8794b;
                            }
                        } else {
                            x = (C0892a.f2584t - (C2663t.f8760c.f10161b.mo10366b() / 2.0f)) - this.f8794b;
                        }
                        if ((this.f8795d - y) + (C2663t.f8760c.f10161b.mo10365c() / 2.0f) <= C0892a.f2583s) {
                            if ((this.f8795d - y) - (C2663t.f8760c.f10161b.mo10365c() / 2.0f) < C0892a.f2585u) {
                                y = ((-C0892a.f2585u) - (C2663t.f8760c.f10161b.mo10365c() / 2.0f)) + this.f8795d;
                            }
                        } else {
                            y = (-C0892a.f2583s) + (C2663t.f8760c.f10161b.mo10365c() / 2.0f) + this.f8795d;
                        }
                        C2663t.f8760c.position().f2526x = this.f8794b + x;
                        C2668c.this.f8777h.position().f2526x = x + this.f8796e;
                        C2663t.f8760c.position().f2527y = this.f8795d - y;
                        C2668c.this.f8777h.position().f2527y = this.f8797f - y;
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: f */
                public void mo1653f(MotionEvent motionEvent) {
                    if (C2663t.f8762e) {
                        C2668c.this.f8777h.setAnimationObjectState(false);
                        C2262d.C2264b c2264b = (C2262d.C2264b) C2663t.f8760c.f10163g.getLayoutParams();
                        int[] iArr = {(int) ((C2663t.f8760c.position().f2526x - (C2663t.f8760c.f10161b.mo10366b() / 2.0f)) + C0892a.f2557H), (int) (((-C2663t.f8760c.position().f2527y) + C0892a.f2558I) - (C2663t.f8760c.f10161b.mo10365c() / 2.0f)), c2264b.f7393d, c2264b.f7394e};
                        ItemInfo K = C2663t.f8760c.m3534K();
                        if (C0892a.f2564O) {
                            int i = iArr[0];
                            c2264b.f7390a = i;
                            K.cellX = i;
                            int i2 = iArr[1];
                            c2264b.f7391b = i2;
                            K.cellY = i2;
                        } else {
                            int i3 = iArr[0];
                            c2264b.f7390a = i3;
                            K.cellXH = i3;
                            int i4 = iArr[1];
                            c2264b.f7391b = i4;
                            K.cellYH = i4;
                        }
                        final C3124a c3124a = C2663t.f8760c;
                        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.e.t.c.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (c3124a != null && c3124a.f10163g != null) {
                                    c3124a.f10163g.requestLayout();
                                }
                            }
                        });
                    }
                }
            });
            addChild(this.f8782m);
            this.f8778i = m4999c(0);
            this.f8779j = m4999c(1);
            this.f8780k = m4999c(2);
            this.f8781l = m4999c(3);
            setMouseEventListener(new C0937a(this));
            mouseSkip(true);
            m5004b(0);
        }

        /* renamed from: a */
        public void m5012a(float f, float f2, float f3, float f4) {
            this.f8782m.setAABBPX(f, f2, 1.0f, f3, f4, 1.0f);
        }

        /* renamed from: g */
        public void m4993g() {
            m5012a(-m10384f(), -m10387d(), m10385e(), m10392a());
        }

        /* renamed from: b */
        private void m5004b(int i) {
            switch (i) {
                case 0:
                    textures().removeAll();
                    textures().addElement(C2463b.f8095e);
                    this.f8775f.f2529id = this.f8773d;
                    return;
                case 1:
                    textures().removeAll();
                    textures().addElement(C2463b.f8096f);
                    this.f8775f.f2529id = this.f8774e;
                    return;
                default:
                    return;
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onKillFocus() {
            C2663t.f8758a.m5016h();
        }

        /* renamed from: c */
        private C0981k m4999c(int i) {
            C0981k c0981k = new C0981k(64.0f, 64.0f);
            switch (i) {
                case 0:
                    c0981k.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    break;
                case 1:
                    c0981k.rotation().f2528z = 180.0f;
                    c0981k.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    break;
                case 2:
                    c0981k.rotation().f2528z = 90.0f;
                    c0981k.moveAllPointsSP(0.0f, -33.0f, 0.0f);
                    break;
                case 3:
                    c0981k.rotation().f2528z = 270.0f;
                    c0981k.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    break;
            }
            c0981k.calAABB();
            c0981k.maxY(c0981k.maxY() + (80.0f * C0892a.f2566b));
            c0981k.minY(c0981k.minY() + (C0892a.f2566b * 38.0f));
            c0981k.minX(c0981k.minX() - (C0892a.f2566b * 38.0f));
            c0981k.maxX(c0981k.maxX() + (C0892a.f2566b * 38.0f));
            c0981k.textures().addElement(this.f8775f);
            c0981k.setMouseEventListener(new C2665a(this.f8776g, this, i));
            addChild(c0981k);
            return c0981k;
        }

        /* renamed from: a */
        public void m5009a(final int i, final int i2) {
            final int i3;
            final int i4;
            if (i > i2) {
                i4 = C0892a.f2555F;
                i3 = (i4 * i2) / i;
            } else {
                i3 = C0892a.f2556G;
                i4 = (i3 * i) / i2;
            }
            this.f8776g.mo5013a(i + i4, i2 + i3);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.t.c.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    C2668c.this.f8776g.mo5013a(i + (i4 * (1.0f - f)), i2 + (i3 * (1.0f - f)));
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                }
            };
            c1017d.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.f8783n);
            C1014c.m10325a(this.f8783n, 250, c1017d);
            this.f8785p = i / 2;
            this.f8786q = i / 2;
            this.f8787r = i2 / 2;
            this.f8788s = i2 / 2;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0981k
        /* renamed from: a */
        public void mo5013a(float f, float f2) {
            super.m10389b(f, f2);
            float f3 = f / 2.0f;
            float f4 = f2 / 2.0f;
            this.f8778i.position().f2526x = 0.0f;
            this.f8778i.position().f2527y = (f4 - this.f8784o) - 1.0f;
            this.f8779j.position().f2526x = 0.0f;
            this.f8779j.position().f2527y = (-f4) + this.f8784o + 1.0f;
            this.f8780k.position().f2526x = (-f3) + this.f8784o;
            this.f8780k.position().f2527y = 0.0f;
            this.f8781l.position().f2526x = (f3 - this.f8784o) - 3.0f;
            this.f8781l.position().f2527y = 0.0f;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.p040b.C0967a
        /* renamed from: i */
        public void mo4988i(float f) {
            super.mo4988i(f);
            this.f8780k.position().f2526x = (-f) + this.f8784o;
            float f2 = (-m10384f()) + ((m10384f() + m10385e()) / 2.0f);
            this.f8778i.position().f2526x = f2;
            this.f8779j.position().f2526x = f2;
            m4993g();
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.p040b.C0967a
        /* renamed from: g */
        public void mo4992g(float f) {
            super.mo4992g(f);
            this.f8781l.position().f2526x = (f - this.f8784o) - 3.0f;
            float f2 = (-m10384f()) + ((m10384f() + m10385e()) / 2.0f);
            this.f8778i.position().f2526x = f2;
            this.f8779j.position().f2526x = f2;
            m4993g();
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.p040b.C0967a
        /* renamed from: c */
        public void mo5000c(float f) {
            super.mo5000c(f);
            this.f8778i.position().f2527y = (f - this.f8784o) - 1.0f;
            float a = m10392a() - ((m10387d() + m10392a()) / 2.0f);
            this.f8780k.position().f2527y = a;
            this.f8781l.position().f2527y = a;
            m4993g();
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.p040b.C0967a
        /* renamed from: e */
        public void mo4996e(float f) {
            super.mo4996e(f);
            this.f8779j.position().f2527y = (-f) + this.f8784o + 1.0f;
            float a = m10392a() - ((m10387d() + m10392a()) / 2.0f);
            this.f8780k.position().f2527y = a;
            this.f8781l.position().f2527y = a;
            m4993g();
        }

        /* renamed from: h */
        public void m4990h() {
        }

        /* renamed from: i */
        public void m4989i() {
            ItemInfo K = C2663t.f8760c.m3534K();
            if (C0892a.f2564O) {
                K.cellX = C2663t.f8761d.f7390a;
                K.cellY = C2663t.f8761d.f7391b;
                K.width = C2663t.f8761d.f7393d;
                K.height = C2663t.f8761d.f7394e;
            } else {
                K.cellXH = C2663t.f8761d.f7390a;
                K.cellYH = C2663t.f8761d.f7391b;
                K.widthH = C2663t.f8761d.f7393d;
                K.heightH = C2663t.f8761d.f7394e;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("cellX", K.cellX + "," + K.cellXH);
            contentValues.put("cellY", K.cellY + "," + K.cellYH);
            contentValues.put("spanX", K.width + "," + K.widthH);
            contentValues.put("spanY", K.height + "," + K.heightH);
            ShellModel.C3435a.m2371a(contentValues, K, (Runnable) null);
        }

        /* renamed from: j */
        public void m4987j() {
            C1014c.m10326a(this.f8783n);
        }

        /* renamed from: a */
        private int[] m5008a(int i, int i2, int i3, int i4, boolean z) {
            this.f8789t[0] = i;
            this.f8789t[1] = i2;
            this.f8789t[2] = i3;
            this.f8789t[3] = i4;
            if (z) {
                C3613a.m1888a(this.f8789t);
            } else {
                C3613a.m1887b(this.f8789t);
            }
            m5004b(0);
            return this.f8789t;
        }

        /* renamed from: b */
        private boolean m5003b(int i, int i2, int i3, int i4, boolean z) {
            boolean m1887b;
            this.f8789t[0] = i;
            this.f8789t[1] = i2;
            this.f8789t[2] = i3;
            this.f8789t[3] = i4;
            if (z) {
                m1887b = C3613a.m1888a(this.f8789t);
            } else {
                m1887b = C3613a.m1887b(this.f8789t);
            }
            if (m1887b) {
                m5004b(1);
                return false;
            }
            m5004b(0);
            return true;
        }

        /* renamed from: a */
        public void m5011a(int i) {
            boolean z = true;
            m5007a(i, true);
            switch (i) {
                case 0:
                    this.f8787r = C2663t.f8761d.f7394e - this.f8788s;
                    break;
                case 1:
                    this.f8788s = C2663t.f8761d.f7394e - this.f8787r;
                    z = false;
                    break;
                case 2:
                    this.f8785p = C2663t.f8761d.f7393d - this.f8786q;
                    break;
                case 3:
                    this.f8786q = C2663t.f8761d.f7393d - this.f8785p;
                    z = false;
                    break;
            }
            m5003b(C2663t.f8761d.f7390a, C2663t.f8761d.f7391b, C2663t.f8761d.f7393d, C2663t.f8761d.f7394e, z);
            final float f = m10384f();
            final float e = m10385e();
            final float a = m10392a();
            final float d = m10387d();
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.t.c.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f2) {
                    if (f != C2668c.this.f8785p) {
                        C2668c.this.f8776g.mo4988i(f + ((C2668c.this.f8785p - f) * f2));
                    }
                    if (e != C2668c.this.f8786q) {
                        C2668c.this.f8776g.mo4992g(e + ((C2668c.this.f8786q - e) * f2));
                    }
                    if (a != C2668c.this.f8787r) {
                        C2668c.this.f8776g.mo5000c(a + ((C2668c.this.f8787r - a) * f2));
                    }
                    if (d != C2668c.this.f8788s) {
                        C2668c.this.f8776g.mo4996e(d + ((C2668c.this.f8788s - d) * f2));
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                }
            };
            c1017d.m10313a((InterfaceC1011b) new C0986a.C0995c.C0996a());
            C1014c.m10326a(this.f8783n);
            C1014c.m10325a(this.f8783n, 1000, c1017d);
        }

        /* renamed from: a */
        private void m5007a(int i, boolean z) {
            switch (i) {
                case 0:
                    int a = (int) ((C0892a.f2558I - C2663t.f8758a.position().f2527y) - m10392a());
                    int d = ((int) ((C0892a.f2558I - C2663t.f8758a.position().f2527y) + m10387d())) - a;
                    if (z) {
                        int[] m5008a = m5008a(C2663t.f8761d.f7390a, a, C2663t.f8761d.f7393d, d, true);
                        C2663t.f8761d.f7391b = m5008a[1];
                        C2663t.f8761d.f7394e = m5008a[3];
                        C2663t.f8760c.m3457ag();
                        return;
                    }
                    m5003b(C2663t.f8761d.f7390a, a, C2663t.f8761d.f7393d, d, true);
                    return;
                case 1:
                    int a2 = (int) (m10392a() + m10387d());
                    if (z) {
                        int[] m5008a2 = m5008a(C2663t.f8761d.f7390a, C2663t.f8761d.f7391b, C2663t.f8761d.f7393d, a2, false);
                        C2663t.f8761d.f7394e = m5008a2[3];
                        C2663t.f8760c.m3457ag();
                        return;
                    }
                    m5003b(C2663t.f8761d.f7390a, C2663t.f8761d.f7391b, C2663t.f8761d.f7393d, a2, false);
                    return;
                case 2:
                    int f = (int) ((C2663t.f8758a.position().f2526x - m10384f()) + C0892a.f2557H);
                    int e = ((int) ((C2663t.f8758a.position().f2526x + m10385e()) + C0892a.f2557H)) - f;
                    if (z) {
                        int[] m5008a3 = m5008a(f, C2663t.f8761d.f7391b, e, C2663t.f8761d.f7394e, true);
                        C2663t.f8761d.f7390a = m5008a3[0];
                        C2663t.f8761d.f7393d = m5008a3[2];
                        C2663t.f8760c.m3457ag();
                        return;
                    }
                    m5003b(f, C2663t.f8761d.f7391b, e, C2663t.f8761d.f7394e, true);
                    return;
                case 3:
                    int f2 = (int) (m10384f() + m10385e());
                    if (z) {
                        int[] m5008a4 = m5008a(C2663t.f8761d.f7390a, C2663t.f8761d.f7391b, f2, C2663t.f8761d.f7394e, false);
                        C2663t.f8761d.f7393d = m5008a4[2];
                        C2663t.f8760c.m3457ag();
                        return;
                    }
                    m5003b(C2663t.f8761d.f7390a, C2663t.f8761d.f7391b, f2, C2663t.f8761d.f7394e, false);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void m5010a(int i, float f) {
            switch (i) {
                case 0:
                    if ((this.f8787r - f) + m10387d() < f8772a) {
                        f = (this.f8787r + m10387d()) - f8772a;
                    }
                    mo5000c(this.f8787r - f);
                    m5007a(i, false);
                    return;
                case 1:
                    if (this.f8788s + f + m10392a() < f8772a) {
                        f = (f8772a - this.f8788s) - m10392a();
                    }
                    mo4996e(this.f8788s + f);
                    m5007a(i, false);
                    return;
                case 2:
                    if ((this.f8785p - f) + m10385e() < f8772a) {
                        f = (this.f8785p + m10385e()) - f8772a;
                    }
                    mo4988i(this.f8785p - f);
                    m5007a(i, false);
                    return;
                case 3:
                    if (this.f8786q + f + m10384f() < f8772a) {
                        f = (f8772a - this.f8786q) - m10384f();
                    }
                    mo4992g(this.f8786q + f);
                    m5007a(i, false);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.t$a */
    /* loaded from: classes.dex */
    public static class C2665a extends C0937a {

        /* renamed from: a */
        private float f8765a;

        /* renamed from: b */
        private float f8766b;

        /* renamed from: d */
        private int f8767d;

        /* renamed from: e */
        private C2668c f8768e;

        /* renamed from: f */
        private boolean f8769f;

        public C2665a(C0975i c0975i, C2668c c2668c, int i) {
            super(c0975i);
            this.f8769f = false;
            this.f8768e = c2668c;
            this.f8767d = i;
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            final float y;
            if (this.f8769f) {
                if (this.f8767d == 0 || this.f8767d == 1) {
                    y = motionEvent2.getY() - this.f8766b;
                } else {
                    y = motionEvent2.getX() - this.f8765a;
                }
                C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.e.t.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2665a.this.f8768e.m5010a(C2665a.this.f8767d, y);
                    }
                });
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: e */
        public void mo1654e(MotionEvent motionEvent) {
            this.f8769f = true;
            this.f8765a = motionEvent.getX();
            this.f8766b = motionEvent.getY();
            this.f8768e.m4987j();
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: f */
        public void mo1653f(MotionEvent motionEvent) {
            this.f8769f = false;
            if (C2663t.f8762e) {
                this.f8768e.m5011a(this.f8767d);
            }
        }
    }
}
