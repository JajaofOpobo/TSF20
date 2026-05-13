package com.tsf.extend.base.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* renamed from: com.tsf.extend.base.view.b */
/* loaded from: classes.dex */
public class C1476b extends Drawable {

    /* renamed from: a */
    private Bitmap f4601a;

    /* renamed from: c */
    private int f4603c;

    /* renamed from: d */
    private int f4604d;

    /* renamed from: e */
    private final Paint f4605e = new Paint(2);

    /* renamed from: b */
    private int f4602b = 255;

    public C1476b(Bitmap bitmap) {
        this.f4601a = bitmap;
        if (bitmap != null) {
            this.f4603c = this.f4601a.getWidth();
            this.f4604d = this.f4601a.getHeight();
            return;
        }
        this.f4604d = 0;
        this.f4603c = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.f4601a != null) {
            canvas.drawBitmap(this.f4601a, (Rect) null, bounds, this.f4605e);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4605e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f4602b = i;
        this.f4605e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f4605e.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4602b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4603c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4604d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f4603c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f4604d;
    }

    /* renamed from: a */
    public void m8462a(Bitmap bitmap) {
        this.f4601a = bitmap;
        if (bitmap != null) {
            this.f4603c = this.f4601a.getWidth();
            this.f4604d = this.f4601a.getHeight();
            return;
        }
        this.f4604d = 0;
        this.f4603c = 0;
    }

    /* renamed from: a */
    public Bitmap m8463a() {
        return this.f4601a;
    }
}
