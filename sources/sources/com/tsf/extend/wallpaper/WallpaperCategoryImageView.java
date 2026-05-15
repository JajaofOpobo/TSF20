package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperCategoryImageView extends View {
    private Bitmap a;
    private Matrix b;
    private Paint c;
    private float d;
    private int e;

    public WallpaperCategoryImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Matrix();
        this.c = new Paint();
        this.c.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a != null) {
            a(canvas);
        }
    }

    private void a(Canvas canvas) {
        boolean z = this.a != null;
        int width = getWidth();
        if (z) {
            this.b.reset();
            float width2 = (width * 1.0f) / this.a.getWidth();
            this.b.postScale(width2, width2);
            float height = getHeight() - (width2 * this.a.getHeight());
            float f = this.d * height;
            if (f > 0.0f) {
                f = 0.0f;
            }
            if (f >= height) {
                height = f;
            }
            this.b.postTranslate(0.0f, height);
            canvas.drawBitmap(this.a, this.b, this.c);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.a = bitmap;
        invalidate();
    }

    public void a(int i) {
        this.e = i;
        int top = ((View) getParent()).getTop();
        int height = getHeight();
        this.d = ((((top + height) * 1.0f) / (height + this.e)) * 0.33333334f) + 0.33333334f;
        invalidate();
    }
}
