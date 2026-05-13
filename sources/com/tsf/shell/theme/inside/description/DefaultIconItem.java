package com.tsf.shell.theme.inside.description;

import android.graphics.Bitmap;
import com.tsf.shell.manager.p183o.C3560a;
import java.lang.ref.SoftReference;
/* loaded from: classes.dex */
public class DefaultIconItem {
    private SoftReference<Bitmap> bitmapReference;
    public ThemeIconDescription description;
    public String drawable;
    public float scale = 1.0f;
    private C3560a style;

    public DefaultIconItem(ThemeIconDescription themeIconDescription, String str) {
        this.description = themeIconDescription;
        this.drawable = str;
    }

    public Bitmap getBitmap(C3560a c3560a) {
        if (this.description == null) {
            return null;
        }
        if (this.style != c3560a) {
            recycle();
            this.style = c3560a;
        }
        if (this.bitmapReference == null || this.bitmapReference.get() == null || this.bitmapReference.get().isRecycled()) {
            this.bitmapReference = new SoftReference<>(this.description.getBitmap(this, c3560a));
        }
        return this.bitmapReference.get();
    }

    public void recycle() {
        if (this.bitmapReference != null && this.bitmapReference.get() != null) {
            this.bitmapReference.get().recycle();
        }
        this.style = null;
    }
}
