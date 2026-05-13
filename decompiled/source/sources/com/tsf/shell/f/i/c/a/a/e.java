package com.tsf.shell.f.i.c.a.a;

import android.graphics.Color;
import com.censivn.C3DEngine.api.element.TextureElement;
/* loaded from: classes.dex */
public class e {
    private int a = Color.argb(127, 5, 255, 255);
    private int b = Color.argb(127, 5, 255, 255);
    private TextureElement c;
    private TextureElement d;
    private boolean e;

    public e() {
        b();
    }

    public int a(int i) {
        switch (i) {
            case 1:
                return this.b;
            default:
                return this.a;
        }
    }

    public TextureElement b(int i) {
        switch (i) {
            case 1:
                return this.d;
            default:
                return this.c;
        }
    }

    public void a() {
        if (this.c != null) {
            a.a().deleteTexture(this.c);
            this.c = null;
        }
        if (this.d != null) {
            a.a().deleteTexture(this.d);
            this.d = null;
        }
        this.e = false;
    }

    public void b() {
        this.a = -1;
        this.b = -1;
        a();
    }

    public void a(TextureElement textureElement) {
        this.c = textureElement;
        this.d = textureElement;
        this.e = true;
    }

    public void c() {
        this.c = null;
        this.d = null;
    }
}
