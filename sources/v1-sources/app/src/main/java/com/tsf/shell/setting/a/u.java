package com.tsf.shell.setting.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.tsf.shell.workspace3D.k.b.ap;

/* loaded from: classes.dex */
final class u {
    static Paint a;
    static Paint b;

    public static void a(int i, int i2, Canvas canvas) {
        if (a == null) {
            Paint paint = new Paint();
            a = paint;
            paint.setAntiAlias(true);
            a.setColor(-871559923);
            Paint paint2 = new Paint();
            b = paint2;
            paint2.setAntiAlias(true);
            b.setColor(-855638017);
        }
        canvas.drawCircle(i * ap.W, i2 * ap.W, 6.0f * ap.W, a);
        canvas.drawCircle(i * ap.W, i2 * ap.W, 2.0f * ap.W, b);
    }
}
