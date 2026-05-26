package com.tsf.shell.f.d.c.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.f.g.a.h;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends h {
    private static TextureElement h = new TextureElement(0, false);
    private boolean a;
    private Runnable b;
    private Runnable c;
    private Runnable d;
    private Runnable f;
    private d g;

    public c(d dVar) {
        super(new com.censivn.C3DEngine.b.f.a.a(5, 60, 120, 60));
        this.a = false;
        this.g = dVar;
        this.e.useVBO(false);
        com.censivn.C3DEngine.b.f.a.a aVar = (com.censivn.C3DEngine.b.f.a.a) this.e;
        aVar.textures().addElement(h);
        com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a(4);
        bVarA.a(0, 0, 1, 1, com.censivn.C3DEngine.b.b.a.a(60.0f), com.censivn.C3DEngine.b.b.a.a(60.0f));
        bVarA.h();
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA2 = aVar.a(i);
            bVarA2.a(1, 0, 1, 1, com.censivn.C3DEngine.b.b.a.a(60.0f), com.censivn.C3DEngine.b.b.a.a(60.0f));
            bVarA2.o.setAll(0.0f, 0.0f, 1.0f);
            bVarA2.h();
        }
        this.b = new Runnable() { // from class: com.tsf.shell.f.d.c.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().b(c.this.c, 300L);
            }
        };
        this.c = new Runnable() { // from class: com.tsf.shell.f.d.c.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                c.this.g.b((com.censivn.C3DEngine.b.f.a.a) c.this.e, c.this.d);
            }
        };
        this.d = new Runnable() { // from class: com.tsf.shell.f.d.c.a.c.3
            @Override // java.lang.Runnable
            public void run() {
                c.this.a = false;
            }
        };
        this.f = new Runnable() { // from class: com.tsf.shell.f.d.c.a.c.4
            @Override // java.lang.Runnable
            public void run() {
                c.this.g.a((com.censivn.C3DEngine.b.f.a.a) c.this.e, c.this.b);
            }
        };
        calAABB();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (!this.a) {
            this.a = true;
            this.f.run();
        }
        if (h.id == 0) {
            com.censivn.C3DEngine.a.g().a(h, b.d.menu_effect_element);
        }
    }

    public static void a() {
        if (h.id != 0) {
            com.censivn.C3DEngine.a.g().a(h);
        }
        h.b();
    }
}
