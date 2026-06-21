package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.IconButtonRenderer;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceItemD extends com.censivn.C3DEngine.b.e.DesktopPanelRenderer {
    private com.censivn.C3DEngine.b.e.PercentLabelRenderer a;
    private com.tsf.shell.preference.a.PreferenceElementRenderer b;
    private com.tsf.shell.preference.a.PreferenceFragmentBase c;
    private com.censivn.C3DEngine.b.e.PercentLabelRenderer d;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer e;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer f;
    private int g = 0;
    private int h = 0;
    private com.censivn.C3DEngine.b.e.PanelBarRenderer i;
    private com.censivn.C3DEngine.b.e.PanelBarRenderer j;
    private com.censivn.C3DEngine.b.e.LabeledIconRenderer k;

    public PreferenceItemD() {
        a(PreferenceItemB.i.text_preferences);
        this.k = new com.censivn.C3DEngine.b.e.LabeledIconRenderer();
        this.k.g(PreferenceItemB.i.text_standard_dock);
        this.k.g(PreferenceItemB.i.text_slinding_dock);
        a(this.k);
        this.k.a(new PreferenceItemB.a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemD.1
            @Override // com.censivn.C3DEngine.b.e.LabeledIconRenderer.a
            public void a(int i) {
                PreferenceItemD.this.a(i, i != 0);
            }
        });
        this.i = new com.censivn.C3DEngine.b.e.PanelBarRenderer();
        this.j = new com.censivn.C3DEngine.b.e.PanelBarRenderer();
        a(this.i);
        a(this.j);
        this.c = new com.tsf.shell.preference.a.PreferenceFragmentBase(com.censivn.C3DEngine.b.b.ScreenConstants.a(250.0f));
        this.i.a(this.c);
        com.censivn.C3DEngine.b.e.PercentLabelRenderer eVar = new com.censivn.C3DEngine.b.e.PercentLabelRenderer();
        this.d = eVar;
        eVar.h(PreferenceItemB.i.text_width_margin_summary);
        eVar.a(" %");
        eVar.k(0);
        eVar.i(0);
        eVar.j(100);
        this.i.a(eVar);
        this.e = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.e.h(PreferenceItemB.i.mn_indicator_mode);
        this.e.i(PreferenceItemB.i.mn_indicator_mode_summary);
        this.i.a(this.e);
        this.e.a(new PreferenceItemA.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemD.2
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                if (z) {
                    PreferenceItemD.this.c.h();
                    return true;
                }
                PreferenceItemD.this.c.m();
                return true;
            }
        });
        eVar.a(new PreferenceItemH.a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemD.3
            @Override // com.censivn.C3DEngine.b.e.TextIconRenderer.a
            public boolean a(int i) {
                PreferenceItemD.this.c.f(i);
                if (com.censivn.C3DEngine.b.b.ScreenConstants.O) {
                    PreferenceItemD.this.g = i;
                    return true;
                }
                PreferenceItemD.this.h = i;
                return true;
            }
        });
        com.tsf.shell.preference.a.PreferenceElementRenderer eVar2 = new com.tsf.shell.preference.a.PreferenceElementRenderer(com.censivn.C3DEngine.b.b.ScreenConstants.a(300.0f));
        this.b = eVar2;
        this.j.a(eVar2);
        com.censivn.C3DEngine.b.e.PercentLabelRenderer eVar3 = new com.censivn.C3DEngine.b.e.PercentLabelRenderer();
        this.a = eVar3;
        eVar3.g(PreferenceItemB.i.text_button_transparency);
        eVar3.a(" %");
        eVar3.k(70);
        eVar3.a(new PreferenceItemH.a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemD.4
            @Override // com.censivn.C3DEngine.b.e.TextIconRenderer.a
            public boolean a(int i) {
                PreferenceItemD.this.b.f(i);
                return true;
            }
        });
        this.j.a(eVar3);
        this.f = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.f.h(PreferenceItemB.i.mn_indicator_mode);
        this.f.i(PreferenceItemB.i.mn_indicator_mode_summary);
        this.j.a(this.f);
        this.f.a(new PreferenceItemA.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemD.5
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                if (z) {
                    PreferenceItemD.this.b.h();
                    return true;
                }
                PreferenceItemD.this.b.m();
                return true;
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public int b() {
        return com.tsf.shell.manager.app.WidgetPanelController.c();
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void h() {
        PreferenceItemD();
    }

    private void i() {
        if (com.censivn.C3DEngine.b.b.ScreenConstants.O) {
            this.d.b(x.c(PreferenceItemB.i.text_width_margin) + " (" + x.c(PreferenceItemB.i.text_vertical) + ")");
            this.d.k(this.g);
            this.c.f(this.g);
        } else {
            this.d.b(x.c(PreferenceItemB.i.text_width_margin) + " (" + x.c(PreferenceItemB.i.text_horizontal) + ")");
            this.d.k(this.h);
            this.c.f(this.h);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void f() {
        this.k.alpha(0.0f);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.k);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.k, 500, dVar);
        this.k.f(com.tsf.shell.manager.app.WidgetPanelController.c());
        int i = com.tsf.shell.manager.app.WidgetPanelController.b.i();
        this.a.k(i);
        this.b.f(i);
        this.g = com.tsf.shell.manager.b.ConfigManager.t();
        this.h = com.tsf.shell.manager.b.ConfigManager.u();
        this.e.c(com.tsf.shell.manager.b.ConfigManager.ag());
        this.f.c(com.tsf.shell.manager.b.ConfigManager.ah());
        PreferenceItemD();
        if (com.tsf.shell.manager.b.ConfigManager.ag()) {
            this.c.h();
        } else {
            this.c.m();
        }
        if (com.tsf.shell.manager.b.ConfigManager.ah()) {
            this.b.h();
        } else {
            this.b.m();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void g() {
        com.tsf.shell.manager.app.WidgetPanelController.b.a(this.a.e(), true);
        com.tsf.shell.manager.app.WidgetPanelController.a.a(this.d.e());
        com.tsf.shell.manager.b.ConfigManager.d(this.g);
        com.tsf.shell.manager.b.ConfigManager.e(this.h);
        com.tsf.shell.manager.b.ConfigManager.q(this.e.e());
        com.tsf.shell.manager.b.ConfigManager.r(this.f.e());
        com.tsf.shell.manager.app.WidgetPanelController.b(this.k.e());
    }
}
