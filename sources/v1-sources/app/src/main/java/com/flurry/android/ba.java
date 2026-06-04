package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
final class ba extends cx {
    ba() {
        super((byte) 0);
    }

    @Override // com.flurry.android.cx
    public final ViewGroup.LayoutParams a(Context context, i iVar) {
        return new FrameLayout.LayoutParams(b(context, iVar), c(context, iVar), 0);
    }
}
