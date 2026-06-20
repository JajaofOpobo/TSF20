package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.IconButtonRenderer;
import com.censivn.C3DEngine.b.e.PanelGroupRenderer;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceItemB extends i {
    public static float a = 4.0f;
    public static float b = 0.8f;
    private boolean c = false;
    private com.censivn.C3DEngine.b.e.PercentLabelRenderer d;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer e;
    private com.tsf.shell.preference.a.PreferenceThemeProvider f;
    private float g;

    public PreferenceItemB() {
        a(b.i.text_screen_scale);
        this.f = new com.tsf.shell.preference.a.PreferenceThemeProvider();
        b(this.f);
        this.e = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.e.h(b.i.text_default_scale);
        this.e.b("" + com.censivn.C3DEngine.b.b.ScreenConstants.e);
        this.e.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemB.1
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                b.this.c = z;
                if (b.this.c) {
                    b.this.b(com.censivn.C3DEngine.b.b.ScreenConstants.e);
                }
                b.this.i();
                return true;
            }
        });
        b(this.e);
        this.d = new com.censivn.C3DEngine.b.e.PercentLabelRenderer() { // from class: com.tsf.shell.preference.a.a.PreferenceItemB.2
            @Override // com.censivn.C3DEngine.b.e.PercentLabelRenderer, com.censivn.C3DEngine.b.e.TextIconRenderer
            public void f(int i) {
                if (i < 10) {
                    d("0." + i);
                } else {
                    String string = Integer.toString(i);
                    d(string.substring(0, 1) + "." + string.substring(1));
                }
                b.this.f.a(b.this.d.e() / 10.0f);
            }
        };
        this.d.g(b.i.text_screen_scale);
        this.d.h(b.i.notic_screen_scale_tips);
        this.d.i((int) (b * 10.0f));
        this.d.j((int) (a * 10.0f));
        this.d.k(8);
        this.d.a("");
        b(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.c) {
            this.d.i();
        } else {
            this.d.j();
        }
    }

    public static float a(float f) {
        if (f != 0.0f) {
            if (f > a) {
                f = a;
            } else if (f < b) {
                f = b;
            }
        }
        return ((int) (f * 10.0f)) / 10.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        this.d.k((int) (10.0f * f));
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void f() {
        float fAj = com.tsf.shell.manager.b.ConfigManager.aj();
        this.g = fAj;
        this.c = fAj == 0.0f;
        this.e.c(this.c);
        b(com.censivn.C3DEngine.b.b.ScreenConstants.d);
        PreferenceItemB();
        PreferenceItemB();
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void g() {
        float fE = this.e.e() ? 0.0f : this.d.e() / 10.0f;
        if (fE != this.g) {
            com.tsf.shell.manager.o.ButtonPresetManager.c();
            com.tsf.shell.manager.b.ConfigManager.f(fE);
            Home.b().a(300);
        }
    }
}
