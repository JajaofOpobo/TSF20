package com.tsf.shell.f.f.a.a.b;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
/* loaded from: classes.dex */
public class a extends b {
    private static final float d = com.censivn.C3DEngine.b.b.a.a(70.0f);
    private k b;
    private TextureElement c;
    private int e;

    public a(com.tsf.shell.f.f.a.a.a.c cVar, int i) {
        super(cVar);
        this.c = new TextureElement(0, false);
        this.e = i;
        this.b = new k(d, d, false) { // from class: com.tsf.shell.f.f.a.a.b.a.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (a.this.c.id == 0) {
                    com.censivn.C3DEngine.a.g().a(a.this.c, a.this.e);
                }
            }
        };
        this.b.textures().addElement(this.c);
        a(this.b);
    }

    public void a() {
        if (this.c.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.c);
        }
    }
}
