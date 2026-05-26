package com.tsf.shell.f.i.c.a.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
abstract class e {
    public TextureElement a;

    public abstract Bitmap a();

    public abstract void a(Bitmap bitmap);

    e() {
    }

    public void b() {
        c.d.deleteTexture(this.a);
    }
}
