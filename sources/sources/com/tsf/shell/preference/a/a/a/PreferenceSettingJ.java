package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.b.f.LabelRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceSettingJ extends com.censivn.C3DEngine.b.e.AbstractPanelRenderer {
    private LabelRenderable a;

    public PreferenceSettingJ() {
        this(com.censivn.C3DEngine.b.b.ScreenConstants.a(120.0f));
        b(false);
    }

    @Override // com.censivn.C3DEngine.b.e.AbstractPanelRenderer
    public void f() {
    }

    @Override // com.censivn.C3DEngine.b.e.AbstractPanelRenderer
    public void g() {
        if (this.a != null) {
            this.a.a();
        }
    }

    public PreferenceSettingJ(float f) {
        d((int) f);
        a(0);
        this.a = new LabelRenderable();
        this.a.b(1);
        com.censivn.C3DEngine.b.b.TouchState bVar = new com.censivn.C3DEngine.b.b.TouchState();
        bVar.a = com.censivn.C3DEngine.b.b.ScreenConstants.a(30.0f);
        this.a.setLayoutParams(bVar);
        this.a.d(50);
        addChild(this.a);
    }

    @Override // com.censivn.C3DEngine.b.b.DesktopRenderer
    public void c(int i) {
        this.a.position().x = (-i) / 2.0f;
    }

    public void a(String str) {
        this.a.a(str);
        this.a.b();
        com.censivn.C3DEngine.b.b.TouchState layoutParams = this.a.getLayoutParams();
        layoutParams.h = this.a.minX();
        layoutParams.j = this.a.maxX();
        layoutParams.i = this.a.minY();
        layoutParams.k = this.a.maxY();
        PreferenceSettingJ();
    }
}
