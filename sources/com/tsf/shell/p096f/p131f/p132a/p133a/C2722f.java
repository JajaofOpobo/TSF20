package com.tsf.shell.p096f.p131f.p132a.p133a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0971e;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p118e.C2502d;
import com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.a.f */
/* loaded from: classes.dex */
public class C2722f {

    /* renamed from: a */
    public static final float f8944a = C0892a.m10742a(150.0f);

    /* renamed from: b */
    private C2695c f8945b;

    /* renamed from: d */
    private C0980j f8947d;

    /* renamed from: e */
    private ArrayList<C2727a> f8948e;

    /* renamed from: f */
    private C2502d<C2727a> f8949f;

    /* renamed from: g */
    private boolean f8950g = false;

    /* renamed from: j */
    private int f8953j = -1;

    /* renamed from: k */
    private int f8954k = -1;

    /* renamed from: l */
    private float f8955l = 0.0f;

    /* renamed from: m */
    private float f8956m = 0.0f;

    /* renamed from: n */
    private float f8957n = 0.0f;

    /* renamed from: c */
    private C0980j f8946c = new C0980j() { // from class: com.tsf.shell.f.f.a.a.f.1
    };

    /* renamed from: i */
    private ArrayList<C2684c> f8952i = new ArrayList<>();

