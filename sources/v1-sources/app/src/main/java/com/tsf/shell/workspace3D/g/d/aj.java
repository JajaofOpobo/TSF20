package com.tsf.shell.workspace3D.g.d;

import android.graphics.Bitmap;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class aj extends r {
    final /* synthetic */ w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(w wVar, Bitmap bitmap) {
        super(R.string.group_tsf_widgets, bitmap);
        this.l = wVar;
    }

    @Override // com.tsf.shell.workspace3D.g.d.r, java.lang.Runnable
    public final void run() {
        bf.l().e();
    }
}
