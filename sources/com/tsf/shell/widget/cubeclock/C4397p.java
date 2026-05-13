package com.tsf.shell.widget.cubeclock;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.widget.cubeclock.provider.C4399a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.widget.cubeclock.p */
/* loaded from: classes.dex */
public class C4397p extends AbstractC4387g {

    /* renamed from: c */
    private float f14269c;

    /* renamed from: d */
    private float f14270d;

    /* renamed from: e */
    private float f14271e;

    /* renamed from: f */
    private float f14272f;

    /* renamed from: g */
    private int f14273g;

    /* renamed from: h */
    private ArrayList<C4383d> f14274h;

    /* renamed from: i */
    private C4399a f14275i;

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4387g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ TextureElement mo17a() {
        return super.mo17a();
    }

    public C4397p(C4382c c4382c) {
        super(c4382c);
        this.f14271e = 92.0f;
        this.f14272f = 92.0f;
        this.f14273g = -13421773;
        this.f14274h = new ArrayList<>();
        this.f14275i = this.f14242b.f14209q;
        this.f14273g = m40c();
        m39d();
    }

    /* renamed from: a */
    public void m42a(C4383d c4383d) {
        this.f14274h.add(c4383d);
        c4383d.m72b(this.f14273g);
    }

    /* renamed from: a */
    public void m43a(int i) {
        this.f14273g = i;
        int size = this.f14274h.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f14274h.get(i2).m77a(i);
        }
    }

    /* renamed from: c */
    private int m40c() {
        return this.f14275i.f14279a;
    }

    /* renamed from: d */
    private void m39d() {
        Bitmap createBitmap = Bitmap.createBitmap(92, 92, Bitmap.Config.ARGB_8888);
        this.f14269c = createBitmap.getWidth();
        this.f14270d = createBitmap.getHeight();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        canvas.drawRect(1.0f, 1.0f, 91.0f, 91.0f, paint);
        this.f14241a = this.f14242b.f14194b.createTexture(createBitmap, true);
        createBitmap.recycle();
    }

    /* renamed from: b */
    public float[] m41b() {
        float f = ((this.f14271e * 0) + 1.0f) / this.f14269c;
        float f2 = ((this.f14271e * 1) - 1.0f) / this.f14269c;
        float f3 = ((this.f14272f * 0) + 1.0f) / this.f14270d;
        float f4 = ((this.f14272f * 1) - 1.0f) / this.f14270d;
        return new float[]{f, f3, f, f4, f2, f3, f2, f3, f, f4, f2, f4};
    }
}
