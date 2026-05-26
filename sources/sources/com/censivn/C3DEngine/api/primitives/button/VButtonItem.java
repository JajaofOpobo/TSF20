package com.censivn.C3DEngine.api.primitives.button;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.b.f.a.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VButtonItem implements VTweenTarget {
    public b vTarget;

    public VButtonItem(b bVar) {
        this.vTarget = bVar;
    }

    @Override // com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget
    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void flipHorizontal(boolean z) {
        this.vTarget.b(z);
    }

    public boolean flipHorizontal() {
        return this.vTarget.d();
    }

    public void flipVertical(boolean z) {
        this.vTarget.c(z);
    }

    public boolean flipVertical() {
        return this.vTarget.e();
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
        this.vTarget.f(i, i2);
    }

    public void updatePointMatrix() {
        this.vTarget.f();
    }

    public void updateTextureMatrix() {
        this.vTarget.g();
    }

    public void updateAll() {
        this.vTarget.h();
    }

    public void setMouseEventListener(VMouseEventListener vMouseEventListener) {
        this.vTarget.a(vMouseEventListener.vTarget);
    }

    public void alpha(float f) {
        this.vTarget.a(f);
    }

    public float alpha() {
        return this.vTarget.c();
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

    public Color4 color() {
        return this.vTarget.H;
    }

    public boolean visible() {
        return this.vTarget.l();
    }

    public void visible(Boolean bool) {
        this.vTarget.a(bool);
    }

    public void widthPX(int i) {
        this.vTarget.b(i);
    }

    public float widthPX() {
        return this.vTarget.m();
    }

    public void widthSP(int i) {
        this.vTarget.c(i);
    }

    public float widthSP() {
        return this.vTarget.n();
    }

    public void heightPX(int i) {
        this.vTarget.d(i);
    }

    public float heightPX() {
        return this.vTarget.o();
    }

    public void heightSP(int i) {
        this.vTarget.e(i);
    }

    public float heightSP() {
        return this.vTarget.p();
    }

    public void xOffsetSP(int i) {
        this.vTarget.b(i);
    }

    public float xOffsetSP() {
        return this.vTarget.r();
    }

    public void xOffsetPX(int i) {
        this.vTarget.a(i);
    }

    public float xOffsetPX() {
        return this.vTarget.q();
    }

    public void yOffsetPX(int i) {
        this.vTarget.c(i);
    }

    public float yOffsetPX() {
        return this.vTarget.s();
    }

    public void yOffsetSP(int i) {
        this.vTarget.d(i);
    }

    public float yOffsetSP() {
        return this.vTarget.t();
    }
}
