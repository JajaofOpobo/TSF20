package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4181q;
/* loaded from: classes.dex */
public class ThemeAppMutilChoiceManager extends ThemeMixElementManager {
    public ThemeAppMutilChoiceManager(ThemeManager themeManager, int i, String str) {
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
        Bitmap createBitmap = Bitmap.createBitmap(ItemInfo.APP_INTENT, ItemInfo.APP_INTENT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (bitmap != null) {
            Bitmap m635d = C4181q.m635d(bitmap, 64, 64);
            canvas.drawBitmap(m635d, 0.0f, 32.0f, (Paint) null);
            m635d.recycle();
        }
        if (bitmap2 != null) {
            Bitmap m635d2 = C4181q.m635d(bitmap2, 64, 64);
            canvas.drawBitmap(m635d2, m635d2.getWidth(), 32.0f, (Paint) null);
            m635d2.recycle();
            return createBitmap;
        }
        return createBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }
}
