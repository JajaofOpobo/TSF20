package com.tsf.shell.p096f.p131f;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VPage;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0968b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p187r.p193c.C3743g;
import com.tsf.shell.p095e.C2262d;
import com.tsf.shell.p096f.p097a.p098a.C2273a;
import com.tsf.shell.p096f.p107d.p116e.p117a.AbstractC2446b;
import com.tsf.shell.p096f.p118e.p126f.C2570b;
import com.tsf.shell.p096f.p131f.C2942j;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p153i.C3105a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.g */
/* loaded from: classes.dex */
public class C2932g extends C0980j implements C0925e.InterfaceC0934a, C3105a.InterfaceC3106a {

    /* renamed from: f */
    public static C2273a f9515f;

    /* renamed from: i */
    public static C0975i f9516i;

    /* renamed from: r */
    private static C0981k f9521r;

    /* renamed from: A */
    private int f9522A;

    /* renamed from: I */
    private C2942j.C2943a f9530I;

    /* renamed from: J */
    private AbstractC2446b f9531J;

    /* renamed from: L */
    private InterfaceC1012a f9533L;

    /* renamed from: a */
    protected C2932g f9538a;

    /* renamed from: b */
    protected C2262d f9539b;

    /* renamed from: c */
    protected C2570b f9540c;

    /* renamed from: h */
    protected C3105a f9542h;

    /* renamed from: k */
    protected C2948l f9544k;

    /* renamed from: q */
    private C0981k f9546q;

    /* renamed from: s */
    private C0967a f9547s;

    /* renamed from: t */
    private C0967a f9548t;

    /* renamed from: v */
    private C0937a f9550v;

    /* renamed from: w */
    private C0937a f9551w;

    /* renamed from: x */
    private C2932g f9552x;

    /* renamed from: y */
    private C2932g f9553y;

    /* renamed from: z */
    private int f9554z;

    /* renamed from: m */
    private static TextureElement f9517m = null;

    /* renamed from: n */
    private static TextureElement f9518n = null;

    /* renamed from: o */
    private static TextureElement f9519o = null;

    /* renamed from: p */
    private static TextureElement f9520p = null;

    /* renamed from: d */
    public static int f9513d = 0;

    /* renamed from: e */
    public static int f9514e = 0;

    /* renamed from: l */
    private TextureElement f9545l = null;

    /* renamed from: g */
    public float f9541g = 0.0f;

    /* renamed from: B */
    private boolean f9523B = false;

    /* renamed from: D */
    private boolean f9525D = false;

    /* renamed from: E */
    private boolean f9526E = false;

    /* renamed from: F */
    private boolean f9527F = false;

    /* renamed from: G */
    private boolean f9528G = false;

    /* renamed from: H */
    private boolean f9529H = false;

    /* renamed from: K */
    private boolean f9532K = false;

    /* renamed from: M */
    private float f9534M = 255.0f;

    /* renamed from: N */
    private boolean f9535N = true;

    /* renamed from: j */
    boolean f9543j = true;

    /* renamed from: O */
    private boolean f9536O = false;

    /* renamed from: P */
    private boolean f9537P = false;

    /* renamed from: C */
    private ArrayList<InterfaceC2938a> f9524C = new ArrayList<>();

    /* renamed from: u */
    private VPage f9549u = new VPage();

    /* renamed from: com.tsf.shell.f.f.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2938a {
        /* renamed from: a */
        void m4174a();

