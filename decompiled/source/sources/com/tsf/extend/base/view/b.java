package com.tsf.extend.base.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class b extends Drawable {
    private Bitmap a;
    private int c;
    private int d;
    private final Paint e = new Paint(2);
    private int b = 255;

    public b(Bitmap bitmap) {
        this.a = bitmap;
        if (bitmap != null) {
            this.c = this.a.getWidth();
            this.d = this.a.getHeight();
            return;
        }
        this.d = 0;
        this.c = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.a != null) {
            canvas.drawBitmap(this.a, (Rect) null, bounds, this.e);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b = i;
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.e.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.d;
    }

    public void a(Bitmap bitmap) {
        this.a = bitmap;
        if (bitmap != null) {
            this.c = this.a.getWidth();
            this.d = this.a.getHeight();
            return;
        }
        this.d = 0;
        this.c = 0;
    }

    public Bitmap a() {
        return this.a;
    }
}
