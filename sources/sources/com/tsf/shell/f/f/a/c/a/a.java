package com.tsf.shell.f.f.a.c.a;

import android.os.AsyncTask;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.c;
import com.tsf.b;
import com.tsf.shell.f.f.a.c.k;
import com.tsf.shell.f.f.a.d;
import com.tsf.shell.plugin.classification.d;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends b {
    private com.censivn.C3DEngine.b.h.d.b b;
    private com.censivn.C3DEngine.b.f.a.a c;
    private boolean d;
    private float e;
    private float f;
    private boolean g;
    private d.a h;
    private AsyncTask i;

    public void a() {
        if (this.i != null) {
            this.i.cancel(true);
            this.i = null;
        }
        if (this.d) {
            a((d.a) null);
        }
    }

    public a(k.a aVar) {
        super(aVar);
        this.d = false;
        this.e = 360.0f;
        this.f = 0.0f;
        this.g = false;
        this.h = new d.a() { // from class: com.tsf.shell.f.f.a.c.a.a.1
            @Override // com.tsf.shell.f.f.a.d.a, com.tsf.shell.plugin.classification.d.InterfaceC0151d
            public void a(final d.a aVar2) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.c.a.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(aVar2);
                    }
                });
            }

            @Override // com.tsf.shell.f.f.a.d.a, com.tsf.shell.plugin.classification.d.InterfaceC0151d
            public void a() {
                if (a.this.d) {
                    a.this.a((d.a) null);
                }
            }
        };
    }

    @Override // com.tsf.shell.f.f.a.c.a.b
    public j a(TextureElement textureElement) {
        j jVar = new j();
        com.censivn.C3DEngine.b.f.a.a aVarA = com.tsf.shell.f.f.a.c.j.a();
        this.c = aVarA;
        aVarA.removeFromParent();
        aVarA.textures().addElement(textureElement);
        jVar.addChild(aVarA);
        this.b = new com.censivn.C3DEngine.b.h.d.b(com.censivn.C3DEngine.b.b.a.a(140.0f), b.d.ring) { // from class: com.tsf.shell.f.f.a.c.a.a.2
            @Override // com.censivn.C3DEngine.b.h.d.b, com.censivn.C3DEngine.b.f.a.a, com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                f();
                if (a.this.d) {
                    a.this.f += (a.this.e - a.this.f) * 0.12f;
                    if (a.this.e == 360.0f) {
                        rotation().z -= 3.0f;
                        if (Math.abs(a.this.f - a.this.e) < 1.0f) {
                            a.this.f = a.this.e;
                            a.this.e = 25.0f;
                            rotation().z = 360.0f - rotation().z;
                            rotation().y = 180.0f;
                        }
                    } else if (a.this.e == 25.0f) {
                        rotation().z += 3.0f;
                        if (Math.abs(a.this.f - a.this.e) < 1.0f) {
                            a.this.f = a.this.e;
                            a.this.e = 360.0f;
                            rotation().y = 0.0f;
                            rotation().z = 360.0f - rotation().z;
                        }
                    }
                    b(a.this.f);
                    return;
                }
                super.onDrawStart();
            }
        };
        this.b.doubleSidedEnabled(true);
        this.b.a(0.0f);
        this.b.visible(false);
        this.b.position().y = aVarA.a(0).m.y;
        jVar.addChild(this.b);
        return jVar;
    }

    @Override // com.tsf.shell.f.f.a.c.a.b
    public boolean b() {
        return !this.d;
    }

    @Override // com.tsf.shell.f.f.a.c.a.b
    public void c() {
        l();
    }

    @Override // com.tsf.shell.f.f.a.c.a.b
    public void d() {
        a();
    }

    private void l() {
        this.d = true;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.c.a.a.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.b.visible(true);
                a.this.e = 360.0f;
                a.this.f = 0.0f;
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.f.a.c.a.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.i = com.tsf.shell.manager.a.h.t().am().a(a.this.h);
                    }
                });
            }
        };
        dVar.l(0.6f);
        dVar.m(0.6f);
        c.a(this.c.a(0));
        c.a(this.c.a(0), 250, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final d.a aVar) {
        this.b.a(0.0f, 250, new Runnable() { // from class: com.tsf.shell.f.f.a.c.a.a.4
            @Override // java.lang.Runnable
            public void run() {
                a.this.b.visible(false);
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.c.a.a.4.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        if (a.this.i != null && aVar != null) {
                            com.tsf.shell.manager.a.h.t().am().a(aVar);
                            a.this.g = true;
                        }
                        a.this.d = false;
                        a.this.i = null;
                    }
                };
                dVar.l(1.0f);
                dVar.m(1.0f);
                c.a(a.this.c.a(0));
                c.a(a.this.c.a(0), 250, dVar);
                a.this.b.rotation().y = 0.0f;
                a.this.b.rotation().z = 0.0f;
            }
        });
    }

    @Override // com.tsf.shell.f.f.a.c.a.b
    public void e() {
        this.g = false;
    }

    @Override // com.tsf.shell.f.f.a.c.a.b
    public void f() {
        super.f();
        this.b.c();
    }
}
