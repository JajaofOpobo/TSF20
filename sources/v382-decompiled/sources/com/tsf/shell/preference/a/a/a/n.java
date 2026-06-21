package com.tsf.shell.preference.a.a.a;

import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class n extends com.censivn.C3DEngine.b.e.m {
    private boolean a = false;

    public n() {
        a(R.string.mn_version_detail);
        l lVar = new l();
        lVar.a("TSF Launcher V3.8 (2015.8.26)");
        b(lVar);
        k kVar = new k(a(1, R.string.feature_version_improvement_fix), com.censivn.C3DEngine.b.b.a.a(0.0f));
        kVar.a(a(1, R.string.feature_version_371_feature));
        a((com.censivn.C3DEngine.b.f.j) kVar);
        kVar.a(a(2, R.string.feature_version_371_fix_1));
        a((com.censivn.C3DEngine.b.f.j) kVar);
        b(kVar);
        l lVar2 = new l();
        lVar2.a("TSF Launcher V3.7 (2015.7.13)");
        b(lVar2);
        k kVar2 = new k(a(1, R.string.feature_version_features), com.censivn.C3DEngine.b.b.a.a(0.0f));
        kVar2.a(a(1, R.string.feature_version37_1));
        a((com.censivn.C3DEngine.b.f.j) kVar2);
        kVar2.a(a(2, R.string.feature_version37_2));
        a((com.censivn.C3DEngine.b.f.j) kVar2);
        kVar2.a(a(3, R.string.feature_version37_3));
        a((com.censivn.C3DEngine.b.f.j) kVar2);
        kVar2.a(a(4, R.string.feature_version37_4));
        a((com.censivn.C3DEngine.b.f.j) kVar2);
        b(kVar2);
        com.censivn.C3DEngine.b.e.i hVar = new h(a(2, R.string.feature_version_themes), R.drawable.feature_theme_v37, com.censivn.C3DEngine.b.b.a.a(780.0f));
        a((com.censivn.C3DEngine.b.f.j) hVar);
        b(hVar);
        k kVar3 = new k(a(3, R.string.feature_version_improvement_fix), com.censivn.C3DEngine.b.b.a.a(0.0f));
        kVar3.a(a(1, R.string.feature_version_37_fix_1));
        a((com.censivn.C3DEngine.b.f.j) kVar3);
        kVar3.a(a(2, R.string.feature_version_37_fix_2));
        a((com.censivn.C3DEngine.b.f.j) kVar3);
        kVar3.a(a(3, R.string.feature_version_37_fix_3));
        a((com.censivn.C3DEngine.b.f.j) kVar3);
        kVar3.a(a(4, R.string.feature_version_37_fix_4));
        a((com.censivn.C3DEngine.b.f.j) kVar3);
        b(kVar3);
        l lVar3 = new l();
        lVar3.a("TSF Launcher V3.6.2 (2015.5.31)");
        b(lVar3);
        com.censivn.C3DEngine.b.e.i mVar = new m(a(1, R.string.feature_version36_1));
        a((com.censivn.C3DEngine.b.f.j) mVar);
        b(mVar);
        l lVar4 = new l();
        lVar4.a("TSF Launcher V3.5.2 (2015.5.15)");
        b(lVar4);
        com.censivn.C3DEngine.b.e.i iVar = new com.tsf.shell.preference.a.a.d() { // from class: com.tsf.shell.preference.a.a.a.n.1
            private double e = 0.026179938779914945d;
            private double f = 0.0d;

            @Override // com.censivn.C3DEngine.b.e.k, com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                super.onDrawStart();
                int sin = (int) (Math.sin(this.f) * 40.0d);
                this.f += this.e;
                k(sin + 50);
            }
        };
        com.censivn.C3DEngine.b.e.i jVar = new j(a(1, R.string.feature_version_352_1), 0.0f);
        a((com.censivn.C3DEngine.b.f.j) jVar);
        b(jVar);
        a((com.censivn.C3DEngine.b.f.j) iVar);
        b(iVar);
        l lVar5 = new l();
        lVar5.a("TSF Launcher V3.5.1 (2015.5.10)");
        b(lVar5);
        com.censivn.C3DEngine.b.e.i iVar2 = new i(a(1, R.string.feature_version35_1));
        a((com.censivn.C3DEngine.b.f.j) iVar2);
        b(iVar2);
        l lVar6 = new l();
        lVar6.a("TSF Launcher V3.4 (2015.4.10)");
        b(lVar6);
        com.censivn.C3DEngine.b.e.i gVar = new g(a(1, R.string.feature_version34_1));
        a((com.censivn.C3DEngine.b.f.j) gVar);
        b(gVar);
        l lVar7 = new l();
        lVar7.a("TSF Launcher V3.3 (2015.3.13)");
        b(lVar7);
        com.censivn.C3DEngine.b.e.i cVar = new c(a(1, R.string.feature_version33_1));
        a((com.censivn.C3DEngine.b.f.j) cVar);
        b(cVar);
        com.censivn.C3DEngine.b.e.i aVar = new a(a(2, R.string.feature_version33_2));
        a((com.censivn.C3DEngine.b.f.j) aVar);
        b(aVar);
        com.censivn.C3DEngine.b.e.i fVar = new f(a(3, R.string.feature_version33_3));
        a((com.censivn.C3DEngine.b.f.j) fVar);
        b(fVar);
    }

    private void a(com.censivn.C3DEngine.b.f.j jVar) {
        jVar.getLayoutParams().l = true;
    }

    private String a(int i, int i2) {
        return String.valueOf(i) + "." + x.c(i2);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        if (this.a) {
            com.tsf.shell.manager.p.c.b.a();
            this.a = false;
        }
    }
}
