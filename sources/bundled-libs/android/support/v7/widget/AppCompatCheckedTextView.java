package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {
    private static final int[] a = {R.attr.checkMark};
    private g b;
    private k c;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(x.a(context), attributeSet, i);
        this.c = k.a(this);
        this.c.a(attributeSet, i);
        this.c.a();
        this.b = g.a();
        aa aaVarA = aa.a(getContext(), attributeSet, a, i, 0);
        setCheckMarkDrawable(aaVarA.a(0));
        aaVarA.a();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        if (this.b != null) {
            setCheckMarkDrawable(this.b.a(getContext(), i));
        } else {
            super.setCheckMarkDrawable(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.a();
        }
    }
}
