package com.tsf.extend.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.tsf.extend.C1536f;
/* loaded from: classes.dex */
public class CmPopupWindow extends PopupWindow {

    /* renamed from: a */
    private boolean f4538a;

    public CmPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4538a = false;
    }

    public CmPopupWindow() {
        this((View) null, 0, 0);
    }

    public CmPopupWindow(View view, int i, int i2) {
        this(view, i, i2, false);
    }

    public CmPopupWindow(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
        this.f4538a = false;
        setBackgroundDrawable(null);
        setInputMethodMode(1);
        setTouchable(true);
        setOutsideTouchable(false);
        view.setFocusableInTouchMode(true);
        m8496a(view);
        setAnimationStyle(C1536f.C1544h.menushow);
        update();
    }

    /* renamed from: a */
    private void m8496a(final View view) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.tsf.extend.base.view.CmPopupWindow.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        if (CmPopupWindow.this.f4538a || CmPopupWindow.this.m8497a(motionEvent.getX(), motionEvent.getY(), view)) {
                            return false;
                        }
                        CmPopupWindow.this.dismiss();
                        return true;
                    default:
                        return false;
                }
            }
        });
        view.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.extend.base.view.CmPopupWindow.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view2, int i, KeyEvent keyEvent) {
                if ((i == 82 || i == 4) && keyEvent.getAction() == 0) {
                    if (CmPopupWindow.this.isShowing()) {
                        CmPopupWindow.this.dismiss();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m8497a(float f, float f2, View view) {
        return ((float) view.getLeft()) < f && ((float) view.getRight()) > f && ((float) view.getTop()) < f2 && ((float) view.getBottom()) > f2;
    }
}
