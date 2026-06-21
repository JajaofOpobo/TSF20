package com.tsf.shell.e.f.a.c;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class h extends i {
    private com.censivn.C3DEngine.b.h.d.b c;
    private boolean d = false;
    private TextureElement a = x.b(R.drawable.drawer_layout_homescreen_countdown);
    private com.censivn.C3DEngine.b.f.m b = com.censivn.C3DEngine.b.b.a.a(180.0f, 180.0f);

    public h() {
        this.b.textures().addElement(this.a);
        com.tsf.shell.manager.o.c.a(this.b, com.tsf.shell.manager.o.c.h);
        addChild(this.b);
        calAABB();
        this.c = new com.censivn.C3DEngine.b.h.d.b(com.censivn.C3DEngine.b.b.a.a(182.0f), R.drawable.ring);
        com.tsf.shell.manager.o.c.a(this.c, com.tsf.shell.manager.o.c.h);
        addChild(this.c);
    }

    public void b() {
    }

    public void c() {
        this.c.e();
        this.c.b(0.0f);
        this.d = false;
    }

    public void d() {
        if (!this.d) {
            this.d = true;
            this.c.a(360.0f, 1500, new Runnable() { // from class: com.tsf.shell.e.f.a.c.h.1
                @Override // java.lang.Runnable
                public void run() {
                    h.this.b();
                }
            });
        }
    }

    public void e() {
        if (this.d) {
            this.d = false;
            this.c.a(0.0f, 500);
        }
    }
}
