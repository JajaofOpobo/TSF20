package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
class e {
    public int a;
    public String b;
    public TextureElement c = new TextureElement(0, false);
    public com.censivn.C3DEngine.b.f.m d;
    final /* synthetic */ d e;

    public e(d dVar, int i, String str) {
        this.e = dVar;
        this.a = i;
        this.b = str;
    }

    public void a() {
        if (this.c.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.c, this.a);
        }
    }

    public void b() {
        if (this.c.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.c);
        }
    }
}
