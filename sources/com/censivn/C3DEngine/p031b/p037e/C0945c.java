package com.censivn.C3DEngine.p031b.p037e;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.C2617i;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.censivn.C3DEngine.b.e.c */
/* loaded from: classes.dex */
public class C0945c extends C0980j implements C0915b.InterfaceC0918a, C0925e.InterfaceC0934a {

    /* renamed from: b */
    private C0984m f2760b;

    /* renamed from: c */
    private C0981k f2761c;

    /* renamed from: d */
    private AbstractC0951f f2762d;

    /* renamed from: e */
    private C2617i f2763e;

    /* renamed from: f */
    private C0949d f2764f;

    /* renamed from: h */
    private boolean f2766h;

    /* renamed from: g */
    private boolean f2765g = false;

    /* renamed from: i */
    private ArrayList<C0949d> f2767i = new ArrayList<>();

    /* renamed from: a */
    private C2617i f2759a = new C2617i();

    public C0945c() {
        this.f2759a.m5149b(1);
        this.f2760b = new C0984m();
        this.f2760b.m10347d(55);
        this.f2760b.m10355a("");
        this.f2760b.m10352b(1);
        this.f2760b.m10353b();
        this.f2760b.position().f2526x = (int) (((-C0892a.f2553D) / 2.0f) + (C0892a.m10742a(70.0f) / 2.0f));
        this.f2760b.position().f2527y = (-C0892a.m10742a(30.0f)) - this.f2760b.maxY();
        this.f2759a.addChild(this.f2760b);
        this.f2761c = new C0981k((int) (C0892a.f2553D - C0892a.m10742a(70.0f)), (int) C0892a.m10742a(7.0f), false);
        this.f2761c.setDefaultColor(new Color4(255, 255, 255, 150));
        this.f2761c.position().f2527y = (this.f2760b.position().f2527y + this.f2760b.minY()) - C0892a.m10742a(20.0f);
        this.f2759a.addChild(this.f2761c);
        addChild(this.f2759a);
        this.f2763e = new C2617i();
        this.f2763e.m5149b(1);
        addChild(this.f2763e);
    }

    /* renamed from: a */
    public void m10512a(AbstractC0951f abstractC0951f) {
        if (this.f2762d != null) {
            this.f2762d.removeFromParent();
            this.f2762d.mo538g();
        }
        this.f2762d = abstractC0951f;
        addChild(this.f2762d);
    }

    /* renamed from: i */
    private float m10504i() {
        return this.f2762d != null ? ((this.f2759a.position().f2527y + this.f2761c.position().f2527y) - (this.f2761c.mo10365c() / 2.0f)) - (this.f2762d.maxY() - this.f2762d.minY()) : (this.f2759a.position().f2527y + this.f2761c.position().f2527y) - (this.f2761c.mo10365c() / 2.0f);
    }

    /* renamed from: a */
    public void m10513a(C0949d c0949d) {
        c0949d.m10499a(this.f2767i.size());
        this.f2767i.add(c0949d);
    }

    /* renamed from: a */
    public void m10511a(String str) {
        this.f2760b.m10355a(str);
    }

    /* renamed from: a */
    public void m10516a(int i) {
        this.f2760b.m10355a(C4189x.m588c(i));
    }

    /* renamed from: a */
    public boolean m10517a() {
        return this.f2765g;
    }

    /* renamed from: b */
    public int mo861b() {
        return 0;
    }

    /* renamed from: b */
    public void m10510b(int i) {
        C0949d c0949d = this.f2767i.get(i);
        if (c0949d != this.f2764f) {
            m10508b(c0949d);
            c0949d.removeFromParent();
            c0949d.position().f2526x = 0.0f;
            this.f2763e.addChild(c0949d);
            if (this.f2764f != null) {
                c0949d.m10496a(false);
            } else {
                c0949d.m10496a(true);
            }
            this.f2764f = c0949d;
        }
    }

