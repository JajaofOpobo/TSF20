package com.tsf.shell.workspace3D.g.d;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
final class ac extends com.tsf.shell.action.e {
    final /* synthetic */ ab a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ab abVar, Context context, com.tsf.shell.h hVar) {
        super(context, hVar, true);
        this.a = abVar;
    }

    @Override // com.tsf.shell.action.e
    public final void a(com.tsf.shell.action.f fVar) {
        super.a(fVar);
        if (fVar.c != null) {
            Bitmap bitmap = fVar.c;
            fVar.c = Bitmap.createScaledBitmap(bitmap, 60, 60, true);
            bitmap.recycle();
        }
        com.censivn.C3DEngine.a.a().c(new ad(this, fVar));
    }
}
