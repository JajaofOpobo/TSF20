package android.support.v7.widget;

/* loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ ListPopupWindow a;

    private b(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    /* synthetic */ b(ListPopupWindow listPopupWindow, b bVar) {
        this(listPopupWindow);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.d();
    }
}
