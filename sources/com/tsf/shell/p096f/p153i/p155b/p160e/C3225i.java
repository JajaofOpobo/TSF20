package com.tsf.shell.p096f.p153i.p155b.p160e;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.p030a.C0869e;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.C3445b;
import com.tsf.shell.manager.p183o.C3560a;
/* renamed from: com.tsf.shell.f.i.b.e.i */
/* loaded from: classes.dex */
public class C3225i extends AbstractC3208b {

    /* renamed from: a */
    private int f10532a;

    /* renamed from: b */
    private C3227j f10533b;

    public C3225i(int i, LauncherShortcut3DInfo launcherShortcut3DInfo, C3560a c3560a, boolean z) {
        super(launcherShortcut3DInfo, c3560a);
        this.f10495k.visible(false);
        this.f10532a = i;
        if (z) {
            C3445b.f11406b.m2331a(this);
        } else if (C0869e.m10758l()) {
            mo1827k();
        } else {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.i.1
                @Override // java.lang.Runnable
                public void run() {
                    C3225i.this.mo1827k();
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        if (this.f10533b != null) {
            this.f10533b.dispatchDraw();
        }
    }

    /* renamed from: q */
    public C3227j m3093q() {
        return this.f10533b;
    }

    /* renamed from: aV */
    public int m3096aV() {
        return this.f10532a;
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: l */
    public void mo3094l() {
        super.mo3094l();
        this.f10533b.m3091aV();
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: k */
    protected void mo1827k() {
        C3359a.f11090d.f11189c.m2631a(this);
    }

    /* renamed from: a */
    public void m3097a(C3227j c3227j) {
        this.f10533b = c3227j;
    }

    /* renamed from: aW */
    public void m3095aW() {
        this.f10533b = null;
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        C3359a.f11090d.f11189c.m2627b(this);
        super.mo3055g();
    }
}
