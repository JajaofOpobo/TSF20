package com.tsf.shell.e.i;

import android.view.KeyEvent;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements com.censivn.C3DEngine.b.c.d {
    private com.tsf.shell.manager.n.b a;
    protected b d;
    public Object e;
    protected boolean c = false;
    protected ArrayList b = new ArrayList();

    public a(Object obj, b bVar) {
        this.e = obj;
        this.d = bVar;
    }

    public Object b() {
        return this.e;
    }

    public void c() {
        this.b.clear();
    }

    public void a(j jVar) {
        if (jVar instanceof e) {
            e eVar = (e) jVar;
            if (this.c) {
                eVar.am();
            }
        }
    }

    public boolean d() {
        if (this.c) {
            g();
            return false;
        }
        f();
        return true;
    }

    public boolean e() {
        return this.c;
    }

    public void f() {
        if (com.tsf.shell.manager.a.A.a() && !this.c) {
            this.c = true;
            com.censivn.C3DEngine.b.c.c.a(this);
            Iterator it = this.d.b().iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (jVar instanceof e) {
                    ((e) jVar).am();
                }
            }
            j();
            h();
        }
    }

    private void j() {
        this.a = com.tsf.shell.manager.a.q.a(this.a, String.format(x.c(R.string.text_multi_select_title), Integer.valueOf(this.b.size())));
    }

    private void k() {
        com.tsf.shell.manager.a.q.b(this.a);
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            g();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    public void g() {
        if (this.c) {
            k();
            this.c = false;
            com.censivn.C3DEngine.b.c.c.b(this);
            Iterator it = this.d.b().iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (jVar instanceof e) {
                    ((e) jVar).an();
                }
            }
            a();
            this.b.clear();
        }
    }

    public void h() {
    }

    public void a() {
    }

    public void a(e eVar) {
        this.b.add(eVar);
        j();
    }

    public void b(e eVar) {
        this.b.remove(eVar);
        j();
    }

    public ArrayList i() {
        return this.b;
    }

    public void c(c cVar) {
    }

    public void b(c cVar) {
    }

    public void a(c cVar) {
    }

    public boolean a(com.tsf.shell.e.i.b.e.b bVar) {
        return true;
    }
}
