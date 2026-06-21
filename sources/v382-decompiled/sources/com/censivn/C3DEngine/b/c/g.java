package com.censivn.C3DEngine.b.c;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g {
    private i a;
    private ArrayList b = new ArrayList();

    public void a() {
        if (this.a != null) {
            this.a.a();
        }
    }

    public void a(i iVar) {
        this.a = iVar;
    }

    public void b(i iVar) {
        this.a = null;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
    }

    public boolean b() {
        return this.a != null;
    }

    public void a(h hVar) {
        this.b.add(hVar);
    }
}
