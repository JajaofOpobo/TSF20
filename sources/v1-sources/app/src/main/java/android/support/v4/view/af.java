package android.support.v4.view;

import android.view.VelocityTracker;

/* loaded from: classes.dex */
final class af implements ah {
    af() {
    }

    @Override // android.support.v4.view.ah
    public final float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity();
    }
}
