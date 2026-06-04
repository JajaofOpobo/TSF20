package com.tsf.shell.workspace3D.k;

import android.view.KeyEvent;
import com.tsf.shell.aq;
import com.tsf.shell.at;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o implements at {
    private static o e;
    private static o f;
    private int a;
    protected com.censivn.C3DEngine.b.v d;
    protected boolean c = false;
    protected ArrayList b = new ArrayList();

    public static void a(o oVar, int i) {
        switch (i) {
            case 0:
                e = oVar;
                break;
            case 1:
                f = oVar;
                break;
        }
    }

    public static void a(o oVar) {
        if (oVar.a == 1) {
            e.a();
            return;
        }
        if (oVar.a == 2) {
            e.b();
        } else if (oVar.a == 0) {
            if (f.a == 1) {
                f.a();
            } else {
                f.b();
            }
        }
    }

    public static void b(o oVar) {
        if (oVar.a == 1) {
            e.b();
        } else if (oVar.a == 0) {
            f.b();
        }
    }

    public o(com.censivn.C3DEngine.b.v vVar, int i) {
        this.d = vVar;
        this.a = i;
    }

    public final void c() {
        this.b.clear();
    }

    public final void a(com.censivn.C3DEngine.b.r rVar) {
        if (rVar instanceof z) {
            z zVar = (z) rVar;
            if (this.c) {
                zVar.bx();
            }
        }
    }

    public final boolean d() {
        return this.c;
    }

    public void a() {
        if (com.tsf.shell.workspace3D.z.a() && !this.c) {
            this.c = true;
            a(this);
            aq.a(this);
            Iterator it = this.d.aD().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
                if (rVar instanceof z) {
                    ((z) rVar).bx();
                }
            }
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            b();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    public void b() {
        if (this.c) {
            this.c = false;
            b(this);
            aq.b(this);
            Iterator it = this.d.aD().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
                if (rVar instanceof z) {
                    ((z) rVar).by();
                }
            }
            this.b.clear();
        }
    }

    public final ArrayList e() {
        if (this.a == 1) {
            ArrayList arrayList = e.b;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.b.add((z) it.next());
                }
                arrayList.clear();
            }
        } else if (this.a == 0 && f.a != 2) {
            ArrayList arrayList2 = f.b;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    this.b.add((z) it2.next());
                }
                arrayList2.clear();
            }
        }
        return this.b;
    }

    public void b(j jVar) {
    }

    public void a(j jVar) {
    }

    public void c(j jVar) {
    }
}
