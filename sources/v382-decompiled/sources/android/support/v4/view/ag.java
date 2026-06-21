package android.support.v4.view;

import android.view.VelocityTracker;

/* loaded from: classes.dex */
class ag implements ai {
    ag() {
    }

    @Override // android.support.v4.view.ai
    public float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity();
    }
}
