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
/* loaded from: classes.dex */
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

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        Bitmap previewBitmap = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.WIDGET_TSF_RESIZE_BOX, z);
        Bitmap previewBitmap2 = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON, z);
        Bitmap a = x.a(context, b.d.widget_resize_demo);
        if (previewBitmap == null || previewBitmap2 == null) {
            if (previewBitmap != null) {
                previewBitmap.recycle();
            }
            if (previewBitmap2 != null) {
                previewBitmap2.recycle();
            }
            return null;
        }
        return createPreviewBitmap(previewBitmap, previewBitmap2, a);
    }

    public static Bitmap createPreviewBitmap(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        int width = bitmap3.getWidth();
        int height = bitmap3.getHeight();
        int max = Math.max(width, width);
        Bitmap createBitmap = Bitmap.createBitmap(max + 32, max + 32, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Matrix matrix = new Matrix();
        matrix.setTranslate((createBitmap.getWidth() - width) / 2.0f, (createBitmap.getHeight() - height) / 2.0f);
        canvas.drawBitmap(bitmap3, matrix, paint);
        bitmap3.recycle();
        try {
            Bitmap a = q.a(bitmap, 15, 15, createBitmap.getWidth(), createBitmap.getHeight());
            matrix.reset();
            canvas.drawBitmap(a, matrix, paint);
            a.recycle();
            for (int i = 0; i < 4; i++) {
                matrix.reset();
                matrix.postTranslate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                matrix.preRotate(i * 90);
                matrix.preTranslate((createBitmap.getWidth() - bitmap2.getWidth()) / 2, 0.0f);
                matrix.preTranslate((-createBitmap.getWidth()) / 2, (-createBitmap.getHeight()) / 2);
                canvas.drawBitmap(bitmap2, matrix, paint);
            }
            bitmap2.recycle();
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            bitmap.recycle();
            createBitmap.recycle();
            bitmap2.recycle();
            return null;
        }
    }
}
