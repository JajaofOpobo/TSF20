package com.tsf.shell.workspace3D.k.c.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class i extends RenderRunnable {
    final /* synthetic */ a a;
    private final /* synthetic */ Bitmap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(a aVar, Bitmap bitmap) {
        super(2, 1);
        this.a = aVar;
        this.b = bitmap;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
