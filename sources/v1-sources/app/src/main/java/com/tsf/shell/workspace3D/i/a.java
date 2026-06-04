package com.tsf.shell.workspace3D.i;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public final class a {
    public static Typeface a;
    public static TextureElement b;

    public a() {
        ThemeShellDescription themeShellDescription = ThemeManager.getInstance().getCurrentThemeDescription().shell;
        a = Typeface.create(Typeface.createFromAsset(com.censivn.C3DEngine.a.c().getAssets(), "font/ARIALBD.TTF"), 1);
        Bitmap bitmap = themeShellDescription.getBitmap(ThemeShellDescription.PUBLIC_BUTTON_CLOSE);
        b = com.censivn.C3DEngine.a.f().a(bitmap, true);
        bitmap.recycle();
    }
}
