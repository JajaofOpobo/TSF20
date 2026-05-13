package com.tsf.shell.p096f.p148h.p149a.p152b;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0895b;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.C2502d;
import com.tsf.shell.p096f.p148h.p149a.C3082c;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.h.a.b.a */
/* loaded from: classes.dex */
public class C3076a implements C3082c.InterfaceC3083a {

    /* renamed from: a */
    private C3082c f9964a;

    /* renamed from: e */
    private int f9968e;

    /* renamed from: f */
    private C0984m f9969f;

    /* renamed from: g */
    private int f9970g;

    /* renamed from: b */
    private C3081b f9965b = new C3081b(this) { // from class: com.tsf.shell.f.h.a.b.a.1
        @Override // com.tsf.shell.p096f.p148h.p149a.p152b.C3081b, com.censivn.C3DEngine.p031b.p037e.C0945c
        /* renamed from: g */
        public void mo552g() {
            super.mo552g();
            C3076a.this.f9964a.mo3649u();
        }
    };

    /* renamed from: d */
    private C2502d<C3080a> f9967d = new C2502d<C3080a>() { // from class: com.tsf.shell.f.h.a.b.a.2
        @Override // com.tsf.shell.p096f.p118e.C2502d
        /* renamed from: a */
        public C3080a mo718b() {
            C3080a c3080a = new C3080a();
            c3080a.setAABBPX(C3566b.f11839a.f11762T, C3566b.f11839a.f11763U);
            c3080a.position().f2527y = -C0892a.m10742a(30.0f);
            return c3080a;
        }
    };

    /* renamed from: c */
    private C0895b f9966c = new C0895b();

    public C3076a(C3082c c3082c) {
        this.f9968e = 8;
        this.f9964a = c3082c;
        this.f9966c.setAABBPX(0.0f, C0892a.m10742a(180.0f));
        this.f9968e = m3670b(C3430e.m2501ax());
    }

    /* renamed from: k */
    public int m3668k() {
        return this.f9968e;
    }

    /* renamed from: a */
    public void m3672a(int i, boolean z) {
        this.f9968e = m3670b(i);
        if (z) {
            m3665n();
            C3430e.m2418u(this.f9968e);
        }
    }

    /* renamed from: b */
    private int m3670b(int i) {
        if (i < 3) {
            return 3;
        }
        if (i > 15) {
            return 15;
        }
        return i;
    }

    /* renamed from: l */
    private void m3667l() {
        while (!this.f9966c.children().isEmpty()) {
            C0975i removeChildAt = this.f9966c.removeChildAt(0);
            if (removeChildAt instanceof C3080a) {
                C3080a c3080a = (C3080a) removeChildAt;
                c3080a.m3662q();
                c3080a.textures().clear();
                this.f9967d.m5384a(c3080a);
            }
        }
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: a */
    public void mo3644a(boolean z) {
        if (z) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.b.a.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3076a.this.f9966c.removeFromParent();
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this.f9966c);
            C1014c.m10325a(this.f9966c, 300, c1017d);
            return;
        }
        C1014c.m10326a(this.f9966c);
        this.f9966c.alpha(0.0f);
        this.f9966c.removeFromParent();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: b */
    public void mo3642b(boolean z) {
        if (z) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            C1014c.m10326a(this.f9966c);
            C1014c.m10325a(this.f9966c, 300, c1017d);
            return;
        }
        C1014c.m10326a(this.f9966c);
        this.f9966c.alpha(255.0f);
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: a */
    public C0980j mo3645a() {
        return this.f9966c;
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: b */
    public void mo3643b() {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: c */
    public void mo3641c() {
        m3665n();
    }

    /* renamed from: m */
    private C0984m m3666m() {
        if (this.f9969f == null) {
            this.f9969f = new C0984m();
            this.f9969f.m10347d(40);
            this.f9969f.m10349c(C1306b.C1315i.notic_no_recent_apps);
            this.f9969f.m10353b();
            this.f9969f.minX(C0892a.f2590z);
            this.f9969f.maxX(C0892a.f2550A);
        }
        return this.f9969f;
    }

    /* renamed from: n */
    private void m3665n() {
        System.currentTimeMillis();
        ArrayList<C3222g> m2692a = C3359a.f11109w.m2716a().m2749a().m2692a(this.f9968e);
        m3667l();
        if (m2692a.isEmpty()) {
            this.f9966c.addChild(m3666m());
            return;
        }
        if (this.f9969f != null) {
            this.f9969f.m10358a();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < m2692a.size()) {
                C3222g c3222g = m2692a.get(i2);
                C3080a m5383c = this.f9967d.m5383c();
                m5383c.m3663a(c3222g.m3106bd());
                m5383c.scale().setAll(0.9f, 0.9f, 1.0f);
                m5383c.f10495k.textures().clear();
                m5383c.f10495k.textures().addElement(c3222g.m3111aZ());
                this.f9966c.addChild(m5383c);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: d */
    public void mo3640d() {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: e */
    public void mo3639e() {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: f */
    public void mo3638f() {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: g */
    public void mo3637g() {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: h */
    public void mo3636h() {
        if (this.f9969f != null) {
            this.f9969f.minX(C0892a.f2590z);
            this.f9969f.maxX(C0892a.f2550A);
            this.f9966c.onChildMeasure(this.f9969f);
        }
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: i */
    public void mo3635i() {
        this.f9965b.m10506d();
    }

    /* renamed from: a */
    public void m3673a(int i) {
        this.f9970g = i;
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: j */
    public int mo3634j() {
        return this.f9970g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.h.a.b.a$a */
    /* loaded from: classes.dex */
    public class C3080a extends C3224h {

        /* renamed from: b */
        private C3377f f9975b;

        public C3080a() {
        }

        @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
        /* renamed from: l */
        public void mo3094l() {
            if (this.f9975b != null) {
                this.f9975b.m2706a();
            }
        }

        /* renamed from: a */
        public void m3663a(C3377f c3377f) {
            this.f9975b = c3377f;
        }

        /* renamed from: q */
        public void m3662q() {
            this.f9975b = null;
        }
    }
}
