package com.tsf.shell.e.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class a extends o {
    public TextureElement a;
    public TextureElement b;
    private b c;
    private VRectangle d;

    public a(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        q_();
    }

    public void q_() {
        this.c = new b(this, 256.0f, 256.0f, 0.0f);
        this.c.position().spY(112.0f);
        this.c.moveAllPointsSP(0.0f, -112.0f, 0.0f);
        addChild(this.c);
        this.d = new VRectangle(48.0f, 48.0f, 1, 1);
        this.d.position().spY(112.0f);
        addChild(this.d);
        invalidate();
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void b() {
        this.c.a();
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void c() {
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(R.drawable.widget_preview_adornment_texture_default, this.c);
            a(R.drawable.widget_preview_adornment_texture_thumbtack_hd, this.d);
            c(z);
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.n
    public void a(int i, TextureElement textureElement) {
        if (i == R.drawable.widget_preview_adornment_texture_default) {
            this.a = textureElement;
        } else if (i == R.drawable.widget_preview_adornment_texture_thumbtack_hd) {
            this.b = textureElement;
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.q
    public void d() {
        if (this.l) {
            this.l = false;
            this.j.deleteTexture(this.a);
            this.c.textures().removeAll();
            this.j.deleteTexture(this.b);
            this.d.textures().removeAll();
        }
    }
}
