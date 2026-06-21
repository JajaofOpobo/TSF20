package com.censivn.C3DEngine.b.e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
class e extends com.censivn.C3DEngine.b.f.l {
    final /* synthetic */ c a;
    private com.censivn.C3DEngine.b.f.a.a b;
    private com.censivn.C3DEngine.b.f.o c = new com.censivn.C3DEngine.b.f.o();
    private com.censivn.C3DEngine.b.f.a.b d;
    private com.censivn.C3DEngine.b.f.a.b e;

    public e(c cVar) {
        this.a = cVar;
        this.c.d(50);
        this.c.position().x = c.a + com.censivn.C3DEngine.b.b.a.a(20.0f);
        this.c.b(1);
        this.b = new com.censivn.C3DEngine.b.f.a.a(2, c.a, c.a * 2, c.a);
        this.b.position().x = c.a / 2.0f;
        this.d = this.b.a(0);
        this.d.b(0, 0, 1, 1);
        this.d.h();
        this.e = this.b.a(1);
        this.e.b(1, 0, 1, 1);
        this.e.h();
        this.b.textures().addElement(c.b);
        addChild(this.b);
        addChild(this.c);
        b(false);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.e.e.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                e.this.a.a(e.this, true);
            }
        });
    }

    public void a(int i) {
        a(x.c(i));
    }

    public void a(String str) {
        this.c.a(str);
        this.c.b();
        setAABBPX(0.0f, ((-c.a) / 2.0f) * 1.5f, 0.0f, this.c.position().x + this.c.maxX() + com.censivn.C3DEngine.b.b.a.a(50.0f), 1.5f * (c.a / 2.0f), 0.0f);
        notifLayoutRefresh();
    }

    public void a() {
        a(true);
    }

    public void a(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.l(1.0f);
            xVar.m(1.0f);
            xVar.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(this.e);
            w.a(this.e, VEasing.Back.easeIn, xVar);
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
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.l(0.0f);
            xVar.m(0.0f);
            w.a(this.e);
            w.a(this.e, VEasing.Back.easeIn, xVar);
            return;
        }
        this.e.k().x = 0.0f;
        this.e.k().y = 0.0f;
        this.e.f();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (c.b.id == 0) {
            com.censivn.C3DEngine.a.g().a(c.b, R.drawable.preference_radio);
        }
    }
}
