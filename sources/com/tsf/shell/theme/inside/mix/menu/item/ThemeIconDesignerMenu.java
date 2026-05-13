package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0895b;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0897d;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p037e.C0950e;
import com.censivn.C3DEngine.p031b.p037e.C0953h;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p183o.p184a.C3562b;
import com.tsf.shell.manager.p183o.p184a.C3563c;
import com.tsf.shell.p096f.p118e.C2637l;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2583d;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ThemeIconDesignerMenu extends C2583d {
    public static final int NOTIF_POINT_VERSION_CODE_110 = 110;
    private float currentScale;
    private C2637l mApplyButton;
    private C0980j mContainer;
    private C0981k mDemoShortcutIcon;
    private TextureElement mDemoShortcutTexture;
    private ThemeMenuMixElementPlane mElementPlane;
    private C0980j mIconContainer;
    private C0895b mLableContentLayout;
    private C0897d mLableScrollView;
    private C2637l mResetButton;
    private C0953h mSeekBarPreference;
    private C0981k mShortcut;
    private int newStyleIndex;
    private int currentStyleId = 0;
    private C3560a mCalStyle = new C3560a();

    public ThemeIconDesignerMenu() {
        setTitle(C1306b.C1315i.text_icon_designer);
        setMenuHeight(C0892a.m10742a(950.0f));
        this.mContainer = new C0980j();
        this.mShortcut = new C0981k(C0892a.m10742a(80.0f), C0892a.m10742a(80.0f), false);
        addIcon(this.mShortcut);
        this.mApplyButton = new C2637l(C1306b.C1310d.button_apply, C1306b.C1315i.theme_apply_theme) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.1
            @Override // com.tsf.shell.p096f.p118e.C2637l
            /* renamed from: a */
            public void mo731a() {
                boolean z = true;
                boolean z2 = false;
                if (ThemeIconDesignerMenu.this.currentScale != C3566b.f11839a.f11743A) {
                    C3566b.m1973a(ThemeIconDesignerMenu.this.currentScale);
                    z2 = true;
                }
                int i = C3563c.m1976c(ThemeIconDesignerMenu.this.newStyleIndex).f11822b;
                if (i != ThemeIconDesignerMenu.this.currentStyleId) {
                    C3563c.m1982a(i);
                } else {
                    z = z2;
                }
                if (z) {
                    Home.m6177b().m6186a(VEasing.Back.easeIn);
                } else {
                    ThemeIconDesignerMenu.this.exit();
                }
            }
        };
        C3567c.m1967a(this.mApplyButton, C3567c.f11849h);
        this.mApplyButton.position().f2527y = C0892a.m10742a(-223.0f);
        this.mApplyButton.m5099a(0);
        this.mResetButton = new C2637l(C1306b.C1310d.button_reset, C1306b.C1315i.text_reset) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.2
            @Override // com.tsf.shell.p096f.p118e.C2637l
            /* renamed from: a */
            public void mo731a() {
                ThemeIconDesignerMenu themeIconDesignerMenu = ThemeIconDesignerMenu.this;
                C3560a c3560a = C3566b.f11839a;
                themeIconDesignerMenu.resetFromConfig(true, 1.15f);
                ThemeIconDesignerMenu.this.hideResetButton();
            }
        };
        C3567c.m1967a(this.mResetButton, C3567c.f11849h);
        this.mResetButton.position().f2527y = C0892a.m10742a(-223.0f);
        this.mResetButton.m5099a(0);
        this.mIconContainer = new C0980j();
        this.mIconContainer.position().f2527y = C0892a.m10742a(400.0f);
        this.mContainer.addChild(this.mIconContainer);
        this.mDemoShortcutIcon = new C0981k(0.0f, 0.0f, false);
        this.mDemoShortcutTexture = new TextureElement(0, false);
        this.mDemoShortcutIcon.textures().addElement(this.mDemoShortcutTexture);
        this.mIconContainer.addChild(this.mDemoShortcutIcon);
        this.mLableScrollView = new C0897d() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.3
            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: b */
            public float mo735b(float f) {
                float f2 = C3566b.f11839a.f11752J * 1.2f;
                int abs = (int) ((Math.abs(f) + (f2 / 2.0f)) / f2);
                ThemeIconDesignerMenu.this.newStyleIndex = abs;
                return f2 * (-abs);
            }

            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: a */
            public void mo736a() {
                ThemeIconDesignerMenu.this.showResetButton();
            }
        };
        this.mLableScrollView.m10709b(true);
        this.mLableScrollView.m10707c(((-C3566b.f11839a.f11752J) / 2.0f) * 1.2f);
        this.mLableScrollView.m10702d((C3566b.f11839a.f11752J / 2.0f) * 1.2f);
        this.mLableContentLayout = new C0895b();
        this.mLableScrollView.m10704c(this.mLableContentLayout);
        int m1978b = C3563c.m1978b();
        for (int i = 0; i < m1978b; i++) {
            final C3562b m1976c = C3563c.m1976c(i);
            C0981k m1987a = m1976c.m1987a();
            m1987a.setMouseEventListener(new C0937a(m1987a) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.4
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    if (ThemeIconDesignerMenu.this.newStyleIndex != m1976c.f11823c) {
                        ThemeIconDesignerMenu.this.scrollLable(m1976c.f11823c, true);
                        ThemeIconDesignerMenu.this.newStyleIndex = m1976c.f11823c;
                        ThemeIconDesignerMenu.this.showResetButton();
                    }
                }
            });
            m1987a.calAABB();
            this.mLableContentLayout.addChild(m1987a);
        }
        this.mIconContainer.addChild(this.mLableScrollView);
        this.mSeekBarPreference = new C0950e();
        this.mSeekBarPreference.m10472g(C1306b.C1315i.text_icon_size);
        this.mSeekBarPreference.m10469i(70);
        this.mSeekBarPreference.m10468j(190);
        this.mSeekBarPreference.m10620b((int) C0892a.m10742a(850.0f));
        this.mSeekBarPreference.position().f2527y = C0892a.m10742a(150.0f);
        this.mSeekBarPreference.m10484a(new C0953h.C0955a() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.5
            @Override // com.censivn.C3DEngine.p031b.p037e.C0953h.C0955a
            /* renamed from: a */
            public boolean mo733a(int i2) {
                ThemeIconDesignerMenu.this.setIconSize(i2 / 100.0f);
                return true;
            }

            @Override // com.censivn.C3DEngine.p031b.p037e.C0953h.C0955a
            /* renamed from: a */
            public void mo734a() {
                ThemeIconDesignerMenu.this.showResetButton();
            }
        });
        this.mContainer.addChild(this.mSeekBarPreference);
        this.mContainer.addChild(this.mApplyButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconSize(float f) {
        this.currentScale = f;
        this.mCalStyle.m2021a(f, this.mCalStyle.f11744B);
        this.mDemoShortcutIcon.mo5013a(this.mCalStyle.f11750H, this.mCalStyle.f11751I);
        this.mDemoShortcutIcon.position().f2527y = this.mCalStyle.f11767Y;
        this.mLableContentLayout.position().f2527y = this.mCalStyle.f11770aa - (C3562b.f11821d / 2);
    }

    private void refreshDemoShortcutTexture() {
        recycleDemoShortcutTexture();
        Bitmap m609a = C4189x.m609a(C1306b.C1310d.tsf_ico);
        C0853a.m10853g().m10540a(this.mDemoShortcutTexture, m609a);
        m609a.recycle();
    }

    private void recycleDemoShortcutTexture() {
        if (this.mDemoShortcutTexture.f2529id != 0) {
            C0853a.m10853g().m10543a(this.mDemoShortcutTexture);
        }
    }

    private void resetLayout() {
        this.mLableScrollView.position().f2526x = C0892a.f2590z;
        this.mLableScrollView.setAABBPX(0.0f, (-C0892a.m10742a(500.0f)) / 2.0f, 0.0f, C0892a.f2553D, C0892a.m10742a(500.0f) / 2.0f, 0.0f);
        this.mLableScrollView.m10687k();
        this.mLableScrollView.m10720a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.mContainer;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        super.onLayout(f, f2, f3, f4);
        resetLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetFromConfig(boolean z, float f) {
        this.currentStyleId = C3563c.f11828a.f11822b;
        this.newStyleIndex = C3563c.f11828a.f11823c;
        if (!z) {
            setIconSize(f);
        }
        this.currentScale = f;
        this.mSeekBarPreference.m10485a((int) (100.0f * f), z);
        scrollLable(this.newStyleIndex, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollLable(int i, boolean z) {
        this.mLableScrollView.m10719a((C3566b.f11839a.f11752J * 1.2f * (-i)) + (this.mLableScrollView.m10691i() / 2.0f) + this.mLableScrollView.m10713b(), z);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.mShortcut.textures().clear();
        this.mShortcut.textures().addElement(this.mElementPlane.getTexture());
        addIcon(this.mShortcut);
        super.onShow();
        refreshDemoShortcutTexture();
        resetLayout();
        int m1978b = C3563c.m1978b();
        for (int i = 0; i < m1978b; i++) {
            C3563c.m1976c(i).m1986a(C3566b.f11841c);
        }
        this.mSeekBarPreference.mo539f();
        resetFromConfig(false, C3566b.f11839a.f11743A);
        float f = C3566b.f11839a.f11743A;
        C3560a c3560a = C3566b.f11839a;
        if (f != 1.15f) {
            showResetButton();
        }
    }

    public void showResetButton() {
        if (this.mResetButton.parent() == null) {
            this.mResetButton.position().f2526x = 0.0f;
            this.mResetButton.alpha(0.0f);
            this.mContainer.addChild(this.mResetButton);
            C1017d c1017d = new C1017d();
            c1017d.mo10301f(this.mApplyButton.minX() - C0892a.m10742a(50.0f));
            c1017d.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.mApplyButton);
            C1014c.m10325a(this.mApplyButton, 500, c1017d);
            C1017d c1017d2 = new C1017d();
            c1017d2.mo10301f(this.mResetButton.maxX() + C0892a.m10742a(50.0f));
            c1017d2.m10314a(255);
            c1017d2.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.mResetButton);
            C1014c.m10325a(this.mResetButton, 500, c1017d2);
        }
    }

    public void hideResetButton() {
        if (this.mResetButton.parent() != null) {
            C1017d c1017d = new C1017d();
            c1017d.mo10301f(0.0f);
            c1017d.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.mApplyButton);
            C1014c.m10325a(this.mApplyButton, 500, c1017d);
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu.6
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    ThemeIconDesignerMenu.this.resetButtonState();
                }
            };
            c1017d2.mo10301f(0.0f);
            c1017d2.m10314a(0);
            c1017d2.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.mResetButton);
            C1014c.m10325a(this.mResetButton, 500, c1017d2);
        }
    }

    public void resetButtonState() {
        this.mResetButton.removeFromParent();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHideComplete() {
        recycle();
    }

    public void exit() {
        this.menu.changeMenu(getParentMenu());
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d
    public void onRequestExit() {
        this.menu.changeMenu(getParentMenu());
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void recycle() {
        super.recycle();
        removeIcon();
        this.mShortcut.textures().clear();
        this.mApplyButton.m5098b();
        resetButtonState();
        this.mSeekBarPreference.mo538g();
        recycleDemoShortcutTexture();
        int m1978b = C3563c.m1978b();
        for (int i = 0; i < m1978b; i++) {
            C3563c.m1976c(i).m1984c();
        }
    }

    public void setIcon(ThemeMenuMixElementPlane themeMenuMixElementPlane) {
        this.mElementPlane = themeMenuMixElementPlane;
    }
}
