package com.censivn.C3DEngine.c;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.c.a.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {
    c a = new c();
    ArrayList b;

    public a(j jVar) {
        this.a.a(jVar);
        this.a.c();
        this.b = new ArrayList();
    }

    public void a(j jVar) {
        this.a.b(jVar);
        this.a.c();
    }

    public void a(b bVar) {
        bVar.a(this.a);
        this.b.add(bVar);
    }

    public void a() {
        this.a.d();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((b) this.b.get(i)).a();
        }
        this.a.k();
    }

    public void b() {
        a();
        this.a.e();
        this.b = new ArrayList();
    }

    public void c() {
        this.b = new ArrayList();
    }
}
