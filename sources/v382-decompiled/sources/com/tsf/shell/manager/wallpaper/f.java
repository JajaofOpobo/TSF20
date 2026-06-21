package com.tsf.shell.manager.wallpaper;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
class f extends m {
    private TextureElement a;
    private int d;

    public f() {
        super(h.b, h.c, false);
        this.d = -1;
        calAABB(1.1f, 1.1f, 1.0f);
        this.a = new TextureElement(0, false);
        textures().addElement(this.a);
    }

    public void a(int i) {
        a();
        this.d = i;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.d != 0 && this.a.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.a, this.d);
        }
    }

    public void a() {
        if (this.a.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.a);
        }
    }
}
