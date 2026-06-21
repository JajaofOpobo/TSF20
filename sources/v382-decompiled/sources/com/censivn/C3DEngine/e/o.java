package com.censivn.C3DEngine.e;

import android.content.res.Resources;

/* loaded from: classes.dex */
public class o {
    private static /* synthetic */ int[] a;

    static /* synthetic */ int[] a() {
        int[] iArr = a;
        if (iArr == null) {
            iArr = new int[p.valuesCustom().length];
            try {
                iArr[p.MAX_3DS.ordinal()] = 2;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[p.MD2.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[p.OBJ.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            a = iArr;
        }
        return iArr;
    }

    public static f a(p pVar, Resources resources, String str, boolean z) {
        switch (a()[pVar.ordinal()]) {
            case 1:
                return new k(resources, str, z);
            case 2:
                return new j(resources, str, z);
            case 3:
                return new h(resources, str, z);
            default:
                return null;
        }
    }
}
