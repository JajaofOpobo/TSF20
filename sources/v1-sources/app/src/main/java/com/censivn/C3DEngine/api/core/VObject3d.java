package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PointBufferManager;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.UvBufferManager;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.b.k;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.common.shader.Shader;

/* loaded from: classes.dex */
public class VObject3d implements VTweenTarget {
    public VObject3d mThis;
    public r vTarget;

    @Override // com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget
    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void invalidate() {
        r rVar = this.vTarget;
        r.u();
    }

    public void setAnimationObjectState(boolean z) {
        this.vTarget.a_(z);
    }

    public boolean getAnimationObjectState() {
        return this.vTarget.w();
    }

    public void setTag(Object obj) {
        this.vTarget.a(obj);
    }

    public Object getTag() {
        return this.vTarget.s();
    }

    public void setTag(Object obj, Object obj2) {
        this.vTarget.a(obj, obj2);
    }

    public Object getTag(Object obj) {
        return this.vTarget.b(obj);
    }

    public VTextureList textures() {
        return this.vTarget.z().a();
    }

    public boolean visible() {
        return this.vTarget.A();
    }

    public void visible(Boolean bool) {
        this.vTarget.a(bool);
    }

    public boolean doubleSidedEnabled() {
        return this.vTarget.B();
    }

    public void doubleSidedEnabled(boolean z) {
        this.vTarget.b(z);
    }

    public boolean texturesEnabled() {
        return this.vTarget.C();
    }

    public void texturesEnabled(Boolean bool) {
        this.vTarget.b(bool);
    }

    public boolean ignoreFaces() {
        return this.vTarget.D();
    }

    public void ignoreFaces(boolean z) {
        this.vTarget.c(z);
    }

    public PointBufferManager point() {
        return this.vTarget.x().c();
    }

    public UvBufferManager uv() {
        return this.vTarget.x().d();
    }

    public boolean hasDestroyed() {
        return this.vTarget.G();
    }

    public void destroy() {
        this.vTarget.H();
    }

    public void destroy(boolean z) {
        this.vTarget.d(z);
    }

    public void alpha(int i) {
        this.vTarget.b(i);
    }

    public int alpha() {
        return (int) this.vTarget.I();
    }

    public Color4 defaultColor() {
        return this.vTarget.J();
    }

    public void defaultColor(Color4 color4) {
        this.vTarget.a(color4);
    }

    public void defaultColor(short s, short s2, short s3, short s4) {
        this.vTarget.a(s, s2, s3, s4);
    }

    public void resetColor() {
        this.vTarget.K();
    }

    public PositionNumber3d position() {
        return this.vTarget.L();
    }

    public Number3d rotation() {
        return this.vTarget.M();
    }

    public Number3d scale() {
        return this.vTarget.N();
    }

    public String name() {
        return this.vTarget.O();
    }

    public void name(String str) {
        this.vTarget.a(str);
    }

    public VObject3dContainer parent() {
        if (this.vTarget.P() instanceof v) {
            return (VObject3dContainer) ((r) this.vTarget.P()).r();
        }
        return null;
    }

    public void setCustomShader(Shader shader) {
        this.vTarget.a(shader);
    }

    public void resetDefaultShader() {
        this.vTarget.U();
    }

    public boolean colorFillEnable() {
        return this.vTarget.V();
    }

    public void updateAABBMatrix(float[] fArr) {
        this.vTarget.a(fArr);
    }

    public float[] getAABBMatrix() {
        return this.vTarget.W();
    }

    public boolean useVBO() {
        return this.vTarget.ab();
    }

    public void useVBO(Boolean bool) {
        this.vTarget.c(bool);
    }

    public void freeVBO() {
        this.vTarget.ac();
    }

    public void syncUpdatePointVBO() {
        this.vTarget.ad();
    }

    public void syncUpdateUvsVBO() {
        this.vTarget.ae();
    }

    public void syncUpdateFacesVBO() {
        this.vTarget.af();
    }

    public void updatePointsVBO() {
        this.vTarget.ag();
    }

    public void updateUvsVBO() {
        this.vTarget.ah();
    }

    public void updateFacesVBO() {
        this.vTarget.ai();
    }

    public Number3d localRotationToGlobal(Number3d number3d) {
        return this.vTarget.a(number3d);
    }

    public Number3d localToGlobal(Number3d number3d) {
        return this.vTarget.c(number3d);
    }

