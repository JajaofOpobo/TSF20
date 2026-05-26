package com.tsf.shell.manager.a;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    private ArrayList<com.tsf.shell.f.i.b.e.g> b;
    private e d;
    private g e = new g();
    private ArrayList<a> c = new ArrayList<>();
    public b a = new b(this);

    public interface a {
        void a();

        void a(com.tsf.shell.f.i.b.e.g gVar);

        void a(com.tsf.shell.f.i.b.e.g gVar, boolean z);

        void b(com.tsf.shell.f.i.b.e.g gVar, boolean z);

        void k_();
    }

    public c(e eVar) {
        this.d = eVar;
    }

    public g a() {
        return this.e;
    }

    public boolean b() {
        return this.b != null;
    }

    protected void a(ArrayList<com.tsf.shell.f.i.b.e.g> arrayList) {
        this.b = arrayList;
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().k_();
        }
    }

    public void a(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
        a(gVar, z, true);
    }

    public void a(com.tsf.shell.f.i.b.e.g gVar, boolean z, boolean z2) {
        this.b.add(gVar);
        if (z2) {
            c();
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a(gVar, z);
            }
        }
    }

    protected boolean b(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
        boolean zRemove = this.b.remove(gVar);
        c();
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().b(gVar, z);
        }
        return zRemove;
    }

    public void a(com.tsf.shell.f.i.b.e.g gVar) {
        c();
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(gVar);
        }
    }

    public void c() {
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public com.tsf.shell.f.i.b.e.g a(ComponentName componentName) {
        for (com.tsf.shell.f.i.b.e.g gVar : this.b) {
            if (gVar.bd().b.equals(componentName)) {
                return gVar;
            }
        }
        return null;
    }

    public com.tsf.shell.f.i.b.e.g a(int i) {
        for (com.tsf.shell.f.i.b.e.g gVar : this.b) {
            if (gVar.K() != null && gVar.K().id == i) {
                return gVar;
            }
        }
        return null;
    }

    public com.tsf.shell.f.i.b.e.g a(f fVar) {
        for (com.tsf.shell.f.i.b.e.g gVar : this.b) {
            if (gVar.bd() == fVar) {
                return gVar;
            }
        }
        return null;
    }

    public ArrayList<com.tsf.shell.f.i.b.e.g> d() {
        return this.b;
    }

    public void a(a aVar) {
        if (!this.c.contains(aVar)) {
            this.c.add(aVar);
        }
    }

    public void b(a aVar) {
        this.c.remove(aVar);
    }
}
