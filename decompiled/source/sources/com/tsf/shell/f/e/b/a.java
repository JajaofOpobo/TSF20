package com.tsf.shell.f.e.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.l;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a extends j {
    private TextureElement k;
    private float b = 120.0f;
    private float c = 0.0f;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private float g = 0.0f;
    private ArrayList<TextureElement> h = new ArrayList<>();
    private ArrayList<TextureElement> i = new ArrayList<>();
    private ArrayList<com.tsf.shell.f.a.a.a> j = new ArrayList<>();
    private c a = new c();

    public a() {
        addChild(this.a);
    }

    public void a(TextureElement textureElement, float f, Runnable runnable) {
        a(textureElement, 500, f, 4, 20.0f, runnable);
    }

    private void a(TextureElement textureElement, int i, float f, int i2, float f2, final Runnable runnable) {
        this.b = f;
        a(textureElement, i2, f2);
        this.a.a = textureElement.id;
        this.a.b = this.h.get(0).id;
        this.a.a(textureElement.width, textureElement.height);
        a(0.0f);
        final float f3 = this.c;
        final float f4 = 1.0f - this.c;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.b.a.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f5) {
                float f6 = f3 + (f4 * f5);
                if (f6 < 0.0f) {
                    l.a(this, "BlurContainer -> blur : precent:" + f6 + "    startProgress" + f3 + "    diffProgress:" + f4 + "     precent" + f5);
                }
                a.this.a(f6);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.c.a(this, i, dVar);
    }

    public void a(TextureElement textureElement) {
        a(textureElement, this.f, this.g);
        a(this.c);
        this.a.a(textureElement.width, textureElement.height);
    }

    public boolean a() {
        return this.c != 0.0f;
    }

    public void a(float f) {
        this.c = f;
        int size = this.h.size();
        if (f >= 1.0f) {
            this.a.a = this.h.get(this.h.size() - 2).id;
            this.a.b = this.h.get(this.h.size() - 1).id;
            this.a.c = 1.0f;
            this.a.d = (int) this.b;
            return;
        }
        float f2 = 1.0f / size;
        int i = (int) (f / f2);
        float f3 = (f % f2) / f2;
        this.a.a = i == 0 ? this.k.id : this.h.get(i - 1).id;
        this.a.b = this.h.get(i).id;
        this.a.c = f3;
        this.a.d = (int) (this.b * f);
    }

    public void a(int i, final Runnable runnable) {
        final float f = this.c;
        final float f2 = 0.0f - this.c;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.b.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f3) {
                a.this.a(f + (f2 * f3));
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.c.a(this, i, dVar);
    }

    public TextureElement b() {
        if (this.h.size() == 0) {
            return null;
        }
        return this.h.get(this.h.size() - 1);
    }

    private void a(TextureElement textureElement, int i, float f) {
        this.k = textureElement;
        if (this.d != textureElement.height || this.e != textureElement.width || i != this.f || this.g != f) {
            c();
            this.d = textureElement.height;
            this.e = textureElement.width;
            this.f = i;
            this.g = f;
            float f2 = com.censivn.C3DEngine.b.b.a.c * (f / i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = (int) ((textureElement.width / f2) / (i2 + 1));
                int i4 = (int) ((textureElement.height / f2) / (i2 + 1));
                this.j.add(com.tsf.shell.manager.a.t.a(i3, i4));
                this.h.add(e.a(i3, i4));
                this.i.add(e.a(i3, i4));
            }
        }
        System.currentTimeMillis();
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 == 0) {
                e.a(com.censivn.C3DEngine.a.d(), this.k, this.h.get(i5), this.i.get(i5), this.j.get(i5));
            } else {
                e.a(com.censivn.C3DEngine.a.d(), this.h.get(i5 - 1), this.h.get(i5), this.i.get(i5), this.j.get(i5));
            }
        }
        System.currentTimeMillis();
    }

    private void c() {
        while (this.h.size() > 0) {
            GLES20.glDeleteTextures(1, new int[]{this.h.remove(0).id}, 0);
        }
        while (this.i.size() > 0) {
            GLES20.glDeleteTextures(1, new int[]{this.i.remove(0).id}, 0);
        }
        while (this.j.size() > 0) {
            com.tsf.shell.manager.a.t.a(this.j.remove(0));
        }
    }
}
