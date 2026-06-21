package com.tsf.shell.e.d.b.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.utils.r;

/* loaded from: classes.dex */
public class f extends e {
    private static TextureElement c = new TextureElement(0, false);
    private static float d = 0.10471976f;
    private m e;

    public f(int i, int i2, boolean z) {
        super(i, z);
        int a = (int) com.censivn.C3DEngine.b.b.a.a(30.0f);
        this.e = new m(a + 2, a + 2, false);
        this.e.setDefaultColor(new Color4(i2));
        this.e.textures().addElement(c);
        this.e.position().x = com.censivn.C3DEngine.b.b.a.a(74.0f);
        this.e.position().y = com.censivn.C3DEngine.b.b.a.a(103.0f);
    }

    @Override // com.tsf.shell.e.d.b.a.e
    public void a() {
    }

    @Override // com.tsf.shell.e.d.b.a.e
    public void a(com.tsf.shell.e.i.b.e.b bVar) {
        if (c.id == 0) {
            Bitmap b = r.b(15.0f, -1);
            com.censivn.C3DEngine.a.g().a(c, b);
            b.recycle();
        }
    }

    @Override // com.tsf.shell.e.d.b.a.e
    public void b(com.tsf.shell.e.i.b.e.b bVar) {
        float az = bVar.az();
        float sin = (float) (1.0d + (Math.sin(az) * 0.30000001192092896d));
        this.e.scale().setAll(sin, sin, 1.0f);
        bVar.f(az + d);
        this.e.dispatchDraw();
        this.e.invalidate();
    }
}
