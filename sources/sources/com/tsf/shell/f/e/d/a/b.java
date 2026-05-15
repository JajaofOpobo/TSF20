package com.tsf.shell.f.e.d.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends j {
    a a;
    a b;
    a c;
    private j f;
    private TextureElement e = new TextureElement(0, false);
    private float g = 17.0f;
    public boolean d = false;

    public b() {
        float f = com.censivn.C3DEngine.b.b.a.b;
        scale().setAll(f, f, 1.0f);
        this.f = new j();
        this.a = new a();
        this.a.moveAllPointsPX(-2.3f, 0.0f, 0.0f);
        this.a.position().x = 2.3f;
        this.a.textures().addElement(this.e);
        this.f.addChild(this.a);
        this.b = new a();
        this.b.textures().addElement(this.e);
        this.b.position().y = this.g;
        this.f.addChild(this.b);
        this.c = new a();
        this.c.textures().addElement(this.e);
        this.c.position().y = -this.g;
        this.f.addChild(this.c);
        addChild(this.f);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.e.id == 0) {
            a(-3355444);
        }
    }

    public void a() {
        com.censivn.C3DEngine.b.g.b bVar = com.censivn.C3DEngine.b.g.a.c;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.d.a.b.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                b.this.d = true;
            }
        };
        dVar.a(bVar);
        dVar.l(6.0f);
        dVar.b(50);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 900, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.d.a.b.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar2.a(bVar);
        dVar2.f(10.0f);
        dVar2.e(-45.0f);
        dVar2.l(5.0f);
        dVar2.h(14.0f);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 900, dVar2);
        com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.d.a.b.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar3.a(bVar);
        dVar3.f(10.0f);
        dVar3.e(45.0f);
        dVar3.l(5.0f);
        dVar3.h(-14.0f);
        com.censivn.C3DEngine.b.g.c.a(this.c);
        com.censivn.C3DEngine.b.g.c.a(this.c, 900, dVar3);
        com.censivn.C3DEngine.b.g.d dVar4 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.d.a.b.4
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar4.a(bVar);
        dVar4.l(0.8f);
        dVar4.m(0.8f);
        dVar4.n(0.8f);
        dVar4.e(-180.0f);
        com.censivn.C3DEngine.b.g.c.a(this.f);
        com.censivn.C3DEngine.b.g.c.a(this.f, 900, dVar4);
    }

    public void b() {
        com.censivn.C3DEngine.b.g.b bVar = com.censivn.C3DEngine.b.g.a.c;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.d.a.b.5
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                b.this.d = false;
            }
        };
        dVar.a(bVar);
        dVar.l(1.0f);
        dVar.b(50);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 900, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.d.a.b.6
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar2.a(bVar);
        dVar2.f(0.0f);
        dVar2.e(0.0f);
        dVar2.l(1.0f);
        dVar2.h(this.g);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 900, dVar2);
        com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.d.a.b.7
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar3.a(bVar);
        dVar3.f(0.0f);
        dVar3.e(0.0f);
        dVar3.l(1.0f);
        dVar3.h(-this.g);
        com.censivn.C3DEngine.b.g.c.a(this.c);
        com.censivn.C3DEngine.b.g.c.a(this.c, 900, dVar3);
        com.censivn.C3DEngine.b.g.d dVar4 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.d.a.b.8
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar4.a(bVar);
        dVar4.l(1.0f);
        dVar4.m(1.0f);
        dVar4.n(1.0f);
        dVar4.e(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.f);
        com.censivn.C3DEngine.b.g.c.a(this.f, 900, dVar4);
    }

    private void a(int i) {
        if (this.e.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.e);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(i);
        canvas.drawRect(1.0f, 1.0f, 63.0f, 63.0f, paint);
        com.censivn.C3DEngine.a.g().a(this.e, bitmapCreateBitmap);
        bitmapCreateBitmap.recycle();
    }

    class a extends k {
        public a() {
            super(10.0f, 10.0f);
            c(10.0f);
        }

        public void c(float f) {
            points().setPX(0, f / 2.0f, (-f) / 2.0f, 0.0f);
            points().setPX(1, (-f) / 2.0f, (-f) / 2.0f, 0.0f);
            points().setPX(2, f / 2.0f, f / 2.0f, 0.0f);
            points().setPX(3, (-f) / 2.0f, f / 2.0f, 0.0f);
        }
    }
}
