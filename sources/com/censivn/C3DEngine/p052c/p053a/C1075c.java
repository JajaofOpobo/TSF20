package com.censivn.C3DEngine.p052c.p053a;

import com.censivn.C3DEngine.api.element.FacesBufferedList;
import com.censivn.C3DEngine.api.element.PointBufferManager;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.c.a.c */
/* loaded from: classes.dex */
public class C1075c {

    /* renamed from: a */
    protected ArrayList<C1077e> f3381a = new ArrayList<>();

    /* renamed from: b */
    protected ArrayList<C1071a> f3382b = new ArrayList<>();

    /* renamed from: c */
    protected float f3383c;

    /* renamed from: d */
    protected float f3384d;

    /* renamed from: e */
    protected float f3385e;

    /* renamed from: f */
    protected float f3386f;

    /* renamed from: g */
    protected float f3387g;

    /* renamed from: h */
    protected float f3388h;

    /* renamed from: i */
    protected int f3389i;

    /* renamed from: j */
    protected int f3390j;

    /* renamed from: k */
    protected int f3391k;

    /* renamed from: l */
    protected float f3392l;

    /* renamed from: m */
    protected float f3393m;

    /* renamed from: n */
    protected float f3394n;

    /* renamed from: a */
    public void m9945a(C0975i c0975i) {
        PointBufferManager points = c0975i.points();
        FacesBufferedList faces = c0975i.faces();
        int size = points.size();
        int size2 = faces.size();
        for (int i = 0; i < size; i++) {
            C1077e c1077e = new C1077e();
            c1077e.m9927a(i, points);
            this.f3381a.add(c1077e);
        }
        for (int i2 = 0; i2 < size2; i2++) {
            C1071a c1071a = new C1071a();
            short propertyA = faces.getPropertyA(i2);
            short propertyB = faces.getPropertyB(i2);
            c1071a.m9970a(this.f3381a.get(propertyA));
            c1071a.m9970a(this.f3381a.get(propertyB));
            c1071a.m9970a(this.f3381a.get((int) faces.getPropertyC(i2)));
            this.f3382b.add(c1071a);
        }
    }

    /* renamed from: b */
    public void m9942b(C0975i c0975i) {
        PointBufferManager points = c0975i.points();
        int size = points.size();
        for (int i = 0; i < size; i++) {
            this.f3381a.get(i).m9927a(i, points);
        }
    }

    /* renamed from: a */
    public ArrayList<C1077e> m9947a() {
        return this.f3381a;
    }

    /* renamed from: b */
    public ArrayList<C1071a> m9944b() {
        return this.f3382b;
    }

    /* renamed from: c */
    public void m9941c() {
        int size = m9947a().size();
        for (int i = 0; i < size; i++) {
            C1077e c1077e = m9947a().get(i);
            if (i == 0) {
                float m9932a = c1077e.m9932a();
                this.f3383c = m9932a;
                this.f3386f = m9932a;
                float m9925b = c1077e.m9925b();
                this.f3384d = m9925b;
                this.f3387g = m9925b;
                float m9921c = c1077e.m9921c();
                this.f3385e = m9921c;
                this.f3388h = m9921c;
            } else {
                this.f3386f = Math.min(this.f3386f, c1077e.m9932a());
                this.f3387g = Math.min(this.f3387g, c1077e.m9925b());
                this.f3388h = Math.min(this.f3388h, c1077e.m9921c());
                this.f3383c = Math.max(this.f3383c, c1077e.m9932a());
                this.f3384d = Math.max(this.f3384d, c1077e.m9925b());
                this.f3385e = Math.max(this.f3385e, c1077e.m9921c());
            }
            c1077e.m9923b(c1077e.m9932a(), c1077e.m9925b(), c1077e.m9921c());
        }
        this.f3392l = this.f3383c - this.f3386f;
        this.f3393m = this.f3384d - this.f3387g;
        this.f3394n = this.f3385e - this.f3388h;
        float max = Math.max(this.f3392l, Math.max(this.f3393m, this.f3394n));
        float min = Math.min(this.f3392l, Math.min(this.f3393m, this.f3394n));
        if (max == this.f3392l && min == this.f3393m) {
            this.f3391k = 2;
            this.f3390j = 4;
            this.f3389i = 1;
        } else if (max == this.f3392l && min == this.f3394n) {
            this.f3391k = 4;
            this.f3390j = 2;
            this.f3389i = 1;
        } else if (max == this.f3393m && min == this.f3392l) {
            this.f3391k = 1;
            this.f3390j = 4;
            this.f3389i = 2;
        } else if (max == this.f3393m && min == this.f3394n) {
            this.f3391k = 4;
            this.f3390j = 1;
            this.f3389i = 2;
        } else if (max == this.f3394n && min == this.f3392l) {
            this.f3391k = 1;
            this.f3390j = 2;
            this.f3389i = 4;
        } else if (max == this.f3394n && min == this.f3393m) {
            this.f3391k = 2;
            this.f3390j = 1;
            this.f3389i = 4;
        }
        for (int i2 = 0; i2 < size; i2++) {
            C1077e c1077e2 = m9947a().get(i2);
            c1077e2.m9930a((c1077e2.m9932a() - this.f3386f) / this.f3392l, (c1077e2.m9925b() - this.f3387g) / this.f3393m, (c1077e2.m9921c() - this.f3388h) / this.f3394n);
        }
    }

    /* renamed from: d */
    public void m9940d() {
        int size = m9947a().size();
        for (int i = 0; i < size; i++) {
            m9947a().get(i).m9919d();
        }
    }

    /* renamed from: e */
    public void m9939e() {
        int size = m9947a().size();
        for (int i = 0; i < size; i++) {
            m9947a().get(i).m9918e();
        }
        m9941c();
    }

    /* renamed from: a */
    public float m9946a(int i) {
        switch (i) {
            case 1:
                return this.f3386f;
            case 2:
                return this.f3387g;
            case 3:
            default:
                return -1.0f;
            case 4:
                return this.f3388h;
        }
    }

    /* renamed from: f */
    public float m9938f() {
        return this.f3383c;
    }

    /* renamed from: g */
    public float m9937g() {
        return this.f3384d;
    }

    /* renamed from: h */
    public float m9936h() {
        return this.f3385e;
    }

    /* renamed from: b */
    public float m9943b(int i) {
        switch (i) {
            case 1:
                return this.f3383c;
            case 2:
                return this.f3384d;
            case 3:
            default:
                return -1.0f;
            case 4:
                return this.f3385e;
        }
    }

    /* renamed from: i */
    public int m9935i() {
        return this.f3389i;
    }

    /* renamed from: j */
    public int m9934j() {
        return this.f3391k;
    }

    /* renamed from: k */
    public void m9933k() {
    }
}
