package com.tsf.shell.manager.r.a;

import android.view.View;
import com.tsf.shell.manager.a.i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {
    private Object c = new Object();
    public a a = new a();
    private ArrayList b = new ArrayList();

    public void a() {
    }

    public void b() {
    }

    public com.tsf.shell.e.i.b.b.a a(View view) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            com.tsf.shell.e.i.b.b.a aVar = (com.tsf.shell.e.i.b.b.a) this.b.get(i);
            if (aVar.g == view) {
                if (aVar.a) {
                    return null;
                }
                return aVar;
            }
        }
        return null;
    }

    public void a(com.tsf.shell.e.i.b.b.a aVar) {
        if (!this.b.contains(aVar)) {
            synchronized (this.c) {
                this.b.add(aVar);
            }
        }
    }

    public void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String packageName = ((i) it.next()).b.getPackageName();
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                com.tsf.shell.e.i.b.b.a aVar = (com.tsf.shell.e.i.b.b.a) it2.next();
                if (packageName.equals(aVar.f)) {
                    c(aVar);
                }
            }
        }
    }

    private void c(com.tsf.shell.e.i.b.b.a aVar) {
        aVar.n_();
        com.tsf.shell.manager.r.c.i.a(aVar, (Runnable) null);
    }

    public void b(com.tsf.shell.e.i.b.b.a aVar) {
        synchronized (this.c) {
            this.b.remove(aVar);
        }
    }

    public void c() {
    }

    public void d() {
    }
}
