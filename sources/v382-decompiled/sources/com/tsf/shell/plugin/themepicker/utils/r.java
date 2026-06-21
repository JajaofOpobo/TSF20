package com.tsf.shell.plugin.themepicker.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class r extends BitmapDrawable {
    private final WeakReference a;

    public r(Resources resources, Bitmap bitmap, s sVar) {
        super(resources, bitmap);
        this.a = new WeakReference(sVar);
    }

    public s a() {
        return (s) this.a.get();
    }
}
