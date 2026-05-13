package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4181q;
/* loaded from: classes.dex */
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
        return createPreviewBitmap(C0853a.m10856d(), getTheme().getContext(), i, i2, true);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return C4181q.m635d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        Bitmap previewBitmap = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.CONTACT_PORTRAIT_DEFAULT, z);
        Bitmap previewBitmap2 = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.CONTACT_PORTRAIT_UPON, z);
        if (previewBitmap2 == null || previewBitmap == null) {
            return previewBitmap;
        }
        Bitmap copy = previewBitmap.copy(Bitmap.Config.ARGB_8888, true);
        previewBitmap.recycle();
        new Canvas(copy).drawBitmap(previewBitmap2, 0.0f, 0.0f, (Paint) null);
        previewBitmap2.recycle();
        return copy;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
        C3359a.f11112z.m2303a();
    }
}
