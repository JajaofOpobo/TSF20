package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class ThemeImageView extends View {

    /* renamed from: a */
    private Bitmap f5186a;

    /* renamed from: b */
    private Matrix f5187b;

    /* renamed from: c */
    private Paint f5188c;

    public ThemeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5187b = new Matrix();
        m8010a();
    }

    public ThemeImageView(Context context) {
        super(context);
        this.f5187b = new Matrix();
        m8010a();
    }

    /* renamed from: a */
    private void m8010a() {
        this.f5188c = new Paint();
        this.f5188c.setAntiAlias(true);
    }

    public void setBitmap(Bitmap bitmap) {
        this.f5186a = bitmap;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5186a != null) {
            canvas.drawColor(-16777216);
            this.f5187b.reset();
            int width = this.f5186a.getWidth();
            int height = this.f5186a.getHeight();
            float min = Math.min(((getWidth() * 1.0f) / width) * 1.0f, ((getHeight() * 1.0f) / height) * 1.0f);
            canvas.save();
            this.f5187b.postScale(min, min);
            this.f5187b.postTranslate((getWidth() - (width * min)) / 2.0f, (getHeight() - (height * min)) / 2.0f);
            canvas.drawBitmap(this.f5186a, this.f5187b, this.f5188c);
            canvas.restore();
        }
    }
}
