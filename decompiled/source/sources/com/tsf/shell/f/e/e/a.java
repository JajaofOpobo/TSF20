package com.tsf.shell.f.e.e;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.w;
/* loaded from: classes.dex */
public class a extends j {
    private C0093a b;
    private b c;
    private boolean d = false;
    private C0093a a = new C0093a(com.censivn.C3DEngine.b.b.a.a(20.0f), com.censivn.C3DEngine.b.b.a.E, 0);

    public a() {
        this.a.setDefaultColor(new Color4(255, 255, 255, 100));
        this.a.alpha(0.0f);
        this.b = new C0093a(com.censivn.C3DEngine.b.b.a.a(20.0f), com.censivn.C3DEngine.b.b.a.E, 1);
        this.b.setDefaultColor(new Color4(255, 255, 255, 100));
        this.b.alpha(0.0f);
        addChild(this.a);
        addChild(this.b);
        this.c = new b() { // from class: com.tsf.shell.f.e.e.a.1
            @Override // com.tsf.shell.f.e.e.a.b, java.lang.Runnable
            public void run() {
                a.this.a(this.c, this.b);
            }
        };
    }

    public void a(int i, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        visible(true);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 250, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 250, dVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.e.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.visible(false);
                if (!a.this.d) {
                    com.tsf.shell.manager.a.j.b(a.this);
                }
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 250, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 250, dVar2);
    }

    public float a() {
        return 0.0f;
    }

    public void b() {
        if (!this.d) {
            this.d = true;
            removeFromParent();
            float a = com.censivn.C3DEngine.b.b.a.C + a();
            this.a.points().setYPX(0, a);
            this.a.points().setYPX(1, a);
            this.b.points().setYPX(0, a);
            this.b.points().setYPX(1, a);
            this.a.points().setYPX(2, com.censivn.C3DEngine.b.b.a.B);
            this.a.points().setYPX(3, com.censivn.C3DEngine.b.b.a.B);
            this.b.points().setYPX(2, com.censivn.C3DEngine.b.b.a.B);
            this.b.points().setYPX(3, com.censivn.C3DEngine.b.b.a.B);
            this.a.updatePointsVBO();
            this.b.updatePointsVBO();
            this.a.calAABB(6.0f, 1.0f, 1.0f);
            this.b.calAABB(6.0f, 1.0f, 1.0f);
            com.tsf.shell.manager.a.j.a(this);
            com.tsf.shell.manager.a.k.b(this.a);
            com.tsf.shell.manager.a.k.b(this.b);
            this.a.position().x = com.censivn.C3DEngine.b.b.a.z;
            this.b.position().x = com.censivn.C3DEngine.b.b.a.A;
        }
    }

    public void a(int i) {
        com.censivn.C3DEngine.a.a().b(this.c, i);
    }

    public void c() {
        if (this.d) {
            this.d = false;
            e();
            com.tsf.shell.manager.a.k.c(this.a);
            com.tsf.shell.manager.a.k.c(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0093a extends e {
        public int a;

        public C0093a(float f, float f2, int i) {
            super(f, f2, false);
            this.a = i;
        }

        @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
        public void a(com.tsf.shell.f.e.f fVar) {
            w.a();
            a.this.c.b = fVar;
            a.this.c.c = this.a;
            com.censivn.C3DEngine.a.a().b(a.this.c, 400L);
            a.this.d();
        }

        @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
        public boolean b(com.tsf.shell.f.e.f fVar) {
            return false;
        }

        @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
        public void e(com.tsf.shell.f.e.f fVar) {
            com.censivn.C3DEngine.a.a().g(a.this.c);
            a.this.c.b = null;
            a.this.e();
        }

        @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
        public void d(com.tsf.shell.f.e.f fVar) {
            com.censivn.C3DEngine.a.a().g(a.this.c);
            a.this.c.b = null;
            a.this.e();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        Object b;
        int c;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
