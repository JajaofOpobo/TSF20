package com.tsf.shell.widget.alarm.p203b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.widget.alarm.C4281d;
import com.tsf.shell.widget.alarm.C4324p;
import com.tsf.shell.widget.alarm.p203b.AbstractC4263e;
/* renamed from: com.tsf.shell.widget.alarm.b.f */
/* loaded from: classes.dex */
public class C4265f extends AbstractC4263e {

    /* renamed from: e */
    private static int f13835e = 2;

    /* renamed from: f */
    private static float f13836f = f13835e;

    /* renamed from: a */
    public AbstractC4263e.C4264a f13837a;

    /* renamed from: b */
    public AbstractC4263e.C4264a f13838b;

    /* renamed from: c */
    public AbstractC4263e.C4264a f13839c;

    /* renamed from: d */
    public AbstractC4263e.C4264a f13840d;

    /* renamed from: g */
    private String f13841g;

    /* renamed from: h */
    private String f13842h;

    /* renamed from: o */
    private String f13843o;

    /* renamed from: p */
    private String f13844p;

    public C4265f(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: a */
    protected void mo360a() {
    }

    /* renamed from: a */
    public void m359a(String str, String str2, String str3, String str4) {
        this.f13841g = str;
        this.f13842h = str2;
        this.f13843o = str3;
        this.f13844p = str4;
        Bitmap m356e = m356e();
        synchronized (this) {
            m364h();
            this.f13825k = this.f13824j.createTexture(m356e, true);
        }
        m356e.recycle();
    }

    /* renamed from: e */
    public Bitmap m356e() {
        Paint paint = new Paint();
        paint.setTextSize(36.0f * f13836f);
        paint.setColor(C4281d.f13873a.f13880f);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(0.5f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setShadowLayer(5.0f * f13836f, f13836f * 6.0f, f13836f * 6.0f, 855638016);
        Bitmap createBitmap = Bitmap.createBitmap(f13835e * ItemInfo.APP_VERSION_CODE, f13835e * ItemInfo.APP_INTENT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawText(this.f13843o.equals("--") ? "--" : this.f13843o + "º", 50.0f * f13836f, f13836f * 32.0f, paint);
        this.f13837a = new AbstractC4263e.C4264a(0, 0, f13835e * 100, f13835e * 64);
        paint.setTextSize(20.0f * f13836f);
        canvas.drawText(this.f13844p, 128.0f * f13836f, 96.0f * f13836f, paint);
        this.f13840d = new AbstractC4263e.C4264a(0, f13835e * 64, f13835e * ItemInfo.APP_VERSION_CODE, f13835e * 64);
        String str = this.f13841g.equals("--") ? "--" : this.f13841g + "º";
        paint.setTextSize(26.0f * f13836f);
        paint.setColor(C4281d.f13873a.f13877c);
        canvas.drawText(str, 133.0f * f13836f, f13836f * 32.0f, paint);
        this.f13838b = new AbstractC4263e.C4264a(f13835e * 100, 0, f13835e * 75, f13835e * 64);
        String str2 = this.f13842h.equals("--") ? "--" : this.f13842h + "º";
        paint.setColor(C4281d.f13873a.f13876b);
        canvas.drawText(str2, 208.0f * f13836f, f13836f * 32.0f, paint);
        this.f13839c = new AbstractC4263e.C4264a(f13835e * 175, 0, f13835e * 75, f13835e * 64);
        return C4324p.m228a(createBitmap);
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: c */
    protected float mo358c() {
        return 256.0f * f13836f;
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: d */
    protected float mo357d() {
        return 128.0f * f13836f;
    }
}
