package android.support.v4.view;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class bd extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    private bd(ViewPager viewPager) {
        this.a = viewPager;
    }

    /* synthetic */ bd(ViewPager viewPager, byte b) {
        this(viewPager);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.c();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.c();
    }
}
