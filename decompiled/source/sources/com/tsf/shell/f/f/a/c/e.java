package com.tsf.shell.f.f.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class e extends com.censivn.C3DEngine.b.f.k {
    private int a;
    private String d;
    private TextureElement e;
    private int f;
    private int g;
    private int h;

    public e(int i, int i2, String str) {
        super(0.0f, 0.0f);
        this.e = new TextureElement(0, false);
        this.f = 80;
        this.g = 20;
        this.h = 0;
        this.a = i;
        this.d = str;
        this.h = i2;
        e();
    }

    private void e() {
        this.f = (int) (this.f * com.censivn.C3DEngine.b.b.a.c);
        this.g = (int) (this.g * com.censivn.C3DEngine.b.b.a.c);
        com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.h);
        textures().addElement(this.e);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.f.a.c.e.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                e.this.a();
            }
        });
    }

    public void a() {
    }

    public void d() {
        if (this.e.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.e);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.e.id == 0) {
            com.tsf.shell.manager.o.a.a aVar = new com.tsf.shell.manager.o.a.a();
            aVar.h(36);
            aVar.i(-1);
            Bitmap b = aVar.b(this.d);
            Bitmap a = this.h == 0 ? x.a(this.a) : x.a(this.a, com.censivn.C3DEngine.b.b.a.a(this.h), com.censivn.C3DEngine.b.b.a.a(this.h));
            Bitmap createBitmap = Bitmap.createBitmap(b.getWidth() + a.getWidth() + this.g, this.f, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(a, 0.0f, (this.f - a.getHeight()) / 2, (Paint) null);
            canvas.drawBitmap(b, a.getWidth() + this.g, (this.f - b.getHeight()) / 2, (Paint) null);
            a.recycle();
            b.recycle();
            com.censivn.C3DEngine.a.g().a(this.e, createBitmap);
            createBitmap.recycle();
            a(this.e.width);
            b(this.e.height);
            calAABB(1.2f, 1.2f, 1.0f);
        }
    }
}
