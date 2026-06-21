package com.tsf.shell.e.f.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class k {
    private static com.tsf.shell.manager.o.a a;

    public static com.censivn.C3DEngine.b.f.a.a a() {
        if (a == null) {
            a = new com.tsf.shell.manager.o.a(1.0f, 1.0f, 120, 120, 250, 42, 20);
            com.tsf.shell.manager.o.a.d dVar = new com.tsf.shell.manager.o.a.d();
            dVar.g = 32;
            a.ab = new com.tsf.shell.manager.o.a.b(0, dVar);
        }
        return new com.tsf.shell.e.i.b.e.j(a).k;
    }

    public static void a(TextureElement textureElement, int i, String str) {
        if (textureElement.id == 0) {
            Bitmap a2 = i == 0 ? null : x.a(i, a.H, a.I);
            Bitmap a3 = a.a(str);
            Bitmap a4 = a.a();
            Canvas canvas = new Canvas(a4);
            canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
            a.a(canvas, a2, a3, true);
            com.tsf.shell.e.i.b.e.b.a(a4);
            com.censivn.C3DEngine.a.g().a(textureElement, a4);
        }
    }
}