    public Number3d globalToLocal(Number3d number3d) {
        return this.vTarget.d(number3d);
    }

    public boolean calTouchCollision(float f, float f2) {
        if (this.vTarget.at()) {
            this.vTarget.ar();
        }
        k.a(this.vTarget.f, this.vTarget.j, this.vTarget.k);
        k.a(this.vTarget.g, this.vTarget.j, this.vTarget.l);
        k.a(this.vTarget.h, this.vTarget.j, this.vTarget.m);
        k.a(this.vTarget.i, this.vTarget.j, this.vTarget.n);
        float f3 = (this.vTarget.f[0] / this.vTarget.f[3]) * com.censivn.C3DEngine.a.n;
        float f4 = (this.vTarget.f[1] / this.vTarget.f[3]) * com.censivn.C3DEngine.a.o;
        float f5 = (this.vTarget.g[0] / this.vTarget.g[3]) * com.censivn.C3DEngine.a.n;
        float f6 = (this.vTarget.g[1] / this.vTarget.g[3]) * com.censivn.C3DEngine.a.o;
        float f7 = (this.vTarget.h[0] / this.vTarget.h[3]) * com.censivn.C3DEngine.a.n;
        float f8 = (this.vTarget.h[1] / this.vTarget.h[3]) * com.censivn.C3DEngine.a.o;
        float f9 = (this.vTarget.i[0] / this.vTarget.i[3]) * com.censivn.C3DEngine.a.n;
        float f10 = (this.vTarget.i[1] / this.vTarget.i[3]) * com.censivn.C3DEngine.a.o;
        this.vTarget.o.a(f - f3, f2 - f4);
        this.vTarget.p.a(f - f5, f2 - f6);
        this.vTarget.q.a(f - f7, f2 - f8);
        this.vTarget.r.a(f - f9, f2 - f10);
        float a = com.censivn.C3DEngine.b.a.MeshData.a(this.vTarget.o, this.vTarget.p);
        float a2 = com.censivn.C3DEngine.b.a.MeshData.a(this.vTarget.p, this.vTarget.q);
        float a3 = com.censivn.C3DEngine.b.a.MeshData.a(this.vTarget.q, this.vTarget.o);
        if (a >= 0.0f || a2 >= 0.0f || a3 >= 0.0f) {
            return com.censivn.C3DEngine.b.a.MeshData.a(this.vTarget.p, this.vTarget.q) > 0.0f && com.censivn.C3DEngine.b.a.MeshData.a(this.vTarget.q, this.vTarget.r) > 0.0f && com.censivn.C3DEngine.b.a.MeshData.a(this.vTarget.r, this.vTarget.p) > 0.0f;
        }
        return true;
    }

    public void setAABBSP(float f, float f2, float f3, float f4, float f5, float f6) {
        this.vTarget.a(f, f2, f3, f4, f5);
    }

    public void setAABBPX(float f, float f2, float f3, float f4, float f5, float f6) {
        this.vTarget.b(f, f2, f3, f4, f5);
    }

    public void calAABB() {
        this.vTarget.ar();
    }

    public void mouseEnabled(boolean z) {
        this.vTarget.e(z);
    }

    public boolean mouseEnabled() {
        return this.vTarget.au();
    }

    public void mouseSkip(boolean z) {
        this.vTarget.f(z);
    }

    public boolean mouseSkip() {
        return this.vTarget.av();
    }

    public void setMouseEventListener(VMouseEventListener vMouseEventListener) {
        this.vTarget.a(vMouseEventListener.vTarget);
    }

    public VObject3d getHittingTarget(float f, float f2, boolean z) {
        r b = this.vTarget.b(f, f2, z);
        if (b != null) {
            return b.r();
        }
        return null;
    }

    public void setZOrderOnTop() {
        this.vTarget.ax();
    }

    public void moveAllPointsSP(float f, float f2, float f3) {
        this.vTarget.b(f, f2, f3);
    }

    public void moveAllPointsPX(float f, float f2, float f3) {
        this.vTarget.c(f, f2, f3);
    }

    public void setFocus() {
        this.vTarget.az();
    }

    public void killFocus() {
        this.vTarget.aA();
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
        this.vTarget.Y();
    }

    public void dispatchDraw() {
        this.vTarget.S();
    }

    public void drawMVPMatrix() {
        this.vTarget.Z();
    }

    public void drawElement() {
        this.vTarget.aa();
    }
}
