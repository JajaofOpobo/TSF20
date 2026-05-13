package com.tsf.shell.p096f.p148h.p149a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.C1306b;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p148h.p149a.p150a.C3063d;
import com.tsf.shell.p096f.p148h.p149a.p152b.C3076a;
/* renamed from: com.tsf.shell.f.h.a.c */
/* loaded from: classes.dex */
public class C3082c extends C3022a {

    /* renamed from: a */
    public static final float f9979a = C0892a.m10742a(200.0f);

    /* renamed from: b */
    private InterfaceC3083a f9980b;

    /* renamed from: c */
    private C3063d f9981c;

    /* renamed from: d */
    private C3076a f9982d;

    /* renamed from: com.tsf.shell.f.h.a.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3083a {
        /* renamed from: a */
        C0980j mo3645a();

        /* renamed from: a */
        void mo3644a(boolean z);

        /* renamed from: b */
        void mo3643b();

        /* renamed from: b */
        void mo3642b(boolean z);

        /* renamed from: c */
        void mo3641c();

        /* renamed from: d */
        void mo3640d();

        /* renamed from: e */
        void mo3639e();

        /* renamed from: f */
        void mo3638f();

        /* renamed from: g */
        void mo3637g();

        /* renamed from: h */
        void mo3636h();

        /* renamed from: i */
        void mo3635i();

        /* renamed from: j */
        int mo3634j();
    }

    public C3082c() {
        int m2504au = C3430e.m2504au();
        this.f9981c = new C3063d(this);
        this.f9981c.m3691a(0);
        this.f9981c.mo3644a(false);
        this.f9982d = new C3076a(this);
        this.f9982d.m3673a(1);
        this.f9982d.mo3644a(false);
        if (m2504au == 0) {
            m3661a((InterfaceC3083a) this.f9981c, false, false);
        } else {
            m3661a((InterfaceC3083a) this.f9982d, false, false);
        }
        if (!C3430e.m2503av()) {
            m3803a(false, false, false);
        }
    }

    /* renamed from: x */
    private void m3646x() {
        if (this.f9980b == this.f9981c) {
            m3661a((InterfaceC3083a) this.f9982d, true, true);
        } else {
            m3661a((InterfaceC3083a) this.f9981c, true, true);
        }
    }

    /* renamed from: a */
    private void m3661a(InterfaceC3083a interfaceC3083a, boolean z, boolean z2) {
        if (this.f9980b != null) {
            this.f9980b.mo3640d();
            this.f9980b.mo3644a(z);
        }
        m3807a(interfaceC3083a.mo3645a());
        this.f9980b = interfaceC3083a;
        this.f9980b.mo3642b(z);
        if (z2) {
            this.f9980b.mo3641c();
            C3430e.m2421t(this.f9980b.mo3634j());
        }
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: b */
    public void mo3659b(int i) {
        if (i == 0) {
            if (this.f9980b == this.f9981c) {
                m3796d(C1306b.C1310d.ico_recents_app);
                m3793e(C1306b.C1315i.text_toggle_recent_apps);
                return;
            }
            m3796d(C1306b.C1310d.ico_contact);
            m3793e(C1306b.C1315i.text_quick_contact);
            return;
        }
        m3796d(C1306b.C1310d.ico_setting);
        m3804a("");
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: c */
    public boolean mo3658c(int i) {
        if (i == 0) {
            m3646x();
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public C3063d m3648v() {
        return this.f9981c;
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: d */
    public void mo3657d() {
        this.f9980b.mo3643b();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: u */
    public void mo3649u() {
        super.mo3649u();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: a */
    public void mo3660a(boolean z) {
        C3430e.m2412w(z);
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: t */
    public void mo3650t() {
        this.f9980b.mo3635i();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: m */
    public void mo3656m() {
        this.f9980b.mo3641c();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: n */
    public void mo3655n() {
        this.f9980b.mo3640d();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: o */
    public void mo3654o() {
        this.f9980b.mo3639e();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: p */
    public void mo3653p() {
        this.f9980b.mo3638f();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: r */
    public void mo3652r() {
        this.f9980b.mo3637g();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3022a
    /* renamed from: s */
    public void mo3651s() {
        this.f9980b.mo3636h();
    }

    /* renamed from: w */
    public void m3647w() {
        mo3652r();
        mo3653p();
    }
}
