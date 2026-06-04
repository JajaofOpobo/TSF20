package com.tsf.shell.workspace3D.g.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
final class e {
    public int a;
    public int b;
    public int c;
    final /* synthetic */ a d;
    private TextureElement e;
    private TextureElement f;

    public e(a aVar, int i, int i2, int i3) {
        this.d = aVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final TextureElement a() {
        if (this.f == null) {
            Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(this.b);
            this.f = com.censivn.C3DEngine.a.f().a(bitmap, false);
            bitmap.recycle();
        }
        b();
        return this.f;
    }

    public final TextureElement b() {
        if (this.e == null) {
            Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(this.a);
            this.e = com.censivn.C3DEngine.a.f().a(bitmap, false);
            bitmap.recycle();
        }
        return this.e;
    }
}
