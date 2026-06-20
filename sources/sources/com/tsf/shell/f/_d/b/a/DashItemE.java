package com.tsf.shell.f._d.b.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.shell.utils.BitmapTransformationHelper;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashItemE extends DashItemD {
    private static TextureElement c = new TextureElement(0, false);
    private static float d = 0.10471976f;
    private GridRenderable e;

    public DashItemE(int i, int i2, boolean z) {
        super(i, z);
        int iA = (int) com.censivn.C3DEngine.b.b.ScreenConstants.a(30.0f);
        this.e = new GridRenderable(iA + 2, iA + 2, false);
        this.e.setDefaultColor(new Color4(i2));
        this.e.textures().addElement(DashItemC);
        this.e.position().x = com.censivn.C3DEngine.b.b.ScreenConstants.a(74.0f);
        this.e.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.a(103.0f);
    }

    @Override // com.tsf.shell.f._d.b.a.DashItemD
    public void a() {
    }

    @Override // com.tsf.shell.f._d.b.a.DashItemD
    public void a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
        if (DashItemC.id == 0) {
            Bitmap bitmapB = q.b(15.0f, -1);
            com.censivn.C3DEngine.C3DEngine.g().a(c, bitmapB);
            bitmapB.recycle();
        }
    }

    @Override // com.tsf.shell.f._d.b.a.DashItemD
    public void b(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
        float fAz = bVar.az();
        float fSin = (float) (1.0d + (Math.sin(fAz) * 0.30000001192092896d));
        this.e.scale().setAll(fSin, fSin, 1.0f);
        bVar.f(fAz + d);
        this.e.dispatchDraw();
        this.e.invalidate();
    }
}
