package com.tsf.shell.theme.inside.mix.menu.item;

import com.censivn.C3DEngine.b.b.a.d;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import com.tsf.shell.e.e.g.a.f;
import com.tsf.shell.e.e.o;
import com.tsf.shell.e.i.b.e.j;
import com.tsf.shell.manager.o.c;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeIconInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemePreviewInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeWallpaperInfoLayout;

/* loaded from: classes.dex */
public class ThemeInstalledDetailMenu extends f {
    private boolean isShowingMoreLayout;
    private o mApplyButton;
    private l mContainer;
    private com.censivn.C3DEngine.b.b.a.b mContentContainer;
    private d mDetailContainer;
    private ThemeIconInfoLayout mIconLayout;
    private a mKeyListener;
    private l mMainContainer;
    private ThemeMoreInfoLayout mMoreInfoLayout;
    private com.censivn.C3DEngine.b.f.o mNoticTextView;
    private l mOtherContainer = new l();
    private ThemePreviewInfoLayout mPreviewLayout;
    private com.censivn.C3DEngine.b.h.d.a mRingIcon;
    private com.tsf.shell.e.i.b.e.b mShortcut;
    private ThemeElementInfoLayout mThemeElementLayout;
    private ThemeListsManager.ThemeInfo mThemeInfo;
    private ThemeWallpaperInfoLayout mWallpaperLayout;

    public ThemeInstalledDetailMenu() {
        this.mOtherContainer.position().y = com.censivn.C3DEngine.b.b.a.a(-223.0f);
        this.mNoticTextView = new com.censivn.C3DEngine.b.f.o();
        this.mNoticTextView.c(R.string.notic_theme_compatible);
        this.mNoticTextView.d(30);
        this.mNoticTextView.visible(false);
        this.mNoticTextView.a(true);
        setMenuHeight(com.censivn.C3DEngine.b.b.a.a(750.0f));
        this.mKeyListener = new a(this);
        this.mMainContainer = new l();
        this.mRingIcon = new com.censivn.C3DEngine.b.h.d.a(com.censivn.C3DEngine.b.b.a.a(96.0f), R.drawable.ring_small, com.censivn.C3DEngine.b.b.a.a(74.0f));
        this.mRingIcon.setAABBPX(com.censivn.C3DEngine.b.b.a.a(130.0f), com.censivn.C3DEngine.b.b.a.a(130.0f));
        this.mRingIcon.a(R.drawable.ico_info);
        this.mShortcut = new j(com.tsf.shell.manager.o.b.c);
        this.mShortcut.k.a(0).m.y = 0.0f;
        this.mShortcut.k.a(0).f();
        this.mShortcut.aL();
        this.mShortcut.scale().setAll(0.43f, 0.43f, 1.0f);
        this.mContainer = new l();
        this.mApplyButton = new o(R.drawable.button_apply, R.string.theme_apply_theme) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledDetailMenu.1
            @Override // com.tsf.shell.e.e.o
            public void a() {
                ThemeManager.getInstance().setTheme(ThemeInstalledDetailMenu.this.mThemeInfo.packagename);
            }
        };
        c.a(this.mApplyButton, c.h);
        this.mNoticTextView.position().y = com.censivn.C3DEngine.b.b.a.a(45.0f);
        this.mNoticTextView.b(0);
        this.mApplyButton.a(0);
        this.mContentContainer = new com.censivn.C3DEngine.b.b.a.b();
        this.mContentContainer.setAABBPX(0.0f, com.censivn.C3DEngine.b.b.a.a(750.0f));
        this.mPreviewLayout = new ThemePreviewInfoLayout();
        this.mIconLayout = new ThemeIconInfoLayout();
        this.mMoreInfoLayout = new ThemeMoreInfoLayout();
        this.mThemeElementLayout = new ThemeElementInfoLayout();
        this.mWallpaperLayout = new ThemeWallpaperInfoLayout();
        this.mContentContainer.addChild(this.mPreviewLayout);
        this.mContentContainer.addChild(this.mIconLayout);
        this.mContentContainer.addChild(this.mWallpaperLayout);
        this.mContentContainer.addChild(this.mThemeElementLayout);
        this.mDetailContainer = new d() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledDetailMenu.2
            @Override // com.censivn.C3DEngine.b.b.a.d
            public void a(int i, float f) {
                if (f > 1.0f) {
                    f = 1.0f;
                }
                ThemeInstalledDetailMenu.this.mRingIcon.a(f);
            }

            @Override // com.censivn.C3DEngine.b.b.a.d
            public void d(int i) {
                com.censivn.C3DEngine.b.c.c.a(ThemeInstalledDetailMenu.this.mKeyListener);
                ThemeInstalledDetailMenu.this.enterMoreLayout();
            }

