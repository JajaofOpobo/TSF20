package com.censivn.C3DEngine.p052c.p053a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PointBufferManager;
import com.censivn.C3DEngine.p052c.p053a.p054a.C1073b;
/* renamed from: com.censivn.C3DEngine.c.a.e */
/* loaded from: classes.dex */
public class C1077e {

    /* renamed from: a */
    protected float f3396a;

    /* renamed from: b */
    protected float f3397b;

    /* renamed from: c */
    protected float f3398c;

    /* renamed from: d */
    private float f3399d;

    /* renamed from: e */
    private float f3400e;

    /* renamed from: f */
    private float f3401f;

    /* renamed from: g */
    private int f3402g;

    /* renamed from: h */
    private PointBufferManager f3403h;

    /* renamed from: i */
    private C1073b f3404i;

    /* renamed from: a */
    public void m9927a(int i, PointBufferManager pointBufferManager) {
        this.f3402g = i;
        this.f3403h = pointBufferManager;
        Number3d asNumber3dPX = pointBufferManager.getAsNumber3dPX(i);
        this.f3396a = asNumber3dPX.f2526x;
        this.f3397b = asNumber3dPX.f2527y;
        this.f3398c = asNumber3dPX.f2528z;
    }

    /* renamed from: a */
    public void m9930a(float f, float f2, float f3) {
        this.f3399d = f;
        this.f3400e = f2;
        this.f3401f = f3;
    }

    /* renamed from: b */
    public void m9923b(float f, float f2, float f3) {
        this.f3396a = f;
        this.f3397b = f2;
        this.f3398c = f3;
    }

    /* renamed from: a */
    public float m9932a() {
        return this.f3403h.pxX(this.f3402g);
    }

    /* renamed from: b */
    public float m9925b() {
        return this.f3403h.pxY(this.f3402g);
    }

    /* renamed from: c */
    public float m9921c() {
        return this.f3403h.pxZ(this.f3402g);
    }

    /* renamed from: a */
    public void m9931a(float f) {
        this.f3403h.pxX(this.f3402g, f);
    }

    /* renamed from: b */
    public void m9924b(float f) {
        this.f3403h.pxY(this.f3402g, f);
    }

    /* renamed from: c */
    public void m9920c(float f) {
        this.f3403h.pxZ(this.f3402g, f);
    }

    /* renamed from: a */
    public float m9929a(int i) {
        switch (i) {
            case 1:
                return m9932a();
            case 2:
                return m9925b();
            case 3:
            default:
                return 0.0f;
            case 4:
                return m9921c();
        }
    }

    /* renamed from: a */
    public void m9928a(int i, float f) {
        switch (i) {
            case 1:
                m9931a(f);
                return;
            case 2:
                m9924b(f);
                return;
            case 3:
            default:
                return;
            case 4:
                m9920c(f);
                return;
        }
    }

    /* renamed from: b */
    public float m9922b(int i) {
        switch (i) {
            case 1:
                return this.f3399d;
            case 2:
                return this.f3400e;
            case 3:
            default:
                return -1.0f;
            case 4:
                return this.f3401f;
        }
    }

    /* renamed from: d */
    public void m9919d() {
        m9931a(this.f3396a);
        m9924b(this.f3397b);
        m9920c(this.f3398c);
    }

    /* renamed from: e */
    public void m9918e() {
        this.f3396a = m9932a();
        this.f3397b = m9925b();
        this.f3398c = m9921c();
    }

    /* renamed from: a */
    public void m9926a(C1073b c1073b) {
        this.f3404i = c1073b;
    }

    /* renamed from: f */
    public C1073b m9917f() {
        return this.f3404i;
    }
}
