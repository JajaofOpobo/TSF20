package com.tsf.shell.plugin.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
/* renamed from: com.tsf.shell.plugin.crop.a */
/* loaded from: classes.dex */
public class C3787a extends C3796f {

    /* renamed from: f */
    private Path f12430f;

    /* renamed from: g */
    private float f12431g;

    /* renamed from: h */
    private float f12432h;

    /* renamed from: i */
    private Paint f12433i;

    public C3787a(Context context) {
        super(context);
        this.f12430f = new Path();
        this.f12433i = new Paint();
        this.f12433i.setAntiAlias(true);
        this.f12433i.setDither(true);
        this.f12433i.setColor(-1996488705);
        this.f12433i.setStyle(Paint.Style.STROKE);
        this.f12433i.setStrokeWidth(4.0f);
    }

    @Override // com.tsf.shell.plugin.crop.C3796f
    /* renamed from: a */
    public void mo1438a(Canvas canvas) {
        canvas.drawPath(this.f12430f, this.f12433i);
    }

    @Override // com.tsf.shell.plugin.crop.C3796f
    /* renamed from: a */
    public boolean mo1437a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                this.f12430f.reset();
                this.f12430f.moveTo(x, y);
                this.f12431g = x;
                this.f12432h = y;
                this.f12482a = x;
                this.f12483b = y;
                this.f12484c = x + 1.0f;
                this.f12485d = y + 1.0f;
                break;
            case 1:
                this.f12430f.lineTo(this.f12431g, this.f12432h);
                this.f12430f.close();
                if (this.f12484c - this.f12482a > 50.0f && this.f12485d - this.f12483b > 50.0f) {
                    return true;
                }
                break;
            case 2:
                float abs = Math.abs(x - this.f12431g);
                float abs2 = Math.abs(y - this.f12432h);
                if (abs >= 4.0f || abs2 >= 4.0f) {
                    this.f12430f.quadTo(this.f12431g, this.f12432h, (this.f12431g + x) / 2.0f, (this.f12432h + y) / 2.0f);
                    this.f12431g = x;
                    this.f12432h = y;
                }
                if (x > this.f12484c) {
                    this.f12484c = x;
                }
                if (x < this.f12482a) {
                    this.f12482a = x;
                }
                if (y > this.f12485d) {
                    this.f12485d = y;
                }
                if (y < this.f12483b) {
                    this.f12483b = y;
                    break;
                }
                break;
        }
        return false;
    }

    @Override // com.tsf.shell.plugin.crop.C3796f
    /* renamed from: a */
    public Bitmap mo1424a() {
        int ceil = (int) Math.ceil(this.f12484c - this.f12482a);
        int ceil2 = (int) Math.ceil(this.f12485d - this.f12483b);
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
        canvas2.translate(-this.f12482a, -this.f12483b);
        canvas2.drawPath(this.f12430f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
        createBitmap2.recycle();
        return createBitmap;
    }

    @Override // com.tsf.shell.plugin.crop.C3796f
    /* renamed from: a */
    public void mo1423a(Canvas canvas, float f) {
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
        canvas.translate(-this.f12482a, -this.f12483b);
        canvas.drawPath(this.f12430f, paint);
        canvas.restore();
    }

    @Override // com.tsf.shell.plugin.crop.C3796f
    /* renamed from: a */
    public void mo1422a(Canvas canvas, float f, Paint paint, float f2) {
        canvas.scale(f, f);
        canvas.translate((-this.f12482a) + (f2 / f), (-this.f12483b) + (f2 / f));
        canvas.drawPath(this.f12430f, paint);
    }
}
