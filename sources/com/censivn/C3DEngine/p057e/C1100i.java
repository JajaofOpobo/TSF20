package com.censivn.C3DEngine.p057e;

import android.content.res.Resources;
/* renamed from: com.censivn.C3DEngine.e.i */
/* loaded from: classes.dex */
public class C1100i {

    /* renamed from: com.censivn.C3DEngine.e.i$a */
    /* loaded from: classes.dex */
    public enum EnumC1102a {
        OBJ,
        MAX_3DS,
        MD2
    }

    /* renamed from: a */
    public static InterfaceC1090b m9864a(EnumC1102a enumC1102a, Resources resources, String str, boolean z) {
        switch (enumC1102a) {
            case OBJ:
                return new C1096f(resources, str, z);
            case MAX_3DS:
                return new C1095e(resources, str, z);
            case MD2:
                return new C1092d(resources, str, z);
            default:
                return null;
        }
    }
}
