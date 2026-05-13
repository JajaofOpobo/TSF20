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
import com.tsf.shell.plugin.crop.C3791d;
/* loaded from: classes.dex */
public class CropImageView extends View {

    /* renamed from: a */
    boolean f12417a;

    /* renamed from: b */
    float f12418b;

    /* renamed from: c */
    float f12419c;

    /* renamed from: d */
    float f12420d;

    /* renamed from: e */
    private C3791d f12421e;

    /* renamed from: f */
    private C3797g f12422f;

    /* renamed from: g */
    private C3791d.EnumC3792a f12423g;

    /* renamed from: h */
    private int f12424h;

    /* renamed from: i */
    private boolean f12425i;

    /* renamed from: j */
    private C3796f f12426j;

    /* renamed from: k */
    private int f12427k;

    /* renamed from: l */
    private int f12428l;

    public CropImageView(Context context) {
        super(context);
        this.f12423g = C3791d.EnumC3792a.NULL;
        this.f12424h = 0;
        this.f12425i = false;
        this.f12417a = false;
        this.f12427k = ItemInfo.APP_VERSION_CODE;
        this.f12428l = ItemInfo.APP_VERSION_CODE;
        this.f12418b = 1.0f;
        m1491a();
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12423g = C3791d.EnumC3792a.NULL;
        this.f12424h = 0;
        this.f12425i = false;
        this.f12417a = false;
        this.f12427k = ItemInfo.APP_VERSION_CODE;
        this.f12428l = ItemInfo.APP_VERSION_CODE;
        this.f12418b = 1.0f;
        m1491a();
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12423g = C3791d.EnumC3792a.NULL;
        this.f12424h = 0;
        this.f12425i = false;
        this.f12417a = false;
        this.f12427k = ItemInfo.APP_VERSION_CODE;
        this.f12428l = ItemInfo.APP_VERSION_CODE;
        this.f12418b = 1.0f;
        m1491a();
    }

    /* renamed from: a */
    private void m1491a() {
        this.f12422f = new C3797g();
        this.f12421e = new C3791d(getContext(), this.f12422f);
    }

    /* renamed from: a */
    public void m1489a(int i, int i2) {
        this.f12427k = i;
        this.f12428l = i2;
    }

    public void setCropMode(int i) {
        this.f12424h = i;
        switch (i) {
            case 0:
                this.f12425i = false;
                this.f12422f.m1426c();
                this.f12421e.m1458a(true);
                this.f12421e.m1461a((Bitmap) null);
                break;
            case 1:
                this.f12425i = false;
                this.f12421e.m1458a(false);
                this.f12421e.m1461a((Bitmap) null);
                break;
            case 2:
                this.f12425i = true;
                this.f12426j = new C3787a(getContext());
                break;
            case 3:
                this.f12425i = false;
                this.f12421e.m1458a(true);
                this.f12426j = new C3798h(getContext());
                this.f12421e.m1461a(this.f12426j.mo1424a());
                this.f12422f.m1426c();
                break;
        }
        invalidate();
    }

    public int getCropMode() {
        return this.f12424h;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12422f.m1433a(i, i2);
        this.f12421e.m1462a(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f12422f.m1431a(canvas)) {
            postInvalidateDelayed(15L);
        }
        if (this.f12425i) {
            this.f12426j.mo1438a(canvas);
        } else {
            this.f12421e.m1460a(canvas);
        }
    }

    public void setStroke(boolean z) {
        this.f12417a = z;
    }

