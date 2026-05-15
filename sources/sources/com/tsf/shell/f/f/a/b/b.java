package com.tsf.shell.f.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import com.tsf.shell.f.f.a.b.m;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends m {
    public b(int i, boolean z) {
        super(i, b.d.drawer_transition_effect_cylinder, z);
    }

    @Override // com.tsf.shell.f.f.a.b.m
    public void a(int i, int i2, int i3, int i4, float f, ArrayList<Number3d> arrayList) {
        double d = 3.141592653589793d / ((double) i3);
        float f2 = 180 / i3;
        double d2 = d / 2.0d;
        float f3 = f2 / 2.0f;
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 < i4) {
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    if (i8 < i3) {
                        int i9 = (i6 * i3) + i8;
                        m.b bVarA = a(i9);
                        int i10 = (i3 - i8) - 1;
                        bVarA.a = (float) (Math.cos((((double) i10) * d) + d2) * ((double) f));
                        bVarA.b = arrayList.get(i9).y;
                        bVarA.c = (float) (Math.sin((((double) i10) * d) + d2) * ((double) f));
                        bVarA.d = 90.0f - ((i10 * f2) + f3);
                        i7 = i8 + 1;
                    }
                }
                i5 = i6 + 1;
            } else {
                return;
            }
        }
    }
}
