package android.support.v4.g;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class g implements i {
    g() {
    }

    @Override // android.support.v4.g.i
    public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2);
    }
}
