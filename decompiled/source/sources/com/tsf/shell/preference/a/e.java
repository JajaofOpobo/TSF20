package com.tsf.shell.preference.a;

import com.tsf.shell.f.c.a.f;
import com.tsf.shell.f.e.j;
import com.tsf.shell.f.i.b.e.h;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e extends b {
    private com.tsf.shell.f.c.a.f a;
    private float b;
    private j d;
    private ArrayList<com.tsf.shell.f.i.b.e.b> e;

    public e(float f) {
        super(f);
        this.e = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            h hVar = new h(com.tsf.shell.manager.o.b.c);
            hVar.aL();
            this.e.add(hVar);
        }
        n();
    }

    public void f(int i) {
        this.a.a(i, false);
    }

    @Override // com.tsf.shell.preference.a.b, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        this.a.f().d();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 8) {
                com.tsf.shell.f.i.b.e.b bVar = this.e.get(i2);
                bVar.k.textures().clear();
                bVar.k.textures().addElement(com.tsf.shell.manager.a.B.a.a(i2));
                i = i2 + 1;
            } else {
                this.a.f().j();
                return;
            }
        }
    }

    @Override // com.tsf.shell.preference.a.b, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        this.a.a(this.b, (-this.b) / 2.0f, 0.0f);
    }

    @Override // com.tsf.shell.preference.a.b, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        this.a.f().e();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 8) {
                this.e.get(i2).k.textures().clear();
                com.tsf.shell.manager.a.B.a.b(i2);
                i = i2 + 1;
            } else {
                this.a.v();
                this.a.f().i();
                return;
            }
        }
    }

    private void n() {
        this.a = new com.tsf.shell.f.c.a.f(true);
        f.a aVar = new f.a();
        aVar.a = 0.0f;
        aVar.b = 0.0f;
        aVar.c = 0.0f;
        this.a.a(e(), aVar);
        this.b = 0.0f;
        this.d = new j(false);
        this.d.a(5);
        this.d.b(2);
        Iterator<com.tsf.shell.f.i.b.e.b> it = this.e.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.b next = it.next();
            this.a.g().addChild(next);
            this.b = (next.maxX() - next.minX()) + this.b;
        }
        this.b *= 0.7f;
        this.a.v();
        this.d.position().x = this.b / 2.0f;
        this.d.position().y = com.censivn.C3DEngine.b.b.a.a(-100.0f);
        this.a.h().addChild(this.d);
    }

    public void h() {
        this.d.b(true);
    }

    public void m() {
        this.d.a(true);
    }
}
