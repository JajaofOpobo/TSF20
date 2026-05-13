package com.censivn.C3DEngine.api.primitives.button;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
/* loaded from: classes.dex */
public class VButtonItem implements VTweenTarget {
    public C0964b vTarget;

    public VButtonItem(C0964b c0964b) {
        this.vTarget = c0964b;
    }

    @Override // com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget
    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void flipHorizontal(boolean z) {
        this.vTarget.m10426b(z);
    }

    public boolean flipHorizontal() {
        return this.vTarget.m10419d();
    }

    public void flipVertical(boolean z) {
        this.vTarget.m10420c(z);
    }

    public boolean flipVertical() {
        return this.vTarget.m10414e();
    }

    public void setTextureAll(int i, int i2, int i3, int i4) {
        this.vTarget.m10439a(i, i2, i3, i4);
    }

    public void setTextureAllAndMathSizeSP(int i, int i2, int i3, int i4) {
        this.vTarget.m10421c(i, i2, i3, i4);
    }

    public void setTextureAllAndMathSizePX(int i, int i2, int i3, int i4) {
        this.vTarget.m10428b(i, i2, i3, i4);
    }

    public void setTextureAllAndSetSizePX(int i, int i2, int i3, int i4, int i5, int i6) {
        this.vTarget.m10437a(i, i2, i3, i4, i5, i6);
    }

    public void setTextureAllAndSetSizeSP(int i, int i2, int i3, int i4, int i5, int i6) {
        this.vTarget.m10427b(i, i2, i3, i4, i5, i6);
    }

    public void setTexturePosition(int i, int i2) {
        this.vTarget.m10440a(i, i2);
    }

    public void setSpanAndMathSizePX(int i, int i2) {
        this.vTarget.m10429b(i, i2);
    }

    public void setSpanAndMathSizeSP(int i, int i2) {
        this.vTarget.m10422c(i, i2);
    }

    public void setSpan(int i, int i2) {
        this.vTarget.m10410f(i, i2);
    }

    public void updatePointMatrix() {
        this.vTarget.m10411f();
    }

    public void updateTextureMatrix() {
        this.vTarget.m10409g();
    }

    public void updateAll() {
        this.vTarget.m10408h();
    }

    public void setMouseEventListener(VMouseEventListener vMouseEventListener) {
        this.vTarget.m10436a(vMouseEventListener.vTarget);
    }

    public void alpha(float f) {
        this.vTarget.m10443a(f);
    }

    public float alpha() {
        return this.vTarget.m10425c();
    }

    public PositionNumber3d position() {
        return this.vTarget.f2853m;
    }

    public Number3d rotation() {
        return this.vTarget.f2854n;
    }

    public Number3d scale() {
        return this.vTarget.f2855o;
    }

    public Color4 color() {
        return this.vTarget.f2830H;
    }

    public boolean visible() {
        return this.vTarget.m10404l();
    }

    public void visible(Boolean bool) {
        this.vTarget.m10435a(bool);
    }

    public void widthPX(int i) {
        this.vTarget.m10431b(i);
    }

    public float widthPX() {
        return this.vTarget.m10403m();
    }

    public void widthSP(int i) {
        this.vTarget.m10424c(i);
    }

    public float widthSP() {
        return this.vTarget.m10402n();
    }

    public void heightPX(int i) {
        this.vTarget.m10418d(i);
    }

    public float heightPX() {
        return this.vTarget.m10401o();
    }

    public void heightSP(int i) {
        this.vTarget.m10413e(i);
    }

    public float heightSP() {
        return this.vTarget.m10400p();
    }

    public void xOffsetSP(int i) {
        this.vTarget.m10430b(i);
    }

    public float xOffsetSP() {
        return this.vTarget.m10398r();
    }

    public void xOffsetPX(int i) {
        this.vTarget.m10441a(i);
    }

    public float xOffsetPX() {
        return this.vTarget.m10399q();
    }

    public void yOffsetPX(int i) {
        this.vTarget.m10423c(i);
    }

    public float yOffsetPX() {
        return this.vTarget.m10397s();
    }

    public void yOffsetSP(int i) {
        this.vTarget.m10417d(i);
    }

    public float yOffsetSP() {
        return this.vTarget.m10396t();
    }
}
