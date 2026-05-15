package com.tsf.extend.a;

import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    private Picture a;
    private RectF b;
    private RectF c = null;

    b(Picture picture, RectF rectF) {
        this.a = picture;
        this.b = rectF;
    }

    void a(RectF rectF) {
        this.c = rectF;
    }

    public PictureDrawable a() {
        return new PictureDrawable(this.a);
    }
}
