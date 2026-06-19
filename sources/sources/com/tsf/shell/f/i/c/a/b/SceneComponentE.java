package com.tsf.shell.f.i.c.a.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
abstract class SceneComponentE {
    public TextureElement a;

    public abstract class Bitmap 

    public abstract void a(Bitmap bitmap);

    SceneComponentE() {
    }

    public void b() {
        FolderItemGroup.d.deleteTexture(this.a);
    }
}
