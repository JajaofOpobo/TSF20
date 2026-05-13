package com.tsf.shell.p096f.p118e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p158c.C3134a;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.a */
/* loaded from: classes.dex */
public class C2448a {

    /* renamed from: a */
    private static C0980j f8057a;

    /* renamed from: b */
    private static C0981k f8058b;

    /* renamed from: c */
    private static C0981k f8059c;

    /* renamed from: d */
    private static float f8060d;

    /* renamed from: e */
    private static TextureElement f8061e;

    /* renamed from: f */
    private static TextureElement f8062f;

    /* renamed from: g */
    private static TextureElement f8063g;

    /* renamed from: h */
    private static int f8064h;

    /* renamed from: i */
    private static int f8065i;

    /* renamed from: j */
    private static C3112b f8066j;

    /* renamed from: k */
    private static C3112b.InterfaceC3116a f8067k;

    /* renamed from: l */
    private static C2651q f8068l;

    /* renamed from: m */
    private static C2572g f8069m;

    /* renamed from: n */
    private static C3112b f8070n;

    /* renamed from: o */
    private static C3112b f8071o;

    /* renamed from: p */
    private static ArrayList<C0975i> f8072p;

    /* renamed from: q */
    private static boolean f8073q = false;

    /* renamed from: a */
    public static void m5538a() {
        f8068l = new C2651q();
        f8069m = new C2572g();
        f8060d = 25.0f * C0892a.f2565a;
        f8067k = new C2452a();
        Bitmap m609a = C4189x.m609a(C1306b.C1310d.alignment_light);
        f8061e = C0853a.m10853g().m10544a(m609a, true);
        m609a.recycle();
        Bitmap m609a2 = C4189x.m609a(C1306b.C1310d.alignment_unmatch_bg);
        f8062f = C0853a.m10853g().m10544a(m609a2, true);
        f8065i = f8062f.f2529id;
        m609a2.recycle();
        Bitmap m609a3 = C4189x.m609a(C1306b.C1310d.alignment_match_bg);
        f8063g = C0853a.m10853g().m10544a(m609a3, true);
        f8064h = f8063g.f2529id;
        m609a3.recycle();
        f8057a = new C0980j() { // from class: com.tsf.shell.f.e.a.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C2448a.f8066j != null) {
                    C2448a.f8058b.position().f2527y = C2448a.f8066j.position().f2527y;
                    C2448a.f8059c.position().f2526x = C2448a.f8066j.position().f2526x;
                }
            }
        };
        f8057a.setAnimationObjectState(true);
        f8058b = m5534a(true);
        f8059c = m5534a(false);
        f8057a.addChild(f8058b);
        f8057a.addChild(f8059c);
    }

    /* renamed from: a */
    private static C0981k m5534a(boolean z) {
        C0981k c0981k;
        final C0981k c0981k2 = new C0981k(128.0f, 16.0f, false);
        c0981k2.useVBO(false);
        c0981k2.textures().addElement(f8061e);
        final C0981k c0981k3 = new C0981k(128.0f, 16.0f, false);
        c0981k3.useVBO(false);
        c0981k3.textures().addElement(f8061e);
        if (z) {
            c0981k = new C0981k(C0892a.f2555F, 16.0f, false) { // from class: com.tsf.shell.f.e.a.2
                @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
                public void onDrawStart() {
                    float f = C0892a.f2555F / 2;
                    float f2 = C2448a.f8066j.position().f2526x;
                    c0981k2.position().f2526x += 5.0f;
                    c0981k3.position().f2526x -= 5.0f;
                    if (c0981k2.position().f2526x > f) {
                        c0981k2.position().f2526x = f2;
                    }
                    if (c0981k3.position().f2526x < (-f)) {
                        c0981k3.position().f2526x = f2;
                    }
                }
            };
        } else {
            c0981k = new C0981k(C0892a.f2556G, 16.0f, false) { // from class: com.tsf.shell.f.e.a.3
                @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
                public void onDrawStart() {
                    float f = C0892a.f2556G / 2;
                    float f2 = C2448a.f8066j.position().f2527y;
                    c0981k2.position().f2526x += 5.0f;
                    c0981k3.position().f2526x -= 5.0f;
                    if (c0981k2.position().f2526x > f) {
                        c0981k2.position().f2526x = f2;
                    }
                    if (c0981k3.position().f2526x < (-f)) {
                        c0981k3.position().f2526x = f2;
                    }
                }
            };
            c0981k.rotation().f2528z = 90.0f;
        }
        if (z) {
            c0981k.textures().addElement(f8062f);
        } else {
            c0981k.textures().addElement(f8063g);
        }
        c0981k.useVBO(false);
        c0981k.addChild(c0981k3);
        c0981k.addChild(c0981k2);
        return c0981k;
    }

    /* renamed from: a */
    public static void m5537a(float f, float f2) {
        C3112b c3112b;
        float f3;
        C3112b c3112b2;
        float f4;
        float f5 = 2.1474836E9f;
        if (f8072p != null) {
            Iterator<C0975i> it = f8072p.iterator();
            C3112b c3112b3 = null;
            C3112b c3112b4 = null;
            float f6 = 2.1474836E9f;
            while (it.hasNext()) {
                C0975i next = it.next();
                if ((next instanceof C3112b) && !(next instanceof C3134a)) {
                    c3112b = (C3112b) next;
                    float abs = Math.abs(c3112b.position().f2526x - f);
                    float abs2 = Math.abs(c3112b.position().f2527y - f2);
                    if (abs < f8060d && abs < f6) {
                        c3112b4 = c3112b;
                        f6 = abs;
                    }
                    if (abs2 < f8060d && abs2 < f5) {
                        c3112b2 = c3112b4;
                        f4 = abs2;
                        f3 = f6;
                        f5 = f4;
                        f6 = f3;
                        c3112b4 = c3112b2;
                        c3112b3 = c3112b;
                    }
                }
                c3112b = c3112b3;
                f3 = f6;
                c3112b2 = c3112b4;
                f4 = f5;
                f5 = f4;
                f6 = f3;
                c3112b4 = c3112b2;
                c3112b3 = c3112b;
            }
            if (c3112b4 != null) {
                f8063g.f2529id = f8064h;
                if (c3112b4 != f8070n) {
                    if (f8070n != null) {
                        f8070n.mo3464F();
                    }
                    f8070n = c3112b4;
                    f8070n.mo3465E();
                }
                f8066j.position().f2526x = c3112b4.position().f2526x;
            } else {
                f8063g.f2529id = f8065i;
                if (f8070n != null) {
                    f8070n.mo3464F();
                    f8070n = null;
                }
                f8066j.position().f2526x = f;
            }
            if (c3112b3 != null) {
                f8062f.f2529id = f8064h;
                if (c3112b3 != f8071o) {
                    if (f8071o != null) {
                        f8071o.mo3464F();
                    }
                    f8071o = c3112b3;
                    f8071o.mo3465E();
                }
                f8066j.position().f2527y = c3112b3.position().f2527y;
                return;
            }
            f8062f.f2529id = f8065i;
            if (f8071o != null) {
                f8071o.mo3464F();
                f8071o = null;
            }
            f8066j.position().f2527y = f2;
        }
    }

    /* renamed from: a */
    public static void m5535a(C3112b c3112b) {
        C2932g m3486z = c3112b.m3486z();
        if (!f8073q && m3486z != null) {
            f8072p = m3486z.m4244R();
            f8073q = true;
            f8062f.f2529id = f8065i;
            f8063g.f2529id = f8065i;
            c3112b.m3509c(true);
            f8066j = c3112b;
            f8066j.setFocus();
            C0980j c0980j = (C0980j) c3112b.parent();
            c0980j.addChildAt(f8057a, c0980j.getChildIndexOf(c3112b));
            C0915b.m10597a(f8069m);
            C3359a.f11088b.m10565a(f8068l);
            f8058b.mo10368a(C0892a.f2555F);
            f8059c.mo10368a(C0892a.f2556G);
        }
    }

    /* renamed from: b */
    public static void m5533b() {
        if (f8073q) {
            if (f8071o != null) {
                f8071o.mo3464F();
            }
            if (f8070n != null) {
                f8070n.mo3464F();
            }
            f8066j.m3509c(false);
            f8057a.removeFromParent();
            C0915b.m10594b(f8069m);
            C3359a.f11088b.m10557b(f8068l);
            f8073q = false;
        }
    }

    /* renamed from: com.tsf.shell.f.e.a$a */
    /* loaded from: classes.dex */
    static class C2452a implements C3112b.InterfaceC3116a {
        C2452a() {
        }
    }

    /* renamed from: a */
    public static void m5536a(int i, int i2) {
        f8058b.mo10368a(C0892a.f2555F);
        f8059c.mo10368a(C0892a.f2556G);
    }
}
