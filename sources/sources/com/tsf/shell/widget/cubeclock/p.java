package com.tsf.shell.widget.cubeclock;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class p extends g {
    private float c;
    private float d;
    private float e;
    private float f;
    private int g;
    private ArrayList<d> h;
    private com.tsf.shell.widget.cubeclock.provider.a i;

    @Override // com.tsf.shell.widget.cubeclock.g
    public /* bridge */ /* synthetic */ TextureElement a() {
        return super.a();
    }

    public p(c cVar) {
        super(cVar);
        this.e = 92.0f;
        this.f = 92.0f;
        this.g = -13421773;
        this.h = new ArrayList<>();
        this.i = this.b.q;
        this.g = c();
        d();
    }

    public void a(d dVar) {
        this.h.add(dVar);
        dVar.b(this.g);
    }

    public void a(int i) {
        this.g = i;
        int size = this.h.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.h.get(i2).a(i);
        }
    }

    private int c() {
        return this.i.a;
    }

    private void d() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(92, 92, Bitmap.Config.ARGB_8888);
        this.c = bitmapCreateBitmap.getWidth();
        this.d = bitmapCreateBitmap.getHeight();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        canvas.drawRect(1.0f, 1.0f, 91.0f, 91.0f, paint);
        this.a = this.b.b.createTexture(bitmapCreateBitmap, true);
        bitmapCreateBitmap.recycle();
    }

    public float[] b() {
        float f = ((this.e * 0) + 1.0f) / this.c;
        float f2 = ((this.e * 1) - 1.0f) / this.c;
        float f3 = ((this.f * 0) + 1.0f) / this.d;
        float f4 = ((this.f * 1) - 1.0f) / this.d;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4};
    }
}
