package com.tsf.shell.f.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import com.tsf.shell.f.f.a.b.m;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class j extends m {
    public j(int i, boolean z) {
        super(i, b.d.drawer_transition_effect_sphere, z);
    }

    @Override // com.tsf.shell.f.f.a.b.m
    public void a(int i, int i2, int i3, int i4, float f, ArrayList<Number3d> arrayList) {
        double d = 3.141592653589793d / i3;
        float f2 = 180 / i3;
        double d2 = d / 2.0d;
        float f3 = f2 / 2.0f;
        float f4 = (180.0f - (2.0f * 30.0f)) / (i4 - 1);
        int i5 = 0;
        float f5 = 30.0f;
        while (true) {
            int i6 = i5;
            if (i6 < i4) {
                for (int i7 = 0; i7 < i3; i7++) {
                    m.b a = a((i6 * i3) + i7);
                    int i8 = (i3 - i7) - 1;
                    float sin = (float) (Math.sin(0.017453292519943295d * f5) * f);
                    a.a = (float) (Math.cos((i8 * d) + d2) * sin);
                    a.b = (float) (Math.cos(0.017453292519943295d * f5) * f);
                    a.c = (float) (sin * Math.sin((i8 * d) + d2));
                    a.d = 90.0f - ((i8 * f2) + f3);
                    a.e = f5 - 90.0f;
                }
                f5 += f4;
                i5 = i6 + 1;
            } else {
                return;
            }
        }
    }
}
