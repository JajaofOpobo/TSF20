package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.view.ViewPager;

/* loaded from: classes.dex */
final class be implements android.support.v4.b.c {
    be() {
    }

    @Override // android.support.v4.b.c
    public final /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }

    @Override // android.support.v4.b.c
    public final /* bridge */ /* synthetic */ Object[] a(int i) {
        return new ViewPager.SavedState[i];
    }
}
