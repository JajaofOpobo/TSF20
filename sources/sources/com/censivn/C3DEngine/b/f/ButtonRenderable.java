package com.censivn.C3DEngine.b.f;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ButtonRenderable extends BaseRenderable {
    private LabelRenderable a;
    private GridRenderable b;
    private Color4 c = new Color4();
    private int d;
    private int e;

    public ButtonRenderable(float f, float f2, int i, int i2) {
        this.b = new GridRenderable(f, f2, false);
        this.b.setDefaultColor(this.c);
        this.d = i;
        this.e = i2;
        this.c.set(this.d);
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.b) { // from class: com.censivn.C3DEngine.b.f.ButtonRenderable.1
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                ButtonRenderable.this.a();
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void e(MotionEvent motionEvent) {
                ButtonRenderable.this.b();
                ButtonRenderable.this.c.set(ButtonRenderable.this.e);
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void f(MotionEvent motionEvent) {
                ButtonRenderable.this.c();
                ButtonRenderable.this.c.set(ButtonRenderable.this.d);
            }
        });
        this.b.calAABB();
        this.a = new m();
        addChild(this.b);
        addChild(this.a);
    }

    public void a(int i) {
        this.a.c(i);
    }

    public void b(int i) {
        this.a.d(i);
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
        this.a.a();
    }
}
