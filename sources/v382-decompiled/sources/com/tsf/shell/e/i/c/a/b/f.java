package com.tsf.shell.e.i.c.a.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
abstract class f {
    public TextureElement a;

    public abstract Bitmap a();

    public abstract void a(Bitmap bitmap);

    f() {
    }

    public void b() {
        c.d.deleteTexture(this.a);
    }
}
