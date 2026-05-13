package com.tsf.shell.theme.inside.mix.menu.item;

import android.view.KeyEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0895b;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0897d;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p050d.C1051a;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p118e.C2637l;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2583d;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeIconInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemePreviewInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeWallpaperInfoLayout;
/* loaded from: classes.dex */
public class ThemeInstalledDetailMenu extends C2583d {
    private boolean isShowingMoreLayout;
    private C2637l mApplyButton;
    private C0980j mContainer;
    private C0895b mContentContainer;
    private C0897d mDetailContainer;
    private ThemeIconInfoLayout mIconLayout;
    private C4131a mKeyListener;
    private C0980j mMainContainer;
    private ThemeMoreInfoLayout mMoreInfoLayout;
    private C0984m mNoticTextView;
    private C0980j mOtherContainer = new C0980j();
    private ThemePreviewInfoLayout mPreviewLayout;
    private C1051a mRingIcon;
    private AbstractC3208b mShortcut;
    private ThemeElementInfoLayout mThemeElementLayout;
    private ThemeListsManager.ThemeInfo mThemeInfo;
    private ThemeWallpaperInfoLayout mWallpaperLayout;

    /* renamed from: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledDetailMenu$a */
    /* loaded from: classes.dex */
    class C4131a implements C0915b.InterfaceC0918a {
        C4131a() {
        }

