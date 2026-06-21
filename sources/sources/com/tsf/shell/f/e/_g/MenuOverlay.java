package com.tsf.shell.f.e._g;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.KeyboardHandler;
import com.censivn.C3DEngine.b.c.WindowManager;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class MenuOverlay {
    public static MenuOverlay mCurrentMenu;
    private com.tsf.shell.f.e._g.a.MenuItemBase mCurrentMenuItem;
    private float mHeight;
    private ArrayList<com.tsf.shell.f.e._g.a.MenuActionItem> mMenuItems;
    private float mOffsetMenuHeight;
    public static int COLOR_IMAGE_HUE = 0;
    public static int COLOR_IMAGE_SATURATION = 0;
    public static final float MENU_HEIGHT = 100.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c;
    public static final float MENU_EXTRA_HEIGHT = 115.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c;
    public static final float MENU_ITEM_DISTANCE = 36.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c;
    private boolean isShow = false;
    private boolean isBlurModeOn = false;
    private MenuItemHeader mExtraMenuContainer = new MenuItemHeader(com.censivn.C3DEngine.b.b.ScreenConstants.D, MENU_EXTRA_HEIGHT);
    private com.tsf.shell.f.e._g.MenuClassButton mClassMenu = new com.tsf.shell.f.e._g.MenuClassButton(this, MENU_ITEM_DISTANCE);
    private a mKeyListener = new a();
    private b mSceneEventListener = new MenuContainer();
    private BaseRenderable mContainer = new BaseRenderable();
    private BaseRenderable mAnimationContainer = new BaseRenderable();
    private BaseRenderable mMenuContainer = new BaseRenderable();
    private BaseRenderable mContentContainer = new BaseRenderable();
    private GridRenderable mBarBackground = new GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.D, 0.0f, false) { // from class: com.tsf.shell.f.e._g.MenuOverlay.3
        @Override // com.censivn.C3DEngine.b.f.GridRenderable
        public void b(float f) {
            float f2 = MenuOverlay.MENU_HEIGHT + com.censivn.C3DEngine.b.b.ScreenConstants.K + MenuOverlay.this.mOffsetMenuHeight + f;
            float f3 = (-f2) - MenuOverlay.MENU_HEIGHT;
            float f4 = MenuOverlay.MENU_HEIGHT;
            points().pxY(2, MenuOverlay.MENU_HEIGHT);
            points().pxY(3, MenuOverlay.MENU_HEIGHT);
            points().pxY(0, (-f2) - MenuOverlay.MENU_HEIGHT);
            points().pxY(1, (-f2) - MenuOverlay.MENU_HEIGHT);
            calAABB();
            setAABBPX(com.censivn.C3DEngine.b.b.ScreenConstants.z, f3, 0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.A, f4, 0.0f);
        }
    };

    public static void onTempleteShow() {
        if (mCurrentMenu != null) {
            mCurrentMenu.templeteShow();
        }
    }

    public static void onTempleteHide() {
        if (mCurrentMenu != null) {
            mCurrentMenu.templeteHide();
        }
    }

    public static void hideAll() {
        if (mCurrentMenu != null) {
            mCurrentMenu.hide();
        }
    }

    public void enableBlurMode(TextureElement textureElement) {
        if (!this.isBlurModeOn) {
            this.isBlurModeOn = true;
            this.mBarBackground.setDefaultColor(com.tsf.shell.manager.o.ThemeColorConstants.p);
            this.mBarBackground.textures().clear();
            this.mBarBackground.textures().addElement(textureElement);
            if (com.tsf.shell.manager.f.WorkspaceScene.b == 3) {
            }
        }
    }

    public void updateBlurModeUV() {
        if (this.isBlurModeOn) {
            float f = this.mMenuContainer.position().y + this.mContainer.position().y;
            float f2 = com.censivn.C3DEngine.b.b.ScreenConstants.G;
            float fPxY = (f2 / 2.0f) + this.mBarBackground.points().pxY(0) + f + this.mOffsetMenuHeight;
            float fPxY2 = f + this.mBarBackground.points().pxY(2) + (f2 / 2.0f) + this.mOffsetMenuHeight;
            this.mBarBackground.uvs().setV(0, fPxY / f2);
            this.mBarBackground.uvs().setV(1, fPxY / f2);
            this.mBarBackground.uvs().setV(2, fPxY2 / f2);
            this.mBarBackground.uvs().setV(3, fPxY2 / f2);
        }
    }

    public void disableBlurMode() {
        if (this.isBlurModeOn) {
            this.isBlurModeOn = false;
            this.mBarBackground.setDefaultColor(com.tsf.shell.manager.o.ThemeColorConstants.o);
            this.mBarBackground.textures().clear();
        }
    }

    public boolean isShow() {
        return this.isShow;
    }

    public void show() {
        if (mCurrentMenu == null || mCurrentMenu == this) {
            mCurrentMenu = this;
            if (!this.isShow) {
                Iterator<com.tsf.shell.f.e._g.a.MenuActionItem> it = this.mMenuItems.iterator();
                while (it.hasNext()) {
                    it.next().getTitleIcon().i();
                }
                com.tsf.shell.manager.app.AppListModel.c(this);
                com.censivn.C3DEngine.b.c.KeyboardHandler.a(this.mKeyListener);
                com.tsf.shell.manager.app.ObserverManager.a(this.mSceneEventListener);
                showAnimation(0);
                this.mClassMenu.a();
                resetSize();
                return;
            }
            return;
        }
        mCurrentMenu.hide();
    }

    public void show(int i) {
        if (mCurrentMenu == null || mCurrentMenu == this) {
            mCurrentMenu = this;
            if (!this.isShow) {
                Iterator<com.tsf.shell.f.e._g.a.MenuActionItem> it = this.mMenuItems.iterator();
                while (it.hasNext()) {
                    it.next().getTitleIcon().i();
                }
                com.tsf.shell.manager.app.AppListModel.c(this);
                com.censivn.C3DEngine.b.c.KeyboardHandler.a(this.mKeyListener);
                com.tsf.shell.manager.app.ObserverManager.a(this.mSceneEventListener);
                showAnimation(i);
                this.mClassMenu.a();
                resetSize();
                return;
            }
            return;
        }
        mCurrentMenu.hide();
    }

    public void hide() {
        if (this.isShow) {
            if (this.mMenuItems.contains(this.mCurrentMenuItem)) {
                this.isShow = false;
                com.tsf.shell.manager.app.AppListModel.b(this);
                com.censivn.C3DEngine.b.c.KeyboardHandler.b(this.mKeyListener);
                com.tsf.shell.manager.app.ObserverManager.b(this.mSceneEventListener);
                hideAnimation();
                return;
            }
            changeMenu(this.mCurrentMenuItem.getParentMenu());
        }
    }

    private void showAnimation(int i) {
        if (!com.tsf.shell.manager.b.ConfigManager.ai()) {
            enableBlurMode(com.tsf.shell.manager.app.DataCoordinator.a(this));
        }
        onShow();
        this.mContainer.mouseEnabled(false);
        this.mContainer.setFocus();
        this.isShow = true;
        changeMenu(getFirstAvailableMenu(i));
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._g.MenuOverlay.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                MenuOverlay.this.mContainer.mouseEnabled(true);
            }

            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a(float f) {
                MenuOverlay.this.updateBlurModeUV();
            }
        };
        dVar.h(this.mHeight);
        dVar.a(255);
        dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.mMenuContainer);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.mMenuContainer, 500, dVar);
        this.mContainer.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.C;
        this.mContainer.removeFromParent();
        com.tsf.shell.manager.app.TaskScheduler.a(this.mContainer);
    }

    private com.tsf.shell.f.e._g.a.MenuActionItem getFirstAvailableMenu(int i) {
        int i2 = 0;
        for (com.tsf.shell.f.e._g.a.MenuActionItem bVar : this.mMenuItems) {
            if (!bVar.isEnable() || i2 != i) {
                i2 = bVar.isEnable() ? i2 + 1 : i2;
            } else {
                return bVar;
            }
        }
        return this.mMenuItems.get(0);
    }

    private void hideAnimation() {
        onHide();
        this.mExtraMenuContainer.b();
        this.mContainer.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._g.MenuOverlay.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                com.tsf.shell.manager.app.TaskScheduler.b(MenuOverlay.this.mContainer);
                MenuOverlay.this.mCurrentMenuItem.hide(false);
                MenuOverlay.this.mCurrentMenuItem = null;
                Iterator it = MenuOverlay.this.mMenuItems.iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.f.e._g.a.MenuItemBase) it.next()).recycle();
                }
                MenuOverlay.mCurrentMenu = null;
                MenuOverlay.this.onHideComplete();
                com.tsf.shell.manager.app.DataCoordinator.b(MenuOverlay.this);
                MenuOverlay.this.disableBlurMode();
            }

            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a(float f) {
                MenuOverlay.this.updateBlurModeUV();
            }
        };
        dVar.a(0);
        dVar.h(-MENU_HEIGHT);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.mMenuContainer);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.mMenuContainer, 450, dVar);
    }

    public float getHeight() {
        return this.mHeight;
    }

    public ArrayList<com.tsf.shell.f.e._g.a.MenuActionItem> getMenuItems() {
        return this.mMenuItems;
    }

    public MenuOverlay(float f) {
        this.mHeight = f;
        if (com.tsf.shell.manager.b.ConfigManager.ai()) {
            this.mBarBackground.setDefaultColor(new Color4(38, 38, 38, 230));
        }
        this.mBarBackground.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.mBarBackground));
        this.mBarBackground.useVBO(false);
        this.mBarBackground.b(this.mHeight);
        this.mClassMenu.position().y = MENU_HEIGHT / 2.0f;
        this.mContentContainer.position().y = (-this.mHeight) / 2.0f;
        this.mAnimationContainer.addChild(this.mBarBackground);
        this.mAnimationContainer.addChild(this.mClassMenu);
        this.mMenuContainer.addChild(this.mAnimationContainer);
        this.mMenuContainer.addChild(this.mContentContainer);
        this.mContainer.addChild(this.mMenuContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBackgroundHeight() {
        this.mBarBackground.b(this.mHeight);
    }

    public com.tsf.shell.f.e._g.MenuClassButton getClassMenu() {
        return this.mClassMenu;
    }

    protected void setMenuItems(ArrayList<com.tsf.shell.f.e._g.a.MenuActionItem> arrayList) {
        this.mMenuItems = arrayList;
        this.mClassMenu.a(arrayList);
        for (com.tsf.shell.f.e._g.a.MenuActionItem bVar : arrayList) {
            bVar.setMenu(this);
            bVar.onLayout(com.censivn.C3DEngine.b.b.ScreenConstants.z, (-this.mHeight) / 2.0f, com.censivn.C3DEngine.b.b.ScreenConstants.A, this.mHeight / 2.0f);
            if (bVar.getContentContainer() != null) {
                bVar.reset();
            }
        }
    }

    public void templeteHide() {
        if (this.isShow) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            float f = -this.mOffsetMenuHeight;
            if (f != 0.0f) {
            }
            dVar.h(f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.mMenuContainer);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.mMenuContainer, 450, dVar);
            com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._g.MenuOverlay.4
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    MenuOverlay.this.mContentContainer.visible(false);
                    MenuOverlay.this.mExtraMenuContainer.visible(false);
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f2) {
                    MenuOverlay.this.updateBlurModeUV();
                    MenuOverlay.this.mExtraMenuContainer.alpha(255.0f * (1.0f - f2));
                }
            };
            dVar2.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.mContentContainer);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.mContentContainer, 450, dVar2);
        }
    }

    public void templeteShow() {
        if (this.isShow) {
            this.mExtraMenuContainer.visible(true);
            this.mContentContainer.visible(true);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._g.MenuOverlay.5
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    MenuOverlay.this.mContainer.mouseEnabled(true);
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f) {
                    MenuOverlay.this.updateBlurModeUV();
                    MenuOverlay.this.mExtraMenuContainer.alpha(255.0f * f);
                }
            };
            dVar.h(this.mHeight);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.mMenuContainer);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.mMenuContainer, 450, dVar);
            com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar2.a(255);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.mContentContainer);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.mContentContainer, 450, dVar2);
        }
    }

    public void changeMenu(com.tsf.shell.f.e._g.a.MenuItemBase cVar) {
        cVar.setMenu(this);
        if (this.mCurrentMenuItem != cVar && cVar.getContentContainer() != null && cVar.allowChoice()) {
            if (this.mCurrentMenuItem != null) {
                this.mCurrentMenuItem.hide(true);
            }
            this.mCurrentMenuItem = cVar;
            if (!this.mContentContainer.containsChild(cVar.getContentContainer())) {
                this.mContentContainer.addChild(cVar.getContentContainer());
            }
            this.mCurrentMenuItem.show(true);
            onMenuChanged(this.mCurrentMenuItem);
            setOption(cVar);
            if (cVar instanceof com.tsf.shell.f.e._g.a.MenuActionItem) {
                this.mClassMenu.a((com.tsf.shell.f.e._g.a.MenuActionItem) cVar);
            }
        }
    }

    public com.tsf.shell.f.e._g.a.MenuItemBase getCurrentMenuItem() {
        return this.mCurrentMenuItem;
    }

    public void setOption(com.tsf.shell.f.e._g.a.MenuItemBase cVar) {
        showOption(cVar.getMenuContainer());
    }

    public void showOption(IRenderable iVar) {
        boolean z;
        final float menuHeight;
        if (!this.mExtraMenuContainer.containsChild(iVar)) {
            if (iVar != null) {
                float menuHeight2 = MENU_EXTRA_HEIGHT;
                if (this.mCurrentMenuItem.getMenuHeight() != 0.0f && this.mCurrentMenuItem.getMenuHeight() != this.mHeight) {
                    menuHeight2 += this.mCurrentMenuItem.getMenuHeight() - this.mHeight;
                }
                this.mExtraMenuContainer.position().y = (-MENU_EXTRA_HEIGHT) / 2.0f;
                this.mExtraMenuContainer.removeFromParent();
                this.mAnimationContainer.addChild(this.mExtraMenuContainer);
                this.mExtraMenuContainer.addChild(iVar);
                menuHeight = menuHeight2;
                z = true;
            } else {
                z = false;
                menuHeight = (this.mCurrentMenuItem.getMenuHeight() == 0.0f || this.mCurrentMenuItem.getMenuHeight() == this.mHeight) ? 0.0f : (this.mCurrentMenuItem.getMenuHeight() - this.mHeight) + 0.0f;
            }
            if (z) {
                this.mExtraMenuContainer.a();
            } else {
                this.mExtraMenuContainer.b();
            }
            if (this.mOffsetMenuHeight != menuHeight) {
                final float f = this.mOffsetMenuHeight;
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._g.MenuOverlay.6
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a(float f2) {
                        MenuOverlay.this.mOffsetMenuHeight = f + ((menuHeight - f) * f2);
                        MenuOverlay.this.updateBackgroundHeight();
                        MenuOverlay.this.updateBlurModeUV();
                    }
                };
                dVar.h(menuHeight);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.mAnimationContainer);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.mAnimationContainer, VEasing.Linear.easeNone, dVar);
            }
        }
    }

    public void resuemCurrentOption() {
        if (this.mCurrentMenuItem != null) {
            setOption(this.mCurrentMenuItem);
        }
    }

    public void onLayout(float f, float f2, float f3, float f4) {
    }

    public void onShow() {
    }

    public void onHide() {
    }

    public void onHideComplete() {
    }

    public void onMenuChanged(com.tsf.shell.f.e._g.a.MenuItemBase cVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetSize() {
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.mContainer);
        this.mContainer.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.C;
        this.mBarBackground.a(com.censivn.C3DEngine.b.b.ScreenConstants.D);
        this.mExtraMenuContainer.a(com.censivn.C3DEngine.b.b.ScreenConstants.D);
        this.mBarBackground.calAABB();
        Iterator<com.tsf.shell.f.e._g.a.MenuActionItem> it = this.mMenuItems.iterator();
        while (it.hasNext()) {
            it.next().onLayout(com.censivn.C3DEngine.b.b.ScreenConstants.z, (-this.mHeight) / 2.0f, com.censivn.C3DEngine.b.b.ScreenConstants.A, this.mHeight / 2.0f);
        }
        this.mClassMenu.b();
        onLayout(com.censivn.C3DEngine.b.b.ScreenConstants.z, (-this.mHeight) / 2.0f, com.censivn.C3DEngine.b.b.ScreenConstants.A, this.mHeight / 2.0f);
    }

    public float getScreenFreeSpaceBottom() {
        return com.censivn.C3DEngine.b.b.ScreenConstants.B - (com.censivn.C3DEngine.b.b.ScreenConstants.E - getHeight());
    }

    public float getScreenFreeSpaceCenter() {
        return com.censivn.C3DEngine.b.b.ScreenConstants.B - ((com.censivn.C3DEngine.b.b.ScreenConstants.E - getHeight()) / 2.0f);
    }

    class a implements com.censivn.C3DEngine.b.c.KeyboardHandler.a {
        a() {
        }

        @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
        public void a(int i, KeyEvent keyEvent) {
            if (i == 4) {
                MenuOverlay.this.hide();
            }
        }

        @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
        public void b(int i, KeyEvent keyEvent) {
        }
    }

    class b implements WindowManager.a {
        b() {
        }

        @Override // com.censivn.C3DEngine.b.c.WindowManager.a
        public void a(int i, int i2, int i3, int i4) {
            MenuOverlay.this.resetSize();
        }
    }
}
