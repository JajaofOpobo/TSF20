package android.support.p013v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p013v7.widget.InterfaceC0756p;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0756p {

    /* renamed from: a */
    private InterfaceC0756p.InterfaceC0757a f1816a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.p013v7.widget.InterfaceC0756p
    public void setOnFitSystemWindowsListener(InterfaceC0756p.InterfaceC0757a interfaceC0757a) {
        this.f1816a = interfaceC0757a;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f1816a != null) {
            this.f1816a.mo11120a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
