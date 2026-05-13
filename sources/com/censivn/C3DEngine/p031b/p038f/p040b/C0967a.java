package com.censivn.C3DEngine.p031b.p038f.p040b;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.censivn.C3DEngine.b.f.b.a */
/* loaded from: classes.dex */
public class C0967a extends C0981k {

    /* renamed from: a */
    private float f2873a;

    /* renamed from: d */
    private float f2874d;

    /* renamed from: e */
    private float f2875e;

    /* renamed from: f */
    private float f2876f;

    /* renamed from: g */
    private float f2877g;

    /* renamed from: h */
    private float f2878h;

    /* renamed from: i */
    private float f2879i;

    /* renamed from: j */
    private float f2880j;

    /* renamed from: k */
    private float f2881k;

    public C0967a(float f, float f2, C0968b c0968b) {
        this(f, f2, C0892a.f2566b, c0968b);
    }

    public C0967a(float f, float f2, float f3, C0968b c0968b) {
        super(f, f2, 3, 3, false);
        this.f2881k = f3;
        m10390a(c0968b, false);
        m10389b(this.f2925b, this.f2926c);
    }

    /* renamed from: a */
    public void m10391a(C0968b c0968b) {
        m10390a(c0968b, true);
    }

    /* renamed from: a */
    private void m10390a(C0968b c0968b, boolean z) {
        float f = c0968b.f2882a;
        float f2 = c0968b.f2883b;
        float f3 = c0968b.f2884c;
        float f4 = c0968b.f2885d;
        float f5 = c0968b.f2886e;
        float f6 = c0968b.f2887f;
        uvs().set(0, 1.0f, 1.0f);
        uvs().set(3, 0.0f, 1.0f);
        uvs().set(12, 1.0f, 0.0f);
        uvs().set(15, 0.0f, 0.0f);
        uvs().set(1, f2 / f5, 1.0f);
        uvs().set(2, f / f5, 1.0f);
        uvs().set(4, 1.0f, f4 / f6);
        uvs().set(5, f2 / f5, f4 / f6);
        uvs().set(6, f / f5, f4 / f6);
        uvs().set(7, 0.0f, f4 / f6);
        uvs().set(8, 1.0f, f3 / f6);
        uvs().set(9, f2 / f5, f3 / f6);
        uvs().set(10, f / f5, f3 / f6);
        uvs().set(11, 0.0f, f3 / f6);
        uvs().set(13, f2 / f5, 0.0f);
        uvs().set(14, f / f5, 0.0f);
        this.f2874d = f5 - f2;
        this.f2873a = f;
        this.f2875e = f6 - f4;
        this.f2876f = f3;
        if (z) {
            syncUpdateUvsVBO();
        }
    }

