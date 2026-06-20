package com.tsf.shell.theme.inside.description;

import android.graphics.Bitmap;
import com.tsf.shell.manager.o.ButtonMetrics;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DefaultIconItem {
    private SoftReference<Bitmap> bitmapReference;
    public ThemeIconDescription description;
    public String drawable;
    public float scale = 1.0f;
    private ButtonMetrics style;

    public DefaultIconItem(ThemeIconDescription themeIconDescription, String str) {
        this.description = themeIconDescription;
        this.drawable = str;
    }

    public Bitmap getBitmap(ButtonMetrics buttonMetrics) {
        if (this.description == null) {
            return null;
        }
        if (this.style != buttonMetrics) {
            recycle();
            this.style = buttonMetrics;
        }
        if (this.bitmapReference == null || this.bitmapReference.get() == null || this.bitmapReference.get().isRecycled()) {
            this.bitmapReference = new SoftReference<>(this.description.getBitmap(this, buttonMetrics));
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
