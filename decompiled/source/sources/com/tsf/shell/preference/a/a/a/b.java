package com.tsf.shell.preference.a.a.a;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.f.f.b.a;
/* loaded from: classes.dex */
public class b extends h {
    private a.C0108a a;
    private com.censivn.C3DEngine.b.f.j b;
    private TextureElement d;
    private TextureElement e;
    private TextureElement f;
    private com.censivn.C3DEngine.b.f.k g;

    public b(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(200.0f));
        this.d = new TextureElement(0, false);
        this.e = new TextureElement(0, false);
        this.f = new TextureElement(0, false);
        this.g = com.censivn.C3DEngine.b.b.a.a(180.0f, 180.0f);
        this.g.textures().addElement(this.f);
        this.b = new com.censivn.C3DEngine.b.f.j() { // from class: com.tsf.shell.preference.a.a.a.b.1
            private float b = 0.0f;
            private boolean c = true;

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawChildStart() {
                b.this.a.d(this.b);
                if (this.c) {
                    this.b = (float) (this.b + 0.01d);
                    if (this.b > 1.0f) {
                        this.b = 1.0f;
                        this.c = false;
                    }
                } else {
                    this.b = (float) (this.b - 0.01d);
                    if (this.b < 0.0f) {
                        this.b = 0.0f;
                        this.c = true;
                    }
                }
                b.this.a.a(b.this.d);
                b.this.a.a();
                GLES20.glFrontFace(2305);
                b.this.a.dispatchDraw();
                b.this.a.a(b.this.e);
                b.this.a.d();
                GLES20.glFrontFace(2304);
                b.this.a.dispatchDraw();
                GLES20.glFrontFace(2305);
            }
        };
        this.a = new a.C0108a(com.censivn.C3DEngine.b.b.a.a(189.0f), com.censivn.C3DEngine.b.b.a.a(288.0f), 5, 20);
        this.a.position().x = com.censivn.C3DEngine.b.b.a.a(150.0f);
        this.b.setAnimationObjectState(true);
        this.b.addChild(this.g);
        this.g.position().x = com.censivn.C3DEngine.b.b.a.a(-150.0f);
        this.g.useVBO(false);
        e().addChild(this.b);
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        if (this.d.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.d, b.d.feature_desktop_effect_screen1);
        }
        if (this.e.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.e, b.d.feature_desktop_effect_screen2);
        }
        if (this.f.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.f, b.d.desktop_transition_cloth);
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        com.censivn.C3DEngine.a.g().a(this.d);
        com.censivn.C3DEngine.a.g().a(this.e);
        com.censivn.C3DEngine.a.g().a(this.f);
    }
}
