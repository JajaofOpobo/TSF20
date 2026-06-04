package com.tsf.shell.workspace3D.j.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.r;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class d extends j {
    final /* synthetic */ a a;
    private final /* synthetic */ k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(a aVar, r rVar, k kVar) {
        super(aVar, rVar);
        this.a = aVar;
        this.d = kVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        boolean z;
        ArrayList arrayList;
        com.tsf.shell.g.h.c();
        z = this.a.w;
        if (z) {
            this.a.q = this.d.a;
        } else if (com.tsf.shell.workspace3D.h.d.i.a(this.d.a)) {
            this.a.e();
        }
        this.d.h(true);
        arrayList = this.a.e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar != this.d) {
                kVar.h(false);
            }
        }
    }
}
