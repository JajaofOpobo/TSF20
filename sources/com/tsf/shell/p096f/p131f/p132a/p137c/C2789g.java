package com.tsf.shell.p096f.p131f.p132a.p137c;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p046h.p050d.C1052b;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.f.a.c.g */
/* loaded from: classes.dex */
public class C2789g extends C2791h {

    /* renamed from: c */
    private C1052b f9124c;

    /* renamed from: d */
    private boolean f9125d = false;

    /* renamed from: a */
    private TextureElement f9122a = C4189x.m593b(C1306b.C1310d.drawer_layout_homescreen_countdown);

    /* renamed from: b */
    private C0981k f9123b = C0892a.m10741a(180.0f, 180.0f);

    public C2789g() {
        this.f9123b.textures().addElement(this.f9122a);
        C3567c.m1967a(this.f9123b, C3567c.f11849h);
        addChild(this.f9123b);
        calAABB();
        this.f9124c = new C1052b(C0892a.m10742a(182.0f), C1306b.C1310d.ring);
        C3567c.m1967a(this.f9124c, C3567c.f11849h);
        addChild(this.f9124c);
    }

    /* renamed from: b */
    public void mo4665b() {
    }

    /* renamed from: c */
    public void m4664c() {
        this.f9124c.m10098e();
        this.f9124c.m10103b(0.0f);
        this.f9125d = false;
    }

    /* renamed from: d */
    public void m4663d() {
        if (!this.f9125d) {
            this.f9125d = true;
            this.f9124c.m10107a(360.0f, 1500, new Runnable() { // from class: com.tsf.shell.f.f.a.c.g.1
                @Override // java.lang.Runnable
                public void run() {
                    C2789g.this.mo4665b();
                }
            });
        }
    }

    /* renamed from: e */
    public void m4662e() {
        if (this.f9125d) {
            this.f9125d = false;
            this.f9124c.m10108a(0.0f, 500);
        }
    }
}
