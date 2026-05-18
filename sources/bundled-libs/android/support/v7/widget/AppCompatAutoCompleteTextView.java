package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.af;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements af {
    private static final int[] a = {R.attr.popupBackground};
    private g b;
    private e c;
    private k d;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0012a.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(x.a(context), attributeSet, i);
        this.b = g.a();
        aa aaVarA = aa.a(getContext(), attributeSet, a, i, 0);
        if (aaVarA.f(0)) {
            setDropDownBackgroundDrawable(aaVarA.a(0));
        }
        aaVarA.a();
        this.c = new e(this, this.b);
        this.c.a(attributeSet, i);
        this.d = k.a(this);
        this.d.a(attributeSet, i);
        this.d.a();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        if (this.b != null) {
            setDropDownBackgroundDrawable(this.b.a(getContext(), i));
        } else {
            super.setDropDownBackgroundResource(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.c != null) {
            this.c.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.c != null) {
            this.c.a(drawable);
        }
    }

    @Override // android.support.v4.view.af
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.c != null) {
            this.c.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.af
    public ColorStateList getSupportBackgroundTintList() {
        if (this.c != null) {
            return this.c.a();
        }
        return null;
    }

    @Override // android.support.v4.view.af
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != null) {
            this.c.a(mode);
        }
    }

    @Override // android.support.v4.view.af
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.c != null) {
            return this.c.b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.c();
        }
        if (this.d != null) {
            this.d.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.d != null) {
            this.d.a(context, i);
        }
    }
}
