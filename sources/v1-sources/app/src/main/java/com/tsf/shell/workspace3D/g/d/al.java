package com.tsf.shell.workspace3D.g.d;

import android.graphics.Bitmap;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class al extends r {
    final /* synthetic */ w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(w wVar, Bitmap bitmap) {
        super(R.string.widget_folder, bitmap);
        this.l = wVar;
    }

    @Override // com.tsf.shell.workspace3D.g.d.r, java.lang.Runnable
    public final void run() {
        float f;
        float f2;
        if (bf.j().z() != -1) {
            int z = bf.j().z();
            f = this.l.o;
            f2 = this.l.p;
            com.tsf.shell.workspace3D.k.c.b.c.a(z, (int) f, (int) f2);
        }
    }
}
