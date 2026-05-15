package com.tsf.shell.f.i.c.a.b;

import android.graphics.Bitmap;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class o extends e {
    private float b = 320.0f;
    private float c = 64.0f;
    private float d = 64.0f;
    private float e = 64.0f;
    private float f = 31.0f;
    private float g = 62.0f;

    @Override // com.tsf.shell.f.i.c.a.b.e
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public float[] a(int i) {
        float f = ((this.d * i) + 1.0f) / this.b;
        float f2 = (((this.d * i) + 1.0f) + this.f) / this.b;
        float f3 = ((this.e * 0.0f) + 1.0f) / this.c;
        float f4 = ((this.e * 1.0f) - 1.0f) / this.c;
        float f5 = (((this.d * i) + 1.0f) + this.f) / this.b;
        float f6 = (((this.d * i) + 1.0f) + this.g) / this.b;
        float f7 = ((this.e * 0.0f) + 1.0f) / this.c;
        float f8 = ((this.e * 1.0f) - 1.0f) / this.c;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4, f5, f7, f5, f8, f6, f7, f6, f7, f5, f8, f6, f8};
    }

    @Override // com.tsf.shell.f.i.c.a.b.e
    public void a(Bitmap bitmap) {
        this.a = c.d.createTexture(bitmap, true);
        bitmap.recycle();
    }

    @Override // com.tsf.shell.f.i.c.a.b.e
    public Bitmap a() {
        return com.tsf.shell.f.i.c.a.l.a(c.c, b.d.widget_preview_cubeclock_am_pm);
    }
}
