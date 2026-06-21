package com.tsf.shell.e.e.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class a extends l {
    public j a;
    public j b;
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
        x xVar = new x();
        xVar.a(this.g);
        w.a(this.c);
        w.a(this.c, VEasing.Back.easeIn, xVar);
        this.i.alpha(255.0f);
    }

    public void b(int i) {
        Bitmap c = c(i);
        com.censivn.C3DEngine.a.g().a(this.k, c);
        c.recycle();
    }

    private void i() {
        this.i = new b(this) { // from class: com.tsf.shell.e.e.c.a.1
            @Override // com.censivn.C3DEngine.b.f.j
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

    public void a(l lVar) {
        this.b = lVar;
        this.b.scale().setAll(0.0f, 0.0f, 0.0f);
        this.b.visible(false);
        addChild(this.b);
    }

    public l c() {
        return this.i;
    }

    public void a(float f, float f2, float f3, float f4, int i, boolean z) {
        w.a(this.c);
        x xVar = new x();
        xVar.a(255);
        w.a(this.c);
        w.a(this.c, 250, xVar);
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

    @Override // com.censivn.C3DEngine.b.f.j
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

    private j j() {
        m mVar = new m(this.j.width * this.d, this.j.height * this.d, false);
        mVar.textures().addElement(this.j);
        return mVar;
    }

    private void k() {
        this.a.visible(true);
        x xVar = new x();
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.n(1.0f);
        w.a(this.a);
        w.a(this.a, VEasing.Back.easeIn, xVar);
    }

    private void l() {
        x xVar = new x() { // from class: com.tsf.shell.e.e.c.a.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.a.visible(false);
            }
        };
        xVar.l(0.0f);
        xVar.m(0.0f);
        xVar.n(0.0f);
        w.a(this.a);
        w.a(this.a, VEasing.Back.easeIn, xVar);
    }

    private void m() {
        x xVar = new x();
        xVar.a(this.g);
        xVar.b(this.h);
        w.a(this.c);
        w.a(this.c, VEasing.Back.easeIn, xVar);
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
