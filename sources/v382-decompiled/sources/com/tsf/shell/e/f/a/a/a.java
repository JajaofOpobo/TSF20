package com.tsf.shell.e.f.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.f.c {
    private float a;
    private float b;
    private float c;
    private float d;
    private int e = 1;
    private float f = com.censivn.C3DEngine.b.b.a.a(50.0f);
    private float g = com.censivn.C3DEngine.b.b.a.a(30.0f);
    private float h = com.censivn.C3DEngine.b.b.a.a(30.0f);
    private com.tsf.shell.e.i.b.e.i i;

    public a() {
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.e.f.a.a.a.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                float[] a = x.a(motionEvent);
                com.censivn.C3DEngine.b.f.j b = a.this.b(a[0], a[1]);
                if (b != null && (b instanceof com.tsf.shell.e.i.b.e.i)) {
                    a.this.i = (com.tsf.shell.e.i.b.e.i) b;
                    a.this.i.aP();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (a.this.i != null) {
                    a.this.i.aV();
                }
            }
        });
    }

    public int a() {
        return this.e;
    }

    public void a(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onMeasure(int i, int i2) {
        this.a = i - this.f;
        maxX(this.a);
        c();
    }

    public com.censivn.C3DEngine.b.f.j b(float f, float f2) {
        if (!visible()) {
            return null;
        }
        int size = children().size() - 1;
        while (true) {
            int i = size;
            if (i <= -1) {
                return null;
            }
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) children().get(i);
            if (jVar instanceof com.tsf.shell.e.i.b.e.i) {
                com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) jVar;
                if (iVar.z() != null) {
                    float f3 = iVar.z().g;
                    iVar.z().g = 0.0f;
                    boolean calTouchCollision = jVar.calTouchCollision(f, f2);
                    iVar.z().g = f3;
                    if (calTouchCollision) {
                        return jVar;
                    }
                } else if (jVar.calTouchCollision(f, f2)) {
                    return jVar;
                }
            }
            size = i - 1;
        }
    }

    @Override // com.censivn.C3DEngine.b.f.c
    public void a(Number3d number3d, int i) {
        b(number3d, i);
    }

    private void c() {
        this.e = (int) (this.a / this.b);
        this.e = this.e == 0 ? 1 : this.e;
        this.d = this.e == 1 ? 0.0f : (this.a - this.b) / (this.e - 1);
        b();
        for (int i = 0; i < numChildren(); i++) {
            b(b(i), i);
        }
    }

    public void b() {
        minY(-((((numChildren() - 1) / this.e) * (this.h + this.c)) + this.c));
    }

    private void b(Number3d number3d, int i) {
        int i2 = i % this.e;
        int i3 = i / this.e;
        number3d.x = (i2 * this.d) + (this.b / 2.0f);
        number3d.y = ((-this.c) / 2.0f) - (i3 * (this.c + this.h));
    }
}
