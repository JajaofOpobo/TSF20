package com.tsf.shell.p096f.p118e;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.C3358i;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.h */
/* loaded from: classes.dex */
public class C2603h {

    /* renamed from: d */
    private static C3358i f8571d;

    /* renamed from: e */
    private static C0980j f8572e;

    /* renamed from: f */
    private static C0975i f8573f;

    /* renamed from: g */
    private static C0975i f8574g;

    /* renamed from: h */
    private static C0975i f8575h;

    /* renamed from: i */
    private static String f8576i;

    /* renamed from: w */
    private static ViewGroup.LayoutParams f8577w;

    /* renamed from: l */
    private ArrayList<C0975i> f8580l;

    /* renamed from: m */
    private InterfaceC2610a f8581m;

    /* renamed from: n */
    private C0975i f8582n;

    /* renamed from: p */
    private C2640n f8584p;

    /* renamed from: s */
    private float f8587s;

    /* renamed from: t */
    private float f8588t;

    /* renamed from: u */
    private C0962a f8589u;

    /* renamed from: b */
    private static TextureElement f8569b = null;

    /* renamed from: c */
    private static TextureElement f8570c = null;

    /* renamed from: a */
    public static Color4 f8568a = new Color4();

    /* renamed from: j */
    private boolean f8578j = true;

    /* renamed from: k */
    private boolean f8579k = false;

    /* renamed from: o */
    private boolean f8583o = false;

    /* renamed from: r */
    private boolean f8586r = false;

    /* renamed from: v */
    private boolean f8590v = true;

    /* renamed from: q */
    private ArrayList<InterfaceC2639m> f8585q = new ArrayList<>();

    /* renamed from: com.tsf.shell.f.e.h$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2610a {
        /* renamed from: a */
        void mo1663a(InterfaceC2639m interfaceC2639m);

        /* renamed from: f */
        void mo1656f();

