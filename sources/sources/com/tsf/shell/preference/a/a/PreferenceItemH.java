package com.tsf.shell.preference.a.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.e.IconButtonRenderer;
import com.censivn.C3DEngine.b.e.PanelGroupRenderer;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceItemH extends i {
    private A a;
    private com.censivn.C3DEngine.b.e.PercentLabelRenderer b;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer c;
    private boolean d;
    private boolean e;
    private float h = 0.5f;
    private TextureElement f = new TextureElement(0, false);
    private GridRenderable g = new GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.a(24.0f), com.censivn.C3DEngine.b.b.ScreenConstants.a(45.0f), false) { // from class: com.tsf.shell.preference.a.a.PreferenceItemH.1
        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawStart() {
            if (h.this.f.id == 0) {
                com.censivn.C3DEngine.C3DEngine.g().a(h.this.f, PreferenceItemB.d.scrollcontainer_arrow);
            }
        }
    };

    public PreferenceItemH() {
        this.g.textures().addElement(this.f);
        this.g.alpha(200.0f);
        a(PreferenceItemB.i.text_preferences);
        this.c = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.c.h(PreferenceItemB.i.text_enable);
        this.c.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemH.2
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                h.this.d = z;
                com.tsf.shell.manager.app.PanelStateManager.a(h.this.d);
                h.this.k();
                h.this.i();
                return true;
            }
        });
        b(this.c);
        this.a = new PreferenceItemA();
        this.a.h(PreferenceItemB.i.text_direction);
        b(this.a);
        com.censivn.C3DEngine.b.e.PercentLabelRenderer eVar = new com.censivn.C3DEngine.b.e.PercentLabelRenderer();
        this.b = eVar;
        eVar.g(PreferenceItemB.i.text_position);
        eVar.i(0);
        eVar.j(100);
        eVar.a(new h.a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemH.3
            @Override // com.censivn.C3DEngine.b.e.TextIconRenderer.a
            public boolean a(int i) {
                h.this.h = i / 100.0f;
                if (com.censivn.C3DEngine.b.b.ScreenConstants.O) {
                    com.tsf.shell.manager.app.PanelStateManager.a(h.this.h);
                } else {
                    com.tsf.shell.manager.app.PanelStateManager.b(h.this.h);
                }
                h.this.i();
                return true;
            }
        });
        b(eVar);
        addChild(this.g);
    }

    @Override // com.censivn.C3DEngine.b.e.PanelGroupRenderer
    public void b(com.censivn.C3DEngine.b.e.AbstractPanelRenderer fVar) {
        super.a(fVar, com.censivn.C3DEngine.b.b.ScreenConstants.a(50.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.g.visible(Boolean.valueOf(this.d));
        if (this.a.e() == 0) {
            this.g.position().x = com.censivn.C3DEngine.b.b.ScreenConstants.z + com.censivn.C3DEngine.b.b.ScreenConstants.a(30.0f);
            this.g.rotation().z = 0.0f;
        } else {
            this.g.position().x = com.censivn.C3DEngine.b.b.ScreenConstants.A - com.censivn.C3DEngine.b.b.ScreenConstants.a(30.0f);
            this.g.rotation().z = 180.0f;
        }
        this.g.position().y = (com.censivn.C3DEngine.b.b.ScreenConstants.B - com.tsf.shell.manager.m.SideMenuManager.b) - (((com.censivn.C3DEngine.b.b.ScreenConstants.B - com.censivn.C3DEngine.b.b.ScreenConstants.C) - (2.0f * com.tsf.shell.manager.m.SideMenuManager.b)) * this.h);
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void h() {
        super.h();
        PreferenceItemH();
        PreferenceItemH();
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void f() {
        boolean zH = com.tsf.shell.manager.b.ConfigManager.h();
        this.e = zH;
        this.d = zH;
        this.c.c(this.d);
        this.a.f(com.tsf.shell.manager.app.PanelStateManager.d());
        PreferenceItemH();
        PreferenceItemH();
        PreferenceItemH();
    }

    private void j() {
        if (com.censivn.C3DEngine.b.b.ScreenConstants.O) {
            this.b.b(x.c(PreferenceItemB.i.text_position) + " (" + x.c(PreferenceItemB.i.text_vertical) + ")");
            this.h = com.tsf.shell.manager.app.PanelStateManager.a();
        } else {
            this.b.b(x.c(PreferenceItemB.i.text_position) + " (" + x.c(PreferenceItemB.i.text_horizontal) + ")");
            this.h = com.tsf.shell.manager.app.PanelStateManager.c();
        }
        this.b.k((int) (this.h * 100.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.d) {
            this.a.j();
            this.b.j();
        } else {
            this.a.i();
            this.b.i();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void c() {
        if (this.f.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.f);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void g() {
        if (this.d != this.e) {
            com.tsf.shell.manager.b.ConfigManager.b(this.d);
        }
        com.tsf.shell.manager.app.PanelStateManager.a(this.a.e(), true);
        com.tsf.shell.manager.app.PanelStateManager.h();
    }

    class A extends com.censivn.C3DEngine.b.e.IconLabelRenderer {
        private GridRenderable b;
        private TextureElement d;
        private int e = 0;

        public A() {
            A();
        }

        public void f(int i) {
            this.e = i;
            A();
        }

        public int e() {
            return this.e;
        }

        @Override // com.censivn.C3DEngine.b.e.IconLabelRenderer, com.censivn.C3DEngine.b.e.AbstractPanelRenderer
        public void i() {
            super.i();
            this.b.alpha(100.0f);
        }

        @Override // com.censivn.C3DEngine.b.e.IconLabelRenderer, com.censivn.C3DEngine.b.e.AbstractPanelRenderer
        public void j() {
            super.j();
            this.b.alpha(255.0f);
        }

        @Override // com.censivn.C3DEngine.b.e.IconLabelRenderer, com.censivn.C3DEngine.b.e.AbstractPanelRenderer
        public void f() {
            super.f();
        }

        @Override // com.censivn.C3DEngine.b.e.IconLabelRenderer, com.censivn.C3DEngine.b.e.AbstractPanelRenderer
        public void g() {
            super.g();
            if (this.d.id != 0) {
                com.censivn.C3DEngine.C3DEngine.g().a(this.d);
            }
        }

        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawStart() {
            super.onDrawStart();
            if (this.d.id == 0) {
                Bitmap bitmapA = x.a(PreferenceItemB.d.preference_side_menu_direction_icon, com.censivn.C3DEngine.b.b.ScreenConstants.a(90.0f), com.censivn.C3DEngine.b.b.ScreenConstants.a(120.0f));
                com.censivn.C3DEngine.C3DEngine.g().a(this.d, bitmapA);
                bitmapA.recycle();
            }
        }

        private void h() {
            this.b = com.censivn.C3DEngine.b.b.ScreenConstants.a(90.0f, 120.0f);
            this.d = new TextureElement(0, false);
            this.b.textures().addElement(this.d);
            this.b.position().y = (-b()) / 2.0f;
            addChild(this.b);
            setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this) { // from class: com.tsf.shell.preference.a.a.PreferenceItemH.a.1
                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void a(MotionEvent motionEvent) {
                    if (a.this.e == 0) {
                        a.this.e = 1;
                    } else {
                        a.this.e = 0;
                    }
                    com.tsf.shell.manager.app.PanelStateManager.a(a.this.e, false);
                    a.this.m();
                    h.this.i();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m() {
            if (this.e == 0) {
                this.b.rotation().z = 0.0f;
            } else {
                this.b.rotation().z = 180.0f;
            }
        }

        @Override // com.censivn.C3DEngine.b.e.IconLabelRenderer, com.censivn.C3DEngine.b.b.DesktopRenderer
        public void c(int i) {
            super.c(i);
            if (this.b != null) {
                this.b.position().x = (i / 2.0f) - (this.b.b() / 2.0f);
            }
        }

        @Override // com.censivn.C3DEngine.b.b.DesktopRenderer
        public void e(int i) {
            super.e(i);
            if (this.b != null) {
                this.b.position().y = (-i) / 2.0f;
            }
        }
    }
}