        /* renamed from: b */
        void m4173b();
    }

    public C2932g() {
        this.f9549u.vTarget = this;
        this.f9533L = new C1013b();
        this.f9538a = this;
        C3359a.f11088b.m10565a(this);
    }

    /* renamed from: c */
    public boolean m4204c() {
        return this.f9528G;
    }

    /* renamed from: d */
    public void m4201d() {
        C3359a.f11094h.f9606d.m4335a(this);
    }

    /* renamed from: e */
    public void m4198e() {
        C3359a.f11094h.f9606d.m4328d();
    }

    /* renamed from: f */
    public void m4196f() {
        this.f9528G = true;
    }

    /* renamed from: g */
    public void m4194g() {
        this.f9528G = false;
    }

    /* renamed from: a */
    public C2942j.C2943a m4227a(AbstractC2446b abstractC2446b, C0975i c0975i, boolean z) {
        this.f9529H = true;
        mouseEnabled(false);
        f9516i = c0975i;
        this.f9531J = abstractC2446b;
        C2942j.C2943a m4218a = m4218a(z, false);
        this.f9530I = m4218a;
        if (z) {
            C3359a.f11092f.m1579g().visible(false);
        }
        return m4218a;
    }

    /* renamed from: h */
    public void m4193h() {
        this.f9529H = false;
        mouseEnabled(true);
        C3359a.f11092f.m1579g().visible(true);
        if (this.f9530I != null) {
            this.f9530I.f9573a = null;
        }
        this.f9531J = null;
    }

    /* renamed from: a */
    private void m4235a() {
        this.f9531J.mo5547a(this);
    }

    /* renamed from: i */
    public void m4192i() {
        this.f9532K = true;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (this.f9532K) {
            this.f9532K = false;
        } else if (visible()) {
            if (this.f9529H) {
                MatrixStack.glPushMatrix();
                draw();
                MatrixStack.glColor(alpha(), getDefaultColor());
                f9516i.dispatchDraw();
                MatrixStack.glPopMatrix();
                return;
            }
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int numChildren = numChildren();
                for (int i = 0; i < numChildren; i++) {
                    C0975i childAt = getChildAt(i);
                    onDrawChildStart(childAt);
                    childAt.dispatchDraw();
                    onDrawChildEnd(childAt);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    /* renamed from: j */
    public C2942j.C2943a m4191j() {
        return m4218a(false, false);
    }

    /* renamed from: a */
    public C2942j.C2943a m4218a(boolean z, boolean z2) {
        C2942j.C2943a m4158c = C2942j.m4158c(this);
        if (m4158c.f9573a != this || z2) {
            m4158c.f9573a = this;
            Number3d clone = position().m13946clone();
            C2939h.f9561a.visible(false);
            position().setAll(0.0f, 0.0f, 0.0f);
            C3359a.f11106t.m5972b(C2942j.m4159c(), m4158c.f9574b);
            if (z) {
                C3359a.f11092f.m1608a(this);
            }
            boolean visible = this.f9540c.visible();
            this.f9540c.visible(true);
            this.f9540c.dispatchDraw();
            this.f9540c.visible(Boolean.valueOf(visible));
            C3359a.f11106t.m5973b();
            position().setAllFrom(clone);
            C2939h.f9561a.visible(true);
        }
        return m4158c;
    }

    /* renamed from: k */
    public void m4190k() {
        C3359a.f11088b.m10565a(this);
    }

    /* renamed from: l */
    public VPage m4189l() {
        return this.f9549u;
    }

    /* renamed from: a */
    public void m4230a(C0937a c0937a) {
        this.f9550v = c0937a;
    }

    /* renamed from: b */
    public void m4208b(C0937a c0937a) {
        this.f9551w = c0937a;
    }

    /* renamed from: m */
    public C3105a mo4188m() {
        return this.f9542h;
    }

    /* renamed from: n */
    public C0975i m4187n() {
        return this.f9547s;
    }

    /* renamed from: o */
    public void m4186o() {
        this.f9547s.setMouseEventListener(this.f9550v);
    }

    /* renamed from: p */
    public void m4185p() {
        this.f9547s.setMouseEventListener(this.f9551w);
    }

    /* renamed from: a */
    public void m4219a(boolean z) {
        if (z) {
            C0981k m3982b = C3359a.f11094h.m4041i().m3982b();
            m3982b.removeFromParent();
            addChild(m3982b);
        } else {
            C3359a.f11094h.m4041i().m3982b().removeFromParent();
        }
        this.f9523B = z;
    }

    /* renamed from: q */
    public boolean m4184q() {
        return this.f9523B;
    }

    /* renamed from: a */
    public void m4232a(int i) {
        this.f9522A = i;
    }

    /* renamed from: r */
    public int m4183r() {
        return this.f9522A;
    }

    /* renamed from: s */
    public C2262d m4182s() {
        return this.f9539b;
    }

    /* renamed from: b */
    public void m4209b(int i) {
        this.f9554z = i;
    }

    /* renamed from: t */
    public int m4181t() {
        return this.f9554z;
    }

    /* renamed from: a */
    public void m4231a(Number3d number3d) {
        if (C2939h.m4167c() && this.f9544k.mo4140a(this, C2939h.f9561a)) {
            C2939h.f9561a.position().setAllFrom(number3d);
            C2939h.f9561a.dispatchDraw();
            C2939h.f9561a.position().reset();
        }
    }

    /* renamed from: u */
    public void m4180u() {
        if (C2939h.m4167c() && this.f9544k.mo4140a(this, C2939h.f9561a)) {
            C2939h.f9561a.dispatchDraw();
        }
    }

    /* renamed from: aj */
    private void m4210aj() {
        this.f9540c = new C2570b() { // from class: com.tsf.shell.f.f.g.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C2932g.this.f9541g != 0.0f && C2932g.this.f9544k != null) {
                    C2932g.this.m4180u();
                }
            }

            @Override // com.tsf.shell.p096f.p118e.p126f.C2570b
            /* renamed from: a */
            public void mo2137a(C3231c c3231c) {
                if (c3231c instanceof C3145b) {
                    C3743g.m1618a(c3231c, null, null);
                } else {
                    C3743g.m1619a(c3231c, (Runnable) null);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
            public void addChild(C0975i c0975i) {
                super.addChild(c0975i);
                C2932g.this.f9542h.m3569a(c0975i);
            }
        };
        this.f9542h = new C3105a(this, this) { // from class: com.tsf.shell.f.f.g.2
            @Override // com.tsf.shell.p096f.p153i.C3105a
            /* renamed from: b */
            public void mo3300b(C3112b c3112b) {
                C2932g.this.m4247N();
            }
        };
        addChild(this.f9540c);
    }

    @Override // com.tsf.shell.p096f.p153i.C3105a.InterfaceC3106a
    /* renamed from: b */
    public ArrayList<C0975i> mo2100b() {
        return this.f9540c.children();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void destroy() {
        C3359a.f11088b.m10557b(this);
        m4179v();
        this.f9542h.m3565c();
        this.f9524C.clear();
        if (this.f9545l != null) {
            C0853a.m10853g().m10543a(this.f9545l);
            this.f9545l = null;
            this.f9546q.textures().removeAll();
        }
        if (this instanceof C2945k) {
            ((C2945k) this).m4144aj();
        }
    }

    /* renamed from: v */
    public void m4179v() {
        Iterator it = ((ArrayList) this.f9540c.children().clone()).iterator();
        while (it.hasNext()) {
            C0975i c0975i = (C0975i) it.next();
            if (c0975i instanceof C3112b) {
                C3359a.f11095i.m1647a((C3112b) c0975i);
            }
        }
    }

    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        this.f9547s.m10389b(C2951n.f9588a, C2951n.f9589b);
        f9521r.position().f2527y = ((-C2951n.f9589b) / 2) + (80.0f * C0892a.f2567c);
        this.f9546q.mo10368a(C0892a.f2555F);
        this.f9546q.mo5215b(C0892a.f2556G);
        this.f9548t.m10389b(C0892a.f2555F, C0892a.f2556G);
        Iterator<C0975i> it = this.f9540c.children().iterator();
        while (it.hasNext()) {
            C0975i next = it.next();
            if (next instanceof C3112b) {
                C3112b c3112b = (C3112b) next;
                c3112b.mo3439a(C0892a.f2555F, C0892a.f2556G);
                c3112b.mo3458ac();
            }
        }
        if (this.f9529H) {
            m4235a();
        }
    }

    /* renamed from: w */
    public static void m4178w() {
        ThemeDescription theme = ThemeManager.mix.page.getTheme();
        Bitmap bitmap = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_BACKGROUND);
        f9519o = C0853a.m10853g().m10539a(f9519o, bitmap, true);
        bitmap.recycle();
        Bitmap bitmap2 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_UNSELECT);
        f9517m = C0853a.m10853g().m10539a(f9517m, bitmap2, true);
        bitmap2.recycle();
        Bitmap bitmap3 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_SELECT);
        f9518n = C0853a.m10853g().m10539a(f9518n, bitmap3, true);
        bitmap3.recycle();
        Bitmap bitmap4 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_HOMEPAGE_MARK, C3489a.f11519f, C3489a.f11519f);
        f9520p = C0853a.m10853g().m10539a(f9520p, bitmap4, true);
        bitmap4.recycle();
    }

    /* renamed from: x */
    public void mo4177x() {
        if (!this.f9527F) {
            this.f9527F = true;
            m4210aj();
            this.f9547s = new C0967a(C2951n.f9588a, C2951n.f9589b, new C0968b(50, 78, 50, 78, 128.0f, 128.0f));
            this.f9548t = new C0967a(C2951n.f9588a, C2951n.f9589b, new C0968b(4.0f, 124.0f, 4.0f, 124.0f, 128.0f, 128.0f));
            this.f9548t.m10389b(C0892a.f2555F, C0892a.f2556G);
            this.f9548t.doubleSidedEnabled(true);
            this.f9548t.position().f2528z = (-200.0f) * C0892a.f2566b;
            ThemeDescription theme = ThemeManager.mix.page.getTheme();
            if (f9519o == null) {
                Bitmap bitmap = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_BACKGROUND);
                f9519o = C0853a.m10853g().m10544a(bitmap, true);
                bitmap.recycle();
            }
            this.f9548t.textures().addElement(f9519o);
            if (f9517m == null) {
                Bitmap bitmap2 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_UNSELECT);
                f9517m = C0853a.m10853g().m10544a(bitmap2, true);
                bitmap2.recycle();
            }
            if (f9518n == null) {
                Bitmap bitmap3 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_SELECT);
                f9518n = C0853a.m10853g().m10544a(bitmap3, true);
                bitmap3.recycle();
            }
            if (f9520p == null) {
                Bitmap bitmap4 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_HOMEPAGE_MARK, C3489a.f11519f, C3489a.f11519f);
                f9520p = C0853a.m10853g().m10544a(bitmap4, true);
                bitmap4.recycle();
            }
            if (f9521r == null) {
                f9521r = new C0981k(C3489a.f11519f, C3489a.f11519f, false);
                f9521r.textures().addElement(f9520p);
                f9521r.position().f2527y = ((-C2951n.f9589b) / 2) + (80.0f * C0892a.f2567c);
            }
            this.f9547s.textures().addElement(f9517m);
            this.f9546q = new C0981k(C0892a.f2555F, C0892a.f2556G, 1, 1, false);
            this.f9546q.uvs().set(0, 1.0f, 0.0f);
            this.f9546q.uvs().set(1, 0.0f, 0.0f);
            this.f9546q.uvs().set(2, 1.0f, 1.0f);
            this.f9546q.uvs().set(3, 0.0f, 1.0f);
            addChild(this.f9546q);
        }
        if (this instanceof C2945k) {
            ((C2945k) this).m4149a();
        }
    }

    /* renamed from: y */
    public static void m4176y() {
        if (f9515f != null) {
            C3359a.f11106t.m5976a(f9515f);
        }
        if (C2951n.f9588a > C2951n.f9589b) {
            f9513d = (int) (0.4f * C0892a.f2555F);
            f9514e = (C2951n.f9589b * f9513d) / C2951n.f9588a;
        } else {
            f9514e = (int) (0.4f * C0892a.f2556G);
            f9513d = (C2951n.f9588a * f9514e) / C2951n.f9589b;
        }
        f9515f = C3359a.f11106t.m5977a(f9513d, f9514e);
    }

    /* renamed from: b */
    public void m4205b(boolean z) {
        if (visible()) {
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            if (z) {
                this.f9548t.dispatchDraw();
                this.f9546q.dispatchDraw();
            } else {
                this.f9546q.dispatchDraw();
                this.f9548t.dispatchDraw();
            }
            MatrixStack.glPopMatrix();
        }
    }

    /* renamed from: z */
    public void m4175z() {
    }

    /* renamed from: A */
    public void m4260A() {
        this.f9534M = this.f9548t.alpha();
    }

    /* renamed from: B */
    public float m4259B() {
        return this.f9534M;
    }

    /* renamed from: a */
    public void m4234a(float f) {
        this.f9548t.alpha(f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void killFocus() {
        m4255F();
        C3359a.f11094h.m4023r().m4299b(this, this.f9533L);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void setFocus() {
        m4256E();
        C3359a.f11094h.m4023r().m4303a(this, this.f9533L);
    }

    /* renamed from: C */
    public void m4258C() {
        f9521r.removeFromParent();
        addChild(f9521r);
    }

    /* renamed from: D */
    public void m4257D() {
        f9521r.removeFromParent();
    }

    /* renamed from: E */
    public void m4256E() {
        this.f9547s.textures().clear();
        this.f9547s.textures().addElement(f9518n);
        setZOrderOnTop();
    }

    /* renamed from: F */
    public void m4255F() {
        this.f9547s.textures().clear();
        this.f9547s.textures().addElement(f9517m);
    }

    /* renamed from: c */
    public void m4202c(boolean z) {
        this.f9547s.removeFromParent();
        if (z) {
            C1017d c1017d = new C1017d();
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(this.f9546q);
            C1014c.m10325a(this.f9546q, 500, c1017d);
            return;
        }
        this.f9546q.scale().f2526x = 1.0f;
        this.f9546q.scale().f2527y = 1.0f;
    }

    /* renamed from: G */
    public void m4254G() {
        m4202c(true);
    }

    /* renamed from: H */
    public void m4253H() {
        this.f9547s.removeFromParent();
    }

    /* renamed from: I */
    public void m4252I() {
        if (this.f9547s.parent() == null) {
            addChildAt(this.f9547s, 0);
        }
    }

    /* renamed from: d */
    public void m4199d(boolean z) {
        m4252I();
        this.f9546q.scale().setAll(1.0f, 1.0f, 1.0f);
        m4249L();
        if (z) {
            C1017d c1017d = new C1017d();
            c1017d.m10294l(0.28f);
            c1017d.m10293m(0.28f);
            C1014c.m10326a(this.f9546q);
            C1014c.m10325a(this.f9546q, 500, c1017d);
            return;
        }
        this.f9546q.scale().f2526x = 0.28f;
        this.f9546q.scale().f2527y = 0.28f;
    }

    /* renamed from: J */
    public C0975i m4251J() {
        return this.f9546q;
    }

    /* renamed from: e */
    public void m4197e(boolean z) {
        this.f9546q.doubleSidedEnabled(z);
    }

    /* renamed from: K */
    public void m4250K() {
        this.f9535N = true;
        this.f9540c.visible(false);
        mo4146ab();
        if (this.f9545l == null) {
            this.f9546q.visible(false);
        } else {
            this.f9546q.visible(true);
        }
    }

    /* renamed from: L */
    public void m4249L() {
        if (!this.f9535N) {
            this.f9535N = true;
            this.f9540c.visible(false);
            mo4146ab();
            m4246P();
            if (this.f9545l == null) {
                this.f9546q.visible(false);
            } else {
                this.f9546q.visible(true);
            }
        } else if (this.f9545l != null && !this.f9546q.visible()) {
            this.f9546q.visible(true);
        }
    }

    /* renamed from: M */
    public void m4248M() {
        if (this.f9535N) {
            this.f9535N = false;
            mo4145ac();
            this.f9546q.visible(false);
            this.f9540c.visible(true);
        }
    }

    /* renamed from: N */
    public void m4247N() {
        this.f9525D = true;
    }

    /* renamed from: O */
    public void mo4150O() {
        if (this.f9525D) {
            m4246P();
        }
    }

    /* renamed from: P */
    public void m4246P() {
        if (m4245Q() == 0 && m4181t() != -1) {
            if (this.f9545l != null) {
                C0853a.m10853g().m10543a(this.f9545l);
                this.f9545l = null;
                this.f9546q.textures().clear();
            }
            this.f9525D = false;
            return;
        }
        Number3d clone = position().m13946clone();
        position().setAll(0.0f, 0.0f, 0.0f);
        if (this.f9545l == null || this.f9545l.width != f9513d || this.f9545l.height != f9514e) {
            if (this.f9545l != null) {
                C0853a.m10853g().m10543a(this.f9545l);
                this.f9545l = null;
                this.f9546q.textures().clear();
            }
            this.f9545l = C0853a.m10853g().m10545a(f9513d, f9514e, false);
            this.f9546q.textures().addElement(this.f9545l);
        }
        C3359a.f11106t.m5972b(f9515f, this.f9545l);
        GLES20.glViewport(0, 0, f9513d, f9514e);
        boolean visible = this.f9540c.visible();
        this.f9540c.visible(true);
        this.f9540c.drawQuietly();
        this.f9540c.visible(Boolean.valueOf(visible));
        C3359a.f11106t.m5973b();
        GLES20.glViewport(0, 0, C0892a.f2555F, C0892a.f2556G);
        position().setAllFrom(clone);
        this.f9525D = false;
    }

    /* renamed from: a */
    public void m4229a(C0975i c0975i) {
        if (c0975i instanceof C3112b) {
            C3112b c3112b = (C3112b) c0975i;
            c3112b.mo3462a(mo4188m());
            if (c3112b.m3534K() != null) {
                c3112b.m3534K().screen = this.f9554z;
                c3112b.m3534K().updateContainer(null, -1);
            }
        }
        this.f9540c.addChild(c0975i);
        m4247N();
    }

    /* renamed from: a */
    public void m4228a(C0975i c0975i, int i) {
        if (c0975i instanceof C3112b) {
            C3112b c3112b = (C3112b) c0975i;
            c3112b.mo3462a(mo4188m());
            if (c3112b.m3534K() != null) {
                c3112b.m3534K().screen = this.f9554z;
            }
        }
        this.f9540c.addChildAt(c0975i, i);
        m4247N();
    }

    /* renamed from: b */
    public void m4207b(C0975i c0975i) {
        if (this.f9540c.children().contains(c0975i)) {
            this.f9540c.removeChild(c0975i);
            if (c0975i instanceof C3112b) {
                ((C3112b) c0975i).m3540B();
            }
            m4247N();
        }
    }

    /* renamed from: c */
    public boolean m4203c(C0975i c0975i) {
        return this.f9540c.children().contains(c0975i);
    }

    /* renamed from: Q */
    public int m4245Q() {
        int i = 0;
        Iterator<C0975i> it = this.f9540c.children().iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                i = it.next() instanceof C3112b ? i2 + 1 : i2;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: R */
    public ArrayList<C0975i> m4244R() {
        return this.f9540c.children();
    }

    /* renamed from: d */
    public int m4200d(C0975i c0975i) {
        return this.f9540c.getChildIndexOf(c0975i);
    }

    /* renamed from: S */
    public C0980j m4243S() {
        return this.f9540c;
    }

    /* renamed from: T */
    public void m4242T() {
        this.f9536O = false;
        if (!this.f9536O && !this.f9537P && this.f9543j) {
            m4217aa();
        }
    }

    /* renamed from: U */
    public void m4241U() {
        this.f9536O = true;
        if (!this.f9543j) {
            m4236Z();
        }
    }

    /* renamed from: V */
    public void m4240V() {
        this.f9537P = true;
        if (!this.f9543j) {
            m4236Z();
        }
    }

    /* renamed from: W */
    public void mo4239W() {
        this.f9537P = false;
        if (!this.f9536O && !this.f9537P && this.f9543j) {
            m4217aa();
        }
    }

    /* renamed from: X */
    public boolean m4238X() {
        return true;
    }

    /* renamed from: Y */
    public boolean m4237Y() {
        return (C3359a.f11108v.f7768a.f9582a.m4343h().mo4143a() && this.f9543j) ? false : true;
    }

    /* renamed from: Z */
    public void m4236Z() {
        this.f9543j = true;
        if (C3359a.f11108v.f7768a.f9582a.m4343h().mo4143a() || m4181t() == -1) {
            mo4146ab();
        }
        if (this.f9528G) {
            m4198e();
        }
        if (this.f9539b != null) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.f.g.3
                @Override // java.lang.Runnable
                public void run() {
                    if (C2932g.this.f9543j) {
                        C2932g.this.f9539b.m5995a();
                    } else {
                        C2932g.this.f9539b.m5990b();
                    }
                }
            });
        }
    }

    /* renamed from: aa */
    public void m4217aa() {
        this.f9543j = false;
        if (C3359a.f11108v.f7768a.f9582a.m4343h().mo4143a() || m4181t() == -1) {
            mo4145ac();
        }
        this.f9541g = 0.0f;
        if (this.f9539b != null) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.f.g.4
                @Override // java.lang.Runnable
                public void run() {
                    if (C2932g.this.f9543j) {
                        C2932g.this.f9539b.m5995a();
                    } else {
                        C2932g.this.f9539b.m5990b();
                    }
                }
            });
        }
    }

    /* renamed from: ab */
    public void mo4146ab() {
        if (!this.f9526E) {
            this.f9526E = true;
            mouseEnabled(false);
            Iterator<InterfaceC2938a> it = this.f9524C.iterator();
            while (it.hasNext()) {
                it.next().m4174a();
            }
        }
    }

    /* renamed from: ac */
    public void mo4145ac() {
        if (this.f9526E) {
            this.f9526E = false;
            mouseEnabled(true);
            Iterator<InterfaceC2938a> it = this.f9524C.iterator();
            while (it.hasNext()) {
                it.next().m4173b();
            }
        }
    }

    /* renamed from: ad */
    public boolean m4216ad() {
        return this.f9526E;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (C3359a.f11108v.f7770c.f8012b.m5561a()) {
            Iterator<C0975i> it = m4244R().iterator();
            while (it.hasNext()) {
                C0975i next = it.next();
                if (next instanceof C3112b) {
                    C3359a.f11108v.f7770c.f8012b.m5559a((C3112b) next);
                }
            }
        }
    }

    /* renamed from: ae */
    public void m4215ae() {
        Iterator<C0975i> it = m4244R().iterator();
        while (it.hasNext()) {
            C0975i next = it.next();
            if (next instanceof C3112b) {
                ((C3112b) next).m3487y();
            }
        }
    }

    /* renamed from: a */
    private void m4233a(float f, C2948l c2948l) {
        if (this.f9544k != c2948l) {
            this.f9544k = c2948l;
            m4211ai();
        }
        this.f9544k.mo4141a(this, f);
    }

    /* renamed from: af */
    public void m4214af() {
        if (this.f9544k != null) {
            this.f9544k.mo4136b(this, this.f9541g);
        }
    }

    /* renamed from: a */
    public void m4224a(C2932g c2932g) {
        this.f9553y = c2932g;
    }

    /* renamed from: ag */
    public C2932g m4213ag() {
        return this.f9553y;
    }

    /* renamed from: b */
    public void m4206b(C2932g c2932g) {
        this.f9552x = c2932g;
    }

    /* renamed from: ah */
    public C2932g m4212ah() {
        return this.f9552x;
    }

    /* renamed from: f */
    public void m4195f(boolean z) {
        if (z) {
            if (parent() == null) {
                C3359a.f11094h.m4017u().addChild(this);
                m4248M();
                this.f9547s.removeFromParent();
            }
        } else if (parent() != null) {
            m4215ae();
            removeFromParent();
            m4249L();
            m4252I();
            m4211ai();
        }
    }

    /* renamed from: ai */
    public void m4211ai() {
        Number3d scale = scale();
        scale().f2527y = 1.0f;
        scale.f2526x = 1.0f;
        rotation().f2526x = 0.0f;
        rotation().f2527y = 0.0f;
        rotation().f2528z = 0.0f;
        position().f2528z = 0.0f;
        position().f2527y = 0.0f;
        position().f2526x = 0.0f;
    }

    /* renamed from: a */
    public void m4222a(C2948l c2948l) {
        m4223a(this, 0.0f, true, true, c2948l);
    }

    /* renamed from: a */
    public void m4223a(C2932g c2932g, float f, boolean z, boolean z2, C2948l c2948l) {
        if (this.f9541g * f < 0.0f) {
            if (f < 0.0f) {
                if (this.f9553y != null && this.f9553y != c2932g) {
                    this.f9553y.m4195f(false);
                }
            } else if (this.f9552x != null && this.f9552x != c2932g) {
                this.f9552x.m4195f(false);
            }
        }
        this.f9541g = f;
        if (f < 1.0f && f > -1.0f) {
            m4195f(true);
            m4233a(f, c2948l);
        } else {
            m4195f(false);
        }
        if (z && this.f9552x != null && this.f9552x != c2932g) {
            this.f9552x.m4223a(c2932g, f + 1.0f, true, false, c2948l);
        }
        if (z2 && this.f9553y != null && this.f9553y != c2932g) {
            this.f9553y.m4223a(c2932g, f - 1.0f, false, true, c2948l);
        }
    }

    /* renamed from: a */
    public void m4221a(Runnable runnable, float f) {
        m4226a(C3359a.f11108v.f7771d.m5539b(), runnable, f);
    }

    /* renamed from: a */
    public void m4226a(AbstractC2446b abstractC2446b, Runnable runnable, float f) {
        if (this instanceof C2862h) {
            if (abstractC2446b.mo5548a()) {
                abstractC2446b.mo5546a(this, f, ((C2862h) this).m4451ap().children(), runnable);
                return;
            } else {
                ((C2862h) this).m4416c(runnable, true);
                return;
            }
        }
        abstractC2446b.mo5546a(this, f, this.f9540c.children(), runnable);
    }

    /* renamed from: a */
    public void m4220a(Runnable runnable, boolean z) {
        m4225a(C3359a.f11108v.f7771d.m5539b(), runnable, z);
    }

    /* renamed from: a */
    public void m4225a(AbstractC2446b abstractC2446b, final Runnable runnable, boolean z) {
        Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.f.g.5
            @Override // java.lang.Runnable
            public void run() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        if (this instanceof C2862h) {
            if (abstractC2446b.mo5548a()) {
                abstractC2446b.mo5545a(this, ((C2862h) this).m4451ap().children(), runnable2, z);
                return;
            } else {
                ((C2862h) this).m4433b(runnable2, z);
                return;
            }
        }
        abstractC2446b.mo5545a(this, this.f9540c.children(), runnable2, z);
    }
}
