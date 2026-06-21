package com.tsf.shell.e.e.f;

import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
public class b {
    private static Paint g;
    public String a;
    public String b;
    public int c;
    private TextureElement d;
    private TextureElement e;
    private String f;

    public b(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.f = str3;
        if (g == null) {
            g = new Paint();
            g.setColor(-855638017);
            g.setTextSize(36.0f * com.censivn.C3DEngine.b.b.a.c);
            g.setAntiAlias(true);
            g.setTextAlign(Paint.Align.LEFT);
        }
    }

    public TextureElement a() {
        if (this.e == null) {
            this.e = ThemeManager.mix.iconMenu.getTextureElement(this.b, com.tsf.shell.manager.g.a.h, com.tsf.shell.manager.g.a.h);
        }
        return this.e;
    }

    public TextureElement b() {
        if (this.d == null) {
            this.d = ThemeManager.mix.iconMenu.getTextureElement(this.a, com.tsf.shell.manager.g.a.h, com.tsf.shell.manager.g.a.h);
        }
        return this.d;
    }

    public void c() {
    }
}
