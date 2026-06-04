package com.tsf.shell.workspace3D;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class av extends j {
    private au h;
    private com.tsf.shell.workspace3D.g.b.l i;
    private com.tsf.shell.workspace3D.g.b.k j;
    private com.tsf.shell.workspace3D.k.j k;
    private com.tsf.shell.workspace3D.k.j l;
    private com.censivn.C3DEngine.e.b m;
    private TextureElement n;
    private ArrayList o;
    private com.tsf.shell.workspace3D.k.o p;

    public av(com.censivn.C3DEngine.b.v vVar, com.censivn.C3DEngine.b.v vVar2) {
        super(vVar, vVar2, 202);
        this.o = new ArrayList();
        this.k = new com.tsf.shell.workspace3D.k.j();
        aw awVar = new aw(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(7);
        arrayList.add(6);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(4);
        awVar.a(arrayList, arrayList2);
        this.j = new ax(this, awVar);
        this.i = new com.tsf.shell.workspace3D.g.b.l(this.j);
        this.i.a((int) (140.0f * com.censivn.C3DEngine.a.a), (int) (d * com.censivn.C3DEngine.a.a), (int) (d * com.censivn.C3DEngine.a.a));
        this.j.a(c, com.censivn.C3DEngine.a.m);
        a(this.i);
        this.p = new az(this, this.j.b());
        this.h = new au(this);
        this.h.b((-128.0f) * com.censivn.C3DEngine.a.a, com.censivn.C3DEngine.a.h, 0.0f, com.censivn.C3DEngine.a.a * 128.0f, com.censivn.C3DEngine.a.g);
        this.g.d(this.h);
        this.m = new com.censivn.C3DEngine.e.b(128.0f, 128.0f, 1, 1, true);
        this.m.L().x = this.j.L().x;
        this.m.L().y = com.censivn.C3DEngine.a.g - (this.m.o_() / 2.0f);
        bc bcVar = new bc(this, this.m);
        this.m.ar();
        this.m.a((com.censivn.C3DEngine.b.l) bcVar);
        o();
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a(int i, int i2, int i3, int i4) {
        super.a(i, i2, i3, i4);
        this.m.L().y = com.censivn.C3DEngine.a.g - (this.m.o_() / 2.0f);
    }

    public final void b(com.tsf.shell.workspace3D.k.j jVar) {
        this.o.add(jVar);
    }

    public final void a(String str) {
        com.censivn.C3DEngine.a.a().c(new ba(this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.j.j_() == 0) {
            o();
        }
    }

    static /* synthetic */ com.tsf.shell.workspace3D.k.j a(av avVar, String str) {
        Iterator it = avVar.o.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            if (Integer.toString(jVar.be().appWidgetId).equals(str)) {
                return jVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        String str = "";
        Iterator it = this.j.b().aD().iterator();
        while (true) {
            String str2 = str;
            if (it.hasNext()) {
                str = String.valueOf(str2) + ((LauncherShortcut3DInfo) ((com.tsf.shell.workspace3D.k.j) ((com.censivn.C3DEngine.b.r) it.next())).be()).appWidgetId + ",";
            } else {
                com.censivn.C3DEngine.a.a().d(new bb(this, str2));
                return;
            }
        }
    }

    public final com.tsf.shell.workspace3D.g.b.k j() {
        return this.j;
    }

    private void o() {
        if (this.n != null) {
            com.censivn.C3DEngine.a.f().a(this.n);
        }
        Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.menu_custom_add_default);
        this.n = com.censivn.C3DEngine.a.f().a(a, true);
        a.recycle();
        this.m.z().c(this.n);
        this.g.d(this.m);
        this.m.N().setAll(0.0f, 0.0f, 1.0f);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.j(1.0f);
        uVar.k(1.0f);
        com.censivn.C3DEngine.g.s.a(this.m);
        com.censivn.C3DEngine.g.s.a(this.m, 250, uVar);
        this.m.e(true);
    }

    private void p() {
        this.m.Q();
        this.g.a(this.m, 1);
        this.m.e(false);
        bd bdVar = new bd(this);
        bdVar.j(0.0f);
        bdVar.k(0.0f);
        com.censivn.C3DEngine.g.s.a(this.m);
        com.censivn.C3DEngine.g.s.a(this.m, 250, bdVar);
    }

    public final void k() {
        ArrayList a = com.tsf.shell.g.b.a(com.tsf.shell.g.b.o.size());
        int size = a.size();
        if (size > 0) {
            a(a, false);
            for (int i = 0; i < size; i++) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) a.get(i);
                jVar.N().setAll(0.0f, 0.0f, 1.0f);
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                uVar.j(1.0f);
                uVar.k(1.0f);
                uVar.b(i * 100);
                uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.e());
                com.censivn.C3DEngine.g.s.a(jVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a(ArrayList arrayList) {
        a(arrayList, true);
    }

    private void a(ArrayList arrayList, boolean z) {
        if (arrayList.size() > 0) {
            p();
        }
        this.i.a(arrayList, z);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            this.p.a((com.censivn.C3DEngine.b.r) jVar);
            ((LauncherShortcut3DInfo) jVar.be()).container = -2;
            jVar.bs();
            ((com.tsf.shell.workspace3D.k.ab) jVar).a(this.p);
        }
        n();
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a(ArrayList arrayList, int i) {
        if (arrayList.size() > 0) {
            p();
        }
        this.i.a(arrayList, i, true);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            this.p.a((com.censivn.C3DEngine.b.r) jVar);
            ((LauncherShortcut3DInfo) jVar.be()).container = -2;
            jVar.bs();
            ((com.tsf.shell.workspace3D.k.ab) jVar).a(this.p);
        }
        n();
    }

    @Override // com.tsf.shell.workspace3D.j
    public final int a(com.tsf.shell.workspace3D.k.j jVar) {
        int a = this.i.a(jVar);
        m();
        return a;
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a() {
        super.a();
        bf.o().b(this.h);
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void b() {
        super.b();
        bf.o().c(this.h);
    }

    public final void d(int i) {
        if (this.l == null) {
            this.l = this.k;
            this.i.a(this.l, true);
        }
        e(i);
    }

    public final void e(int i) {
        if (this.l != null && i < this.j.j_() && i >= 0 && this.l.bd() != i) {
            this.j.b(this.l, i);
        }
    }

    public final int l() {
        if (this.l == null) {
            return 0;
        }
        this.i.a(this.l);
        this.l = null;
        return this.k.bd();
    }
}
