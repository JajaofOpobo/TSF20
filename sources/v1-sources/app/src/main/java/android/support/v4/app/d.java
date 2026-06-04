package android.support.v4.app;

import android.view.View;

/* loaded from: classes.dex */
final class d implements k {
    final /* synthetic */ Fragment a;

    d(Fragment fragment) {
        this.a = fragment;
    }

    @Override // android.support.v4.app.k
    public final View a(int i) {
        if (this.a.I == null) {
            throw new IllegalStateException("Fragment does not have a view");
        }
        return this.a.I.findViewById(i);
    }
}
