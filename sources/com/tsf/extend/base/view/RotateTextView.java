package com.tsf.extend.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tsf.extend.C1536f;
/* loaded from: classes.dex */
public class RotateTextView extends TextView {

    /* renamed from: a */
    float f4570a;

    public RotateTextView(Context context) {
        this(context, null);
    }

    public RotateTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RotateTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4570a = 0.0f;
        setGravity(17);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1536f.C1545i.RotateTextView);
        this.f4570a = obtainStyledAttributes.getDimension(C1536f.C1545i.RotateTextView_rotate_degree, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        canvas.rotate(-45.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }
}
