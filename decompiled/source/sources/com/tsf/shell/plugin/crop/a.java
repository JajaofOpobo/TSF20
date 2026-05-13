package com.tsf.shell.plugin.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
/* loaded from: classes.dex */
public class a extends f {
    private Path f;
    private float g;
    private float h;
    private Paint i;

    public a(Context context) {
        super(context);
        this.f = new Path();
        this.i = new Paint();
        this.i.setAntiAlias(true);
        this.i.setDither(true);
        this.i.setColor(-1996488705);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(4.0f);
    }

    @Override // com.tsf.shell.plugin.crop.f
    public void a(Canvas canvas) {
        canvas.drawPath(this.f, this.i);
    }

    @Override // com.tsf.shell.plugin.crop.f
    public boolean a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                this.f.reset();
                this.f.moveTo(x, y);
                this.g = x;
                this.h = y;
                this.a = x;
                this.b = y;
                this.c = x + 1.0f;
                this.d = y + 1.0f;
                break;
            case 1:
                this.f.lineTo(this.g, this.h);
                this.f.close();
                if (this.c - this.a > 50.0f && this.d - this.b > 50.0f) {
                    return true;
                }
                break;
            case 2:
                float abs = Math.abs(x - this.g);
                float abs2 = Math.abs(y - this.h);
                if (abs >= 4.0f || abs2 >= 4.0f) {
                    this.f.quadTo(this.g, this.h, (this.g + x) / 2.0f, (this.h + y) / 2.0f);
                    this.g = x;
                    this.h = y;
                }
                if (x > this.c) {
                    this.c = x;
                }
                if (x < this.a) {
                    this.a = x;
                }
                if (y > this.d) {
                    this.d = y;
                }
                if (y < this.b) {
                    this.b = y;
                    break;
                }
                break;
        }
        return false;
    }

    @Override // com.tsf.shell.plugin.crop.f
    public Bitmap a() {
        int ceil = (int) Math.ceil(this.c - this.a);
        int ceil2 = (int) Math.ceil(this.d - this.b);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1442840576);
        canvas.drawRect(0.0f, 0.0f, ceil, ceil2, paint);
        Bitmap createBitmap2 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(8.0f);
        canvas2.translate(-this.a, -this.b);
        canvas2.drawPath(this.f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
        createBitmap2.recycle();
        return createBitmap;
    }

    @Override // com.tsf.shell.plugin.crop.f
    public void a(Canvas canvas, float f) {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(8.0f);
        canvas.save();
        canvas.scale(f, f);
        canvas.translate(-this.a, -this.b);
        canvas.drawPath(this.f, paint);
        canvas.restore();
    }

    @Override // com.tsf.shell.plugin.crop.f
    public void a(Canvas canvas, float f, Paint paint, float f2) {
        canvas.scale(f, f);
        canvas.translate((-this.a) + (f2 / f), (-this.b) + (f2 / f));
        canvas.drawPath(this.f, paint);
    }
}
