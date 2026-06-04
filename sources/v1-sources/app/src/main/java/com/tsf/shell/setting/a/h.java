package com.tsf.shell.setting.a;

import android.view.MotionEvent;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
final class h extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(g gVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r0.i() != false) goto L10;
     */
    @Override // com.censivn.C3DEngine.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent) {
        d dVar;
        b bVar;
        d dVar2;
        d dVar3;
        b bVar2;
        d dVar4;
        b bVar3;
        b bVar4;
        dVar = this.a.o;
        if (!dVar.l()) {
            dVar4 = this.a.p;
            if (!dVar4.l()) {
                bVar3 = this.a.u;
                if (!bVar3.i()) {
                    bVar4 = this.a.v;
                }
            }
        }
        bVar = this.a.v;
        int l = bVar.l();
        v.a = l;
        com.tsf.shell.a.t.f(l);
        dVar2 = this.a.o;
        f k = dVar2.k();
        dVar3 = this.a.p;
        f k2 = dVar3.k();
        this.a.f();
        ThemeManager.mix.icon.setIconConfig(k2.a, k2.b, k2.d, k.a, k.b);
        bVar2 = this.a.v;
        if (bVar2.i()) {
            com.tsf.shell.workspace3D.k.c.b.c.g();
        }
        this.a.g();
        this.a.j();
    }
}
