package com.censivn.C3DEngine.b.b.a;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.common.renderer.MatrixStack;

/* loaded from: classes.dex */
public class c extends com.tsf.shell.e.e.f.e {
    private boolean a = false;
    private float b = 0.0f;
    private float c = 0.0f;

    public void a() {
        a(false);
    }

    public void a(float f) {
        this.b = f;
    }

    public float b() {
        return this.b;
    }

    public void b(float f) {
        this.c = f;
    }

    public float c() {
        return this.c;
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public void addChild(j jVar) {
        super.addChild(jVar);
        onChildMeasure(jVar);
    }

    public void a(j jVar, boolean z) {
        super.addChild(jVar);
        onChildMeasure(jVar);
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void addChildAt(j jVar, int i) {
        super.addChildAt(jVar, i);
        onChildMeasure(jVar);
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public boolean removeChild(j jVar) {
        boolean removeChild = super.removeChild(jVar);
        if (removeChild) {
            onChildMeasure(jVar);
        }
        return removeChild;
    }

    public boolean a(j jVar) {
        return super.removeChild(jVar);
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public j removeChildAt(int i) {
        j removeChildAt = super.removeChildAt(i);
        onChildMeasure(removeChildAt);
        return removeChildAt;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onChildMeasure(j jVar) {
        this.a = true;
        e();
    }

    public void b(j jVar) {
        this.a = true;
    }

    private void e() {
        float maxY = maxY() - minY();
        int numChildren = numChildren();
        float f = this.b;
        for (int i = 0; i < numChildren; i++) {
            j childAt = getChildAt(i);
            if (childAt.visible()) {
                f += (childAt.maxY() - childAt.minY()) + this.c;
            }
        }
        if (numChildren > 0) {
            f -= this.c;
        }
        float f2 = f + this.b;
        if (maxY != f2) {
            minY(-f2);
            notifLayoutRefresh();
        }
    }

    private boolean a(boolean z) {
        return a(0, z);
    }

    private boolean a(int i, boolean z) {
        float maxY;
        int numChildren = numChildren();
        if (i == 0) {
            maxY = -this.b;
        } else {
            j childAt = getChildAt(i - 1);
            maxY = childAt.position().y - childAt.maxY();
        }
        float f = maxY;
        boolean z2 = true;
        float f2 = f;
        while (i < numChildren) {
            j childAt2 = getChildAt(i);
            if (childAt2.visible()) {
                float maxY2 = f2 - childAt2.maxY();
                float minY = maxY2 + childAt2.minY();
                boolean z3 = childAt2.getRendererVisibility() || childAt2.isPositionYVisible(maxY2);
                if (!z || !z3) {
                    childAt2.position().y = maxY2;
                    childAt2.position().x = 0.0f;
                } else if (childAt2.position().y != maxY2 || childAt2.position().x != 0.0f) {
                    childAt2.position().y += (maxY2 - childAt2.position().y) * 0.15f;
                    childAt2.position().x += (0.0f - childAt2.position().x) * 0.15f;
                    if (Math.abs(childAt2.position().y - maxY2) < 0.2f && Math.abs(childAt2.position().x - 0.0f) < 0.2f) {
                        childAt2.position().y = maxY2;
                        childAt2.position().x = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                f2 = minY - this.c;
            }
            i++;
            z2 = z2;
            f2 = f2;
        }
        return z2;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void visible(Boolean bool) {
        super.visible(bool);
        notifLayoutRefresh();
    }

    @Override // com.tsf.shell.e.e.f.e, com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void dispatchDraw() {
        if (visible() && this.a) {
            if (a(true)) {
                this.a = false;
            }
            invalidate();
        }
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int size = children().size();
                for (int i = 0; i < size; i++) {
                    j jVar = (j) children().get(i);
                    onDrawChildStart(jVar);
                    if (jVar.getRendererVisibility()) {
                        jVar.dispatchDraw();
                    }
                    onDrawChildEnd(jVar);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
