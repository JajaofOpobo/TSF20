package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VPage;
import com.tsf.shell.e.i.c;
import com.tsf.shell.manager.a;

/* loaded from: classes.dex */
public class VWidgetContainer extends VObject3dContainer {
    private VObjectManager mVObjectManager;
    private VTextureManager mVTextureManager;
    private float mLockViewOffsetX = 0.0f;
    private float mLockViewOffsetY = 0.0f;
    private boolean needLockView = true;
    private boolean isLockdView = false;
    private VWidgetContainer mThis = this;

    public VWidgetContainer(int i) {
        init(i);
    }

    public VPage getPage() {
        return (((c) this.vTarget).z() == null ? a.h.o() : ((c) this.vTarget).z()).l();
    }

    public VTextureManager getTextureManager() {
        return this.mVTextureManager;
    }

    public VObjectManager getObjectManager() {
        return this.mVObjectManager;
    }

    public void setWidgetScale(float f) {
        ((c) this.vTarget).a(f);
    }

    public float getWidgetScale() {
        return ((c) this.vTarget).u();
    }

    public float getWidth() {
        return ((c) this.vTarget).v();
    }

    public float getHeight() {
        return ((c) this.vTarget).w();
    }

    public LauncherWidget3DInfo getLauncherInfo() {
        return (LauncherWidget3DInfo) ((c) this.vTarget).K();
    }

    public void lockView(boolean z) {
        this.needLockView = z;
    }

    public boolean lockView() {
        return this.needLockView;
    }

    public void setLockViewOffsetX(float f) {
        this.mLockViewOffsetX = f;
    }

    public void setLockViewOffsetY(float f) {
        this.mLockViewOffsetY = f;
    }

    public float getLockViewOffsetX() {
        return this.mLockViewOffsetX;
    }

    public float getLockViewOffsetY() {
        return this.mLockViewOffsetY;
    }

    public void setShakeEffectState(boolean z) {
    }

    public boolean getShakeEffectState() {
        return false;
    }

    public void interceptMouseEventLongPressOnTimes() {
        ((c) this.vTarget).N();
    }

    public boolean isInterceptMouseEventLongPressOnTimes() {
        return ((c) this.vTarget).O();
    }

    public void cancelInterceptMouseEventLongPress() {
        ((c) this.vTarget).P();
    }

    public void interceptMouseEventScroll(boolean z) {
        ((c) this.vTarget).f(z);
    }

    public boolean interceptMouseEventScroll() {
        return ((c) this.vTarget).Q();
    }

    public void interceptMouseEventVerticalScroll(boolean z) {
        ((c) this.vTarget).g(z);
    }

    public boolean interceptMouseEventVerticalScroll() {
        return ((c) this.vTarget).R();
    }

    public void setUserRotation(boolean z) {
        ((c) this.vTarget).e(z);
    }

    public boolean getUserRotation() {
        return ((c) this.vTarget).M();
    }

    public boolean allowResize() {
        return ((c) this.vTarget).T();
    }

    public void allowResize(boolean z) {
        ((c) this.vTarget).i(z);
    }

    public void setResizeMinScale(float f) {
        ((c) this.vTarget).d(f);
    }

    public void setResizeMaxScale(float f) {
        ((c) this.vTarget).e(f);
    }

    public float getResizeMinScale() {
        return ((c) this.vTarget).U();
    }

