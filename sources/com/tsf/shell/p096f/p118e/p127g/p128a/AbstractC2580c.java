package com.tsf.shell.p096f.p118e.p127g.p128a;

import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
/* renamed from: com.tsf.shell.f.e.g.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC2580c {
    public static final int ANIMATION_TIME = 550;
    private boolean isAnimation = false;
    private boolean isShowing = false;
    private float mMenuHeight = 0.0f;
    private AbstractC2580c mParent;
    protected AbstractC2593d menu;
    public float targetX;

    public void setParentMenu(AbstractC2580c abstractC2580c) {
        this.mParent = abstractC2580c;
    }

    public AbstractC2580c getParentMenu() {
        return this.mParent;
    }

    public void setMenuHeight(float f) {
        this.mMenuHeight = f;
    }

    public float getMenuHeight() {
        return this.mMenuHeight;
    }

    public void setMenu(AbstractC2593d abstractC2593d) {
        if (this.menu == null) {
            this.menu = abstractC2593d;
            reset();
        }
    }

    public boolean allowChoice() {
        return true;
    }

    public boolean isAnimation() {
        return this.isAnimation;
    }

    public C0980j getMenuContainer() {
        return null;
    }

    public C0980j getContentContainer() {
        return null;
    }

    public void hide(boolean z) {
        this.isShowing = false;
        onHide();
        if (z) {
            this.isAnimation = true;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.g.a.c.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    AbstractC2580c.this.isAnimation = false;
                    AbstractC2580c.this.onHideComplete();
                    AbstractC2580c.this.removeFromMenu();
                }
            };
            c1017d.m10314a(0);
            c1017d.mo10298h(-this.menu.getHeight());
            C1014c.m10326a(getContentContainer());
            C1014c.m10325a(getContentContainer(), ANIMATION_TIME, c1017d);
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
        getContentContainer().position().f2527y = -this.menu.getHeight();
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
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.g.a.c.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    AbstractC2580c.this.isAnimation = false;
                    AbstractC2580c.this.onShowComplete();
                }
            };
            c1017d.mo10298h(0.0f);
            c1017d.m10314a(255);
            c1017d.m10313a(C0986a.f2946a);
            C1014c.m10326a(getContentContainer());
            C1014c.m10325a(getContentContainer(), ANIMATION_TIME, c1017d);
            return;
        }
        this.isAnimation = false;
        getContentContainer().position().f2527y = 0.0f;
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
