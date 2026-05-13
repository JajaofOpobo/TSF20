package com.tsf.shell.p096f.p131f.p132a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k;
import com.tsf.shell.p096f.p153i.C3112b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.a */
/* loaded from: classes.dex */
public class C2676a extends C2753c {

    /* renamed from: b */
    private InterfaceC2679a f8811b;

    /* renamed from: c */
    private C2676a f8812c;

    /* renamed from: d */
    private C2676a f8813d;

    /* renamed from: e */
    private int f8814e;

    /* renamed from: f */
    private AbstractC2745k f8815f;

    /* renamed from: a */
    public float f8810a = 0.0f;

    /* renamed from: g */
    private boolean f8816g = false;

    /* renamed from: h */
    private boolean f8817h = false;

    /* renamed from: com.tsf.shell.f.f.a.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2679a {
        /* renamed from: a */
        void mo4500a(C2676a c2676a);

        /* renamed from: a */
        void mo4499a(C2676a c2676a, C2676a c2676a2, C2676a c2676a3);

        /* renamed from: i_ */
        C2676a mo4399i_();

        /* renamed from: j_ */
        void mo4397j_();
    }

    /* renamed from: a */
    public void m4985a() {
        int i = 0;
        Iterator<C0975i> it = children().iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                C0975i next = it.next();
                if (next instanceof C3112b) {
                    Number3d number3d = C2862h.f9292E.get(i2);
                    next.position().f2526x = number3d.f2526x;
                    next.position().f2527y = number3d.f2527y;
                    next.rotation().f2526x = 0.0f;
                    next.rotation().f2527y = 0.0f;
                    next.rotation().f2528z = 0.0f;
                    next.scale().f2526x = 1.0f;
                    next.scale().f2527y = 1.0f;
                    i = i2 + 1;
                } else {
                    i = i2;
                }
            } else {
                return;
            }
        }
    }

    public C2676a(AbstractC2745k abstractC2745k, InterfaceC2679a interfaceC2679a) {
        this.f8811b = interfaceC2679a;
        m4977a(abstractC2745k);
    }

    /* renamed from: a */
    public void m4977a(AbstractC2745k abstractC2745k) {
        if (this.f8815f != null) {
            this.f8815f.mo4794a(this);
        }
        this.f8815f = abstractC2745k;
        this.f8815f.mo4788b(this);
    }

    /* renamed from: b */
    public AbstractC2745k m4973b() {
        return this.f8815f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void destroy() {
        children().clear();
        this.f8811b = null;
        this.f8812c = null;
        this.f8813d = null;
        this.f8815f.mo4794a(this);
        this.f8815f = null;
        this.f8817h = true;
        removeFromParent();
        super.destroy();
    }

    /* renamed from: a */
    public void m4974a(boolean z) {
        if (super.visible() && !z) {
            m4984a(0.0f);
        }
        super.visible(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void m4980a(C0975i c0975i) {
        super.addChild(c0975i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        m4979a(c0975i, numChildren(), true);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void addChildAt(C0975i c0975i, int i) {
        m4979a(c0975i, i, true);
    }

    /* renamed from: a */
    public void m4979a(C0975i c0975i, int i, boolean z) {
        boolean z2;
        this.f8811b.mo4397j_();
        int numChildren = numChildren();
        if (numChildren == C2862h.f9296m) {
            C3112b c3112b = (C3112b) children().get(numChildren - 1);
            if (this.f8816g && C3359a.f11094h.m4031n().m4181t() == -1 && !C3359a.f11094h.m4019t().m4450aq()) {
                final C0975i m4492a = C3359a.f11094h.m4019t().m4492a(c3112b);
                m4492a.removeFromParent();
                C3359a.f11094h.m4019t().addChild(m4492a);
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.a.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C3359a.f11094h.m4019t().m4410e(m4492a);
                    }
                };
                c1017d.mo10301f(C0892a.f2550A + C3566b.f11839a.f11762T);
                C1014c.m10326a(m4492a);
                C1014c.m10325a(m4492a, VEasing.Linear.easeNone, c1017d);
            }
            children().remove(c3112b);
            if (this.f8813d != null && this.f8813d.m4967e() != 0) {
                this.f8813d.addChildAt(c3112b, 0);
            } else {
                this.f8811b.mo4399i_().addChildAt(c3112b, 0);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (i >= numChildren) {
            i = z2 ? numChildren - 1 : numChildren;
        }
        super.addChildAt(c0975i, i);
        m4981a(i, z);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        this.f8811b.mo4397j_();
        int childIndexOf = getChildIndexOf(c0975i);
        boolean removeChild = super.removeChild(c0975i);
        if (numChildren() == 0) {
            this.f8811b.mo4499a(this, this.f8812c, this.f8813d);
        } else {
            if (this.f8813d != null && this.f8813d.m4967e() != 0) {
                C3112b m4969c = this.f8813d.m4969c();
                this.f8813d.removeChild(m4969c);
                super.addChild(m4969c);
                m4969c.position().f2527y = C2862h.f9292E.get(numChildren() - 1).f2527y;
                m4969c.position().f2526x = C0892a.f2550A + C3566b.f11839a.f11762T;
            }
            m4981a(childIndexOf, true);
        }
        return removeChild;
    }

    /* renamed from: c */
    public C3112b m4969c() {
        return (C3112b) getChildAt(0);
    }

    /* renamed from: a */
    public void m4978a(C2676a c2676a) {
        this.f8812c = c2676a;
    }

    /* renamed from: b */
    public void m4970b(C2676a c2676a) {
        this.f8813d = c2676a;
    }

    /* renamed from: d */
    public C2676a m4968d() {
        return this.f8813d;
    }

    /* renamed from: a */
    public void m4982a(int i) {
        this.f8814e = i;
    }

    /* renamed from: e */
    public int m4967e() {
        return this.f8814e;
    }

    /* renamed from: f */
    public boolean m4966f() {
        return this.f8816g;
    }

    /* renamed from: a */
    public int m4983a(float f, float f2) {
        int i = (int) ((f - C2862h.f9292E.get(0).f2526x) / C2862h.f9297n);
        int i2 = -((int) ((f2 - C2862h.f9292E.get(0).f2527y) / C2862h.f9298o));
        if (i >= 0 && i <= C2862h.f9299p - 1 && i2 >= 0 && i2 <= C2862h.f9300q - 1) {
            int i3 = (i2 * C2862h.f9299p) + i;
            int i4 = C2862h.f9296m;
            return i3 <= i4 ? i3 : i4;
        }
        return -1;
    }

    /* renamed from: a */
    public void m4976a(ArrayList<C3112b> arrayList) {
        children().clear();
        int m4967e = C2862h.f9296m * m4967e();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = m4967e; i2 < C2862h.f9296m + m4967e; i2++) {
            if (i2 < size) {
                C3112b c3112b = arrayList.get(i2);
                c3112b.parent(this);
                children().add(c3112b);
                m4971b(c3112b, i, false);
                i++;
            }
        }
    }

    /* renamed from: a */
    public void m4975a(ArrayList<C3112b> arrayList, Runnable runnable) {
        Iterator<C0975i> it = children().iterator();
        C1017d c1017d = null;
        while (it.hasNext()) {
            final C0975i next = it.next();
            if (next instanceof C3112b) {
                c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.a.2
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2676a.this.children().remove(next);
                    }
                };
                c1017d.mo10301f(next.position().f2526x + C0892a.f2553D);
                C1014c.m10326a(next);
                C1014c.m10325a(next, 500, c1017d);
            }
            c1017d = c1017d;
        }
        int numChildren = numChildren();
        int i = 0;
        while (i < numChildren) {
            C3112b c3112b = arrayList.get((C2862h.f9296m * m4967e()) + i);
            Number3d number3d = C2862h.f9292E.get(i);
            C1017d c1017d2 = new C1017d();
            c1017d2.mo10301f(number3d.f2526x);
            c1017d2.mo10298h(number3d.f2527y);
            if (!children().contains(c3112b)) {
                ((C2676a) c3112b.parent()).children().remove(c3112b);
                c3112b.parent(null);
                m4980a(c3112b);
                c3112b.position().f2526x = number3d.f2526x + C0892a.f2553D;
                c3112b.position().f2527y = number3d.f2527y;
            }
            C1014c.m10326a(c3112b);
            C1014c.m10325a(c3112b, 500, c1017d2);
            i++;
            c1017d = c1017d2;
        }
        if (c1017d != null) {
            c1017d.m10311a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    public void m4965g() {
        this.f8815f.mo4781g(this);
    }

    /* renamed from: h */
    public void m4964h() {
        this.f8815f.mo4780h(this);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawEnd() {
        this.f8811b.mo4500a(this);
    }

    /* renamed from: a */
    public void m4984a(float f) {
        this.f8810a = f;
        if (this.f8815f != null) {
            this.f8815f.mo4793a(this, f);
        }
    }

    /* renamed from: i */
    public void m4963i() {
        if (this.f8813d != null) {
            this.f8813d.m4984a(this.f8810a + 1.0f);
        }
    }

    /* renamed from: j */
    public void m4962j() {
        if (this.f8812c != null) {
            this.f8812c.m4984a(this.f8810a - 1.0f);
        }
    }

    /* renamed from: u */
    private void m4954u() {
        if (this.f8813d != null) {
            if (this.f8810a < 0.0f) {
                this.f8813d.m4984a(this.f8810a + 1.0f);
                this.f8813d.m4974a(true);
                return;
            }
            this.f8813d.m4974a(false);
        }
    }

    /* renamed from: v */
    private void m4953v() {
        if (this.f8812c != null) {
            if (this.f8810a > 0.0f) {
                this.f8812c.m4984a(this.f8810a - 1.0f);
                this.f8812c.m4974a(true);
                return;
            }
            this.f8812c.m4974a(false);
        }
    }

    /* renamed from: b */
    public void m4972b(float f) {
        m4984a(f);
        if (this.f8810a < 0.0f) {
            if (this.f8813d != null) {
                this.f8813d.m4984a(f + 1.0f);
                this.f8813d.m4954u();
                this.f8813d.m4974a(true);
            }
            if (this.f8812c != null) {
                this.f8812c.m4974a(false);
            }
        } else if (this.f8810a > 0.0f) {
            if (this.f8812c != null) {
                this.f8812c.m4984a(f - 1.0f);
                this.f8812c.m4953v();
                this.f8812c.m4974a(true);
            }
            if (this.f8813d != null) {
                this.f8813d.m4974a(false);
            }
        } else {
            if (this.f8813d != null) {
                this.f8813d.m4974a(false);
            }
            if (this.f8812c != null) {
                this.f8812c.m4974a(false);
            }
        }
    }

    /* renamed from: k */
    public void m4961k() {
        this.f8815f.mo4793a(this, 0.0f);
        this.f8815f.mo4783e(this);
    }

    /* renamed from: l */
    public void m4960l() {
        m4961k();
    }

    /* renamed from: m */
    public void m4959m() {
        this.f8815f.mo4785c(this);
    }

    /* renamed from: n */
    public void m4958n() {
        this.f8815f.mo4784d(this);
    }

    /* renamed from: o */
    public void m4957o() {
        this.f8816g = false;
        this.f8815f.mo4783e(this);
    }

    /* renamed from: p */
    public void m4956p() {
        this.f8816g = true;
        this.f8815f.mo4782f(this);
    }

    /* renamed from: a */
    private void m4981a(int i, boolean z) {
        int numChildren = numChildren();
        while (i < numChildren) {
            m4971b(getChildAt(i), i, z);
            i++;
        }
    }

    /* renamed from: b */
    private void m4971b(C0975i c0975i, int i, boolean z) {
        if (this.f8816g && z) {
            c0975i.setAnimationObjectState(true);
            return;
        }
        Number3d number3d = C2862h.f9292E.get(i);
        c0975i.position().f2526x = number3d.f2526x;
        c0975i.position().f2527y = number3d.f2527y;
        c0975i.scale().setAll(1.0f, 1.0f, 1.0f);
        c0975i.setAnimationObjectState(false);
    }

    /* renamed from: q */
    public void m4955q() {
        Number3d number3d;
        int numChildren = numChildren();
        for (int i = 0; i < numChildren; i++) {
            C0975i childAt = getChildAt(i);
            if (childAt.getAnimationObjectState()) {
                int size = C2862h.f9292E.size();
                if (i > size - 1) {
                    number3d = C2862h.f9292E.get(size - 1);
                } else {
                    number3d = C2862h.f9292E.get(i);
                }
                childAt.position().f2526x = number3d.f2526x;
                childAt.position().f2527y = number3d.f2527y;
                childAt.setAnimationObjectState(false);
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        Number3d number3d;
        int numChildren = numChildren();
        for (int i = 0; i < numChildren; i++) {
            C0975i childAt = getChildAt(i);
            if (childAt.getAnimationObjectState()) {
                int size = C2862h.f9292E.size();
                if (i > size - 1) {
                    number3d = C2862h.f9292E.get(size - 1);
                } else {
                    number3d = C2862h.f9292E.get(i);
                }
                childAt.position().f2526x += (number3d.f2526x - childAt.position().f2526x) * 0.11f;
                childAt.position().f2527y += (number3d.f2527y - childAt.position().f2527y) * 0.11f;
                if (Math.abs(childAt.position().f2526x - number3d.f2526x) < 0.1f && Math.abs(childAt.position().f2527y - number3d.f2527y) < 0.1f) {
                    childAt.position().f2526x = number3d.f2526x;
                    childAt.position().f2527y = number3d.f2527y;
                    childAt.setAnimationObjectState(false);
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int numChildren = numChildren();
                while (true) {
                    numChildren--;
                    if (numChildren <= -1) {
                        break;
                    }
                    C0975i childAt = getChildAt(numChildren);
                    onDrawChildStart(childAt);
                    childAt.dispatchDraw();
                    onDrawChildEnd(childAt);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
