package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.b.a.d;
import com.censivn.C3DEngine.b.e.h;
import com.censivn.C3DEngine.b.e.k;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.e.e.g.a.f;
import com.tsf.shell.e.e.o;
import com.tsf.shell.manager.o.a.c;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class ThemeIconDesignerMenu extends f {
    public static final int NOTIF_POINT_VERSION_CODE_110 = 110;
    private float currentScale;
    private o mApplyButton;
    private l mContainer;
    private m mDemoShortcutIcon;
    private TextureElement mDemoShortcutTexture;
    private ThemeMenuMixElementPlane mElementPlane;
    private l mIconContainer;
    private com.censivn.C3DEngine.b.b.a.b mLableContentLayout;
    private d mLableScrollView;
    private o mResetButton;
    private k mSeekBarPreference;
    private m mShortcut;
    private int newStyleIndex;
    private int currentStyleId = 0;
    private com.tsf.shell.manager.o.a mCalStyle = new com.tsf.shell.manager.o.a();

    public ThemeIconDesignerMenu() {
        setTitle(R.string.text_icon_designer);
        setMenuHeight(com.censivn.C3DEngine.b.b.a.a(950.0f));
        this.mContainer = new l();
        this.mShortcut = new m(com.censivn.C3DEngine.b.b.a.a(80.0f), com.censivn.C3DEngine.b.b.a.a(80.0f), false);
        addIcon(this.mShortcut);
        this.mApplyButton = new o(R.drawable.button_apply, R.string.theme_apply_theme) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.1
            @Override // com.tsf.shell.e.e.o
            public void a() {
                boolean z = true;
                boolean z2 = false;
                if (ThemeIconDesignerMenu.this.currentScale != com.tsf.shell.manager.o.b.a.A) {
                    com.tsf.shell.manager.o.b.a(ThemeIconDesignerMenu.this.currentScale);
                    z2 = true;
                }
                int i = c.c(ThemeIconDesignerMenu.this.newStyleIndex).b;
                if (i != ThemeIconDesignerMenu.this.currentStyleId) {
                    c.a(i);
                } else {
                    z = z2;
                }
                if (z) {
                    Home.b().a(VEasing.Back.easeIn);
                } else {
                    ThemeIconDesignerMenu.this.exit();
                }
            }
        };
        com.tsf.shell.manager.o.c.a(this.mApplyButton, com.tsf.shell.manager.o.c.h);
        this.mApplyButton.position().y = com.censivn.C3DEngine.b.b.a.a(-223.0f);
        this.mApplyButton.a(0);
        this.mResetButton = new o(R.drawable.button_reset, R.string.text_reset) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.2
            @Override // com.tsf.shell.e.e.o
            public void a() {
                ThemeIconDesignerMenu.this.resetFromConfig(true, 1.15f);
                ThemeIconDesignerMenu.this.hideResetButton();
            }
        };
        com.tsf.shell.manager.o.c.a(this.mResetButton, com.tsf.shell.manager.o.c.h);
        this.mResetButton.position().y = com.censivn.C3DEngine.b.b.a.a(-223.0f);
        this.mResetButton.a(0);
        this.mIconContainer = new l();
        this.mIconContainer.position().y = com.censivn.C3DEngine.b.b.a.a(400.0f);
        this.mContainer.addChild(this.mIconContainer);
        this.mDemoShortcutIcon = new m(0.0f, 0.0f, false);
        this.mDemoShortcutTexture = new TextureElement(0, false);
        this.mDemoShortcutIcon.textures().addElement(this.mDemoShortcutTexture);
        this.mIconContainer.addChild(this.mDemoShortcutIcon);
        this.mLableScrollView = new d() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.3
            @Override // com.censivn.C3DEngine.b.b.a.d
            public float b(float f) {
                float f2 = com.tsf.shell.manager.o.b.a.J * 1.2f;
                ThemeIconDesignerMenu.this.newStyleIndex = (int) ((Math.abs(f) + (f2 / 2.0f)) / f2);
                return f2 * (-r1);
            }

            @Override // com.censivn.C3DEngine.b.b.a.d
            public void a() {
                ThemeIconDesignerMenu.this.showResetButton();
            }
        };
        this.mLableScrollView.b(true);
        this.mLableScrollView.c(((-com.tsf.shell.manager.o.b.a.J) / 2.0f) * 1.2f);
        this.mLableScrollView.d((com.tsf.shell.manager.o.b.a.J / 2.0f) * 1.2f);
        this.mLableContentLayout = new com.censivn.C3DEngine.b.b.a.b();
        this.mLableScrollView.c(this.mLableContentLayout);
        int b = c.b();
        for (int i = 0; i < b; i++) {
            final com.tsf.shell.manager.o.a.b c = c.c(i);
            m a = c.a();
            a.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(a) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.4
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (ThemeIconDesignerMenu.this.newStyleIndex == c.c) {
                        return;
                    }
                    ThemeIconDesignerMenu.this.scrollLable(c.c, true);
                    ThemeIconDesignerMenu.this.newStyleIndex = c.c;
                    ThemeIconDesignerMenu.this.showResetButton();
                }
            });
            a.calAABB();
            this.mLableContentLayout.addChild(a);
        }
        this.mIconContainer.addChild(this.mLableScrollView);
        this.mSeekBarPreference = new h();
        this.mSeekBarPreference.g(R.string.text_icon_size);
        this.mSeekBarPreference.i(70);
        this.mSeekBarPreference.j(190);
        this.mSeekBarPreference.b((int) com.censivn.C3DEngine.b.b.a.a(850.0f));
        this.mSeekBarPreference.position().y = com.censivn.C3DEngine.b.b.a.a(150.0f);
        this.mSeekBarPreference.a(new com.censivn.C3DEngine.b.e.l() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.5
            @Override // com.censivn.C3DEngine.b.e.l
            public boolean a(int i2) {
                ThemeIconDesignerMenu.this.setIconSize(i2 / 100.0f);
                return true;
            }

            @Override // com.censivn.C3DEngine.b.e.l
            public void a() {
                ThemeIconDesignerMenu.this.showResetButton();
            }
        });
        this.mContainer.addChild(this.mSeekBarPreference);
        this.mContainer.addChild(this.mApplyButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconSize(float f) {
        this.currentScale = f;
        this.mCalStyle.a(f, this.mCalStyle.B);
        this.mDemoShortcutIcon.a(this.mCalStyle.H, this.mCalStyle.I);
        this.mDemoShortcutIcon.position().y = this.mCalStyle.Y;
        this.mLableContentLayout.position().y = this.mCalStyle.aa - (com.tsf.shell.manager.o.a.b.d / 2);
    }

    private void refreshDemoShortcutTexture() {
        recycleDemoShortcutTexture();
        Bitmap a = x.a(R.drawable.tsf_ico);
        com.censivn.C3DEngine.a.g().a(this.mDemoShortcutTexture, a);
        a.recycle();
    }

    private void recycleDemoShortcutTexture() {
        if (this.mDemoShortcutTexture.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.mDemoShortcutTexture);
        }
    }

    private void resetLayout() {
        this.mLableScrollView.position().x = com.censivn.C3DEngine.b.b.a.z;
        this.mLableScrollView.setAABBPX(0.0f, (-com.censivn.C3DEngine.b.b.a.a(500.0f)) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.a(500.0f) / 2.0f, 0.0f);
        this.mLableScrollView.k();
        this.mLableScrollView.a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getContentContainer() {
        return this.mContainer;
    }

    @Override // com.tsf.shell.e.e.g.a.f, com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        super.onLayout(f, f2, f3, f4);
        resetLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetFromConfig(boolean z, float f) {
        this.currentStyleId = c.a.b;
        this.newStyleIndex = c.a.c;
        if (!z) {
            setIconSize(f);
        }
        this.currentScale = f;
        this.mSeekBarPreference.a((int) (100.0f * f), z);
        scrollLable(this.newStyleIndex, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollLable(int i, boolean z) {
        this.mLableScrollView.a((com.tsf.shell.manager.o.b.a.J * 1.2f * (-i)) + (this.mLableScrollView.i() / 2.0f) + this.mLableScrollView.b(), z);
    }

    @Override // com.tsf.shell.e.e.g.a.f, com.tsf.shell.e.e.g.a.e
    public void onShow() {
        this.mShortcut.textures().clear();
        this.mShortcut.textures().addElement(this.mElementPlane.getTexture());
        addIcon(this.mShortcut);
        super.onShow();
        refreshDemoShortcutTexture();
        resetLayout();
        int b = c.b();
        for (int i = 0; i < b; i++) {
            c.c(i).a(com.tsf.shell.manager.o.b.c);
        }
        this.mSeekBarPreference.f();
        resetFromConfig(false, com.tsf.shell.manager.o.b.a.A);
        if (com.tsf.shell.manager.o.b.a.A != 1.15f) {
            showResetButton();
        }
    }

    public void showResetButton() {
        if (this.mResetButton.parent() == null) {
            this.mResetButton.position().x = 0.0f;
            this.mResetButton.alpha(0.0f);
            this.mContainer.addChild(this.mResetButton);
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.f(this.mApplyButton.minX() - com.censivn.C3DEngine.b.b.a.a(50.0f));
            xVar.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(this.mApplyButton);
            w.a(this.mApplyButton, 500, xVar);
            com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x();
            xVar2.f(this.mResetButton.maxX() + com.censivn.C3DEngine.b.b.a.a(50.0f));
            xVar2.a(255);
            xVar2.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(this.mResetButton);
            w.a(this.mResetButton, 500, xVar2);
        }
    }

    public void hideResetButton() {
        if (this.mResetButton.parent() != null) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.f(0.0f);
            xVar.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(this.mApplyButton);
            w.a(this.mApplyButton, 500, xVar);
            com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.6
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    ThemeIconDesignerMenu.this.resetButtonState();
                }
            };
            xVar2.f(0.0f);
            xVar2.a(0);
            xVar2.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(this.mResetButton);
            w.a(this.mResetButton, 500, xVar2);
        }
    }

    public void resetButtonState() {
        this.mResetButton.removeFromParent();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onHideComplete() {
        recycle();
    }

    public void exit() {
        this.menu.changeMenu(getParentMenu());
    }

    @Override // com.tsf.shell.e.e.g.a.f
    public void onRequestExit() {
        this.menu.changeMenu(getParentMenu());
    }

    @Override // com.tsf.shell.e.e.g.a.f, com.tsf.shell.e.e.g.a.e
    public void recycle() {
        super.recycle();
        removeIcon();
        this.mShortcut.textures().clear();
        this.mApplyButton.b();
        resetButtonState();
        this.mSeekBarPreference.g();
        recycleDemoShortcutTexture();
        int b = c.b();
        for (int i = 0; i < b; i++) {
            c.c(i).c();
        }
    }

    public void setIcon(ThemeMenuMixElementPlane themeMenuMixElementPlane) {
        this.mElementPlane = themeMenuMixElementPlane;
    }
}
