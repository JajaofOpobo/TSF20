package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.widget.alarm.b.e;
import com.tsf.shell.widget.alarm.m;
import com.tsf.shell.widget.alarm.p;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* loaded from: classes.dex */
public class b extends e {
    private static int c = 2;
    private static float d = c;
    public final e.a a;
    public final e.a b;

    public b(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.a = new e.a(0, 0, c * ItemInfo.APP_VERSION_CODE, c * 64);
        this.b = new e.a(0, c * 64, c * ItemInfo.APP_VERSION_CODE, c * 64);
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected void a() {
        Bitmap b = b();
        this.k = this.j.createTexture(b, false);
        b.recycle();
    }

    public Bitmap b() {
        String valueOf = String.valueOf(new GregorianCalendar().get(1));
        String e = e();
        Bitmap createBitmap = Bitmap.createBitmap(c * ItemInfo.APP_VERSION_CODE, c * ItemInfo.APP_INTENT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setTextSize(c * 20);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(0.5f * c);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setShadowLayer(5.0f * d, d * 6.0f, d * 6.0f, 855638016);
        paint.setColor(com.tsf.shell.widget.alarm.d.a.f);
        canvas.drawText(valueOf, d * 128.0f, 32.0f * d, paint);
        paint.setColor(com.tsf.shell.widget.alarm.d.a.f);
        canvas.drawText(e, d * 128.0f, 96.0f * d, paint);
        return p.a(createBitmap);
    }

    public String e() {
        String string = this.i.getString(m.f.abbrev_wday_month_day_no_year);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return DateFormat.format(string, calendar).toString();
    }

    public void f() {
        synchronized (this) {
            h();
            a();
        }
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float c() {
        return 256.0f * d;
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float d() {
        return 128.0f * d;
    }
}
