package com.tsf.shell.f.e.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.TextureElement;
/* loaded from: classes.dex */
public class b {
    private com.tsf.shell.f.a.a.a e;
    private TextureElement f;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    public TextureElement a = new TextureElement(0, false);

    public void a(TextureElement textureElement, int i) {
        int i2 = textureElement.width;
        int i3 = textureElement.height;
        if (this.c != i2 || this.d != i3 || i != this.b) {
            b(textureElement, i);
        }
        e.a(com.censivn.C3DEngine.a.d(), textureElement, this.a, this.f, this.e);
    }

    private void b(TextureElement textureElement, int i) {
        a();
        this.c = textureElement.width;
        this.d = textureElement.height;
        this.b = i;
        int i2 = this.c / this.b;
        int i3 = this.d / this.b;
        this.e = com.tsf.shell.manager.a.t.a(i2, i3);
        this.a = e.a(i2, i3, this.a);
        this.f = e.a(i2, i3);
    }

    public void a() {
        this.c = 0;
        this.d = 0;
        this.b = 0;
        if (this.e != null) {
            com.tsf.shell.manager.a.t.a(this.e);
        }
        if (this.a != null) {
            GLES20.glDeleteTextures(1, new int[]{this.a.id}, 0);
        }
        if (this.f != null) {
            GLES20.glDeleteTextures(1, new int[]{this.f.id}, 0);
        }
    }
}
