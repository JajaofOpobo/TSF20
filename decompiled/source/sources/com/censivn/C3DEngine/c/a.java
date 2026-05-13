package com.censivn.C3DEngine.c;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.c.a.c;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a {
    c a = new c();
    ArrayList<b> b;

    public a(i iVar) {
        this.a.a(iVar);
        this.a.c();
        this.b = new ArrayList<>();
    }

    public void a(i iVar) {
        this.a.b(iVar);
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
            this.b.get(i).a();
        }
        this.a.k();
    }

    public void b() {
        a();
        this.a.e();
        this.b = new ArrayList<>();
    }

    public void c() {
        this.b = new ArrayList<>();
    }
}
