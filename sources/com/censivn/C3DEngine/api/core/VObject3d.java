package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PointBufferManager;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.UvBufferManager;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.common.shader.Shader;
import com.censivn.C3DEngine.p030a.C0863c;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
/* loaded from: classes.dex */
public class VObject3d implements VTweenTarget {
    public VObject3d mThis;
    public C0975i vTarget;

    @Override // com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget
    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void invalidate() {
        this.vTarget.invalidate();
    }

    public void setAnimationObjectState(boolean z) {
        this.vTarget.setAnimationObjectState(z);
    }

    public boolean getAnimationObjectState() {
        return this.vTarget.getAnimationObjectState();
    }

    public void setTag(Object obj) {
        this.vTarget.setTag(obj);
    }

    public Object getTag() {
        return this.vTarget.getTag();
    }

    public void setTag(Object obj, Object obj2) {
        this.vTarget.setTag(obj, obj2);
    }

    public Object getTag(Object obj) {
        return this.vTarget.getTag(obj);
    }

    public VTextureList textures() {
        return this.vTarget.textures().getVirtualProxy();
    }

    public boolean visible() {
        return this.vTarget.visible();
    }

    public void visible(Boolean bool) {
        this.vTarget.visible(bool);
    }

    public boolean doubleSidedEnabled() {
        return this.vTarget.doubleSidedEnabled();
    }

    public void doubleSidedEnabled(boolean z) {
        this.vTarget.doubleSidedEnabled(z);
    }

    public boolean doubleSidedClickEnabled() {
        return this.vTarget.doubleSidedClickEnabled();
    }

    public void doubleSidedClickEnabled(boolean z) {
        this.vTarget.doubleSidedClickEnabled(z);
    }

    public boolean texturesEnabled() {
        return this.vTarget.texturesEnabled();
    }

    public void texturesEnabled(Boolean bool) {
        this.vTarget.texturesEnabled(bool);
    }

    public void ignoreFaces(boolean z) {
    }

    public PointBufferManager point() {
        return this.vTarget.vertices().points();
    }

    /* renamed from: uv */
    public UvBufferManager m10748uv() {
        return this.vTarget.vertices().uvs();
    }

    public boolean hasDestroyed() {
        return this.vTarget.hasDestroyed();
    }

    public void destroy() {
        this.vTarget.destroy();
    }

    public void destroy(boolean z) {
        this.vTarget.destroy(z);
    }

    public void alpha(int i) {
        this.vTarget.alpha(i);
    }

    public int alpha() {
        return (int) this.vTarget.alpha();
    }

    public Color4 defaultColor() {
        return this.vTarget.getDefaultColor();
    }

    public void defaultColor(Color4 color4) {
        this.vTarget.setDefaultColor(color4);
    }

    public void defaultColor(short s, short s2, short s3, short s4) {
    }

    public void resetColor() {
        this.vTarget.clearDefaultColor();
    }

    public PositionNumber3d position() {
        return this.vTarget.position();
    }

    public Number3d rotation() {
        return this.vTarget.rotation();
    }

    public Number3d scale() {
        return this.vTarget.scale();
    }

    public String name() {
        return this.vTarget.name();
    }

    public void name(String str) {
        this.vTarget.name(str);
    }

    public VObject3dContainer parent() {
        if (this.vTarget.parent() instanceof C0980j) {
            return (VObject3dContainer) ((C0975i) this.vTarget.parent()).getVirtualObject();
        }
        return null;
    }

    public void setCustomShader(Shader shader) {
        this.vTarget.setCustomShader(shader);
    }

    public void resetDefaultShader() {
        this.vTarget.resetDefaultShader();
    }

    public boolean colorFillEnable() {
        return false;
    }

    public void updateAABBMatrix(float[] fArr) {
        this.vTarget.updateAABBMatrix(fArr);
    }

