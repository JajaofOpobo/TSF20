package com.tsf.shell.e.e.g.a;

import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public abstract class e {
    public static final int ANIMATION_TIME = 550;
    private boolean isAnimation = false;
    private boolean isShowing = false;
    private float mMenuHeight = 0.0f;
    private e mParent;
    protected com.tsf.shell.e.e.g.e menu;
    public float targetX;

    public void setParentMenu(e eVar) {
        this.mParent = eVar;
    }

    public e getParentMenu() {
        return this.mParent;
    }

    public void setMenuHeight(float f) {
        this.mMenuHeight = f;
    }

    public float getMenuHeight() {
        return this.mMenuHeight;
    }

    public void setMenu(com.tsf.shell.e.e.g.e eVar) {
        if (this.menu == null) {
            this.menu = eVar;
            reset();
        }
    }

    public boolean allowChoice() {
        return true;
    }

    public boolean isAnimation() {
        return this.isAnimation;
    }

    public l getMenuContainer() {
        return null;
    }

    public l getContentContainer() {
        return null;
    }

    public void hide(boolean z) {
        this.isShowing = false;
        onHide();
        if (z) {
            this.isAnimation = true;
            x xVar = new x() { // from class: com.tsf.shell.e.e.g.a.e.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    e.this.isAnimation = false;
                    e.this.onHideComplete();
                    e.this.removeFromMenu();
                }
            };
            xVar.a(0);
            xVar.h(-this.menu.getHeight());
            w.a(getContentContainer());
            w.a(getContentContainer(), ANIMATION_TIME, xVar);
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
            x xVar = new x() { // from class: com.tsf.shell.e.e.g.a.e.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    e.this.isAnimation = false;
                    e.this.onShowComplete();
                }
            };
            xVar.h(0.0f);
            xVar.a(255);
            xVar.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(getContentContainer());
            w.a(getContentContainer(), ANIMATION_TIME, xVar);
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
