package com.tsf.shell.manager.r.b;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.utils.r;

/* loaded from: classes.dex */
class h extends g {
    protected com.tsf.shell.e.i.b.e.b b;
    public String c;
    public Intent d;
    public ActivityInfo e;
    public TextureElement f;
    final /* synthetic */ f g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(f fVar) {
        super(fVar);
        this.g = fVar;
        this.f = new TextureElement(0, false);
    }

    @Override // com.tsf.shell.manager.r.b.g
    public com.tsf.shell.e.i.b.e.b a(com.censivn.C3DEngine.b.f.j jVar) {
        if (this.b == null) {
            this.b = new com.tsf.shell.e.i.b.e.j();
            this.b.k.textures().addElement(this.f);
        }
        if (this.f.id == 0) {
            Bitmap a = com.tsf.shell.manager.o.b.c.a();
            Canvas canvas = new Canvas(a);
            canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
            Bitmap a2 = com.tsf.shell.manager.r.c.a.a(this.e);
            if (a2 != null) {
                a2 = r.a(a2, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I);
            }
            com.tsf.shell.manager.o.b.c.a(canvas, a2);
            Bitmap a3 = com.tsf.shell.manager.o.b.c.a(this.c);
            if (a3 != null) {
                com.tsf.shell.manager.o.b.c.b(canvas, a3, true);
            }
            com.censivn.C3DEngine.a.g().a(this.f, a);
        }
        return this.b;
    }

    @Override // com.tsf.shell.manager.r.b.g
    public void b() {
        com.tsf.shell.manager.a.x.a.a(this.d, 0.0f, 0.0f, new com.tsf.shell.manager.l.b() { // from class: com.tsf.shell.manager.r.b.h.1
            @Override // com.tsf.shell.manager.l.b
            public void a(com.tsf.shell.e.i.b.e.b bVar) {
                h.this.g.b.b().a(bVar);
            }

            @Override // com.tsf.shell.manager.l.b
            public com.tsf.shell.manager.o.a a() {
                return com.tsf.shell.manager.o.b.b;
            }
        });
    }

    @Override // com.tsf.shell.manager.r.b.g
    public com.censivn.C3DEngine.b.f.j a() {
        com.tsf.shell.e.i.b.e.j jVar;
        com.tsf.shell.e.i.b.e.j jVar2;
        com.tsf.shell.e.i.b.e.j jVar3;
        jVar = this.g.m;
        jVar.k.textures().clear();
        jVar2 = this.g.m;
        jVar2.k.textures().addElement(this.f);
        jVar3 = this.g.m;
        return jVar3;
    }

    @Override // com.tsf.shell.manager.r.b.g
    public boolean b(MotionEvent motionEvent, g gVar, final com.censivn.C3DEngine.b.f.j jVar) {
        x xVar = new x() { // from class: com.tsf.shell.manager.r.b.h.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                jVar.removeFromParent();
                jVar.alpha(255.0f);
            }
        };
        xVar.a(0);
        w.a(jVar);
        w.a(jVar, 250, xVar);
        com.tsf.shell.manager.a.x.a.a(this.d, jVar.position().x, jVar.position().y);
        return true;
    }

    @Override // com.tsf.shell.manager.r.b.g
    public void a(g gVar) {
        com.tsf.shell.manager.a.x.a.a(this.d, 0.0f, this.g.b.getScreenFreeSpaceCenter());
    }

    @Override // com.tsf.shell.manager.r.b.g
    public void c() {
        com.censivn.C3DEngine.a.g().a(this.f);
    }
}
