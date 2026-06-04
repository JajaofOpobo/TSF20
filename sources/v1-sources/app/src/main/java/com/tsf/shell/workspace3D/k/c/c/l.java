package com.tsf.shell.workspace3D.k.c.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.r;
import com.tsf.shell.workspace3D.k.s;

/* loaded from: classes.dex */
final class l extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ k a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(k kVar, r rVar) {
        super(rVar);
        this.a = kVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        j jVar;
        s sVar;
        j jVar2;
        s sVar2;
        j jVar3;
        s sVar3;
        jVar = this.a.a;
        sVar = jVar.d;
        if (sVar != null) {
            jVar2 = this.a.a;
            sVar2 = jVar2.d;
            if (sVar2.k != null) {
                jVar3 = this.a.a;
                sVar3 = jVar3.d;
                sVar3.k.a();
            }
        }
    }
}
