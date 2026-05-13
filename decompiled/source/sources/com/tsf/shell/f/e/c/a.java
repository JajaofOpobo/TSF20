package com.tsf.shell.f.e.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
/* loaded from: classes.dex */
public class a extends j {
    public i a;
    public i b;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    private b i;
    private TextureElement j = new TextureElement(0, false);
    private TextureElement k = new TextureElement(0, false);
    private final int l = VEasing.Back.easeIn;
    public a c = this;

    public a(float f, int i, int i2, Bitmap bitmap, int i3, float f2) {
        this.d = 1.0f;
        this.e = 100.0f;
        this.f = this.e / 2.0f;
        this.g = 180;
        this.h = 1000;
        this.d = f2;
        this.e = f * f2;
        this.f = this.e / 2.0f;
        this.g = i2;
        this.c.alpha(this.g);
        Bitmap c = c(i);
        com.censivn.C3DEngine.a.g().a(this.k, c);
        c.recycle();
        com.censivn.C3DEngine.a.g().a(this.j, bitmap);
        bitmap.recycle();
        this.h = i3;
        i();
    }

    public TextureElement a() {
        return this.k;
    }

    public TextureElement b() {
        return this.j;
    }

    public void a(int i) {
        this.g = i;
        d dVar = new d();
        dVar.a(this.g);
        c.a(this.c);
        c.a(this.c, VEasing.Back.easeIn, dVar);
        this.i.alpha(255.0f);
    }

    public void b(int i) {
        Bitmap c = c(i);
        com.censivn.C3DEngine.a.g().a(this.k, c);
        c.recycle();
    }

    private void i() {
        this.i = new b(this) { // from class: com.tsf.shell.f.e.c.a.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
                a.this.onKillFocus();
            }
        };
        this.i.textures().addElement(this.k);
        this.i.setAABBSP(-this.f, -this.f, 0.0f, this.f, this.f, 0.0f);
        addChild(this.i);
        setAABBSP(-this.f, -this.f, 0.0f, this.f, this.f, 0.0f);
        this.a = j();
        addChild(this.a);
    }

    public void a(j jVar) {
        this.b = jVar;
        this.b.scale().setAll(0.0f, 0.0f, 0.0f);
        this.b.visible(false);
        addChild(this.b);
    }

    public j c() {
        return this.i;
    }

    public void a(float f, float f2, float f3, float f4, int i, boolean z) {
        c.a(this.c);
        d dVar = new d();
        dVar.a(255);
        c.a(this.c);
        c.a(this.c, 250, dVar);
        this.i.alpha(i);
        if (z) {
            this.i.a(f, f2, f3, f4);
        } else {
            this.i.b(f, f2, f3, f4);
        }
    }

    public void a(float f, float f2, Runnable runnable, boolean z) {
        if (z) {
            this.i.a(f, f2, this.f, runnable);
        } else {
            this.i.b(f, f2, this.f, runnable);
        }
    }

    public void d() {
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onKillFocus() {
    }

    public static Bitmap c(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(ItemInfo.APP_VERSION_CODE, ItemInfo.APP_VERSION_CODE, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(128.0f, 128.0f, 125.0f, paint);
        return createBitmap;
    }

    private i j() {
        k kVar = new k(this.j.width * this.d, this.j.height * this.d, false);
        kVar.textures().addElement(this.j);
        return kVar;
    }

    private void k() {
        this.a.visible(true);
        d dVar = new d();
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.n(1.0f);
        c.a(this.a);
        c.a(this.a, VEasing.Back.easeIn, dVar);
    }

    private void l() {
        d dVar = new d() { // from class: com.tsf.shell.f.e.c.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.a.visible(false);
            }
        };
        dVar.l(0.0f);
        dVar.m(0.0f);
        dVar.n(0.0f);
        c.a(this.a);
        c.a(this.a, VEasing.Back.easeIn, dVar);
    }

    private void m() {
        d dVar = new d();
        dVar.a(this.g);
        dVar.b(this.h);
        c.a(this.c);
        c.a(this.c, VEasing.Back.easeIn, dVar);
    }

    public void a(boolean z) {
        if (z) {
            m();
        } else {
            f();
        }
        k();
    }

    public void e() {
        f();
    }

    public void f() {
        this.c.alpha(this.g);
    }

    public void g() {
        l();
    }

    public void h() {
        this.a.visible(false);
    }
}
