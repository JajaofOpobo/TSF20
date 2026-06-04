package com.tsf.shell.workspace3D.g.c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class b extends v {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void a(short s, short s2, short s3, short s4) {
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void l_() {
        this.a.b();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0010 */
    @Override // com.censivn.C3DEngine.b.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int i;
        ArrayList arrayList;
        j jVar;
        boolean z;
        boolean z2;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList = this.a.g;
            j jVar2 = (j) arrayList.get(i2);
            if (this.a.b && jVar2.E != null && jVar2.E.c == -1) {
                jVar2.a = this.a.b;
            }
            if (jVar2.A != jVar2.a) {
                jVar2.A = jVar2.a;
                e eVar = jVar2.E;
                if (eVar != null) {
                    jVar2.F.z().d();
                    if (jVar2.A) {
                        jVar2.F.z().c(eVar.b());
                    } else {
                        jVar2.F.z().c(eVar.a());
                    }
                }
            }
            if (jVar2.ay() == null) {
                jVar = this.a.t;
                if (jVar2 == jVar) {
                    jVar2.F.N().x += (1.1f - jVar2.F.N().x) * 0.15f;
                    jVar2.F.N().y = jVar2.F.N().x;
                    z2 = this.a.u;
                    if (!z2) {
                        a aVar = this.a;
                        if (a.a(jVar2.F.N().x, 1.1f)) {
                            Number3d N = jVar2.N();
                            jVar2.F.N().y = 1.1f;
                            N.x = 1.1f;
                            jVar2.a_(false);
                        }
                    }
                } else {
                    jVar2.F.N().x += (1.0f - jVar2.F.N().x) * 0.15f;
                    jVar2.F.N().y = jVar2.F.N().x;
                    z = this.a.u;
                    if (!z) {
                        a aVar2 = this.a;
                        if (a.a(jVar2.F.N().x, 1.0f)) {
                            Number3d N2 = jVar2.F.N();
                            jVar2.F.N().y = 1.0f;
                            N2.x = 1.0f;
                            jVar2.a_(false);
                        }
                    }
                }
            }
        }
    }
}
