package com.tsf.shell.f.f.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.manager.o.a.c;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j {
    private static com.tsf.shell.manager.o.a a;

    public static com.censivn.C3DEngine.b.f.a.a a() {
        if (a == null) {
            a = new com.tsf.shell.manager.o.a(1.0f, 1.0f, 120, 120, 250, 42, 20);
            c.a aVar = new c.a();
            aVar.g = 32;
            a.ab = new com.tsf.shell.manager.o.a.b(0, aVar);
        }
        return new com.tsf.shell.f.i.b.e.h(a).k;
    }

    public static void a(TextureElement textureElement, int i, String str) {
        if (textureElement.id == 0) {
            Bitmap bitmapA = i == 0 ? null : x.a(i, a.H, a.I);
            Bitmap bitmapA2 = a.a(str);
            Bitmap bitmapA3 = a.a();
            Canvas canvas = new Canvas(bitmapA3);
            canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
            a.a(canvas, bitmapA, bitmapA2, true);
            com.tsf.shell.f.i.b.e.b.a(bitmapA3);
            com.censivn.C3DEngine.a.g().a(textureElement, bitmapA3);
        }
    }
}
