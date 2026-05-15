package com.censivn.C3DEngine.e;

import android.content.res.Resources;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i {

    public enum a {
        OBJ,
        MAX_3DS,
        MD2
    }

    public static b a(a aVar, Resources resources, String str, boolean z) {
        switch (aVar) {
            case OBJ:
                return new f(resources, str, z);
            case MAX_3DS:
                return new e(resources, str, z);
            case MD2:
                return new d(resources, str, z);
            default:
                return null;
        }
    }
}
