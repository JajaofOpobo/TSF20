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
/* loaded from: classes.dex */
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
        Bitmap createBitmap = Bitmap.createBitmap(166, 166, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap d = q.d(bitmap, 144, 144);
        canvas.drawBitmap(d, (createBitmap.getWidth() - d.getWidth()) / 2, (createBitmap.getHeight() - d.getHeight()) / 2, (Paint) null);
        d.recycle();
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (createBitmap.getWidth() - bitmap2.getWidth()) / 2, 0.0f, (Paint) null);
            bitmap2.recycle();
        }
        return createBitmap;
    }
}
