package com.tsf.shell.p096f.p153i.p155b.p157b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p187r.C3613a;
import com.tsf.shell.manager.p187r.p188a.C3620b;
import com.tsf.shell.p095e.C2255b;
import com.tsf.shell.p095e.C2262d;
import com.tsf.shell.p096f.p118e.C2463b;
import com.tsf.shell.p096f.p118e.C2663t;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3105a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
/* renamed from: com.tsf.shell.f.i.b.b.a */
/* loaded from: classes.dex */
public class C3124a extends C3112b {

    /* renamed from: a */
    public boolean f10160a;

    /* renamed from: b */
    public C0981k f10161b;

    /* renamed from: f */
    public String f10162f;

    /* renamed from: g */
    public C2255b f10163g;

    /* renamed from: h */
    public TextureElement f10164h;

    /* renamed from: i */
    public Object f10165i;

    /* renamed from: j */
    public Runnable f10166j;

    /* renamed from: k */
    private C3109c f10167k;

    /* renamed from: l */
    private C3620b f10168l;

    /* renamed from: m */
    private Runnable f10169m;

    /* renamed from: n */
    private boolean f10170n;

    public C3124a(LauncherAppWidgetInfo launcherAppWidgetInfo, String str) {
        super(launcherAppWidgetInfo);
        this.f10160a = false;
        this.f10170n = false;
        this.f10169m = new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                C3124a.this.f10170n = true;
                C2663t.m5026a();
            }
        };
        this.f10165i = new Object();
        m3498i(false);
        this.f10162f = str;
        this.f10161b = new C0981k(0.0f, 0.0f, 1, 1, false);
        addChild(this.f10161b);
        this.f10161b.visible(false);
        this.f10167k = new C3109c(this);
        m3505e(false);
        this.f10168l = C3359a.f11098l;
        this.f10168l.m1867a(this);
    }

    /* renamed from: k */
    public void m3443k() {
        LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) m3534K();
        if (C0892a.f2564O) {
            this.f10161b.mo10368a(launcherAppWidgetInfo.width);
            this.f10161b.mo5215b(launcherAppWidgetInfo.height);
            m3451c(launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY);
            return;
        }
        this.f10161b.mo10368a(launcherAppWidgetInfo.widthH);
        this.f10161b.mo5215b(launcherAppWidgetInfo.heightH);
        m3451c(launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public float minX() {
        return (-this.f10161b.mo10366b()) / 2.0f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public float minY() {
        return (-this.f10161b.mo10365c()) / 2.0f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public float maxX() {
        return this.f10161b.mo10366b() / 2.0f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public float maxY() {
        return this.f10161b.mo10365c() / 2.0f;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: ac */
    public boolean mo3458ac() {
        boolean z;
        C2663t.m5026a();
        ItemInfo K = m3534K();
        C2262d.C2264b c2264b = (C2262d.C2264b) this.f10163g.getLayoutParams();
        if (C0892a.f2564O) {
            c2264b.f7390a = K.cellX;
            c2264b.f7391b = K.cellY;
            c2264b.f7393d = K.width;
            c2264b.f7394e = K.height;
            int[] iArr = {c2264b.f7390a, c2264b.f7391b, c2264b.f7393d, c2264b.f7394e};
            boolean m1886c = C3613a.m1886c(iArr);
            if (m1886c) {
                int i = iArr[0];
                c2264b.f7390a = i;
                K.cellX = i;
                int i2 = iArr[1];
                c2264b.f7391b = i2;
                K.cellY = i2;
                int i3 = iArr[2];
                c2264b.f7393d = i3;
                K.width = i3;
                int i4 = iArr[3];
                c2264b.f7394e = i4;
                K.height = i4;
            }
            m3451c(K.cellX, K.cellY);
            z = m1886c;
        } else {
            c2264b.f7390a = K.cellXH;
            c2264b.f7391b = K.cellYH;
            c2264b.f7393d = K.widthH;
            c2264b.f7394e = K.heightH;
            int[] iArr2 = {c2264b.f7390a, c2264b.f7391b, c2264b.f7393d, c2264b.f7394e};
            boolean m1886c2 = C3613a.m1886c(iArr2);
            if (m1886c2) {
                int i5 = iArr2[0];
                c2264b.f7390a = i5;
                K.cellXH = i5;
                int i6 = iArr2[1];
                c2264b.f7391b = i6;
                K.cellYH = i6;
                int i7 = iArr2[2];
                c2264b.f7393d = i7;
                K.widthH = i7;
                int i8 = iArr2[3];
                c2264b.f7394e = i8;
                K.heightH = i8;
            }
            m3451c(K.cellXH, K.cellYH);
            z = m1886c2;
        }
        m3457ag();
        rotation().f2528z = K.rotation;
        return z;
    }

    /* renamed from: a */
    public void m3463a(Bitmap bitmap) {
        if (this.f10164h == null) {
            this.f10164h = C0853a.m10853g().m10544a(bitmap, false);
            this.f10161b.textures().addElement(this.f10164h);
            this.f10161b.visible(true);
            m3455b(this.f10164h.width, this.f10164h.height);
            C2262d.C2264b c2264b = (C2262d.C2264b) this.f10163g.getLayoutParams();
            m3451c(c2264b.f7390a, c2264b.f7391b);
        } else if (bitmap.getWidth() != this.f10164h.width || bitmap.getHeight() != this.f10164h.height) {
            C0853a.m10853g().m10540a(this.f10164h, bitmap);
            m3455b(this.f10164h.width, this.f10164h.height);
            C2262d.C2264b c2264b2 = (C2262d.C2264b) this.f10163g.getLayoutParams();
            m3451c(c2264b2.f7390a, c2264b2.f7391b);
        } else {
            C0853a.m10853g().m10540a(this.f10164h, bitmap);
        }
        invalidate();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        synchronized (this.f10165i) {
            if (this.f10166j != null) {
                this.f10166j.run();
                this.f10166j = null;
            }
        }
    }

    /* renamed from: b */
    public void m3455b(int i, int i2) {
        this.f10161b.mo10368a(i);
        this.f10161b.mo5215b(i2);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    /* renamed from: l */
    public C3109c getMouseEventListener() {
        return this.f10167k;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: ab */
    public void mo3077ab() {
        C0853a.m10865a().m10583c(this.f10169m);
    }

    /* renamed from: q */
    public void m3441q() {
        this.f10161b.alpha(0.0f);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f10161b);
        C1014c.m10325a(this.f10161b, 500, c1017d);
    }

    /* renamed from: ag */
    public void m3457ag() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.2
            @Override // java.lang.Runnable
            public void run() {
                C2262d.C2264b c2264b = (C2262d.C2264b) C3124a.this.f10163g.getLayoutParams();
                C3124a.this.f10163g.m6009a(c2264b.f7393d, c2264b.f7394e);
                C3124a.this.f10163g.requestLayout();
                C3124a.this.f10163g.invalidate();
            }
        });
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: n_ */
    public void mo3052n_() {
        this.f10170n = false;
        C1014c.m10326a(this);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(180);
        C1014c.m10326a(this.f10161b);
        C1014c.m10325a(this.f10161b, 500, c1017d);
        setAnimationObjectState(true);
        C2663t.m5024a(this);
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: m_ */
    public void mo3053m_() {
        super.mo3053m_();
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f10161b);
        C1014c.m10325a(this.f10161b, 500, c1017d);
        if (!this.f10160a) {
            C2262d.C2264b c2264b = (C2262d.C2264b) this.f10163g.getLayoutParams();
            int i = c2264b.f7390a;
            int i2 = c2264b.f7391b;
            float mo10366b = (i + (this.f10161b.mo10366b() / 2.0f)) - C0892a.f2557H;
            float mo10365c = C0892a.f2558I - (i2 + (this.f10161b.mo10365c() / 2.0f));
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.i.b.b.a.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3124a.this.mo3056c();
                }
            };
            c1017d2.mo10301f(mo10366b);
            c1017d2.mo10298h(mo10365c);
            C1014c.m10326a(this);
            C1014c.m10325a(this, 250, c1017d2);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: a */
    public void mo3462a(C3105a c3105a) {
        super.mo3462a(c3105a);
        final C2932g z = m3486z();
        if (z != null && m3534K().screen != z.m4181t()) {
            m3534K().screen = z.m4181t();
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.4
                @Override // java.lang.Runnable
                public void run() {
                    ((C2262d) C3124a.this.f10163g.getParent()).m5989b(C3124a.this.f10163g);
                    z.m4182s().m5992a(C3124a.this.f10163g);
                }
            });
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: p_ */
    public void mo3050p_() {
        super.mo3050p_();
        this.f10160a = true;
        this.f10161b.mouseEnabled(false);
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void destroy() {
        this.f10168l.m1864b(this);
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.5
            @Override // java.lang.Runnable
            public void run() {
                ((C2262d) C3124a.this.f10163g.getParent()).m5989b(C3124a.this.f10163g);
            }
        });
        C0853a.m10865a().m10580e(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.6
            @Override // java.lang.Runnable
            public void run() {
                C3359a.f11098l.f11996a.m1884a(((LauncherAppWidgetInfo) C3124a.this.m3534K()).appWidgetId);
                ShellModel.C3435a.m2367b(C3124a.this.m3534K());
            }
        });
        if (this.f10161b != null) {
            this.f10161b.destroy();
            this.f10161b = null;
        }
        C0853a.m10853g().m10543a(this.f10164h);
        this.f10164h = null;
        this.f10167k = null;
        removeFromParent();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: q_ */
    public void mo3081q_() {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.7
            @Override // java.lang.Runnable
            public void run() {
                C2663t.m5026a();
            }
        });
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: j */
    public void mo3083j() {
    }

    /* renamed from: c */
    public void m3451c(int i, int i2) {
        position().f2526x = m3456b(i);
        position().f2527y = m3452c(i2);
    }

    /* renamed from: b */
    public float m3456b(int i) {
        return (i + (this.f10161b.mo10366b() / 2.0f)) - C0892a.f2557H;
    }

    /* renamed from: c */
    public float m3452c(int i) {
        return C0892a.f2558I - (i + (this.f10161b.mo10365c() / 2.0f));
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: E */
    public void mo3465E() {
        C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.8
            @Override // java.lang.Runnable
            public void run() {
                if (C3124a.this.f10108e == null) {
                    C3124a.this.f10108e = C2463b.m5512a((int) (C3124a.this.f10161b.mo10366b() + (C0892a.f2566b * 10.0f)), (int) (C3124a.this.f10161b.mo10365c() + (C0892a.f2566b * 10.0f)));
                    C3124a.this.f10108e.useVBO(false);
                    C3124a.this.f10108e.textures().addElement(C2463b.f8098h);
                    C3124a.this.f10108e.position().f2527y = (this.minY() + this.maxY()) / 2.0f;
                    this.addChild(C3124a.this.f10108e);
                }
            }
        });
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: F */
    public void mo3464F() {
        C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.9
            @Override // java.lang.Runnable
            public void run() {
                if (C3124a.this.f10108e != null) {
                    C3124a.this.f10108e.textures().removeAll();
                    C3124a.this.f10108e.removeFromParent();
                    C3124a.this.f10108e.destroy();
                    C3124a.this.f10108e = null;
                }
            }
        });
    }
}
