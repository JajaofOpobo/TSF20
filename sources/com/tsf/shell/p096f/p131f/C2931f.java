package com.tsf.shell.p096f.p131f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p177i.C3498a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4180p;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.f.f */
/* loaded from: classes.dex */
public class C2931f {

    /* renamed from: a */
    private int f9506a;

    /* renamed from: b */
    private boolean f9507b;

    /* renamed from: c */
    private boolean f9508c;

    /* renamed from: d */
    private int f9509d;

    /* renamed from: e */
    private TextureElement f9510e;

    /* renamed from: f */
    private boolean f9511f;

    /* renamed from: g */
    private boolean f9512g = false;

    public C2931f(int i, int i2, boolean z) {
        boolean z2 = false;
        this.f9506a = 0;
        this.f9509d = 0;
        this.f9506a = i;
        this.f9509d = i2;
        if (z && Home.m6188a()) {
            z2 = true;
        }
        this.f9511f = z2;
    }

    /* renamed from: f */
    public boolean m4269f() {
        return this.f9511f;
    }

    /* renamed from: g */
    protected int m4268g() {
        return this.f9509d;
    }

    /* renamed from: h */
    public void m4267h() {
        if (this.f9510e != null) {
            C0853a.m10853g().m10543a(this.f9510e);
            this.f9510e = null;
        }
    }

    /* renamed from: a */
    public TextureElement m4272a(int i, int i2) {
        if (this.f9510e == null) {
            Bitmap m607a = C4189x.m607a(m4268g(), i, i2);
            ThemeShellDescription themeShellDescription = ThemeManager.mix.desktopEffect.getTheme().shell;
            if (m4269f()) {
                m607a = C4180p.m651a(m607a, -100.0f);
                Canvas canvas = new Canvas(m607a);
                Bitmap m2192a = C3498a.m2192a();
                canvas.drawBitmap(m2192a, (m607a.getWidth() - m2192a.getWidth()) / 2, (m607a.getHeight() - m2192a.getHeight()) / 2, (Paint) null);
                m2192a.recycle();
            } else if (themeShellDescription.desktopEffectHue != 0 || themeShellDescription.desktopEffectSaturation != 0) {
                m607a = C4180p.m650a(m607a, themeShellDescription.desktopEffectHue, themeShellDescription.desktopEffectSaturation);
            }
            this.f9510e = C0853a.m10853g().m10544a(m607a, false);
            m607a.recycle();
        }
        return this.f9510e;
    }

    /* renamed from: a */
    public void m4271a(boolean z) {
        this.f9507b = z;
    }

    /* renamed from: i */
    public boolean m4266i() {
        return this.f9507b;
    }

    /* renamed from: j */
    public boolean m4265j() {
        return this.f9508c;
    }

    /* renamed from: b */
    public void m4270b(boolean z) {
        this.f9508c = z;
    }

    /* renamed from: k */
    public int mo4264k() {
        return this.f9506a;
    }

    /* renamed from: l */
    public void m4263l() {
        this.f9512g = false;
    }

    /* renamed from: m */
    public void m4262m() {
        this.f9512g = true;
    }

    /* renamed from: n */
    public boolean m4261n() {
        return this.f9512g;
    }
}
