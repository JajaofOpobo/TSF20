package com.tsf.shell.p096f.p118e.p127g;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p174f.C3474b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.g.d */
/* loaded from: classes.dex */
public abstract class AbstractC2593d {
    public static AbstractC2593d mCurrentMenu;
    private AbstractC2580c mCurrentMenuItem;
    private float mHeight;
    private ArrayList<C2578b> mMenuItems;
    private float mOffsetMenuHeight;
    public static int COLOR_IMAGE_HUE = 0;
    public static int COLOR_IMAGE_SATURATION = 0;
    public static final float MENU_HEIGHT = 100.0f * C0892a.f2567c;
    public static final float MENU_EXTRA_HEIGHT = 115.0f * C0892a.f2567c;
    public static final float MENU_ITEM_DISTANCE = 36.0f * C0892a.f2567c;
    private boolean isShow = false;
    private boolean isBlurModeOn = false;
    private C2590c mExtraMenuContainer = new C2590c(C0892a.f2553D, MENU_EXTRA_HEIGHT);
    private C2573a mClassMenu = new C2573a(this, MENU_ITEM_DISTANCE);
    private C2600a mKeyListener = new C2600a();
    private C2601b mSceneEventListener = new C2601b();
    private C0980j mContainer = new C0980j();
    private C0980j mAnimationContainer = new C0980j();
    private C0980j mMenuContainer = new C0980j();
    private C0980j mContentContainer = new C0980j();
    private C0981k mBarBackground = new C0981k(C0892a.f2553D, 0.0f, false) { // from class: com.tsf.shell.f.e.g.d.3
        @Override // com.censivn.C3DEngine.p031b.p038f.C0981k
        /* renamed from: b */
        public void mo5215b(float f) {
            float f2 = AbstractC2593d.MENU_HEIGHT + C0892a.f2560K + AbstractC2593d.this.mOffsetMenuHeight + f;
            float f3 = (-f2) - AbstractC2593d.MENU_HEIGHT;
            float f4 = AbstractC2593d.MENU_HEIGHT;
            points().pxY(2, AbstractC2593d.MENU_HEIGHT);
            points().pxY(3, AbstractC2593d.MENU_HEIGHT);
            points().pxY(0, (-f2) - AbstractC2593d.MENU_HEIGHT);
            points().pxY(1, (-f2) - AbstractC2593d.MENU_HEIGHT);
            calAABB();
            setAABBPX(C0892a.f2590z, f3, 0.0f, C0892a.f2550A, f4, 0.0f);
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
            this.mBarBackground.setDefaultColor(C3567c.f11857p);
            this.mBarBackground.textures().clear();
            this.mBarBackground.textures().addElement(textureElement);
            if (C3474b.f11468b == 3) {
            }
        }
    }

