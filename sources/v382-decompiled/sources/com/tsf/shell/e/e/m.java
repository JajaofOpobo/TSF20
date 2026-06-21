package com.tsf.shell.e.e;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;

/* loaded from: classes.dex */
class m extends com.censivn.C3DEngine.b.f.l {
    final /* synthetic */ l a;
    private float b;
    private com.censivn.C3DEngine.b.f.m c;
    private float d;
    private boolean e = false;

    public m(l lVar, float f, float f2, boolean z, TextureElement textureElement, float f3) {
        this.a = lVar;
        this.d = f3;
        this.c = new com.censivn.C3DEngine.b.f.m(f, f2, z);
        this.c.alpha(0.0f);
        PositionNumber3d position = this.c.position();
        float f4 = -f3;
        this.b = f4;
        position.y = f4;
        this.c.textures().addElement(textureElement);
        addChild(this.c);
    }

    public void a() {
        if (!this.e) {
            this.e = true;
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.a(VEasing.Back.easeIn);
            xVar.h(0.0f);
            com.censivn.C3DEngine.b.g.w.a(this.c);
            com.censivn.C3DEngine.b.g.w.a(this.c, 250, xVar);
            removeFromParent();
            this.a.addChild(this);
        }
    }

    public void b() {
        if (this.e) {
            this.e = false;
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.m.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    m.this.c.position().y = m.this.b;
                    m.this.removeFromParent();
                }
            };
            xVar.a(0);
            xVar.h(100.0f * com.censivn.C3DEngine.b.b.a.c);
            com.censivn.C3DEngine.b.g.w.a(this.c);
            com.censivn.C3DEngine.b.g.w.a(this.c, 250, xVar);
        }
    }
}
