package com.tsf.extend.a;

import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
/* loaded from: classes.dex */
public class b {
    private Picture a;
    private RectF b;
    private RectF c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Picture picture, RectF rectF) {
        this.a = picture;
        this.b = rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RectF rectF) {
        this.c = rectF;
    }

    public PictureDrawable a() {
        return new PictureDrawable(this.a);
    }
}
