package com.tsf.shell.e.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends n {
    public a(int i, boolean z) {
        super(i, R.drawable.drawer_transition_effect_bottle, z);
    }

    @Override // com.tsf.shell.e.f.a.b.n
    public void a(int i, int i2, int i3, int i4, float f, ArrayList arrayList) {
        double d = 3.141592653589793d / i3;
        float f2 = 180 / i3;
        double d2 = d / 2.0d;
        float f3 = f2 / 2.0f;
        float f4 = 30.0f;
        float f5 = (180.0f - (2.0f * 30.0f)) / (i4 - 1);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            float f6 = f4;
            if (i6 < i4) {
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    if (i8 >= i3) {
                        break;
                    }
                    int i9 = (i6 * i3) + i8;
                    p a = a(i9);
                    int i10 = (i3 - i8) - 1;
                    float sin = (float) (Math.sin(0.017453292519943295d * f6) * f);
                    a.a = (float) (Math.cos((i10 * d) + d2) * sin);
                    a.b = ((Number3d) arrayList.get(i9)).y;
                    a.c = (float) (Math.sin((i10 * d) + d2) * sin);
                    a.d = 90.0f - ((i10 * f2) + f3);
                    i7 = i8 + 1;
                }
                f4 = f6 + f5;
                i5 = i6 + 1;
            } else {
                return;
            }
        }
    }
}
