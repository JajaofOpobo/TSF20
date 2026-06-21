package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.e.l;
import com.censivn.C3DEngine.b.e.m;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class i extends m {
    private j a;
    private com.censivn.C3DEngine.b.e.h b;
    private com.censivn.C3DEngine.b.e.a c;
    private boolean d;
    private boolean e;
    private float h = 0.5f;
    private TextureElement f = new TextureElement(0, false);
    private com.censivn.C3DEngine.b.f.m g = new com.censivn.C3DEngine.b.f.m(com.censivn.C3DEngine.b.b.a.a(24.0f), com.censivn.C3DEngine.b.b.a.a(45.0f), false) { // from class: com.tsf.shell.preference.a.a.i.1
        @Override // com.censivn.C3DEngine.b.f.j
        public void onDrawStart() {
            if (i.this.f.id == 0) {
                com.censivn.C3DEngine.a.g().a(i.this.f, R.drawable.scrollcontainer_arrow);
            }
        }
    };

    public i() {
        this.g.textures().addElement(this.f);
        this.g.alpha(200.0f);
        a(R.string.text_preferences);
        this.c = new com.censivn.C3DEngine.b.e.a();
        this.c.h(R.string.text_enable);
        this.c.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.i.2
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                i.this.d = z;
                com.tsf.shell.manager.a.n.a(i.this.d);
                i.this.k();
                i.this.i();
                return true;
            }
        });
        b(this.c);
        this.a = new j(this);
        this.a.h(R.string.text_direction);
        b(this.a);
        com.censivn.C3DEngine.b.e.h hVar = new com.censivn.C3DEngine.b.e.h();
        this.b = hVar;
        hVar.g(R.string.text_position);
        hVar.i(0);
        hVar.j(100);
        hVar.a(new l() { // from class: com.tsf.shell.preference.a.a.i.3
            @Override // com.censivn.C3DEngine.b.e.l
            public boolean a(int i) {
                i.this.h = i / 100.0f;
                if (com.censivn.C3DEngine.b.b.a.O) {
                    com.tsf.shell.manager.a.n.a(i.this.h);
                } else {
                    com.tsf.shell.manager.a.n.b(i.this.h);
                }
                i.this.i();
                return true;
            }
        });
        b(hVar);
        addChild(this.g);
    }

    @Override // com.censivn.C3DEngine.b.e.m
    public void b(com.censivn.C3DEngine.b.e.i iVar) {
        super.a(iVar, com.censivn.C3DEngine.b.b.a.a(50.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.g.visible(Boolean.valueOf(this.d));
        if (this.a.e() == 0) {
            this.g.position().x = com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(30.0f);
            this.g.rotation().z = 0.0f;
        } else {
            this.g.position().x = com.censivn.C3DEngine.b.b.a.A - com.censivn.C3DEngine.b.b.a.a(30.0f);
            this.g.rotation().z = 180.0f;
        }
        this.g.position().y = (com.censivn.C3DEngine.b.b.a.B - com.tsf.shell.manager.m.c.b) - (((com.censivn.C3DEngine.b.b.a.B - com.censivn.C3DEngine.b.b.a.C) - (2.0f * com.tsf.shell.manager.m.c.b)) * this.h);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void h() {
        super.h();
        j();
        i();
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        boolean h = com.tsf.shell.manager.b.g.h();
        this.e = h;
        this.d = h;
        this.c.c(this.d);
        this.a.f(com.tsf.shell.manager.a.n.d());
        i();
        k();
        j();
    }

    private void j() {
        if (com.censivn.C3DEngine.b.b.a.O) {
            this.b.b(String.valueOf(x.c(R.string.text_position)) + " (" + x.c(R.string.text_vertical) + ")");
            this.h = com.tsf.shell.manager.a.n.a();
        } else {
            this.b.b(String.valueOf(x.c(R.string.text_position)) + " (" + x.c(R.string.text_horizontal) + ")");
            this.h = com.tsf.shell.manager.a.n.c();
        }
        this.b.k((int) (this.h * 100.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.d) {
            this.a.j();
            this.b.j();
        } else {
            this.a.i();
            this.b.i();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void c() {
        if (this.f.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.f);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        if (this.d != this.e) {
            com.tsf.shell.manager.b.g.b(this.d);
        }
        com.tsf.shell.manager.a.n.a(this.a.e(), true);
        com.tsf.shell.manager.a.n.h();
    }
}
