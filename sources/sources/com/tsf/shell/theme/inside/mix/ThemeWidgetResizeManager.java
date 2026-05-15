package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.censivn.C3DEngine.a;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.q;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeWidgetResizeManager extends ThemeMixElementManager {
    public ThemeWidgetResizeManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(a.d(), getTheme().getContext(), i, i2, true);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return q.d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) throws Throwable {
        Bitmap previewBitmap = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.WIDGET_TSF_RESIZE_BOX, z);
        Bitmap previewBitmap2 = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON, z);
        Bitmap bitmapA = x.a(context, b.d.widget_resize_demo);
        if (previewBitmap == null || previewBitmap2 == null) {
            if (previewBitmap != null) {
                previewBitmap.recycle();
            }
            if (previewBitmap2 != null) {
                previewBitmap2.recycle();
            }
            return null;
        }
        return createPreviewBitmap(previewBitmap, previewBitmap2, bitmapA);
    }

    public static Bitmap createPreviewBitmap(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        int width = bitmap3.getWidth();
        int height = bitmap3.getHeight();
        int iMax = Math.max(width, width);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax + 32, iMax + 32, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Matrix matrix = new Matrix();
        matrix.setTranslate((bitmapCreateBitmap.getWidth() - width) / 2.0f, (bitmapCreateBitmap.getHeight() - height) / 2.0f);
        canvas.drawBitmap(bitmap3, matrix, paint);
        bitmap3.recycle();
        try {
            Bitmap bitmapA = q.a(bitmap, 15, 15, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            matrix.reset();
            canvas.drawBitmap(bitmapA, matrix, paint);
            bitmapA.recycle();
            for (int i = 0; i < 4; i++) {
                matrix.reset();
                matrix.postTranslate(bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2);
                matrix.preRotate(i * 90);
                matrix.preTranslate((bitmapCreateBitmap.getWidth() - bitmap2.getWidth()) / 2, 0.0f);
                matrix.preTranslate((-bitmapCreateBitmap.getWidth()) / 2, (-bitmapCreateBitmap.getHeight()) / 2);
                canvas.drawBitmap(bitmap2, matrix, paint);
            }
            bitmap2.recycle();
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            bitmap.recycle();
            bitmapCreateBitmap.recycle();
            bitmap2.recycle();
            return null;
        }
    }
}
