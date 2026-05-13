package android.support.p002v4.view.p012b;

import android.view.animation.Interpolator;
/* renamed from: android.support.v4.view.b.b  reason: invalid class name */
/* loaded from: classes.dex */
abstract class AbstractanimationInterpolatorC0361b implements Interpolator {

    /* renamed from: a */
    private final float[] f764a;

    /* renamed from: b */
    private final float f765b;

    public AbstractanimationInterpolatorC0361b(float[] fArr) {
        this.f764a = fArr;
        this.f765b = 1.0f / (this.f764a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) ((this.f764a.length - 1) * f), this.f764a.length - 2);
        float f2 = (f - (min * this.f765b)) / this.f765b;
        return ((this.f764a[min + 1] - this.f764a[min]) * f2) + this.f764a[min];
    }
}
