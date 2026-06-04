package android.support.v4.app;

import android.view.View;

/* loaded from: classes.dex */
final class h implements k {
    final /* synthetic */ FragmentActivity a;

    h(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    @Override // android.support.v4.app.k
    public final View a(int i) {
        return this.a.findViewById(i);
    }
}
