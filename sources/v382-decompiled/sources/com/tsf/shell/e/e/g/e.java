package com.tsf.shell.e.e.g;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e {
    public static e mCurrentMenu;
    private com.tsf.shell.e.e.g.a.e mCurrentMenuItem;
    private float mHeight;
    private ArrayList mMenuItems;
    private float mOffsetMenuHeight;
    public static int COLOR_IMAGE_HUE = 0;
    public static int COLOR_IMAGE_SATURATION = 0;
    public static final float MENU_HEIGHT = 100.0f * com.censivn.C3DEngine.b.b.a.c;
    public static final float MENU_EXTRA_HEIGHT = 115.0f * com.censivn.C3DEngine.b.b.a.c;
    public static final float MENU_ITEM_DISTANCE = 36.0f * com.censivn.C3DEngine.b.b.a.c;
    private boolean isShow = false;
    private boolean isBlurModeOn = false;
    private d mExtraMenuContainer = new d(com.censivn.C3DEngine.b.b.a.D, MENU_EXTRA_HEIGHT);
    private a mClassMenu = new a(this, MENU_ITEM_DISTANCE);
    private f mKeyListener = new f(this);
    private g mSceneEventListener = new g(this);
    private l mContainer = new l();
    private l mAnimationContainer = new l();
    private l mMenuContainer = new l();
    private l mContentContainer = new l();
    private m mBarBackground = new m(com.censivn.C3DEngine.b.b.a.D, 0.0f, false) { // from class: com.tsf.shell.e.e.g.e.3
        @Override // com.censivn.C3DEngine.b.f.m
        public void b(float f) {
            float f2 = e.MENU_HEIGHT + com.censivn.C3DEngine.b.b.a.K + e.this.mOffsetMenuHeight + f;
            float f3 = (-f2) - e.MENU_HEIGHT;
            float f4 = e.MENU_HEIGHT;
            points().pxY(2, e.MENU_HEIGHT);
            points().pxY(3, e.MENU_HEIGHT);
            points().pxY(0, (-f2) - e.MENU_HEIGHT);
            points().pxY(1, (-f2) - e.MENU_HEIGHT);
            calAABB();
            setAABBPX(com.censivn.C3DEngine.b.b.a.z, f3, 0.0f, com.censivn.C3DEngine.b.b.a.A, f4, 0.0f);
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
            this.mBarBackground.setDefaultColor(com.tsf.shell.manager.o.c.p);
            this.mBarBackground.textures().clear();
            this.mBarBackground.textures().addElement(textureElement);
            int i = com.tsf.shell.manager.f.b.b;
        }
    }

    public void updateBlurModeUV() {
        if (this.isBlurModeOn) {
            float f = this.mMenuContainer.position().y + this.mContainer.position().y;
            float f2 = com.censivn.C3DEngine.b.b.a.G;
            float pxY = (f2 / 2.0f) + this.mBarBackground.points().pxY(0) + f + this.mOffsetMenuHeight;
            float pxY2 = f + this.mBarBackground.points().pxY(2) + (f2 / 2.0f) + this.mOffsetMenuHeight;
            this.mBarBackground.uvs().setV(0, pxY / f2);
            this.mBarBackground.uvs().setV(1, pxY / f2);
            this.mBarBackground.uvs().setV(2, pxY2 / f2);
            this.mBarBackground.uvs().setV(3, pxY2 / f2);
        }
    }

    public void disableBlurMode() {
        if (this.isBlurModeOn) {
            this.isBlurModeOn = false;
            this.mBarBackground.setDefaultColor(com.tsf.shell.manager.o.c.o);
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
                Iterator it = this.mMenuItems.iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.e.e.g.a.d) it.next()).getTitleIcon().i();
                }
                com.tsf.shell.manager.a.c.c(this);
                com.censivn.C3DEngine.b.c.c.a(this.mKeyListener);
                com.tsf.shell.manager.a.b.a(this.mSceneEventListener);
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
                Iterator it = this.mMenuItems.iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.e.e.g.a.d) it.next()).getTitleIcon().i();
                }
                com.tsf.shell.manager.a.c.c(this);
                com.censivn.C3DEngine.b.c.c.a(this.mKeyListener);
                com.tsf.shell.manager.a.b.a(this.mSceneEventListener);
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
                com.tsf.shell.manager.a.c.b(this);
                com.censivn.C3DEngine.b.c.c.b(this.mKeyListener);
                com.tsf.shell.manager.a.b.b(this.mSceneEventListener);
                hideAnimation();
                return;
            }
            changeMenu(this.mCurrentMenuItem.getParentMenu());
        }
    }

    private void showAnimation(int i) {
        if (!com.tsf.shell.manager.b.g.ag()) {
            enableBlurMode(com.tsf.shell.manager.a.e.a(this));
        }
        onShow();
        this.mContainer.mouseEnabled(false);
        this.mContainer.setFocus();
        this.isShow = true;
        changeMenu(getFirstAvailableMenu(i));
        x xVar = new x() { // from class: com.tsf.shell.e.e.g.e.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                e.this.mContainer.mouseEnabled(true);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                e.this.updateBlurModeUV();
            }
        };
        xVar.h(this.mHeight);
        xVar.a(255);
        xVar.a(com.censivn.C3DEngine.b.g.a.a);
        w.a(this.mMenuContainer);
        w.a(this.mMenuContainer, 500, xVar);
        this.mContainer.position().y = com.censivn.C3DEngine.b.b.a.C;
        this.mContainer.removeFromParent();
        com.tsf.shell.manager.a.j.a(this.mContainer);
    }

    private com.tsf.shell.e.e.g.a.d getFirstAvailableMenu(int i) {
        Iterator it = this.mMenuItems.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            com.tsf.shell.e.e.g.a.d dVar = (com.tsf.shell.e.e.g.a.d) it.next();
            if (dVar.isEnable() && i2 == i) {
                return dVar;
            }
            if (dVar.isEnable()) {
                i2++;
            }
        }
        return (com.tsf.shell.e.e.g.a.d) this.mMenuItems.get(0);
    }

    private void hideAnimation() {
        onHide();
        this.mExtraMenuContainer.b();
        this.mContainer.mouseEnabled(false);
        x xVar = new x() { // from class: com.tsf.shell.e.e.g.e.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                com.tsf.shell.manager.a.j.b(e.this.mContainer);
                e.this.mCurrentMenuItem.hide(false);
                e.this.mCurrentMenuItem = null;
                Iterator it = e.this.mMenuItems.iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.e.e.g.a.e) it.next()).recycle();
                }
                e.mCurrentMenu = null;
                e.this.onHideComplete();
                com.tsf.shell.manager.a.e.b(e.this);
                e.this.disableBlurMode();
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                e.this.updateBlurModeUV();
            }
        };
        xVar.a(0);
        xVar.h(-MENU_HEIGHT);
        w.a(this.mMenuContainer);
        w.a(this.mMenuContainer, 450, xVar);
    }

    public float getHeight() {
        return this.mHeight;
    }

    public ArrayList getMenuItems() {
        return this.mMenuItems;
    }

    public e(float f) {
        this.mHeight = f;
        if (com.tsf.shell.manager.b.g.ag()) {
            this.mBarBackground.setDefaultColor(new Color4(38, 38, 38, 230));
        }
        this.mBarBackground.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.mBarBackground));
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

    public a getClassMenu() {
        return this.mClassMenu;
    }

    protected void setMenuItems(ArrayList arrayList) {
        this.mMenuItems = arrayList;
        this.mClassMenu.a(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.e.g.a.e eVar = (com.tsf.shell.e.e.g.a.e) it.next();
            eVar.setMenu(this);
            eVar.onLayout(com.censivn.C3DEngine.b.b.a.z, (-this.mHeight) / 2.0f, com.censivn.C3DEngine.b.b.a.A, this.mHeight / 2.0f);
            if (eVar.getContentContainer() != null) {
                eVar.reset();
            }
        }
    }

    public void templeteHide() {
        if (this.isShow) {
            x xVar = new x();
            float f = -this.mOffsetMenuHeight;
            if (f != 0.0f) {
            }
            xVar.h(f);
            w.a(this.mMenuContainer);
            w.a(this.mMenuContainer, 450, xVar);
            x xVar2 = new x() { // from class: com.tsf.shell.e.e.g.e.4
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    e.this.mContentContainer.visible(false);
                    e.this.mExtraMenuContainer.visible(false);
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f2) {
                    e.this.updateBlurModeUV();
                    e.this.mExtraMenuContainer.alpha(255.0f * (1.0f - f2));
                }
            };
            xVar2.a(0);
            w.a(this.mContentContainer);
            w.a(this.mContentContainer, 450, xVar2);
        }
    }

    public void templeteShow() {
        if (this.isShow) {
            this.mExtraMenuContainer.visible(true);
            this.mContentContainer.visible(true);
            x xVar = new x() { // from class: com.tsf.shell.e.e.g.e.5
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    e.this.mContainer.mouseEnabled(true);
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f) {
                    e.this.updateBlurModeUV();
                    e.this.mExtraMenuContainer.alpha(255.0f * f);
                }
            };
            xVar.h(this.mHeight);
            w.a(this.mMenuContainer);
            w.a(this.mMenuContainer, 450, xVar);
            x xVar2 = new x();
            xVar2.a(255);
            w.a(this.mContentContainer);
            w.a(this.mContentContainer, 450, xVar2);
        }
    }

    public void changeMenu(com.tsf.shell.e.e.g.a.e eVar) {
        eVar.setMenu(this);
        if (this.mCurrentMenuItem != eVar && eVar.getContentContainer() != null && eVar.allowChoice()) {
            if (this.mCurrentMenuItem != null) {
                this.mCurrentMenuItem.hide(true);
            }
            this.mCurrentMenuItem = eVar;
            if (!this.mContentContainer.containsChild(eVar.getContentContainer())) {
                this.mContentContainer.addChild(eVar.getContentContainer());
            }
            this.mCurrentMenuItem.show(true);
            onMenuChanged(this.mCurrentMenuItem);
            setOption(eVar);
            if (eVar instanceof com.tsf.shell.e.e.g.a.d) {
                this.mClassMenu.a((com.tsf.shell.e.e.g.a.d) eVar);
            }
        }
    }

    public com.tsf.shell.e.e.g.a.e getCurrentMenuItem() {
        return this.mCurrentMenuItem;
    }

    public void setOption(com.tsf.shell.e.e.g.a.e eVar) {
        showOption(eVar.getMenuContainer());
    }

    public void showOption(j jVar) {
        boolean z;
        final float menuHeight;
        if (!this.mExtraMenuContainer.containsChild(jVar)) {
            if (jVar != null) {
                float f = MENU_EXTRA_HEIGHT;
                if (this.mCurrentMenuItem.getMenuHeight() != 0.0f && this.mCurrentMenuItem.getMenuHeight() > this.mHeight) {
                    f += this.mCurrentMenuItem.getMenuHeight() - this.mHeight;
                }
                this.mExtraMenuContainer.position().y = (-MENU_EXTRA_HEIGHT) / 2.0f;
                this.mExtraMenuContainer.removeFromParent();
                this.mAnimationContainer.addChild(this.mExtraMenuContainer);
                this.mExtraMenuContainer.addChild(jVar);
                menuHeight = f;
                z = true;
            } else {
                z = false;
                menuHeight = (this.mCurrentMenuItem.getMenuHeight() == 0.0f || this.mCurrentMenuItem.getMenuHeight() <= this.mHeight) ? 0.0f : (this.mCurrentMenuItem.getMenuHeight() - this.mHeight) + 0.0f;
            }
            if (z) {
                this.mExtraMenuContainer.a();
            } else {
                this.mExtraMenuContainer.b();
            }
            if (this.mOffsetMenuHeight != menuHeight) {
                final float f2 = this.mOffsetMenuHeight;
                x xVar = new x() { // from class: com.tsf.shell.e.e.g.e.6
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a(float f3) {
                        e.this.mOffsetMenuHeight = f2 + ((menuHeight - f2) * f3);
                        e.this.updateBackgroundHeight();
                    }
                };
                xVar.h(menuHeight);
                w.a(this.mAnimationContainer);
                w.a(this.mAnimationContainer, VEasing.Linear.easeNone, xVar);
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

    public void onMenuChanged(com.tsf.shell.e.e.g.a.e eVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetSize() {
        w.a(this.mContainer);
        this.mContainer.position().y = com.censivn.C3DEngine.b.b.a.C;
        this.mBarBackground.a(com.censivn.C3DEngine.b.b.a.D);
        this.mExtraMenuContainer.a(com.censivn.C3DEngine.b.b.a.D);
        this.mBarBackground.calAABB();
        Iterator it = this.mMenuItems.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.e.e.g.a.e) it.next()).onLayout(com.censivn.C3DEngine.b.b.a.z, (-this.mHeight) / 2.0f, com.censivn.C3DEngine.b.b.a.A, this.mHeight / 2.0f);
        }
        this.mClassMenu.b();
        onLayout(com.censivn.C3DEngine.b.b.a.z, (-this.mHeight) / 2.0f, com.censivn.C3DEngine.b.b.a.A, this.mHeight / 2.0f);
    }

    public float getScreenFreeSpaceBottom() {
        return com.censivn.C3DEngine.b.b.a.B - (com.censivn.C3DEngine.b.b.a.E - getHeight());
    }

    public float getScreenFreeSpaceCenter() {
        return com.censivn.C3DEngine.b.b.a.B - ((com.censivn.C3DEngine.b.b.a.E - getHeight()) / 2.0f);
    }
}
