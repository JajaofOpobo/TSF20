package com.tsf.shell.f.f.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
/* loaded from: classes.dex */
public class e extends com.censivn.C3DEngine.b.b.c {
    private static final int h = com.censivn.C3DEngine.b.b.a.b(160.0f);
    private j c;
    private k d;
    private k e;
    private c i;
    private TextureElement f = new TextureElement(0, false);
    private TextureElement g = new TextureElement(0, false);
    private j a = new j();
    private k b = new k(com.censivn.C3DEngine.b.b.a.D, 120.0f * com.censivn.C3DEngine.b.b.a.c, false);

    public e(c cVar) {
        this.i = cVar;
        this.b.setDefaultColor(new Color4(255, 255, 255, 60));
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.tsf.shell.f.f.a.a.e.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.a.d.a(7, true);
            }
        });
        this.a.addChild(this.b);
        this.c = new j();
        this.a.addChild(this.c);
        this.d = new k(com.tsf.shell.manager.g.a.j, com.tsf.shell.manager.g.a.j, false) { // from class: com.tsf.shell.f.f.a.a.e.2
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (e.this.f.id == 0) {
                    com.censivn.C3DEngine.a.g().a(e.this.f, b.d.drawer_top_menu_button_voice_search);
                }
            }
        };
        this.d.textures().addElement(this.f);
        this.d.calAABB();
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.d) { // from class: com.tsf.shell.f.f.a.a.e.3
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.a.d.a(8, true);
            }
        });
        this.e = new k(com.censivn.C3DEngine.b.b.a.a(170.0f), com.censivn.C3DEngine.b.b.a.a(61.0f), false) { // from class: com.tsf.shell.f.f.a.a.e.4
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (e.this.g.id == 0) {
                    com.censivn.C3DEngine.a.g().a(e.this.g, b.d.allapps_google_icon);
                }
            }
        };
        this.e.position().y = com.censivn.C3DEngine.b.b.a.a(-5.0f);
        this.e.textures().addElement(this.g);
        this.c.addChild(this.e);
        this.c.addChild(this.d);
        addChild(this.a);
        this.a.position().y = -com.censivn.C3DEngine.b.b.a.a(100.0f);
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        this.e.position().x = ((-i) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(40.0f) + (this.e.b() / 2.0f);
        this.d.position().x = (i / 2.0f) - com.tsf.shell.manager.g.a.j;
        this.b.a(i);
        d(h);
        this.b.calAABB();
    }

    public void e() {
        com.censivn.C3DEngine.a.g().a(this.f);
        com.censivn.C3DEngine.a.g().a(this.g);
    }

    public void f() {
        this.a.position().y = (-com.censivn.C3DEngine.b.b.a.a(100.0f)) + c.a;
        this.a.alpha(0.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        dVar.a(com.censivn.C3DEngine.b.g.a.n);
        dVar.h(-com.censivn.C3DEngine.b.b.a.a(100.0f));
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 750, dVar);
    }
}
