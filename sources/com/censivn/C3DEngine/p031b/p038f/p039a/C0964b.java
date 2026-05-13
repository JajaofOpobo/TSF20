package com.censivn.C3DEngine.p031b.p038f.p039a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c;
import com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a;
/* renamed from: com.censivn.C3DEngine.b.f.a.b */
/* loaded from: classes.dex */
public class C0964b implements InterfaceC1012a {

    /* renamed from: A */
    public float f2823A;

    /* renamed from: B */
    public float f2824B;

    /* renamed from: D */
    public Number3d f2826D;

    /* renamed from: E */
    public Number3d f2827E;

    /* renamed from: F */
    public Number3d f2828F;

    /* renamed from: G */
    public Number3d f2829G;

    /* renamed from: J */
    public int f2832J;

    /* renamed from: K */
    private C0962a f2833K;

    /* renamed from: L */
    private VButtonItem f2834L;

    /* renamed from: M */
    private AbstractC1009c f2835M;

    /* renamed from: N */
    private float f2836N;

    /* renamed from: O */
    private float f2837O;

    /* renamed from: R */
    private Object f2840R;

    /* renamed from: a */
    public int f2841a;

    /* renamed from: b */
    public int f2842b;

    /* renamed from: c */
    public int f2843c;

    /* renamed from: d */
    public int f2844d;

    /* renamed from: l */
    public C0937a f2852l;

    /* renamed from: y */
    public float f2865y;

    /* renamed from: z */
    public float f2866z;

    /* renamed from: e */
    public int f2845e = 1;

    /* renamed from: f */
    public int f2846f = 1;

    /* renamed from: g */
    public int f2847g = 0;

    /* renamed from: h */
    public int f2848h = 0;

    /* renamed from: i */
    public boolean f2849i = false;

    /* renamed from: j */
    public boolean f2850j = false;

    /* renamed from: k */
    public boolean f2851k = true;

    /* renamed from: m */
    public PositionNumber3d f2853m = new PositionNumber3d();

    /* renamed from: n */
    public Number3d f2854n = new Number3d();

    /* renamed from: o */
    public Number3d f2855o = new Number3d(1.0f, 1.0f, 1.0f);

    /* renamed from: p */
    public Number3d f2856p = new Number3d();

    /* renamed from: q */
    public Number3d f2857q = new Number3d();

    /* renamed from: r */
    public Number3d f2858r = new Number3d();

    /* renamed from: s */
    public Number3d f2859s = new Number3d();

    /* renamed from: t */
    public Number3d f2860t = new Number3d();

    /* renamed from: u */
    public Number3d f2861u = new Number3d();

    /* renamed from: v */
    public Number3d f2862v = new Number3d();

    /* renamed from: w */
    public Number3d f2863w = new Number3d();

    /* renamed from: P */
    private float f2838P = 0.0f;

    /* renamed from: Q */
    private float f2839Q = 0.0f;

    /* renamed from: x */
    public boolean f2864x = false;

    /* renamed from: C */
    public Number3d f2825C = new Number3d(1.0f, 1.0f, 1.0f);

    /* renamed from: H */
    public Color4 f2830H = new Color4(255, 255, 255, 255);

    /* renamed from: I */
    public float f2831I = 255.0f;

    public C0964b(C0962a c0962a) {
        this.f2833K = c0962a;
    }

    /* renamed from: a */
    public void m10434a(Object obj) {
        this.f2840R = obj;
    }

    /* renamed from: a */
    public Object m10444a() {
        return this.f2840R;
    }

    /* renamed from: b */
    public VButtonItem m10432b() {
        if (this.f2834L == null) {
            this.f2834L = new VButtonItem(this);
        }
        return this.f2834L;
    }

    /* renamed from: c */
    public float m10425c() {
        return this.f2831I;
    }

    /* renamed from: a */
    public void m10443a(float f) {
        this.f2831I = f;
    }

    /* renamed from: a */
    public void m10433a(boolean z) {
        this.f2864x = z;
    }

    /* renamed from: a */
    public void m10442a(float f, float f2, float f3, float f4) {
        this.f2865y = f;
        this.f2866z = f2;
        this.f2823A = f + f3;
        this.f2824B = f2 + f4;
    }

    /* renamed from: b */
    public void m10426b(boolean z) {
        this.f2849i = z;
    }

    /* renamed from: d */
    public boolean m10419d() {
        return this.f2849i;
    }

    /* renamed from: c */
    public void m10420c(boolean z) {
        this.f2850j = z;
    }

    /* renamed from: e */
    public boolean m10414e() {
        return this.f2850j;
    }

    /* renamed from: a */
    public void m10439a(int i, int i2, int i3, int i4) {
        this.f2847g = i;
        this.f2848h = i2;
        this.f2845e = i3;
        this.f2846f = i4;
    }

    /* renamed from: b */
    public void m10428b(int i, int i2, int i3, int i4) {
        this.f2847g = i;
        this.f2848h = i2;
        this.f2845e = i3;
        this.f2846f = i4;
        this.f2836N = this.f2833K.f2811b * i3;
        this.f2837O = this.f2833K.f2811b * i4;
    }

    /* renamed from: c */
    public void m10421c(int i, int i2, int i3, int i4) {
        this.f2847g = i;
        this.f2848h = i2;
        this.f2845e = i3;
        this.f2846f = i4;
        this.f2836N = this.f2833K.f2811b * i3 * C0892a.f2565a;
        this.f2837O = this.f2833K.f2811b * i4 * C0892a.f2565a;
    }

