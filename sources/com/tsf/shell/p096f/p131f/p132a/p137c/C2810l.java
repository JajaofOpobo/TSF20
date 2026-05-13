package com.tsf.shell.p096f.p131f.p132a.p137c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.manager.p183o.C3566b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.a.c.l */
/* loaded from: classes.dex */
public class C2810l {

    /* renamed from: a */
    private static float f9162a;

    /* renamed from: b */
    private static float f9163b;

    /* renamed from: c */
    private static float f9164c;

    /* renamed from: f */
    private float f9167f;

    /* renamed from: g */
    private float f9168g;

    /* renamed from: e */
    private double f9166e = 0.0d;

    /* renamed from: d */
    private ArrayList<C2811a> f9165d = new ArrayList<>();

    /* renamed from: a */
    public C0975i mo4628a(int i) {
        return null;
    }

    /* renamed from: a */
    public C0980j mo4630a() {
        return null;
    }

    public C2810l(C2775c c2775c, float f) {
        this.f9167f = f;
        f9164c = C3566b.f11839a.f11762T / 5.0f;
        f9162a = (C3566b.f11839a.f11762T / 4.0f) * 3.0f;
        f9163b = 0.0f;
    }

    /* renamed from: a */
    public void m4629a(float f) {
        this.f9168g = f;
    }

    /* renamed from: b */
    public void m4624b() {
        f9163b = m4619f();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f9165d.size()) {
                C0975i mo4628a = mo4628a(i2);
                C2811a c2811a = this.f9165d.get(i2);
                c2811a.f9169a.f2526x = f9163b + this.f9168g + (f9164c * i2);
                Number3d number3d = c2811a.f9169a;
                float f = (-20.0f) * C0892a.f2567c;
                c2811a.f9172d = f;
                number3d.f2527y = f;
                mo4628a.setAnimationObjectState(true);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public void m4622c() {
        int size = this.f9165d.size();
        double d = this.f9166e;
        for (int i = 0; i < size; i++) {
            C0975i mo4628a = mo4628a(i);
            if (m4626a(mo4628a, mo4628a.position().f2526x)) {
                mo4628a.visible(true);
            } else {
                mo4628a.visible(false);
            }
            C2811a c2811a = this.f9165d.get(i);
            c2811a.m4618a(Double.valueOf(d), 1.0f);
            d -= 0.3490658503988659d;
            if (mo4628a.visible() || m4626a(mo4628a, c2811a.f9169a.f2526x)) {
                mo4628a.position().f2526x += (c2811a.f9171c - mo4628a.position().f2526x) * 0.1f;
                mo4628a.position().f2527y += (c2811a.f9172d - mo4628a.position().f2527y) * 0.1f;
                Number3d scale = mo4628a.scale();
                scale.f2526x = ((c2811a.f9170b - mo4628a.scale().f2526x) * 0.1f) + scale.f2526x;
                mo4628a.scale().f2527y = mo4628a.scale().f2526x;
            }
        }
        this.f9166e += 0.08726646259971647d;
        int size2 = this.f9165d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mo4628a((size2 - i2) - 1).dispatchDraw();
        }
    }

    /* renamed from: d */
    private void m4621d() {
        this.f9165d.add(new C2811a());
    }

    /* renamed from: e */
    private void m4620e() {
        this.f9165d.remove(this.f9165d.size() - 1);
    }

    /* renamed from: a */
    private boolean m4626a(C0975i c0975i, float f) {
        return (c0975i.minX() + f) + mo4630a().position().f2526x <= ((float) C0892a.f2550A) && (c0975i.maxX() + f) + mo4630a().position().f2526x >= ((float) C0892a.f2590z);
    }

    /* renamed from: f */
    private float m4619f() {
        float numChildren = f9164c * (mo4630a().numChildren() - 1);
        if (numChildren < C0892a.f2553D - C3566b.f11839a.f11762T) {
            return (-numChildren) / 2.0f;
        }
        return C0892a.f2590z + f9162a;
    }

    /* renamed from: a */
    public void m4627a(C0975i c0975i) {
        m4621d();
    }

    /* renamed from: b */
    public void m4623b(C0975i c0975i) {
        m4620e();
    }

    /* renamed from: com.tsf.shell.f.f.a.c.l$a */
    /* loaded from: classes.dex */
    public class C2811a {

        /* renamed from: c */
        public float f9171c;

        /* renamed from: d */
        public float f9172d;

        /* renamed from: b */
        public float f9170b = 1.0f;

        /* renamed from: a */
        public Number3d f9169a = new Number3d();

        public C2811a() {
        }

        /* renamed from: a */
        public void m4618a(Double d, float f) {
            double sin = Math.sin(d.doubleValue());
            Double.valueOf(d.doubleValue() + 0.03490658503988659d);
            this.f9170b = ((float) ((0.2f * sin) + (f - 0.2f))) * C2810l.this.f9167f;
            this.f9171c = (float) (this.f9169a.f2526x - ((sin * 10.0d) * C0892a.f2567c));
        }
    }
}
