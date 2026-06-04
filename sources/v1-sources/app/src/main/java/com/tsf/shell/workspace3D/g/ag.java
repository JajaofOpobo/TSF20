package com.tsf.shell.workspace3D.g;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class ag {
    public static Bitmap a(ArrayList arrayList) {
        Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.PICKER_MENU_NOTIC);
        Bitmap createBitmap = Bitmap.createBitmap(160, 160, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setTypeface(com.tsf.shell.workspace3D.i.a.a);
        paint.setTextSize(22.0f);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-6710887);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(160, 32, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            Bitmap a = com.tsf.shell.setting.a.v.a((String) arrayList.get(i), 160, 32, paint, true, true, -3);
            canvas2.drawBitmap(a, 0.0f, 3.0f, (Paint) null);
            canvas.drawBitmap(createBitmap2, 0.0f, i * 32, (Paint) null);
            a.recycle();
            createBitmap2.recycle();
        }
        bitmap.recycle();
        return createBitmap;
    }
}
