package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.q;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeSmartButtonManager extends ThemeMixElementManager {
    public ThemeSmartButtonManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(a.d(), getTheme().getContext(), i, i2, true);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return q.d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) throws Throwable {
        String[] strArr = {ThemeShellDescription.SHORTCUT_ADD, ThemeShellDescription.SHORTCUT_MULTI_CHOICE, ThemeShellDescription.SHORTCUT_LASSO_MODE, ThemeShellDescription.SHORTCUT_DESKTOP_EDITOR};
        Bitmap previewBitmap = ThemeDescription.getPreviewBitmap(context2, strArr[0], z);
        if (previewBitmap != null) {
            int width = previewBitmap.getWidth();
            int height = previewBitmap.getHeight();
            previewBitmap.recycle();
            previewBitmap = Bitmap.createBitmap(width * 2, height * 2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(previewBitmap);
            for (int i = 0; i < 4; i++) {
                int i2 = i % 2;
                int i3 = i / 2;
                Bitmap previewBitmap2 = ThemeDescription.getPreviewBitmap(context2, strArr[i], z);
                if (previewBitmap2 != null) {
                    Bitmap bitmapD = q.d(previewBitmap2, width, height);
                    canvas.drawBitmap(bitmapD, i2 * width, i3 * height, (Paint) null);
                    bitmapD.recycle();
                }
            }
        }
        return previewBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
        com.tsf.shell.manager.a.o.h();
    }
}
