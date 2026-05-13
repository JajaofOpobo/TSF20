package com.tsf.shell.widget.cubeclock;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.widget.cubeclock.C4395o;
/* renamed from: com.tsf.shell.widget.cubeclock.n */
/* loaded from: classes.dex */
public class C4394n extends AbstractC4387g {

    /* renamed from: c */
    private float f14265c;

    /* renamed from: d */
    private float f14266d;

    /* renamed from: e */
    private float f14267e;

    /* renamed from: f */
    private float f14268f;

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4387g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ TextureElement mo17a() {
        return super.mo17a();
    }

    public C4394n(C4382c c4382c) {
        super(c4382c);
        this.f14267e = 65.0f;
        this.f14268f = 130.0f;
        m44b();
    }

    /* renamed from: b */
    private void m44b() {
        Bitmap m20a = C4404r.m20a(this.f14242b.f14193a, C4395o.C4396a.cube_clock_number);
        this.f14265c = 650.0f;
        this.f14266d = 130.0f;
        this.f14241a = this.f14242b.f14194b.createTexture(m20a, true);
        m20a.recycle();
    }

    /* renamed from: a */
    public float[] m45a(int i, int i2) {
        float f = (((this.f14267e * i) + 1.0f) - 5.0f) / this.f14265c;
        float f2 = (((this.f14267e * (i + 1)) - 2.0f) - 5.0f) / this.f14265c;
        float f3 = ((this.f14268f * 0.0f) + 1.0f) / this.f14266d;
        float f4 = ((this.f14268f * 1.0f) - 1.0f) / this.f14266d;
        float f5 = (((this.f14267e * i2) + 2.0f) - (-5.0f)) / this.f14265c;
        float f6 = (((this.f14267e * (i2 + 1)) - 1.0f) - (-5.0f)) / this.f14265c;
        float f7 = ((this.f14268f * 0.0f) + 1.0f) / this.f14266d;
        float f8 = ((this.f14268f * 1.0f) - 1.0f) / this.f14266d;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4, f5, f7, f5, f8, f6, f7, f6, f7, f5, f8, f6, f8};
    }
}
