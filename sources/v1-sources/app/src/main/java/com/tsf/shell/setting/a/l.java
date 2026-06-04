package com.tsf.shell.setting.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class l extends b {
    final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(g gVar, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.a = gVar;
    }

    @Override // com.tsf.shell.setting.a.b
    public final void m() {
        this.a.h();
    }

    @Override // com.tsf.shell.setting.a.b
    public final com.censivn.C3DEngine.b.r e(int i) {
        ArrayList arrayList;
        arrayList = this.a.t;
        ((Integer) arrayList.get(i)).intValue();
        Bitmap createBitmap = Bitmap.createBitmap(ap.A, ap.B, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.tsf_ico);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, ap.E, ap.E, true);
        if (createScaledBitmap != a) {
            a.recycle();
        }
        canvas.drawBitmap(createScaledBitmap, (ap.A - createScaledBitmap.getWidth()) / 2, (ap.E - createScaledBitmap.getHeight()) / 2, (Paint) null);
        createScaledBitmap.recycle();
        g.e();
        TextureElement a2 = com.censivn.C3DEngine.a.f().a(createBitmap, true);
        createBitmap.recycle();
        com.censivn.C3DEngine.e.a.a c = ap.c();
        c.c((Boolean) false);
        c.z().c(a2);
        c.a(-32.0f, -32.0f, 0.0f, 32.0f, 32.0f);
        return c;
    }
}
