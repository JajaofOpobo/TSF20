package com.tsf.shell.f.d.b.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
/* loaded from: classes.dex */
public class c extends d {
    private k c;
    private TextureElement d;

    public c(int i, boolean z) {
        super(i, z);
        this.c = new k(com.tsf.shell.manager.o.b.a.H * 1.45f, com.tsf.shell.manager.o.b.a.H * 1.45f, false);
        this.c.setAnimationObjectState(true);
        this.c.uvs().set(0, 0.25f, 0.125f);
        this.c.uvs().set(1, 0.0f, 0.125f);
        this.c.uvs().set(2, 0.25f, 0.0f);
        this.c.uvs().set(3, 0.0f, 0.0f);
        this.c.position().y = (com.tsf.shell.manager.o.b.a.Y + com.tsf.shell.manager.o.b.a.I) - (com.tsf.shell.manager.o.b.a.I * 0.12f);
        this.c.useVBO(false);
        this.c.mouseEnabled(false);
        this.c.removeFromParent();
        this.d = new TextureElement(0, false);
        this.c.textures().addElement(this.d);
    }

    private void a(int i) {
        int i2 = i % 4;
        int i3 = i / 4;
        this.c.uvs().set(0, (i2 + 1) * 0.25f, (i3 + 1) * 0.125f);
        this.c.uvs().set(1, i2 * 0.25f, (i3 + 1) * 0.125f);
        this.c.uvs().set(2, (i2 + 1) * 0.25f, i3 * 0.125f);
        this.c.uvs().set(3, i2 * 0.25f, i3 * 0.125f);
        this.c.dispatchDraw();
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void a() {
        if (this.d.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void a(com.tsf.shell.f.i.b.e.b bVar) {
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void b(com.tsf.shell.f.i.b.e.b bVar) {
        if (this.d.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.d, b.d.widget_app_new_fire);
        }
        float az = bVar.az();
        int i = (int) az;
        if (i >= 29) {
            i = 0;
            az = 0.0f;
        }
        bVar.f((float) (az + 0.5d));
        a(i);
    }
}
