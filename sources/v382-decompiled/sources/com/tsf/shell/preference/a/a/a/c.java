package com.tsf.shell.preference.a.a.a;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class c extends j {
    private com.tsf.shell.e.f.b.b a;
    private com.censivn.C3DEngine.b.f.l b;
    private TextureElement d;
    private TextureElement e;
    private TextureElement f;
    private com.censivn.C3DEngine.b.f.m g;

    public c(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(200.0f));
        this.d = new TextureElement(0, false);
        this.e = new TextureElement(0, false);
        this.f = new TextureElement(0, false);
        this.g = com.censivn.C3DEngine.b.b.a.a(180.0f, 180.0f);
        this.g.textures().addElement(this.f);
        this.b = new com.censivn.C3DEngine.b.f.l() { // from class: com.tsf.shell.preference.a.a.a.c.1
            private float b = 0.0f;
            private boolean c = true;

            @Override // com.censivn.C3DEngine.b.f.l
            public void onDrawChildStart() {
                c.this.a.d(this.b);
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
                c.this.a.a(c.this.d);
                c.this.a.a();
                GLES20.glFrontFace(2305);
                c.this.a.dispatchDraw();
                c.this.a.a(c.this.e);
                c.this.a.d();
                GLES20.glFrontFace(2304);
                c.this.a.dispatchDraw();
                GLES20.glFrontFace(2305);
            }
        };
        this.a = new com.tsf.shell.e.f.b.b(com.censivn.C3DEngine.b.b.a.a(189.0f), com.censivn.C3DEngine.b.b.a.a(288.0f), 5, 20);
        this.a.position().x = com.censivn.C3DEngine.b.b.a.a(150.0f);
        this.b.setAnimationObjectState(true);
        this.b.addChild(this.g);
        this.g.position().x = com.censivn.C3DEngine.b.b.a.a(-150.0f);
        this.g.useVBO(false);
        e().addChild(this.b);
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void f() {
        super.f();
        if (this.d.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.d, R.drawable.feature_desktop_effect_screen1);
        }
        if (this.e.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.e, R.drawable.feature_desktop_effect_screen2);
        }
        if (this.f.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.f, R.drawable.desktop_transition_cloth);
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void g() {
        super.g();
        com.censivn.C3DEngine.a.g().a(this.d);
        com.censivn.C3DEngine.a.g().a(this.e);
        com.censivn.C3DEngine.a.g().a(this.f);
    }
}
