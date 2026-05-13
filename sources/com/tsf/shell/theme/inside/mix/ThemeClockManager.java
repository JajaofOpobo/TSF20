package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeClockDescription;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.utils.C4181q;
/* loaded from: classes.dex */
public class ThemeClockManager extends ThemeMixElementManager {
    public static String ALARM_THEME_ON_CHANGE_ACTION = "com.tsf.shell.widget.alarm.OnThemeChange";
    public static String ALARM_ON_CLICK = "com.tsf.shell.widget.alarm.onClick";

    public ThemeClockManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(C0853a.m10856d(), getTheme().getContext(), i, i2, true);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
        C0853a.m10856d().sendBroadcast(new Intent(ALARM_THEME_ON_CHANGE_ACTION));
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return C4181q.m635d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        return ThemeDescription.getPreviewBitmap(context2, ThemeClockDescription.CLOCK_THEME_ICON, z);
    }
}
