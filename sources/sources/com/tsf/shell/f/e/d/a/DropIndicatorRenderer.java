package com.tsf.shell.f.e.d.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DropIndicatorRenderer extends BaseRenderable {
    a a;
    a b;
    a c;
    private BaseRenderable f;
    private TextureElement e = new TextureElement(0, false);
    private float g = 17.0f;
    public boolean d = false;

    public DropIndicatorRenderer() {
        float f = com.censivn.C3DEngine.b.b.A.b;
        scale().setAll(f, f, 1.0f);
        this.f = new BaseRenderable();
        this.a = new DropIndicatorContainer();
        this.a.moveAllPointsPX(-2.3f, 0.0f, 0.0f);
        this.a.position().x = 2.3f;
        this.a.textures().addElement(this.e);
        this.f.addChild(this.a);
        this.b = new DropIndicatorContainer();
        this.b.textures().addElement(this.e);
        this.b.position().y = this.g;
        this.f.addChild(this.b);
        this.c = new DropIndicatorContainer();
        this.c.textures().addElement(this.e);
        this.c.position().y = -this.g;
        this.f.addChild(this.c);
        addChild(this.f);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (this.e.id == 0) {
            a(-3355444);
        }
    }

    public void a() {
        com.censivn.C3DEngine.b.g.TweenCallback bVar = com.censivn.C3DEngine.b.g.a.AbstractTween;
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.d.a.DropIndicatorRenderer.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                b.this.d = true;
            }
        };
        dVar.a(bVar);
        dVar.l(6.0f);
        dVar.b(50);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 900, dVar);
        com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.d.a.DropIndicatorRenderer.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
            }
        };
        dVar2.a(bVar);
        dVar2.f(10.0f);
        dVar2.e(-45.0f);
        dVar2.l(5.0f);
        dVar2.h(14.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.b);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.b, 900, dVar2);
        com.censivn.C3DEngine.b.g.TweenParams dVar3 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.d.a.DropIndicatorRenderer.3
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
            }
        };
        dVar3.a(bVar);
        dVar3.f(10.0f);
        dVar3.e(45.0f);
        dVar3.l(5.0f);
        dVar3.h(-14.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 900, dVar3);
        com.censivn.C3DEngine.b.g.TweenParams dVar4 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.d.a.DropIndicatorRenderer.4
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
            }
        };
        dVar4.a(bVar);
        dVar4.l(0.8f);
        dVar4.m(0.8f);
        dVar4.n(0.8f);
        dVar4.e(-180.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.f, 900, dVar4);
    }

    public void b() {
        com.censivn.C3DEngine.b.g.TweenCallback bVar = com.censivn.C3DEngine.b.g.a.AbstractTween;
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.d.a.DropIndicatorRenderer.5
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                b.this.d = false;
            }
        };
        dVar.a(bVar);
        dVar.l(1.0f);
        dVar.b(50);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 900, dVar);
        com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.d.a.DropIndicatorRenderer.6
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
            }
        };
        dVar2.a(bVar);
        dVar2.f(0.0f);
        dVar2.e(0.0f);
        dVar2.l(1.0f);
        dVar2.h(this.g);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.b);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.b, 900, dVar2);
        com.censivn.C3DEngine.b.g.TweenParams dVar3 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.d.a.DropIndicatorRenderer.7
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
            }
        };
        dVar3.a(bVar);
        dVar3.f(0.0f);
        dVar3.e(0.0f);
        dVar3.l(1.0f);
        dVar3.h(-this.g);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 900, dVar3);
        com.censivn.C3DEngine.b.g.TweenParams dVar4 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.d.a.DropIndicatorRenderer.8
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
            }
        };
        dVar4.a(bVar);
        dVar4.l(1.0f);
        dVar4.m(1.0f);
        dVar4.n(1.0f);
        dVar4.e(0.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.f, 900, dVar4);
    }

    private void a(int i) {
        if (this.e.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.e);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(i);
        canvas.drawRect(1.0f, 1.0f, 63.0f, 63.0f, paint);
        com.censivn.C3DEngine.C3DEngine.g().a(this.e, bitmapCreateBitmap);
        bitmapCreateBitmap.recycle();
    }

    class a extends GridRenderable {
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
