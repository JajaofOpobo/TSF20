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
    private static int c = 16;
    private String a;
    private Paint b;

    public TextProgressBar(Context context) {
        super(context);
        a();
    }

    public TextProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public TextProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.a = "0%";
        this.b = new Paint();
        this.b.setTextSize((int) TypedValue.applyDimension(2, c, getResources().getDisplayMetrics()));
        this.b.setColor(-1);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = new Rect();
        this.b.getTextBounds(this.a, 0, this.a.length(), rect);
        canvas.drawText(this.a, (getWidth() / 2) - rect.centerX(), (getHeight() / 2) - rect.centerY(), this.b);
    }

    public synchronized void setText(String str) {
        this.a = str;
        drawableStateChanged();
    }

    public void setTextColor(int i) {
        this.b.setColor(i);
        drawableStateChanged();
    }
}
