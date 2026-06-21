package com.tsf.shell.e.i.b.c;

import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;

/* loaded from: classes.dex */
class e {
    public TextureElement a;
    public ArrayList b = new ArrayList();
    public String c;
    final /* synthetic */ d d;

    public e(d dVar, TextureElement textureElement, String str) {
        this.d = dVar;
        this.a = textureElement;
        this.c = str;
    }

    public void a() {
        com.censivn.C3DEngine.a.g().a(this.a);
        this.a = null;
        this.b = null;
    }

    public void a(a aVar) {
        this.b.remove(aVar);
    }

    public void b(a aVar) {
        this.b.add(aVar);
    }

    public boolean b() {
        return this.b.isEmpty();
    }
}
