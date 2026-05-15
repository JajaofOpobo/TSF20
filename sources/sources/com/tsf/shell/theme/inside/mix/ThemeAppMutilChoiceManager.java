package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.q;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeAppMutilChoiceManager extends ThemeMixElementManager {
    public ThemeAppMutilChoiceManager(ThemeManager themeManager, int i, String str) {
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
        return createPreviewBitmap(ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.APP_MULTI_CHOICE, z), ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.APP_MULTI_NOT_CHOICE, z));
    }

    private static Bitmap createPreviewBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ItemInfo.APP_INTENT, ItemInfo.APP_INTENT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (bitmap != null) {
            Bitmap bitmapD = q.d(bitmap, 64, 64);
            canvas.drawBitmap(bitmapD, 0.0f, 32.0f, (Paint) null);
            bitmapD.recycle();
        }
        if (bitmap2 != null) {
            Bitmap bitmapD2 = q.d(bitmap2, 64, 64);
            canvas.drawBitmap(bitmapD2, bitmapD2.getWidth(), 32.0f, (Paint) null);
            bitmapD2.recycle();
            return bitmapCreateBitmap;
        }
        return bitmapCreateBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }
}