    /* renamed from: h */
    private C0971e f8951h = new C0971e(0.0f, 0.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.f.a.a.f$a */
    /* loaded from: classes.dex */
    public class C2727a {

        /* renamed from: a */
        public Number3d f8962a;

        /* renamed from: b */
        public Number3d f8963b = new Number3d();

        /* renamed from: c */
        public Number3d f8964c = new Number3d();

        /* renamed from: d */
        public float f8965d = 1.0f;

        C2727a() {
        }
    }

    public C2722f(C2695c c2695c) {
        this.f8945b = c2695c;
        this.f8951h.alpha(0.0f);
        this.f8947d = new C0980j() { // from class: com.tsf.shell.f.f.a.a.f.2
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                int numChildren = numChildren();
                C2722f.this.m4817j();
                for (int i = 0; i < numChildren; i++) {
                    C0975i childAt = getChildAt(i);
                    if (childAt.getAnimationObjectState()) {
                        C2727a c2727a = (C2727a) C2722f.this.f8948e.get(i);
                        Number3d number3d = c2727a.f8962a;
                        if (!C2722f.this.f8950g) {
                            C2684c c2684c = (C2684c) childAt.getTag();
                            number3d.f2526x = c2684c.m4923t();
                            number3d.f2527y = c2684c.m4924s();
                            c2727a.f8965d = 1.0f;
                        }
                        childAt.position().f2526x += (number3d.f2526x - childAt.position().f2526x) * 0.26f;
                        childAt.position().f2527y += (number3d.f2527y - childAt.position().f2527y) * 0.26f;
                        childAt.scale().f2526x += (c2727a.f8965d - childAt.scale().f2526x) * 0.26f;
                        childAt.scale().f2527y = childAt.scale().f2526x;
                        if (Math.abs(childAt.position().f2526x - number3d.f2526x) < 0.2f && Math.abs(childAt.position().f2527y - number3d.f2527y) < 0.2f && Math.abs(childAt.scale().f2526x - c2727a.f8965d) < 0.01f) {
                            childAt.setAnimationObjectState(false);
                            if (!C2722f.this.f8950g) {
                                C2722f.this.f8952i.add((C2684c) childAt.getTag());
                            }
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                Iterator it = C2722f.this.f8952i.iterator();
                while (it.hasNext()) {
                    ((C2684c) it.next()).m4929n();
                }
                C2722f.this.f8952i.clear();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
            public boolean removeChild(C0975i c0975i) {
                boolean removeChild = super.removeChild(c0975i);
                if (numChildren() == 0) {
                    C2722f.this.m4818i();
                }
                return removeChild;
            }
        };
        this.f8946c.addChild(this.f8951h);
        this.f8946c.addChild(this.f8947d);
        this.f8948e = new ArrayList<>();
        this.f8949f = new C2502d<C2727a>() { // from class: com.tsf.shell.f.f.a.a.f.3
            @Override // com.tsf.shell.p096f.p118e.C2502d
            /* renamed from: a */
            public C2727a mo718b() {
                return new C2727a();
            }
        };
    }

    /* renamed from: g */
    private void m4820g() {
        if (this.f8945b.m4877b() == C2695c.f8877b) {
            this.f8951h.m10377a(-1442840576, 855638016);
        } else {
            this.f8951h.m10377a(855638016, -1442840576);
        }
        this.f8951h.visible(true);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f8951h);
        C1014c.m10325a(this.f8951h, 600, c1017d);
    }

    /* renamed from: h */
    private void m4819h() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.a.f.4
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2722f.this.f8951h.visible(false);
                C2722f.this.m4818i();
            }
        };
        c1017d.m10314a(0);
        C1014c.m10326a(this.f8951h);
        C1014c.m10325a(this.f8951h, 600, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m4818i() {
        if (!this.f8951h.visible() && this.f8947d.numChildren() == 0) {
            this.f8946c.removeFromParent();
        }
    }

    /* renamed from: a */
    public void m4834a() {
        this.f8951h.m10371b(C0892a.f2556G);
        this.f8951h.m10373a(C0892a.f2555F);
    }

    /* renamed from: a */
    public void m4832a(MotionEvent motionEvent) {
        m4833a(0.0f - (motionEvent.getY() - C0892a.f2558I));
    }

    /* renamed from: a */
    public void m4833a(float f) {
        int size = this.f8945b.m4861h().size();
        this.f8953j = (int) (((this.f8955l - f) + this.f8957n) / this.f8957n);
        if (this.f8953j < 0) {
            this.f8953j = -1;
        } else if (this.f8953j > size - 1) {
            this.f8953j = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m4817j() {
        if (this.f8950g && this.f8954k != this.f8953j) {
            ArrayList<C2684c> m4861h = this.f8945b.m4861h();
            if (this.f8954k != -1) {
                m4861h.get(this.f8954k).m4931l().setAnimationObjectState(true);
                C2727a c2727a = this.f8948e.get(this.f8954k);
                c2727a.f8962a = c2727a.f8963b;
                c2727a.f8965d = 0.5f;
            }
            this.f8954k = this.f8953j;
            if (this.f8954k != -1) {
                C2684c c2684c = m4861h.get(this.f8954k);
                if (this.f8954k == 0) {
                    this.f8945b.m4869d();
                } else {
                    this.f8945b.m4876b(c2684c);
                }
                c2684c.m4931l().setAnimationObjectState(true);
                C2727a c2727a2 = this.f8948e.get(this.f8954k);
                c2727a2.f8962a = c2727a2.f8964c;
                c2727a2.f8965d = 1.5f;
            }
        }
    }

    /* renamed from: b */
    public float m4830b() {
        return this.f8955l;
    }

    /* renamed from: c */
    public float m4828c() {
        return this.f8956m;
    }

    /* renamed from: d */
    public float m4826d() {
        float f;
        int size = this.f8945b.m4861h().size();
        float m10742a = C0892a.m10742a(50.0f);
        return (float) (Math.cos((3.141592653589793d - ((size - 1) * (Math.asin((m10742a / 2.0f) / f) * 2.0d))) / 2.0d) * C0892a.f2551B * 2);
    }

    /* renamed from: e */
    public void m4824e() {
        m4820g();
        int m4877b = this.f8945b.m4877b();
        this.f8950g = true;
        this.f8953j = -1;
        this.f8954k = -1;
        this.f8947d.setAnimationObjectState(true);
        Iterator<C2727a> it = this.f8948e.iterator();
        while (it.hasNext()) {
            this.f8949f.m5384a(it.next());
        }
        this.f8948e.clear();
        ArrayList<C2684c> m4861h = this.f8945b.m4861h();
        int size = m4861h.size();
        float m10742a = C0892a.m10742a(50.0f);
        float f = C0892a.f2551B * 2;
        double asin = Math.asin((m10742a / 2.0f) / f) * 2.0d;
        double d = (3.141592653589793d - ((size - 1) * asin)) / 2.0d;
        float sin = ((float) (Math.sin(d) * f)) - C0892a.m10742a(50.0f);
        this.f8955l = 0.0f;
        this.f8956m = 0.0f;
        double d2 = d;
        for (int i = 0; i < size; i++) {
            C2684c c2684c = m4861h.get(i);
            C0975i m4930m = c2684c.m4930m();
            C2727a m5383c = this.f8949f.m5383c();
            m5383c.f8963b.f2526x = (((float) (Math.sin(d2) * f)) - sin) + C0892a.f2590z;
            if (m4877b == C2695c.f8878c) {
                m5383c.f8963b.f2526x = -m5383c.f8963b.f2526x;
            }
            m5383c.f8963b.f2527y = (float) (Math.cos(d2) * f);
            if (m4877b == C2695c.f8878c) {
                m5383c.f8964c.f2526x = m5383c.f8963b.f2526x - f8944a;
            } else {
                m5383c.f8964c.f2526x = m5383c.f8963b.f2526x + f8944a;
            }
            m5383c.f8964c.f2527y = m5383c.f8963b.f2527y;
            if (i == 0) {
                this.f8955l = m5383c.f8963b.f2527y;
            } else if (i == size - 1) {
                this.f8956m = m5383c.f8963b.f2527y;
            }
            m5383c.f8962a = m5383c.f8963b;
            m5383c.f8965d = 0.5f;
            this.f8948e.add(m5383c);
            m4930m.setAnimationObjectState(true);
            d2 += asin;
            this.f8947d.addChild(m4930m);
            c2684c.m4928o();
        }
        this.f8957n = (this.f8955l - this.f8956m) / (size - 1);
        this.f8946c.removeFromParent();
        this.f8945b.m4872c().addChild(this.f8946c);
    }

    /* renamed from: f */
    public void m4822f() {
        m4819h();
        this.f8950g = false;
        this.f8947d.setAnimationObjectState(false);
        Iterator<C2684c> it = this.f8945b.m4861h().iterator();
        while (it.hasNext()) {
            C2684c next = it.next();
            next.m4931l().setAnimationObjectState(true);
            next.m4927p();
        }
    }
}
