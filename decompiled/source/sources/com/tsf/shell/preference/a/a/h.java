package com.tsf.shell.preference.a.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.e.a;
import com.censivn.C3DEngine.b.e.h;
import com.censivn.C3DEngine.b.e.i;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class h extends i {
    private a a;
    private com.censivn.C3DEngine.b.e.e b;
    private com.censivn.C3DEngine.b.e.a c;
    private boolean d;
    private boolean e;
    private float h = 0.5f;
    private TextureElement f = new TextureElement(0, false);
    private k g = new k(com.censivn.C3DEngine.b.b.a.a(24.0f), com.censivn.C3DEngine.b.b.a.a(45.0f), false) { // from class: com.tsf.shell.preference.a.a.h.1
        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            if (h.this.f.id == 0) {
                com.censivn.C3DEngine.a.g().a(h.this.f, b.d.scrollcontainer_arrow);
            }
        }
    };

    public h() {
        this.g.textures().addElement(this.f);
        this.g.alpha(200.0f);
        a(b.i.text_preferences);
        this.c = new com.censivn.C3DEngine.b.e.a();
        this.c.h(b.i.text_enable);
        this.c.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.h.2
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                h.this.d = z;
                com.tsf.shell.manager.a.n.a(h.this.d);
                h.this.k();
                h.this.i();
                return true;
            }
        });
        b(this.c);
        this.a = new a();
        this.a.h(b.i.text_direction);
        b(this.a);
        com.censivn.C3DEngine.b.e.e eVar = new com.censivn.C3DEngine.b.e.e();
        this.b = eVar;
        eVar.g(b.i.text_position);
        eVar.i(0);
        eVar.j(100);
        eVar.a(new h.a() { // from class: com.tsf.shell.preference.a.a.h.3
            @Override // com.censivn.C3DEngine.b.e.h.a
            public boolean a(int i) {
                h.this.h = i / 100.0f;
                if (com.censivn.C3DEngine.b.b.a.O) {
                    com.tsf.shell.manager.a.n.a(h.this.h);
                } else {
                    com.tsf.shell.manager.a.n.b(h.this.h);
                }
                h.this.i();
                return true;
            }
        });
        b(eVar);
        addChild(this.g);
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void b(com.censivn.C3DEngine.b.e.f fVar) {
        super.a(fVar, com.censivn.C3DEngine.b.b.a.a(50.0f));
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
        float f = com.censivn.C3DEngine.b.b.a.B - com.tsf.shell.manager.m.b.b;
        float f2 = (com.censivn.C3DEngine.b.b.a.B - com.censivn.C3DEngine.b.b.a.C) - (2.0f * com.tsf.shell.manager.m.b.b);
        this.g.position().y = f - (f2 * this.h);
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void h() {
        super.h();
        j();
        i();
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
        boolean h = com.tsf.shell.manager.b.e.h();
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
            this.b.b(x.c(b.i.text_position) + " (" + x.c(b.i.text_vertical) + ")");
            this.h = com.tsf.shell.manager.a.n.a();
        } else {
            this.b.b(x.c(b.i.text_position) + " (" + x.c(b.i.text_horizontal) + ")");
            this.h = com.tsf.shell.manager.a.n.c();
        }
        this.b.k((int) (this.h * 100.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.d) {
            this.a.j();
            this.b.j();
            return;
        }
        this.a.i();
        this.b.i();
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void c() {
        if (this.f.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.f);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void g() {
        if (this.d != this.e) {
            com.tsf.shell.manager.b.e.b(this.d);
        }
        com.tsf.shell.manager.a.n.a(this.a.e(), true);
        com.tsf.shell.manager.a.n.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends com.censivn.C3DEngine.b.e.g {
        private k b;
        private TextureElement d;
        private int e = 0;

        public a() {
            h();
        }

        public void f(int i) {
            this.e = i;
            m();
        }

        public int e() {
            return this.e;
        }

        @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.e.f
        public void i() {
            super.i();
            this.b.alpha(100.0f);
        }

        @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.e.f
        public void j() {
            super.j();
            this.b.alpha(255.0f);
        }

        @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.e.f
        public void f() {
            super.f();
        }

        @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.e.f
        public void g() {
            super.g();
            if (this.d.id != 0) {
                com.censivn.C3DEngine.a.g().a(this.d);
            }
        }

        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            super.onDrawStart();
            if (this.d.id == 0) {
                Bitmap a = x.a(b.d.preference_side_menu_direction_icon, com.censivn.C3DEngine.b.b.a.a(90.0f), com.censivn.C3DEngine.b.b.a.a(120.0f));
                com.censivn.C3DEngine.a.g().a(this.d, a);
                a.recycle();
            }
        }

        private void h() {
            this.b = com.censivn.C3DEngine.b.b.a.a(90.0f, 120.0f);
            this.d = new TextureElement(0, false);
            this.b.textures().addElement(this.d);
            this.b.position().y = (-b()) / 2.0f;
            addChild(this.b);
            setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.preference.a.a.h.a.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (a.this.e == 0) {
                        a.this.e = 1;
                    } else {
                        a.this.e = 0;
                    }
                    com.tsf.shell.manager.a.n.a(a.this.e, false);
                    a.this.m();
                    h.this.i();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m() {
            if (this.e == 0) {
                this.b.rotation().z = 0.0f;
            } else {
                this.b.rotation().z = 180.0f;
            }
        }

        @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.b.c
        public void c(int i) {
            super.c(i);
            if (this.b != null) {
                this.b.position().x = (i / 2.0f) - (this.b.b() / 2.0f);
            }
        }

        @Override // com.censivn.C3DEngine.b.b.c
        public void e(int i) {
            super.e(i);
            if (this.b != null) {
                this.b.position().y = (-i) / 2.0f;
            }
        }
    }
}
