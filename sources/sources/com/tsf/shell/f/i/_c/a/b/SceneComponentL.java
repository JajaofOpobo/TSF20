package com.tsf.shell.f.i._c.a.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneComponentL extends ItemStubHelper {
    private int f;
    private float b = 92.0f;
    private float c = 92.0f;
    private float d = 92.0f;
    private float e = 92.0f;
    private ArrayList<a> g = new ArrayList<>();

    @Override // com.tsf.shell.f.i._c.a.b.SceneComponentE
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public SceneComponentL() {
        this.f = -13421773;
        this.f = d();
    }

    @Override // com.tsf.shell.f.i._c.a.b.SceneComponentE
    public void a(Bitmap bitmap) {
        this.a = FolderWidgetGroup.d.createTexture(bitmap, true);
        bitmap.recycle();
    }

    @Override // com.tsf.shell.f.i._c.a.b.SceneComponentE
    public Bitmap c() {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(92, 92, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        canvas.drawRect(1.0f, 1.0f, 91.0f, 91.0f, paint);
        return bitmapCreateBitmap;
    }

    public void a(a aVar) {
        this.g.add(aVar);
        aVar.a(this.f);
    }

    private int d() {
        return -13421773;
    }

    public float[] c() {
        float f = ((this.d * 0) + 1.0f) / this.b;
        float f2 = ((this.d * 1) - 1.0f) / this.b;
        float f3 = ((this.e * 0) + 1.0f) / this.c;
        float f4 = ((this.e * 1) - 1.0f) / this.c;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4};
    }
}
