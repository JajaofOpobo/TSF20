package com.tsf.shell.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.theme.inside.ThemeManager;
/* renamed from: com.tsf.shell.utils.e */
/* loaded from: classes.dex */
public class C4168e {
    /* renamed from: a */
    public static Bitmap m692a(boolean z) {
        return m691a(z, C3489a.f11516c, C3489a.f11517d, C3489a.f11518e, ThemeManager.mix.desktopEffect.getTheme().shell.desktopEffectSelectColor);
    }

    /* renamed from: a */
    public static Bitmap m691a(boolean z, int i, float f, float f2, int i2) {
        float f3 = f2 / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(C3567c.f11851j.color);
        canvas.drawCircle(i / 2, i / 2, f / 2.0f, paint);
        if (z) {
            paint.setColor(i2);
            canvas.drawCircle(i / 2, i / 2, f3, paint);
        }
        return createBitmap;
    }
}
