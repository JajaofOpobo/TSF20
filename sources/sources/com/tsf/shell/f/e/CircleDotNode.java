package com.tsf.shell.f.e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.censivn.C3DEngine.api.element.TextureElement;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CircleDotNode extends com.censivn.C3DEngine.b.f.GridRenderable {
    private int a;
    private TextureElement d;

    public CircleDotNode() {
        super(1.0f, 1.0f);
        this.d = new TextureElement(0, false);
        this.a = (int) com.censivn.C3DEngine.b.b.A.a(22.0f);
        a(this.a);
        b(this.a);
        textures().addElement(this.d);
        useVBO(false);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        CircleDotNode();
    }

    private void d() {
        if (this.d.id == 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.a, this.a, Bitmap.Config.ARGB_8888);
            com.tsf.shell.utils.BitmapTransformationHelper.a(new Canvas(bitmapCreateBitmap), 10.0f, 1.0f, 1.0f, -49152);
            com.censivn.C3DEngine.C3DEngine.g().a(this.d, bitmapCreateBitmap);
            bitmapCreateBitmap.recycle();
        }
    }

    public void a() {
        if (this.d.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.d);
        }
    }
}
