package com.tsf.shell.f.h.a.a.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.manager.c.a.a.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends j {
    private String b;
    private a.b f;
    private TextureElement a = new TextureElement(0, false);
    private boolean c = false;
    private com.censivn.C3DEngine.b.f.a.a d = new com.censivn.C3DEngine.b.f.a.a(2, 1, 1, true);
    private m e = new m();

    public d() {
        this.e.d(54);
        this.d.textures().addElement(this.a);
        addChild(this.d);
        addChild(this.e);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.h.a.a.a.d.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (d.this.f != null) {
                    d.this.f.f();
                }
            }
        });
        f();
    }

    public void a(a.b bVar) {
        bVar.a(this);
        this.f = bVar;
        this.b = bVar.c();
        this.e.a(bVar.d());
        this.e.b();
        float fMaxX = this.e.maxX() - this.e.minY();
        float fA = com.censivn.C3DEngine.b.b.a.a(720.0f);
        if (fMaxX >= fA) {
            fA = fMaxX;
        }
        setAABBPX(fA, com.censivn.C3DEngine.b.b.a.a(130.0f));
        this.d.alpha(0.0f);
        this.e.alpha(0.0f);
        h();
        i();
    }

    private void h() {
        this.d.position().y = a();
        this.e.position().y = b();
    }

    public float a() {
        return com.censivn.C3DEngine.b.b.a.a(30.0f);
    }

    public float b() {
        return com.censivn.C3DEngine.b.b.a.a(-30.0f);
    }

    public i c() {
        return this.d;
    }

    public i d() {
        return this.e;
    }

    public void e() {
        this.c = true;
        this.d.a(0).H.set(255, 255, 255, 255);
    }

    public void f() {
        this.c = false;
        this.d.a(0).H.set(60, 255, 255, 255);
    }

    private void i() {
        int iA = (int) com.censivn.C3DEngine.b.b.a.a(50.0f);
        if (this.a.id == 0) {
            com.tsf.shell.manager.o.a.a aVar = new com.tsf.shell.manager.o.a.a();
            aVar.h(36);
            aVar.i(-1);
            aVar.f(VEasing.Linear.easeNone);
            aVar.c(iA);
            aVar.d(iA);
            Bitmap bitmapB = aVar.b(this.b);
            Canvas canvas = new Canvas(bitmapB);
            float fA = com.censivn.C3DEngine.b.b.a.a(25.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-1);
            canvas.drawCircle(iA / 2.0f, bitmapB.getHeight() / 2.0f, fA / 2.0f, paint);
            com.censivn.C3DEngine.a.g().a(this.a, bitmapB);
            bitmapB.recycle();
        }
        this.d.a(1, this.a.width, this.a.height);
        com.censivn.C3DEngine.b.f.a.b bVarA = this.d.a(0);
        com.censivn.C3DEngine.b.f.a.b bVarA2 = this.d.a(1);
        bVarA.i().x = ((-this.a.width) / 2.0f) + (iA / 2.0f);
        bVarA.b(0, 0, iA, this.a.height);
        bVarA.h();
        bVarA2.b(iA, 0, this.a.width - iA, this.a.height);
        bVarA2.i().x = (this.a.width / 2.0f) - ((this.a.width - iA) / 2.0f);
        bVarA2.h();
        if (this.c) {
            e();
        } else {
            f();
        }
    }

    public void g() {
        if (this.a.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.a);
        }
        this.e.a();
        this.f.a();
        this.f = null;
        f();
    }
}
