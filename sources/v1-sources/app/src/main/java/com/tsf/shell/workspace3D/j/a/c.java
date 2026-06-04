package com.tsf.shell.workspace3D.j.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.r;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class c extends j {
    final /* synthetic */ a a;
    private final /* synthetic */ com.tsf.shell.workspace3D.h.b.g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(a aVar, r rVar, com.tsf.shell.workspace3D.h.b.g gVar) {
        super(aVar, rVar);
        this.a = aVar;
        this.d = gVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        boolean z;
        com.tsf.shell.g.h.c();
        z = this.a.w;
        if (z) {
            this.a.r = this.d;
        } else {
            bf.j().f().a(this.d);
            this.a.e();
        }
        a.a(this.a, this.d.b());
        this.d.b().h(true);
    }
}
