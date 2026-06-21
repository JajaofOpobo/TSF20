package com.tsf.shell.e.i.c.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;

/* loaded from: classes.dex */
class i extends p {
    final /* synthetic */ h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, n nVar, int i, VObject3d... vObject3dArr) {
        super(hVar, nVar, i, vObject3dArr);
        this.c = hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.e.i.c.a.p
    public Bitmap a(Void... voidArr) {
        return r.b(r.a(this.c.i, this.d));
    }
}
