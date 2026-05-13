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
/* loaded from: classes.dex */
public class ThemeShellOtherManager extends ThemeMixElementManager {
    public ThemeShellOtherManager(ThemeManager themeManager, int i, String str) {
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
        String[] strArr = {ThemeShellDescription.PUBLIC_BUTTON_CLOSE, ThemeShellDescription.PUBLIC_BUTTON_CONFIRM, ThemeShellDescription.PUBLIC_BUTTON_DELETE};
        Bitmap previewBitmap = ThemeDescription.getPreviewBitmap(context2, strArr[0], z);
        if (previewBitmap == null) {
            return null;
        }
        int width = previewBitmap.getWidth();
        int height = previewBitmap.getHeight();
        previewBitmap.recycle();
        Bitmap createBitmap = Bitmap.createBitmap(width * 2, height * 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        for (int i = 0; i < 3; i++) {
            Bitmap d = q.d(ThemeDescription.getPreviewBitmap(context2, strArr[i], z), width, height);
            canvas.drawBitmap(d, (i % 2) * width, (i / 2) * height, (Paint) null);
            d.recycle();
        }
        return createBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }
}
