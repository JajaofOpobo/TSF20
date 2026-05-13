package com.tsf.shell.p096f.p131f.p132a.p133a.p134a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0908c;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p131f.p132a.p133a.C2680a;
import com.tsf.shell.p096f.p131f.p132a.p133a.C2695c;
import com.tsf.shell.p096f.p131f.p132a.p133a.p135b.C2693b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.a.a.c */
/* loaded from: classes.dex */
public class C2684c extends C0908c {

    /* renamed from: a */
    private C2695c f8834a;

    /* renamed from: b */
    private C2693b f8835b;

    /* renamed from: f */
    private float f8839f;

    /* renamed from: g */
    private float f8840g;

    /* renamed from: h */
    private float f8841h;

    /* renamed from: k */
    private int f8844k;

    /* renamed from: n */
    private float f8847n;

    /* renamed from: i */
    private float f8842i = C0892a.m10742a(20.0f);

    /* renamed from: j */
    private float f8843j = C0892a.m10742a(20.0f);

    /* renamed from: l */
    private boolean f8845l = false;

    /* renamed from: m */
    private boolean f8846m = false;

    /* renamed from: e */
    private float f8838e = C0892a.m10742a(50.0f);

    /* renamed from: c */
    private C0980j f8836c = new C0980j();

    /* renamed from: d */
    private C2680a f8837d = new C2680a();

    public C2684c(C2695c c2695c) {
        this.f8834a = c2695c;
        this.f8837d.position().f2527y = -this.f8838e;
        this.f8837d.m4951a(C3566b.f11839a.f11762T, C3566b.f11839a.f11763U);
        this.f8836c.addChild(this.f8837d);
        addChild(this.f8836c);
    }

    /* renamed from: h */
    public C2695c m4935h() {
        return this.f8834a;
    }

    /* renamed from: i */
    public C0980j m4934i() {
        return this.f8836c;
    }

    /* renamed from: a */
    public void m4941a(C2693b c2693b) {
        this.f8835b = c2693b;
        PositionNumber3d position = c2693b.position();
        float f = (((-C2693b.f8867a) / 2) - this.f8842i) - this.f8838e;
        this.f8839f = f;
        position.f2527y = f;
        this.f8836c.addChild(c2693b);
    }

    /* renamed from: g */
    private void m4936g() {
        m10627a(m10629a(), 0);
        if (m10621b() != m10621b() && parent() != null && (parent() instanceof C0908c)) {
            ((C0908c) parent()).mo4847d();
        }
    }

    /* renamed from: a */
    public void m4940a(C3222g c3222g) {
        this.f8837d.addChild(c3222g);
        m4936g();
    }

