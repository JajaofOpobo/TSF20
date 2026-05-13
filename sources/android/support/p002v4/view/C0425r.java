package android.support.p002v4.view;

import android.view.MenuItem;
import android.view.View;
/* renamed from: android.support.v4.view.r */
/* loaded from: classes.dex */
class C0425r {
    /* renamed from: a */
    public static void m12604a(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    /* renamed from: a */
    public static MenuItem m12603a(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    /* renamed from: b */
    public static MenuItem m12602b(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    /* renamed from: a */
    public static View m12605a(MenuItem menuItem) {
        return menuItem.getActionView();
    }
}