    /* renamed from: d */
    public void m10415d(int i, int i2, int i3, int i4) {
        this.f2847g = i;
        this.f2848h = i2;
        this.f2845e = i3;
        this.f2846f = i4;
        this.f2836N = this.f2833K.f2811b * i3 * C0892a.f2566b;
        this.f2837O = this.f2833K.f2811b * i4 * C0892a.f2566b;
    }

    /* renamed from: a */
    public void m10438a(int i, int i2, int i3, int i4, float f, float f2) {
        this.f2847g = i;
        this.f2848h = i2;
        this.f2845e = i3;
        this.f2846f = i4;
        this.f2836N = f;
        this.f2837O = f2;
    }

    /* renamed from: a */
    public void m10437a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2847g = i;
        this.f2848h = i2;
        this.f2845e = i3;
        this.f2846f = i4;
        this.f2836N = i5;
        this.f2837O = i6;
    }

    /* renamed from: b */
    public void m10427b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2847g = i;
        this.f2848h = i2;
        this.f2845e = i3;
        this.f2846f = i4;
        this.f2836N = i5 * C0892a.f2565a;
        this.f2837O = i6 * C0892a.f2565a;
    }

    /* renamed from: a */
    public void m10440a(int i, int i2) {
        this.f2847g = i;
        this.f2848h = i2;
        m10409g();
    }

    /* renamed from: b */
    public void m10429b(int i, int i2) {
        this.f2845e = i;
        this.f2846f = i2;
        this.f2836N = this.f2833K.f2811b * i;
        this.f2837O = this.f2833K.f2811b * i2;
    }

    /* renamed from: c */
    public void m10422c(int i, int i2) {
        this.f2845e = i;
        this.f2846f = i2;
        this.f2836N = this.f2833K.f2811b * i * C0892a.f2565a;
        this.f2837O = this.f2833K.f2811b * i2 * C0892a.f2565a;
    }

    /* renamed from: d */
    public void m10416d(int i, int i2) {
        this.f2845e = i;
        this.f2846f = i2;
        this.f2836N = this.f2833K.f2811b * i * C0892a.f2566b;
        this.f2837O = this.f2833K.f2811b * i2 * C0892a.f2566b;
    }

    /* renamed from: e */
    public void m10412e(int i, int i2) {
        this.f2845e = i;
        this.f2846f = i2;
        this.f2836N = this.f2833K.f2811b * i * C0892a.f2567c;
        this.f2837O = this.f2833K.f2811b * i2 * C0892a.f2567c;
    }

    /* renamed from: f */
    public void m10410f(int i, int i2) {
        this.f2845e = i;
        this.f2846f = i2;
        this.f2833K.m10451a(this);
    }

    /* renamed from: f */
    public void m10411f() {
        this.f2833K.m10446b(this);
    }

    /* renamed from: g */
    public void m10409g() {
        this.f2833K.m10451a(this);
    }

    /* renamed from: h */
    public void m10408h() {
        m10411f();
        m10409g();
    }

    /* renamed from: a */
    public void m10436a(C0937a c0937a) {
        this.f2852l = c0937a;
    }

    /* renamed from: i */
    public PositionNumber3d m10407i() {
        return this.f2853m;
    }

    /* renamed from: j */
    public Number3d m10406j() {
        return this.f2854n;
    }

    /* renamed from: k */
    public Number3d m10405k() {
        return this.f2855o;
    }

    /* renamed from: l */
    public boolean m10404l() {
        return this.f2851k;
    }

    /* renamed from: a */
    public void m10435a(Boolean bool) {
        if (bool.booleanValue() != this.f2851k) {
            this.f2851k = bool.booleanValue();
            this.f2833K.m10446b(this);
        }
    }

    /* renamed from: b */
    public void m10431b(float f) {
        this.f2836N = f;
    }

    /* renamed from: c */
    public void m10424c(float f) {
        this.f2836N = C0892a.f2565a * f;
    }

    /* renamed from: m */
    public float m10403m() {
        return this.f2836N;
    }

    /* renamed from: n */
    public float m10402n() {
        return this.f2836N / C0892a.f2565a;
    }

    /* renamed from: d */
    public void m10418d(float f) {
        this.f2837O = f;
    }

    /* renamed from: e */
    public void m10413e(float f) {
        this.f2837O = C0892a.f2565a * f;
    }

    /* renamed from: o */
    public float m10401o() {
        return this.f2837O;
    }

    /* renamed from: p */
    public float m10400p() {
        return this.f2837O / C0892a.f2565a;
    }

    /* renamed from: a */
    public void m10441a(int i) {
        this.f2838P = i;
    }

    /* renamed from: b */
    public void m10430b(int i) {
        this.f2838P = i * C0892a.f2565a;
    }

    /* renamed from: q */
    public float m10399q() {
        return this.f2838P;
    }

    /* renamed from: r */
    public float m10398r() {
        return this.f2838P / C0892a.f2565a;
    }

    /* renamed from: c */
    public void m10423c(int i) {
        this.f2839Q = i;
    }

    /* renamed from: d */
    public void m10417d(int i) {
        this.f2839Q = i * C0892a.f2565a;
    }

    /* renamed from: s */
    public float m10397s() {
        return this.f2839Q;
    }

    /* renamed from: t */
    public float m10396t() {
        return this.f2839Q / C0892a.f2565a;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a
    public AbstractC1009c getTweenChild() {
        return this.f2835M;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a
    public void setTweenChild(AbstractC1009c abstractC1009c) {
        this.f2835M = abstractC1009c;
    }
}
