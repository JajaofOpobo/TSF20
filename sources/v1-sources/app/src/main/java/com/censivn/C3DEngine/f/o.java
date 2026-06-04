package com.censivn.C3DEngine.f;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class o {
    private static /* synthetic */ int[] a;

    private static /* synthetic */ int[] a() {
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

    public static f a(p pVar, Resources resources, String str) {
        switch (a()[pVar.ordinal()]) {
            case 1:
                return new k(resources, str);
            case 2:
                return new j(resources, str);
            case 3:
                return new h(resources, str);
            default:
                return null;
        }
    }
}
