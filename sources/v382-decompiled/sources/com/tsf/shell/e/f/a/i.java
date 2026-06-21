package com.tsf.shell.e.f.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.e.e.n;

/* loaded from: classes.dex */
class i extends com.censivn.C3DEngine.b.f.m {
    private static n e;
    private TextureElement a;
    private int d;
    private boolean f;
    private com.tsf.shell.manager.p.g g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(int i) {
        super(r0, r1, false);
        int i2;
        int i3;
        i2 = h.d;
        i3 = h.d;
        this.a = new TextureElement(0, false);
        this.d = 0;
        this.f = false;
        textures().addElement(this.a);
        calAABB(1.2f, 1.2f, 1.0f);
        this.d = i;
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.e.f.a.i.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (i.this.g != null) {
                    i.this.g.b();
                }
                i.this.a();
            }
        });
    }

    public void a(int i) {
        this.g = com.tsf.shell.manager.a.a.a(i);
        if (this.g.a()) {
            d();
            this.g.a(new com.tsf.shell.manager.p.h() { // from class: com.tsf.shell.e.f.a.i.2
                @Override // com.tsf.shell.manager.p.h
                public void a() {
                    i.this.e();
                }
            });
        }
    }

    public void a() {
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        int i;
        int i2;
        if (this.a.id == 0) {
            com.censivn.C3DEngine.b.c.m g = com.censivn.C3DEngine.a.g();
            TextureElement textureElement = this.a;
            int i3 = this.d;
            i = h.d;
            i2 = h.d;
            g.a(textureElement, i3, i, i2);
        }
    }

    public void d() {
        if (e == null) {
            e = new n();
            e.position().x = com.censivn.C3DEngine.b.b.a.a(50.0f);
            e.position().y = com.censivn.C3DEngine.b.b.a.a(50.0f);
        }
        this.f = true;
    }

    public void e() {
        this.f = false;
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        if (this.f) {
            e.dispatchDraw();
        }
    }
}
