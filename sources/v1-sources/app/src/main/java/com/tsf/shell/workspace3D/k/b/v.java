package com.tsf.shell.workspace3D.k.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class v implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ com.tsf.shell.c.a.b b;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.al c;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.s d;

    v(k kVar, com.tsf.shell.c.a.b bVar, com.tsf.shell.workspace3D.k.al alVar, com.tsf.shell.workspace3D.k.s sVar) {
        this.a = kVar;
        this.b = bVar;
        this.c = alVar;
        this.d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap a = z.a(this.b.e, this.b.a(com.censivn.C3DEngine.a.c()));
        Canvas canvas = new Canvas(a);
        Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.push_download_icon);
        float f = ap.E / 144.0f;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a2, (int) (a2.getWidth() * f), (int) (a2.getHeight() * f), true);
        if (createScaledBitmap != a2) {
            a2.recycle();
        }
        canvas.drawBitmap(createScaledBitmap, 123.0f * f, f * 8.0f, (Paint) null);
        createScaledBitmap.recycle();
        TextureElement a3 = com.censivn.C3DEngine.a.f().a(a, true);
        this.c.O.z().c(a3);
        this.d.e = a3;
    }
}
