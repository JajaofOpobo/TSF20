package android.support.p002v4.widget;

import android.view.View;
import android.widget.ListView;
/* renamed from: android.support.v4.widget.p */
/* loaded from: classes.dex */
class C0510p {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12229a(ListView listView, int i) {
        View childAt;
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
        }
    }
}
