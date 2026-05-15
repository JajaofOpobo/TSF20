package com.tsf.shell.plugin.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017 A[ORIG_RETURN, RETURN] */
    @Override // com.tsf.shell.plugin.crop.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r5 = 1112014848(0x42480000, float:50.0)
            r4 = 1082130432(0x40800000, float:4.0)
            r7 = 1073741824(0x40000000, float:2.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.getX()
            float r1 = r9.getY()
            int r2 = r9.getAction()
            switch(r2) {
                case 0: goto L19;
                case 1: goto L81;
                case 2: goto L33;
                default: goto L17;
            }
        L17:
            r0 = 0
        L18:
            return r0
        L19:
            android.graphics.Path r2 = r8.f
            r2.reset()
            android.graphics.Path r2 = r8.f
            r2.moveTo(r0, r1)
            r8.g = r0
            r8.h = r1
            r8.a = r0
            r8.b = r1
            float r0 = r0 + r3
            r8.c = r0
            float r0 = r1 + r3
            r8.d = r0
            goto L17
        L33:
            float r2 = r8.g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            float r3 = r8.h
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L4b
            int r2 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r2 < 0) goto L60
        L4b:
            android.graphics.Path r2 = r8.f
            float r3 = r8.g
            float r4 = r8.h
            float r5 = r8.g
            float r5 = r5 + r0
            float r5 = r5 / r7
            float r6 = r8.h
            float r6 = r6 + r1
            float r6 = r6 / r7
            r2.quadTo(r3, r4, r5, r6)
            r8.g = r0
            r8.h = r1
        L60:
            float r2 = r8.c
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L68
            r8.c = r0
        L68:
            float r2 = r8.a
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L70
            r8.a = r0
        L70:
            float r0 = r8.d
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L78
            r8.d = r1
        L78:
            float r0 = r8.b
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L17
            r8.b = r1
            goto L17
        L81:
            android.graphics.Path r0 = r8.f
            float r1 = r8.g
            float r2 = r8.h
            r0.lineTo(r1, r2)
            android.graphics.Path r0 = r8.f
            r0.close()
            float r0 = r8.c
            float r1 = r8.a
            float r0 = r0 - r1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L17
            float r0 = r8.d
            float r1 = r8.b
            float r0 = r0 - r1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.crop.a.a(android.view.MotionEvent):boolean");
    }

    @Override // com.tsf.shell.plugin.crop.f
    public Bitmap a() {
        int iCeil = (int) Math.ceil(this.c - this.a);
        int iCeil2 = (int) Math.ceil(this.d - this.b);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1442840576);
        canvas.drawRect(0.0f, 0.0f, iCeil, iCeil2, paint);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
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
        canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint);
        bitmapCreateBitmap2.recycle();
        return bitmapCreateBitmap;
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
