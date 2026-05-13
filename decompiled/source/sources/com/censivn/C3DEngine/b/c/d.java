package com.censivn.C3DEngine.b.c;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class d {
    private b a;
    private ArrayList<a> b = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class b {
        public void a() {
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public void a() {
        }
    }

    public void a() {
        if (this.a != null) {
            this.a.a();
        }
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    public void b(b bVar) {
        this.a = null;
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public boolean b() {
        return this.a != null;
    }

    public void a(a aVar) {
        this.b.add(aVar);
    }
}
