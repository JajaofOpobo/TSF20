package com.censivn.C3DEngine.b.b.a;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
/* loaded from: classes.dex */
public class b extends j {
    private boolean isAnimationRunning = false;
    private float mMarginDistance = 0.0f;

    public void resetPosition() {
        updateChildPosition(false);
    }

    public void setMarginDistance(float f) {
        this.mMarginDistance = f;
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        super.addChild(iVar);
        onChildMeasure(iVar);
        updateChildPosition(numChildren() - 1, false);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void addChildAt(i iVar, int i) {
        super.addChildAt(iVar, i);
        onChildMeasure(iVar);
        updateChildPosition(i, false);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        boolean removeChild = super.removeChild(iVar);
        if (removeChild) {
            onChildMeasure(iVar);
        }
        return removeChild;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public i removeChildAt(int i) {
        i removeChildAt = super.removeChildAt(i);
        onChildMeasure(removeChildAt);
        return removeChildAt;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onChildMeasure(i iVar) {
        this.isAnimationRunning = true;
        updateBorder();
    }

    private void updateBorder() {
        float maxX = maxX() - minX();
        int numChildren = numChildren();
        float f = 0.0f;
        for (int i = 0; i < numChildren; i++) {
            i childAt = getChildAt(i);
            if (childAt.visible()) {
                f += childAt.maxX() - childAt.minX();
            }
        }
        if (maxX != f) {
            maxX(f);
            notifLayoutRefresh();
        }
    }

    private boolean updateChildPosition(boolean z) {
        return updateChildPosition(0, z);
    }

    private boolean updateChildPosition(int i, boolean z) {
        float maxX;
        int numChildren = numChildren();
        if (i == 0) {
            maxX = this.mMarginDistance;
        } else {
            i childAt = getChildAt(i - 1);
            maxX = childAt.maxX() + childAt.position().x;
        }
        boolean z2 = true;
        while (i < numChildren) {
            i childAt2 = getChildAt(i);
            if (childAt2.visible()) {
                float minX = maxX - childAt2.minX();
                maxX = childAt2.maxX() + minX;
                boolean z3 = childAt2.getRendererVisibility() || childAt2.isPositionXVisible(minX);
                if (z && z3) {
                    if (childAt2.position().x != minX) {
                        childAt2.position().x += (minX - childAt2.position().x) * 0.15f;
                        if (Math.abs(childAt2.position().x - minX) < 0.2f) {
                            childAt2.position().x = minX;
                        } else {
                            z2 = false;
                        }
                    }
                } else {
                    childAt2.position().x = minX;
                }
            }
            i++;
        }
        return z2;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void visible(Boolean bool) {
        super.visible(bool);
        notifLayoutRefresh();
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        if (visible() && this.isAnimationRunning) {
            if (updateChildPosition(true)) {
                this.isAnimationRunning = false;
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
