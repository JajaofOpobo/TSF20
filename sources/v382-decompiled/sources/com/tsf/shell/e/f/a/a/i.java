package com.tsf.shell.e.f.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class i extends com.censivn.C3DEngine.b.b.c {
    private static final int h = com.censivn.C3DEngine.b.b.a.b(160.0f);
    private l c;
    private m d;
    private m e;
    private f i;
    private TextureElement f = new TextureElement(0, false);
    private TextureElement g = new TextureElement(0, false);
    private l a = new l();
    private m b = new m(com.censivn.C3DEngine.b.b.a.D, 120.0f * com.censivn.C3DEngine.b.b.a.c, false);

    public i(f fVar) {
        boolean z = false;
        this.i = fVar;
        this.b.setDefaultColor(new Color4(255, 255, 255, 60));
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.tsf.shell.e.f.a.a.i.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.a.d.a(7, true);
            }
        });
        this.a.addChild(this.b);
        this.c = new l();
        this.a.addChild(this.c);
        this.d = new m(com.tsf.shell.manager.g.a.j, com.tsf.shell.manager.g.a.j, z) { // from class: com.tsf.shell.e.f.a.a.i.2
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (i.this.f.id == 0) {
                    com.censivn.C3DEngine.a.g().a(i.this.f, R.drawable.drawer_top_menu_button_voice_search);
                }
            }
        };
        this.d.textures().addElement(this.f);
        this.d.calAABB();
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.d) { // from class: com.tsf.shell.e.f.a.a.i.3
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.a.d.a(8, true);
            }
        });
        this.e = new m(com.censivn.C3DEngine.b.b.a.a(170.0f), com.censivn.C3DEngine.b.b.a.a(61.0f), z) { // from class: com.tsf.shell.e.f.a.a.i.4
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (i.this.g.id == 0) {
                    com.censivn.C3DEngine.a.g().a(i.this.g, R.drawable.allapps_google_icon);
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
        this.a.position().y = (-com.censivn.C3DEngine.b.b.a.a(100.0f)) + f.a;
        this.a.alpha(0.0f);
        x xVar = new x();
        xVar.a(255);
        xVar.a(com.censivn.C3DEngine.b.g.a.n);
        xVar.h(-com.censivn.C3DEngine.b.b.a.a(100.0f));
        w.a(this.a);
        w.a(this.a, 750, xVar);
    }
}
