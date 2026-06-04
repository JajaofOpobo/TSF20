package android.support.v4.view;

import android.view.KeyEvent;

/* loaded from: classes.dex */
final class p implements q {
    p() {
    }

    @Override // android.support.v4.view.q
    public final boolean a(int i) {
        return KeyEvent.metaStateHasModifiers(i, 1);
    }

    @Override // android.support.v4.view.q
    public final boolean b(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
