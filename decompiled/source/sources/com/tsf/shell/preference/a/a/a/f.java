package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.api.element.TextureElement;
/* loaded from: classes.dex */
public class f extends h {
    private com.censivn.C3DEngine.b.f.g a;

    public f(String str, int i, float f) {
        super(str, f);
        this.a = new com.censivn.C3DEngine.b.f.g() { // from class: com.tsf.shell.preference.a.a.a.f.1
            @Override // com.censivn.C3DEngine.b.f.g
            public void a(TextureElement textureElement) {
                f.this.a.a((int) com.censivn.C3DEngine.b.b.a.a(textureElement.width));
                f.this.a.b((int) com.censivn.C3DEngine.b.b.a.a(textureElement.height));
            }
        };
        this.a.a(i);
        e().addChild(this.a);
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        this.a.a();
    }
}
