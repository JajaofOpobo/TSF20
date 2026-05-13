package com.tsf.shell.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.tsf.shell.theme.inside.ThemeManager;
/* loaded from: classes.dex */
public class e {
    public static Bitmap a(boolean z) {
        return a(z, com.tsf.shell.manager.g.a.c, com.tsf.shell.manager.g.a.d, com.tsf.shell.manager.g.a.e, ThemeManager.mix.desktopEffect.getTheme().shell.desktopEffectSelectColor);
    }

    public static Bitmap a(boolean z, int i, float f, float f2, int i2) {
        float f3 = f2 / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(com.tsf.shell.manager.o.c.j.color);
        canvas.drawCircle(i / 2, i / 2, f / 2.0f, paint);
        if (z) {
            paint.setColor(i2);
            canvas.drawCircle(i / 2, i / 2, f3, paint);
        }
        return createBitmap;
    }
}
