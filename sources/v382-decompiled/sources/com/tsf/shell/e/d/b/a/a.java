package com.tsf.shell.e.d.b.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
public class a extends l {
    private float e;
    private float f;
    private float g;
    private b h;
    private m i;
    private float a = 0.0f;
    private TextureElement b = new TextureElement(0, false);
    private TextureElement c = new TextureElement(0, false);
    private TextureElement d = new TextureElement(0, false);
    private int j = 40;

    public a(final int i, float f, float f2, float f3) {
        final int argb = Color.argb(Color.alpha(i), Color.red(i) / 2, Color.green(i) / 2, Color.blue(i) / 2);
        a(new b() { // from class: com.tsf.shell.e.d.b.a.a.1
            @Override // com.tsf.shell.e.d.b.a.b
            public Bitmap a() {
                return a.this.a(i);
            }

            @Override // com.tsf.shell.e.d.b.a.b
            public Bitmap b() {
                return a.this.a(argb);
            }
        }, f, f2, f3);
    }

    private void b() {
        if (this.b.id == 0) {
            Bitmap a = this.h.a();
            com.censivn.C3DEngine.a.g().a(this.b, a);
            a.recycle();
        }
        if (this.c.id == 0) {
            Bitmap b = this.h.b();
            com.censivn.C3DEngine.a.g().a(this.c, b);
            b.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(int i) {
        Bitmap createBitmap = Bitmap.createBitmap((int) (((6.283185307179586d * this.f) * this.g) / 360.0d), (int) this.e, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawRect(1.0f, 1.0f, r2 - 1, r4 - 1, paint);
        return createBitmap;
    }

    public void a() {
        com.censivn.C3DEngine.a.g().a(this.b);
        com.censivn.C3DEngine.a.g().a(this.c);
        this.d.id = 0;
    }

    private void a(b bVar, float f, float f2, float f3) {
        float f4;
        float f5;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = bVar;
        float f6 = this.e / 2.0f;
        this.i = new m(0.0f, 0.0f, (this.j / 2) - 1, 1, false);
        this.i.textures().addElement(this.d);
        addChild(this.i);
        int size = this.i.points().size();
        float f7 = 280.0f / ((size / 2.0f) - 1.0f);
        float f8 = size / 2.0f;
        for (int i = 0; i < size; i++) {
            int i2 = (size - (i / 2)) - 1;
            if (i % 2 != 0) {
                i2 -= size / 2;
            }
            double radians = Math.toRadians(r3 * f7);
            float sin = (float) (Math.sin(radians) * this.f);
            float cos = (float) (Math.cos(radians) * this.f);
            float f9 = (i / 2) / f8;
            if (i % 2 == 0) {
                f5 = 0.0f;
                f4 = f6;
            } else {
                f4 = -f6;
                f5 = 1.0f;
            }
            this.i.points().setPX(i2, cos, f4, sin);
            this.i.uvs().set(i2, f9, f5);
        }
    }

    public void a(float f) {
        b();
        this.d.id = this.b.id;
        this.i.rotation().y = f;
        dispatchDraw();
    }

    public void b(float f) {
        b();
        this.d.id = this.c.id;
        this.i.rotation().y = f;
        dispatchDraw();
    }
}
