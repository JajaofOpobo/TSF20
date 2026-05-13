package com.tsf.shell.f.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import com.tsf.shell.f.f.a.b.m;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class e extends m {
    public e(int i, boolean z) {
        super(i, b.d.drawer_transition_effect_random, z);
    }

    @Override // com.tsf.shell.f.f.a.b.m
    public void a(int i, int i2, int i3, int i4, float f, ArrayList<Number3d> arrayList) {
        double d = 3.141592653589793d / i3;
        float f2 = 180 / i3;
        double d2 = d / 2.0d;
        float f3 = f2 / 2.0f;
        float f4 = 30.0f;
        float f5 = (180.0f - (2.0f * 30.0f)) / (i4 - 1);
        int i5 = 0;
        while (i5 < i4) {
            float f6 = f4;
            int i6 = 0;
            while (i6 < i3) {
                int i7 = (i5 * i3) + i6;
                m.b a = a(i7);
                int i8 = (i3 - i6) - 1;
                float sin = (float) (Math.sin(0.017453292519943295d * f6) * f);
                a.a = (float) (Math.cos((i8 * d) + d2) * sin);
                a.b = arrayList.get(i7).y * 0.9f;
                a.c = (float) (sin * Math.sin((i8 * d) + d2));
                a.d = 90.0f - ((i8 * f2) + f3);
                i6++;
                f6 += f5;
            }
            i5++;
            f4 = f6;
        }
    }
}
