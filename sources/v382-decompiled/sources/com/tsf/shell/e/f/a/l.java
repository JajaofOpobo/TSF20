package com.tsf.shell.e.f.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.e.e.n;

/* loaded from: classes.dex */
class l extends com.censivn.C3DEngine.b.f.m {
    private TextureElement a;
    private int d;
    private n e;
    private boolean f;
    private com.tsf.shell.manager.p.g g;
    private int h;

    public l(int i, int i2) {
        super(i, i, false);
        this.a = new TextureElement(0, false);
        this.d = 0;
        this.f = false;
        this.h = i;
        textures().addElement(this.a);
        calAABB(1.5f, 1.5f, 1.0f);
        this.d = i2;
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.e.f.a.l.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (l.this.g != null) {
                    l.this.g.b();
                }
                l.this.a();
            }
        });
    }

    public void a(int i) {
        this.g = com.tsf.shell.manager.a.a.a(i);
        if (this.g.a()) {
            e();
            this.g.a(new com.tsf.shell.manager.p.h() { // from class: com.tsf.shell.e.f.a.l.2
                @Override // com.tsf.shell.manager.p.h
                public void a() {
                    l.this.f();
                }
            });
        }
    }

    public void a() {
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.a.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.a, this.d, this.h, this.h);
        }
    }

    public void d() {
        if (this.e != null) {
            this.e.a();
        }
        if (this.a.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.a);
        }
    }

    public void e() {
        if (this.e == null) {
            this.e = new n();
            this.e.position().x = com.censivn.C3DEngine.b.b.a.a(36.0f);
            this.e.position().y = com.censivn.C3DEngine.b.b.a.a(36.0f);
        }
        this.f = true;
    }

    public void f() {
        this.f = false;
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        if (this.f) {
            this.e.dispatchDraw();
        }
    }
}
