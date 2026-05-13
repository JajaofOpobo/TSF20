package com.censivn.C3DEngine.p031b.p033b.p034a;

import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.p096f.p118e.p126f.C2570b;
/* renamed from: com.censivn.C3DEngine.b.b.a.c */
/* loaded from: classes.dex */
public class C0896c extends C2570b {

    /* renamed from: a */
    private boolean f2591a = false;

    /* renamed from: b */
    private float f2592b = 0.0f;

    /* renamed from: c */
    private float f2593c = 0.0f;

    /* renamed from: a */
    public void m10732a() {
        m10727a(false);
    }

    /* renamed from: a */
    public void m10731a(float f) {
        this.f2592b = f;
    }

    /* renamed from: b */
    public float m10726b() {
        return this.f2592b;
    }

    /* renamed from: b */
    public void m10725b(float f) {
        this.f2593c = f;
    }

    /* renamed from: c */
    public float m10723c() {
        return this.f2593c;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        super.addChild(c0975i);
        onChildMeasure(c0975i);
    }

    /* renamed from: a */
    public void m10728a(C0975i c0975i, boolean z) {
        super.addChild(c0975i);
        onChildMeasure(c0975i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void addChildAt(C0975i c0975i, int i) {
        super.addChildAt(c0975i, i);
        onChildMeasure(c0975i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        boolean removeChild = super.removeChild(c0975i);
        if (removeChild) {
            onChildMeasure(c0975i);
        }
        return removeChild;
    }

    /* renamed from: a */
    public boolean m10729a(C0975i c0975i) {
        return super.removeChild(c0975i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public C0975i removeChildAt(int i) {
        C0975i removeChildAt = super.removeChildAt(i);
        onChildMeasure(removeChildAt);
        return removeChildAt;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onChildMeasure(C0975i c0975i) {
        this.f2591a = true;
        m10722e();
    }

    /* renamed from: b */
    public void m10724b(C0975i c0975i) {
        this.f2591a = true;
    }

    /* renamed from: e */
    private void m10722e() {
        float maxY = maxY() - minY();
        int numChildren = numChildren();
        float f = this.f2592b;
        for (int i = 0; i < numChildren; i++) {
            C0975i childAt = getChildAt(i);
            if (childAt.visible()) {
                f += (childAt.maxY() - childAt.minY()) + this.f2593c;
            }
        }
        if (numChildren > 0) {
            f -= this.f2593c;
        }
        float f2 = f + this.f2592b;
        if (maxY != f2) {
            minY(-f2);
            notifLayoutRefresh();
        }
    }

    /* renamed from: a */
    private boolean m10727a(boolean z) {
        return m10730a(0, z);
    }

    /* renamed from: a */
    private boolean m10730a(int i, boolean z) {
        float maxY;
        int numChildren = numChildren();
        if (i == 0) {
            maxY = -this.f2592b;
        } else {
            C0975i childAt = getChildAt(i - 1);
            maxY = childAt.position().f2527y - childAt.maxY();
        }
        float f = maxY;
        boolean z2 = true;
        float f2 = f;
        while (i < numChildren) {
            C0975i childAt2 = getChildAt(i);
            if (childAt2.visible()) {
                float maxY2 = f2 - childAt2.maxY();
                float minY = maxY2 + childAt2.minY();
                boolean z3 = childAt2.getRendererVisibility() || childAt2.isPositionYVisible(maxY2);
                if (z && z3) {
                    if (childAt2.position().f2527y != maxY2 || childAt2.position().f2526x != 0.0f) {
                        childAt2.position().f2527y += (maxY2 - childAt2.position().f2527y) * 0.15f;
                        childAt2.position().f2526x += (0.0f - childAt2.position().f2526x) * 0.15f;
                        if (Math.abs(childAt2.position().f2527y - maxY2) < 0.2f && Math.abs(childAt2.position().f2526x - 0.0f) < 0.2f) {
                            childAt2.position().f2527y = maxY2;
                            childAt2.position().f2526x = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                } else {
                    childAt2.position().f2527y = maxY2;
                    childAt2.position().f2526x = 0.0f;
                }
                f2 = minY - this.f2593c;
            }
            i++;
            z2 = z2;
            f2 = f2;
        }
        return z2;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void visible(Boolean bool) {
        super.visible(bool);
        notifLayoutRefresh();
    }

    @Override // com.tsf.shell.p096f.p118e.p126f.C2570b, com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (visible() && this.f2591a) {
            if (m10727a(true)) {
                this.f2591a = false;
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
