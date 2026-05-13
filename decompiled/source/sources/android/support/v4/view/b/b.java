package android.support.v4.view.b;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
abstract class b implements Interpolator {
    private final float[] a;
    private final float b;

    public b(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / (this.a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) ((this.a.length - 1) * f), this.a.length - 2);
        float f2 = (f - (min * this.b)) / this.b;
        return ((this.a[min + 1] - this.a[min]) * f2) + this.a[min];
    }
}
