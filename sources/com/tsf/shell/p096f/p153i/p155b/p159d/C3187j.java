package com.tsf.shell.p096f.p153i.p155b.p159d;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0985n;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.p184a.C3561a;
import com.tsf.shell.preference.p196a.p197a.C4047f;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.theme.inside.mix.ThemeFolderManager;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.b.d.j */
/* loaded from: classes.dex */
public class C3187j implements C0925e.InterfaceC0934a {

    /* renamed from: N */
    public static C3186i f10395N;

    /* renamed from: O */
    public static C3186i f10396O;

    /* renamed from: P */
    public static float f10397P;

    /* renamed from: Q */
    public static float f10398Q;

    /* renamed from: R */
    public static float f10399R;

    /* renamed from: S */
    public static float f10400S;

    /* renamed from: Z */
    private static C0962a f10401Z;

    /* renamed from: E */
    public C0980j f10406E;

    /* renamed from: F */
    public C0980j f10407F;

    /* renamed from: G */
    public C0980j f10408G;

    /* renamed from: H */
    public C0981k f10409H;

    /* renamed from: I */
    public C3185h f10410I;

    /* renamed from: J */
    public C0985n f10411J;

    /* renamed from: K */
    public int f10412K;

    /* renamed from: L */
    public ArrayList<ThemeFolderDescription.SystemFolderChild> f10413L;

    /* renamed from: M */
    public C0937a f10414M;

    /* renamed from: T */
    private C1017d f10415T;

    /* renamed from: U */
    private C1017d f10416U;

    /* renamed from: W */
    private C3174f f10418W;

    /* renamed from: X */
    private C4047f f10419X;

    /* renamed from: a */
    public int f10421a;

    /* renamed from: b */
    public int f10422b;

    /* renamed from: c */
    public int f10423c;

    /* renamed from: d */
    public int f10424d;

    /* renamed from: e */
    public int f10425e;

    /* renamed from: f */
    public int f10426f;

    /* renamed from: g */
    public int f10427g;

    /* renamed from: h */
    public int f10428h;

    /* renamed from: i */
    public int f10429i;

    /* renamed from: j */
    public int f10430j;

    /* renamed from: k */
    public int f10431k;

    /* renamed from: l */
    public int f10432l;

    /* renamed from: m */
    public int f10433m;

    /* renamed from: n */
    public int f10434n;

    /* renamed from: o */
    public int f10435o;

    /* renamed from: p */
    public int f10436p;

    /* renamed from: q */
    public int f10437q;

    /* renamed from: r */
    public int f10438r;

    /* renamed from: s */
    public int f10439s;

    /* renamed from: t */
    public int f10440t;

    /* renamed from: u */
    public float f10441u;

    /* renamed from: v */
    public float f10442v;

    /* renamed from: w */
    public float f10443w;

    /* renamed from: x */
    public float f10444x;

    /* renamed from: y */
    public TextureElement f10445y = new TextureElement(0, false);

    /* renamed from: z */
    public TextureElement f10446z = null;

    /* renamed from: A */
    public TextureElement f10402A = null;

    /* renamed from: B */
    public TextureElement f10403B = null;

    /* renamed from: C */
    public TextureElement f10404C = null;

    /* renamed from: D */
    public TextureElement f10405D = null;

    /* renamed from: V */
    private boolean f10417V = false;

    /* renamed from: Y */
    private ThemeFolderManager f10420Y = ThemeManager.mix.folder;

    public C3187j() {
        C3359a.f11088b.m10565a(this);
        this.f10419X = new C4047f() { // from class: com.tsf.shell.f.i.b.d.j.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
            /* renamed from: g */
            public void mo552g() {
                super.mo552g();
                C3187j.this.m3226b();
            }
        };
        m3217j();
        m3216k();
        m3213n();
        m3212o();
        m3211p();
        m3210q();
        m3214m();
    }

    /* renamed from: a */
    public void m3233a() {
        this.f10418W.m5350c();
        this.f10419X.m10506d();
        this.f10407F.mouseEnabled(false);
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(C0892a.f2553D);
        c1017d.m10313a(C0986a.f2946a);
        c1017d.m10314a(50);
        C1014c.m10326a(this.f10407F);
        C1014c.m10325a(this.f10407F, 500, c1017d);
    }

