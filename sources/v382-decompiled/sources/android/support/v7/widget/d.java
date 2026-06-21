package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class d implements AbsListView.OnScrollListener {
    final /* synthetic */ ListPopupWindow a;

    private d(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    /* synthetic */ d(ListPopupWindow listPopupWindow, d dVar) {
        this(listPopupWindow);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        PopupWindow popupWindow;
        Handler handler;
        f fVar;
        f fVar2;
        if (i == 1 && !this.a.f()) {
            popupWindow = this.a.d;
            if (popupWindow.getContentView() != null) {
                handler = this.a.A;
                fVar = this.a.v;
                handler.removeCallbacks(fVar);
                fVar2 = this.a.v;
                fVar2.run();
            }
        }
    }
}
