package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.a;
import com.tsf.shell.f.i.b.e.c;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.q;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeActionManager extends ThemeMixElementManager {
    public ThemeActionManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
        c.aV();
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(a.d(), getTheme().getContext(), i, i2, true);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return q.d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        return createPreviewBitmap(ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.ACTION_APP_DRAWER_ICON, z), ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.ACTION_APP_DRAWER_POINT, z));
    }

    private static Bitmap createPreviewBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(166, 166, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Bitmap bitmapD = q.d(bitmap, 144, 144);
        canvas.drawBitmap(bitmapD, (bitmapCreateBitmap.getWidth() - bitmapD.getWidth()) / 2, (bitmapCreateBitmap.getHeight() - bitmapD.getHeight()) / 2, (Paint) null);
        bitmapD.recycle();
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (bitmapCreateBitmap.getWidth() - bitmap2.getWidth()) / 2, 0.0f, (Paint) null);
            bitmap2.recycle();
        }
        return bitmapCreateBitmap;
    }
}