    public float[] getAABBMatrix() {
        return this.vTarget.getAABBMatrix();
    }

    public boolean useVBO() {
        return this.vTarget.useVBO();
    }

    public void useVBO(Boolean bool) {
        this.vTarget.useVBO(bool);
    }

    public void freeVBO() {
        this.vTarget.freeVBO();
    }

    public void syncUpdatePointVBO() {
        this.vTarget.syncUpdatePointVBO();
    }

    public void syncUpdateUvsVBO() {
        this.vTarget.syncUpdateUvsVBO();
    }

    public void syncUpdateFacesVBO() {
        this.vTarget.syncUpdateFacesVBO();
    }

    public void updatePointsVBO() {
        this.vTarget.updatePointsVBO();
    }

    public void updateUvsVBO() {
        this.vTarget.updateUvsVBO();
    }

    public void updateFacesVBO() {
        this.vTarget.updateFacesVBO();
    }

    public Number3d localRotationToGlobal(Number3d number3d) {
        return this.vTarget.localRotationToGlobal(number3d);
    }

    public Number3d localToGlobal(Number3d number3d) {
        return this.vTarget.localToGlobal(number3d);
    }

    public Number3d localScaleToGlobale(Number3d number3d) {
        return this.vTarget.localScaleToGlobale(number3d);
    }

    public Number3d globalToLocal(Number3d number3d) {
        return this.vTarget.globalToLocal(number3d);
    }

    public Number3d globalRotationToLocal(Number3d number3d) {
        return this.vTarget.globalRotationToLocal(number3d);
    }

    public Number3d globalScaleToLocal(Number3d number3d) {
        return this.vTarget.globalScaleToLocal(number3d);
    }

