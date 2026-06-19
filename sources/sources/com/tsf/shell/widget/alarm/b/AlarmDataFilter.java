package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.widget.alarm.b.AlarmDataEntry;
import com.tsf.shell.widget.alarm.AlarmTouchManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmDataFilter extends AlarmDataEntry {
    private static int e = 2;
    private static float f = e;
    public AlarmDataEntry.a a;
    public AlarmDataEntry.a b;
    public AlarmDataEntry.a c;
    public AlarmDataEntry.a d;
    private String g;
    private String h;
    private String o;
    private String p;

    public AlarmDataFilter(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected void a() {
    }

    public void a(String str, String str2, String str3, String str4) {
        this.g = str;
        this.h = str2;
        this.o = str3;
        this.p = str4;
        Bitmap bitmapE = e();
        synchronized (this) {
            AlarmDataFilter();
            this.k = this.j.createTexture(bitmapE, true);
        }
        bitmapE.recycle();
    }

    public class Bitmap 
        Paint paint = new Paint();
        paint.setTextSize(36.0f * f);
        paint.setColor(com.tsf.shell.widget.alarm.d.a.f);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(0.5f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setShadowLayer(5.0f * f, f * 6.0f, f * 6.0f, 855638016);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(e * ItemInfo.APP_VERSION_CODE, e * ItemInfo.APP_INTENT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawText(this.o.equals("--") ? "--" : this.o + "º", 50.0f * f, f * 32.0f, paint);
        this.a = new AlarmDataEntry.a(0, 0, e * 100, e * 64);
        paint.setTextSize(20.0f * f);
        canvas.drawText(this.p, 128.0f * f, 96.0f * f, paint);
        this.d = new AlarmDataEntry.a(0, e * 64, e * ItemInfo.APP_VERSION_CODE, e * 64);
        String str = this.g.equals("--") ? "--" : this.g + "º";
        paint.setTextSize(26.0f * f);
        paint.setColor(com.tsf.shell.widget.alarm.d.a.AlarmConfigThemeHandler);
        canvas.drawText(str, 133.0f * f, f * 32.0f, paint);
        this.b = new AlarmDataEntry.a(e * 100, 0, e * 75, e * 64);
        String str2 = this.h.equals("--") ? "--" : this.h + "º";
        paint.setColor(com.tsf.shell.widget.alarm.d.a.AlarmConfigDefaultHandler);
        canvas.drawText(str2, 208.0f * f, f * 32.0f, paint);
        this.c = new AlarmDataEntry.a(e * 175, 0, e * 75, e * 64);
        return p.a(bitmapCreateBitmap);
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected float c() {
        return 256.0f * f;
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected float d() {
        return 128.0f * f;
    }
}
