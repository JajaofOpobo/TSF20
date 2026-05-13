package com.tsf.shell.f.e.c.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
/* loaded from: classes.dex */
public class d extends VObject3dContainer {
    private b a;
    private b b;
    private c c;
    private float d = 64.0f;
    private float e = 128.0f;
    private float f = 15.0f;
    private float g = (this.d + this.e) * 2.0f;
    private float h = this.g / 2.0f;
    private float i = 10.0f;
    private float j = this.g + (this.i * 2.0f);
    private int k = -13421773;
    private float l = 0.0f;
    private VObject3dContainer m;
    private VObject3dContainer n;
    private TextureElement o;

    public d(Context context, float f, float f2, float f3, int i) {
        a(f, f2, f3, i);
        d();
    }

    public float a() {
        return this.e;
    }

    private void a(float f, float f2, float f3, int i) {
        this.j = f;
        this.g = f - (this.i * 2.0f);
        this.h = this.g / 2.0f;
        this.d = (this.g - (f2 * 2.0f)) / 2.0f;
        this.e = f2;
        this.f = f3;
        this.k = i;
    }

    public void a(float f) {
        a(f, this.e, this.f, this.k);
        b();
    }

    public void b() {
        e a = this.c.a(this.d, this.e, this.f, this.k);
        this.a.a(a);
        this.b.a(a);
        c(0.0f);
    }

    private void d() {
        this.n = new VObject3dContainer();
        addChild(this.n);
        this.m = new VObject3dContainer();
        this.n.addChild(this.m);
        this.c = new c();
        e a = this.c.a(this.d, this.e, this.f, this.k);
        this.a = new b(128.0f, a);
        this.m.addChild(this.a);
        this.b = new b(128.0f, a);
        this.m.addChild(this.b);
        this.m.addChild(this.c);
        c(0.0f);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (this.o == null) {
            e();
        }
    }

    private void e() {
        if (this.o == null) {
            this.o = f();
            this.a.textures().addElement(this.o);
            this.b.textures().addElement(this.o);
        }
    }

    public void c() {
        if (this.o != null) {
            com.censivn.C3DEngine.a.g().a(this.o);
            this.o = null;
            this.a.textures().removeAll();
            this.b.textures().removeAll();
            this.c.a();
        }
    }

    public void b(float f) {
        this.l = f;
    }

    private TextureElement f() {
        Bitmap createBitmap = Bitmap.createBitmap((int) (this.e * 2.0f), (int) (this.e * 2.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setColor(this.k);
        paint.setAntiAlias(true);
        canvas.drawCircle(this.e, this.e, this.e, paint);
        TextureElement a = com.censivn.C3DEngine.a.g().a(createBitmap, true);
        createBitmap.recycle();
        return a;
    }

    public void c(float f) {
        if (f < 0.0f) {
            this.n.rotation().z = 180.0f + this.l;
            f *= -1.0f;
        } else {
            this.n.rotation().z = this.l;
        }
        float d = d(f);
        this.b.b((d * this.g) + (-this.h));
        float e = e(f);
        this.a.b((e * this.g) + (-this.h));
        this.m.position().x = ((this.j / 2.0f) - this.i) + (this.i * 2.0f * f);
        this.c.a(this.a, this.b);
    }

    private float d(float f) {
        float f2 = (f / 1.0f) - 1.0f;
        return 0.0f + (((f2 * f2 * f2) + 1.0f) * 1.0f);
    }

    private float e(float f) {
        float f2 = f / 1.0f;
        return 0.0f + (f2 * 1.0f * f2 * f2);
    }
}
