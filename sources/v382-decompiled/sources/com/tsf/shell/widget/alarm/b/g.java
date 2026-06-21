package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.widget.alarm.aj;
import com.tsf.shell.widget.alarm.j;

/* loaded from: classes.dex */
public class g extends e {
    private static int e = 2;
    private static float f = e;
    public f a;
    public f b;
    public f c;
    public f d;
    private String g;
    private String h;
    private String o;
    private String p;

    public g(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected void a() {
    }

    public void a(String str, String str2, String str3, String str4) {
        this.g = str;
        this.h = str2;
        this.o = str3;
        this.p = str4;
        Bitmap e2 = e();
        synchronized (this) {
            h();
            this.k = this.j.createTexture(e2, true);
        }
        e2.recycle();
    }

    public Bitmap e() {
        Paint paint = new Paint();
        paint.setTextSize(36.0f * f);
        paint.setColor(j.a.f);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(0.5f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setShadowLayer(5.0f * f, f * 6.0f, f * 6.0f, 855638016);
        Bitmap createBitmap = Bitmap.createBitmap(e * ItemInfo.APP_VERSION_CODE, e * ItemInfo.APP_INTENT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawText(this.o.equals("--") ? "--" : String.valueOf(this.o) + "º", 50.0f * f, f * 32.0f, paint);
        this.a = new f(this, 0, 0, e * 100, e * 64);
        paint.setTextSize(20.0f * f);
        canvas.drawText(this.p, 128.0f * f, 96.0f * f, paint);
        this.d = new f(this, 0, e * 64, e * ItemInfo.APP_VERSION_CODE, e * 64);
        String str = this.g.equals("--") ? "--" : String.valueOf(this.g) + "º";
        paint.setTextSize(26.0f * f);
        paint.setColor(j.a.c);
        canvas.drawText(str, 133.0f * f, f * 32.0f, paint);
        this.b = new f(this, e * 100, 0, e * 75, e * 64);
        String str2 = this.h.equals("--") ? "--" : String.valueOf(this.h) + "º";
        paint.setColor(j.a.b);
        canvas.drawText(str2, 208.0f * f, f * 32.0f, paint);
        this.c = new f(this, e * 175, 0, e * 75, e * 64);
        return aj.a(createBitmap);
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float c() {
        return 256.0f * f;
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float d() {
        return 128.0f * f;
    }
}
