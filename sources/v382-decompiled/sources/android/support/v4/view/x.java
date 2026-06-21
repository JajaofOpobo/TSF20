package android.support.v4.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class x implements ab {
    x() {
    }

    @Override // android.support.v4.view.ab
    public int a(MotionEvent motionEvent, int i) {
        return i == 0 ? 0 : -1;
    }

    @Override // android.support.v4.view.ab
    public int b(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return 0;
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    @Override // android.support.v4.view.ab
    public float c(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getX();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    @Override // android.support.v4.view.ab
    public float d(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getY();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
}
