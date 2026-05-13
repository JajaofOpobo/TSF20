package com.tsf.shell.p096f.p118e;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.e.n */
/* loaded from: classes.dex */
public class C2640n implements C0915b.InterfaceC0918a {

    /* renamed from: a */
    private static TextureElement f8687a;

    /* renamed from: b */
    private static TextureElement f8688b;

    /* renamed from: c */
    private static C0980j f8689c;

    /* renamed from: d */
    private static C0962a f8690d;

    /* renamed from: e */
    private static C0962a f8691e;

    /* renamed from: f */
    private static C0962a f8692f;

    /* renamed from: j */
    private static C0937a f8696j;

    /* renamed from: k */
    private static C2640n f8697k;

    /* renamed from: l */
    private static C1013b f8698l;

    /* renamed from: n */
    private static int f8700n;

    /* renamed from: o */
    private static int f8701o;

    /* renamed from: p */
    private C0980j f8702p;

    /* renamed from: q */
    private InterfaceC2648a f8703q;

    /* renamed from: r */
    private C2603h f8704r;

    /* renamed from: s */
    private boolean f8705s = false;

    /* renamed from: g */
    private static int f8693g = 5;

    /* renamed from: h */
    private static int f8694h = 360 / f8693g;

    /* renamed from: i */
    private static int f8695i = -1;

    /* renamed from: m */
    private static boolean f8699m = false;

