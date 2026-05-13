package com.tsf.shell.f.h.a.a.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
/* loaded from: classes.dex */
public class f extends k {
    private TextureElement a;

    public f(float f, float f2) {
        super(f, f2, false);
        this.a = new TextureElement(0, false);
        textures().addElement(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        Bitmap a;
        if (this.a.id == 0 && (a = a()) != null) {
            com.censivn.C3DEngine.a.g().a(this.a, a);
            a.recycle();
        }
    }

    public Bitmap a() {
        return null;
    }

    public void d() {
        com.censivn.C3DEngine.a.g().a(this.a);
    }
}
