package com.tsf.shell.f.i.c.a.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e {
    public TextureElement a;

    public abstract Bitmap a();

    public abstract void a(Bitmap bitmap);

    public void b() {
        c.d.deleteTexture(this.a);
    }
}
