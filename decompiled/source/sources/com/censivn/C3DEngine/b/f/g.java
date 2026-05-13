package com.censivn.C3DEngine.b.f;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class g extends k {
    private int a;
    private TextureElement d;

    public g() {
        super(0.0f, 0.0f, false);
        this.d = new TextureElement(0, false);
        textures().addElement(this.d);
    }

    public void a(int i) {
        this.a = i;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.d.id == 0) {
            Bitmap a = x.a(this.a);
            com.censivn.C3DEngine.a.g().a(this.d, a);
            a.recycle();
            a(this.d);
        }
    }

    public void a(TextureElement textureElement) {
    }

    public void a() {
        if (this.d.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
    }
}
