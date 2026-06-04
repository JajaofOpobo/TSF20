package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
final class cs extends cx {
    cs() {
        super((byte) 0);
    }

    @Override // com.flurry.android.cx
    public final ViewGroup.LayoutParams a(Context context, i iVar) {
        return new LinearLayout.LayoutParams(b(context, iVar), c(context, iVar));
    }
}
