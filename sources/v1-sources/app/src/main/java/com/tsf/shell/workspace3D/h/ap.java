package com.tsf.shell.workspace3D.h;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
final class ap extends com.censivn.C3DEngine.b.v {
    final /* synthetic */ ao a;

    ap(ao aoVar) {
        this.a = aoVar;
    }

    @Override // com.censivn.C3DEngine.b.v
    public final void aE() {
        com.censivn.C3DEngine.b.v vVar;
        boolean z;
        vVar = this.a.z;
        Iterator it = vVar.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            a aVar = (a) rVar;
            float f = rVar.M().y + M().y;
            int abs = Math.abs(((int) f) / 360);
            float f2 = f > 0.0f ? f - (abs * 360) : f - ((-abs) * 360);
            if (f2 < 0.0f) {
                f2 += 360.0f;
            }
            if (f2 <= 90.0f || f2 >= 270.0f) {
                z = true;
            } else {
                z = false;
            }
            aVar.i(z);
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        boolean z;
        boolean z2;
        az azVar;
        float f;
        boolean z3;
        float f2;
        float f3;
        float f4;
        float abs;
        boolean z4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        com.censivn.C3DEngine.b.v vVar;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        z = this.a.v;
        if (!z) {
            z2 = this.a.y;
            if (!z2) {
                ArrayList aD = aD();
                azVar = this.a.D;
                Collections.sort(aD, azVar);
                PositionNumber3d L = L();
                float f25 = L.z;
                f = this.a.r;
                L.z = f25 + ((f - L().z) * 0.2f);
                z3 = this.a.x;
                if (z3) {
                    abs = 255.0f;
                } else {
                    float f26 = L().z;
                    f2 = this.a.n;
                    float f27 = f26 - f2;
                    f3 = this.a.o;
                    f4 = this.a.n;
                    abs = Math.abs(f27 / (f3 - f4)) * 255.0f;
                }
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= this.a.c.l) {
                        break;
                    }
                    ((a) this.a.c.i.get(i2)).g(abs);
                    i = i2 + 1;
                }
                z4 = this.a.x;
                if (z4) {
                    Number3d M = M();
                    float f28 = M.y;
                    f23 = this.a.p;
                    M.y = f28 + ((f23 - M().y) * 0.3f);
                    Number3d M2 = M();
                    float f29 = M2.x;
                    f24 = this.a.q;
                    M2.x = f29 + ((f24 - M().x) * 0.3f);
                    return;
                }
                Number3d M3 = M();
                float f30 = M3.y;
                f5 = this.a.p;
                float f31 = f5 - M().y;
                f6 = this.a.w;
                M3.y = f30 + (f31 * f6);
                Number3d M4 = M();
                float f32 = M4.x;
                f7 = this.a.q;
                float f33 = f7 - M().x;
                f8 = this.a.w;
                M4.x = f32 + (f33 * f8);
                f9 = this.a.p;
                if (Math.abs(f9 - M().y) <= 0.1f) {
                    f19 = this.a.q;
                    if (Math.abs(f19 - M().x) <= 0.1f) {
                        Number3d M5 = M();
                        f20 = this.a.p;
                        M5.y = f20;
                        Number3d M6 = M();
                        f21 = this.a.q;
                        M6.x = f21;
                        this.a.v = true;
                        PositionNumber3d L2 = L();
                        f22 = this.a.n;
                        L2.z = f22;
                        ao.n(this.a);
                        return;
                    }
                }
                vVar = this.a.z;
                float f34 = vVar.M().y;
                f10 = this.a.t;
                float f35 = f34 - f10;
                f11 = this.a.s;
                float f36 = f35 / f11;
                float abs2 = 1.0f - (Math.abs(f36 - 0.5f) * 2.0f);
                if (f36 < 0.5d) {
                    ao aoVar = this.a;
                    f16 = this.a.u;
                    f17 = this.a.o;
                    f18 = this.a.u;
                    aoVar.r = (abs2 * (f17 - f18)) + f16;
                } else {
                    ao aoVar2 = this.a;
                    f12 = this.a.n;
                    f13 = this.a.o;
                    f14 = this.a.n;
                    aoVar2.r = (abs2 * (f13 - f14)) + f12;
                }
                if (f36 > 0.9d) {
                    ao aoVar3 = this.a;
                    f15 = aoVar3.w;
                    aoVar3.w = f15 + 0.008f;
                }
                if (f36 > 0.9d) {
                    float f37 = (1.0f - f36) * 10.0f;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 < this.a.c.l) {
                            a aVar = (a) this.a.c.i.get(i4);
                            if (aVar != this.a.c.k) {
                                aVar.aS().b((int) (255.0f * f37));
                            }
                            i3 = i4 + 1;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
