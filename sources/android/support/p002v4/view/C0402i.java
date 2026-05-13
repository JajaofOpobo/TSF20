package android.support.p002v4.view;

import android.view.KeyEvent;
/* renamed from: android.support.v4.view.i */
/* loaded from: classes.dex */
class C0402i {
    /* renamed from: a */
    public static int m12636a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    /* renamed from: a */
    public static boolean m12635a(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    /* renamed from: b */
    public static boolean m12634b(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
