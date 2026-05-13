package com.tsf.shell.f.e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
/* loaded from: classes.dex */
class o {
    public static Bitmap a(ArrayList<String> arrayList) {
        ThemeShellDescription themeShellDescription = ThemeManager.mix.lasso.getTheme().shell;
        Bitmap createBitmap = Bitmap.createBitmap(160, 160, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(160, 32, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            com.tsf.shell.manager.o.a.a aVar = new com.tsf.shell.manager.o.a.a();
            aVar.a(160);
            aVar.b(32);
            aVar.a(true);
            aVar.b(true);
            aVar.i(themeShellDescription.lassoLabelTextColor);
            aVar.a(22.0f);
            aVar.b(12.0f);
            aVar.g(themeShellDescription.lassoLabelBgColor);
            Bitmap b = aVar.b(arrayList.get(i));
            canvas2.drawBitmap(b, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(createBitmap2, 0.0f, i * 32, (Paint) null);
            b.recycle();
            createBitmap2.recycle();
        }
        return createBitmap;
    }
}
