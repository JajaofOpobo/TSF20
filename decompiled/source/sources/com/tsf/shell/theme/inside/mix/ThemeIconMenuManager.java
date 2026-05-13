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
public class ThemeIconMenuManager extends ThemeMixElementManager {
    public ThemeIconMenuManager(ThemeManager themeManager, int i, String str) {
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
        Bitmap previewBitmap = ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_ON, z);
        if (previewBitmap == null) {
            return null;
        }
        int width = previewBitmap.getWidth();
        int height = previewBitmap.getHeight();
        previewBitmap.recycle();
        Bitmap createBitmap = Bitmap.createBitmap(width * 2, height * 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        String[] strArr = {ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_ON, ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_OFF, ThemeShellDescription.ICON_MENU_EDIT_ON, ThemeShellDescription.ICON_MENU_EDIT_OFF};
        for (int i = 0; i < 4; i++) {
            int i2 = i % 2;
            int i3 = i / 2;
            Bitmap previewBitmap2 = ThemeDescription.getPreviewBitmap(context2, strArr[i], z);
            if (previewBitmap2 != null) {
                canvas.drawBitmap(previewBitmap2, i2 * width, i3 * height, (Paint) null);
                previewBitmap2.recycle();
            }
        }
        return createBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }
}
