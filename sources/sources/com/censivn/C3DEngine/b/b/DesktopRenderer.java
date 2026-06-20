package com.censivn.C3DEngine.b.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.e.AbstractPanelRenderer;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DesktopRenderer extends BaseRenderable {
    private int a;
    private int b;
    private int d;
    private GridRenderable f;
    private com.censivn.C3DEngine.b.d.MouseEventListener i;
    private IRenderable j;
    private float c = 0.0f;
    private boolean e = false;
    private int g = 0;
    private Number3d k = new Number3d();
    private TouchState h = new TouchState();

    /* JADX INFO: Access modifiers changed from: private */
    public IRenderableContainer a(IRenderable iVar) {
        if ((iVar instanceof f) && iVar.parent() != null && iVar.parent() == this) {
            return (f) iVar;
        }
        if (iVar.parent() != null && (iVar.parent() instanceof IRenderable)) {
            return a((IRenderable) iVar.parent());
        }
        return null;
    }

    public c() {
        setLayoutParams(this.h);
        this.d = (int) ScreenConstants.a(4.0f);
        this.f = new GridRenderable(this.a, this.d, false);
        this.f.setDefaultColor(new Color4(255, 255, 255, 70));
        this.f.useVBO(false);
        this.i = new com.censivn.C3DEngine.b.d.MouseEventListener(this) { // from class: com.censivn.C3DEngine.b.b.DesktopRenderer.1
            private com.censivn.C3DEngine.b.d.MouseEventListener b;
            private IRenderable d;

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
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

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void f(MotionEvent motionEvent) {
                if (this.b != null) {
                    this.b.f(motionEvent);
                    this.b = null;
                    c.this.e();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.b != null) {
                    this.b.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                if (this.b != null) {
                    this.b.a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
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
    public void b(IRenderable iVar) {
        if (this.j != null) {
            e();
        }
        this.j = iVar;
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.l(0.95f);
        dVar.m(0.95f);
        dVar.a(com.censivn.C3DEngine.b.g.EasingFunctions.e);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar, 500, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.j != null) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.a(com.censivn.C3DEngine.b.g.EasingFunctions.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.j);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.j, 500, dVar);
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
        com.censivn.C3DEngine.b.g.TweenParams dVar;
        mouseEnabled(false);
        int iNumChildren = numChildren();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iNumChildren) {
            IRenderable childAt = getChildAt(i2);
            b layoutParams = childAt.getLayoutParams();
            if (!childAt.visible()) {
                i = i3;
            } else if (layoutParams == null) {
                i = i3;
            } else {
                childAt.alpha(0.0f);
                childAt.position().y = layoutParams.g - ScreenConstants.a(500.0f);
                if (i2 == iNumChildren - 1) {
                    dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.censivn.C3DEngine.b.b.DesktopRenderer.2
                        @Override // com.censivn.C3DEngine.b.g.TweenParams
                        public void a() {
                            c.this.mouseEnabled(true);
                        }
                    };
                } else {
                    dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                }
                dVar.h(layoutParams.g);
                dVar.a(com.censivn.C3DEngine.b.g.EasingFunctions.n);
                dVar.b(i3 * 60);
                dVar.a(255);
                com.censivn.C3DEngine.b.g.TweenUtils.a(childAt);
                com.censivn.C3DEngine.b.g.TweenUtils.a(childAt, 1000, dVar);
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

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onChildMeasure(IRenderable iVar) {
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
            IRenderable childAt = getChildAt(i3);
            if (childAt instanceof c) {
                ((c) childAt).a(this.a, 0);
            }
        }
        d();
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public boolean calTouchCollision(float f, float f2) {
        return super.calTouchCollision(f, f2);
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderable
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
                    IRenderable childAt = getChildAt(i);
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
        return layoutParams.i + f <= ((float) ScreenConstants.I) && layoutParams.k + f >= ((float) (-ScreenConstants.I));
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
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
            IRenderable childAt = getChildAt(i);
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
            IRenderable childAt = getChildAt(i);
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

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
    public void addChild(i iVar) {
        if (iVar instanceof c) {
            ((c) iVar).b(this.a);
        }
        super.addChild(iVar);
        d();
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
    public boolean removeChild(i iVar) {
        boolean zRemoveChild = super.removeChild(iVar);
        d();
        return zRemoveChild;
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void addChildAt(i iVar, int i) {
        if (iVar instanceof c) {
            ((c) iVar).b(this.a);
        }
        super.addChildAt(iVar, i);
        d();
    }
}
