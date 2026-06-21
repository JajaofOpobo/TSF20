package com.tsf.shell.manager.r.b.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
public class c extends com.tsf.shell.e.i.b.e.b {
    private static m a;
    private static TextureElement b;
    private boolean p;

    public c() {
        super(null, com.tsf.shell.manager.o.b.a);
        this.p = false;
        if (a == null) {
            a = new m(64.0f, 64.0f, 1, 1, true);
            a.position().x = 32.0f * com.censivn.C3DEngine.b.b.a.a;
            a.position().y = 40.0f * com.censivn.C3DEngine.b.b.a.a;
            b = new TextureElement(0, false);
            a.textures().addElementWithoutVerify(b);
        }
    }

    @Override // com.tsf.shell.e.i.b.e.b, com.tsf.shell.e.i.e, com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        if (this.p) {
            b.id = f.id;
            a.dispatchDraw();
        }
    }

    public void a(boolean z) {
        this.p = z;
    }

    @Override // com.tsf.shell.e.i.b.e.b
    public void k() {
    }
}
