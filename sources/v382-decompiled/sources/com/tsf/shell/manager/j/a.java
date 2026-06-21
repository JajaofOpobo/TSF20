package com.tsf.shell.manager.j;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.f.o;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import com.tsf.shell.e.e.k;

/* loaded from: classes.dex */
public class a extends l {
    private static final int a = com.censivn.C3DEngine.b.b.a.b(72.0f);
    private static final int l = com.censivn.C3DEngine.b.b.a.b(15.0f);
    private static final int m = (a / 2) + l;
    private m d;
    private m e;
    private m f;
    private o g;
    private TextureElement i = new TextureElement(0, false);
    private TextureElement j = new TextureElement(0, false);
    private TextureElement k = new TextureElement(0, false);
    private l b = new l();
    private l c = new l();
    private k h = new k();

    public a() {
        this.h.a(3);
        this.d = new m(a, a, false);
        this.d.textures().addElement(this.i);
        this.d.setDefaultColor(new Color4(-2236963));
        this.e = new m(a, a, false);
        this.e.textures().addElement(this.j);
        this.f = new m(a, a, false);
        this.f.textures().addElement(this.k);
        this.g = new o();
        this.g.d(60);
        this.g.e(-2236963);
        this.g.b(true);
        this.g.c(R.string.text_excellent);
        this.g.b(1);
        this.g.b();
        this.g.position().x = m;
        this.h.addChild(this.g);
        this.c.addChild(this.d);
        this.c.addChild(this.e);
        this.c.addChild(this.f);
        addChild(this.b);
        this.b.position().x = f();
        this.b.addChild(this.h);
        this.b.addChild(this.c);
        e();
    }

    private void e() {
        this.h.a(this.g.maxX() + l + a, this.g.maxY() - this.g.minY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float f() {
        return ((-((this.g.maxX() + a) + l)) / 2.0f) + (a / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.g.c(i);
        this.g.b();
        e();
    }

    public void a() {
        x xVar = new x();
        xVar.h(com.censivn.C3DEngine.b.b.a.a(-20.0f));
        w.a(this.e);
        w.a(this.e, VEasing.Linear.easeNone, xVar);
        x xVar2 = new x() { // from class: com.tsf.shell.manager.j.a.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.a(R.string.text_why);
                x xVar3 = new x();
                xVar3.f(a.m);
                w.a(a.this.g);
                w.a(a.this.g, VEasing.Linear.easeNone, xVar3);
                x xVar4 = new x();
                xVar4.f(a.this.f());
                w.a(a.this.b);
                w.a(a.this.b, VEasing.Linear.easeNone, xVar4);
            }
        };
        xVar2.f(-this.g.maxX());
        w.a(this.g);
        w.a(this.g, VEasing.Linear.easeNone, xVar2);
        x xVar3 = new x() { // from class: com.tsf.shell.manager.j.a.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                x xVar4 = new x();
                xVar4.e(180.0f);
                w.a(a.this.c);
                w.a(a.this.c, VEasing.Linear.easeNone, xVar4);
            }
        };
        xVar3.h(com.censivn.C3DEngine.b.b.a.a(25.0f));
        w.a(this.f);
        w.a(this.f, VEasing.Linear.easeNone, xVar3);
    }

    public void b() {
        x xVar = new x();
        xVar.h(0.0f);
        w.a(this.e);
        w.a(this.e, VEasing.Linear.easeNone, xVar);
        x xVar2 = new x() { // from class: com.tsf.shell.manager.j.a.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.a(R.string.text_excellent);
                x xVar3 = new x();
                xVar3.f(a.m);
                w.a(a.this.g);
                w.a(a.this.g, VEasing.Linear.easeNone, xVar3);
                x xVar4 = new x();
                xVar4.f(a.this.f());
                w.a(a.this.b);
                w.a(a.this.b, VEasing.Linear.easeNone, xVar4);
            }
        };
        xVar2.f(-this.g.maxX());
        w.a(this.g);
        w.a(this.g, VEasing.Linear.easeNone, xVar2);
        x xVar3 = new x() { // from class: com.tsf.shell.manager.j.a.4
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                x xVar4 = new x();
                xVar4.e(0.0f);
                w.a(a.this.c);
                w.a(a.this.c, VEasing.Linear.easeNone, xVar4);
            }
        };
        xVar3.h(0.0f);
        w.a(this.f);
        w.a(this.f, VEasing.Linear.easeNone, xVar3);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.i.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.i, R.drawable.rate_face);
            com.censivn.C3DEngine.a.g().a(this.j, R.drawable.rate_face_eyes);
            com.censivn.C3DEngine.a.g().a(this.k, R.drawable.rate_face_mouth);
        }
    }

    public void c() {
        if (this.i.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.i);
            com.censivn.C3DEngine.a.g().a(this.j);
            com.censivn.C3DEngine.a.g().a(this.k);
        }
    }
}