    public boolean calTouchCollision(float f, float f2) {
        if (this.vTarget.mouseAreaDynamic()) {
            this.vTarget.calAABB();
        }
        C0863c.m10828b(this.vTarget.TEMP_AABB_TL, 0, this.vTarget.AABB_MATRIX, 0, this.vTarget.AABB_TL, 0);
        C0863c.m10828b(this.vTarget.TEMP_AABB_TR, 0, this.vTarget.AABB_MATRIX, 0, this.vTarget.AABB_TR, 0);
        C0863c.m10828b(this.vTarget.TEMP_AABB_BL, 0, this.vTarget.AABB_MATRIX, 0, this.vTarget.AABB_BL, 0);
        C0863c.m10828b(this.vTarget.TEMP_AABB_BR, 0, this.vTarget.AABB_MATRIX, 0, this.vTarget.AABB_BR, 0);
        float f3 = (this.vTarget.TEMP_AABB_TL[0] / this.vTarget.TEMP_AABB_TL[3]) * C0892a.f2557H;
        float f4 = (this.vTarget.TEMP_AABB_TL[1] / this.vTarget.TEMP_AABB_TL[3]) * C0892a.f2558I;
        float f5 = (this.vTarget.TEMP_AABB_TR[0] / this.vTarget.TEMP_AABB_TR[3]) * C0892a.f2557H;
        float f6 = (this.vTarget.TEMP_AABB_TR[1] / this.vTarget.TEMP_AABB_TR[3]) * C0892a.f2558I;
        float f7 = (this.vTarget.TEMP_AABB_BL[0] / this.vTarget.TEMP_AABB_BL[3]) * C0892a.f2557H;
        float f8 = (this.vTarget.TEMP_AABB_BL[1] / this.vTarget.TEMP_AABB_BL[3]) * C0892a.f2558I;
        float f9 = (this.vTarget.TEMP_AABB_BR[0] / this.vTarget.TEMP_AABB_BR[3]) * C0892a.f2557H;
        float f10 = (this.vTarget.TEMP_AABB_BR[1] / this.vTarget.TEMP_AABB_BR[3]) * C0892a.f2558I;
        this.vTarget.AABB_P1.m10370a(f - f3, f2 - f4);
        this.vTarget.AABB_P2.m10370a(f - f5, f2 - f6);
        this.vTarget.AABB_P3.m10370a(f - f7, f2 - f8);
        this.vTarget.AABB_P4.m10370a(f - f9, f2 - f10);
        float m10369a = C0975i.C0979a.m10369a(this.vTarget.AABB_P1, this.vTarget.AABB_P2);
        float m10369a2 = C0975i.C0979a.m10369a(this.vTarget.AABB_P2, this.vTarget.AABB_P3);
        float m10369a3 = C0975i.C0979a.m10369a(this.vTarget.AABB_P3, this.vTarget.AABB_P1);
        if (m10369a >= 0.0f || m10369a2 >= 0.0f || m10369a3 >= 0.0f) {
            if (!this.vTarget.doubleSidedClickEnabled() || m10369a <= 0.0f || m10369a2 <= 0.0f || m10369a3 <= 0.0f) {
                float m10369a4 = C0975i.C0979a.m10369a(this.vTarget.AABB_P2, this.vTarget.AABB_P3);
                float m10369a5 = C0975i.C0979a.m10369a(this.vTarget.AABB_P3, this.vTarget.AABB_P4);
                float m10369a6 = C0975i.C0979a.m10369a(this.vTarget.AABB_P4, this.vTarget.AABB_P2);
                if (m10369a4 <= 0.0f || m10369a5 <= 0.0f || m10369a6 <= 0.0f) {
                    return this.vTarget.doubleSidedClickEnabled() && m10369a4 < 0.0f && m10369a5 < 0.0f && m10369a6 < 0.0f;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public void setAABBSP(float f, float f2, float f3, float f4, float f5, float f6) {
        this.vTarget.setAABBSP(f, f2, f3, f4, f5, f6);
    }

    public void setAABBPX(float f, float f2, float f3, float f4, float f5, float f6) {
        this.vTarget.setAABBPX(f, f2, f3, f4, f5, f6);
    }

    public void calAABB() {
        this.vTarget.calAABB();
    }

    public void mouseEnabled(boolean z) {
        this.vTarget.mouseEnabled(z);
    }

    public boolean mouseEnabled() {
        return this.vTarget.mouseEnabled();
    }

    public void mouseSkip(boolean z) {
        this.vTarget.mouseSkip(z);
    }

    public boolean mouseSkip() {
        return this.vTarget.mouseSkip();
    }

    public void setMouseEventListener(VMouseEventListener vMouseEventListener) {
        this.vTarget.setMouseEventListener(vMouseEventListener.vTarget);
    }

    public VObject3d getHittingTarget(float f, float f2, boolean z) {
        C0975i hittingTarget = this.vTarget.getHittingTarget(f, f2, z);
        if (hittingTarget != null) {
            return hittingTarget.getVirtualObject();
        }
        return null;
    }

    public void setZOrderOnTop() {
        this.vTarget.setZOrderOnTop();
    }

    public void moveAllPointsSP(float f, float f2, float f3) {
        this.vTarget.moveAllPointsSP(f, f2, f3);
    }

    public void moveAllPointsPX(float f, float f2, float f3) {
        this.vTarget.moveAllPointsPX(f, f2, f3);
    }

    public void setFocus() {
        this.vTarget.setFocus();
    }

    public void killFocus() {
        this.vTarget.killFocus();
    }

    public void onFocus() {
    }

    public void onKillFocus() {
    }

    public void onDrawStart() {
    }

    public void onDrawEnd() {
    }

    public void onUpdateAnimation() {
    }

    public void draw() {
        this.vTarget.superDraw();
    }

    public void dispatchDraw() {
        this.vTarget.superDispatchDraw();
    }

    public void drawMVPMatrix() {
        this.vTarget.superDrawMVPMatrix();
    }

    public void drawElement() {
        this.vTarget.superDrawElement();
    }
}
