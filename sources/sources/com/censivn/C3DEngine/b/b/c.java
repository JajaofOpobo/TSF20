package com.censivn.C3DEngine.b.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.e.f;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends j {
    private int a;
    private int b;
    private int d;
    private k f;
    private com.censivn.C3DEngine.b.d.a i;
    private i j;
    private float c = 0.0f;
    private boolean e = false;
    private int g = 0;
    private Number3d k = new Number3d();
    private b h = new b();

    /* JADX INFO: Access modifiers changed from: private */
    public f a(i iVar) {
        if ((iVar instanceof f) && iVar.parent() != null && iVar.parent() == this) {
            return (f) iVar;
        }
        if (iVar.parent() != null && (iVar.parent() instanceof i)) {
            return a((i) iVar.parent());
        }
        return null;
    }

    public c() {
        setLayoutParams(this.h);
        this.d = (int) a.a(4.0f);
        this.f = new k(this.a, this.d, false);
        this.f.setDefaultColor(new Color4(255, 255, 255, 70));
        this.f.useVBO(false);
        this.i = new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.b.c.1
            private com.censivn.C3DEngine.b.d.a b;
            private i d;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                float[] fArrA = x.a(motionEvent);
                this.d = c.this.getHittingTarget(fArrA[0], fArrA[1], true);
                if (this.d != null && this.d.getMouseEventListener() != null) {
                    this.b = this.d.getMouseEventListener();
                    this.b.e(motionEvent);
                    f fVarA = c.this.a(this.d);
                    if (fVarA != null && fVarA.k()) {
                        c.this.b(this.d);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (this.b != null) {
                    this.b.f(motionEvent);
                    this.b = null;
                    c.this.e();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.b != null) {
                    this.b.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (this.b != null) {
                    this.b.a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.b != null) {
                    this.b.a(motionEvent, motionEvent2, f, f2);
                }
                c.this.e();
            }
        };
        setMouseEventListener(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(i iVar) {
        if (this.j != null) {
            e();
        }
        this.j = iVar;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.l(0.95f);
        dVar.m(0.95f);
        dVar.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 500, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.j != null) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.c.a(this.j);
            com.censivn.C3DEngine.b.g.c.a(this.j, 500, dVar);
            this.j = null;
        }
    }

    public void a(boolean z) {
        getLayoutParams().l = z;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public void a(int i) {
        this.g = i;
    }

    public void b(boolean z) {
        this.e = z;
        d();
    }

    public void c() {
        int i;
        com.censivn.C3DEngine.b.g.d dVar;
        mouseEnabled(false);
        int iNumChildren = numChildren();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iNumChildren) {
            i childAt = getChildAt(i2);
            b layoutParams = childAt.getLayoutParams();
            if (!childAt.visible()) {
                i = i3;
            } else if (layoutParams == null) {
                i = i3;
            } else {
                childAt.alpha(0.0f);
                childAt.position().y = layoutParams.g - a.a(500.0f);
                if (i2 == iNumChildren - 1) {
                    dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.b.c.2
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            c.this.mouseEnabled(true);
                        }
                    };
                } else {
                    dVar = new com.censivn.C3DEngine.b.g.d();
                }
                dVar.h(layoutParams.g);
                dVar.a(com.censivn.C3DEngine.b.g.a.n);
                dVar.b(i3 * 60);
                dVar.a(255);
                com.censivn.C3DEngine.b.g.c.a(childAt);
                com.censivn.C3DEngine.b.g.c.a(childAt, 1000, dVar);
                i = i3 + 1;
            }
            i2++;
            i3 = i;
        }
    }

    public void b(int i) {
        this.a = (int) ((i - this.h.c) - this.h.d);
        this.h.e = this.a;
        c(this.a);
        minX((-this.a) / 2.0f);
        maxX(this.a / 2.0f);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onChildMeasure(i iVar) {
    }

    public void c(int i) {
    }

    public void d(int i) {
        if (i != 0) {
            this.b = i;
            this.h.f = this.b;
            e(this.b);
            minY(-this.b);
            maxY(0.0f);
            notifLayoutRefresh();
        }
    }

    public void e(int i) {
    }

    public void a(int i, int i2) {
        b(i);
        int size = children().size();
        for (int i3 = 0; i3 < size; i3++) {
            i childAt = getChildAt(i3);
            if (childAt instanceof c) {
                ((c) childAt).a(this.a, 0);
            }
        }
        d();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public boolean calTouchCollision(float f, float f2) {
        return super.calTouchCollision(f, f2);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            this.k.reset();
            localToGlobal(this.k);
            if (renderChildren()) {
                int size = children().size();
                for (int i = 0; i < size; i++) {
                    i childAt = getChildAt(i);
                    b layoutParams = childAt.getLayoutParams();
                    if (!childAt.visible() || layoutParams == null) {
                        onDrawChildStart(childAt);
                        childAt.dispatchDraw();
                        onDrawChildEnd(childAt);
                    } else if (a(this.k, childAt)) {
                        childAt.setRendererVisibility(true);
                        onDrawChildStart(childAt);
                        childAt.dispatchDraw();
                        onDrawChildEnd(childAt);
                        if (this.e && i != size - 1 && !layoutParams.l) {
                            this.f.position().y = ((childAt.position().y + layoutParams.i) - layoutParams.b) - (this.d / 2.0f);
                            this.f.a(layoutParams.e);
                            this.f.alpha(childAt.alpha());
                            this.f.dispatchDraw();
                        }
                    } else {
                        childAt.setRendererVisibility(false);
                    }
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    private boolean a(Number3d number3d, i iVar) {
        b layoutParams = iVar.getLayoutParams();
        float f = iVar.position().y + number3d.y;
        return layoutParams.i + f <= ((float) a.I) && layoutParams.k + f >= ((float) (-a.I));
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
    }

    public void d() {
        float f;
        float f2 = f();
        if (f2 > this.b || this.g == 1) {
            this.h.k = 0.0f;
            d((int) f2);
            this.h.i = -this.b;
            f = 0.0f;
        } else {
            f = (-(this.b - f2)) / 2.0f;
            this.h.k = 0.0f;
            this.h.i = -this.b;
        }
        minY(this.h.i);
        int iNumChildren = numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            i childAt = getChildAt(i);
            b layoutParams = childAt.getLayoutParams();
            if (childAt.visible() && layoutParams != null) {
                layoutParams.g = (f - layoutParams.a) - layoutParams.k;
                childAt.position().y = layoutParams.g;
                f = (childAt.position().y + layoutParams.i) - layoutParams.b;
                if (this.e && !layoutParams.l) {
                    f -= this.d;
                }
            }
        }
    }

    private float f() {
        int iNumChildren = numChildren();
        float f = 0.0f;
        for (int i = 0; i < iNumChildren; i++) {
            i childAt = getChildAt(i);
            b layoutParams = childAt.getLayoutParams();
            if (childAt.visible() && layoutParams != null) {
                f += ((layoutParams.a + layoutParams.k) - layoutParams.i) + layoutParams.b;
                if (this.e) {
                    f += this.d;
                }
            }
        }
        return f;
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        if (iVar instanceof c) {
            ((c) iVar).b(this.a);
        }
        super.addChild(iVar);
        d();
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        boolean zRemoveChild = super.removeChild(iVar);
        d();
        return zRemoveChild;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void addChildAt(i iVar, int i) {
        if (iVar instanceof c) {
            ((c) iVar).b(this.a);
        }
        super.addChildAt(iVar, i);
        d();
    }
}
