package com.censivn.C3DEngine.b.b.a;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.common.renderer.MatrixStack;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        boolean zRemoveChild = super.removeChild(iVar);
        if (zRemoveChild) {
            onChildMeasure(iVar);
        }
        return zRemoveChild;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public i removeChildAt(int i) {
        i iVarRemoveChildAt = super.removeChildAt(i);
        onChildMeasure(iVarRemoveChildAt);
        return iVarRemoveChildAt;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onChildMeasure(i iVar) {
        this.isAnimationRunning = true;
        updateBorder();
    }

    private void updateBorder() {
        float fMaxX = maxX() - minX();
        int iNumChildren = numChildren();
        float fMaxX2 = 0.0f;
        for (int i = 0; i < iNumChildren; i++) {
            i childAt = getChildAt(i);
            if (childAt.visible()) {
                fMaxX2 += childAt.maxX() - childAt.minX();
            }
        }
        if (fMaxX != fMaxX2) {
            maxX(fMaxX2);
            notifLayoutRefresh();
        }
    }

    private boolean updateChildPosition(boolean z) {
        return updateChildPosition(0, z);
    }

    private boolean updateChildPosition(int i, boolean z) {
        float fMaxX;
        int iNumChildren = numChildren();
        if (i == 0) {
            fMaxX = this.mMarginDistance;
        } else {
            i childAt = getChildAt(i - 1);
            fMaxX = childAt.maxX() + childAt.position().x;
        }
        boolean z2 = true;
        while (i < iNumChildren) {
            i childAt2 = getChildAt(i);
            if (childAt2.visible()) {
                float fMinX = fMaxX - childAt2.minX();
                fMaxX = childAt2.maxX() + fMinX;
                boolean z3 = childAt2.getRendererVisibility() || childAt2.isPositionXVisible(fMinX);
                if (!z || !z3) {
                    childAt2.position().x = fMinX;
                } else if (childAt2.position().x != fMinX) {
                    childAt2.position().x += (fMinX - childAt2.position().x) * 0.15f;
                    if (Math.abs(childAt2.position().x - fMinX) < 0.2f) {
                        childAt2.position().x = fMinX;
                    } else {
                        z2 = false;
                    }
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
