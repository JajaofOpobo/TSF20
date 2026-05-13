package com.tsf.shell.p096f.p131f.p132a.p136b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.p132a.C2676a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.a.b.h */
/* loaded from: classes.dex */
public class C2741h extends AbstractC2745k {

    /* renamed from: a */
    private int f8981a;

    /* renamed from: b */
    private int f8982b;

    /* renamed from: c */
    private int f8983c;

    /* renamed from: d */
    private ArrayList<ArrayList<C2742a>> f8984d;

    /* renamed from: e */
    private ArrayList<Number3d> f8985e;

    public C2741h(int i, boolean z) {
        super(i, C1306b.C1310d.drawer_transition_effect_round, z);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: a */
    public void mo4796a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
        int i5;
        this.f8981a = i;
        this.f8985e = arrayList;
        this.f8982b = arrayList.size();
        this.f8983c = i3;
        if (this.f8984d == null) {
            this.f8984d = new ArrayList<>();
        } else {
            this.f8984d.clear();
        }
        if (i > i2) {
            i5 = (int) ((i2 / 2) - (68.0f * C0892a.f2565a));
        } else {
            i5 = (int) ((i / 2) - (68.0f * C0892a.f2565a));
        }
        for (int i6 = 1; i6 < this.f8982b + 1; i6++) {
            ArrayList<C2742a> arrayList2 = new ArrayList<>();
            double d = 6.283185307179586d / i6;
            float f = 360 / i6;
            int i7 = this.f8983c - 1;
            for (int i8 = 0; i8 < i6; i8++) {
                C2742a c2742a = new C2742a();
                c2742a.f8986a = (float) (Math.sin(i7 * d) * i5);
                c2742a.f8987b = (float) (Math.cos(i7 * d) * i5);
                c2742a.f8988c = 180.0f - (i7 * f);
                arrayList2.add(c2742a);
                i7--;
                if (i7 == -1) {
                    i7 = i6 - 1;
                }
            }
            this.f8984d.add(arrayList2);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: a */
    public void mo4793a(C2676a c2676a, float f) {
        C2742a c2742a;
        Number3d number3d;
        int numChildren = c2676a.numChildren();
        c2676a.position().f2526x = this.f8981a * f;
        if (Math.abs(f) > 0.5d) {
            c2676a.rotation().f2528z = (-(f - 0.5f)) * 2.0f * 180.0f;
        } else {
            c2676a.rotation().f2528z = 0.0f;
        }
        float abs = Math.abs(f * 2.0f);
        float f2 = abs > 1.0f ? 1.0f : abs;
        if (numChildren != 0) {
            ArrayList<C2742a> arrayList = this.f8984d.get(numChildren - 1);
            for (int i = 0; i < numChildren; i++) {
                C0975i childAt = c2676a.getChildAt(i);
                if (i >= this.f8982b) {
                    c2742a = arrayList.get(this.f8982b - 1);
                    number3d = this.f8985e.get(this.f8982b - 1);
                } else {
                    c2742a = arrayList.get(i);
                    number3d = this.f8985e.get(i);
                }
                Number3d number3d2 = number3d;
                childAt.position().f2526x = number3d2.f2526x + ((c2742a.f8986a - number3d2.f2526x) * f2);
                childAt.position().f2527y = ((c2742a.f8987b - number3d2.f2527y) * f2) + number3d2.f2527y;
                childAt.rotation().f2528z = c2742a.f8988c * f2;
            }
        }
    }

    /* renamed from: com.tsf.shell.f.f.a.b.h$a */
    /* loaded from: classes.dex */
    class C2742a {

        /* renamed from: a */
        float f8986a;

        /* renamed from: b */
        float f8987b;

        /* renamed from: c */
        float f8988c;

        C2742a() {
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: c */
    public void mo4785c(C2676a c2676a) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: d */
    public void mo4784d(C2676a c2676a) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: e */
    public void mo4783e(C2676a c2676a) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: f */
    public void mo4782f(C2676a c2676a) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: a */
    public void mo4795a(C0980j c0980j) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: g */
    public void mo4781g(C2676a c2676a) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: h */
    public void mo4780h(C2676a c2676a) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: a */
    public void mo4794a(C2676a c2676a) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: b */
    public void mo4788b(C2676a c2676a) {
    }
}
