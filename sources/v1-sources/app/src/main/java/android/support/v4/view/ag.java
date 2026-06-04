package android.support.v4.view;

import android.view.VelocityTracker;

/* loaded from: classes.dex */
final class ag implements ah {
    ag() {
    }

    @Override // android.support.v4.view.ah
    public final float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }
}
