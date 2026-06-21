package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.widget.ListViewCompat;

/* loaded from: classes.dex */
class a extends ListViewCompat {
    private boolean f;
    private boolean g;
    private boolean h;

    public a(Context context, boolean z) {
        super(context, null, android.support.v7.a.b.dropDownListViewStyle);
        this.g = z;
        setCacheColorHint(0);
    }

    @Override // android.support.v7.internal.widget.ListViewCompat
    protected boolean c() {
        return this.h || super.c();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.g && this.f) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.g || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.g || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.g || super.hasFocus();
    }
}
