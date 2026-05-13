package com.tsf.shell.widget.alarm.p203b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.widget.alarm.C4281d;
import com.tsf.shell.widget.alarm.C4314m;
import com.tsf.shell.widget.alarm.C4324p;
import com.tsf.shell.widget.alarm.p203b.AbstractC4263e;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* renamed from: com.tsf.shell.widget.alarm.b.b */
/* loaded from: classes.dex */
public class C4260b extends AbstractC4263e {

    /* renamed from: c */
    private static int f13812c = 2;

    /* renamed from: d */
    private static float f13813d = f13812c;

    /* renamed from: a */
    public final AbstractC4263e.C4264a f13814a;

    /* renamed from: b */
    public final AbstractC4263e.C4264a f13815b;

    public C4260b(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.f13814a = new AbstractC4263e.C4264a(0, 0, f13812c * ItemInfo.APP_VERSION_CODE, f13812c * 64);
        this.f13815b = new AbstractC4263e.C4264a(0, f13812c * 64, f13812c * ItemInfo.APP_VERSION_CODE, f13812c * 64);
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: a */
    protected void mo360a() {
        Bitmap m372b = m372b();
        this.f13825k = this.f13824j.createTexture(m372b, false);
        m372b.recycle();
    }

    /* renamed from: b */
    public Bitmap m372b() {
        String valueOf = String.valueOf(new GregorianCalendar().get(1));
        String m371e = m371e();
        Bitmap createBitmap = Bitmap.createBitmap(f13812c * ItemInfo.APP_VERSION_CODE, f13812c * ItemInfo.APP_INTENT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setTextSize(f13812c * 20);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(0.5f * f13812c);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setShadowLayer(5.0f * f13813d, f13813d * 6.0f, f13813d * 6.0f, 855638016);
        paint.setColor(C4281d.f13873a.f13880f);
        canvas.drawText(valueOf, f13813d * 128.0f, 32.0f * f13813d, paint);
        paint.setColor(C4281d.f13873a.f13880f);
        canvas.drawText(m371e, f13813d * 128.0f, 96.0f * f13813d, paint);
        return C4324p.m228a(createBitmap);
    }

    /* renamed from: e */
    public String m371e() {
        String string = this.f13823i.getString(C4314m.C4320f.abbrev_wday_month_day_no_year);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return DateFormat.format(string, calendar).toString();
    }

    /* renamed from: f */
    public void m370f() {
        synchronized (this) {
            m364h();
            mo360a();
        }
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: c */
    protected float mo358c() {
        return 256.0f * f13813d;
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: d */
    protected float mo357d() {
        return 128.0f * f13813d;
    }
}
