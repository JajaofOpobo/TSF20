package com.tsf.shell.manager.o.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.manager.o.a.c;
import com.tsf.shell.utils.q;
/* loaded from: classes.dex */
public class b {
    public static int a;
    public static final int d = (int) com.censivn.C3DEngine.b.b.a.a(50.0f);
    public int b;
    public int c;
    private com.tsf.shell.manager.o.a e;
    private k f = new k(0.0f, 0.0f, false);
    private TextureElement g = new TextureElement(0, false);
    private c.a h;

    public b(int i, c.a aVar) {
        this.b = i;
        this.h = aVar;
        this.f.textures().addElement(this.g);
    }

    public k a() {
        return this.f;
    }

    public TextureElement b() {
        return this.g;
    }

    public void a(com.tsf.shell.manager.o.a aVar) {
        if (this.e != aVar) {
            this.e = aVar;
            this.f.a(aVar.J, aVar.K + d);
            Bitmap createBitmap = Bitmap.createBitmap(aVar.J, aVar.K + d, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Bitmap a2 = a("Launcher", aVar);
            if (a2 != null) {
                canvas.drawBitmap(a2, 0.0f, 0.0f, (Paint) null);
                a2.recycle();
            }
            float f = d / 3.0f;
            Bitmap a3 = q.a(f / 2.0f, -1);
            canvas.drawBitmap(a3, (createBitmap.getWidth() - a3.getWidth()) / 2, aVar.K + ((d - f) / 2.0f), (Paint) null);
            a3.recycle();
            com.censivn.C3DEngine.a.g().a(this.g, createBitmap);
            createBitmap.recycle();
            this.f.calAABB(1.2f, 1.0f, 1.0f);
            this.f.notifLayoutRefresh();
        }
    }

    public void c() {
        this.e = null;
        if (this.g.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.g);
        }
    }

    public Bitmap a(String str, com.tsf.shell.manager.o.a aVar) {
        return c.a(str, this.h.g, aVar, this.h);
    }
}
