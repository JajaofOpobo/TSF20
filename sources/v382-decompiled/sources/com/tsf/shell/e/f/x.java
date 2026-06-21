package com.tsf.shell.e.f;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class x {
    private ArrayList a = new ArrayList();
    private g b;

    public void a(y yVar) {
        if (!this.a.contains(yVar)) {
            this.a.add(yVar);
        }
    }

    public void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((y) it.next()).a();
        }
    }

    public void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((y) it.next()).b();
        }
    }

    public void a(g gVar) {
        if (this.b != gVar) {
            this.b = gVar;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((y) it.next()).a(gVar);
            }
        }
    }
}
