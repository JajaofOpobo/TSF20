package com.tsf.shell.f.d.b.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
/* loaded from: classes.dex */
public class a extends j {
    private float e;
    private float f;
    private float g;
    private InterfaceC0089a h;
    private k i;
    private float a = 0.0f;
    private TextureElement b = new TextureElement(0, false);
    private TextureElement c = new TextureElement(0, false);
    private TextureElement d = new TextureElement(0, false);
    private int j = 40;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.d.b.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0089a {
        Bitmap a();

        Bitmap b();
    }

    public a(final int i, float f, float f2, float f3) {
        final int argb = Color.argb(Color.alpha(i), Color.red(i) / 2, Color.green(i) / 2, Color.blue(i) / 2);
        a(new InterfaceC0089a() { // from class: com.tsf.shell.f.d.b.a.a.1
            @Override // com.tsf.shell.f.d.b.a.a.InterfaceC0089a
            public Bitmap a() {
                return a.this.a(i);
            }

            @Override // com.tsf.shell.f.d.b.a.a.InterfaceC0089a
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
        int i2 = (int) (((6.283185307179586d * this.f) * this.g) / 360.0d);
        int i3 = (int) this.e;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawRect(1.0f, 1.0f, i2 - 1, i3 - 1, paint);
        return createBitmap;
    }

    public void a() {
        com.censivn.C3DEngine.a.g().a(this.b);
        com.censivn.C3DEngine.a.g().a(this.c);
        this.d.id = 0;
    }

    private void a(InterfaceC0089a interfaceC0089a, float f, float f2, float f3) {
        int i;
        float f4;
        float f5;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = interfaceC0089a;
        float f6 = this.e / 2.0f;
        this.i = new k(0.0f, 0.0f, (this.j / 2) - 1, 1, false);
        this.i.textures().addElement(this.d);
        addChild(this.i);
        int size = this.i.points().size();
        float f7 = 280.0f / ((size / 2.0f) - 1.0f);
        float f8 = size / 2.0f;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = (size - (i2 / 2)) - 1;
            if (i2 % 2 != 0) {
                i3 -= size / 2;
            }
            double radians = Math.toRadians(i * f7);
            float sin = (float) (Math.sin(radians) * this.f);
            float cos = (float) (Math.cos(radians) * this.f);
            float f9 = (i2 / 2) / f8;
            if (i2 % 2 == 0) {
                f5 = 0.0f;
                f4 = f6;
            } else {
                f4 = -f6;
                f5 = 1.0f;
            }
            this.i.points().setPX(i3, cos, f4, sin);
            this.i.uvs().set(i3, f9, f5);
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
