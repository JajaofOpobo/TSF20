package com.tsf.shell.p096f.p153i.p161c.p162a.p164b;

import android.graphics.Bitmap;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3325l;
/* renamed from: com.tsf.shell.f.i.c.a.b.m */
/* loaded from: classes.dex */
public class C3271m extends AbstractC3263e {

    /* renamed from: b */
    private float f10794b = 448.0f;

    /* renamed from: c */
    private float f10795c = 64.0f;

    /* renamed from: d */
    private float f10796d = 64.0f;

    /* renamed from: e */
    private float f10797e = 64.0f;

    /* renamed from: f */
    private float f10798f = 31.0f;

    /* renamed from: g */
    private float f10799g = 62.0f;

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.p164b.AbstractC3263e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo2947b() {
        super.mo2947b();
    }

    /* renamed from: a */
    public float[] m2953a(int i) {
        float f = ((this.f10796d * i) + 1.0f) / this.f10794b;
        float f2 = (((this.f10796d * i) + 1.0f) + this.f10798f) / this.f10794b;
        float f3 = ((this.f10797e * 0.0f) + 1.0f) / this.f10795c;
        float f4 = ((this.f10797e * 1.0f) - 1.0f) / this.f10795c;
        float f5 = (((this.f10796d * i) + 1.0f) + this.f10798f) / this.f10794b;
        float f6 = (((this.f10796d * i) + 1.0f) + this.f10799g) / this.f10794b;
        float f7 = ((this.f10797e * 0.0f) + 1.0f) / this.f10795c;
        float f8 = ((this.f10797e * 1.0f) - 1.0f) / this.f10795c;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4, f5, f7, f5, f8, f6, f7, f6, f7, f5, f8, f6, f8};
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
        return C3325l.m2840a(C3260c.f10740c, C1306b.C1310d.widget_preview_cubeclock_week);
    }
}
