package android.support.v4.view;

import android.os.Build;
import android.view.VelocityTracker;
/* loaded from: classes.dex */
public final class ag {
    static final c a;

    /* loaded from: classes.dex */
    interface c {
        float a(VelocityTracker velocityTracker, int i);

        float b(VelocityTracker velocityTracker, int i);
    }

    /* loaded from: classes.dex */
    static class a implements c {
        a() {
        }

        @Override // android.support.v4.view.ag.c
        public float a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getXVelocity();
        }

        @Override // android.support.v4.view.ag.c
        public float b(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getYVelocity();
        }
    }

    /* loaded from: classes.dex */
    static class b implements c {
        b() {
        }

        @Override // android.support.v4.view.ag.c
        public float a(VelocityTracker velocityTracker, int i) {
            return ah.a(velocityTracker, i);
        }

        @Override // android.support.v4.view.ag.c
        public float b(VelocityTracker velocityTracker, int i) {
            return ah.b(velocityTracker, i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return a.a(velocityTracker, i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return a.b(velocityTracker, i);
    }
}
