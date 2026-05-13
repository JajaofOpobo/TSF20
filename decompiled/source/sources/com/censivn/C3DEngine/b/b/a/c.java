package com.censivn.C3DEngine.b.b.a;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
/* loaded from: classes.dex */
public class c extends com.tsf.shell.f.e.f.b {
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

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        super.addChild(iVar);
        onChildMeasure(iVar);
    }

    public void a(i iVar, boolean z) {
        super.addChild(iVar);
        onChildMeasure(iVar);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void addChildAt(i iVar, int i) {
        super.addChildAt(iVar, i);
        onChildMeasure(iVar);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        boolean removeChild = super.removeChild(iVar);
        if (removeChild) {
            onChildMeasure(iVar);
        }
        return removeChild;
    }

    public boolean a(i iVar) {
        return super.removeChild(iVar);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public i removeChildAt(int i) {
        i removeChildAt = super.removeChildAt(i);
        onChildMeasure(removeChildAt);
        return removeChildAt;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onChildMeasure(i iVar) {
        this.a = true;
        e();
    }

    public void b(i iVar) {
        this.a = true;
    }

    private void e() {
        float maxY = maxY() - minY();
        int numChildren = numChildren();
        float f = this.b;
        for (int i = 0; i < numChildren; i++) {
            i childAt = getChildAt(i);
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
            i childAt = getChildAt(i - 1);
            maxY = childAt.position().y - childAt.maxY();
        }
        float f = maxY;
        boolean z2 = true;
        float f2 = f;
        while (i < numChildren) {
            i childAt2 = getChildAt(i);
            if (childAt2.visible()) {
                float maxY2 = f2 - childAt2.maxY();
                float minY = maxY2 + childAt2.minY();
                boolean z3 = childAt2.getRendererVisibility() || childAt2.isPositionYVisible(maxY2);
                if (z && z3) {
                    if (childAt2.position().y != maxY2 || childAt2.position().x != 0.0f) {
                        childAt2.position().y += (maxY2 - childAt2.position().y) * 0.15f;
                        childAt2.position().x += (0.0f - childAt2.position().x) * 0.15f;
                        if (Math.abs(childAt2.position().y - maxY2) < 0.2f && Math.abs(childAt2.position().x - 0.0f) < 0.2f) {
                            childAt2.position().y = maxY2;
                            childAt2.position().x = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                } else {
                    childAt2.position().y = maxY2;
                    childAt2.position().x = 0.0f;
                }
                f2 = minY - this.c;
            }
            i++;
            z2 = z2;
            f2 = f2;
        }
        return z2;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void visible(Boolean bool) {
        super.visible(bool);
        notifLayoutRefresh();
    }

    @Override // com.tsf.shell.f.e.f.b, com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
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
                    i iVar = children().get(i);
                    onDrawChildStart(iVar);
                    if (iVar.getRendererVisibility()) {
                        iVar.dispatchDraw();
                    }
                    onDrawChildEnd(iVar);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
