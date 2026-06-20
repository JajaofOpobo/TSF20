package com.tsf.shell.preference.a.a.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceSettingE extends PreferenceSettingBase {
    private com.censivn.C3DEngine.b.f.BaseRenderable a;
    private float b;
    private float d;
    private float e;

    public PreferenceSettingE(String str) {
        super(str, com.censivn.C3DEngine.b.b.A.a(238.0f));
        this.a = new com.censivn.C3DEngine.b.f.BaseRenderable();
        PreferenceSettingE().addChild(this.a);
        this.b = com.censivn.C3DEngine.b.b.A.a(150.0f);
        this.e = com.censivn.C3DEngine.b.b.A.a(20.0f);
        this.d = (this.b * 5.0f) + (this.e * 4.0f);
        this.a.position().x = ((-this.d) / 2.0f) + com.censivn.C3DEngine.b.b.A.a(20.0f);
    }

    @Override // com.tsf.shell.preference.a.a.a.PreferenceSettingBase, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                com.tsf.shell.f._d.c.a.DashLayoutListener cVarB = com.tsf.shell.manager.app.v.ScreenHelper.a(i2).b();
                if (i2 == 2) {
                    cVarB.g();
                } else {
                    cVarB.h();
                }
                cVarB.removeFromParent();
                cVarB.position().x = this.e + ((this.b + this.e) * i2);
                this.a.addChild(cVarB);
                i = i2 + 1;
            } else {
                PreferenceSettingE();
                return;
            }
        }
    }

    private void h() {
    }

    @Override // com.tsf.shell.preference.a.a.a.PreferenceSettingBase, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        PreferenceSettingE();
    }

    @Override // com.tsf.shell.preference.a.a.a.PreferenceSettingBase, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        int i = com.tsf.shell.manager.app.v.ScreenHelper.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.app.v.ScreenHelper.a(i2).b().removeFromParent();
        }
        com.tsf.shell.f._d.c.a.DashLayoutListener.a();
        com.tsf.shell.f._d.c.a.DashLayoutListener.j();
    }
}
