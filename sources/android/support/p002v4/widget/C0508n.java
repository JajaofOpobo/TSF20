package android.support.p002v4.widget;

import android.widget.ListView;
/* renamed from: android.support.v4.widget.n */
/* loaded from: classes.dex */
public class C0508n extends AbstractView$OnTouchListenerC0472a {

    /* renamed from: a */
    private final ListView f1058a;

    public C0508n(ListView listView) {
        super(listView);
        this.f1058a = listView;
    }

    @Override // android.support.p002v4.widget.AbstractView$OnTouchListenerC0472a
    /* renamed from: a */
    public void mo12233a(int i, int i2) {
        C0509o.m12230a(this.f1058a, i2);
    }

    @Override // android.support.p002v4.widget.AbstractView$OnTouchListenerC0472a
    /* renamed from: e */
    public boolean mo12232e(int i) {
        return false;
    }

    @Override // android.support.p002v4.widget.AbstractView$OnTouchListenerC0472a
    /* renamed from: f */
    public boolean mo12231f(int i) {
        ListView listView = this.f1058a;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
