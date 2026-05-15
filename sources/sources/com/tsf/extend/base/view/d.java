package com.tsf.extend.base.view;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends Animation {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final boolean f;
    private final boolean g;
    private Camera h;
    private boolean i = false;

    public d(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = z;
        this.g = z2;
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.h = new Camera();
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        if (!this.i) {
            a(f, transformation);
        } else {
            b(f, transformation);
        }
    }

    private void a(float f, Transformation transformation) {
        float f2 = this.a;
        float f3 = f2 + ((this.b - f2) * f);
        float f4 = this.c;
        float f5 = this.d;
        Camera camera = this.h;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.f) {
            camera.translate(0.0f, 0.0f, this.e * f);
        } else {
            camera.translate(0.0f, 0.0f, this.e * (1.0f - f));
        }
        if (this.g) {
            camera.rotateY(f3);
        } else {
            camera.rotateX(f3);
        }
        camera.getMatrix(matrix);
        camera.restore();
        if (!this.f) {
            transformation.setAlpha(0.2f + ((1.0f - 0.2f) * f));
        } else {
            transformation.setAlpha(1.0f - (0.2f * f));
        }
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }

    private void b(float f, Transformation transformation) {
        float f2 = this.a;
        float f3 = f2 + ((this.b - f2) * f);
        float f4 = this.c;
        float f5 = this.d;
        Camera camera = this.h;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.f) {
            camera.translate(0.0f, 0.0f, this.e * f);
        } else {
            camera.translate(0.0f, 0.0f, this.e * (1.0f - f));
        }
        camera.rotateY(f3);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }
}
