package com.censivn.C3DEngine.api.primitives.button;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;

/* loaded from: classes.dex */
public class VButtonItem implements VTweenTarget {
    public com.censivn.C3DEngine.e.a.c vTarget;

    public VButtonItem(com.censivn.C3DEngine.e.a.c cVar) {
        this.vTarget = cVar;
    }

    @Override // com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget
    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void flipHorizontal(boolean z) {
        this.vTarget.i = z;
    }

    public boolean flipHorizontal() {
        return this.vTarget.i;
    }

    public void flipVertical(boolean z) {
        this.vTarget.j = z;
    }

    public boolean flipVertical() {
        return this.vTarget.j;
    }

    public void setTextureAll(int i, int i2, int i3, int i4) {
        this.vTarget.a(i, i2, i3, i4);
    }

    public void setTextureAllAndMathSizeSP(int i, int i2, int i3, int i4) {
        this.vTarget.c(i, i2, i3, i4);
    }

    public void setTextureAllAndMathSizePX(int i, int i2, int i3, int i4) {
        this.vTarget.b(i, i2, i3, i4);
    }

    public void setTextureAllAndSetSizePX(int i, int i2, int i3, int i4, int i5, int i6) {
        this.vTarget.a(i, i2, i3, i4, i5, i6);
    }

    public void setTextureAllAndSetSizeSP(int i, int i2, int i3, int i4, int i5, int i6) {
        this.vTarget.b(i, i2, i3, i4, i5, i6);
    }

    public void setTexturePosition(int i, int i2) {
        this.vTarget.a(i, i2);
    }

    public void setSpanAndMathSizePX(int i, int i2) {
        this.vTarget.b(i, i2);
    }

    public void setSpanAndMathSizeSP(int i, int i2) {
        this.vTarget.c(i, i2);
    }

    public void setSpan(int i, int i2) {
        this.vTarget.d(i, i2);
    }

    public void updatePointMatrix() {
        this.vTarget.c();
    }

    public void updateTextureMatrix() {
        this.vTarget.d();
    }

    public void updateAll() {
        this.vTarget.e();
    }

    public void setMouseEventListener(VMouseEventListener vMouseEventListener) {
        this.vTarget.l = vMouseEventListener.vTarget;
    }

    public PositionNumber3d position() {
        return this.vTarget.m;
    }

    public Number3d rotation() {
        return this.vTarget.n;
    }

    public Number3d scale() {
        return this.vTarget.o;
    }

    public boolean visible() {
        return this.vTarget.k;
    }

    public void visible(Boolean bool) {
        this.vTarget.a(bool);
    }

    public void widthPX(int i) {
        this.vTarget.a(i);
    }

    public float widthPX() {
        return this.vTarget.f();
    }

    public void widthSP(int i) {
        this.vTarget.b(i);
    }

    public float widthSP() {
        return this.vTarget.g();
    }

    public void heightPX(int i) {
        this.vTarget.c(i);
    }

    public float heightPX() {
        return this.vTarget.h();
    }

    public void heightSP(int i) {
        this.vTarget.d(i);
    }

    public float heightSP() {
        return this.vTarget.i();
    }

    public void xOffsetSP(int i) {
        this.vTarget.b(i);
    }

    public float xOffsetSP() {
        return this.vTarget.k();
    }

    public void xOffsetPX(int i) {
        this.vTarget.a(i);
    }

    public float xOffsetPX() {
        return this.vTarget.j();
    }

    public void yOffsetPX(int i) {
        this.vTarget.c(i);
    }

    public float yOffsetPX() {
        return this.vTarget.l();
    }

    public void yOffsetSP(int i) {
        this.vTarget.d(i);
    }

    public float yOffsetSP() {
        return this.vTarget.m();
    }
}
