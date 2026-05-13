package com.tsf.extend.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
/* loaded from: classes.dex */
public class TextProgressBar extends ProgressBar {

    /* renamed from: c */
    private static int f4590c = 16;

    /* renamed from: a */
    private String f4591a;

    /* renamed from: b */
    private Paint f4592b;

    public TextProgressBar(Context context) {
        super(context);
        m8470a();
    }

    public TextProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8470a();
    }

    public TextProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8470a();
    }

    /* renamed from: a */
    private void m8470a() {
        this.f4591a = "0%";
        this.f4592b = new Paint();
        this.f4592b.setTextSize((int) TypedValue.applyDimension(2, f4590c, getResources().getDisplayMetrics()));
        this.f4592b.setColor(-1);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = new Rect();
        this.f4592b.getTextBounds(this.f4591a, 0, this.f4591a.length(), rect);
        canvas.drawText(this.f4591a, (getWidth() / 2) - rect.centerX(), (getHeight() / 2) - rect.centerY(), this.f4592b);
    }

    public synchronized void setText(String str) {
        this.f4591a = str;
        drawableStateChanged();
    }

    public void setTextColor(int i) {
        this.f4592b.setColor(i);
        drawableStateChanged();
    }
}
