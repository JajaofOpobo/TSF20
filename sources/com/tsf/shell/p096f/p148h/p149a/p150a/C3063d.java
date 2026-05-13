package com.tsf.shell.p096f.p148h.p149a.p150a;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0895b;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p148h.p149a.C3082c;
import com.tsf.shell.p096f.p148h.p149a.p150a.p151a.C3045c;
import com.tsf.shell.theme.inside.ThemeManager;
/* renamed from: com.tsf.shell.f.h.a.a.d */
/* loaded from: classes.dex */
public class C3063d implements C0915b.InterfaceC0918a, C3082c.InterfaceC3083a {

    /* renamed from: a */
    public static int f9935a;

    /* renamed from: b */
    public static int f9936b;

    /* renamed from: c */
    public static int f9937c;

    /* renamed from: d */
    private C3082c f9938d;

    /* renamed from: e */
    private C0895b f9939e;

    /* renamed from: f */
    private C3066e f9940f;

    /* renamed from: g */
    private C3031a f9941g;

    /* renamed from: h */
    private C3068f f9942h;

    /* renamed from: i */
    private C3045c f9943i;

    /* renamed from: k */
    private int f9945k;

    /* renamed from: j */
    private boolean f9944j = false;

    /* renamed from: l */
    private TextureElement f9946l = new TextureElement(0, false);

    /* renamed from: m */
    private TextureElement f9947m = new TextureElement(0, false);

    public C3063d(C3082c c3082c) {
        this.f9938d = c3082c;
        f9935a = (int) C0892a.m10742a(170.0f);
        int m10742a = (int) C0892a.m10742a(550.0f);
        f9937c = m10742a;
        f9936b = m10742a;
        this.f9940f = new C3066e(this) { // from class: com.tsf.shell.f.h.a.a.d.1
            @Override // com.tsf.shell.p096f.p148h.p149a.p150a.C3066e, com.censivn.C3DEngine.p031b.p037e.C0945c
            /* renamed from: g */
            public void mo552g() {
                super.mo552g();
                C3063d.this.f9938d.mo3649u();
            }
        };
        this.f9939e = new C0895b();
        this.f9943i = new C3045c(this, c3082c.m3798c());
        this.f9941g = new C3031a();
        this.f9942h = new C3068f();
        this.f9939e.setAABBPX(0.0f, C0892a.m10742a(180.0f));
    }

    /* renamed from: a */
    public void m3691a(int i) {
        this.f9945k = i;
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: j */
    public int mo3634j() {
        return this.f9945k;
    }

    /* renamed from: k */
    public C3068f m3686k() {
        return this.f9942h;
    }

    /* renamed from: a */
    public void m3690a(C3058b c3058b) {
        this.f9938d.m3791f();
        this.f9944j = true;
        this.f9943i.m3738a(c3058b);
        C3359a.f11101o.m3617f();
        C0915b.m10597a(this);
    }

    /* renamed from: l */
    public void m3685l() {
        if (this.f9944j && this.f9943i.m3733c()) {
            this.f9938d.m3789g();
            this.f9944j = false;
            C3359a.f11101o.m3615g();
            C0915b.m10594b(this);
        }
    }

    /* renamed from: c */
    public TextureElement m3687c(boolean z) {
        if (z) {
            if (this.f9947m.f2529id == 0) {
                Bitmap defaultBitmap = ThemeManager.mix.contact.getDefaultBitmap(f9936b, f9936b, true);
                C0853a.m10853g().m10540a(this.f9947m, defaultBitmap);
                defaultBitmap.recycle();
            }
            return this.f9947m;
        }
        if (this.f9946l.f2529id == 0) {
            Bitmap defaultBitmap2 = ThemeManager.mix.contact.getDefaultBitmap(f9935a, f9935a, false);
            C0853a.m10853g().m10540a(this.f9946l, defaultBitmap2);
            defaultBitmap2.recycle();
        }
        return this.f9946l;
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f9944j) {
            m3685l();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: b */
    public void mo3643b() {
        m3685l();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: c */
    public void mo3641c() {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: d */
    public void mo3640d() {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: e */
    public void mo3639e() {
        this.f9943i.m3731d();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: f */
    public void mo3638f() {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: g */
    public void mo3637g() {
        C0853a.m10853g().m10543a(this.f9946l);
        C0853a.m10853g().m10543a(this.f9947m);
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: h */
    public void mo3636h() {
        if (this.f9943i != null) {
            this.f9943i.m3729e();
        }
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: i */
    public void mo3635i() {
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: a */
    public C0980j mo3645a() {
        return this.f9939e;
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: a */
    public void mo3644a(boolean z) {
        if (z) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.d.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3063d.this.f9939e.removeFromParent();
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this.f9939e);
            C1014c.m10325a(this.f9939e, 300, c1017d);
            return;
        }
        C1014c.m10326a(this.f9939e);
        this.f9939e.alpha(0.0f);
        this.f9939e.removeFromParent();
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.C3082c.InterfaceC3083a
    /* renamed from: b */
    public void mo3642b(boolean z) {
        if (z) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            C1014c.m10326a(this.f9939e);
            C1014c.m10325a(this.f9939e, 300, c1017d);
            return;
        }
        C1014c.m10326a(this.f9939e);
        this.f9939e.alpha(255.0f);
    }
}
