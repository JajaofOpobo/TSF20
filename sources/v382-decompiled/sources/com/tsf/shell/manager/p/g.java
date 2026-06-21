package com.tsf.shell.manager.p;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g {
    public int a;
    public int b;
    public int c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    private g f;

    public boolean a() {
        if (this.d.isEmpty()) {
            return this.c > this.b;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((g) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public void a(h hVar) {
        if (!this.e.contains(hVar)) {
            this.e.add(hVar);
        }
    }

    public void b() {
        if (!this.d.isEmpty()) {
            if (this.f != null) {
                this.f.b();
            }
            c();
        } else if (this.b != this.c) {
            boolean z = false;
            if (this.f != null) {
                z = this.f.a();
            }
            this.b = this.c;
            com.tsf.shell.manager.a.a.a().a(this.a, this.b);
            c();
            if (this.f != null && this.f.a() != z) {
                this.f.b();
            }
        }
    }

    public void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
    }

    public void a(g gVar) {
        this.d.add(gVar);
        gVar.b(this);
    }

    public void b(g gVar) {
        this.f = gVar;
    }
}
