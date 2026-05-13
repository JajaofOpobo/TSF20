package com.tsf.shell.p096f.p101c.p105b.p106a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.p096f.p101c.p105b.C2355b;
import com.tsf.shell.p096f.p101c.p105b.C2359e;
import com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.c.b.a.b */
/* loaded from: classes.dex */
public class C2354b implements InterfaceC2351a {

    /* renamed from: a */
    private InterfaceC2351a.C2352a f7705a;

    /* renamed from: b */
    private float f7706b;

    /* renamed from: c */
    private float f7707c;

    /* renamed from: d */
    private float f7708d;

    /* renamed from: e */
    private float f7709e;

    /* renamed from: f */
    private float f7710f;

    /* renamed from: g */
    private float f7711g;

    /* renamed from: h */
    private float f7712h;

    /* renamed from: i */
    private int f7713i;

    /* renamed from: j */
    private C2359e f7714j;

    /* renamed from: k */
    private C3560a f7715k;

    public C2354b(C2359e c2359e, C3560a c3560a) {
        this.f7714j = c2359e;
        this.f7715k = c3560a;
        this.f7706b = c3560a.f11750H;
        this.f7707c = c3560a.f11750H / 2.0f;
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a
    /* renamed from: a */
    public void mo5754a(C0975i c0975i) {
        c0975i.setAABBPX((-this.f7708d) / 2.0f, -C0892a.f2571g, 0.0f, this.f7708d / 2.0f, C0892a.f2572h + (C0892a.f2571g / 2.0f), 0.0f);
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a
    /* renamed from: a */
    public void mo5759a(float f, float f2, float f3, float f4) {
        this.f7708d = f;
        this.f7709e = f2;
        this.f7710f = f3;
        this.f7711g = f4;
        float f5 = (f - f2) - f3;
        int i = 1;
        while (true) {
            float m5758a = f5 / m5758a(i);
            if (m5758a > 0.4f) {
                this.f7712h = m5758a;
                this.f7713i = i;
                i++;
            } else {
                m5751c();
                return;
            }
        }
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a
    /* renamed from: a */
    public void mo5753a(ArrayList<C2355b> arrayList, int i) {
        float m5758a = m5758a(i);
        float f = (this.f7708d - this.f7709e) - this.f7710f;
        float f2 = f / m5758a;
        if (f2 > 0.93f) {
            f2 = 0.93f;
        }
        float f3 = f2 < this.f7712h ? this.f7712h : f2;
        float f4 = C3145b.f10241l.m3224c().folder.nameTextFormat.auto ? -this.f7715k.f11767Y : (-(C3145b.f10242m.f10328f + C3145b.f10242m.f10330h)) / 2.0f;
        float f5 = -this.f7715k.f11767Y;
        if (f3 == 0.93f) {
            float f6 = f / i;
            float f7 = f6 / 2.0f;
            float f8 = ((-this.f7708d) / 2.0f) + this.f7709e + f7;
            for (int i2 = 0; i2 < i; i2++) {
                C2355b c2355b = arrayList.get(i2);
                c2355b.f7718c = f8;
                c2355b.f7716a = f8;
                c2355b.f7717b = f5;
                c2355b.f7719d = f4;
                c2355b.f7723h = (c2355b.f7716a - this.f7707c) - f7;
                c2355b.f7722g = c2355b.f7716a + this.f7707c + f7;
                c2355b.f7720e = 0.0f;
                c2355b.f7726k = 255.0f;
                c2355b.f7721f = f3;
                c2355b.f7725j = false;
                f8 = c2355b.f7716a + f6;
            }
            return;
        }
        float f9 = this.f7711g * f3;
        float f10 = f9 / 2.0f;
        int i3 = (i / this.f7713i) + 1;
        int i4 = i % this.f7713i == 0 ? i3 - 1 : i3;
        for (int i5 = 0; i5 < i4; i5++) {
            float f11 = (this.f7708d * i5) + ((-this.f7708d) / 2.0f) + this.f7709e;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = (this.f7713i * i5) + i6;
                if (i7 > i - 1) {
                    break;
                }
                C2355b c2355b2 = arrayList.get(i7);
                float f12 = f11 + (this.f7707c * f3);
                c2355b2.f7718c = f12;
                c2355b2.f7716a = f12;
                c2355b2.f7717b = f5 * f3;
                c2355b2.f7719d = f4 * f3;
                c2355b2.f7723h = (c2355b2.f7716a - (this.f7707c * f3)) - f10;
                c2355b2.f7722g = c2355b2.f7716a + (this.f7707c * f3) + f10;
                c2355b2.f7720e = 0.0f;
                if (i5 > 0) {
                    c2355b2.f7726k = 0.0f;
                } else {
                    c2355b2.f7726k = 255.0f;
                }
                c2355b2.f7721f = f3;
                c2355b2.f7721f = f3;
                c2355b2.f7725j = false;
                f11 = c2355b2.f7716a + (this.f7707c * f3) + f9;
            }
        }
    }

    /* renamed from: a */
    public float m5758a(int i) {
        return (i * this.f7706b) + ((i - 1) * this.f7711g);
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a
    /* renamed from: a */
    public int mo5760a() {
        return this.f7713i;
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a
    /* renamed from: a */
    public InterfaceC2351a.C2353b mo5756a(Number3d number3d, ArrayList<C2355b> arrayList, int i) {
        InterfaceC2351a.C2353b c2353b = InterfaceC2351a.C2353b.f7702c;
        float f = number3d.f2526x;
        int size = arrayList.size();
        if (i == -1) {
            for (int i2 = 0; i2 < size; i2++) {
                if (f < arrayList.get(i2).f7716a) {
                    c2353b.f7703a = i2;
                    m5755a(number3d, arrayList, c2353b);
                    return c2353b;
                }
            }
            c2353b.f7703a = size;
            m5755a(number3d, arrayList, c2353b);
            return c2353b;
        }
        for (int i3 = 0; i3 < size; i3++) {
            C2355b c2355b = arrayList.get(i3);
            if (i != i3 && f <= c2355b.f7716a) {
                if (i3 > i) {
                    c2353b.f7703a = i3 - 1;
                    m5755a(number3d, arrayList, c2353b);
                    return c2353b;
                } else {
                    c2353b.f7703a = i3;
                    m5755a(number3d, arrayList, c2353b);
                    return c2353b;
                }
            }
        }
        c2353b.f7703a = size - 1;
        m5755a(number3d, arrayList, c2353b);
        return c2353b;
    }

    /* renamed from: a */
    private void m5755a(Number3d number3d, ArrayList<C2355b> arrayList, InterfaceC2351a.C2353b c2353b) {
        int size = arrayList.size();
        float f = number3d.f2526x;
        c2353b.f7704b = 0;
        for (int i = 0; i < size; i++) {
            C2355b c2355b = arrayList.get(i);
            if (f >= c2355b.f7723h && f <= c2355b.f7722g) {
                c2353b.f7704b = i;
            }
        }
    }

    /* renamed from: c */
    private void m5751c() {
        if (this.f7705a == null) {
            this.f7705a = new InterfaceC2351a.C2352a();
        }
        this.f7705a.f7694e = 0.0f;
        this.f7705a.f7695f = C0892a.f2571g / 2;
        this.f7705a.f7698i = 0.0f;
        this.f7705a.f7699j = (-C0892a.f2571g) / 2;
        this.f7705a.f7696g = 0.0f;
        this.f7705a.f7697h = C0892a.f2571g + C0892a.f2572h;
        this.f7705a.f7700k = 0.0f;
        this.f7705a.f7701l = C0892a.f2572h;
        if (this.f7714j.m5714e()) {
            float m10742a = 0.0f - C0892a.m10742a(135.0f);
            this.f7705a.f7690a = 0.0f;
            this.f7705a.f7691b = m10742a;
            this.f7705a.f7692c = 0.0f;
            this.f7705a.f7693d = (m10742a - C0892a.f2571g) - (C0892a.f2572h * 2.0f);
            return;
        }
        this.f7705a.f7690a = 0.0f;
        this.f7705a.f7691b = C0892a.f2552C;
        this.f7705a.f7692c = 0.0f;
        this.f7705a.f7693d = (C0892a.f2552C - C0892a.f2571g) - (C0892a.f2572h * 2.0f);
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a
    /* renamed from: b */
    public InterfaceC2351a.C2352a mo5752b() {
        if (this.f7705a == null) {
            m5751c();
        }
        return this.f7705a;
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a
    /* renamed from: a */
    public void mo5757a(Number3d number3d) {
        number3d.f2527y = (C0892a.f2552C + (C0892a.f2571g / 2.0f)) - this.f7715k.f11767Y;
    }
}
