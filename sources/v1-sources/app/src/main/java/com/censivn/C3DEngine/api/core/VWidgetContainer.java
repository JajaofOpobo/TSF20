package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VPage;
import com.tsf.shell.workspace3D.k.j;

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
        return ((j) this.vTarget).bc().j();
    }

    public VTextureManager getTextureManager() {
        return this.mVTextureManager;
    }

    public VObjectManager getObjectManager() {
        return this.mVObjectManager;
    }

    public void setWidgetScale(float f) {
        ((j) this.vTarget).g(f);
    }

    public float getWidgetScale() {
        return ((j) this.vTarget).aN();
    }

    public float getWidth() {
        return ((j) this.vTarget).aO();
    }

    public float getHeight() {
        return ((j) this.vTarget).aP();
    }

    public LauncherItem3DInfo getLauncherInfo() {
        return ((j) this.vTarget).be();
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
        ((j) this.vTarget).j(z);
    }

    public boolean getShakeEffectState() {
        return ((j) this.vTarget).aQ();
    }

    public void interceptMouseEventScroll(boolean z) {
        ((j) this.vTarget).m(z);
    }

    public boolean interceptMouseEventScroll() {
        return ((j) this.vTarget).bh();
    }

    public void interceptMouseEventVerticalScroll(boolean z) {
        ((j) this.vTarget).n(z);
    }

    public boolean interceptMouseEventVerticalScroll() {
        return ((j) this.vTarget).bi();
    }

    public void setUserRotation(boolean z) {
        ((j) this.vTarget).l(z);
    }

    public boolean getUserRotation() {
        return ((j) this.vTarget).bg();
    }

    public boolean allowResize() {
        return ((j) this.vTarget).bj();
    }

    public void allowResize(boolean z) {
        ((j) this.vTarget).o(z);
    }

    public void setResizeMinScale(float f) {
        ((j) this.vTarget).h(f);
    }

    public void setResizeMaxScale(float f) {
        ((j) this.vTarget).i(f);
    }

    public float getResizeMinScale() {
        return ((j) this.vTarget).bk();
    }

    public float getResizeMaxScale() {
        return ((j) this.vTarget).bl();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void setMouseEventListener(VMouseEventListener vMouseEventListener) {
    }

    private void init(int i) {
        this.mVTextureManager = new VTextureManager(i);
        this.mVObjectManager = new VObjectManager(i);
        this.vTarget = new e(this);
        this.vTarget.a((VObject3d) this);
        this.vTarget.v();
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