    /* renamed from: a */
    public void m4939a(ArrayList<C3222g> arrayList) {
        Iterator<C3222g> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f8837d.addChild(it.next());
        }
        m4936g();
    }

    /* renamed from: b */
    public void m4938b(C3222g c3222g) {
        this.f8837d.removeChild(c3222g);
        m4936g();
        if (this.f8837d.numChildren() == 0) {
            this.f8834a.m4889a(this);
            this.f8835b.m4900b().removeFromParent();
        }
    }

    /* renamed from: c */
    public boolean m4937c(C3222g c3222g) {
        return this.f8837d.children().contains(c3222g);
    }

    /* renamed from: j */
    public void m4933j() {
        while (!this.f8837d.children().isEmpty()) {
            this.f8837d.removeChildAt(this.f8837d.numChildren() - 1);
        }
    }

    /* renamed from: k */
    public int m4932k() {
        return this.f8837d.m4952a();
    }

    /* renamed from: l */
    public C0975i m4931l() {
        return this.f8835b.m4900b();
    }

    /* renamed from: m */
    public C0975i m4930m() {
        Number3d.TEMPNUMBER3D.reset();
        C0975i m4900b = this.f8835b.m4900b();
        if (m4900b.parent() == this.f8835b) {
            m4900b.localToGlobal(Number3d.TEMPNUMBER3D);
            m4900b.removeFromParent();
            m4900b.position().setAllFrom(Number3d.TEMPNUMBER3D);
        } else {
            m4900b.removeFromParent();
        }
        return m4900b;
    }

    /* renamed from: n */
    public void m4929n() {
        C0975i m4900b = this.f8835b.m4900b();
        Number3d.TEMPNUMBER3D.setAllFrom(m4900b.position());
        this.f8835b.globalToLocal(Number3d.TEMPNUMBER3D);
        m4900b.removeFromParent();
        this.f8835b.addChild(m4900b);
        m4900b.position().setAllFrom(Number3d.TEMPNUMBER3D);
    }

    /* renamed from: o */
    public void m4928o() {
        this.f8845l = true;
        this.f8846m = true;
    }

    /* renamed from: p */
    public void m4927p() {
        this.f8845l = false;
    }

    /* renamed from: e */
    public void mo4843e() {
        this.f8846m = true;
        this.f8835b.m4898d();
        this.f8837d.alpha(0.0f);
        this.f8837d.position().f2527y = (-this.f8838e) - C2695c.f8876a;
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        c1017d.mo10298h(-this.f8838e);
        c1017d.m10313a(C0986a.f2959n);
        C1014c.m10326a(this.f8837d);
        C1014c.m10325a(this.f8837d, 750, c1017d);
    }

    /* renamed from: a */
    public void mo4845a(int i, boolean z) {
        this.f8844k = i;
        if (this.f8835b != null) {
            float m4925r = m4925r();
            C1014c.m10326a(this.f8835b);
            if (z) {
                C1017d c1017d = new C1017d();
                c1017d.mo10301f(m4925r);
                c1017d.m10313a(C0986a.f2959n);
                C1014c.m10325a(this.f8835b, 500, c1017d);
            } else {
                this.f8835b.position().f2526x = m4925r;
            }
        }
        float m4921v = m4921v();
        C1014c.m10326a(this.f8837d);
        if (z) {
            C1017d c1017d2 = new C1017d();
            c1017d2.mo10301f(m4921v);
            c1017d2.m10313a(C0986a.f2959n);
            C1014c.m10325a(this.f8837d, 500, c1017d2);
            return;
        }
        this.f8837d.position().f2526x = m4921v;
    }

    /* renamed from: q */
    public int m4926q() {
        return this.f8844k;
    }

    /* renamed from: r */
    public float m4925r() {
        float a = m10629a();
        if (this.f8844k == C2695c.f8877b) {
            return ((-a) / 2.0f) + (C2693b.f8867a / 2);
        }
        return (a / 2.0f) - (C2693b.f8867a / 2);
    }

    /* renamed from: v */
    private float m4921v() {
        float a = m10629a();
        if (this.f8844k == C2695c.f8877b) {
            return ((-a) / 2.0f) + C2693b.f8867a + this.f8843j;
        }
        return ((-a) / 2.0f) + this.f8843j;
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        this.f8835b.position().f2526x = m4925r();
        this.f8837d.position().f2526x = m4921v();
        this.f8837d.onMeasure((int) ((i - C2693b.f8867a) - this.f8843j), 0);
        int maxY = (int) ((this.f8837d.maxY() - this.f8837d.minY()) + this.f8838e + this.f8838e);
        this.f8840g = (-maxY) + this.f8838e;
        this.f8841h = this.f8839f - this.f8840g;
        m10615d(maxY);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        float f;
        super.onDrawStart();
        float m4922u = m4922u();
        if (this.f8846m) {
            float m4899c = this.f8835b.m4899c();
            if (this.f8845l) {
                f = 0.0f;
            } else {
                f = this.f8841h + m4922u;
            }
            if (Math.abs(f - m4899c) < 0.1f) {
                this.f8835b.m4904a(f);
                if (!this.f8845l) {
                    this.f8846m = false;
                }
            } else {
                this.f8835b.m4904a(((f - m4899c) * 0.2f) + m4899c);
            }
        } else {
            this.f8835b.m4904a(this.f8841h + m4922u);
        }
        this.f8835b.position().f2527y = m4922u + this.f8839f;
        if (this.f8835b.position().f2527y < this.f8840g) {
            this.f8835b.position().f2527y = this.f8840g;
        }
    }

    /* renamed from: s */
    public float m4924s() {
        Number3d.TEMPNUMBER3D.reset();
        localToGlobal(Number3d.TEMPNUMBER3D);
        this.f8847n = Number3d.TEMPNUMBER3D.f2527y;
        return this.f8835b.position().f2527y + this.f8847n;
    }

    /* renamed from: t */
    public float m4923t() {
        return this.f8835b.position().f2526x;
    }

    /* renamed from: u */
    public float m4922u() {
        Number3d.TEMPNUMBER3D.reset();
        localToGlobal(Number3d.TEMPNUMBER3D);
        this.f8847n = Number3d.TEMPNUMBER3D.f2527y;
        float f = Number3d.TEMPNUMBER3D.f2527y + this.f8839f + (C2693b.f8867a / 2);
        if (f <= C0892a.f2551B) {
            return 0.0f;
        }
        return C0892a.f2551B - f;
    }

    /* renamed from: f */
    public void mo4842f() {
        this.f8835b.position().f2527y = this.f8839f;
    }
}