    /* renamed from: b */
    public void m3226b() {
        this.f10418W.m5351b();
        this.f10407F.mouseEnabled(true);
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(0.0f);
        c1017d.m10313a(C0986a.f2946a);
        c1017d.m10314a(255);
        C1014c.m10326a(this.f10407F);
        C1014c.m10325a(this.f10407F, 500, c1017d);
    }

    /* renamed from: c */
    public ThemeDescription m3224c() {
        return this.f10420Y.getTheme();
    }

    /* renamed from: d */
    public boolean m3223d() {
        if (!m3222e().m5355a()) {
            return this.f10419X.m10517a();
        }
        m3222e().m5348e();
        return true;
    }

    /* renamed from: e */
    public C3174f m3222e() {
        return this.f10418W;
    }

    /* renamed from: f */
    public void m3221f() {
        m3217j();
        m3216k();
        m3212o();
    }

    /* renamed from: m */
    private void m3214m() {
        this.f10415T = new C1017d() { // from class: com.tsf.shell.f.i.b.d.j.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3187j.this.f10410I.visible(false);
            }
        };
        this.f10415T.m10314a(0);
        this.f10416U = new C1017d();
        this.f10416U.m10314a(210);
    }

    /* renamed from: a */
    public void m3232a(int i) {
        float f = (this.f10423c / i) * (this.f10438r - this.f10439s);
        if (f > this.f10437q) {
            f = this.f10437q;
        }
        this.f10434n = (int) f;
        this.f10435o = this.f10434n / 2;
        this.f10410I.m3241c(this.f10435o);
        this.f10410I.m3240d(this.f10435o);
        this.f10440t = (this.f10438r - this.f10439s) - this.f10434n;
    }

    /* renamed from: g */
    public void m3220g() {
        this.f10410I.position().f2527y = this.f10439s;
        this.f10410I.visible(false);
    }

    /* renamed from: h */
    public void m3219h() {
        if (!this.f10417V) {
            this.f10417V = true;
            C1014c.m10326a(this.f10410I);
            C1014c.m10325a(this.f10410I, VEasing.Linear.easeNone, this.f10416U);
            this.f10410I.visible(true);
        }
    }

    /* renamed from: i */
    public void m3218i() {
        if (this.f10417V) {
            this.f10417V = false;
            C1014c.m10326a(this.f10410I);
            C1014c.m10325a(this.f10410I, VEasing.Linear.easeNone, this.f10415T);
        }
    }

    /* renamed from: n */
    private void m3213n() {
        f10395N = new C3186i(1.0f, C0892a.f2566b * 11.0f, true, m3224c());
        f10395N.visible(false);
        f10395N.alpha(0.0f);
        f10396O = new C3186i(1.0f, C0892a.f2566b * 11.0f, false, m3224c());
        f10396O.visible(false);
        f10396O.alpha(0.0f);
    }

    /* renamed from: j */
    public void m3217j() {
        this.f10412K = m3224c().folder.sampleCount;
        this.f10413L = m3224c().folder.sampleList;
    }

    /* renamed from: k */
    public void m3216k() {
        this.f10403B = C4189x.m592b(C1306b.C1310d.widget_folder_add_button, C3489a.f11522i, C3489a.f11522i);
        this.f10404C = C4189x.m592b(C1306b.C1310d.widget_folder_multi_choice, C3489a.f11522i, C3489a.f11522i);
        this.f10405D = C4189x.m592b(C1306b.C1310d.widget_folder_rename, C3489a.f11522i, C3489a.f11522i);
        if (m3224c().folder.backPlaneEnable) {
            Bitmap bitmapFromCache = m3224c().getBitmapFromCache(ThemeFolderDescription.BACK_PLANE, m3224c().folder.backPlaneWidth, m3224c().folder.backPlaneHeight);
            if (bitmapFromCache == null) {
                bitmapFromCache = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            this.f10446z = C0853a.m10853g().m10539a(this.f10446z, bitmapFromCache, true);
            bitmapFromCache.recycle();
        } else if (this.f10446z != null) {
            C0853a.m10853g().m10543a(this.f10446z);
            this.f10446z = null;
        }
        if (m3224c().folder.frontPlaneEnable) {
            Bitmap bitmapFromCache2 = m3224c().getBitmapFromCache(ThemeFolderDescription.FRONT_PLANE, m3224c().folder.frontPlaneWidth, m3224c().folder.frontPlaneHeight);
            if (bitmapFromCache2 == null) {
                bitmapFromCache2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            this.f10402A = C0853a.m10853g().m10539a(this.f10402A, bitmapFromCache2, true);
            bitmapFromCache2.recycle();
        } else if (this.f10402A != null) {
            C0853a.m10853g().m10543a(this.f10402A);
            this.f10402A = null;
        }
        if (this.f10406E == null) {
            this.f10407F = new C0980j();
            this.f10418W = new C3174f();
            this.f10418W.m5354a(this.f10407F);
            this.f10406E = new C0980j();
            this.f10406E.scale().f2526x = 0.0f;
            this.f10406E.scale().f2527y = 0.0f;
            this.f10406E.alpha(0.0f);
            this.f10434n = (int) (80.0f * C0892a.f2566b);
            this.f10435o = this.f10434n / 2;
            this.f10436p = (int) (C0892a.f2566b * 12.0f);
            this.f10410I = new C3185h(C0892a.f2566b * 12.0f, this.f10434n);
            this.f10410I.setDefaultColor(new Color4(255, 255, 255, 100));
            this.f10410I.alpha(0.0f);
            this.f10410I.visible(false);
            this.f10408G = new C0980j();
            this.f10409H = new C0981k(500.0f * C0892a.f2567c, 64.0f * C0892a.f2567c, 1, 1);
            this.f10409H.calAABB();
            this.f10409H.textures().addElement(this.f10445y);
            this.f10408G.addChild(this.f10409H);
            this.f10406E.addChild(this.f10408G);
            this.f10406E.addChild(this.f10410I);
            this.f10407F.addChild(this.f10406E);
            this.f10411J = new C0985n();
            this.f10411J.setMouseEventListener(new C0937a(this.f10411J) { // from class: com.tsf.shell.f.i.b.d.j.3
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (C3145b.f10240k != null) {
                        C3145b.f10240k.m3377aF().m3274a(motionEvent, motionEvent2, f, f2);
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: b */
                public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (C3145b.f10240k != null) {
                        C3145b.f10240k.m3377aF().m3278a(f2);
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: g */
                public void mo3208g(MotionEvent motionEvent) {
                    if (C3145b.f10240k != null) {
                        C3145b.f10240k.m3377aF().m3278a(0.0f);
                    }
                }
            });
            this.f10408G.addChildAt(this.f10411J, 0);
        }
        m3225b(true);
    }

    /* renamed from: b */
    private void m3225b(boolean z) {
        int i = 1;
        if (f10401Z != null) {
            f10401Z.destroy();
        }
        int i2 = m3224c().folder.backPlaneEnable ? 2 : 1;
        if (m3224c().folder.frontPlaneEnable) {
            i2++;
        }
        if (m3224c().folder.sizePlaneEnable) {
            i2++;
        }
        f10401Z = new C0962a(i2 + m3224c().folder.sampleCount, 0, 0);
        f10401Z.useVBO(false);
        if (m3224c().folder.backPlaneEnable) {
            C0964b m10456a = f10401Z.m10456a(0);
            m10456a.m10431b(m3224c().folder.backPlaneWidth);
            m10456a.m10418d(m3224c().folder.backPlaneHeight);
            m10456a.f2853m.f2526x = m3224c().folder.backPlaneX;
            m10456a.f2853m.f2527y = m3224c().folder.backPlaneY;
            m10456a.m10408h();
        } else {
            i = 0;
        }
        if (m3224c().folder.frontPlaneEnable) {
            C0964b m10456a2 = f10401Z.m10456a(i);
            m10456a2.m10431b(m3224c().folder.frontPlaneWidth);
            m10456a2.m10418d(m3224c().folder.frontPlaneHeight);
            m10456a2.f2853m.f2526x = m3224c().folder.frontPlaneX;
            m10456a2.f2853m.f2527y = m3224c().folder.frontPlaneY;
            m10456a2.m10408h();
            i++;
        }
        if (m3224c().folder.sizePlaneEnable) {
            C0964b m10456a3 = f10401Z.m10456a(i);
            m10456a3.m10431b(m3224c().folder.sizePlaneWidth);
            m10456a3.m10418d(m3224c().folder.sizePlaneHeight);
            m10456a3.f2853m.f2526x = m3224c().folder.sizePlaneX;
            m10456a3.f2853m.f2527y = m3224c().folder.sizePlaneY;
            m10456a3.m10408h();
            i++;
        }
        float f = C3566b.f11839a.f11750H;
        float f2 = C3566b.f11839a.f11751I;
        for (int i3 = 0; i3 < m3224c().folder.sampleCount; i3++) {
            ThemeFolderDescription.SystemFolderChild systemFolderChild = m3224c().folder.getSampleInformaiton().get(i3);
            C0964b m10456a4 = f10401Z.m10456a(i);
            m10456a4.m10431b(f);
            m10456a4.m10418d(f2);
            m10456a4.f2853m.f2526x = systemFolderChild.position.f2526x + m3224c().folder.childContainerX;
            m10456a4.f2853m.f2527y = systemFolderChild.position.f2527y + m3224c().folder.childContainerY;
            m10456a4.f2855o.f2526x = systemFolderChild.scale.f2526x;
            m10456a4.f2855o.f2527y = systemFolderChild.scale.f2527y;
            m10456a4.f2854n.f2528z = systemFolderChild.rotation.f2528z;
            m10456a4.m10423c(C3566b.f11839a.f11767Y);
            m10456a4.m10408h();
            i++;
        }
        f10401Z.calAABB();
        f10401Z.minX();
        f10401Z.minY();
        f10401Z.maxX();
        f10401Z.maxY();
        C0964b m10456a5 = f10401Z.m10456a(i);
        m10456a5.m10431b(m3224c().folder.textPlaneWidth);
        m10456a5.m10418d(m3224c().folder.textPlaneHeight);
        m10456a5.f2853m.f2526x = m3224c().folder.textPlaneX;
        m10456a5.f2853m.f2527y = m3224c().folder.textPlaneY;
        m10456a5.m10408h();
        int i4 = i + 1;
        f10401Z.calAABB();
        f10397P = f10401Z.minX();
        f10399R = f10401Z.minY();
        f10398Q = f10401Z.maxX();
        f10400S = f10401Z.maxY();
    }

    /* renamed from: o */
    private void m3212o() {
        int i = (int) (C3566b.f11839a.f11762T - (C0892a.f2567c * 30.0f));
        int i2 = (int) (C3566b.f11839a.f11763U + (10.0f * C0892a.f2567c));
        int i3 = C0892a.f2553D - ((int) ((70.0f * C0892a.f2566b) * 2.0f));
        int i4 = i3 > i * 10 ? i * 10 : i3;
        float m10742a = C0892a.f2564O ? 0.0f : C0892a.m10742a(80.0f);
        int i5 = C0892a.f2554E - ((int) (((230.0f - m10742a) * C0892a.f2566b) * 2.0f));
        int i6 = i5 > i2 * 7 ? i2 * 7 : i5;
        int[] m606a = C4189x.m606a(i4 - ((int) (80.0f * C0892a.f2566b)), i6 - ((int) (m10742a + (180.0f * C0892a.f2566b))), i, i2, 0, 0);
        this.f10421a = m606a[0];
        this.f10422b = m606a[1];
        this.f10423c = this.f10421a * this.f10422b;
        this.f10429i = m606a[2];
        this.f10430j = m606a[3];
        if (this.f10430j < i2) {
            this.f10430j = i2;
            this.f10422b = 1;
            this.f10423c = this.f10421a * this.f10422b;
        }
        this.f10425e = i4;
        this.f10424d = i6;
        this.f10426f = (this.f10425e / 2) + 30;
        this.f10427g = (this.f10424d / 2) + 30;
        int i7 = C0892a.f2559J;
        this.f10433m = (C0892a.f2558I - ((int) (128.0f * C0892a.f2566b))) - C0892a.f2560K;
        this.f10428h = ((int) ((57.6f * C0892a.f2566b) - (i7 / 2))) + (C0892a.f2560K / 2);
        this.f10432l = ((C0892a.f2553D - ((this.f10421a - 1) * this.f10429i)) / 2) - (C0892a.f2553D / 2);
        this.f10431k = (((((this.f10424d / 2) + this.f10433m) - this.f10428h) - m3224c().folder.childContainerY) - i7) + C0892a.f2560K;
        int i8 = (int) (this.f10425e + (140.0f * C0892a.f2566b));
        int i9 = (int) (this.f10424d + (140.0f * C0892a.f2566b));
        this.f10406E.position().f2527y = this.f10428h;
        this.f10409H.position().f2526x = 0.0f;
        this.f10409H.position().f2527y = (i9 / 2) - (C0892a.f2566b * 30.0f);
        this.f10408G.setAABBPX((-i8) / 2.0f, (-i9) / 2, 0.0f, i8 / 2.0f, i9 / 2, 0.0f);
        this.f10411J.setAABBPX(((-i8) / 2) + (50.0f * C0892a.f2567c), (-i9) / 2, 0.0f, (i8 / 2) - (50.0f * C0892a.f2567c), i9 / 2, 0.0f);
        this.f10409H.maxX(i8 / 2);
        this.f10443w = this.f10431k - (this.f10430j * (this.f10422b - 1));
        this.f10441u = this.f10431k + C3566b.f11839a.f11757O + (23.0f * C0892a.f2567c);
        this.f10442v = this.f10431k - ((this.f10422b - 1) * this.f10430j);
        this.f10444x = m3224c().folder.childContainerY;
        f10395N.position().f2527y = (this.f10441u - (5.0f * C0892a.f2566b)) + m3224c().folder.childContainerY;
        f10395N.mo10368a(this.f10425e);
        f10395N.mo5215b(C0892a.f2566b * 13.0f);
        f10395N.m3239a();
        f10396O.position().f2527y = (this.f10442v - (86.0f * C0892a.f2566b)) + m3224c().folder.childContainerY;
        f10396O.mo10368a(this.f10425e);
        f10396O.mo5215b(C0892a.f2566b * 13.0f);
        f10396O.m3239a();
        this.f10438r = (int) ((this.f10424d / 2) - (35.0f * C0892a.f2566b));
        this.f10439s = (int) (((-this.f10424d) / 2) - (C0892a.f2566b * 30.0f));
        this.f10437q = this.f10438r - this.f10439s;
        this.f10410I.position().f2526x = (this.f10425e / 2) + (68.0f * C0892a.f2566b);
        this.f10418W.m5343k();
    }

    /* renamed from: p */
    private void m3211p() {
        this.f10414M = new C0937a(this.f10409H) { // from class: com.tsf.shell.f.i.b.d.j.4
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C4187w.m614b();
                if (C3145b.f10240k != null) {
                    C3187j.this.m3230a(C3145b.f10240k);
                }
            }
        };
        this.f10409H.setMouseEventListener(this.f10414M);
    }

    /* renamed from: a */
    public void m3230a(final C3145b c3145b) {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.i.b.d.j.5
            @Override // java.lang.Runnable
            public void run() {
                Context m10856d = C0853a.m10856d();
                View inflate = LayoutInflater.from(C0853a.m10856d()).inflate(C1306b.C1313g.dialog_rename, (ViewGroup) null);
                final EditText editText = (EditText) inflate.findViewById(C1306b.C1311e.username_edit);
                editText.setText(c3145b.m3369aN());
                AlertDialog.Builder builder = new AlertDialog.Builder(C0853a.m10856d());
                builder.setTitle(m10856d.getString(C1306b.C1315i.rename_folder_title));
                builder.setView(inflate);
                builder.setPositiveButton(m10856d.getString(C1306b.C1315i.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.i.b.d.j.5.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        c3145b.m3386a(editText.getText().toString());
                    }
                });
                builder.setNegativeButton(m10856d.getString(C1306b.C1315i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.i.b.d.j.5.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();
            }
        });
    }

    /* renamed from: a */
    public void m3231a(int i, C3145b c3145b) {
        this.f10406E.visible(true);
        this.f10418W.m5351b();
        C1017d c1017d = new C1017d();
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.m10314a(255);
        c1017d.m10313a(C0986a.f2946a);
        C1014c.m10326a(this.f10406E);
        C1014c.m10325a(this.f10406E, i, c1017d);
    }

    /* renamed from: a */
    public void m3227a(boolean z) {
        this.f10418W.m5350c();
        if (z) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.j.6
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3187j.this.f10406E.visible(false);
                }
            };
            c1017d.m10314a(0);
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            C1014c.m10326a(this.f10406E);
            C1014c.m10325a(this.f10406E, 350, c1017d);
            return;
        }
        this.f10406E.scale().f2526x = 0.0f;
        this.f10406E.scale().f2527y = 0.0f;
        this.f10406E.visible(false);
    }

    /* renamed from: q */
    private void m3210q() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m3228a(CharSequence charSequence) {
        m3215l();
        C3561a c3561a = new C3561a();
        c3561a.m1989h(60);
        c3561a.m1988i(-1);
        Bitmap m1998b = c3561a.m1998b((String) charSequence);
        C0853a.m10853g().m10540a(this.f10445y, m1998b);
        m1998b.recycle();
        this.f10409H.mo10368a(this.f10445y.width);
        this.f10409H.mo5215b(this.f10445y.height);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m3229a(C3145b c3145b, CharSequence charSequence) {
        String num;
        if (c3145b.f10278v != null) {
            c3145b.f10274r.textures().removeAll();
            C0853a.m10853g().m10543a(c3145b.f10278v);
            c3145b.f10278v = null;
        }
        if (c3145b.f10279w != null) {
            c3145b.f10275s.textures().removeAll();
            C0853a.m10853g().m10543a(c3145b.f10279w);
            c3145b.f10279w = null;
        }
        if (m3224c().folder.sizePlaneEnable) {
            Bitmap bitmapFromCache = m3224c().getBitmapFromCache(ThemeFolderDescription.SIZE_PLANE, m3224c().folder.sizeTextWidth, m3224c().folder.sizeTextHeight);
            if (bitmapFromCache == null) {
                bitmapFromCache = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            Bitmap createBitmap = Bitmap.createBitmap(m3224c().folder.sizeTextWidth, m3224c().folder.sizeTextHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            if (bitmapFromCache != null) {
                canvas.drawBitmap(bitmapFromCache, 0.0f, 0.0f, (Paint) null);
                bitmapFromCache.recycle();
            }
            int m3360aW = c3145b.m3360aW();
            if (m3360aW > 99) {
                num = "+";
            } else {
                num = Integer.toString(m3360aW);
            }
            C3561a c3561a = new C3561a();
            c3561a.m1988i(m3224c().folder.sizeTextFormat.color);
            c3561a.m2004a(m3224c().folder.sizeTextFormat.width);
            c3561a.m1999b(m3224c().folder.sizePlaneHeight);
            c3561a.m2001a(true);
            c3561a.m1997b(false);
            c3561a.m2006a(m3224c().folder.sizeTextFormat.size);
            Bitmap m1998b = c3561a.m1998b(num);
            canvas.drawBitmap(m1998b, m3224c().folder.sizeTextFormat.f13401x, m3224c().folder.sizeTextFormat.f13402y - 10, (Paint) null);
            m1998b.recycle();
            c3145b.f10279w = C0853a.m10853g().m10544a(createBitmap, true);
            createBitmap.recycle();
            c3145b.f10275s.textures().addElement(c3145b.f10279w);
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(m3224c().folder.textWidth, m3224c().folder.textHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        if (!m3224c().folder.nameTextFormat.auto) {
            C3561a c3561a2 = new C3561a();
            c3561a2.m1988i(m3224c().folder.nameTextFormat.color);
            c3561a2.m2004a(m3224c().folder.nameTextFormat.width);
            c3561a2.m1999b(m3224c().folder.textHeight);
            c3561a2.m2001a(true);
            c3561a2.m1997b(false);
            c3561a2.m2006a(m3224c().folder.nameTextFormat.size);
            Bitmap m1998b2 = c3561a2.m1998b((String) charSequence);
            canvas2.drawBitmap(m1998b2, m3224c().folder.nameTextFormat.f13401x, m3224c().folder.nameTextFormat.f13402y - 10, (Paint) null);
            m1998b2.recycle();
        } else {
            Bitmap m2011a = C3566b.f11839a.m2011a((String) charSequence);
            if (m2011a != null) {
                canvas2.drawBitmap(m2011a, 1.0f, 1.0f, (Paint) null);
                m2011a.recycle();
            }
        }
        c3145b.f10278v = C0853a.m10853g().m10544a(createBitmap2, true);
        createBitmap2.recycle();
        c3145b.f10274r.textures().addElement(c3145b.f10278v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void m3215l() {
        if (this.f10445y.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f10445y);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        m3212o();
        C3145b.m3406a(i, i2, i3, i4);
    }
}
