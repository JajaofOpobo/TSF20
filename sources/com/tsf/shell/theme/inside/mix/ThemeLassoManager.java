package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4181q;
/* loaded from: classes.dex */
public class ThemeLassoManager extends ThemeMixElementManager {
    public ThemeLassoManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(C0853a.m10856d(), getTheme().getContext(), i, i2, true);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return C4181q.m635d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        return createPreviewBitmap(ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.PICKER_MENU, z));
    }

    private static Bitmap createPreviewBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(250, 250, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 95, 15, 50, 50);
        canvas.drawBitmap(createBitmap2, (250 - createBitmap2.getWidth()) / 2, (250 - createBitmap2.getHeight()) / 2, paint);
        createBitmap2.recycle();
        Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, 11, 93, 138, 97);
        Matrix matrix = new Matrix();
        for (int i = 0; i < 5; i++) {
            matrix.reset();
            matrix.postTranslate(125, 125);
            matrix.preRotate(i * 72);
            matrix.preTranslate((-createBitmap3.getWidth()) / 2, (-250) / 2);
            canvas.drawBitmap(createBitmap3, matrix, paint);
        }
        createBitmap3.recycle();
        Bitmap createBitmap4 = Bitmap.createBitmap(bitmap, 160, 0, 40, 40);
        canvas.drawBitmap(createBitmap4, 104.0f, 27.0f, paint);
        createBitmap4.recycle();
        Bitmap createBitmap5 = Bitmap.createBitmap(bitmap, 160, 40, 40, 40);
        canvas.drawBitmap(createBitmap5, 178.0f, 86.0f, paint);
        createBitmap5.recycle();
        Bitmap createBitmap6 = Bitmap.createBitmap(bitmap, 160, 80, 40, 40);
        canvas.drawBitmap(createBitmap6, 151.0f, 168.0f, paint);
        createBitmap6.recycle();
        Bitmap createBitmap7 = Bitmap.createBitmap(bitmap, 160, 120, 40, 40);
        canvas.drawBitmap(createBitmap7, 60.0f, 168.0f, paint);
        createBitmap7.recycle();
        Bitmap createBitmap8 = Bitmap.createBitmap(bitmap, 160, 160, 40, 40);
        canvas.drawBitmap(createBitmap8, 33.0f, 82.0f, paint);
        createBitmap8.recycle();
        Bitmap createBitmap9 = Bitmap.createBitmap(bitmap, (int) VEasing.Back.easeIn, (int) VEasing.Back.easeIn, 40, 40);
        canvas.drawBitmap(createBitmap9, 105.0f, 105.0f, paint);
        createBitmap9.recycle();
        bitmap.recycle();
        return createBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }
}
