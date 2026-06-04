package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;

/* loaded from: classes.dex */
final class bx extends cx {
    bx() {
        super((byte) 0);
    }

    @Override // com.flurry.android.cx
    public final ViewGroup.LayoutParams a(Context context, i iVar) {
        return new AbsoluteLayout.LayoutParams(b(context, iVar), c(context, iVar), 0, 0);
    }
}
