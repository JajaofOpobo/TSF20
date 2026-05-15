package com.tsf.shell.f.f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.Home;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.p;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f {
    private int a;
    private boolean b;
    private boolean c;
    private int d;
    private TextureElement e;
    private boolean f;
    private boolean g = false;

    public f(int i, int i2, boolean z) {
        boolean z2 = false;
        this.a = 0;
        this.d = 0;
        this.a = i;
        this.d = i2;
        if (z && Home.a()) {
            z2 = true;
        }
        this.f = z2;
    }

    public boolean f() {
        return this.f;
    }

    protected int g() {
        return this.d;
    }

    public void h() {
        if (this.e != null) {
            com.censivn.C3DEngine.a.g().a(this.e);
            this.e = null;
        }
    }

    public TextureElement a(int i, int i2) {
        if (this.e == null) {
            Bitmap bitmapA = x.a(g(), i, i2);
            ThemeShellDescription themeShellDescription = ThemeManager.mix.desktopEffect.getTheme().shell;
            if (f()) {
                bitmapA = p.a(bitmapA, -100.0f);
                Canvas canvas = new Canvas(bitmapA);
                Bitmap bitmapA2 = com.tsf.shell.manager.i.a.a();
                canvas.drawBitmap(bitmapA2, (bitmapA.getWidth() - bitmapA2.getWidth()) / 2, (bitmapA.getHeight() - bitmapA2.getHeight()) / 2, (Paint) null);
                bitmapA2.recycle();
            } else if (themeShellDescription.desktopEffectHue != 0 || themeShellDescription.desktopEffectSaturation != 0) {
                bitmapA = p.a(bitmapA, themeShellDescription.desktopEffectHue, themeShellDescription.desktopEffectSaturation);
            }
            this.e = com.censivn.C3DEngine.a.g().a(bitmapA, false);
            bitmapA.recycle();
        }
        return this.e;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean i() {
        return this.b;
    }

    public boolean j() {
        return this.c;
    }

    public void b(boolean z) {
        this.c = z;
    }

    public int k() {
        return this.a;
    }

    public void l() {
        this.g = false;
    }

    public void m() {
        this.g = true;
    }

    public boolean n() {
        return this.g;
    }
}