        @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: a */
        public void mo727a(int i, KeyEvent keyEvent) {
            if (i == 4) {
                ThemeInstalledDetailMenu.this.mDetailContainer.m10695g();
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: b */
        public void mo726b(int i, KeyEvent keyEvent) {
        }
    }

    public ThemeInstalledDetailMenu() {
        this.mOtherContainer.position().f2527y = C0892a.m10742a(-223.0f);
        this.mNoticTextView = new C0984m();
        this.mNoticTextView.m10349c(C1306b.C1315i.notic_theme_compatible);
        this.mNoticTextView.m10347d(30);
        this.mNoticTextView.visible(false);
        this.mNoticTextView.m10354a(true);
        setMenuHeight(C0892a.m10742a(750.0f));
        this.mKeyListener = new C4131a();
        this.mMainContainer = new C0980j();
        this.mRingIcon = new C1051a(C0892a.m10742a(96.0f), C1306b.C1310d.ring_small, C0892a.m10742a(74.0f));
        this.mRingIcon.setAABBPX(C0892a.m10742a(130.0f), C0892a.m10742a(130.0f));
        this.mRingIcon.m10111a(C1306b.C1310d.ico_info);
        this.mShortcut = new C3224h(C3566b.f11841c);
        this.mShortcut.f10495k.m10456a(0).f2853m.f2527y = 0.0f;
        this.mShortcut.f10495k.m10456a(0).m10411f();
        this.mShortcut.m3154aL();
        this.mShortcut.scale().setAll(0.43f, 0.43f, 1.0f);
        this.mContainer = new C0980j();
        this.mApplyButton = new C2637l(C1306b.C1310d.button_apply, C1306b.C1315i.theme_apply_theme) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledDetailMenu.1
            @Override // com.tsf.shell.p096f.p118e.C2637l
            /* renamed from: a */
            public void mo731a() {
                ThemeManager.getInstance().setTheme(ThemeInstalledDetailMenu.this.mThemeInfo.packagename);
            }
        };
        C3567c.m1967a(this.mApplyButton, C3567c.f11849h);
        this.mNoticTextView.position().f2527y = C0892a.m10742a(45.0f);
        this.mNoticTextView.m10352b(0);
        this.mApplyButton.m5099a(0);
        this.mContentContainer = new C0895b();
        this.mContentContainer.setAABBPX(0.0f, C0892a.m10742a(750.0f));
        this.mPreviewLayout = new ThemePreviewInfoLayout();
        this.mIconLayout = new ThemeIconInfoLayout();
        this.mMoreInfoLayout = new ThemeMoreInfoLayout();
        this.mThemeElementLayout = new ThemeElementInfoLayout();
        this.mWallpaperLayout = new ThemeWallpaperInfoLayout();
        this.mContentContainer.addChild(this.mPreviewLayout);
        this.mContentContainer.addChild(this.mIconLayout);
        this.mContentContainer.addChild(this.mWallpaperLayout);
        this.mContentContainer.addChild(this.mThemeElementLayout);
        this.mDetailContainer = new C0897d() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledDetailMenu.2
            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: a */
            public void mo730a(int i, float f) {
                if (f > 1.0f) {
                    f = 1.0f;
                }
                ThemeInstalledDetailMenu.this.mRingIcon.m10112a(f);
            }

            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: d */
            public void mo729d(int i) {
                C0915b.m10597a(ThemeInstalledDetailMenu.this.mKeyListener);
                ThemeInstalledDetailMenu.this.enterMoreLayout();
            }

            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: e */
            public void mo728e(int i) {
                C0915b.m10594b(ThemeInstalledDetailMenu.this.mKeyListener);
                ThemeInstalledDetailMenu.this.exitMoreLayout();
            }
        };
        this.mDetailContainer.m10704c(this.mContentContainer);
        this.mDetailContainer.position().f2527y = C0892a.m10742a(100.0f);
        this.mContainer.addChild(this.mDetailContainer);
        this.mContainer.addChild(this.mOtherContainer);
        this.mOtherContainer.addChild(this.mApplyButton);
        this.mOtherContainer.addChild(this.mNoticTextView);
        this.mMainContainer.addChild(this.mContainer);
        this.mDetailContainer.m10710b(this.mRingIcon);
        this.mDetailContainer.m10715a(this.mMoreInfoLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterMoreLayout() {
        this.isShowingMoreLayout = true;
        float m10693h = this.mDetailContainer.m10693h();
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(m10693h);
        c1017d.m10313a(C0986a.f2946a);
        c1017d.m10314a(100);
        C1014c.m10326a(this.mOtherContainer);
        C1014c.m10325a(this.mOtherContainer, 500, c1017d);
        this.mMoreInfoLayout.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exitMoreLayout() {
        this.isShowingMoreLayout = false;
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(C0892a.m10742a(0.0f));
        c1017d.m10314a(255);
        c1017d.m10313a(C0986a.f2946a);
        C1014c.m10326a(this.mOtherContainer);
        C1014c.m10325a(this.mOtherContainer, 500, c1017d);
    }

    public void onMainThemeMenuRecycle() {
        this.mIconLayout.getLoader().recycle();
    }

    public void setTheme(ThemeListsManager.ThemeInfo themeInfo) {
        this.mThemeInfo = themeInfo;
        setTitle(themeInfo.name);
        this.mShortcut.f10495k.textures().clear();
        this.mShortcut.f10495k.textures().addElement(themeInfo.getIconTexture());
        addIcon(this.mShortcut);
        this.mPreviewLayout.setTheme(themeInfo);
        this.mWallpaperLayout.setTheme(themeInfo);
        this.mThemeElementLayout.setTheme(themeInfo);
        this.mIconLayout.setTheme(themeInfo);
        this.mMoreInfoLayout.setTheme(themeInfo);
        this.mDetailContainer.m10689j();
        this.mContentContainer.resetPosition();
        if (themeInfo.isSupport30) {
            this.mNoticTextView.visible(false);
            this.mContentContainer.position().f2527y = 0.0f;
            this.mApplyButton.position().f2527y = C0892a.m10742a(0.0f);
            return;
        }
        this.mContentContainer.position().f2527y = C0892a.m10742a(38.0f);
        this.mNoticTextView.position().f2527y = C0892a.m10742a(80.0f);
        this.mApplyButton.position().f2527y = C0892a.m10742a(-30.0f);
        this.mNoticTextView.visible(true);
    }

    public ThemeListsManager.ThemeInfo getThemeInfo() {
        return this.mThemeInfo;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.mMainContainer;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mNoticTextView.m10344f((int) (C0892a.f2553D - C0892a.m10742a(50.0f)));
        this.mDetailContainer.setAABBPX(0.0f, (-getMenuHeight()) / 2.0f, 0.0f, C0892a.f2553D, getMenuHeight() / 2.0f, 0.0f);
        this.mDetailContainer.m10687k();
        this.mDetailContainer.position().f2526x = C0892a.f2590z;
        this.mDetailContainer.m10720a(f, f2, f3, f4);
        super.onLayout(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        super.onShow();
        this.mNoticTextView.m10344f((int) (C0892a.f2553D - C0892a.m10742a(50.0f)));
        this.mDetailContainer.setAABBPX(0.0f, (-getMenuHeight()) / 2.0f, 0.0f, C0892a.f2553D, getMenuHeight() / 2.0f, 0.0f);
        this.mMoreInfoLayout.setAABBPX(C0892a.f2553D, getMenuHeight());
        this.mDetailContainer.m10687k();
        this.mDetailContainer.position().f2526x = C0892a.f2590z;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHideComplete() {
        recycle();
        if (this.isShowingMoreLayout) {
            this.mDetailContainer.m10695g();
        }
    }

    public void exit() {
        if (this.isShowingMoreLayout) {
            this.mDetailContainer.m10695g();
        }
        this.menu.changeMenu(getParentMenu());
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d
    public void onRequestExit() {
        if (this.isShowingMoreLayout) {
            this.mDetailContainer.m10695g();
        } else {
            this.menu.changeMenu(getParentMenu());
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void recycle() {
        super.recycle();
        removeIcon();
        this.mShortcut.textures().clear();
        this.mThemeInfo = null;
        this.mApplyButton.m5098b();
        this.mNoticTextView.m10358a();
        this.mPreviewLayout.recycle();
        this.mIconLayout.recycle();
        this.mThemeElementLayout.recycle();
        this.mWallpaperLayout.recycle();
        this.mMoreInfoLayout.recycle();
        this.mRingIcon.m10110b();
    }
}
