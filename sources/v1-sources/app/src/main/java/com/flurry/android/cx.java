package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class cx {
    public abstract ViewGroup.LayoutParams a(Context context, i iVar);

    private cx() {
    }

    /* synthetic */ cx(byte b) {
        this();
    }

    public static int b(Context context, i iVar) {
        if (iVar.b().intValue() != 0) {
            return bp.b(context, iVar.b().intValue());
        }
        return -1;
    }

    public final int c(Context context, i iVar) {
        return iVar.c().intValue() != 0 ? bp.b(context, iVar.c().intValue()) : a();
    }

    public int a() {
        return -2;
    }
}
