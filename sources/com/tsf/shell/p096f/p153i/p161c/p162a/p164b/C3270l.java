package com.tsf.shell.p096f.p153i.p161c.p162a.p164b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.c.a.b.l */
/* loaded from: classes.dex */
public class C3270l extends AbstractC3263e {

    /* renamed from: f */
    private int f10792f;

    /* renamed from: b */
    private float f10788b = 92.0f;

    /* renamed from: c */
    private float f10789c = 92.0f;

    /* renamed from: d */
    private float f10790d = 92.0f;

    /* renamed from: e */
    private float f10791e = 92.0f;

    /* renamed from: g */
    private ArrayList<C3258a> f10793g = new ArrayList<>();

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.p164b.AbstractC3263e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo2947b() {
        super.mo2947b();
    }

    public C3270l() {
        this.f10792f = -13421773;
        this.f10792f = m2954d();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.p164b.AbstractC3263e
    /* renamed from: a */
    public void mo2948a(Bitmap bitmap) {
        this.f10761a = C3260c.f10741d.createTexture(bitmap, true);
        bitmap.recycle();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.p164b.AbstractC3263e
    /* renamed from: a */
    public Bitmap mo2950a() {
        Bitmap createBitmap = Bitmap.createBitmap(92, 92, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        canvas.drawRect(1.0f, 1.0f, 91.0f, 91.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public void m2956a(C3258a c3258a) {
        this.f10793g.add(c3258a);
        c3258a.m2986a(this.f10792f);
    }

    /* renamed from: d */
    private int m2954d() {
        return -13421773;
    }

    /* renamed from: c */
    public float[] m2955c() {
        float f = ((this.f10790d * 0) + 1.0f) / this.f10788b;
        float f2 = ((this.f10790d * 1) - 1.0f) / this.f10788b;
        float f3 = ((this.f10791e * 0) + 1.0f) / this.f10789c;
        float f4 = ((this.f10791e * 1) - 1.0f) / this.f10789c;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4};
    }
}
