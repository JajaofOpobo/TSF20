package android.support.p013v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.p002v4.widget.C0517s;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
/* renamed from: android.support.v7.widget.AppCompatPopupWindow */
/* loaded from: classes.dex */
public class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: a */
    private static final boolean f1766a;

    /* renamed from: b */
    private boolean f1767b;

    static {
        f1766a = Build.VERSION.SDK_INT < 21;
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0725aa m11295a = C0725aa.m11295a(context, attributeSet, C0535a.C0546k.PopupWindow, i, 0);
        if (m11295a.m11286f(C0535a.C0546k.PopupWindow_overlapAnchor)) {
            m11552a(m11295a.m11297a(C0535a.C0546k.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(m11295a.m11300a(C0535a.C0546k.PopupWindow_android_popupBackground));
        m11295a.m11301a();
        if (Build.VERSION.SDK_INT < 14) {
            m11553a(this);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1766a && this.f1767b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    @TargetApi(19)
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1766a && this.f1767b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, (f1766a && this.f1767b) ? i2 - view.getHeight() : i2, i3, i4);
    }

    /* renamed from: a */
    private static void m11553a(final PopupWindow popupWindow) {
        try {
            final Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
            declaredField.setAccessible(true);
            Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            declaredField2.setAccessible(true);
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) declaredField2.get(popupWindow);
            declaredField2.set(popupWindow, new ViewTreeObserver.OnScrollChangedListener() { // from class: android.support.v7.widget.AppCompatPopupWindow.1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        WeakReference weakReference = (WeakReference) declaredField.get(popupWindow);
                        if (weakReference != null && weakReference.get() != null) {
                            onScrollChangedListener.onScrollChanged();
                        }
                    } catch (IllegalAccessException e) {
                    }
                }
            });
        } catch (Exception e) {
            Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", e);
        }
    }

    /* renamed from: a */
    public void m11552a(boolean z) {
        if (f1766a) {
            this.f1767b = z;
        } else {
            C0517s.m12173a(this, z);
        }
    }
}
