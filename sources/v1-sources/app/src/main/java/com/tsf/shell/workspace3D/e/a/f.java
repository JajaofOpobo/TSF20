package com.tsf.shell.workspace3D.e.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.b.r;

/* loaded from: classes.dex */
final class f extends l {
    final /* synthetic */ a a;
    private final /* synthetic */ com.censivn.C3DEngine.e.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(a aVar, r rVar, com.censivn.C3DEngine.e.b bVar) {
        super(rVar);
        this.a = aVar;
        this.c = bVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        if (this.c.s() == null) {
            return;
        }
        this.a.a((g) this.c.s(), 1);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        if (this.c.s() == null) {
            return;
        }
        this.a.a((g) this.c.s(), 0);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        h hVar;
        if (this.c.s() != null) {
            g gVar = (g) this.c.s();
            this.a.c();
            try {
                hVar = this.a.j;
                hVar.a(gVar.b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
