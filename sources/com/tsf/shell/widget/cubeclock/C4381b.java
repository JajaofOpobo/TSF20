package com.tsf.shell.widget.cubeclock;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.widget.cubeclock.C4395o;
/* renamed from: com.tsf.shell.widget.cubeclock.b */
/* loaded from: classes.dex */
public class C4381b extends AbstractC4387g {

    /* renamed from: c */
    private float f14187c;

    /* renamed from: d */
    private float f14188d;

    /* renamed from: e */
    private float f14189e;

    /* renamed from: f */
    private float f14190f;

    /* renamed from: g */
    private float f14191g;

    /* renamed from: h */
    private float f14192h;

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4387g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ TextureElement mo17a() {
        return super.mo17a();
    }

    public C4381b(C4382c c4382c) {
        super(c4382c);
        this.f14189e = 130.0f;
        this.f14190f = 130.0f;
        this.f14191g = 64.0f;
        this.f14192h = 128.0f;
        m82b();
    }

    /* renamed from: b */
    private void m82b() {
        Bitmap m20a = C4404r.m20a(this.f14242b.f14193a, C4395o.C4396a.cube_clock_am_pm);
        this.f14187c = 650.0f;
        this.f14188d = 130.0f;
        this.f14241a = this.f14242b.f14194b.createTexture(m20a, true);
        m20a.recycle();
    }

    /* renamed from: a */
    public float[] m83a(int i) {
        float f = ((this.f14189e * i) + 1.0f) / this.f14187c;
        float f2 = (((this.f14189e * i) + 1.0f) + this.f14191g) / this.f14187c;
        float f3 = ((this.f14190f * 0.0f) + 1.0f) / this.f14188d;
        float f4 = ((this.f14190f * 1.0f) - 1.0f) / this.f14188d;
        float f5 = (((this.f14189e * i) + 1.0f) + this.f14191g) / this.f14187c;
        float f6 = (((this.f14189e * i) + 1.0f) + this.f14192h) / this.f14187c;
        float f7 = ((this.f14190f * 0.0f) + 1.0f) / this.f14188d;
        float f8 = ((this.f14190f * 1.0f) - 1.0f) / this.f14188d;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4, f5, f7, f5, f8, f6, f7, f6, f7, f5, f8, f6, f8};
    }
}
