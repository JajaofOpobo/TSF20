package android.support.v7.widget;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
class c extends DataSetObserver {
    final /* synthetic */ ListPopupWindow a;

    private c(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    /* synthetic */ c(ListPopupWindow listPopupWindow, c cVar) {
        this(listPopupWindow);
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        if (this.a.e()) {
            this.a.b();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.a.c();
    }
}
