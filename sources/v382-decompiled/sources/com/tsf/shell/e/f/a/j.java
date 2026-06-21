package com.tsf.shell.e.f.a;

import android.opengl.GLES20;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import com.tsf.shell.e.f.a.c.p;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j extends com.censivn.C3DEngine.b.f.l implements com.censivn.C3DEngine.b.c.d {
    public static float a;
    public static float b;
    public static float c;
    public static float d;
    private m e;
    private com.tsf.shell.e.f.a.c.j f;
    private com.tsf.shell.e.f.a.c.j h;
    private com.tsf.shell.e.f.a.c.j i;
    private com.tsf.shell.e.f.a.c.j j;
    private com.tsf.shell.e.f.a.c.g k;
    private com.tsf.shell.e.f.a.c.l l;
    private boolean q = false;
    private com.censivn.C3DEngine.b.g.b.b r = new com.censivn.C3DEngine.b.g.b.b();
    private ArrayList g = new ArrayList();
    private com.censivn.C3DEngine.b.f.l m = new com.censivn.C3DEngine.b.f.l();
    private com.censivn.C3DEngine.b.f.l n = new com.censivn.C3DEngine.b.f.l();
    private com.censivn.C3DEngine.b.f.l o = new com.censivn.C3DEngine.b.f.l();
    private com.censivn.C3DEngine.b.f.i p = new com.censivn.C3DEngine.b.f.i(com.censivn.C3DEngine.b.b.a.D, m.F * 2.0f, false, true) { // from class: com.tsf.shell.e.f.a.j.1
        @Override // com.censivn.C3DEngine.b.f.i, com.censivn.C3DEngine.b.f.j
        public void draw() {
            com.censivn.C3DEngine.a.e().a(this);
            updateTextureState();
            ShaderColor shaderColor = ShaderManager.SHADER_COLOR;
            ShaderManager.enableShader(shaderColor);
            float alpha = (alpha() / 255.0f) * 0.7f;
            vertices().colors().set(2, 0.0f, 0.0f, 0.0f, 0.0f);
            vertices().colors().set(3, 0.0f, 0.0f, 0.0f, 0.0f);
            vertices().colors().set(0, 0.0f, 0.0f, 0.0f, alpha);
            vertices().colors().set(1, 0.0f, 0.0f, 0.0f, alpha);
            vertices().colors().buffer().position(0);
            GLES20.glEnableVertexAttribArray(shaderColor.maColor4Handle);
            GLES20.glVertexAttribPointer(shaderColor.maColor4Handle, 4, 5126, false, 0, (Buffer) vertices().colors().buffer());
            if (doubleSidedEnabled()) {
                GLES20.glDisable(2884);
            } else {
                GLES20.glEnable(2884);
            }
            drawMVPMatrix();
            drawElement();
            GLES20.glDisableVertexAttribArray(shaderColor.maColor4Handle);
            a();
        }
    };

    public void a(int i) {
        switch (i) {
            case 0:
                a(this.h, true);
                break;
            case 1:
                b(this.i);
                break;
            case 2:
                b(this.j);
                break;
            case 3:
                b(this.k);
                break;
            case 4:
                b(this.l);
                break;
        }
    }

    public void a() {
        if (this.l != null) {
            this.l.c();
        }
    }

    public com.tsf.shell.e.f.a.c.j b() {
        return this.h;
    }

    public com.tsf.shell.e.f.a.c.j c() {
        return this.f;
    }

    public j(m mVar) {
        this.e = mVar;
        this.p.moveAllPointsPX(0.0f, (m.F * 2.0f) / 2.0f, 0.0f);
        this.p.alpha(0.0f);
        this.p.position().y = -com.censivn.C3DEngine.b.b.a.K;
        this.m.addChild(this.p);
        this.m.addChild(this.o);
        this.m.addChild(this.n);
        g();
    }

    public void a(int i, int i2, int i3, int i4) {
        g();
    }

    public com.tsf.shell.e.f.a.c.g d() {
        return this.k;
    }

    public void e() {
        final float alpha = this.n.alpha();
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.j.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                j.this.n.alpha(alpha + ((0.0f - alpha) * f));
            }
        };
        this.n.mouseEnabled(false);
        w.a(this.r);
        w.a(this.r, VEasing.Linear.easeNone, xVar);
    }

    public void f() {
        final float alpha = this.n.alpha();
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.j.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                j.this.n.alpha(alpha + ((255.0f - alpha) * f));
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                j.this.n.mouseEnabled(true);
            }
        };
        w.a(this.r);
        w.a(this.r, VEasing.Linear.easeNone, xVar);
    }

    public void g() {
        b = 90.0f * com.censivn.C3DEngine.b.b.a.c;
        a = m.F - (120.0f * com.censivn.C3DEngine.b.b.a.c);
        position().y = com.censivn.C3DEngine.b.b.a.C;
        this.p.a(com.censivn.C3DEngine.b.b.a.D);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.e.f.a.c.j) it.next()).a(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B);
        }
    }

    public com.censivn.C3DEngine.b.f.l h() {
        return this.o;
    }

    public void i() {
        this.n.position().y = (-m.F) / 2.0f;
        this.h = new com.tsf.shell.e.f.a.c.c(this.e, this);
        this.i = new com.tsf.shell.e.f.a.c.e(this.e, this);
        this.j = new p(this.e, this);
        this.k = new com.tsf.shell.e.f.a.c.g(this.e, this);
        this.l = new com.tsf.shell.e.f.a.c.l(this.e, this);
        this.g.add(this.i);
        this.g.add(this.j);
        this.g.add(this.k);
        this.g.add(this.h);
        this.g.add(this.l);
        position().y = com.censivn.C3DEngine.b.b.a.C;
        d = 200.0f * com.censivn.C3DEngine.b.b.a.c;
        c = ((-d) * (this.g.size() - 1)) / 2.0f;
    }

    public void j() {
        n();
    }

    public void k() {
        o();
    }

    private void n() {
        this.m.removeFromParent();
        addChild(this.m);
        final float alpha = this.n.alpha();
        final float f = this.n.position().y;
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.j.4
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f2) {
                j.this.n.alpha(alpha + ((255.0f - alpha) * f2));
                if (!j.this.q) {
                    j.this.n.position().y = f + (((m.F / 2.0f) - f) * f2);
                }
            }
        };
        xVar.a(com.censivn.C3DEngine.b.g.a.n);
        w.a(this.r);
        w.a(this.r, 800, xVar);
        x xVar2 = new x();
        xVar2.a(255);
        xVar2.a(com.censivn.C3DEngine.b.g.a.n);
        w.a(this.p);
        w.a(this.p, 800, xVar2);
        float f2 = c;
        if (this.n.numChildren() == 0) {
            Iterator it = this.g.iterator();
            while (true) {
                float f3 = f2;
                if (!it.hasNext()) {
                    break;
                }
                com.censivn.C3DEngine.b.f.a.a e = ((com.tsf.shell.e.f.a.c.j) it.next()).e();
                e.position().x = f3;
                e.removeFromParent();
                this.n.addChild(e);
                f2 = d + f3;
            }
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((com.tsf.shell.e.f.a.c.j) it2.next()).n();
        }
    }

    public boolean l() {
        return (this.f == null ? true : this.f.l()) && this.e.ao().g();
    }

    private void o() {
        m();
        final float alpha = this.n.alpha();
        final float f = this.n.position().y;
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.j.5
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f2) {
                j.this.n.alpha(alpha + ((0.0f - alpha) * f2));
                j.this.n.position().y = f + ((((-m.F) / 2.0f) - f) * f2);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                j.this.m.removeFromParent();
                Iterator it = j.this.g.iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.e.f.a.c.j) it.next()).p();
                }
            }
        };
        w.a(this.r);
        w.a(this.r, VEasing.Linear.easeNone, xVar);
        x xVar2 = new x();
        xVar2.a(0);
        w.a(this.p);
        w.a(this.p, VEasing.Linear.easeNone, xVar2);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.e.f.a.c.j) it.next()).o();
        }
    }

    public void m() {
        if (this.f != null && this.f.l()) {
            q();
            this.f.i();
            this.f = null;
        }
    }

    private void p() {
        if (!this.q) {
            this.q = true;
            com.censivn.C3DEngine.b.c.c.a(this);
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                com.tsf.shell.e.f.a.c.j jVar = (com.tsf.shell.e.f.a.c.j) it.next();
                jVar.g();
                jVar.k();
            }
            x xVar = new x();
            xVar.h(m.F - b);
            xVar.l(0.6f);
            xVar.m(0.6f);
            w.a(this.n);
            w.a(this.n, VEasing.Linear.easeNone, xVar);
        }
    }

    private void q() {
        if (this.q) {
            this.q = false;
            com.censivn.C3DEngine.b.c.c.b(this);
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                com.tsf.shell.e.f.a.c.j jVar = (com.tsf.shell.e.f.a.c.j) it.next();
                jVar.f();
                jVar.j();
            }
            x xVar = new x();
            xVar.h(m.F / 2.0f);
            xVar.l(1.0f);
            xVar.m(1.0f);
            xVar.a(255);
            this.n.mouseEnabled(true);
            w.a(this.n);
            w.a(this.n, VEasing.Linear.easeNone, xVar);
        }
    }

    private boolean b(com.tsf.shell.e.f.a.c.j jVar) {
        return a(jVar, false);
    }

    private boolean a(com.tsf.shell.e.f.a.c.j jVar, boolean z) {
        if (jVar == this.f) {
            return false;
        }
        p();
        if (this.f != null) {
            this.f.i();
            this.f.k();
        }
        this.f = jVar;
        this.f.c(z);
        if (z) {
            this.f.h();
        }
        this.f.j();
        return true;
    }

    public boolean a(com.tsf.shell.e.f.a.c.j jVar) {
        return a(jVar, true);
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        if (this.f != null) {
            this.f.a(eVar, motionEvent);
        }
    }

    public void b(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        if (this.f != null) {
            this.f.b(eVar, motionEvent);
        }
    }

    public void c(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        this.h.c(eVar, motionEvent);
        if (this.f != this.h && this.f != this.k) {
            b(this.h);
        }
    }

    public void d(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        if (this.f == null) {
            b(this.h);
        }
        if (this.f != null) {
            this.f.d(eVar, motionEvent);
        }
    }

    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.f != null) {
            this.f.a(eVar, motionEvent, motionEvent2);
        }
    }

    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f != null) {
            this.f.a(eVar, motionEvent, motionEvent2, f, f2);
        }
    }

    public void b(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f != null) {
            this.f.b(eVar, motionEvent, motionEvent2, f, f2);
        }
    }

    public void e(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        if (eVar instanceof com.tsf.shell.e.i.b.d.b) {
            ((com.tsf.shell.e.i.b.d.b) eVar).aR();
            return;
        }
        if (this.f != this.k && this.f != this.h) {
            this.h.e(eVar, motionEvent);
            b(this.h);
        } else if (this.f != null) {
            this.f.e(eVar, motionEvent);
        }
    }
}
