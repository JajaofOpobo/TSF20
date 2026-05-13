package android.support.p013v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
/* renamed from: android.support.v7.widget.AppCompatCheckedTextView */
/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f1752a = {16843016};

    /* renamed from: b */
    private C0742g f1753b;

    /* renamed from: c */
    private C0751k f1754c;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0772x.m11063a(context), attributeSet, i);
        this.f1754c = C0751k.m11168a(this);
        this.f1754c.mo11165a(attributeSet, i);
        this.f1754c.mo11166a();
        this.f1753b = C0742g.m11215a();
        C0725aa m11295a = C0725aa.m11295a(getContext(), attributeSet, f1752a, i, 0);
        setCheckMarkDrawable(m11295a.m11300a(0));
        m11295a.m11301a();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        if (this.f1753b != null) {
            setCheckMarkDrawable(this.f1753b.m11211a(getContext(), i));
        } else {
            super.setCheckMarkDrawable(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1754c != null) {
            this.f1754c.m11171a(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1754c != null) {
            this.f1754c.mo11166a();
        }
    }
}
