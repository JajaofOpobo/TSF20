package com.tsf.shell.e.f.a.c.a;

import android.os.AsyncTask;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import com.tsf.shell.e.f.a.c.k;
import com.tsf.shell.e.f.a.c.m;
import com.tsf.shell.e.f.a.f;
import com.tsf.shell.plugin.classification.e;

/* loaded from: classes.dex */
public class a extends b {
    private com.censivn.C3DEngine.b.h.d.b b;
    private com.censivn.C3DEngine.b.f.a.a c;
    private boolean d;
    private float e;
    private float f;
    private boolean g;
    private f h;
    private AsyncTask i;

    public void a() {
        if (this.i != null) {
            this.i.cancel(true);
            this.i = null;
        }
        if (this.d) {
            a((e) null);
        }
    }

    public a(m mVar) {
        super(mVar);
        this.d = false;
        this.e = 360.0f;
        this.f = 0.0f;
        this.g = false;
        this.h = new f() { // from class: com.tsf.shell.e.f.a.c.a.a.1
            @Override // com.tsf.shell.e.f.a.f, com.tsf.shell.plugin.classification.h
            public void a(final e eVar) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.a.c.a.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(eVar);
                    }
                });
            }

            @Override // com.tsf.shell.e.f.a.f, com.tsf.shell.plugin.classification.h
            public void a() {
                if (!a.this.d) {
                    return;
                }
                a.this.a((e) null);
            }
        };
    }

    @Override // com.tsf.shell.e.f.a.c.a.b
    public l a(TextureElement textureElement) {
        l lVar = new l();
        com.censivn.C3DEngine.b.f.a.a a = k.a();
        this.c = a;
        a.removeFromParent();
        a.textures().addElement(textureElement);
        lVar.addChild(a);
        this.b = new com.censivn.C3DEngine.b.h.d.b(com.censivn.C3DEngine.b.b.a.a(140.0f), R.drawable.ring) { // from class: com.tsf.shell.e.f.a.c.a.a.2
            @Override // com.censivn.C3DEngine.b.h.d.b, com.censivn.C3DEngine.b.f.a.a, com.censivn.C3DEngine.b.f.j
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
        this.b.position().y = a.a(0).m.y;
        lVar.addChild(this.b);
        return lVar;
    }

    @Override // com.tsf.shell.e.f.a.c.a.b
    public boolean b() {
        return !this.d;
    }

    @Override // com.tsf.shell.e.f.a.c.a.b
    public void c() {
        l();
    }

    @Override // com.tsf.shell.e.f.a.c.a.b
    public void d() {
        a();
    }

    private void l() {
        this.d = true;
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.c.a.a.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.b.visible(true);
                a.this.e = 360.0f;
                a.this.f = 0.0f;
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.f.a.c.a.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.i = com.tsf.shell.manager.a.h.t().am().a(a.this.h);
                    }
                });
            }
        };
        xVar.l(0.6f);
        xVar.m(0.6f);
        w.a(this.c.a(0));
        w.a(this.c.a(0), 250, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final e eVar) {
        this.b.a(0.0f, 250, new Runnable() { // from class: com.tsf.shell.e.f.a.c.a.a.4
            @Override // java.lang.Runnable
            public void run() {
                a.this.b.visible(false);
                final e eVar2 = eVar;
                x xVar = new x() { // from class: com.tsf.shell.e.f.a.c.a.a.4.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        if (a.this.i != null && eVar2 != null) {
                            com.tsf.shell.manager.a.h.t().am().a(eVar2);
                            a.this.g = true;
                        }
                        a.this.d = false;
                        a.this.i = null;
                    }
                };
                xVar.l(1.0f);
                xVar.m(1.0f);
                w.a(a.this.c.a(0));
                w.a(a.this.c.a(0), 250, xVar);
                a.this.b.rotation().y = 0.0f;
                a.this.b.rotation().z = 0.0f;
            }
        });
    }

    @Override // com.tsf.shell.e.f.a.c.a.b
    public void e() {
        this.g = false;
    }

    @Override // com.tsf.shell.e.f.a.c.a.b
    public void f() {
        super.f();
        this.b.c();
    }
}