        /* renamed from: l_ */
        C2640n mo1655l_();
    }

    static {
        m5167i();
    }

    /* renamed from: a */
    public void m5197a(InterfaceC2610a interfaceC2610a) {
        this.f8581m = interfaceC2610a;
    }

    /* renamed from: a */
    public void m5199a(C0975i c0975i) {
        this.f8582n = c0975i;
    }

    /* renamed from: a */
    public void m5190a(boolean z) {
        this.f8586r = z;
    }

    /* renamed from: a */
    public void m5200a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (!this.f8579k) {
            C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.e.h.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C2603h.f8571d.getPointCount() <= 200) {
                        if (C2603h.this.f8578j) {
                            C2603h.this.f8587s = motionEvent.getX();
                            C2603h.this.f8588t = motionEvent.getY();
                            C2603h.this.f8580l = C3359a.f11094h.m4120G();
                            C2603h.this.f8578j = false;
                            C2603h.this.m5181c(motionEvent);
                            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.e.h.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C2603h.f8571d.m2778a(motionEvent.getX(), motionEvent.getY() + 38.0f);
                                }
                            });
                        }
                        if (C2603h.this.f8584p != null && C2603h.this.f8584p.m5085b()) {
                            C2603h.this.f8584p.m5095a().mo2129a(motionEvent, motionEvent2);
                            return;
                        }
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float x2 = motionEvent2.getX();
                        float y2 = motionEvent2.getY();
                        if (C4189x.m594b(C2603h.this.f8587s, C2603h.this.f8588t, x2, y2) > 10.0f) {
                            C2603h.this.f8587s = x2;
                            C2603h.this.f8588t = y2;
                            C2603h.this.m5202a((float) Math.sqrt(Math.pow(motionEvent.getX() - motionEvent2.getX(), 2.0d) + Math.pow(motionEvent.getY() - motionEvent2.getY(), 2.0d)));
                            C2603h.this.m5187b(motionEvent, motionEvent2);
                            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.e.h.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    C2603h.f8571d.m2776b(motionEvent2.getX(), motionEvent2.getY());
                                }
                            });
                            if (!C2603h.this.f8583o || C4189x.m594b(x, y, x2, y2) >= 50.0f) {
                                Iterator it = C2603h.this.f8580l.iterator();
                                while (it.hasNext()) {
                                    C0975i c0975i = (C0975i) it.next();
                                    if ((c0975i instanceof InterfaceC2639m) && c0975i != C2603h.this.f8582n) {
                                        InterfaceC2639m interfaceC2639m = (InterfaceC2639m) c0975i;
                                        if (!interfaceC2639m.mo3138e_() && interfaceC2639m.mo3141d() && C2603h.this.m5198a(c0975i, x, y, x2, y2)) {
                                            interfaceC2639m.mo3142b(true);
                                            C2603h.this.f8581m.mo1663a(interfaceC2639m);
                                            C2603h.this.f8583o = true;
                                            C2603h.this.f8585q.add(interfaceC2639m);
                                        }
                                    }
                                }
                                return;
                            }
                            C2603h.this.m5188b((MotionEvent) null);
                            return;
                        }
                        return;
                    }
                    C2603h.this.m5201a((MotionEvent) null);
                    C2603h.this.f8579k = true;
                    C2244e.m6012a(C2603h.f8576i);
                }
            });
        }
    }

    /* renamed from: a */
    public boolean m5198a(C0975i c0975i, float f, float f2, float f3, float f4) {
        Number3d clone = c0975i.position().m13946clone();
        clone.f2526x += C0892a.f2557H;
        clone.f2527y = C0892a.f2558I - clone.f2527y;
        if (m5203a(f, f2, f3, f4, c0975i.minX() + clone.f2526x, c0975i.minY() + clone.f2527y, c0975i.maxX() + clone.f2526x, c0975i.minY() + clone.f2527y) || m5203a(f, f2, f3, f4, c0975i.maxX() + clone.f2526x, c0975i.minY() + clone.f2527y, c0975i.maxX() + clone.f2526x, c0975i.maxY() + clone.f2527y) || m5203a(f, f2, f3, f4, c0975i.minX() + clone.f2526x, c0975i.maxY() + clone.f2527y, c0975i.maxX() + clone.f2526x, c0975i.maxY() + clone.f2527y)) {
            return true;
        }
        if (m5203a(f, f2, f3, f4, c0975i.minX() + clone.f2526x, c0975i.minY() + clone.f2527y, c0975i.minX() + clone.f2526x, clone.f2527y + c0975i.maxY())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m5204a() {
        return this.f8578j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m5188b(MotionEvent motionEvent) {
        this.f8584p = this.f8581m.mo1655l_();
        if (this.f8584p != null) {
            this.f8584p.m5088a(this);
            if (motionEvent == null) {
                this.f8584p.m5081c();
            } else {
                float[] m600a = C4189x.m600a(motionEvent, new float[2]);
                this.f8584p.m5093a((int) m600a[0], (int) m600a[1]);
                this.f8584p.m5075g();
            }
            m5171g();
        }
        return this.f8584p == null;
    }

    /* renamed from: g */
    private void m5171g() {
        m5169h();
        Iterator<InterfaceC2639m> it = this.f8585q.iterator();
        while (it.hasNext()) {
            it.next().mo3142b(false);
        }
        this.f8585q.clear();
    }

    /* renamed from: a */
    public void m5201a(MotionEvent motionEvent) {
        if (this.f8579k) {
            this.f8579k = false;
            return;
        }
        this.f8578j = true;
        m5171g();
        if (this.f8583o) {
            if (this.f8584p == null) {
                if (m5188b(motionEvent)) {
                    this.f8581m.mo1656f();
                }
            } else {
                this.f8584p.m5078d();
                if (!this.f8584p.m5085b()) {
                    this.f8581m.mo1656f();
                } else {
                    C0864d.m10805d().m10820a(this.f8584p.m5095a(), true);
                    if (this.f8584p != null && this.f8584p.m5085b()) {
                        this.f8584p.m5095a().mo1653f(null);
                    }
                }
            }
            this.f8583o = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5202a(float f) {
        f8573f.position().f2527y = 18.0f + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5181c(MotionEvent motionEvent) {
        float[] m595b = C4189x.m595b(motionEvent.getX(), motionEvent.getY());
        f8572e.position().f2526x = m595b[0];
        f8572e.position().f2527y = m595b[1];
        C3359a.f11096j.m2232a(f8572e);
        if (this.f8589u != null) {
            f8572e.addChild(this.f8589u);
        }
        if (this.f8586r) {
            C3359a.f11096j.m2232a(f8574g);
            f8574g.position().f2526x = m595b[0];
            f8574g.position().f2527y = m595b[1];
        }
        f8575h.position().f2526x = m595b[0];
        f8575h.position().f2527y = m595b[1];
        C3359a.f11096j.m2232a(f8575h);
        m5165j();
    }

    /* renamed from: h */
    private void m5169h() {
        if (f8572e.parent() != null) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.e.h.2
                @Override // java.lang.Runnable
                public void run() {
                    C2603h.f8571d.m2779a();
                    C2603h.m5164k();
                }
            });
            if (f8572e.parent() != null) {
                C3359a.f11096j.m2223b(f8572e);
            }
            if (f8574g.parent() != null) {
                C3359a.f11096j.m2223b(f8574g);
            }
            if (f8575h.parent() != null) {
                C3359a.f11096j.m2223b(f8575h);
            }
            if (this.f8589u != null) {
                this.f8589u.removeFromParent();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5187b(MotionEvent motionEvent, MotionEvent motionEvent2) {
        float atan;
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (y > 0.0f) {
            atan = ((float) (Math.atan(x / y) / 0.017453292519943295d)) + 180.0f;
        } else {
            atan = (float) (Math.atan(x / y) / 0.017453292519943295d);
        }
        f8572e.rotation().f2528z = atan;
        if ((atan < 181.0f) & (atan > -1.0f)) {
            if (this.f8590v) {
                this.f8590v = false;
                if (this.f8589u != null) {
                    C0964b m10456a = this.f8589u.m10456a(0);
                    m10456a.m10426b(true);
                    m10456a.m10420c(true);
                    m10456a.m10409g();
                }
            }
        } else if (!this.f8590v) {
            this.f8590v = true;
            if (this.f8589u != null) {
                C0964b m10456a2 = this.f8589u.m10456a(0);
                m10456a2.m10426b(false);
                m10456a2.m10420c(false);
                m10456a2.m10409g();
            }
        }
    }

    /* renamed from: i */
    private static void m5167i() {
        f8577w = new ViewGroup.LayoutParams(-1, -1);
        f8576i = C0853a.m10856d().getString(C1306b.C1315i.notic_line_picker_overflow);
        f8571d = new C3358i(C0853a.m10856d(), ThemeManager.mix.lasso.getTheme().shell.lassoLineColor);
        DynamicThemeRunnable dynamicThemeRunnable = new DynamicThemeRunnable() { // from class: com.tsf.shell.f.e.h.3
            @Override // com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable, com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
            public void onReloadTheme(ThemeDescription themeDescription) {
                C2603h.f8571d.m2777a(themeDescription.shell.lassoLineColor);
                C2603h.f8568a.set(themeDescription.shell.lassoSelectColor);
            }
        };
        f8568a.set(ThemeManager.mix.lasso.getTheme().shell.lassoSelectColor);
        ThemeManager.mix.lasso.addElementListener(dynamicThemeRunnable);
        f8572e = new C0980j();
        f8572e.setAnimationObjectState(true);
        f8570c = ThemeManager.mix.lasso.getTextureElement(ThemeShellDescription.PICKER_FOCUS, ItemInfo.APP_INTENT, ItemInfo.APP_INTENT);
        f8569b = ThemeManager.mix.lasso.getTextureElement(ThemeShellDescription.PICKER_POINT, 32, 32);
        f8575h = new C0981k(32.0f, 32.0f, 1, 1, true);
        f8575h.textures().addElement(f8569b);
        f8573f = new C0981k(32.0f, 32.0f, 1, 1, true);
        f8573f.textures().addElement(f8569b);
        f8572e.addChild(f8573f);
        f8574g = new C0981k(128.0f, 128.0f, 1, 1, true);
        f8574g.textures().addElement(f8570c);
    }

    /* renamed from: j */
    private static void m5165j() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.e.h.4
            @Override // java.lang.Runnable
            public void run() {
                C3359a.f11096j.m2234a(C2603h.f8571d, C2603h.f8577w);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static void m5164k() {
        C3359a.f11096j.m2235a(f8571d);
    }

    /* renamed from: a */
    private boolean m5203a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = ((d3 - d) * (d8 - d6)) - ((d4 - d2) * (d7 - d5));
        if (d9 == 0.0d) {
            return false;
        }
        double d10 = (((d2 - d6) * (d7 - d5)) - ((d - d5) * (d8 - d6))) / d9;
        double d11 = (((d2 - d6) * (d3 - d)) - ((d - d5) * (d4 - d2))) / d9;
        if (d10 < 0.0d || d10 > 1.0d || d11 < 0.0d || d11 > 1.0d) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m5189b() {
        this.f8584p = null;
    }
}
