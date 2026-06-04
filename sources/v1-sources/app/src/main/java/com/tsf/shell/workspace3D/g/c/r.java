package com.tsf.shell.workspace3D.g.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class r extends com.censivn.C3DEngine.e.b {
    private static int C = 0;
    private static TextureElement a;

    public r() {
        super(600.0f, 600.0f);
    }

    public final void k() {
        if (a == null) {
            Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.ICON_MENU_SHADOW_BG);
            a = com.censivn.C3DEngine.a.f().a(bitmap, false);
            bitmap.recycle();
        }
        C++;
        z().d();
        z().c(a);
    }

    public final void l() {
        C--;
        if (a != null && C == 0) {
            com.censivn.C3DEngine.a.f().a(a);
            a = null;
        }
        z().d();
    }
}
