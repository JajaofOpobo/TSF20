package com.tsf.shell.manager.p187r.p189b.p192c;

import android.view.KeyEvent;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.tsf.shell.manager.p187r.p189b.p191b.C3644a;
import com.tsf.shell.manager.p187r.p189b.p192c.C3655b;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
/* renamed from: com.tsf.shell.manager.r.b.c.d */
/* loaded from: classes.dex */
public class C3667d extends C3644a implements C0915b.InterfaceC0918a {

    /* renamed from: a */
    private C3655b f12107a;

    /* renamed from: b */
    private C3663c f12108b;

    /* renamed from: e */
    private C3644a f12109e;

    public C3667d(AbstractC2593d abstractC2593d) {
        super(abstractC2593d);
        m1773g();
    }

    /* renamed from: g */
    private void m1773g() {
        this.f12107a = new C3655b(this.f12054d, this);
        this.f12108b = new C3663c(this.f12054d, this);
        this.f12053c.addChild(this.f12107a.m1818f());
        this.f12053c.addChild(this.f12108b.m1818f());
    }

    /* renamed from: a */
    public void m1776a(C3655b.C3661a c3661a) {
        this.f12108b.m1789a(c3661a);
        m1777a((C3644a) this.f12108b, true);
        C0915b.m10597a(this);
    }

    /* renamed from: a */
    public void m1777a(C3644a c3644a, boolean z) {
        if (c3644a != this.f12109e) {
            if (this.f12109e != null) {
                this.f12109e.m1820a(z);
            }
            this.f12109e = c3644a;
            this.f12109e.m1819b(z);
        }
    }

    /* renamed from: c */
    public void m1775c(boolean z) {
        C0915b.m10594b(this);
        m1777a(this.f12107a, z);
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: c */
    public void mo1766c() {
        m1777a((C3644a) this.f12107a, false);
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: d */
    public void mo1774d() {
        this.f12107a.m1796h();
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: e */
    public void mo1763e() {
        this.f12107a.mo1763e();
        this.f12108b.mo1763e();
        m1775c(false);
        this.f12109e = null;
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: a */
    public void mo1771a(float f, float f2, float f3, float f4) {
        this.f12107a.mo1771a(f, f2, f3, f4);
        this.f12108b.mo1771a(f, f2, f3, f4);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m1775c(true);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }
}
