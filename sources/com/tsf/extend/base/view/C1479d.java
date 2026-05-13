package com.tsf.extend.base.view;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* renamed from: com.tsf.extend.base.view.d */
/* loaded from: classes.dex */
public class C1479d extends Animation {

    /* renamed from: a */
    private final float f4617a;

    /* renamed from: b */
    private final float f4618b;

    /* renamed from: c */
    private final float f4619c;

    /* renamed from: d */
    private final float f4620d;

    /* renamed from: e */
    private final float f4621e;

    /* renamed from: f */
    private final boolean f4622f;

    /* renamed from: g */
    private final boolean f4623g;

    /* renamed from: h */
    private Camera f4624h;

    /* renamed from: i */
    private boolean f4625i = false;

    public C1479d(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        this.f4617a = f;
        this.f4618b = f2;
        this.f4619c = f3;
        this.f4620d = f4;
        this.f4621e = f5;
        this.f4622f = z;
        this.f4623g = z2;
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f4624h = new Camera();
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        if (!this.f4625i) {
            m8455a(f, transformation);
        } else {
            m8454b(f, transformation);
        }
    }

    /* renamed from: a */
    private void m8455a(float f, Transformation transformation) {
        float f2 = this.f4617a;
        float f3 = f2 + ((this.f4618b - f2) * f);
        float f4 = this.f4619c;
        float f5 = this.f4620d;
        Camera camera = this.f4624h;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.f4622f) {
            camera.translate(0.0f, 0.0f, this.f4621e * f);
        } else {
            camera.translate(0.0f, 0.0f, this.f4621e * (1.0f - f));
        }
        if (this.f4623g) {
            camera.rotateY(f3);
        } else {
            camera.rotateX(f3);
        }
        camera.getMatrix(matrix);
        camera.restore();
        if (!this.f4622f) {
            transformation.setAlpha(0.2f + ((1.0f - 0.2f) * f));
        } else {
            transformation.setAlpha(1.0f - (0.2f * f));
        }
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }

    /* renamed from: b */
    private void m8454b(float f, Transformation transformation) {
        float f2 = this.f4617a;
        float f3 = f2 + ((this.f4618b - f2) * f);
        float f4 = this.f4619c;
        float f5 = this.f4620d;
        Camera camera = this.f4624h;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.f4622f) {
            camera.translate(0.0f, 0.0f, this.f4621e * f);
        } else {
            camera.translate(0.0f, 0.0f, this.f4621e * (1.0f - f));
        }
        camera.rotateY(f3);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }
}
