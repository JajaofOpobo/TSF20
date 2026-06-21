package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
public class h extends j {
    private com.censivn.C3DEngine.b.f.h a;

    public h(String str, int i, float f) {
        super(str, f);
        this.a = new com.censivn.C3DEngine.b.f.h() { // from class: com.tsf.shell.preference.a.a.a.h.1
            @Override // com.censivn.C3DEngine.b.f.h
            public void a(TextureElement textureElement) {
                int a = (int) com.censivn.C3DEngine.b.b.a.a(textureElement.height);
                h.this.a.a((int) com.censivn.C3DEngine.b.b.a.a(textureElement.width));
                h.this.a.b(a);
            }
        };
        this.a.a(i);
        e().addChild(this.a);
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void g() {
        super.g();
        this.a.a();
    }
}
