package com.censivn.C3DEngine.b.e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends g {
    public static final int a = com.censivn.C3DEngine.b.b.a.b(58.0f);
    public static final TextureElement b = new TextureElement(0, false);
    private a d;
    private com.censivn.C3DEngine.b.b.a.b e;
    private C0028b f;

    public static class a {
        public void a(int i) {
        }
    }

    public b() {
        h();
    }

    @Override // com.censivn.C3DEngine.b.b.c, com.censivn.C3DEngine.b.f.i
    public void onChildMeasure(com.censivn.C3DEngine.b.f.i iVar) {
        iVar.position().x = (-iVar.maxX()) / 2.0f;
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
    }

    @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
    }

    public int e() {
        return a(this.f);
    }

    public void f(int i) {
        if (i > -1 && i < numChildren()) {
            a((C0028b) this.e.getChildAt(i), false);
        }
    }

    public void a(C0028b c0028b, boolean z) {
        if (this.f != null) {
            this.f.b();
        }
        this.f = c0028b;
        this.f.a();
        int iA = a(this.f);
        if (z && this.d != null) {
            this.d.a(iA);
        }
    }

    private int a(C0028b c0028b) {
        return this.e.children().indexOf(c0028b);
    }

    private void h() {
        this.e = new com.censivn.C3DEngine.b.b.a.b();
        this.e.position().y = (-b()) / 2.0f;
        addChild(this.e);
        this.e.position().x = (-this.e.maxX()) / 2.0f;
    }

    public void g(int i) {
        C0028b c0028b = new C0028b();
        c0028b.a(i);
        this.e.addChild(c0028b);
    }

    @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
    }

    /* JADX INFO: renamed from: com.censivn.C3DEngine.b.e.b$b, reason: collision with other inner class name */
    class C0028b extends com.censivn.C3DEngine.b.f.j {
        private com.censivn.C3DEngine.b.f.a.a b;
        private m c = new m();
        private com.censivn.C3DEngine.b.f.a.b d;
        private com.censivn.C3DEngine.b.f.a.b e;

        public C0028b() {
            this.c.d(50);
            this.c.position().x = b.a + com.censivn.C3DEngine.b.b.a.a(20.0f);
            this.c.b(1);
            this.b = new com.censivn.C3DEngine.b.f.a.a(2, b.a, b.a * 2, b.a);
            this.b.position().x = b.a / 2.0f;
            this.d = this.b.a(0);
            this.d.b(0, 0, 1, 1);
            this.d.h();
            this.e = this.b.a(1);
            this.e.b(1, 0, 1, 1);
            this.e.h();
            this.b.textures().addElement(b.b);
            addChild(this.b);
            addChild(this.c);
            b(false);
            setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.e.b.b.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    b.this.a(C0028b.this, true);
                }
            });
        }

        public void a(int i) {
            a(x.c(i));
        }

        public void a(String str) {
            this.c.a(str);
            this.c.b();
            setAABBPX(0.0f, ((-b.a) / 2.0f) * 1.5f, 0.0f, this.c.position().x + this.c.maxX() + com.censivn.C3DEngine.b.b.a.a(50.0f), 1.5f * (b.a / 2.0f), 0.0f);
            notifLayoutRefresh();
        }

        public void a() {
            a(true);
        }

        public void a(boolean z) {
            if (z) {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.l(1.0f);
                dVar.m(1.0f);
                dVar.a(com.censivn.C3DEngine.b.g.a.a);
                com.censivn.C3DEngine.b.g.c.a(this.e);
                com.censivn.C3DEngine.b.g.c.a(this.e, VEasing.Back.easeIn, dVar);
                return;
            }
            this.e.k().x = 1.0f;
            this.e.k().y = 1.0f;
            this.e.f();
        }

        public void b() {
            b(true);
        }

        public void b(boolean z) {
            if (z) {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.l(0.0f);
                dVar.m(0.0f);
                com.censivn.C3DEngine.b.g.c.a(this.e);
                com.censivn.C3DEngine.b.g.c.a(this.e, VEasing.Back.easeIn, dVar);
                return;
            }
            this.e.k().x = 0.0f;
            this.e.k().y = 0.0f;
            this.e.f();
        }

        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            if (b.b.id == 0) {
                com.censivn.C3DEngine.a.g().a(b.b, b.d.preference_radio);
            }
        }
    }
}
