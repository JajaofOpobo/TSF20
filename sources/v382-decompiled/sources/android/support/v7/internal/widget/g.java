package android.support.v7.internal.widget;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* loaded from: classes.dex */
class g extends android.support.v4.f.e {
    public g(int i) {
        super(i);
    }

    PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        return (PorterDuffColorFilter) a(Integer.valueOf(b(i, mode)));
    }

    PorterDuffColorFilter a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
        return (PorterDuffColorFilter) a(Integer.valueOf(b(i, mode)), porterDuffColorFilter);
    }

    private static int b(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
