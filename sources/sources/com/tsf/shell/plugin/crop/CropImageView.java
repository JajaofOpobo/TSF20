package com.tsf.shell.plugin.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.plugin.crop.d;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CropImageView extends View {
    boolean a;
    float b;
    float c;
    float d;
    private d e;
    private g f;
    private d.a g;
    private int h;
    private boolean i;
    private f j;
    private int k;
    private int l;

    public CropImageView(Context context) {
        super(context);
        this.g = d.a.NULL;
        this.h = 0;
        this.i = false;
        this.a = false;
        this.k = ItemInfo.APP_VERSION_CODE;
        this.l = ItemInfo.APP_VERSION_CODE;
        this.b = 1.0f;
        a();
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = d.a.NULL;
        this.h = 0;
        this.i = false;
        this.a = false;
        this.k = ItemInfo.APP_VERSION_CODE;
        this.l = ItemInfo.APP_VERSION_CODE;
        this.b = 1.0f;
        a();
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = d.a.NULL;
        this.h = 0;
        this.i = false;
        this.a = false;
        this.k = ItemInfo.APP_VERSION_CODE;
        this.l = ItemInfo.APP_VERSION_CODE;
        this.b = 1.0f;
        a();
    }

    private void a() {
        this.f = new g();
        this.e = new d(getContext(), this.f);
    }

    public void a(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    public void setCropMode(int i) {
        this.h = i;
        switch (i) {
            case 0:
                this.i = false;
                this.f.c();
                this.e.a(true);
                this.e.a((Bitmap) null);
                break;
            case 1:
                this.i = false;
                this.e.a(false);
                this.e.a((Bitmap) null);
                break;
            case 2:
                this.i = true;
                this.j = new a(getContext());
                break;
            case 3:
                this.i = false;
                this.e.a(true);
                this.j = new h(getContext());
                this.e.a(this.j.a());
                this.f.c();
                break;
        }
        invalidate();
    }

    public int getCropMode() {
        return this.h;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f.a(i, i2);
        this.e.a(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f.a(canvas)) {
            postInvalidateDelayed(15L);
        }
        if (this.i) {
            this.j.a(canvas);
        } else {
            this.e.a(canvas);
        }
    }

    public void setStroke(boolean z) {
        this.a = z;
    }

    public Bitmap getCropBitmap() {
        int i;
        int i2;
        int i3 = this.k;
        int i4 = this.l;
        float f = this.e.a.g / this.e.a.h;
        if (f >= 1.0f) {
            int i5 = (int) (i3 / f);
            i = i3;
            i2 = i5;
        } else {
            i = (int) (i4 * f);
            i2 = i4;
        }
        float f2 = i / this.e.a.g;
        if (i < 1 || i2 < 1) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        c.a("out bitmap : " + i + ":" + i2);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (this.e.d != null) {
            float fE = this.e.e();
            float f3 = fE * f2;
            this.j.a(canvas, f3);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            c.a("maskShapeScale:" + f3 + "   sourceScale:" + f2 + "      maskScale:" + fE);
        }
        canvas.save();
        canvas.scale(f2, f2);
        canvas.translate(-this.e.a.a, -this.e.a.b);
        this.f.a(canvas, paint);
        canvas.restore();
        if (!this.a) {
            return bitmapCreateBitmap;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i + 20, i2 + 20, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setColor(-1118482);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(18.0f);
        canvas2.save();
        if (this.e.d != null) {
            float fE2 = f2 * this.e.e();
            paint2.setStrokeWidth(18.0f / fE2);
            this.j.a(canvas2, fE2, paint2, 10.0f);
        } else {
            Path path = new Path();
            path.addRect(10.0f, 10.0f, i + 10, i2 + 10, Path.Direction.CW);
            canvas2.drawPath(path, paint2);
        }
        canvas2.restore();
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        canvas2.drawBitmap(bitmapCreateBitmap, 10.0f, 10.0f, paint3);
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.i) {
            if (this.j.a(motionEvent)) {
                this.i = false;
                this.e.a(this.j.a());
                this.e.c(this.j.a, this.j.b);
            }
            invalidate();
            return true;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.g = d.a.NULL;
            c.a("pointerNum:" + motionEvent.getAction());
            switch (motionEvent.getAction()) {
                case 2:
                    this.e.a(a(motionEvent) / this.b);
                    invalidate();
                    break;
                case 261:
                    this.b = a(motionEvent);
                    this.e.d();
                    break;
            }
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                a(motionEvent.getX(), motionEvent.getY());
                break;
            case 1:
            case 3:
                getParent().requestDisallowInterceptTouchEvent(false);
                c(motionEvent.getX(), motionEvent.getY());
                break;
            case 2:
                b(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
        }
        return true;
    }

    private float a(MotionEvent motionEvent) {
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = motionEvent.getX(1) - x;
        float y2 = motionEvent.getY(1) - y;
        return (float) Math.sqrt((x2 * x2) + (y2 * y2));
    }

    private void a(float f, float f2) {
        this.c = f;
        this.d = f2;
        this.f.a(true);
        this.g = this.e.b(f, f2);
        this.f.a(f, f2);
        c.a("Aciton:" + this.g);
        invalidate();
    }

    private void b(float f, float f2) {
        if (this.g == d.a.CENTER) {
            this.e.a(f, f2);
        } else if (this.g != d.a.NULL) {
            this.e.a(this.g, f, f2);
        }
        invalidate();
    }

    private void c(float f, float f2) {
        this.f.a(false);
        this.f.b();
        invalidate();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f.a(bitmap);
        invalidate();
    }
}
