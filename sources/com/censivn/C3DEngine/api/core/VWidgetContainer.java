package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VPage;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.C3112b;
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
        return (((C3112b) this.vTarget).m3486z() == null ? C3359a.f11094h.m4029o() : ((C3112b) this.vTarget).m3486z()).m4189l();
    }

    public VTextureManager getTextureManager() {
        return this.mVTextureManager;
    }

    public VObjectManager getObjectManager() {
        return this.mVObjectManager;
    }

    public void setWidgetScale(float f) {
        ((C3112b) this.vTarget).m3519a(f);
    }

    public float getWidgetScale() {
        return ((C3112b) this.vTarget).m3491u();
    }

    public float getWidth() {
        return ((C3112b) this.vTarget).m3490v();
    }

    public float getHeight() {
        return ((C3112b) this.vTarget).m3489w();
    }

    public LauncherWidget3DInfo getLauncherInfo() {
        return (LauncherWidget3DInfo) ((C3112b) this.vTarget).m3534K();
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
        ((C3112b) this.vTarget).m3531N();
    }

    public boolean isInterceptMouseEventLongPressOnTimes() {
        return ((C3112b) this.vTarget).m3530O();
    }

    public void cancelInterceptMouseEventLongPress() {
        ((C3112b) this.vTarget).m3529P();
    }

    public void interceptMouseEventScroll(boolean z) {
        ((C3112b) this.vTarget).m3503f(z);
    }

    public boolean interceptMouseEventScroll() {
        return ((C3112b) this.vTarget).m3528Q();
    }

    public void interceptMouseEventVerticalScroll(boolean z) {
        ((C3112b) this.vTarget).m3501g(z);
    }

    public boolean interceptMouseEventVerticalScroll() {
        return ((C3112b) this.vTarget).m3527R();
    }

    public void setUserRotation(boolean z) {
        ((C3112b) this.vTarget).m3505e(z);
    }

    public boolean getUserRotation() {
        return ((C3112b) this.vTarget).m3532M();
    }

    public boolean allowResize() {
        return ((C3112b) this.vTarget).m3525T();
    }

    public void allowResize(boolean z) {
        ((C3112b) this.vTarget).m3498i(z);
    }

    public void setResizeMinScale(float f) {
        ((C3112b) this.vTarget).m3508d(f);
    }

    public void setResizeMaxScale(float f) {
        ((C3112b) this.vTarget).m3506e(f);
    }

    public float getResizeMinScale() {
        return ((C3112b) this.vTarget).m3524U();
    }

    public float getResizeMaxScale() {
        return ((C3112b) this.vTarget).m3523V();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void setMouseEventListener(VMouseEventListener vMouseEventListener) {
    }

    private void init(int i) {
        this.mVTextureManager = new VTextureManager(i) { // from class: com.censivn.C3DEngine.api.core.VWidgetContainer.1
            @Override // com.censivn.C3DEngine.api.core.VTextureManager
            public void onTextureChanged() {
                ((C3112b) VWidgetContainer.this.vTarget).mo3118C();
            }
        };
        this.mVObjectManager = new VObjectManager(i);
        this.vTarget = new C3112b(null) { // from class: com.censivn.C3DEngine.api.core.VWidgetContainer.2
            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: a */
            public void mo3439a(float f, float f2) {
                super.mo3439a(f, f2);
                VWidgetContainer.this.mThis.onChangeSceneSize(f, f2);
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: b_ */
            public void mo3511b_() {
                super.mo3511b_();
                VWidgetContainer.this.mThis.onLoadAndInitComplete();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: n_ */
            public void mo3052n_() {
                super.mo3052n_();
                VWidgetContainer.this.mThis.onDragStart();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: c */
            public void mo3056c() {
                super.mo3056c();
                VWidgetContainer.this.mThis.onDragEnd();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: f_ */
            public void mo3502f_() {
                super.mo3502f_();
                VWidgetContainer.this.mThis.onChoicePageStart();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: o_ */
            public void mo3051o_() {
                super.mo3051o_();
                VWidgetContainer.this.mThis.onChoicePageEnd();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: p_ */
            public void mo3050p_() {
                super.mo3050p_();
                VWidgetContainer.this.mThis.onRemoveStart();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: g */
            public void mo3055g() {
                super.mo3055g();
                VWidgetContainer.this.mThis.onDestroy();
                VWidgetContainer.this.mVTextureManager.destroy();
                VWidgetContainer.this.mVObjectManager.destroy();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: m_ */
            public void mo3053m_() {
                super.mo3053m_();
                VWidgetContainer.this.mThis.onDragRelease();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: q_ */
            public void mo3081q_() {
                super.mo3081q_();
                VWidgetContainer.this.mThis.onPause();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b
            /* renamed from: j */
            public void mo3083j() {
                super.mo3083j();
                VWidgetContainer.this.mThis.onResume();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onFocus() {
                VWidgetContainer.this.mThis.onFocus();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                VWidgetContainer.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (VWidgetContainer.this.needLockView) {
                    VWidgetContainer.this.isLockdView = true;
                    C0853a.m10855e().m10770b(position().f2526x + VWidgetContainer.this.mLockViewOffsetX, position().f2527y + VWidgetContainer.this.mLockViewOffsetY);
                }
                VWidgetContainer.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                if (VWidgetContainer.this.isLockdView) {
                    VWidgetContainer.this.isLockdView = false;
                    C0853a.m10855e().m10764f();
                }
                VWidgetContainer.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onUpdateAnimation() {
                VWidgetContainer.this.mThis.onUpdateAnimation();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void draw() {
                VWidgetContainer.this.mThis.draw();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void dispatchDraw() {
                VWidgetContainer.this.mThis.dispatchDraw();
            }

            @Override // com.tsf.shell.p096f.p153i.C3112b, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void drawMVPMatrix() {
                VWidgetContainer.this.mThis.drawMVPMatrix();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
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
