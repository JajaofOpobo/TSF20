package com.tsf.shell.theme.inside.mix.menu.item;

import android.view.KeyEvent;
import com.censivn.C3DEngine.b.b.a.b;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.f.e.g.a.d;
import com.tsf.shell.f.e.l;
import com.tsf.shell.f.i.b.e.h;
import com.tsf.shell.manager.o.c;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeIconInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemePreviewInfoLayout;
import com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeWallpaperInfoLayout;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeInstalledDetailMenu extends d {
    private boolean isShowingMoreLayout;
    private l mApplyButton;
    private j mContainer;
    private b mContentContainer;
    private com.censivn.C3DEngine.b.b.a.d mDetailContainer;
    private ThemeIconInfoLayout mIconLayout;
    private a mKeyListener;
    private j mMainContainer;
    private ThemeMoreInfoLayout mMoreInfoLayout;
    private m mNoticTextView;
    private j mOtherContainer = new j();
    private ThemePreviewInfoLayout mPreviewLayout;
    private com.censivn.C3DEngine.b.h.d.a mRingIcon;
    private com.tsf.shell.f.i.b.e.b mShortcut;
    private ThemeElementInfoLayout mThemeElementLayout;
    private ThemeListsManager.ThemeInfo mThemeInfo;
    private ThemeWallpaperInfoLayout mWallpaperLayout;

    class a implements b.a {
        a() {
        }

        @Override // com.censivn.C3DEngine.b.c.b.a
        public void a(int i, KeyEvent keyEvent) {
            if (i == 4) {
                ThemeInstalledDetailMenu.this.mDetailContainer.g();
            }
        }

        @Override // com.censivn.C3DEngine.b.c.b.a
        public void b(int i, KeyEvent keyEvent) {
        }
    }

    public ThemeInstalledDetailMenu() {
        this.mOtherContainer.position().y = com.censivn.C3DEngine.b.b.a.a(-223.0f);
        this.mNoticTextView = new m();
        this.mNoticTextView.c(b.i.notic_theme_compatible);
        this.mNoticTextView.d(30);
        this.mNoticTextView.visible(false);
        this.mNoticTextView.a(true);
        setMenuHeight(com.censivn.C3DEngine.b.b.a.a(750.0f));
        this.mKeyListener = new a();
        this.mMainContainer = new j();
        this.mRingIcon = new com.censivn.C3DEngine.b.h.d.a(com.censivn.C3DEngine.b.b.a.a(96.0f), b.d.ring_small, com.censivn.C3DEngine.b.b.a.a(74.0f));
        this.mRingIcon.setAABBPX(com.censivn.C3DEngine.b.b.a.a(130.0f), com.censivn.C3DEngine.b.b.a.a(130.0f));
        this.mRingIcon.a(b.d.ico_info);
        this.mShortcut = new h(com.tsf.shell.manager.o.b.c);
        this.mShortcut.k.a(0).m.y = 0.0f;
        this.mShortcut.k.a(0).f();
        this.mShortcut.aL();
        this.mShortcut.scale().setAll(0.43f, 0.43f, 1.0f);
        this.mContainer = new j();
        this.mApplyButton = new l(b.d.button_apply, b.i.theme_apply_theme) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledDetailMenu.1
            @Override // com.tsf.shell.f.e.l
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
        this.mDetailContainer = new com.censivn.C3DEngine.b.b.a.d() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledDetailMenu.2
            @Override // com.censivn.C3DEngine.b.b.a.d
            public void a(int i, float f) {
                if (f > 1.0f) {
                    f = 1.0f;
                }
                ThemeInstalledDetailMenu.this.mRingIcon.a(f);
            }

            @Override // com.censivn.C3DEngine.b.b.a.d
            public void d(int i) {
                com.censivn.C3DEngine.b.c.b.a(ThemeInstalledDetailMenu.this.mKeyListener);
                ThemeInstalledDetailMenu.this.enterMoreLayout();
            }

            @Override // com.censivn.C3DEngine.b.b.a.d
            public void e(int i) {
                com.censivn.C3DEngine.b.c.b.b(ThemeInstalledDetailMenu.this.mKeyListener);
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
        float fH = this.mDetailContainer.h();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(fH);
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        dVar.a(100);
        com.censivn.C3DEngine.b.g.c.a(this.mOtherContainer);
        com.censivn.C3DEngine.b.g.c.a(this.mOtherContainer, 500, dVar);
        this.mMoreInfoLayout.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exitMoreLayout() {
        this.isShowingMoreLayout = false;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(com.censivn.C3DEngine.b.b.a.a(0.0f));
        dVar.a(255);
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        com.censivn.C3DEngine.b.g.c.a(this.mOtherContainer);
        com.censivn.C3DEngine.b.g.c.a(this.mOtherContainer, 500, dVar);
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

    @Override // com.tsf.shell.f.e.g.a.c
    public j getContentContainer() {
        return this.mMainContainer;
    }

    @Override // com.tsf.shell.f.e.g.a.d, com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mNoticTextView.f((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(50.0f)));
        this.mDetailContainer.setAABBPX(0.0f, (-getMenuHeight()) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, getMenuHeight() / 2.0f, 0.0f);
        this.mDetailContainer.k();
        this.mDetailContainer.position().x = com.censivn.C3DEngine.b.b.a.z;
        this.mDetailContainer.a(f, f2, f3, f4);
        super.onLayout(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e.g.a.d, com.tsf.shell.f.e.g.a.c
    public void onShow() {
        super.onShow();
        this.mNoticTextView.f((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(50.0f)));
        this.mDetailContainer.setAABBPX(0.0f, (-getMenuHeight()) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, getMenuHeight() / 2.0f, 0.0f);
        this.mMoreInfoLayout.setAABBPX(com.censivn.C3DEngine.b.b.a.D, getMenuHeight());
        this.mDetailContainer.k();
        this.mDetailContainer.position().x = com.censivn.C3DEngine.b.b.a.z;
    }

    @Override // com.tsf.shell.f.e.g.a.c
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

    @Override // com.tsf.shell.f.e.g.a.d
    public void onRequestExit() {
        if (this.isShowingMoreLayout) {
            this.mDetailContainer.g();
        } else {
            this.menu.changeMenu(getParentMenu());
        }
    }

    @Override // com.tsf.shell.f.e.g.a.d, com.tsf.shell.f.e.g.a.c
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
