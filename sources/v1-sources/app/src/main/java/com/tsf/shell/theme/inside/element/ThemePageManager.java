package com.tsf.shell.theme.inside.element;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public class ThemePageManager {
    public ThemeShellDescription mCustomDescription;
    private ThemeManager manager;

    public ThemePageManager(ThemeManager themeManager) {
        this.manager = themeManager;
    }

    public void iniConfiguration() {
        initConfiguration();
    }

    private void initConfiguration() {
        this.mCustomDescription = getThemeByThemePackagename(this.manager.getConfig().h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ThemeShellDescription getThemeByThemePackagename(String str) {
        ThemeShellDescription themeShellDescription = null;
        if (str == null) {
            return null;
        }
        try {
            if (str.equals("") || str.equals(getTheme().packagename)) {
                return null;
            }
            Context c = com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.c();
            Context createPackageContext = c.createPackageContext(str, 3);
            ThemeDescription themeByPackagename = this.manager.getThemeByPackagename(str);
            if (themeByPackagename != null && themeByPackagename.shell != null) {
                themeShellDescription = themeByPackagename.shell;
            }
            if (themeShellDescription == null) {
                ThemeParser themeParser = new ThemeParser(createPackageContext);
                themeParser.parser(ThemeParser.TYPE_PREVIEW);
                ThemeDescription themeDescription = themeParser.getThemeDescription();
                if (themeDescription != null && themeDescription.shell != null) {
                    return themeDescription.shell;
                }
                return themeShellDescription;
            }
            return themeShellDescription;
        } catch (Exception e) {
            return null;
        }
    }

    public void setCustomTheme(String str) {
        q qVar = new q(this, str);
        com.censivn.C3DEngine.a.a();
        w.a(qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSetCustomTheme(ThemeShellDescription themeShellDescription) {
        this.mCustomDescription = themeShellDescription;
        resetTheme();
        if (themeShellDescription != null) {
            saveConfig(themeShellDescription.packagename);
        } else {
            saveConfig("");
        }
        ThemeManager.mix.updateSettingButtonInfo(5);
        bf.j().a();
        s sVar = new s(this);
        com.censivn.C3DEngine.a.a();
        w.a(sVar);
    }

    private void saveConfig(String str) {
        ThemeManager.mix.saveThemesMixConfiguration(5, str);
    }

    private void resetTheme() {
        this.manager.getConfig().h = "";
    }

    public ThemeShellDescription getTheme() {
        return this.mCustomDescription == null ? this.manager.getCurrentThemeDescription().shell : this.mCustomDescription;
    }

    public static Bitmap createPreviewBitmap(ThemeShellDescription themeShellDescription) {
        return createPreviewBitmap(themeShellDescription.getBitmap(ThemeShellDescription.PAGE_PREVIEW_UNSELECT), themeShellDescription.getBitmap(ThemeShellDescription.PAGE_PREVIEW_SELECT));
    }

    public static Bitmap createPreviewBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(82, 82, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.theme_mix_desktop_thumb);
        Bitmap createPreviewBitmap = createPreviewBitmap(bitmap);
        canvas.drawBitmap(createPreviewBitmap, 22.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(a, 35.0f, 13.0f, (Paint) null);
        createPreviewBitmap.recycle();
        Bitmap createPreviewBitmap2 = createPreviewBitmap(bitmap2);
        canvas.drawBitmap(createPreviewBitmap2, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(a, 13.0f, 13.0f, (Paint) null);
        createPreviewBitmap2.recycle();
        a.recycle();
        return createBitmap;
    }

    private static Bitmap createPreviewBitmap(Bitmap bitmap) {
        Bitmap bitmap2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 40, 40, true);
        bitmap.recycle();
        Bitmap a = com.tsf.shell.g.i.a(createScaledBitmap, 20, 60);
        int width = a.getWidth();
        int height = a.getHeight();
        if (20 > height || 82 <= height) {
            bitmap2 = null;
        } else {
            bitmap2 = Bitmap.createBitmap(width, 82, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap2);
            Bitmap createBitmap = Bitmap.createBitmap(a, 0, 0, width, 19);
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            createBitmap.recycle();
            Bitmap createBitmap2 = Bitmap.createBitmap(a, 0, 20, width, 1);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(createBitmap2, width, (82 - height) + 1, false);
            createBitmap2.recycle();
            canvas.drawBitmap(createScaledBitmap2, 0.0f, 19.0f, (Paint) null);
            createScaledBitmap2.recycle();
            Bitmap createBitmap3 = Bitmap.createBitmap(a, 0, 21, width, (height - 20) - 1);
            canvas.drawBitmap(createBitmap3, 0.0f, 102 - height, (Paint) null);
            createBitmap3.recycle();
            a.recycle();
        }
        createScaledBitmap.recycle();
        return bitmap2;
    }
}
