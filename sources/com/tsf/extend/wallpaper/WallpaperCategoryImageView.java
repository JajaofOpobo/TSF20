package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class WallpaperCategoryImageView extends View {

    /* renamed from: a */
    private Bitmap f6292a;

    /* renamed from: b */
    private Matrix f6293b;

    /* renamed from: c */
    private Paint f6294c;

    /* renamed from: d */
    private float f6295d;

    /* renamed from: e */
    private int f6296e;

    public WallpaperCategoryImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6293b = new Matrix();
        this.f6294c = new Paint();
        this.f6294c.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6292a != null) {
            m6923a(canvas);
        }
    }

    /* renamed from: a */
    private void m6923a(Canvas canvas) {
        boolean z = this.f6292a != null;
        int width = getWidth();
        if (z) {
            this.f6293b.reset();
            float width2 = (width * 1.0f) / this.f6292a.getWidth();
            this.f6293b.postScale(width2, width2);
            float height = getHeight() - (width2 * this.f6292a.getHeight());
            float f = this.f6295d * height;
            if (f > 0.0f) {
                f = 0.0f;
            }
            if (f >= height) {
                height = f;
            }
            this.f6293b.postTranslate(0.0f, height);
            canvas.drawBitmap(this.f6292a, this.f6293b, this.f6294c);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f6292a = bitmap;
        invalidate();
    }

    /* renamed from: a */
    public void m6924a(int i) {
        this.f6296e = i;
        int top = ((View) getParent()).getTop();
        int height = getHeight();
        this.f6295d = ((((top + height) * 1.0f) / (height + this.f6296e)) * 0.33333334f) + 0.33333334f;
        invalidate();
    }
}
