package com.tsf.shell.f.h.a.a.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends k {
    private TextureElement a;

    public f(float f, float f2) {
        super(f, f2, false);
        this.a = new TextureElement(0, false);
        textures().addElement(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        Bitmap bitmapA;
        if (this.a.id == 0 && (bitmapA = a()) != null) {
            com.censivn.C3DEngine.a.g().a(this.a, bitmapA);
            bitmapA.recycle();
        }
    }

    public Bitmap a() {
        return null;
    }

    public void d() {
        com.censivn.C3DEngine.a.g().a(this.a);
    }
}
