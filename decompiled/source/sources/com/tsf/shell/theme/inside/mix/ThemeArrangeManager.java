package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
public class ThemeArrangeManager extends ThemeMixElementManager {
    public ThemeArrangeManager(ThemeManager themeManager, int i, String str) {
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
        Bitmap previewBitmap = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.INTERACTIVE_ARRANGE_BG, z);
        Bitmap previewBitmap2 = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.INTERACTIVE_ARRANGE_SCALE_BUTTON, z);
        if (previewBitmap == null || previewBitmap2 == null) {
            if (previewBitmap != null) {
                previewBitmap.recycle();
            }
            if (previewBitmap2 != null) {
                previewBitmap2.recycle();
            }
            return null;
        }
        return createPreviewBitmap(context, b.d.default_icon_phone, b.d.default_icon_sms, b.d.demo_icon_3, previewBitmap, previewBitmap2);
    }

    public static Bitmap createPreviewBitmap(Context context, int i, int i2, int i3, Bitmap bitmap, Bitmap bitmap2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        Bitmap scaleBitmap = scaleBitmap(x.a(context, i), 50, 50);
        canvas.drawBitmap(scaleBitmap, 13.0f, 13.0f, paint);
        scaleBitmap.recycle();
        Bitmap scaleBitmap2 = scaleBitmap(x.a(context, i2), 50, 50);
        canvas.drawBitmap(scaleBitmap2, 64.0f, 13.0f, paint);
        scaleBitmap2.recycle();
        Bitmap scaleBitmap3 = scaleBitmap(x.a(context, i3), 50, 50);
        canvas.drawBitmap(scaleBitmap3, 13.0f, 64.0f, paint);
        scaleBitmap3.recycle();
        Bitmap scaleBitmap4 = scaleBitmap(bitmap2, 50, 50);
        canvas.drawBitmap(scaleBitmap4, createBitmap.getWidth() - 50, createBitmap.getHeight() - 50, paint);
        scaleBitmap4.recycle();
        return createBitmap;
    }

    public static Bitmap scaleBitmap(Bitmap bitmap, int i, int i2) {
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getWidth());
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.scale(min, min);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        return createBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }
}
