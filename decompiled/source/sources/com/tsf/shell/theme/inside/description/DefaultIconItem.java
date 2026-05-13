package com.tsf.shell.theme.inside.description;

import android.graphics.Bitmap;
import com.tsf.shell.manager.o.a;
import java.lang.ref.SoftReference;
/* loaded from: classes.dex */
public class DefaultIconItem {
    private SoftReference<Bitmap> bitmapReference;
    public ThemeIconDescription description;
    public String drawable;
    public float scale = 1.0f;
    private a style;

    public DefaultIconItem(ThemeIconDescription themeIconDescription, String str) {
        this.description = themeIconDescription;
        this.drawable = str;
    }

    public Bitmap getBitmap(a aVar) {
        if (this.description == null) {
            return null;
        }
        if (this.style != aVar) {
            recycle();
            this.style = aVar;
        }
        if (this.bitmapReference == null || this.bitmapReference.get() == null || this.bitmapReference.get().isRecycled()) {
            this.bitmapReference = new SoftReference<>(this.description.getBitmap(this, aVar));
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
