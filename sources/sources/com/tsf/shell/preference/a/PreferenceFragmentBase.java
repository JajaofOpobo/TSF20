package com.tsf.shell.preference.a;

import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.f.e.SelectionFrame;
import com.tsf.shell.preference.a.PreferenceConfigManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceFragmentBase extends PreferenceBaseFragment {
    private PreferenceConfigManager.a a;
    private com.tsf.shell.f.c.b.DrawerSettingsPanel b;
    private BaseRenderable d;
    private i e;
    private com.tsf.shell.f.c.b.DrawerSettingsConfig f;

    public PreferenceFragmentBase(float f) {
        super(f);
        this.d = new BaseRenderable();
        PreferenceFragmentBase().addChild(this.d);
        this.e = new PreferenceItemInterface();
        this.d.addChild(this.e);
        this.e.a(0.0f, f);
        this.e.b(0);
        PreferenceFragmentBase();
    }

    @Override // com.tsf.shell.preference.a.PreferenceBaseFragment, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        this.a.b();
        this.e.removeChild(this.b.a());
        this.e.addChild(this.b.a());
        this.f.d();
        this.f.j();
    }

    @Override // com.tsf.shell.preference.a.PreferenceBaseFragment, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        if (this.b != null) {
            this.b.g();
        }
        if (this.e != null) {
            this.e.a(i);
        }
    }

    @Override // com.tsf.shell.preference.a.PreferenceBaseFragment, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        this.a.c();
        this.e.removeChild(this.b.a());
        this.f.e();
        this.f.i();
    }

    private void n() {
        this.a = com.tsf.shell.manager.app.PreferenceProvider.a.a();
        this.b = this.a.a();
        this.f = new com.tsf.shell.f.c.b.DrawerSettingsConfig(this.b, this.b.a());
    }

    public void h() {
        this.b.c();
    }

    public void m() {
        this.b.d();
    }

    public void f(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }
}
