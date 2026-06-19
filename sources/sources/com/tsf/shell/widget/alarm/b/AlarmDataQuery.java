package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.widget.alarm.b.AlarmDataEntry;
import com.tsf.shell.widget.alarm.AlarmResources;
import com.tsf.shell.widget.alarm.AlarmTouchManager;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmDataQuery extends AlarmDataEntry {
    private static int c = 2;
    private static float d = c;
    public final AlarmDataEntry.a a;
    public final AlarmDataEntry.a b;

    public b(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.a = new AlarmDataEntry.a(0, 0, c * ItemInfo.APP_VERSION_CODE, c * 64);
        this.b = new AlarmDataEntry.a(0, c * 64, c * ItemInfo.APP_VERSION_CODE, c * 64);
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected void a() {
        Bitmap bitmapB = b();
        this.k = this.j.createTexture(bitmapB, false);
        bitmapB.recycle();
    }

    public class Bitmap 
        String strValueOf = String.valueOf(new GregorianCalendar().get(1));
        String strE = e();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c * ItemInfo.APP_VERSION_CODE, c * ItemInfo.APP_INTENT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setTextSize(c * 20);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(0.5f * c);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setShadowLayer(5.0f * d, d * 6.0f, d * 6.0f, 855638016);
        paint.setColor(com.tsf.shell.widget.alarm.d.a.f);
        canvas.drawText(strValueOf, d * 128.0f, 32.0f * d, paint);
        paint.setColor(com.tsf.shell.widget.alarm.d.a.f);
        canvas.drawText(strE, d * 128.0f, 96.0f * d, paint);
        return p.a(bitmapCreateBitmap);
    }

    public class String 
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

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected float c() {
        return 256.0f * d;
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected float d() {
        return 128.0f * d;
    }
}
