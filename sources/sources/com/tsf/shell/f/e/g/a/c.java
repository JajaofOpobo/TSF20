package com.tsf.shell.f.e.g.a;

import com.censivn.C3DEngine.b.f.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class c {
    public static final int ANIMATION_TIME = 550;
    private boolean isAnimation = false;
    private boolean isShowing = false;
    private float mMenuHeight = 0.0f;
    private c mParent;
    protected com.tsf.shell.f.e.g.d menu;
    public float targetX;

    public void setParentMenu(c cVar) {
        this.mParent = cVar;
    }

    public c getParentMenu() {
        return this.mParent;
    }

    public void setMenuHeight(float f) {
        this.mMenuHeight = f;
    }

    public float getMenuHeight() {
        return this.mMenuHeight;
    }

    public void setMenu(com.tsf.shell.f.e.g.d dVar) {
        if (this.menu == null) {
            this.menu = dVar;
            reset();
        }
    }

    public boolean allowChoice() {
        return true;
    }

    public boolean isAnimation() {
        return this.isAnimation;
    }

    public j getMenuContainer() {
        return null;
    }

    public j getContentContainer() {
        return null;
    }

    public void hide(boolean z) {
        this.isShowing = false;
        onHide();
        if (z) {
            this.isAnimation = true;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.g.a.c.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    c.this.isAnimation = false;
                    c.this.onHideComplete();
                    c.this.removeFromMenu();
                }
            };
            dVar.a(0);
            dVar.h(-this.menu.getHeight());
            com.censivn.C3DEngine.b.g.c.a(getContentContainer());
            com.censivn.C3DEngine.b.g.c.a(getContentContainer(), ANIMATION_TIME, dVar);
            return;
        }
        this.isAnimation = false;
        reset();
        onHideComplete();
        removeFromMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromMenu() {
        if (getContentContainer() != null) {
            getContentContainer().removeFromParent();
        }
    }

    public void reset() {
        getContentContainer().position().y = -this.menu.getHeight();
        getContentContainer().alpha(0.0f);
    }

    public boolean isShowing() {
        return this.isShowing;
    }

    public void show(boolean z) {
        this.isShowing = true;
        onShow();
        if (z) {
            this.isAnimation = true;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.g.a.c.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    c.this.isAnimation = false;
                    c.this.onShowComplete();
                }
            };
            dVar.h(0.0f);
            dVar.a(255);
            dVar.a(com.censivn.C3DEngine.b.g.a.a);
            com.censivn.C3DEngine.b.g.c.a(getContentContainer());
            com.censivn.C3DEngine.b.g.c.a(getContentContainer(), ANIMATION_TIME, dVar);
            return;
        }
        this.isAnimation = false;
        getContentContainer().position().y = 0.0f;
        getContentContainer().alpha(255.0f);
    }

    public void onThemeChanged() {
    }

    public void onShow() {
    }

    public void onShowComplete() {
    }

    public void onHide() {
    }

    public void onHideComplete() {
    }

    public void onLayout(float f, float f2, float f3, float f4) {
    }

    public void onRecycle() {
    }

    public void recycle() {
        onRecycle();
        this.mParent = null;
    }
}
