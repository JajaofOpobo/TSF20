package com.tsf.shell.p096f.p131f.p132a.p136b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.p030a.C0863c;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p131f.p132a.C2676a;
import com.tsf.shell.p096f.p153i.C3112b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.b.m */
/* loaded from: classes.dex */
public abstract class AbstractC2747m extends AbstractC2745k {

    /* renamed from: a */
    private static int f8990a = 1;

    /* renamed from: b */
    private static int f8991b = 2;

    /* renamed from: c */
    private static int f8992c = 3;

    /* renamed from: d */
    private int f8993d;

    /* renamed from: e */
    private int f8994e;

    /* renamed from: f */
    private float f8995f;

    /* renamed from: g */
    private ArrayList<C2752b> f8996g;

    /* renamed from: h */
    private ArrayList<Number3d> f8997h;

    /* renamed from: i */
    private Number3d f8998i;

    /* renamed from: j */
    private C2751a f8999j;

    /* renamed from: k */
    private ArrayList<C0975i> f9000k;

    /* renamed from: l */
    private boolean f9001l;

    /* renamed from: a */
    public abstract void mo4797a(int i, int i2, int i3, int i4, float f, ArrayList<Number3d> arrayList);

    public AbstractC2747m(int i, int i2, boolean z) {
        super(i, i2, z);
        this.f9001l = true;
        this.f8998i = new Number3d();
        this.f8999j = new C2751a();
        this.f9000k = new ArrayList<>();
        this.f8996g = new ArrayList<>();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: a */
    public void mo4796a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
        this.f8993d = i;
        this.f8997h = arrayList;
        this.f8994e = arrayList.size();
        this.f8995f = this.f8993d * 0.55f;
        mo4797a(i, i2, i3, i4, this.f8995f, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4792a(C2676a c2676a, int i) {
        c2676a.m4771b(i);
    }

    /* renamed from: b */
    private void m4787b(C2676a c2676a, int i) {
        c2676a.m4769c(i);
    }

    /* renamed from: a */
    private void m4791a(C2676a c2676a, boolean z) {
        c2676a.m4770b(z);
    }

    /* renamed from: i */
    private int m4779i(C2676a c2676a) {
        return c2676a.m4768r();
    }

    /* renamed from: j */
    private int m4778j(C2676a c2676a) {
        return c2676a.m4767s();
    }

    /* renamed from: k */
    private boolean m4777k(C2676a c2676a) {
        return c2676a.m4766t();
    }

    /* renamed from: a */
    public C2752b m4798a(int i) {
        C2752b c2752b;
        if (i < this.f8996g.size()) {
            c2752b = this.f8996g.get(i);
        } else {
            c2752b = new C2752b();
            this.f8996g.add(c2752b);
        }
        c2752b.m4772a();
        return c2752b;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: a */
    public void mo4794a(C2676a c2676a) {
        int numChildren = c2676a.numChildren();
        c2676a.renderChildren(true);
        for (int i = 0; i < numChildren; i++) {
            C3112b c3112b = (C3112b) c2676a.getChildAt(i);
            Number3d number3d = this.f8997h.get(i);
            c3112b.position().f2526x = number3d.f2526x;
            c3112b.position().f2527y = number3d.f2527y;
            c3112b.position().f2528z = number3d.f2528z;
            c3112b.rotation().f2526x = 0.0f;
            c3112b.rotation().f2527y = 0.0f;
            c3112b.rotation().f2528z = 0.0f;
            c3112b.doubleSidedEnabled(false);
        }
        c2676a.position().f2528z = 0.0f;
        c2676a.rotation().f2527y = 0.0f;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: a */
    public void mo4793a(C2676a c2676a, float f) {
        float f2;
        float f3;
        float abs = Math.abs(f);
        int numChildren = c2676a.numChildren();
        c2676a.rotation().f2527y = 180.0f * f;
        if (numChildren != 0) {
            if (f == 0.0f && !c2676a.m4966f()) {
                m4775m(c2676a);
                return;
            }
            if (m4778j(c2676a) == f8991b && !c2676a.m4966f()) {
                m4776l(c2676a);
            }
            if (abs < 0.2d && m4777k(c2676a)) {
                m4774n(c2676a);
            }
            for (int i = 0; i < numChildren; i++) {
                C3112b c3112b = (C3112b) c2676a.getChildAt(i);
                if (abs > 0.8d) {
                    f2 = (1.0f - abs) / 0.2f;
                } else {
                    f2 = 1.0f;
                }
                float f4 = c2676a.rotation().f2527y + c3112b.rotation().f2527y;
                if (f4 < -180.0f) {
                    f4 += 360.0f;
                } else if (f4 > 180.0f) {
                    f4 -= 360.0f;
                }
                float abs2 = Math.abs(f4);
                this.f8998i.reset();
                this.f8998i.setAllFrom(c3112b.position());
                this.f8998i.rotateAll(c2676a.rotation());
                c3112b.setTag(Float.valueOf(this.f8998i.f2528z));
                if (abs2 > 90.0f) {
                    f3 = (180.0f - abs2) / 90.0f;
                } else {
                    f3 = 1.0f;
                }
                c3112b.doubleSidedEnabled(true);
                c3112b.alpha((int) (f2 * ((f3 * 0.5f) + 0.5f) * 255.0f));
            }
        }
    }

    /* renamed from: com.tsf.shell.f.f.a.b.m$a */
    /* loaded from: classes.dex */
    public class C2751a implements Comparator<C0975i> {
        public C2751a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C0975i c0975i, C0975i c0975i2) {
            if (c0975i.getTag() == null || c0975i2.getTag() == null) {
                return 0;
            }
            float floatValue = ((Float) c0975i.getTag()).floatValue();
            float floatValue2 = ((Float) c0975i2.getTag()).floatValue();
            if (floatValue == floatValue2) {
                return 0;
            }
            return floatValue > floatValue2 ? 1 : -1;
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: b */
    public void mo4788b(C2676a c2676a) {
        c2676a.renderChildren(false);
        m4792a(c2676a, f8992c);
        m4787b(c2676a, f8991b);
        m4791a(c2676a, false);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: c */
    public void mo4785c(C2676a c2676a) {
        m4786b(c2676a, true);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: d */
    public void mo4784d(C2676a c2676a) {
        m4791a(c2676a, true);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: e */
    public void mo4783e(C2676a c2676a) {
        m4775m(c2676a);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: f */
    public void mo4782f(C2676a c2676a) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: a */
    public void mo4795a(C0980j c0980j) {
        Iterator<C0975i> it = c0980j.children().iterator();
        while (it.hasNext()) {
            C0980j c0980j2 = (C0980j) it.next();
            if (c0980j2.visible()) {
                ArrayList<C0975i> children = c0980j2.children();
                int size = children.size() - 1;
                while (true) {
                    int i = size;
                    if (i > -1) {
                        this.f9000k.add(children.get(i));
                        size = i - 1;
                    }
                }
            }
        }
        if (!this.f9001l) {
            Collections.sort(this.f9000k, this.f8999j);
        }
        C0980j m4483aA = C3359a.f11094h.m4019t().m4483aA();
        MatrixStack.glPushMatrix();
        MatrixStack.glTranslatef(0.0f, 0.0f, -this.f8995f);
        MatrixStack.glRotatef(m4483aA.rotation().f2526x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glTranslatef(0.0f, 0.0f, this.f8995f);
        Iterator<C0975i> it2 = this.f9000k.iterator();
        while (it2.hasNext()) {
            C0975i next = it2.next();
            C0975i c0975i = (C0975i) next.parent();
            MatrixStack.glPushMatrix();
            MatrixStack.glTranslatef(c0975i.position().f2526x, c0975i.position().f2527y, c0975i.position().f2528z);
            MatrixStack.glRotatef(c0975i.rotation().f2527y, 0.0f, 1.0f, 0.0f);
            if (next.visible()) {
                C0980j c0980j3 = (C0980j) next;
                MatrixStack.glPushMatrix();
                c0980j3.onDrawStart();
                c0980j3.drawShader();
                MatrixStack.glTranslatef(c0980j3.position().f2526x, c0980j3.position().f2527y, c0980j3.position().f2528z);
                MatrixStack.glRotatef(c0980j3.rotation().f2527y, 0.0f, 1.0f, 0.0f);
                MatrixStack.glRotatef(c0980j3.rotation().f2526x, 1.0f, 0.0f, 0.0f);
                MatrixStack.glRotatef(c0980j3.rotation().f2528z, 0.0f, 0.0f, 1.0f);
                MatrixStack.glScalef(c0980j3.scale().f2526x, c0980j3.scale().f2527y, c0980j3.scale().f2528z);
                C0863c.m10829a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
                System.arraycopy(MatrixStack.rMVPMatrix, 0, c0980j3.AABB_MATRIX, 0, 16);
                GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
                c0980j3.drawElement();
                MatrixStack.glColor(c0980j3.alpha(), c0980j3.getDefaultColor());
                c0980j3.onDrawChildStart();
                if (c0980j3.renderChildren()) {
                    int numChildren = c0980j3.numChildren();
                    for (int i2 = 0; i2 < numChildren; i2++) {
                        c0980j3.getChildAt(i2).dispatchDraw();
                    }
                }
                c0980j3.onDrawChildEnd();
                c0980j3.onDrawEnd();
                MatrixStack.glPopMatrix();
            }
            MatrixStack.glPopMatrix();
        }
        MatrixStack.glPopMatrix();
        this.f9000k.clear();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: g */
    public void mo4781g(C2676a c2676a) {
        if (m4779i(c2676a) != f8992c) {
            int numChildren = c2676a.numChildren();
            for (int i = 0; i < numChildren; i++) {
                C1014c.m10322b((C0980j) c2676a.getChildAt(i));
            }
            C1014c.m10322b(c2676a);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k
    /* renamed from: h */
    public void mo4780h(C2676a c2676a) {
        if (m4779i(c2676a) != f8992c) {
            int numChildren = c2676a.numChildren();
            for (int i = 0; i < numChildren; i++) {
                C1014c.m10319c((C0980j) c2676a.getChildAt(i));
            }
            C1014c.m10319c(c2676a);
        }
    }

    /* renamed from: b */
    private void m4786b(final C2676a c2676a, boolean z) {
        C2752b c2752b;
        C2752b c2752b2;
        this.f9001l = false;
        m4791a(c2676a, false);
        int numChildren = c2676a.numChildren();
        if (numChildren != 0) {
            if ((c2676a.getChildAt(0).rotation().f2526x != this.f8996g.get(0).f9013e || c2676a.getChildAt(0).rotation().f2527y != this.f8996g.get(0).f9012d || c2676a.getChildAt(0).rotation().f2528z != this.f8996g.get(0).f9014f || m4779i(c2676a) == f8991b) && m4779i(c2676a) != f8990a) {
                if (z) {
                    m4792a(c2676a, f8990a);
                    m4787b(c2676a, f8990a);
                    for (int i = 0; i < numChildren; i++) {
                        C0980j c0980j = (C0980j) c2676a.getChildAt(i);
                        if (i >= this.f8994e) {
                            c2752b2 = this.f8996g.get(this.f8994e - 1);
                        } else {
                            c2752b2 = this.f8996g.get(i);
                        }
                        C2752b c2752b3 = c2752b2;
                        C1017d c1017d = new C1017d();
                        c1017d.mo10301f(c2752b3.f9009a);
                        c1017d.mo10298h(c2752b3.f9010b);
                        c1017d.m10296j(c2752b3.f9011c);
                        c1017d.m10307c(c2752b3.f9013e);
                        c1017d.m10305d(c2752b3.f9012d);
                        c1017d.m10303e(c2752b3.f9014f);
                        C1014c.m10326a(c0980j);
                        C1014c.m10325a(c0980j, 250, c1017d);
                    }
                    C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.f.a.b.m.1
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            AbstractC2747m.this.m4792a(c2676a, AbstractC2747m.f8992c);
                        }
                    };
                    c1017d2.m10296j(-this.f8995f);
                    C1014c.m10326a(c2676a);
                    C1014c.m10325a(c2676a, 250, c1017d2);
                    return;
                }
                for (int i2 = 0; i2 < numChildren; i2++) {
                    C0980j c0980j2 = (C0980j) c2676a.getChildAt(i2);
                    if (i2 >= this.f8994e) {
                        c2752b = this.f8996g.get(this.f8994e - 1);
                    } else {
                        c2752b = this.f8996g.get(i2);
                    }
                    C2752b c2752b4 = c2752b;
                    C1014c.m10326a(c0980j2);
                    c0980j2.position().f2526x = c2752b4.f9009a;
                    c0980j2.position().f2527y = c2752b4.f9010b;
                    c0980j2.position().f2528z = c2752b4.f9011c;
                    c0980j2.rotation().f2526x = c2752b4.f9013e;
                    c0980j2.rotation().f2527y = c2752b4.f9012d;
                    c0980j2.rotation().f2528z = c2752b4.f9014f;
                }
                C1017d c1017d3 = new C1017d() { // from class: com.tsf.shell.f.f.a.b.m.2
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        AbstractC2747m.this.m4792a(c2676a, AbstractC2747m.f8992c);
                    }
                };
                c1017d3.m10296j(-this.f8995f);
                C1014c.m10326a(c2676a);
                C1014c.m10325a(c2676a, 250, c1017d3);
            }
        }
    }

    /* renamed from: l */
    private void m4776l(C2676a c2676a) {
        C2752b c2752b;
        this.f9001l = false;
        m4792a(c2676a, f8992c);
        m4787b(c2676a, f8990a);
        int numChildren = c2676a.numChildren();
        for (int i = 0; i < numChildren; i++) {
            C0980j c0980j = (C0980j) c2676a.getChildAt(i);
            if (i >= this.f8994e) {
                c2752b = this.f8996g.get(this.f8994e - 1);
            } else {
                c2752b = this.f8996g.get(i);
            }
            C2752b c2752b2 = c2752b;
            c0980j.position().f2526x = c2752b2.f9009a;
            c0980j.position().f2527y = c2752b2.f9010b;
            c0980j.position().f2528z = c2752b2.f9011c;
            c0980j.rotation().f2526x = c2752b2.f9013e;
            c0980j.rotation().f2527y = c2752b2.f9012d;
            c0980j.rotation().f2528z = c2752b2.f9014f;
        }
        c2676a.position().f2528z = -this.f8995f;
    }

    /* renamed from: m */
    private void m4775m(C2676a c2676a) {
        Number3d number3d;
        this.f9001l = true;
        m4792a(c2676a, f8992c);
        m4787b(c2676a, f8991b);
        int numChildren = c2676a.numChildren();
        if (numChildren != 0) {
            for (int i = 0; i < numChildren; i++) {
                C3112b c3112b = (C3112b) c2676a.getChildAt(i);
                if (i >= this.f8994e) {
                    number3d = this.f8997h.get(this.f8994e - 1);
                } else {
                    number3d = this.f8997h.get(i);
                }
                Number3d number3d2 = number3d;
                c3112b.position().f2526x = number3d2.f2526x;
                c3112b.position().f2527y = number3d2.f2527y;
                c3112b.position().f2528z = number3d2.f2528z;
                c3112b.rotation().f2526x = 0.0f;
                c3112b.rotation().f2527y = 0.0f;
                c3112b.rotation().f2528z = 0.0f;
                c3112b.scale().f2526x = 1.0f;
                c3112b.scale().f2527y = 1.0f;
                c3112b.scale().f2528z = 1.0f;
                c3112b.alpha(255.0f);
                C1014c.m10326a(c3112b);
            }
            c2676a.position().f2528z = 0.0f;
            C1014c.m10326a(c2676a);
        }
    }

    /* renamed from: n */
    private void m4774n(final C2676a c2676a) {
        Number3d number3d;
        m4791a(c2676a, false);
        int numChildren = c2676a.numChildren();
        if ((c2676a.getChildAt(0).rotation().f2526x != 0.0f || c2676a.getChildAt(0).rotation().f2527y != 0.0f || c2676a.getChildAt(0).rotation().f2528z != 0.0f || m4779i(c2676a) == f8990a) && m4779i(c2676a) != f8991b) {
            m4792a(c2676a, f8991b);
            m4787b(c2676a, f8991b);
            for (int i = 0; i < numChildren; i++) {
                C0980j c0980j = (C0980j) c2676a.getChildAt(i);
                if (i >= this.f8994e) {
                    number3d = this.f8997h.get(this.f8994e - 1);
                } else {
                    number3d = this.f8997h.get(i);
                }
                Number3d number3d2 = number3d;
                C1017d c1017d = new C1017d();
                c1017d.mo10301f(number3d2.f2526x);
                c1017d.mo10298h(number3d2.f2527y);
                c1017d.m10296j(number3d2.f2528z);
                c1017d.m10307c(0.0f);
                c1017d.m10305d(0.0f);
                c1017d.m10303e(0.0f);
                C1014c.m10326a(c0980j);
                C1014c.m10325a(c0980j, 250, c1017d);
            }
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.f.a.b.m.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    AbstractC2747m.this.m4792a(c2676a, AbstractC2747m.f8992c);
                    AbstractC2747m.this.f9001l = true;
                }
            };
            c1017d2.m10296j(0.0f);
            C1014c.m10326a(c2676a);
            C1014c.m10325a(c2676a, 250, c1017d2);
        }
    }

    /* renamed from: com.tsf.shell.f.f.a.b.m$b */
    /* loaded from: classes.dex */
    public static class C2752b {

        /* renamed from: a */
        public float f9009a;

        /* renamed from: b */
        public float f9010b;

        /* renamed from: c */
        public float f9011c;

        /* renamed from: d */
        public float f9012d;

        /* renamed from: e */
        public float f9013e;

        /* renamed from: f */
        public float f9014f;

        /* renamed from: a */
        public void m4772a() {
            this.f9009a = 0.0f;
            this.f9010b = 0.0f;
            this.f9011c = 0.0f;
            this.f9013e = 0.0f;
            this.f9012d = 0.0f;
            this.f9014f = 0.0f;
        }
    }
}
