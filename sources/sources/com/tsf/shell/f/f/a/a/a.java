package com.tsf.shell.f.f.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.i.b.e.g;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends com.censivn.C3DEngine.b.f.b {
    private float a;
    private float b;
    private float c;
    private float d;
    private int e = 1;
    private float f = com.censivn.C3DEngine.b.b.a.a(50.0f);
    private float g = com.censivn.C3DEngine.b.b.a.a(30.0f);
    private float h = com.censivn.C3DEngine.b.b.a.a(30.0f);
    private g i;

    public a() {
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.f.a.a.a.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                float[] fArrA = x.a(motionEvent);
                i iVarB = a.this.b(fArrA[0], fArrA[1]);
                if (iVarB != null && (iVarB instanceof g)) {
                    a.this.i = (g) iVarB;
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

    @Override // com.censivn.C3DEngine.b.f.i
    public void onMeasure(int i, int i2) {
        this.a = i - this.f;
        maxX(this.a);
        c();
    }

    public i b(float f, float f2) {
        if (!visible()) {
            return null;
        }
        int size = children().size() - 1;
        while (true) {
            int i = size;
            if (i <= -1) {
                return null;
            }
            i iVar = children().get(i);
            if (iVar instanceof g) {
                g gVar = (g) iVar;
                if (gVar.z() != null) {
                    float f3 = gVar.z().g;
                    gVar.z().g = 0.0f;
                    boolean zCalTouchCollision = iVar.calTouchCollision(f, f2);
                    gVar.z().g = f3;
                    if (zCalTouchCollision) {
                        return iVar;
                    }
                } else if (iVar.calTouchCollision(f, f2)) {
                    return iVar;
                }
            }
            size = i - 1;
        }
    }

    @Override // com.censivn.C3DEngine.b.f.b
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
