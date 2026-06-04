package com.tsf.shell.workspace3D.h;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {
    public static com.tsf.shell.workspace3D.h.b.g b;
    public ArrayList a;

    public j() {
        a();
    }

    private void a() {
        this.a = new ArrayList();
        this.a.add(new com.tsf.shell.workspace3D.h.b.e());
        this.a.add(new com.tsf.shell.workspace3D.h.b.c());
        this.a.add(new com.tsf.shell.workspace3D.h.b.d());
        this.a.add(new com.tsf.shell.workspace3D.h.b.b());
        this.a.add(new com.tsf.shell.workspace3D.h.b.a());
        this.a.add(new com.tsf.shell.workspace3D.h.b.f());
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((com.tsf.shell.workspace3D.h.b.g) this.a.get(i)).a(i);
        }
        int q = com.tsf.shell.a.t.q();
        if (q < 0) {
            q = 0;
        } else if (q > this.a.size() - 1) {
            q = this.a.size() - 1;
        }
        a((com.tsf.shell.workspace3D.h.b.g) this.a.get(q));
    }

    public final boolean a(com.tsf.shell.workspace3D.h.b.g gVar) {
        if (b == gVar) {
            return false;
        }
        b = gVar;
        com.censivn.C3DEngine.a.a().d(new k(this));
        return true;
    }
}
