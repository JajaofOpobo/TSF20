package com.tsf.shell.e;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c {
    public Drawable a;
    public String b;
    public int c;

    public c(Context context, int i, int i2, int i3) {
        this.c = i;
        this.b = context.getString(i3);
        this.a = context.getResources().getDrawable(i2);
    }
}