            @Override // com.censivn.C3DEngine.b.b.a.d
            public void e(int i) {
                com.censivn.C3DEngine.b.c.c.b(ThemeInstalledDetailMenu.this.mKeyListener);
                ThemeInstalledDetailMenu.this.exitMoreLayout();
            }
        };
        this.mDetailContainer.c(this.mContentContainer);
        this.mDetailContainer.position().y = com.censivn.C3DEngine.b.b.a.a(100.0f);
        this.mContainer.addChild(this.mDetailContainer);
        this.mContainer.addChild(this.mOtherContainer);
        this.mOtherContainer.addChild(this.mApplyButton);
        this.mOtherContainer.addChild(this.mNoticTextView);
        this.mMainContainer.addChild(this.mContainer);
        this.mDetailContainer.b(this.mRingIcon);
        this.mDetailContainer.a(this.mMoreInfoLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterMoreLayout() {
        this.isShowingMoreLayout = true;
        float h = this.mDetailContainer.h();
        x xVar = new x();
        xVar.f(h);
        xVar.a(com.censivn.C3DEngine.b.g.a.a);
        xVar.a(100);
        w.a(this.mOtherContainer);
        w.a(this.mOtherContainer, 500, xVar);
        this.mMoreInfoLayout.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exitMoreLayout() {
        this.isShowingMoreLayout = false;
        x xVar = new x();
        xVar.f(com.censivn.C3DEngine.b.b.a.a(0.0f));
        xVar.a(255);
        xVar.a(com.censivn.C3DEngine.b.g.a.a);
        w.a(this.mOtherContainer);
        w.a(this.mOtherContainer, 500, xVar);
    }

    public void onMainThemeMenuRecycle() {
        this.mIconLayout.getLoader().recycle();
    }

    public void setTheme(ThemeListsManager.ThemeInfo themeInfo) {
        this.mThemeInfo = themeInfo;
        setTitle(themeInfo.name);
        this.mShortcut.k.textures().clear();
        this.mShortcut.k.textures().addElement(themeInfo.getIconTexture());
        addIcon(this.mShortcut);
        this.mPreviewLayout.setTheme(themeInfo);
        this.mWallpaperLayout.setTheme(themeInfo);
        this.mThemeElementLayout.setTheme(themeInfo);
        this.mIconLayout.setTheme(themeInfo);
        this.mMoreInfoLayout.setTheme(themeInfo);
        this.mDetailContainer.j();
        this.mContentContainer.resetPosition();
        if (themeInfo.isSupport30) {
            this.mNoticTextView.visible(false);
            this.mContentContainer.position().y = 0.0f;
            this.mApplyButton.position().y = com.censivn.C3DEngine.b.b.a.a(0.0f);
            return;
        }
        this.mContentContainer.position().y = com.censivn.C3DEngine.b.b.a.a(38.0f);
        this.mNoticTextView.position().y = com.censivn.C3DEngine.b.b.a.a(80.0f);
        this.mApplyButton.position().y = com.censivn.C3DEngine.b.b.a.a(-30.0f);
        this.mNoticTextView.visible(true);
    }

    public ThemeListsManager.ThemeInfo getThemeInfo() {
        return this.mThemeInfo;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getContentContainer() {
        return this.mMainContainer;
    }

    @Override // com.tsf.shell.e.e.g.a.f, com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mNoticTextView.f((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(50.0f)));
        this.mDetailContainer.setAABBPX(0.0f, (-getMenuHeight()) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, getMenuHeight() / 2.0f, 0.0f);
        this.mDetailContainer.k();
        this.mDetailContainer.position().x = com.censivn.C3DEngine.b.b.a.z;
        this.mDetailContainer.a(f, f2, f3, f4);
        super.onLayout(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.e.e.g.a.f, com.tsf.shell.e.e.g.a.e
    public void onShow() {
        super.onShow();
        this.mNoticTextView.f((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(50.0f)));
        this.mDetailContainer.setAABBPX(0.0f, (-getMenuHeight()) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, getMenuHeight() / 2.0f, 0.0f);
        this.mMoreInfoLayout.setAABBPX(com.censivn.C3DEngine.b.b.a.D, getMenuHeight());
        this.mDetailContainer.k();
        this.mDetailContainer.position().x = com.censivn.C3DEngine.b.b.a.z;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onHideComplete() {
        recycle();
        if (this.isShowingMoreLayout) {
            this.mDetailContainer.g();
        }
    }

    public void exit() {
        if (this.isShowingMoreLayout) {
            this.mDetailContainer.g();
        }
        this.menu.changeMenu(getParentMenu());
    }

    @Override // com.tsf.shell.e.e.g.a.f
    public void onRequestExit() {
        if (this.isShowingMoreLayout) {
            this.mDetailContainer.g();
        } else {
            this.menu.changeMenu(getParentMenu());
        }
    }

    @Override // com.tsf.shell.e.e.g.a.f, com.tsf.shell.e.e.g.a.e
    public void recycle() {
        super.recycle();
        removeIcon();
        this.mShortcut.textures().clear();
        this.mThemeInfo = null;
        this.mApplyButton.b();
        this.mNoticTextView.a();
        this.mPreviewLayout.recycle();
        this.mIconLayout.recycle();
        this.mThemeElementLayout.recycle();
        this.mWallpaperLayout.recycle();
        this.mMoreInfoLayout.recycle();
        this.mRingIcon.b();
    }
}
