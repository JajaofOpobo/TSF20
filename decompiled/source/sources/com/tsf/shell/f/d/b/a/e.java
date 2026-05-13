package com.tsf.shell.f.d.b.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.utils.q;
/* loaded from: classes.dex */
public class e extends d {
    private static TextureElement c = new TextureElement(0, false);
    private static float d = 0.10471976f;
    private k e;

    public e(int i, int i2, boolean z) {
        super(i, z);
        int a = (int) com.censivn.C3DEngine.b.b.a.a(30.0f);
        this.e = new k(a + 2, a + 2, false);
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
            Bitmap b = q.b(15.0f, -1);
            com.censivn.C3DEngine.a.g().a(c, b);
            b.recycle();
        }
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void b(com.tsf.shell.f.i.b.e.b bVar) {
        float az = bVar.az();
        float sin = (float) (1.0d + (Math.sin(az) * 0.30000001192092896d));
        this.e.scale().setAll(sin, sin, 1.0f);
        bVar.f(az + d);
        this.e.dispatchDraw();
        this.e.invalidate();
    }
}
