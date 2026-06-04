package com.tsf.shell.setting.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.workspace3D.k.b.ap;

/* loaded from: classes.dex */
final class k extends b {
    final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(g gVar, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.a = gVar;
    }

    @Override // com.tsf.shell.setting.a.b
    public final void m() {
    }

    @Override // com.tsf.shell.setting.a.b
    public final com.censivn.C3DEngine.b.r e(int i) {
        int a = v.a(i);
        Bitmap createBitmap = Bitmap.createBitmap(ap.C, (ap.C * ((int) (com.censivn.C3DEngine.a.b * 64.0f))) / ap.J, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap a2 = v.a("TSF SHELL", a);
        if (a2 != null) {
            canvas.drawBitmap(a2, 2.0f, 2.0f, (Paint) null);
            a2.recycle();
        }
        u.a(60, 45, canvas);
        TextureElement a3 = com.censivn.C3DEngine.a.f().a(createBitmap, true);
        createBitmap.recycle();
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(ap.J, (int) (com.censivn.C3DEngine.a.b * 64.0f), (byte) 0);
        bVar.c((Boolean) false);
        bVar.z().c(a3);
        bVar.a(-32.0f, -16.0f, 0.0f, 32.0f, 16.0f);
        return bVar;
    }
}