    /* renamed from: com.tsf.shell.f.e.n$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2648a {
        /* renamed from: a */
        void mo1665a(int i);
    }

    static {
        m5066p();
    }

    public C2640n(C0980j c0980j, InterfaceC2648a interfaceC2648a) {
        this.f8702p = c0980j;
        this.f8703q = interfaceC2648a;
    }

    /* renamed from: a */
    public C0937a m5095a() {
        return f8696j;
    }

    /* renamed from: b */
    public boolean m5085b() {
        return this.f8705s;
    }

    /* renamed from: c */
    public void m5081c() {
        m5093a((int) this.f8702p.position().f2526x, (int) this.f8702p.position().f2527y);
    }

    /* renamed from: a */
    public void m5093a(int i, int i2) {
        if (!this.f8705s) {
            f8699m = false;
            f8697k = this;
            this.f8705s = true;
            f8689c.removeFromParent();
            f8689c.alpha(0.0f);
            f8689c.scale().f2526x = 0.0f;
            f8689c.scale().f2527y = 0.0f;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.n.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2640n.this.m5077e();
                }
            };
            c1017d.m10314a(255);
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            c1017d.m10313a((InterfaceC1011b) new C0986a.C0987a.C0990c());
            C1014c.m10325a(f8689c, 380, c1017d);
            f8700n = i;
            f8701o = i2;
            if (i + (C0892a.f2565a * 230.0f) > C0892a.f2550A) {
                i = (int) (C0892a.f2550A - (C0892a.f2565a * 230.0f));
                f8699m = true;
            } else if (i - (C0892a.f2565a * 230.0f) < C0892a.f2590z) {
                i = (int) (C0892a.f2590z + (C0892a.f2565a * 230.0f));
                f8699m = true;
            }
            if (i2 + (C0892a.f2565a * 150.0f) > C0892a.f2551B) {
                i2 = (int) (C0892a.f2551B - (C0892a.f2565a * 150.0f));
                f8699m = true;
            } else if (i2 - (C0892a.f2565a * 150.0f) < C0892a.f2552C) {
                i2 = (int) (C0892a.f2552C + (C0892a.f2565a * 150.0f));
                f8699m = true;
            }
            f8689c.position().setAll(i, i2, 0.0f);
            C3359a.f11096j.m2232a(f8689c);
            C0915b.m10597a(this);
        }
    }

    /* renamed from: a */
    public void m5092a(int i, boolean z) {
        if (this.f8705s) {
            this.f8705s = false;
            if (!z) {
                C0864d.m10805d().m10820a((C0937a) null, true);
            }
            C1014c.m10326a(f8689c);
            m5076f();
            this.f8703q.mo1665a(i);
            this.f8704r.m5189b();
            this.f8702p = null;
            this.f8703q = null;
            C3359a.f11096j.m2223b(f8689c);
            f8697k = null;
            C0915b.m10594b(this);
        }
    }

    /* renamed from: d */
    public void m5078d() {
        f8690d.setFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m5067o() {
        if (f8688b == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C0853a.m10856d().getString(C1306b.C1315i.pop_menu_arrangement));
            arrayList.add(C0853a.m10856d().getString(C1306b.C1315i.pop_menu_gather));
            arrayList.add(C0853a.m10856d().getString(C1306b.C1315i.text_delete));
            arrayList.add(C0853a.m10856d().getString(C1306b.C1315i.pop_menu_create_folder));
            arrayList.add(C0853a.m10856d().getString(C1306b.C1315i.pop_menu_mulit_choice));
            Bitmap m5063a = C2649o.m5063a(arrayList);
            f8688b = C0853a.m10853g().m10544a(m5063a, true);
            m5063a.recycle();
            f8692f.textures().clear();
            f8692f.textures().addElement(f8688b);
        }
    }

    /* renamed from: e */
    public void m5077e() {
        if (f8692f == null) {
            ThemeManager.mix.lasso.addElementListener(new DynamicThemeRunnable() { // from class: com.tsf.shell.f.e.n.2
                @Override // com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable, com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
                public void onReloadTheme(ThemeDescription themeDescription) {
                    if (C2640n.f8688b != null) {
                        C0853a.m10853g().m10543a(C2640n.f8688b);
                        TextureElement unused = C2640n.f8688b = null;
                    }
                    C2640n.this.m5067o();
                }
            });
            f8698l = new C1013b();
            f8692f = new C0962a(5, 32, 160, 160);
            for (int i = 0; i < 5; i++) {
                C0964b m10456a = f8692f.m10456a(i);
                m10456a.m10415d(0, i, 5, 1);
                m10456a.m10409g();
            }
        }
        m5067o();
        final int[][] iArr = {new int[]{0, 126}, new int[]{160, (int) (C0892a.f2565a * 54.0f)}, new int[]{136, -92}, new int[]{-136, -92}, new int[]{-166, 54}};
        f8692f.alpha(0.0f);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.n.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                for (int i2 = 0; i2 < 5; i2++) {
                    C0964b m10456a2 = C2640n.f8692f.m10456a(i2);
                    m10456a2.f2853m.spX(iArr[i2][0] * f);
                    m10456a2.f2853m.spY(iArr[i2][1] * f);
                    m10456a2.m10411f();
                }
                C2640n.f8692f.alpha((int) (255.0f * f));
            }
        };
        c1017d.m10314a(255);
        c1017d.m10313a((InterfaceC1011b) new C0986a.C0987a.C0990c());
        C1014c.m10325a(f8698l, 700, c1017d);
        f8689c.addChild(f8692f);
    }

    /* renamed from: f */
    public void m5076f() {
        if (f8692f != null) {
            C1014c.m10326a(f8698l);
            for (int i = 0; i < 5; i++) {
                C0964b m10456a = f8692f.m10456a(i);
                m10456a.f2853m.spX(0.0f);
                m10456a.f2853m.spY(0.0f);
                m10456a.m10411f();
            }
            f8692f.alpha(0.0f);
            f8692f.removeFromParent();
        }
    }

    /* renamed from: g */
    public void m5075g() {
        f8690d.setFocus();
    }

    /* renamed from: p */
    private static void m5066p() {
        f8687a = ThemeManager.mix.lasso.getTextureElement(ThemeShellDescription.PICKER_MENU, 240, 320);
        f8689c = new C0980j();
        f8690d = new C0962a(6, 40, 240, 320) { // from class: com.tsf.shell.f.e.n.4
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                if (C2640n.f8697k != null) {
                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.e.n.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (C2640n.f8697k != null) {
                                C2640n.f8697k.m5092a(-1, true);
                            }
                        }
                    });
                }
            }
        };
        f8690d.textures().addElement(f8687a);
        C0964b m10456a = f8690d.m10456a(0);
        m10456a.m10417d(64);
        m10456a.f2854n.f2528z = 0.0f;
        m10456a.m10415d(0, 2, 4, 3);
        m10456a.m10408h();
        m5089a(m10456a);
        C0964b m10456a2 = f8690d.m10456a(1);
        m10456a2.m10417d(64);
        m10456a2.f2854n.f2528z = f8694h * (-1);
        m10456a2.m10415d(0, 2, 4, 3);
        m10456a2.m10408h();
        m5089a(m10456a2);
        C0964b m10456a3 = f8690d.m10456a(2);
        m10456a3.m10417d(64);
        m10456a3.f2854n.f2528z = f8694h * (-2);
        m10456a3.m10415d(0, 2, 4, 3);
        m10456a3.m10408h();
        m5089a(m10456a3);
        C0964b m10456a4 = f8690d.m10456a(3);
        m10456a4.m10417d(64);
        m10456a4.f2854n.f2528z = f8694h * (-3);
        m10456a4.m10415d(0, 2, 4, 3);
        m10456a4.m10408h();
        m5089a(m10456a4);
        C0964b m10456a5 = f8690d.m10456a(4);
        m10456a5.m10417d(64);
        m10456a5.f2854n.f2528z = f8694h * (-4);
        m10456a5.m10415d(0, 2, 4, 3);
        m10456a5.m10408h();
        m5089a(m10456a5);
        C0964b m10456a6 = f8690d.m10456a(5);
        m10456a6.m10415d(0, 0, 2, 2);
        m10456a6.m10408h();
        f8691e = new C0962a(6, 40, 240, 320);
        f8691e.textures().addElement(f8687a);
        f8696j = new C0937a(f8690d) { // from class: com.tsf.shell.f.e.n.5
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C2640n.m5080c(C2640n.m5082b(motionEvent));
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (C2640n.f8695i != -1 && C2640n.f8695i != 5) {
                    C4187w.m614b();
                    C2640n.m5079c(C2640n.f8695i, false);
                    C2640n.f8697k.m5092a(C2640n.f8695i, false);
                    int unused = C2640n.f8695i = -1;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                int i = 5;
                if (!C2640n.f8699m) {
                    i = C2640n.m5082b(motionEvent2);
                } else {
                    float[] m595b = C4189x.m595b(motionEvent2.getX(), motionEvent2.getY());
                    if (C4189x.m594b(C2640n.f8700n, C2640n.f8701o, m595b[0], m595b[1]) > 50.0f) {
                        boolean unused = C2640n.f8699m = false;
                    }
                }
                C2640n.m5080c(i);
            }
        };
        m5064r();
        f8689c.addChild(f8690d);
        f8689c.addChild(f8691e);
    }

    /* renamed from: a */
    private static void m5089a(final C0964b c0964b) {
        C0937a c0937a = new C0937a(f8690d) { // from class: com.tsf.shell.f.e.n.6
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C2640n.m5080c(c0964b.f2832J);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (C2640n.f8695i != -1 && C2640n.f8695i != 5) {
                    C4187w.m614b();
                    C2640n.m5079c(C2640n.f8695i, false);
                    C2640n.f8697k.m5092a(C2640n.f8695i, false);
                    int unused = C2640n.f8695i = -1;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                int i = 5;
                if (!C2640n.f8699m) {
                    i = C2640n.m5082b(motionEvent2);
                } else {
                    float[] m595b = C4189x.m595b(motionEvent2.getX(), motionEvent2.getY());
                    if (C4189x.m594b(C2640n.f8700n, C2640n.f8701o, m595b[0], m595b[1]) > 50.0f) {
                        boolean unused = C2640n.f8699m = false;
                    }
                }
                C2640n.m5080c(i);
            }
        };
        c0964b.f2826D = new Number3d(0.5f, 1.0f, 1.0f);
        c0964b.f2827E = new Number3d(0.5f, 1.0f, 1.0f);
        c0964b.f2828F = new Number3d(0.5f, 1.0f, 1.0f);
        c0964b.f2829G = new Number3d(0.5f, 1.0f, 1.0f);
        c0964b.m10411f();
        c0964b.m10436a(c0937a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m5080c(int i) {
        f8689c.invalidate();
        if (i == -1) {
            if (f8695i != -1) {
                m5065q();
                f8695i = -1;
                return;
            }
            return;
        }
        if (f8695i == -1) {
        }
        if (i != f8695i) {
            m5065q();
            m5079c(i, true);
            f8695i = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m5082b(MotionEvent motionEvent) {
        float f;
        float atan;
        float[] m601a = C4189x.m601a(motionEvent);
        int i = (int) m601a[0];
        int i2 = (int) m601a[1];
        int i3 = (int) f8689c.position().f2526x;
        int i4 = (int) f8689c.position().f2527y;
        float m594b = C4189x.m594b(i3, i4, i, i2);
        float f2 = i - i3;
        if (i2 - i4 > 0.0f) {
            atan = (float) (Math.atan(f2 / f) / 0.017453292519943295d);
        } else {
            atan = ((float) (Math.atan(f2 / f) / 0.017453292519943295d)) + 180.0f;
        }
        if (atan < 0.0f) {
            atan += 360.0f;
        }
        float f3 = atan + (f8694h / 2);
        if (m594b < 50.0f * C0892a.f2565a) {
            return f8693g;
        }
        if (m594b > 200.0f * C0892a.f2565a) {
            return f8693g;
        }
        int i5 = (int) (f3 / f8694h);
        if (i5 == f8693g) {
            return i5 - 1;
        }
        return i5;
    }

    /* renamed from: q */
    private static void m5065q() {
        if (f8695i != -1) {
            m5079c(f8695i, false);
            f8695i = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m5079c(int i, boolean z) {
        switch (i) {
            case 0:
                if (z) {
                    f8691e.m10456a(i).m10440a(5, 0);
                    f8690d.m10456a(i).m10440a(0, 5);
                    return;
                }
                f8691e.m10456a(i).m10440a(4, 0);
                f8690d.m10456a(i).m10440a(0, 2);
                return;
            case 1:
                if (z) {
                    f8691e.m10456a(i).m10440a(5, 1);
                    f8690d.m10456a(i).m10440a(0, 5);
                    return;
                }
                f8691e.m10456a(i).m10440a(4, 1);
                f8690d.m10456a(i).m10440a(0, 2);
                return;
            case 2:
                if (z) {
                    f8691e.m10456a(i).m10440a(5, 2);
                    f8690d.m10456a(i).m10440a(0, 5);
                    return;
                }
                f8691e.m10456a(i).m10440a(4, 2);
                f8690d.m10456a(i).m10440a(0, 2);
                return;
            case 3:
                if (z) {
                    f8691e.m10456a(i).m10440a(5, 3);
                    f8690d.m10456a(i).m10440a(0, 5);
                    return;
                }
                f8691e.m10456a(i).m10440a(4, 3);
                f8690d.m10456a(i).m10440a(0, 2);
                return;
            case 4:
                if (z) {
                    f8691e.m10456a(i).m10440a(5, 4);
                    f8690d.m10456a(i).m10440a(0, 5);
                    return;
                }
                f8691e.m10456a(i).m10440a(4, 4);
                f8690d.m10456a(i).m10440a(0, 2);
                return;
            case 5:
                if (z) {
                    f8691e.m10456a(i).m10440a(5, 5);
                    f8690d.m10456a(i).m10440a(2, 0);
                    return;
                }
                f8691e.m10456a(i).m10440a(4, 5);
                f8690d.m10456a(i).m10440a(0, 0);
                return;
            default:
                return;
        }
    }

    /* renamed from: r */
    private static void m5064r() {
        for (int i = 0; i < 6; i++) {
            C0964b m10456a = f8691e.m10456a(i);
            if (i != 5) {
                m10456a.f2853m.spX((int) (Math.sin(f8694h * i * 0.017453292519943295d) * 65));
                m10456a.f2853m.spY((int) (Math.cos(f8694h * i * 0.017453292519943295d) * 65));
                m10456a.m10416d(1, 1);
                m10456a.m10411f();
            } else {
                m10456a.f2853m.spX(0.0f);
                m10456a.f2853m.spY(0.0f);
                m10456a.m10416d(1, 1);
                m10456a.m10411f();
            }
            m5079c(i, false);
        }
    }

    /* renamed from: a */
    public void m5088a(C2603h c2603h) {
        this.f8704r = c2603h;
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C0915b.m10594b(this);
            f8697k.m5092a(-1, true);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }
}
