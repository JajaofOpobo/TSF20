package com.tsf.shell.f.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import com.tsf.shell.f.f.a.b.m;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends m {
    public a(int i, boolean z) {
        super(i, b.d.drawer_transition_effect_bottle, z);
    }

    @Override // com.tsf.shell.f.f.a.b.m
    public void a(int i, int i2, int i3, int i4, float f, ArrayList<Number3d> arrayList) {
        double d = 3.141592653589793d / ((double) i3);
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
                    if (i8 < i3) {
                        int i9 = (i6 * i3) + i8;
                        m.b bVarA = a(i9);
                        int i10 = (i3 - i8) - 1;
                        float fSin = (float) (Math.sin(0.017453292519943295d * ((double) f6)) * ((double) f));
                        bVarA.a = (float) (Math.cos((((double) i10) * d) + d2) * ((double) fSin));
                        bVarA.b = arrayList.get(i9).y;
                        bVarA.c = (float) (Math.sin((((double) i10) * d) + d2) * ((double) fSin));
                        bVarA.d = 90.0f - ((i10 * f2) + f3);
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
