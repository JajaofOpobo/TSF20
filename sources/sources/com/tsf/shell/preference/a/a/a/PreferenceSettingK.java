package com.tsf.shell.preference.a.a.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceSettingK extends PreferenceSettingBase {
    private com.censivn.C3DEngine.b.f.BaseRenderable a;
    private com.tsf.shell.f.i.c.a.c.SceneRendererA b;

    public PreferenceSettingK(String str) {
        super(str, com.censivn.C3DEngine.b.b.ScreenConstants.a(300.0f));
        this.b = com.tsf.shell.f.i.c.a.c.SceneRendererA.e();
        this.a = new com.censivn.C3DEngine.b.f.BaseRenderable() { // from class: com.tsf.shell.preference.a.a.a.PreferenceSettingK.1
            @Override // com.censivn.C3DEngine.b.f.BaseRenderable
            public void onDrawChildStart() {
                k.this.b.dispatchDraw();
            }
        };
        PreferenceSettingK().addChild(this.a);
        this.a.scale().setAll(0.55f, 0.55f, 1.0f);
    }

    @Override // com.tsf.shell.preference.a.a.a.PreferenceSettingBase, com.censivn.C3DEngine.b.e.AbstractPanelRenderer
    public void f() {
        super.f();
        PreferenceSettingK();
        this.b.d();
        this.b.b();
    }

    private void h() {
    }

    @Override // com.tsf.shell.preference.a.a.a.PreferenceSettingBase, com.censivn.C3DEngine.b.b.DesktopRenderer
    public void c(int i) {
        super.c(i);
        PreferenceSettingK();
    }

    @Override // com.tsf.shell.preference.a.a.a.PreferenceSettingBase, com.censivn.C3DEngine.b.e.AbstractPanelRenderer
    public void g() {
        super.g();
        this.b.c();
    }
}
