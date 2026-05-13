package com.tsf.shell.p096f.p101c.p102a.p103a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p101c.p102a.C2310d;
import com.tsf.shell.p096f.p101c.p102a.C2326f;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.c.a.a.i */
/* loaded from: classes.dex */
public class C2297i extends C2288a {
    public C2297i() {
        this.f7473c = 0;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public float mo5922a(int i, ArrayList<C0975i> arrayList, float f) {
        float f2 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            C0975i c0975i = arrayList.get(i2);
            f2 += (c0975i.maxY() - c0975i.minY()) + f;
        }
        return f2 - f;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public void mo5920a(C0980j c0980j, C0980j c0980j2) {
        float maxY = c0980j2.position().f2527y + ((c0980j2.maxY() - c0980j2.minY()) * 0.5f) + c0980j2.minY();
        PositionNumber3d position = c0980j.position();
        position.f2527y = ((maxY - c0980j.position().f2527y) * 0.15f) + position.f2527y;
        c0980j.position().f2526x = 160.0f * C0892a.f2566b;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public float mo5917a(ArrayList<C0975i> arrayList, int i, float f, float f2, float f3, float f4) {
        if (i == 0) {
            return 1.0f;
        }
        float f5 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            C0975i c0975i = arrayList.get(i2);
            f5 += (c0975i.maxY() - c0975i.minY()) + f4;
        }
        float f6 = ((f - f2) - f3) / (f5 - f4);
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        return f6;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public void mo5918a(C2310d c2310d, C0975i c0975i, float f, boolean z) {
        if (c0975i instanceof C3145b) {
        }
        if (!this.f7474d) {
            c2310d.f7537a = (((-c0975i.minX()) * f) - C2326f.f7580p) - 0.0f;
        } else if (z) {
            c2310d.f7537a = c2310d.f7543g - (c0975i.minX() * f);
        } else {
            c2310d.f7537a = ((-(c0975i.maxX() + c0975i.minX())) / 2.0f) * f;
        }
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public Number3d mo5921a(C0975i c0975i) {
        Number3d.TEMPNUMBER3D.f2527y = c0975i.position().f2527y;
        Number3d.TEMPNUMBER3D.f2526x = C0892a.f2590z - C2326f.f7567b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: b */
    public Number3d mo5916b(C0975i c0975i) {
        Number3d.TEMPNUMBER3D.f2527y = c0975i.position().f2527y;
        Number3d.TEMPNUMBER3D.f2526x = C0892a.f2590z + C2326f.f7566a;
        return Number3d.TEMPNUMBER3D;
    }

    /* renamed from: a */
    public float mo5919a(C2310d c2310d, C0975i c0975i, float f) {
        return c2310d.f7537a + (c0975i.minX() * f);
    }
}
