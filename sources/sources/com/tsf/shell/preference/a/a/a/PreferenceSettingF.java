package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.api.element.TextureElement;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceSettingF extends PreferenceSettingBase {
    private com.censivn.C3DEngine.b.f.ResourceGridRenderable a;

    public PreferenceSettingF(String str, int i, float f) {
        super(str, f);
        this.a = new com.censivn.C3DEngine.b.f.ResourceGridRenderable() { // from class: com.tsf.shell.preference.a.a.a.PreferenceSettingF.1
            @Override // com.censivn.C3DEngine.b.f.ResourceGridRenderable
            public void a(TextureElement textureElement) {
                int iA = (int) com.censivn.C3DEngine.b.b.A.a(textureElement.height);
                f.this.a.a((int) com.censivn.C3DEngine.b.b.A.a(textureElement.width));
                f.this.a.b(iA);
            }
        };
        this.a.a(i);
        PreferenceSettingF().addChild(this.a);
    }

    @Override // com.tsf.shell.preference.a.a.a.PreferenceSettingBase, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        this.a.a();
    }
}
