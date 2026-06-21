package com.tsf.shell.e.i.c.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
public class p extends d {
    protected int d;
    protected VObject3d[] e;
    protected n f;
    final /* synthetic */ o g;

    public p(o oVar) {
        this.g = oVar;
    }

    public p(o oVar, n nVar, int i, VObject3d... vObject3dArr) {
        this.g = oVar;
        this.d = i;
        this.e = vObject3dArr;
        j.a("targetObject3d:" + this.e.length);
        this.f = nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.e.i.c.a.d
    public Bitmap a(Void... voidArr) {
        return r.a(this.g.i, this.d);
    }

    public void f() {
        a(a((Void[]) null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.e.i.c.a.d
    public void a(Bitmap bitmap) {
        TextureElement createTexture = this.g.j.createTexture(bitmap, true);
        for (VObject3d vObject3d : this.e) {
            vObject3d.textures().addElement(createTexture);
        }
        bitmap.recycle();
        this.f.a(this.d, createTexture);
        this.g.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.e.i.c.a.d
    public void b(Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