    public float getResizeMaxScale() {
        return ((c) this.vTarget).V();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void setMouseEventListener(VMouseEventListener vMouseEventListener) {
    }

    private void init(int i) {
        this.mVTextureManager = new VTextureManager(i) { // from class: com.censivn.C3DEngine.api.core.VWidgetContainer.1
            @Override // com.censivn.C3DEngine.api.core.VTextureManager
            public void onTextureChanged() {
                ((c) VWidgetContainer.this.vTarget).C();
            }
        };
        this.mVObjectManager = new VObjectManager(i);
        this.vTarget = new c(null) { // from class: com.censivn.C3DEngine.api.core.VWidgetContainer.2
            @Override // com.tsf.shell.e.i.c
            public void a(float f, float f2) {
                super.a(f, f2);
                VWidgetContainer.this.mThis.onChangeSceneSize(f, f2);
            }

            @Override // com.tsf.shell.e.i.c
            public void a_() {
                super.a_();
                VWidgetContainer.this.mThis.onLoadAndInitComplete();
            }

            @Override // com.tsf.shell.e.i.c
            public void l_() {
                super.l_();
                VWidgetContainer.this.mThis.onDragStart();
            }

            @Override // com.tsf.shell.e.i.c
            public void c() {
                super.c();
                VWidgetContainer.this.mThis.onDragEnd();
            }

            @Override // com.tsf.shell.e.i.c
            public void d_() {
                super.d_();
                VWidgetContainer.this.mThis.onChoicePageStart();
            }

            @Override // com.tsf.shell.e.i.c
            public void m_() {
                super.m_();
                VWidgetContainer.this.mThis.onChoicePageEnd();
            }

            @Override // com.tsf.shell.e.i.c
            public void n_() {
                super.n_();
                VWidgetContainer.this.mThis.onRemoveStart();
            }

            @Override // com.tsf.shell.e.i.c
            public void g() {
                super.g();
                VWidgetContainer.this.mThis.onDestroy();
                VWidgetContainer.this.mVTextureManager.destroy();
                VWidgetContainer.this.mVObjectManager.destroy();
            }

            @Override // com.tsf.shell.e.i.c
            public void k_() {
                super.k_();
                VWidgetContainer.this.mThis.onDragRelease();
            }

            @Override // com.tsf.shell.e.i.c
            public void o_() {
                super.o_();
                VWidgetContainer.this.mThis.onPause();
            }

            @Override // com.tsf.shell.e.i.c
            public void j() {
                super.j();
                VWidgetContainer.this.mThis.onResume();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onFocus() {
                VWidgetContainer.this.mThis.onFocus();
            }

            @Override // com.tsf.shell.e.i.c, com.censivn.C3DEngine.b.f.j
            public void onKillFocus() {
                VWidgetContainer.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (VWidgetContainer.this.needLockView) {
                    VWidgetContainer.this.isLockdView = true;
                    com.censivn.C3DEngine.a.e().b(position().x + VWidgetContainer.this.mLockViewOffsetX, position().y + VWidgetContainer.this.mLockViewOffsetY);
                }
                VWidgetContainer.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawEnd() {
                if (VWidgetContainer.this.isLockdView) {
                    VWidgetContainer.this.isLockdView = false;
                    com.censivn.C3DEngine.a.e().f();
                }
                VWidgetContainer.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onUpdateAnimation() {
                VWidgetContainer.this.mThis.onUpdateAnimation();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void draw() {
                VWidgetContainer.this.mThis.draw();
            }

            @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
            public void dispatchDraw() {
                VWidgetContainer.this.mThis.dispatchDraw();
            }

            @Override // com.tsf.shell.e.i.c, com.censivn.C3DEngine.b.f.j
            public void drawMVPMatrix() {
                VWidgetContainer.this.mThis.drawMVPMatrix();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void drawElement() {
                VWidgetContainer.this.mThis.drawElement();
            }
        };
        this.vTarget.setVirtualObject(this);
        this.vTarget.setHighPriorityAnimationObjectState(false);
    }

    public void onLoadAndInitComplete() {
    }

    public void onChangeSceneSize(float f, float f2) {
    }

    public void onDragStart() {
    }

    public void onDragEnd() {
    }

    public void onChoicePageStart() {
    }

    public void onChoicePageEnd() {
    }

    public void onRemoveStart() {
    }

    public void onDestroy() {
    }

    public void onDragRelease() {
    }

    public void onPause() {
    }

    public void onResume() {
    }
}
