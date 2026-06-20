package com.tsf.shell.manager.o._a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.manager.o._a.LabelManagerV2;
import com.tsf.shell.utils.BitmapTransformationHelper;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TextLabelElementV2 {
    public static int a;
    public static final int d = (int) com.censivn.C3DEngine.b.b.A.a(50.0f);
    public int b;
    public int c;
    private com.tsf.shell.manager.o.ButtonMetrics e;
    private k f = new k(0.0f, 0.0f, false);
    private TextureElement g = new TextureElement(0, false);
    private c.a h;

    puTextLabelElementV2lic b(int i, c.a aVar) {
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

    public void a(com.tsf.shell.manager.o.ButtonMetrics aVar) {
        if (this.e != aVar) {
            this.e = aVar;
            this.f.a(aVar.J, aVar.K + d);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(aVar.J, aVar.K + d, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Bitmap bitmapA = a("Launcher", aVar);
            if (bitmapA != null) {
                canvas.drawBitmap(bitmapA, 0.0f, 0.0f, (Paint) null);
                bitmapA.recycle();
            }
            float f = aVar.K;
            float f2 = d / 3.0f;
            Bitmap bitmapA2 = q.a(f2 / 2.0f, -1);
            canvas.drawBitmap(bitmapA2, (bitmapCreateBitmap.getWidth() - bitmapA2.getWidth()) / 2, f + ((d - f2) / 2.0f), (Paint) null);
            bitmapA2.recycle();
            com.censivn.C3DEngine.C3DEngine.g().a(this.g, bitmapCreateBitmap);
            bitmapCreateBitmap.recycle();
            this.f.calAABB(1.2f, 1.0f, 1.0f);
            this.f.notifLayoutRefresh();
        }
    }

    public void c() {
        this.e = null;
        if (this.g.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.g);
        }
    }

    public Bitmap a(String str, com.tsf.shell.manager.o.ButtonMetrics aVar) {
        return c.a(str, this.h.g, aVar, this.h);
    }
}
