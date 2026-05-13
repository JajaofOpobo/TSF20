package com.censivn.C3DEngine.p031b.p033b.p034a;

import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
/* renamed from: com.censivn.C3DEngine.b.b.a.b */
/* loaded from: classes.dex */
public class C0895b extends C0980j {
    private boolean isAnimationRunning = false;
    private float mMarginDistance = 0.0f;

    public void resetPosition() {
        updateChildPosition(false);
    }

    public void setMarginDistance(float f) {
        this.mMarginDistance = f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        super.addChild(c0975i);
        onChildMeasure(c0975i);
        updateChildPosition(numChildren() - 1, false);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void addChildAt(C0975i c0975i, int i) {
        super.addChildAt(c0975i, i);
        onChildMeasure(c0975i);
        updateChildPosition(i, false);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        boolean removeChild = super.removeChild(c0975i);
        if (removeChild) {
            onChildMeasure(c0975i);
        }
        return removeChild;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public C0975i removeChildAt(int i) {
        C0975i removeChildAt = super.removeChildAt(i);
        onChildMeasure(removeChildAt);
        return removeChildAt;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onChildMeasure(C0975i c0975i) {
        this.isAnimationRunning = true;
        updateBorder();
    }

    private void updateBorder() {
        float maxX = maxX() - minX();
        int numChildren = numChildren();
        float f = 0.0f;
        for (int i = 0; i < numChildren; i++) {
            C0975i childAt = getChildAt(i);
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
            C0975i childAt = getChildAt(i - 1);
            maxX = childAt.maxX() + childAt.position().f2526x;
        }
        boolean z2 = true;
        while (i < numChildren) {
            C0975i childAt2 = getChildAt(i);
            if (childAt2.visible()) {
                float minX = maxX - childAt2.minX();
                maxX = childAt2.maxX() + minX;
                boolean z3 = childAt2.getRendererVisibility() || childAt2.isPositionXVisible(minX);
                if (z && z3) {
                    if (childAt2.position().f2526x != minX) {
                        childAt2.position().f2526x += (minX - childAt2.position().f2526x) * 0.15f;
                        if (Math.abs(childAt2.position().f2526x - minX) < 0.2f) {
                            childAt2.position().f2526x = minX;
                        } else {
                            z2 = false;
                        }
                    }
                } else {
                    childAt2.position().f2526x = minX;
                }
            }
            i++;
        }
        return z2;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void visible(Boolean bool) {
        super.visible(bool);
        notifLayoutRefresh();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
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
                    C0975i c0975i = children().get(i);
                    onDrawChildStart(c0975i);
                    if (c0975i.getRendererVisibility()) {
                        c0975i.dispatchDraw();
                    }
                    onDrawChildEnd(c0975i);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
