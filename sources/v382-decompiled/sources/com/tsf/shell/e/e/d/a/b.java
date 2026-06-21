package com.tsf.shell.e.e.d.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class b extends l {
    c a;
    c b;
    c c;
    private l f;
    private TextureElement e = new TextureElement(0, false);
    private float g = 17.0f;
    public boolean d = false;

    public b() {
        float f = com.censivn.C3DEngine.b.b.a.b;
        scale().setAll(f, f, 1.0f);
        this.f = new l();
        this.a = new c(this);
        this.a.moveAllPointsPX(-2.3f, 0.0f, 0.0f);
        this.a.position().x = 2.3f;
        this.a.textures().addElement(this.e);
        this.f.addChild(this.a);
        this.b = new c(this);
        this.b.textures().addElement(this.e);
        this.b.position().y = this.g;
        this.f.addChild(this.b);
        this.c = new c(this);
        this.c.textures().addElement(this.e);
        this.c.position().y = -this.g;
        this.f.addChild(this.c);
        addChild(this.f);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.e.id == 0) {
            a(-3355444);
        }
    }

    public void a() {
        v vVar = com.censivn.C3DEngine.b.g.a.c;
        x xVar = new x() { // from class: com.tsf.shell.e.e.d.a.b.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                b.this.d = true;
            }
        };
        xVar.a(vVar);
        xVar.l(6.0f);
        xVar.b(50);
        w.a(this.a);
        w.a(this.a, 900, xVar);
        x xVar2 = new x() { // from class: com.tsf.shell.e.e.d.a.b.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar2.a(vVar);
        xVar2.f(10.0f);
        xVar2.e(-45.0f);
        xVar2.l(5.0f);
        xVar2.h(14.0f);
        w.a(this.b);
        w.a(this.b, 900, xVar2);
        x xVar3 = new x() { // from class: com.tsf.shell.e.e.d.a.b.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar3.a(vVar);
        xVar3.f(10.0f);
        xVar3.e(45.0f);
        xVar3.l(5.0f);
        xVar3.h(-14.0f);
        w.a(this.c);
        w.a(this.c, 900, xVar3);
        x xVar4 = new x() { // from class: com.tsf.shell.e.e.d.a.b.4
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar4.a(vVar);
        xVar4.l(0.8f);
        xVar4.m(0.8f);
        xVar4.n(0.8f);
        xVar4.e(-180.0f);
        w.a(this.f);
        w.a(this.f, 900, xVar4);
    }

    public void b() {
        v vVar = com.censivn.C3DEngine.b.g.a.c;
        x xVar = new x() { // from class: com.tsf.shell.e.e.d.a.b.5
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                b.this.d = false;
            }
        };
        xVar.a(vVar);
        xVar.l(1.0f);
        xVar.b(50);
        w.a(this.a);
        w.a(this.a, 900, xVar);
        x xVar2 = new x() { // from class: com.tsf.shell.e.e.d.a.b.6
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar2.a(vVar);
        xVar2.f(0.0f);
        xVar2.e(0.0f);
        xVar2.l(1.0f);
        xVar2.h(this.g);
        w.a(this.b);
        w.a(this.b, 900, xVar2);
        x xVar3 = new x() { // from class: com.tsf.shell.e.e.d.a.b.7
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar3.a(vVar);
        xVar3.f(0.0f);
        xVar3.e(0.0f);
        xVar3.l(1.0f);
        xVar3.h(-this.g);
        w.a(this.c);
        w.a(this.c, 900, xVar3);
        x xVar4 = new x() { // from class: com.tsf.shell.e.e.d.a.b.8
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar4.a(vVar);
        xVar4.l(1.0f);
        xVar4.m(1.0f);
        xVar4.n(1.0f);
        xVar4.e(0.0f);
        w.a(this.f);
        w.a(this.f, 900, xVar4);
    }

    private void a(int i) {
        if (this.e.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.e);
        }
        Bitmap createBitmap = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(i);
        canvas.drawRect(1.0f, 1.0f, 63.0f, 63.0f, paint);
        com.censivn.C3DEngine.a.g().a(this.e, createBitmap);
        createBitmap.recycle();
    }
}
