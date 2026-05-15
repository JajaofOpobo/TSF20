package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.censivn.C3DEngine.a;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.q;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeLassoManager extends ThemeMixElementManager {
    public ThemeLassoManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(a.d(), getTheme().getContext(), i, i2, true);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return q.d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        return createPreviewBitmap(ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.PICKER_MENU, z));
    }

    private static Bitmap createPreviewBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(250, 250, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 95, 15, 50, 50);
        canvas.drawBitmap(bitmapCreateBitmap2, (250 - bitmapCreateBitmap2.getWidth()) / 2, (250 - bitmapCreateBitmap2.getHeight()) / 2, paint);
        bitmapCreateBitmap2.recycle();
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap, 11, 93, 138, 97);
        Matrix matrix = new Matrix();
        for (int i = 0; i < 5; i++) {
            matrix.reset();
            matrix.postTranslate(125, 125);
            matrix.preRotate(i * 72);
            matrix.preTranslate((-bitmapCreateBitmap3.getWidth()) / 2, (-250) / 2);
            canvas.drawBitmap(bitmapCreateBitmap3, matrix, paint);
        }
        bitmapCreateBitmap3.recycle();
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmap, 160, 0, 40, 40);
        canvas.drawBitmap(bitmapCreateBitmap4, 104.0f, 27.0f, paint);
        bitmapCreateBitmap4.recycle();
        Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(bitmap, 160, 40, 40, 40);
        canvas.drawBitmap(bitmapCreateBitmap5, 178.0f, 86.0f, paint);
        bitmapCreateBitmap5.recycle();
        Bitmap bitmapCreateBitmap6 = Bitmap.createBitmap(bitmap, 160, 80, 40, 40);
        canvas.drawBitmap(bitmapCreateBitmap6, 151.0f, 168.0f, paint);
        bitmapCreateBitmap6.recycle();
        Bitmap bitmapCreateBitmap7 = Bitmap.createBitmap(bitmap, 160, 120, 40, 40);
        canvas.drawBitmap(bitmapCreateBitmap7, 60.0f, 168.0f, paint);
        bitmapCreateBitmap7.recycle();
        Bitmap bitmapCreateBitmap8 = Bitmap.createBitmap(bitmap, 160, 160, 40, 40);
        canvas.drawBitmap(bitmapCreateBitmap8, 33.0f, 82.0f, paint);
        bitmapCreateBitmap8.recycle();
        Bitmap bitmapCreateBitmap9 = Bitmap.createBitmap(bitmap, VEasing.Back.easeIn, VEasing.Back.easeIn, 40, 40);
        canvas.drawBitmap(bitmapCreateBitmap9, 105.0f, 105.0f, paint);
        bitmapCreateBitmap9.recycle();
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }
}
