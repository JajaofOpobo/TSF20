package com.tsf.shell.manager.a;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c {
    private ArrayList<com.tsf.shell.f.i.b.e.g> b;
    private e d;
    private g e = new g();
    private ArrayList<a> c = new ArrayList<>();
    public b a = new b(this);

    /* loaded from: classes.dex */
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

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ArrayList<com.tsf.shell.f.i.b.e.g> arrayList) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
        boolean remove = this.b.remove(gVar);
        c();
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().b(gVar, z);
        }
        return remove;
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
        Iterator<com.tsf.shell.f.i.b.e.g> it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g next = it.next();
            if (next.bd().b.equals(componentName)) {
                return next;
            }
        }
        return null;
    }

    public com.tsf.shell.f.i.b.e.g a(int i) {
        Iterator<com.tsf.shell.f.i.b.e.g> it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g next = it.next();
            if (next.K() != null && next.K().id == i) {
                return next;
            }
        }
        return null;
    }

    public com.tsf.shell.f.i.b.e.g a(f fVar) {
        Iterator<com.tsf.shell.f.i.b.e.g> it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g next = it.next();
            if (next.bd() == fVar) {
                return next;
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