    /* renamed from: b */
    public void m10389b(float f, float f2) {
        this.f2925b = f;
        this.f2926c = f2;
        m10382g();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0981k
    /* renamed from: a */
    public void mo10368a(float f) {
        this.f2925b = f;
        m10382g();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0981k
    /* renamed from: b */
    public void mo5215b(float f) {
        this.f2926c = f;
        m10382g();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0981k
    /* renamed from: b */
    public float mo10366b() {
        return this.f2925b;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0981k
    /* renamed from: c */
    public float mo10365c() {
        return this.f2926c;
    }

    /* renamed from: c */
    public void m10388c(float f, float f2) {
        this.f2925b = (this.f2874d * this.f2881k) + f + (this.f2873a * this.f2881k);
        this.f2926c = (this.f2875e * this.f2881k) + f2 + (this.f2876f * this.f2881k);
        m10382g();
    }

    /* renamed from: g */
    private void m10382g() {
        float f = this.f2925b / 2.0f;
        this.f2878h = f;
        this.f2877g = f;
        float f2 = this.f2926c / 2.0f;
        this.f2880j = f2;
        this.f2879i = f2;
        float f3 = -f2;
        points().setPX(0, f, f3, 0.0f);
        points().setPX(1, f - (this.f2874d * this.f2881k), f3, 0.0f);
        points().setPX(2, (-f) + (this.f2873a * this.f2881k), f3, 0.0f);
        points().setPX(3, -f, f3, 0.0f);
        float f4 = (-f2) + (this.f2875e * this.f2881k);
        points().setPX(4, f, f4, 0.0f);
        points().setPX(5, f - (this.f2874d * this.f2881k), f4, 0.0f);
        points().setPX(6, (-f) + (this.f2873a * this.f2881k), f4, 0.0f);
        points().setPX(7, -f, f4, 0.0f);
        float f5 = f2 - (this.f2876f * this.f2881k);
        points().setPX(8, f, f5, 0.0f);
        points().setPX(9, f - (this.f2874d * this.f2881k), f5, 0.0f);
        points().setPX(10, (-f) + (this.f2873a * this.f2881k), f5, 0.0f);
        points().setPX(11, -f, f5, 0.0f);
        points().setPX(12, f, f2, 0.0f);
        points().setPX(13, f - (this.f2874d * this.f2881k), f2, 0.0f);
        points().setPX(14, (-f) + (this.f2873a * this.f2881k), f2, 0.0f);
        points().setPX(15, -f, f2, 0.0f);
        syncUpdatePointVBO();
    }

    /* renamed from: a */
    public float m10392a() {
        return this.f2879i;
    }

    /* renamed from: c */
    public void mo5000c(float f) {
        m10386d(f);
        syncUpdatePointVBO();
    }

    /* renamed from: d */
    public void m10386d(float f) {
        this.f2879i = f;
        points().pxY(8, f - (this.f2876f * this.f2881k));
        points().pxY(9, f - (this.f2876f * this.f2881k));
        points().pxY(10, f - (this.f2876f * this.f2881k));
        points().pxY(11, f - (this.f2876f * this.f2881k));
        points().pxY(12, f);
        points().pxY(13, f);
        points().pxY(14, f);
        points().pxY(15, f);
    }

    /* renamed from: d */
    public float m10387d() {
        return this.f2880j;
    }

    /* renamed from: e */
    public void mo4996e(float f) {
        m10383f(f);
        syncUpdatePointVBO();
    }

    /* renamed from: f */
    public void m10383f(float f) {
        this.f2880j = f;
        points().pxY(0, -f);
        points().pxY(1, -f);
        points().pxY(2, -f);
        points().pxY(3, -f);
        points().pxY(4, (-f) + (this.f2875e * this.f2881k));
        points().pxY(5, (-f) + (this.f2875e * this.f2881k));
        points().pxY(6, (-f) + (this.f2875e * this.f2881k));
        points().pxY(7, (-f) + (this.f2875e * this.f2881k));
    }

    /* renamed from: e */
    public float m10385e() {
        return this.f2878h;
    }

    /* renamed from: g */
    public void mo4992g(float f) {
        m10381h(f);
        syncUpdatePointVBO();
    }

    /* renamed from: h */
    public void m10381h(float f) {
        this.f2878h = f;
        points().pxX(0, this.f2878h);
        points().pxX(1, this.f2878h - (this.f2874d * this.f2881k));
        points().pxX(4, this.f2878h);
        points().pxX(5, this.f2878h - (this.f2874d * this.f2881k));
        points().pxX(8, this.f2878h);
        points().pxX(9, this.f2878h - (this.f2874d * this.f2881k));
        points().pxX(12, this.f2878h);
        points().pxX(13, this.f2878h - (this.f2874d * this.f2881k));
    }

    /* renamed from: f */
    public float m10384f() {
        return this.f2877g;
    }

    /* renamed from: i */
    public void mo4988i(float f) {
        m10380j(f);
        syncUpdatePointVBO();
    }

    /* renamed from: j */
    public void m10380j(float f) {
        this.f2877g = f;
        points().pxX(2, (-this.f2877g) + (this.f2873a * this.f2881k));
        points().pxX(3, -this.f2877g);
        points().pxX(6, (-this.f2877g) + (this.f2873a * this.f2881k));
        points().pxX(7, -this.f2877g);
        points().pxX(10, (-this.f2877g) + (this.f2873a * this.f2881k));
        points().pxX(11, -this.f2877g);
        points().pxX(14, (-this.f2877g) + (this.f2873a * this.f2881k));
        points().pxX(15, -this.f2877g);
    }
}