    /* renamed from: a */
    public void m10515a(int i, boolean z) {
        final C0949d c0949d = this.f2764f;
        m10510b(i);
        if (c0949d != null) {
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.e.c.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    c0949d.removeFromParent();
                }
            };
            if (z) {
                c1017d.mo10301f(-C0892a.f2553D);
            } else {
                c1017d.mo10301f(C0892a.f2553D);
            }
            C1014c.m10326a(c0949d);
            C1014c.m10325a(c0949d, 500, c1017d);
            if (z) {
                this.f2764f.position().f2526x = C0892a.f2553D;
            } else {
                this.f2764f.position().f2526x = -C0892a.f2553D;
            }
            C1017d c1017d2 = new C1017d();
            c1017d2.mo10301f(0.0f);
            C1014c.m10326a(this.f2764f);
            C1014c.m10325a(this.f2764f, 500, c1017d2);
        }
    }

    /* renamed from: c */
    public void mo836c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m10503j() {
        Iterator<C0949d> it = this.f2767i.iterator();
        while (it.hasNext()) {
            C0949d next = it.next();
            next.m10501a();
            next.removeFromParent();
        }
        mo836c();
        this.f2764f = null;
    }

    /* renamed from: b */
    private void m10508b(C0949d c0949d) {
        c0949d.m10500a(this.f2763e.position().f2527y - C0892a.f2552C);
    }

    /* renamed from: k */
    private void m10502k() {
        mo832h();
        this.f2760b.position().f2526x = (int) (((-C0892a.f2553D) / 2.0f) + (C0892a.m10742a(70.0f) / 2.0f));
        this.f2761c.mo10368a((int) (C0892a.f2553D - C0892a.m10742a(70.0f)));
        this.f2759a.position().f2527y = C0892a.f2551B;
        this.f2759a.m5152a(C0892a.f2553D, -(this.f2761c.position().f2527y - (this.f2761c.mo10365c() / 2.0f)));
        if (this.f2762d != null) {
            this.f2762d.position().f2527y = (this.f2759a.position().f2527y + this.f2761c.position().f2527y) - (this.f2761c.mo10365c() / 2.0f);
            this.f2762d.m10627a((int) (C0892a.f2553D - C0892a.m10742a(70.0f)), 0);
        }
        this.f2763e.position().f2527y = m10504i();
        this.f2763e.m5152a(C0892a.f2553D, C0892a.f2554E);
        Iterator<C0949d> it = this.f2767i.iterator();
        while (it.hasNext()) {
            m10508b(it.next());
        }
    }

    /* renamed from: d */
    public void m10506d() {
        if (!this.f2765g) {
            m10502k();
            this.f2765g = true;
            m10510b(mo861b());
            C3359a.f11088b.m10565a(this);
            C0915b.m10597a(this);
            this.f2766h = C3359a.f11091e.m2260c();
            if (!this.f2766h) {
                C3359a.f11096j.m2226a((Runnable) null, 170);
            }
            C3359a.f11096j.m2232a(this);
            alpha(255.0f);
            this.f2761c.mo10368a(0.0f);
            final int m10742a = (int) (C0892a.f2553D - C0892a.m10742a(70.0f));
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.e.c.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    C0945c.this.f2761c.mo10368a(m10742a * f);
                }
            };
            C1014c.m10326a(this.f2761c);
            C1014c.m10325a(this.f2761c, 500, c1017d);
            this.f2760b.position().f2527y = -C0892a.m10742a(150.0f);
            C1017d c1017d2 = new C1017d();
            c1017d2.mo10298h((-C0892a.m10742a(30.0f)) - this.f2760b.maxY());
            c1017d2.m10309b(300);
            c1017d2.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.f2760b);
            C1014c.m10325a(this.f2760b, 500, c1017d2);
            mo553f();
        }
    }

    /* renamed from: e */
    public void m10505e() {
        if (this.f2765g) {
            this.f2765g = false;
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.e.c.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C0945c.this.mo552g();
                    C3359a.f11088b.m10557b(C0945c.this);
                    C0915b.m10594b(C0945c.this);
                    C3359a.f11096j.m2223b(C0945c.this);
                    C0945c.this.m10503j();
                    C0945c.this.f2760b.m10358a();
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this);
            C1014c.m10325a(this, 300, c1017d);
            if (!this.f2766h) {
                C3359a.f11096j.m2218d();
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m10505e();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        m10502k();
    }

    /* renamed from: f */
    public void mo553f() {
    }

    /* renamed from: g */
    public void mo552g() {
    }

    /* renamed from: h */
    public void mo832h() {
    }
}
