package com.tsf.shell.manager.a;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    private ArrayList b;
    private h d;
    private j e = new j();
    private ArrayList c = new ArrayList();
    public b a = new b(this);

    public d(h hVar) {
        this.d = hVar;
    }

    public j a() {
        return this.e;
    }

    public boolean b() {
        return this.b != null;
    }

    protected void a(ArrayList arrayList) {
        this.b = arrayList;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).i_();
        }
    }

    public void a(com.tsf.shell.e.i.b.e.i iVar, boolean z) {
        a(iVar, z, true);
    }

    public void a(com.tsf.shell.e.i.b.e.i iVar, boolean z, boolean z2) {
        this.b.add(iVar);
        if (z2) {
            c();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(iVar, z);
            }
        }
    }

    protected boolean b(com.tsf.shell.e.i.b.e.i iVar, boolean z) {
        boolean remove = this.b.remove(iVar);
        c();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(iVar, z);
        }
        return remove;
    }

    public void a(com.tsf.shell.e.i.b.e.i iVar) {
        c();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(iVar);
        }
    }

    public void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a();
        }
    }

    public com.tsf.shell.e.i.b.e.i a(ComponentName componentName) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            if (iVar.bd().b.equals(componentName)) {
                return iVar;
            }
        }
        return null;
    }

    public com.tsf.shell.e.i.b.e.i a(int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            if (iVar.K() != null && iVar.K().id == i) {
                return iVar;
            }
        }
        return null;
    }

    public com.tsf.shell.e.i.b.e.i a(i iVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar2 = (com.tsf.shell.e.i.b.e.i) it.next();
            if (iVar2.bd() == iVar) {
                return iVar2;
            }
        }
        return null;
    }

    public ArrayList d() {
        return this.b;
    }

    public void a(e eVar) {
        if (!this.c.contains(eVar)) {
            this.c.add(eVar);
        }
    }

    public void b(e eVar) {
        this.c.remove(eVar);
    }
}
