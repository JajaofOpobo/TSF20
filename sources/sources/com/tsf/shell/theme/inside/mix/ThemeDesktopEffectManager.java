package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.a;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.theme.inside.parser.ThemeParser;
import com.tsf.shell.utils.e;
import com.tsf.shell.utils.p;
import com.tsf.shell.utils.q;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeDesktopEffectManager extends ThemeMixElementManager {
    public ThemeDesktopEffectManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(a.d(), getTheme(), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, ThemeDescription themeDescription, int i, int i2) {
        return q.d(createPreviewBitmap(context, themeDescription), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2) {
        ThemeParser themeParser = new ThemeParser();
        try {
            themeParser.parser(context2, ThemeElementType.TYPE_DESKTOP_EFFECT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ThemeDescription themeDescription = themeParser.getThemeDescription();
        if (themeDescription == null) {
            return null;
        }
        return createPreviewBitmap(context, themeDescription);
    }

    public static Bitmap createPreviewBitmap(Context context, ThemeDescription themeDescription) {
        return createPreviewBitmap(x.a(context, b.d.desktop_transition_fold_page), themeDescription);
    }

    private static Bitmap createPreviewBitmap(Bitmap bitmap, ThemeDescription themeDescription) {
        if (themeDescription.shell.desktopEffectHue != 0 || themeDescription.shell.desktopEffectSaturation != 0) {
            bitmap = p.a(bitmap, themeDescription.shell.desktopEffectHue, themeDescription.shell.desktopEffectSaturation);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(180, 180, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, (180 - bitmap.getWidth()) / 2.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        Bitmap bitmapA = e.a(true, com.tsf.shell.manager.g.a.c, com.tsf.shell.manager.g.a.d, com.tsf.shell.manager.g.a.e, themeDescription.shell.desktopEffectSelectColor);
        canvas.drawBitmap(bitmapA, (180 - bitmapA.getWidth()) / 2.0f, 147.0f, (Paint) null);
        bitmapA.recycle();
        return bitmapCreateBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }
}
