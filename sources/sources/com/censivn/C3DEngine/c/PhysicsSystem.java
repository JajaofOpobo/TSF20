package com.censivn.C3DEngine.c;

import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.c.a.Particle;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PhysicsSystem {
    Particle a = new Particle();
    ArrayList<IPhysicsSystem> b;

    public PhysicsSystem(IRenderable iVar) {
        this.a.a(iVar);
        this.a.c();
        this.b = new ArrayList<>();
    }

    public void a(IRenderable iVar) {
        this.a.b(iVar);
        this.a.c();
    }

    public void a(IPhysicsSystem bVar) {
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
