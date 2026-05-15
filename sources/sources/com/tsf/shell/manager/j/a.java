package com.tsf.shell.manager.j;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.f.e.i;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends j {
    private static final int a = com.censivn.C3DEngine.b.b.a.b(72.0f);
    private static final int l = com.censivn.C3DEngine.b.b.a.b(15.0f);
    private static final int m = (a / 2) + l;
    private k d;
    private k e;
    private k f;
    private m g;
    private TextureElement i = new TextureElement(0, false);
    private TextureElement j = new TextureElement(0, false);
    private TextureElement k = new TextureElement(0, false);
    private j b = new j();
    private j c = new j();
    private i h = new i();

    public a() {
        this.h.a(3);
        this.d = new k(a, a, false);
        this.d.textures().addElement(this.i);
        this.d.setDefaultColor(new Color4(-2236963));
        this.e = new k(a, a, false);
        this.e.textures().addElement(this.j);
        this.f = new k(a, a, false);
        this.f.textures().addElement(this.k);
        this.g = new m();
        this.g.d(60);
        this.g.e(-2236963);
        this.g.b(true);
        this.g.c(b.i.text_excellent);
        this.g.b(1);
        this.g.b();
        this.g.position().x = m;
        this.h.addChild(this.g);
        this.c.addChild(this.d);
        this.c.addChild(this.e);
        this.c.addChild(this.f);
        addChild(this.b);
        this.b.position().x = f();
        this.b.addChild(this.h);
        this.b.addChild(this.c);
        e();
    }

    private void e() {
        this.h.a(this.g.maxX() + l + a, this.g.maxY() - this.g.minY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float f() {
        return ((-((this.g.maxX() + a) + l)) / 2.0f) + (a / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.g.c(i);
        this.g.b();
        e();
    }

    public void a() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h(com.censivn.C3DEngine.b.b.a.a(-20.0f));
        com.censivn.C3DEngine.b.g.c.a(this.e);
        com.censivn.C3DEngine.b.g.c.a(this.e, VEasing.Linear.easeNone, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.j.a.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.a(b.i.text_why);
                com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d();
                dVar3.f(a.m);
                com.censivn.C3DEngine.b.g.c.a(a.this.g);
                com.censivn.C3DEngine.b.g.c.a(a.this.g, VEasing.Linear.easeNone, dVar3);
                com.censivn.C3DEngine.b.g.d dVar4 = new com.censivn.C3DEngine.b.g.d();
                dVar4.f(a.this.f());
                com.censivn.C3DEngine.b.g.c.a(a.this.b);
                com.censivn.C3DEngine.b.g.c.a(a.this.b, VEasing.Linear.easeNone, dVar4);
            }
        };
        dVar2.f(-this.g.maxX());
        com.censivn.C3DEngine.b.g.c.a(this.g);
        com.censivn.C3DEngine.b.g.c.a(this.g, VEasing.Linear.easeNone, dVar2);
        com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.j.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.g.d dVar4 = new com.censivn.C3DEngine.b.g.d();
                dVar4.e(180.0f);
                com.censivn.C3DEngine.b.g.c.a(a.this.c);
                com.censivn.C3DEngine.b.g.c.a(a.this.c, VEasing.Linear.easeNone, dVar4);
            }
        };
        dVar3.h(com.censivn.C3DEngine.b.b.a.a(25.0f));
        com.censivn.C3DEngine.b.g.c.a(this.f);
        com.censivn.C3DEngine.b.g.c.a(this.f, VEasing.Linear.easeNone, dVar3);
    }

    public void b() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.e);
        com.censivn.C3DEngine.b.g.c.a(this.e, VEasing.Linear.easeNone, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.j.a.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.a(b.i.text_excellent);
                com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d();
                dVar3.f(a.m);
                com.censivn.C3DEngine.b.g.c.a(a.this.g);
                com.censivn.C3DEngine.b.g.c.a(a.this.g, VEasing.Linear.easeNone, dVar3);
                com.censivn.C3DEngine.b.g.d dVar4 = new com.censivn.C3DEngine.b.g.d();
                dVar4.f(a.this.f());
                com.censivn.C3DEngine.b.g.c.a(a.this.b);
                com.censivn.C3DEngine.b.g.c.a(a.this.b, VEasing.Linear.easeNone, dVar4);
            }
        };
        dVar2.f(-this.g.maxX());
        com.censivn.C3DEngine.b.g.c.a(this.g);
        com.censivn.C3DEngine.b.g.c.a(this.g, VEasing.Linear.easeNone, dVar2);
        com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.j.a.4
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.g.d dVar4 = new com.censivn.C3DEngine.b.g.d();
                dVar4.e(0.0f);
                com.censivn.C3DEngine.b.g.c.a(a.this.c);
                com.censivn.C3DEngine.b.g.c.a(a.this.c, VEasing.Linear.easeNone, dVar4);
            }
        };
        dVar3.h(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.f);
        com.censivn.C3DEngine.b.g.c.a(this.f, VEasing.Linear.easeNone, dVar3);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.i.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.i, b.d.rate_face);
            com.censivn.C3DEngine.a.g().a(this.j, b.d.rate_face_eyes);
            com.censivn.C3DEngine.a.g().a(this.k, b.d.rate_face_mouth);
        }
    }

    public void c() {
        if (this.i.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.i);
            com.censivn.C3DEngine.a.g().a(this.j);
            com.censivn.C3DEngine.a.g().a(this.k);
        }
    }
}
