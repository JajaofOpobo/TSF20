package android.support.p013v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p013v7.widget.InterfaceC0756p;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* renamed from: android.support.v7.widget.FitWindowsFrameLayout */
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0756p {

    /* renamed from: a */
    private InterfaceC0756p.InterfaceC0757a f1815a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.p013v7.widget.InterfaceC0756p
    public void setOnFitSystemWindowsListener(InterfaceC0756p.InterfaceC0757a interfaceC0757a) {
        this.f1815a = interfaceC0757a;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f1815a != null) {
            this.f1815a.mo11120a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