    public void updateBlurModeUV() {
        if (this.isBlurModeOn) {
            float f = this.mMenuContainer.position().f2527y + this.mContainer.position().f2527y;
            float f2 = C0892a.f2556G;
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
            this.mBarBackground.setDefaultColor(C3567c.f11856o);
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
                Iterator<C2578b> it = this.mMenuItems.iterator();
                while (it.hasNext()) {
                    it.next().getTitleIcon().m5205i();
                }
                C3359a.f11089c.m2242c(this);
                C0915b.m10597a(this.mKeyListener);
                C3359a.f11088b.m10565a(this.mSceneEventListener);
                showAnimation(0);
                this.mClassMenu.m5250a();
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
                Iterator<C2578b> it = this.mMenuItems.iterator();
                while (it.hasNext()) {
                    it.next().getTitleIcon().m5205i();
                }
                C3359a.f11089c.m2242c(this);
                C0915b.m10597a(this.mKeyListener);
                C3359a.f11088b.m10565a(this.mSceneEventListener);
                showAnimation(i);
                this.mClassMenu.m5250a();
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
                C3359a.f11089c.m2246b(this);
                C0915b.m10594b(this.mKeyListener);
                C3359a.f11088b.m10557b(this.mSceneEventListener);
                hideAnimation();
                return;
            }
            changeMenu(this.mCurrentMenuItem.getParentMenu());
        }
    }

    private void showAnimation(int i) {
        if (!C3430e.m2516ai()) {
            enableBlurMode(C3359a.f11091e.m2271a(this));
        }
        onShow();
        this.mContainer.mouseEnabled(false);
        this.mContainer.setFocus();
        this.isShow = true;
        changeMenu(getFirstAvailableMenu(i));
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.g.d.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                AbstractC2593d.this.mContainer.mouseEnabled(true);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                AbstractC2593d.this.updateBlurModeUV();
            }
        };
        c1017d.mo10298h(this.mHeight);
        c1017d.m10314a(255);
        c1017d.m10313a(C0986a.f2946a);
        C1014c.m10326a(this.mMenuContainer);
        C1014c.m10325a(this.mMenuContainer, 500, c1017d);
        this.mContainer.position().f2527y = C0892a.f2552C;
        this.mContainer.removeFromParent();
        C3359a.f11096j.m2232a(this.mContainer);
    }

    private C2578b getFirstAvailableMenu(int i) {
        Iterator<C2578b> it = this.mMenuItems.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C2578b next = it.next();
            if (!next.isEnable() || i2 != i) {
                i2 = next.isEnable() ? i2 + 1 : i2;
            } else {
                return next;
            }
        }
        return this.mMenuItems.get(0);
    }

    private void hideAnimation() {
        onHide();
        this.mExtraMenuContainer.m5216b();
        this.mContainer.mouseEnabled(false);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.g.d.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3359a.f11096j.m2223b(AbstractC2593d.this.mContainer);
                AbstractC2593d.this.mCurrentMenuItem.hide(false);
                AbstractC2593d.this.mCurrentMenuItem = null;
                Iterator it = AbstractC2593d.this.mMenuItems.iterator();
                while (it.hasNext()) {
                    ((AbstractC2580c) it.next()).recycle();
                }
                AbstractC2593d.mCurrentMenu = null;
                AbstractC2593d.this.onHideComplete();
                C3359a.f11091e.m2263b(AbstractC2593d.this);
                AbstractC2593d.this.disableBlurMode();
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                AbstractC2593d.this.updateBlurModeUV();
            }
        };
        c1017d.m10314a(0);
        c1017d.mo10298h(-MENU_HEIGHT);
        C1014c.m10326a(this.mMenuContainer);
        C1014c.m10325a(this.mMenuContainer, 450, c1017d);
    }

    public float getHeight() {
        return this.mHeight;
    }

    public ArrayList<C2578b> getMenuItems() {
        return this.mMenuItems;
    }

    public AbstractC2593d(float f) {
        this.mHeight = f;
        if (C3430e.m2516ai()) {
            this.mBarBackground.setDefaultColor(new Color4(38, 38, 38, 230));
        }
        this.mBarBackground.setMouseEventListener(new C0937a(this.mBarBackground));
        this.mBarBackground.useVBO(false);
        this.mBarBackground.mo5215b(this.mHeight);
        this.mClassMenu.position().f2527y = MENU_HEIGHT / 2.0f;
        this.mContentContainer.position().f2527y = (-this.mHeight) / 2.0f;
        this.mAnimationContainer.addChild(this.mBarBackground);
        this.mAnimationContainer.addChild(this.mClassMenu);
        this.mMenuContainer.addChild(this.mAnimationContainer);
        this.mMenuContainer.addChild(this.mContentContainer);
        this.mContainer.addChild(this.mMenuContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBackgroundHeight() {
        this.mBarBackground.mo5215b(this.mHeight);
    }

    public C2573a getClassMenu() {
        return this.mClassMenu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMenuItems(ArrayList<C2578b> arrayList) {
        this.mMenuItems = arrayList;
        this.mClassMenu.m5247a(arrayList);
        Iterator<C2578b> it = arrayList.iterator();
        while (it.hasNext()) {
            C2578b next = it.next();
            next.setMenu(this);
            next.onLayout(C0892a.f2590z, (-this.mHeight) / 2.0f, C0892a.f2550A, this.mHeight / 2.0f);
            if (next.getContentContainer() != null) {
                next.reset();
            }
        }
    }

    public void templeteHide() {
        if (this.isShow) {
            C1017d c1017d = new C1017d();
            float f = -this.mOffsetMenuHeight;
            if (f != 0.0f) {
            }
            c1017d.mo10298h(f);
            C1014c.m10326a(this.mMenuContainer);
            C1014c.m10325a(this.mMenuContainer, 450, c1017d);
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.e.g.d.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    AbstractC2593d.this.mContentContainer.visible(false);
                    AbstractC2593d.this.mExtraMenuContainer.visible(false);
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f2) {
                    AbstractC2593d.this.updateBlurModeUV();
                    AbstractC2593d.this.mExtraMenuContainer.alpha(255.0f * (1.0f - f2));
                }
            };
            c1017d2.m10314a(0);
            C1014c.m10326a(this.mContentContainer);
            C1014c.m10325a(this.mContentContainer, 450, c1017d2);
        }
    }

    public void templeteShow() {
        if (this.isShow) {
            this.mExtraMenuContainer.visible(true);
            this.mContentContainer.visible(true);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.g.d.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    AbstractC2593d.this.mContainer.mouseEnabled(true);
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    AbstractC2593d.this.updateBlurModeUV();
                    AbstractC2593d.this.mExtraMenuContainer.alpha(255.0f * f);
                }
            };
            c1017d.mo10298h(this.mHeight);
            C1014c.m10326a(this.mMenuContainer);
            C1014c.m10325a(this.mMenuContainer, 450, c1017d);
            C1017d c1017d2 = new C1017d();
            c1017d2.m10314a(255);
            C1014c.m10326a(this.mContentContainer);
            C1014c.m10325a(this.mContentContainer, 450, c1017d2);
        }
    }

    public void changeMenu(AbstractC2580c abstractC2580c) {
        abstractC2580c.setMenu(this);
        if (this.mCurrentMenuItem != abstractC2580c && abstractC2580c.getContentContainer() != null && abstractC2580c.allowChoice()) {
            if (this.mCurrentMenuItem != null) {
                this.mCurrentMenuItem.hide(true);
            }
            this.mCurrentMenuItem = abstractC2580c;
            if (!this.mContentContainer.containsChild(abstractC2580c.getContentContainer())) {
                this.mContentContainer.addChild(abstractC2580c.getContentContainer());
            }
            this.mCurrentMenuItem.show(true);
            onMenuChanged(this.mCurrentMenuItem);
            setOption(abstractC2580c);
            if (abstractC2580c instanceof C2578b) {
                this.mClassMenu.m5249a((C2578b) abstractC2580c);
            }
        }
    }

    public AbstractC2580c getCurrentMenuItem() {
        return this.mCurrentMenuItem;
    }

    public void setOption(AbstractC2580c abstractC2580c) {
        showOption(abstractC2580c.getMenuContainer());
    }

    public void showOption(C0975i c0975i) {
        boolean z;
        final float menuHeight;
        if (!this.mExtraMenuContainer.containsChild(c0975i)) {
            if (c0975i != null) {
                float f = MENU_EXTRA_HEIGHT;
                if (this.mCurrentMenuItem.getMenuHeight() != 0.0f && this.mCurrentMenuItem.getMenuHeight() != this.mHeight) {
                    f += this.mCurrentMenuItem.getMenuHeight() - this.mHeight;
                }
                this.mExtraMenuContainer.position().f2527y = (-MENU_EXTRA_HEIGHT) / 2.0f;
                this.mExtraMenuContainer.removeFromParent();
                this.mAnimationContainer.addChild(this.mExtraMenuContainer);
                this.mExtraMenuContainer.addChild(c0975i);
                menuHeight = f;
                z = true;
            } else {
                z = false;
                menuHeight = (this.mCurrentMenuItem.getMenuHeight() == 0.0f || this.mCurrentMenuItem.getMenuHeight() == this.mHeight) ? 0.0f : (this.mCurrentMenuItem.getMenuHeight() - this.mHeight) + 0.0f;
            }
            if (z) {
                this.mExtraMenuContainer.m5220a();
            } else {
                this.mExtraMenuContainer.m5216b();
            }
            if (this.mOffsetMenuHeight != menuHeight) {
                final float f2 = this.mOffsetMenuHeight;
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.g.d.6
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f3) {
                        AbstractC2593d.this.mOffsetMenuHeight = f2 + ((menuHeight - f2) * f3);
                        AbstractC2593d.this.updateBackgroundHeight();
                        AbstractC2593d.this.updateBlurModeUV();
                    }
                };
                c1017d.mo10298h(menuHeight);
                C1014c.m10326a(this.mAnimationContainer);
                C1014c.m10325a(this.mAnimationContainer, VEasing.Linear.easeNone, c1017d);
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

    public void onMenuChanged(AbstractC2580c abstractC2580c) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetSize() {
        C1014c.m10326a(this.mContainer);
        this.mContainer.position().f2527y = C0892a.f2552C;
        this.mBarBackground.mo10368a(C0892a.f2553D);
        this.mExtraMenuContainer.m5219a(C0892a.f2553D);
        this.mBarBackground.calAABB();
        Iterator<C2578b> it = this.mMenuItems.iterator();
        while (it.hasNext()) {
            it.next().onLayout(C0892a.f2590z, (-this.mHeight) / 2.0f, C0892a.f2550A, this.mHeight / 2.0f);
        }
        this.mClassMenu.m5246b();
        onLayout(C0892a.f2590z, (-this.mHeight) / 2.0f, C0892a.f2550A, this.mHeight / 2.0f);
    }

    public float getScreenFreeSpaceBottom() {
        return C0892a.f2551B - (C0892a.f2554E - getHeight());
    }

    public float getScreenFreeSpaceCenter() {
        return C0892a.f2551B - ((C0892a.f2554E - getHeight()) / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.g.d$a */
    /* loaded from: classes.dex */
    public class C2600a implements C0915b.InterfaceC0918a {
        C2600a() {
        }

        @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: a */
        public void mo727a(int i, KeyEvent keyEvent) {
            if (i == 4) {
                AbstractC2593d.this.hide();
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: b */
        public void mo726b(int i, KeyEvent keyEvent) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.g.d$b */
    /* loaded from: classes.dex */
    public class C2601b implements C0925e.InterfaceC0934a {
        C2601b() {
        }

        @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
        /* renamed from: a */
        public void mo1664a(int i, int i2, int i3, int i4) {
            AbstractC2593d.this.resetSize();
        }
    }
}
