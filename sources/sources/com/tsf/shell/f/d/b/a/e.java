package com.tsf.shell.f.d.b.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.utils.q;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends d {
    private static TextureElement c = new TextureElement(0, false);
    private static float d = 0.10471976f;
    private k e;

    public e(int i, int i2, boolean z) {
        super(i, z);
        int iA = (int) com.censivn.C3DEngine.b.b.a.a(30.0f);
        this.e = new k(iA + 2, iA + 2, false);
        this.e.setDefaultColor(new Color4(i2));
        this.e.textures().addElement(c);
        this.e.position().x = com.censivn.C3DEngine.b.b.a.a(74.0f);
        this.e.position().y = com.censivn.C3DEngine.b.b.a.a(103.0f);
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void a() {
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void a(com.tsf.shell.f.i.b.e.b bVar) {
        if (c.id == 0) {
            Bitmap bitmapB = q.b(15.0f, -1);
            com.censivn.C3DEngine.a.g().a(c, bitmapB);
            bitmapB.recycle();
        }
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void b(com.tsf.shell.f.i.b.e.b bVar) {
        float fAz = bVar.az();
        float fSin = (float) (1.0d + (Math.sin(fAz) * 0.30000001192092896d));
        this.e.scale().setAll(fSin, fSin, 1.0f);
        bVar.f(fAz + d);
        this.e.dispatchDraw();
        this.e.invalidate();
    }
}
