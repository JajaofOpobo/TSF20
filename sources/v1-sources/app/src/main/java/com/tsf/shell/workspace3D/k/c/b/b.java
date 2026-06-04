package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        c cVar;
        float f;
        float f2;
        int i;
        c cVar2;
        int i2;
        c cVar3;
        c cVar4;
        c cVar5;
        c cVar6;
        c cVar7;
        c cVar8;
        c cVar9;
        c cVar10;
        c cVar11;
        c cVar12;
        c cVar13;
        c cVar14;
        c cVar15;
        this.a.n = false;
        z = this.a.d;
        if (!z) {
            cVar = this.a.a;
            f = this.a.l;
            f2 = this.a.m;
            int a = cVar.a(f, f2);
            if (a == -2) {
                this.a.d = true;
                cVar14 = this.a.a;
                cVar14.j().j(false);
                cVar15 = this.a.a;
                cVar15.b((com.tsf.shell.workspace3D.k.ab) this.a.b);
                return;
            }
            i = this.a.k;
            if (i != a) {
                switch (a) {
                    case -4:
                        cVar3 = this.a.a;
                        cVar3.j();
                        ai.h(false);
                        cVar4 = this.a.a;
                        cVar4.j();
                        ai.i(true);
                        return;
                    case LauncherShortcut3DInfo.CONTAINER_FOLDER /* -3 */:
                        cVar5 = this.a.a;
                        cVar5.j();
                        ai.h(true);
                        cVar6 = this.a.a;
                        cVar6.j();
                        ai.i(false);
                        return;
                    case LauncherShortcut3DInfo.CONTAINER_QUICKLAUNCH /* -2 */:
                    default:
                        cVar10 = this.a.a;
                        cVar10.j();
                        ai.h(false);
                        cVar11 = this.a.a;
                        cVar11.j();
                        ai.i(false);
                        cVar12 = this.a.a;
                        cVar12.j();
                        ai.j();
                        cVar13 = this.a.a;
                        cVar13.j().n();
                        break;
                    case -1:
                        cVar7 = this.a.a;
                        cVar7.j();
                        ai.h(false);
                        cVar8 = this.a.a;
                        cVar8.j();
                        ai.i(false);
                        cVar9 = this.a.a;
                        cVar9.j();
                        ai.j();
                        return;
                }
            }
            cVar2 = this.a.a;
            ai j = cVar2.j();
            com.censivn.C3DEngine.b.r rVar = this.a.b;
            i2 = this.a.k;
            if (j.a(i2, a)) {
                this.a.k = a;
            }
        }
    }
}
