package android.support.v7.widget;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
class f implements Runnable {
    final /* synthetic */ ListPopupWindow a;

    private f(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    /* synthetic */ f(ListPopupWindow listPopupWindow, f fVar) {
        this(listPopupWindow);
    }

    @Override // java.lang.Runnable
    public void run() {
        PopupWindow popupWindow;
        if (this.a.f != null && this.a.f.getCount() > this.a.f.getChildCount() && this.a.f.getChildCount() <= this.a.a) {
            popupWindow = this.a.d;
            popupWindow.setInputMethodMode(2);
            this.a.b();
        }
    }
}
