package com.censivn.C3DEngine.b.b.a;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.common.renderer.MatrixStack;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        boolean zRemoveChild = super.removeChild(iVar);
        if (zRemoveChild) {
            onChildMeasure(iVar);
        }
        return zRemoveChild;
    }

    public boolean a(i iVar) {
        return super.removeChild(iVar);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public i removeChildAt(int i) {
        i iVarRemoveChildAt = super.removeChildAt(i);
        onChildMeasure(iVarRemoveChildAt);
        return iVarRemoveChildAt;
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
        float fMaxY = maxY() - minY();
        int iNumChildren = numChildren();
        float fMaxY2 = this.b;
        for (int i = 0; i < iNumChildren; i++) {
            i childAt = getChildAt(i);
            if (childAt.visible()) {
                fMaxY2 += (childAt.maxY() - childAt.minY()) + this.c;
            }
        }
        if (iNumChildren > 0) {
            fMaxY2 -= this.c;
        }
        float f = fMaxY2 + this.b;
        if (fMaxY != f) {
            minY(-f);
            notifLayoutRefresh();
        }
    }

    private boolean a(boolean z) {
        return a(0, z);
    }

    private boolean a(int i, boolean z) {
        float fMaxY;
        int iNumChildren = numChildren();
        if (i == 0) {
            fMaxY = -this.b;
        } else {
            i childAt = getChildAt(i - 1);
            fMaxY = childAt.position().y - childAt.maxY();
        }
        float f = fMaxY;
        boolean z2 = true;
        float f2 = f;
        while (i < iNumChildren) {
            i childAt2 = getChildAt(i);
            if (childAt2.visible()) {
                float fMaxY2 = f2 - childAt2.maxY();
                float fMinY = fMaxY2 + childAt2.minY();
                boolean z3 = childAt2.getRendererVisibility() || childAt2.isPositionYVisible(fMaxY2);
                if (!z || !z3) {
                    childAt2.position().y = fMaxY2;
                    childAt2.position().x = 0.0f;
                } else if (childAt2.position().y != fMaxY2 || childAt2.position().x != 0.0f) {
                    childAt2.position().y += (fMaxY2 - childAt2.position().y) * 0.15f;
                    childAt2.position().x += (0.0f - childAt2.position().x) * 0.15f;
                    if (Math.abs(childAt2.position().y - fMaxY2) < 0.2f && Math.abs(childAt2.position().x - 0.0f) < 0.2f) {
                        childAt2.position().y = fMaxY2;
                        childAt2.position().x = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                f2 = fMinY - this.c;
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
