package com.tsf.shell.g;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i {
    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i > width || i < 0 || i2 <= width) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, i - 1, height);
        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
        createBitmap2.recycle();
        Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, i, 0, 1, height);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap3, (i2 - width) + 1, height, false);
        createBitmap3.recycle();
        canvas.drawBitmap(createScaledBitmap, i - 1, 0.0f, (Paint) null);
        createScaledBitmap.recycle();
        Bitmap createBitmap4 = Bitmap.createBitmap(bitmap, i + 1, 0, (width - i) - 1, height);
        canvas.drawBitmap(createBitmap4, (i + i2) - width, 0.0f, (Paint) null);
        createBitmap4.recycle();
        bitmap.recycle();
        return createBitmap;
    }
}
