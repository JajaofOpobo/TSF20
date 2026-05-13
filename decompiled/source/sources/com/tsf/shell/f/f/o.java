package com.tsf.shell.f.f;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o {
    private ArrayList<a> a = new ArrayList<>();
    private g b;

    /* loaded from: classes.dex */
    public static class a {
        public void a(g gVar) {
        }

        public void a() {
        }

        public void b() {
        }
    }

    public void a(a aVar) {
        if (!this.a.contains(aVar)) {
            this.a.add(aVar);
        }
    }

    public void a() {
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void b() {
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void a(g gVar) {
        if (this.b != gVar) {
            this.b = gVar;
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(gVar);
            }
        }
    }
}
