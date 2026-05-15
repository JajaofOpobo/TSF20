package com.tsf.shell.widget.cubeclock;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.widget.cubeclock.o;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class s extends g {
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;

    @Override // com.tsf.shell.widget.cubeclock.g
    public /* bridge */ /* synthetic */ TextureElement a() {
        return super.a();
    }

    public s(c cVar) {
        super(cVar);
        this.e = 130.0f;
        this.f = 130.0f;
        this.g = 64.0f;
        this.h = 128.0f;
        b();
    }

    private void b() {
        Bitmap bitmapA = r.a(this.b.a, o.a.cube_clock_week);
        this.c = 910.0f;
        this.d = 130.0f;
        this.a = this.b.b.createTexture(bitmapA, true);
        bitmapA.recycle();
    }

    public float[] a(int i) {
        float f = ((this.e * i) + 1.0f) / this.c;
        float f2 = (((this.e * i) + 1.0f) + this.g) / this.c;
        float f3 = ((this.f * 0.0f) + 1.0f) / this.d;
        float f4 = ((this.f * 1.0f) - 1.0f) / this.d;
        float f5 = (((this.e * i) + 1.0f) + this.g) / this.c;
        float f6 = (((this.e * i) + 1.0f) + this.h) / this.c;
        float f7 = ((this.f * 0.0f) + 1.0f) / this.d;
        float f8 = ((this.f * 1.0f) - 1.0f) / this.d;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4, f5, f7, f5, f8, f6, f7, f6, f7, f5, f8, f6, f8};
    }
}
