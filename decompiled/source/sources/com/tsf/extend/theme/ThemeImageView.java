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
    private Bitmap a;
    private Matrix b;
    private Paint c;

    public ThemeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Matrix();
        a();
    }

    public ThemeImageView(Context context) {
        super(context);
        this.b = new Matrix();
        a();
    }

    private void a() {
        this.c = new Paint();
        this.c.setAntiAlias(true);
    }

    public void setBitmap(Bitmap bitmap) {
        this.a = bitmap;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a != null) {
            canvas.drawColor(-16777216);
            this.b.reset();
            int width = this.a.getWidth();
            int height = this.a.getHeight();
            float min = Math.min(((getWidth() * 1.0f) / width) * 1.0f, ((getHeight() * 1.0f) / height) * 1.0f);
            canvas.save();
            this.b.postScale(min, min);
            this.b.postTranslate((getWidth() - (width * min)) / 2.0f, (getHeight() - (height * min)) / 2.0f);
            canvas.drawBitmap(this.a, this.b, this.c);
            canvas.restore();
        }
    }
}
