package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.theme.inside.parser.ThemeParser;
import com.tsf.shell.utils.C4168e;
import com.tsf.shell.utils.C4180p;
import com.tsf.shell.utils.C4181q;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ThemeDesktopEffectManager extends ThemeMixElementManager {
    public ThemeDesktopEffectManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(C0853a.m10856d(), getTheme(), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, ThemeDescription themeDescription, int i, int i2) {
        return C4181q.m635d(createPreviewBitmap(context, themeDescription), i, i2);
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
        return createPreviewBitmap(C4189x.m605a(context, C1306b.C1310d.desktop_transition_fold_page), themeDescription);
    }

    private static Bitmap createPreviewBitmap(Bitmap bitmap, ThemeDescription themeDescription) {
        if (themeDescription.shell.desktopEffectHue != 0 || themeDescription.shell.desktopEffectSaturation != 0) {
            bitmap = C4180p.m650a(bitmap, themeDescription.shell.desktopEffectHue, themeDescription.shell.desktopEffectSaturation);
        }
        Bitmap createBitmap = Bitmap.createBitmap(180, 180, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, (180 - bitmap.getWidth()) / 2.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        Bitmap m691a = C4168e.m691a(true, C3489a.f11516c, C3489a.f11517d, C3489a.f11518e, themeDescription.shell.desktopEffectSelectColor);
        canvas.drawBitmap(m691a, (180 - m691a.getWidth()) / 2.0f, 147.0f, (Paint) null);
        m691a.recycle();
        return createBitmap;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }
}
