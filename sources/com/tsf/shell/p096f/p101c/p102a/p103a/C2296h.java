package com.tsf.shell.p096f.p101c.p102a.p103a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p101c.p102a.C2310d;
import com.tsf.shell.p096f.p101c.p102a.C2326f;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2288a;
/* renamed from: com.tsf.shell.f.c.a.a.h */
/* loaded from: classes.dex */
public class C2296h extends C2294f {
    public C2296h() {
        this.f7473c = 1;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2297i, com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public void mo5920a(C0980j c0980j, C0980j c0980j2) {
        float maxY = c0980j2.position().f2527y + ((c0980j2.maxY() - c0980j2.minY()) * 0.5f) + c0980j2.minY();
        PositionNumber3d position = c0980j.position();
        position.f2527y = ((maxY - c0980j.position().f2527y) * 0.15f) + position.f2527y;
        c0980j.position().f2526x = (-160.0f) * C0892a.f2566b;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2294f, com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: b */
    public int mo5923b(float f, float f2) {
        return m5946b(-f);
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2294f, com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public void mo5925a(C0975i c0975i, float f, float f2, float f3) {
        c0975i.setAABBPX(C0892a.f2566b * (-83.0f), 0.0f + f, 0.0f, 2.1474836E9f, f3 - f2, 0.0f);
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2297i
    /* renamed from: a */
    public float mo5919a(C2310d c2310d, C0975i c0975i, float f) {
        return c2310d.f7537a + (c0975i.maxX() * f);
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2297i, com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public void mo5918a(C2310d c2310d, C0975i c0975i, float f, boolean z) {
        if (!this.f7474d) {
            c2310d.f7537a = 0.0f + ((-c0975i.maxX()) * f) + C2326f.f7581q;
        } else if (z) {
            c2310d.f7537a = c2310d.f7543g - (c0975i.maxX() * f);
        } else {
            c2310d.f7537a = ((-(c0975i.maxX() + c0975i.minX())) / 2.0f) * f;
        }
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2297i, com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public Number3d mo5921a(C0975i c0975i) {
        Number3d.TEMPNUMBER3D.f2527y = c0975i.position().f2527y;
        Number3d.TEMPNUMBER3D.f2526x = C0892a.f2550A + C2326f.f7567b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2297i, com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: b */
    public Number3d mo5916b(C0975i c0975i) {
        Number3d.TEMPNUMBER3D.f2527y = c0975i.position().f2527y;
        Number3d.TEMPNUMBER3D.f2526x = C0892a.f2550A - C2326f.f7566a;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2294f, com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public C2288a.C2289a mo5924a(C0975i c0975i, float f, float f2, float f3, float f4) {
        float asin;
        C2288a.C2289a c2289a = C2288a.f7472b;
        float f5 = ((-C0892a.f2552C) - C2326f.f7566a) + c0975i.position().f2527y;
        if (f5 > f) {
            asin = 180.0f;
        } else {
            asin = ((float) (Math.asin(f5 / f) / 0.017453292519943295d)) + 90.0f;
        }
        c2289a.f7476a = f4;
        c2289a.f7477b = ((asin - (f4 - f2)) + f2) - f3;
        c2289a.f7479d = ((f4 / 2.0f) + 0.0f) - f2;
        c2289a.f7480e = (f4 - f2) + 0.0f + (c2289a.f7477b / 2.0f) + f3;
        return c2289a;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2294f, com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public int mo5926a(float f, float f2, float f3) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        return (f <= f2 - 20.0f || f >= f2 + 20.0f) ? 1 : 2;
    }
}
