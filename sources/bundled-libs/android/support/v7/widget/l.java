package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class l extends k {
    private static final int[] b = {R.attr.drawableStart, R.attr.drawableEnd};
    private y c;
    private y d;

    l(TextView textView) {
        super(textView);
    }

    @Override // android.support.v7.widget.k
    void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.a.getContext();
        g gVarA = g.a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.c = a(context, gVarA, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.d = a(context, gVarA, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.k
    void a() {
        super.a();
        if (this.c != null || this.d != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.c);
            a(compoundDrawablesRelative[2], this.d);
        }
    }
}
