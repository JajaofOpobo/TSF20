package com.tsf.shell.manager.r.a;

import android.view.View;
import com.tsf.shell.manager.a.f;
import com.tsf.shell.manager.r.c.g;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b {
    private Object c = new Object();
    public a a = new a();
    private ArrayList<com.tsf.shell.f.i.b.b.a> b = new ArrayList<>();

    public void a() {
    }

    public void b() {
    }

    public com.tsf.shell.f.i.b.b.a a(View view) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            com.tsf.shell.f.i.b.b.a aVar = this.b.get(i);
            if (aVar.g == view) {
                if (aVar.a) {
                    return null;
                } else {
                    return aVar;
                }
            }
        }
        return null;
    }

    public void a(com.tsf.shell.f.i.b.b.a aVar) {
        if (!this.b.contains(aVar)) {
            synchronized (this.c) {
                this.b.add(aVar);
            }
        }
    }

    public void a(ArrayList<f> arrayList) {
        Iterator<f> it = arrayList.iterator();
        while (it.hasNext()) {
            String packageName = it.next().b.getPackageName();
            Iterator<com.tsf.shell.f.i.b.b.a> it2 = this.b.iterator();
            while (it2.hasNext()) {
                com.tsf.shell.f.i.b.b.a next = it2.next();
                if (packageName.equals(next.f)) {
                    c(next);
                }
            }
        }
    }

    private void c(com.tsf.shell.f.i.b.b.a aVar) {
        aVar.p_();
        g.a(aVar, (Runnable) null);
    }

    public void b(com.tsf.shell.f.i.b.b.a aVar) {
        synchronized (this.c) {
            this.b.remove(aVar);
        }
    }

    public void c() {
    }

    public void d() {
    }
}
