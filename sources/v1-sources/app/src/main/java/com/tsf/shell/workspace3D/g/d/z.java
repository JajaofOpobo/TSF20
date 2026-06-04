package com.tsf.shell.workspace3D.g.d;

import android.graphics.Bitmap;
import com.tsf.shell.Home;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class z extends r {
    final /* synthetic */ w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(w wVar, Bitmap bitmap) {
        super(R.string.group_tsf, bitmap);
        this.l = wVar;
    }

    @Override // com.tsf.shell.workspace3D.g.d.r, java.lang.Runnable
    public final void run() {
        Home.d();
        Home.k();
    }
}
