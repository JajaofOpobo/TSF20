package android.support.v4.view;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
class bp extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    private bp(ViewPager viewPager) {
        this.a = viewPager;
    }

    /* synthetic */ bp(ViewPager viewPager, bp bpVar) {
        this(viewPager);
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.a.b();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.a.b();
    }
}
