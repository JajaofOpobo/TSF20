package com.tsf.shell.widget.cubeclock;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.widget.cubeclock.C4395o;
/* renamed from: com.tsf.shell.widget.cubeclock.s */
/* loaded from: classes.dex */
public class C4405s extends AbstractC4387g {

    /* renamed from: c */
    private float f14292c;

    /* renamed from: d */
    private float f14293d;

    /* renamed from: e */
    private float f14294e;

    /* renamed from: f */
    private float f14295f;

    /* renamed from: g */
    private float f14296g;

    /* renamed from: h */
    private float f14297h;

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4387g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ TextureElement mo17a() {
        return super.mo17a();
    }

    public C4405s(C4382c c4382c) {
        super(c4382c);
        this.f14294e = 130.0f;
        this.f14295f = 130.0f;
        this.f14296g = 64.0f;
        this.f14297h = 128.0f;
        m15b();
    }

    /* renamed from: b */
    private void m15b() {
        Bitmap m20a = C4404r.m20a(this.f14242b.f14193a, C4395o.C4396a.cube_clock_week);
        this.f14292c = 910.0f;
        this.f14293d = 130.0f;
        this.f14241a = this.f14242b.f14194b.createTexture(m20a, true);
        m20a.recycle();
    }

    /* renamed from: a */
    public float[] m16a(int i) {
        float f = ((this.f14294e * i) + 1.0f) / this.f14292c;
        float f2 = (((this.f14294e * i) + 1.0f) + this.f14296g) / this.f14292c;
        float f3 = ((this.f14295f * 0.0f) + 1.0f) / this.f14293d;
        float f4 = ((this.f14295f * 1.0f) - 1.0f) / this.f14293d;
        float f5 = (((this.f14294e * i) + 1.0f) + this.f14296g) / this.f14292c;
        float f6 = (((this.f14294e * i) + 1.0f) + this.f14297h) / this.f14292c;
        float f7 = ((this.f14295f * 0.0f) + 1.0f) / this.f14293d;
        float f8 = ((this.f14295f * 1.0f) - 1.0f) / this.f14293d;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4, f5, f7, f5, f8, f6, f7, f6, f7, f5, f8, f6, f8};
    }
}
