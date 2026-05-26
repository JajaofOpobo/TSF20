package com.tsf.shell.f.e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class o {
    public static Bitmap a(ArrayList<String> arrayList) {
        ThemeShellDescription themeShellDescription = ThemeManager.mix.lasso.getTheme().shell;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(160, 160, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(160, 32, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            com.tsf.shell.manager.o.a.a aVar = new com.tsf.shell.manager.o.a.a();
            aVar.a(160);
            aVar.b(32);
            aVar.a(true);
            aVar.b(true);
            aVar.i(themeShellDescription.lassoLabelTextColor);
            aVar.a(22.0f);
            aVar.b(12.0f);
            aVar.g(themeShellDescription.lassoLabelBgColor);
            Bitmap bitmapB = aVar.b(arrayList.get(i));
            canvas2.drawBitmap(bitmapB, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, i * 32, (Paint) null);
            bitmapB.recycle();
            bitmapCreateBitmap2.recycle();
        }
        return bitmapCreateBitmap;
    }
}
