package com.tsf.shell.p096f.p131f.p132a.p136b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2747m;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.a.b.d */
/* loaded from: classes.dex */
public class C2737d extends AbstractC2747m {
    public C2737d(int i, boolean z) {
        super(i, C1306b.C1310d.drawer_transition_effect_extrusion, z);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2747m
    /* renamed from: a */
    public void mo4797a(int i, int i2, int i3, int i4, float f, ArrayList<Number3d> arrayList) {
        double d = 3.141592653589793d / i3;
        float f2 = 180 / i3;
        double d2 = d / 2.0d;
        float f3 = f2 / 2.0f;
        float f4 = 45.0f;
        float f5 = (180.0f - (2.0f * 45.0f)) / (i4 - 1);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            float f6 = f4;
            if (i6 < i4) {
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    if (i8 < i3) {
                        int i9 = (i6 * i3) + i8;
                        AbstractC2747m.C2752b a = m4798a(i9);
                        int i10 = (i3 - i8) - 1;
                        float sin = (1.5f * f) - ((float) (Math.sin(0.017453292519943295d * f6) * f));
                        a.f9009a = (float) (Math.cos((i10 * d) + d2) * sin);
                        a.f9010b = arrayList.get(i9).f2527y * 0.9f;
                        a.f9011c = (float) (Math.sin((i10 * d) + d2) * sin);
                        a.f9012d = 90.0f - ((i10 * f2) + f3);
                        a.f9013e = 90.0f - f6;
                        i7 = i8 + 1;
                    }
                }
                f4 = f6 + f5;
                i5 = i6 + 1;
            } else {
                return;
            }
        }
    }
}
