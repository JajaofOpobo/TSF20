package com.censivn.C3DEngine.c;

import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.c.a.Particle;
import com.censivn.C3DEngine.c.a.ParticleData;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {
    c a = new c();
    ArrayList b;

    public a(r rVar) {
        this.a.a(rVar);
        this.a.c();
        this.b = new ArrayList();
    }

    public final void a(b bVar) {
        bVar.a(this.a);
        this.b.add(bVar);
    }

    public final void a() {
        c cVar = this.a;
        int size = cVar.a().size();
        for (int i = 0; i < size; i++) {
            ((e) cVar.a().get(i)).d();
        }
        int size2 = this.b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((b) this.b.get(i2)).a();
        }
        c cVar2 = this.a;
    }

    public final void b() {
        a();
        c cVar = this.a;
        int size = cVar.a().size();
        for (int i = 0; i < size; i++) {
            ((e) cVar.a().get(i)).e();
        }
        cVar.c();
        this.b = new ArrayList();
    }

    public final void c() {
        this.b = new ArrayList();
    }
}
