package com.tsf.shell.workspace3D.k.b;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.shell.R;
import com.tsf.shell.bd;
import com.tsf.shell.bj;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements com.tsf.shell.at, bj, com.tsf.shell.workspace3D.g.af, com.tsf.shell.workspace3D.g.o {
    private boolean e;
    private ArrayList f;
    private boolean g = false;
    private boolean h = false;
    private String d = com.censivn.C3DEngine.a.c().getString(R.string.line_picker_back_to_select);
    private String c = com.censivn.C3DEngine.a.c().getString(R.string.notic_function_unavailable);
    private com.censivn.C3DEngine.b.v a = new f(this);
    private com.tsf.shell.workspace3D.g.i b = new com.tsf.shell.workspace3D.g.i();

    public e() {
        this.b.a(this.a);
        this.b.a(this);
        this.b.a();
        this.a.a((com.censivn.C3DEngine.b.l) new g(this, this.a));
    }

    public final boolean f() {
        return this.e;
    }

    public final void g() {
        if (!this.e) {
            this.e = true;
            this.a.L().x = 0.0f;
            this.a.L().y = 0.0f;
            this.a.Q();
            com.tsf.shell.aq.a(this);
            bf.m().a(this.a);
            this.a.az();
            this.a.b(com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.h, 0.0f, com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.g);
            bd.a(this);
            d();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            h();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    public final void h() {
        if (this.e) {
            this.e = false;
            com.tsf.shell.aq.b(this);
            bf.m();
            this.a.Q();
            bd.b(this);
            e();
        }
    }

    public void e() {
    }

    public void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.workspace3D.g.o
    public final void a(com.tsf.shell.workspace3D.g.x xVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (xVar instanceof com.tsf.shell.workspace3D.k.ab) {
            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) xVar;
            if (abVar.bA()) {
                abVar.bC();
            }
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) xVar;
            this.g = true;
            jVar.a((short) 255, (short) 255, (short) 120, (short) 0);
            this.f.add(jVar);
            return;
        }
        if (xVar instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
            com.tsf.shell.workspace3D.k.j jVar2 = (com.tsf.shell.workspace3D.k.j) xVar;
            this.g = true;
            jVar2.a((short) 255, (short) 255, (short) 120, (short) 0);
            this.f.add(jVar2);
        }
    }

    @Override // com.tsf.shell.workspace3D.g.o
    public final void a() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.workspace3D.k.j) it.next()).a((short) 255, (short) 255, (short) 255, (short) 255);
        }
        this.f.clear();
    }

    @Override // com.tsf.shell.workspace3D.g.o
    public final com.tsf.shell.workspace3D.g.y c() {
        return new com.tsf.shell.workspace3D.g.y(this.a, this);
    }

    @Override // com.tsf.shell.workspace3D.g.af
    public final void c(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            if (!jVar.G()) {
                arrayList.add(jVar);
            }
        }
        this.f.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((com.tsf.shell.workspace3D.k.j) it2.next()).a((short) 255, (short) 255, (short) 255, (short) 255);
        }
        switch (i) {
            case 0:
                if (arrayList.size() > 1) {
                    com.tsf.shell.workspace3D.g.b.b bVar = new com.tsf.shell.workspace3D.g.b.b(((com.tsf.shell.workspace3D.k.j) arrayList.get(0)).bc(), true, true);
                    bVar.j();
                    bVar.a(arrayList);
                    break;
                } else {
                    com.tsf.shell.au.a(R.string.notic_arrangement_error);
                    break;
                }
            case 1:
                com.tsf.shell.au.a(this.c);
                break;
            case 2:
                com.tsf.shell.au.a(R.string.pop_menu_delete_notic, R.string.public_action_ok, new i(this, (ArrayList) arrayList.clone()), null);
                break;
            case 3:
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    com.tsf.shell.workspace3D.k.j jVar2 = (com.tsf.shell.workspace3D.k.j) it3.next();
                    if (jVar2 instanceof com.tsf.shell.workspace3D.k.ab) {
                        arrayList2.add((com.tsf.shell.workspace3D.k.ab) jVar2);
                    }
                }
                if (arrayList2.size() > 0) {
                    float f = ((com.tsf.shell.workspace3D.k.ab) arrayList2.get(0)).L().x;
                    float f2 = ((com.tsf.shell.workspace3D.k.ab) arrayList2.get(0)).L().y;
                    Iterator it4 = arrayList2.iterator();
                    float f3 = f;
                    while (true) {
                        float f4 = f2;
                        if (it4.hasNext()) {
                            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) it4.next();
                            f3 = (f3 + abVar.L().x) / 2.0f;
                            f2 = (abVar.L().y + f4) / 2.0f;
                        } else {
                            j jVar3 = new j(this, com.tsf.shell.workspace3D.k.c.b.c.a(bf.j().z(), (int) f3, (int) f4), arrayList2);
                            jVar3.autoInvalidate = true;
                            com.censivn.C3DEngine.a.a().a((RenderRunnable) jVar3);
                            break;
                        }
                    }
                }
                break;
            case 4:
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    com.tsf.shell.workspace3D.k.j jVar4 = (com.tsf.shell.workspace3D.k.j) it5.next();
                    if (jVar4 instanceof com.tsf.shell.workspace3D.k.z) {
                        ((com.tsf.shell.workspace3D.k.z) jVar4).bB();
                    }
                }
                break;
        }
        arrayList.clear();
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        this.a.b(com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.h, 0.0f, com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.g);
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
