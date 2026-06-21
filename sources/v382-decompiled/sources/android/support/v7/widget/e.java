package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class e implements View.OnTouchListener {
    final /* synthetic */ ListPopupWindow a;

    private e(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    /* synthetic */ e(ListPopupWindow listPopupWindow, e eVar) {
        this(listPopupWindow);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Handler handler;
        f fVar;
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        PopupWindow popupWindow3;
        PopupWindow popupWindow4;
        Handler handler2;
        f fVar2;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            popupWindow = this.a.d;
            if (popupWindow != null) {
                popupWindow2 = this.a.d;
                if (popupWindow2.isShowing() && x >= 0) {
                    popupWindow3 = this.a.d;
                    if (x < popupWindow3.getWidth() && y >= 0) {
                        popupWindow4 = this.a.d;
                        if (y < popupWindow4.getHeight()) {
                            handler2 = this.a.A;
                            fVar2 = this.a.v;
                            handler2.postDelayed(fVar2, 250L);
                            return false;
                        }
                    }
                }
            }
        }
        if (action == 1) {
            handler = this.a.A;
            fVar = this.a.v;
            handler.removeCallbacks(fVar);
            return false;
        }
        return false;
    }
}
