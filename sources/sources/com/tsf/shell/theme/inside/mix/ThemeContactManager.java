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
public class ThemeContactManager extends ThemeMixElementManager {
    public ThemeContactManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    public Bitmap getDefaultBitmap(int i, int i2, boolean z) {
        Bitmap bitmap = getTheme().getBitmap(z ? ThemeShellDescription.CONTACT_PORTRAIT_DEFAULT_HD : ThemeShellDescription.CONTACT_PORTRAIT_DEFAULT, i, i2);
        if (z && bitmap == null) {
            return getDefaultBitmap(i, i2, false);
        }
        return bitmap;
    }

    public Bitmap getMaskBitmap(int i, int i2, boolean z) {
        Bitmap bitmapFromCache = getTheme().getBitmapFromCache(z ? ThemeShellDescription.CONTACT_PORTRAIT_MASK_HD : ThemeShellDescription.CONTACT_PORTRAIT_MASK, i, i2);
        if (z && bitmapFromCache == null) {
            return getMaskBitmap(i, i2, false);
        }
        return bitmapFromCache;
    }

    public Bitmap getUponBitmap(int i, int i2, boolean z) {
        Bitmap bitmapFromCache = getTheme().getBitmapFromCache(z ? ThemeShellDescription.CONTACT_PORTRAIT_UPON_HD : ThemeShellDescription.CONTACT_PORTRAIT_UPON, i, i2);
        if (z && bitmapFromCache == null) {
            return getUponBitmap(i, i2, false);
        }
        return bitmapFromCache;
    }

    public Bitmap getBackBitmap(int i, int i2, boolean z) {
        Bitmap bitmapFromCache = getTheme().getBitmapFromCache(z ? ThemeShellDescription.CONTACT_PORTRAIT_BACK_HD : ThemeShellDescription.CONTACT_PORTRAIT_BACK, i, i2);
        if (z && bitmapFromCache == null) {
            return getBackBitmap(i, i2, false);
        }
        return bitmapFromCache;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(a.d(), getTheme().getContext(), i, i2, true);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return q.d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) throws Throwable {
        Bitmap previewBitmap = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.CONTACT_PORTRAIT_DEFAULT, z);
        Bitmap previewBitmap2 = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.CONTACT_PORTRAIT_UPON, z);
        if (previewBitmap2 == null || previewBitmap == null) {
            return previewBitmap;
        }
        Bitmap bitmapCopy = previewBitmap.copy(Bitmap.Config.ARGB_8888, true);
        previewBitmap.recycle();
        new Canvas(bitmapCopy).drawBitmap(previewBitmap2, 0.0f, 0.0f, (Paint) null);
        previewBitmap2.recycle();
        return bitmapCopy;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
        com.tsf.shell.manager.a.z.a();
    }
}