    public Bitmap getCropBitmap() {
        int i;
        int i2;
        int i3 = this.f12427k;
        int i4 = this.f12428l;
        float f = this.f12421e.f12448a.f12440g / this.f12421e.f12448a.f12441h;
        if (f >= 1.0f) {
            i = i3;
            i2 = (int) (i3 / f);
        } else {
            i = (int) (i4 * f);
            i2 = i4;
        }
        float f2 = i / this.f12421e.f12448a.f12440g;
        if (i < 1 || i2 < 1) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        C3790c.m1466a("out bitmap : " + i + ":" + i2);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (this.f12421e.f12451d != null) {
            float m1446e = this.f12421e.m1446e();
            float f3 = m1446e * f2;
            this.f12426j.mo1423a(canvas, f3);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            C3790c.m1466a("maskShapeScale:" + f3 + "   sourceScale:" + f2 + "      maskScale:" + m1446e);
        }
        canvas.save();
        canvas.scale(f2, f2);
        canvas.translate(-this.f12421e.f12448a.f12434a, -this.f12421e.f12448a.f12435b);
        this.f12422f.m1430a(canvas, paint);
        canvas.restore();
        if (this.f12417a) {
            Bitmap createBitmap2 = Bitmap.createBitmap(i + 20, i2 + 20, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setDither(true);
            paint2.setColor(-1118482);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(18.0f);
            canvas2.save();
            if (this.f12421e.f12451d != null) {
                float m1446e2 = f2 * this.f12421e.m1446e();
                paint2.setStrokeWidth(18.0f / m1446e2);
                this.f12426j.mo1422a(canvas2, m1446e2, paint2, 10.0f);
            } else {
                Path path = new Path();
                path.addRect(10.0f, 10.0f, i + 10, i2 + 10, Path.Direction.CW);
                canvas2.drawPath(path, paint2);
            }
            canvas2.restore();
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            canvas2.drawBitmap(createBitmap, 10.0f, 10.0f, paint3);
            createBitmap.recycle();
            return createBitmap2;
        }
        return createBitmap;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f12425i) {
            if (this.f12426j.mo1437a(motionEvent)) {
                this.f12425i = false;
                this.f12421e.m1461a(this.f12426j.mo1424a());
                this.f12421e.m1451c(this.f12426j.f12482a, this.f12426j.f12483b);
            }
            invalidate();
            return true;
        } else if (motionEvent.getPointerCount() > 1) {
            this.f12423g = C3791d.EnumC3792a.NULL;
            C3790c.m1466a("pointerNum:" + motionEvent.getAction());
            switch (motionEvent.getAction()) {
                case 2:
                    this.f12421e.m1465a(m1488a(motionEvent) / this.f12418b);
                    invalidate();
                    return true;
                case 261:
                    this.f12418b = m1488a(motionEvent);
                    this.f12421e.m1449d();
                    return true;
                case 262:
                default:
                    return true;
            }
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    m1490a(motionEvent.getX(), motionEvent.getY());
                    return true;
                case 1:
                case 3:
                    getParent().requestDisallowInterceptTouchEvent(false);
                    m1486c(motionEvent.getX(), motionEvent.getY());
                    return true;
                case 2:
                    m1487b(motionEvent.getX(), motionEvent.getY());
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: a */
    private float m1488a(MotionEvent motionEvent) {
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = motionEvent.getX(1) - x;
        float y2 = motionEvent.getY(1) - y;
        return (float) Math.sqrt((x2 * x2) + (y2 * y2));
    }

    /* renamed from: a */
    private void m1490a(float f, float f2) {
        this.f12419c = f;
        this.f12420d = f2;
        this.f12422f.m1428a(true);
        this.f12423g = this.f12421e.m1455b(f, f2);
        this.f12422f.m1434a(f, f2);
        C3790c.m1466a("Aciton:" + this.f12423g);
        invalidate();
    }

    /* renamed from: b */
    private void m1487b(float f, float f2) {
        if (this.f12423g == C3791d.EnumC3792a.CENTER) {
            this.f12421e.m1464a(f, f2);
        } else if (this.f12423g != C3791d.EnumC3792a.NULL) {
            this.f12421e.m1459a(this.f12423g, f, f2);
        }
        invalidate();
    }

    /* renamed from: c */
    private void m1486c(float f, float f2) {
        this.f12422f.m1428a(false);
        this.f12422f.m1427b();
        invalidate();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f12422f.m1432a(bitmap);
        invalidate();
    }
}
