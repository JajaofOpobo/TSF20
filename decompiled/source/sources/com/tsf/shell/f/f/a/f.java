package com.tsf.shell.f.f.a;

import android.opengl.GLES20;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import com.tsf.shell.f.f.a.c.i;
import com.tsf.shell.f.f.a.c.k;
import com.tsf.shell.f.f.a.c.m;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class f extends j implements b.a {
    public static float a;
    public static float b;
    public static float c;
    public static float d;
    private h e;
    private i f;
    private i h;
    private i i;
    private i j;
    private com.tsf.shell.f.f.a.c.f k;
    private k l;
    private boolean q = false;
    private com.censivn.C3DEngine.b.g.b.b r = new com.censivn.C3DEngine.b.g.b.b();
    private ArrayList<i> g = new ArrayList<>();
    private j m = new j();
    private j n = new j();
    private j o = new j();
    private com.censivn.C3DEngine.b.f.h p = new com.censivn.C3DEngine.b.f.h(com.censivn.C3DEngine.b.b.a.D, h.F * 2.0f, false, true) { // from class: com.tsf.shell.f.f.a.f.1
        @Override // com.censivn.C3DEngine.b.f.h, com.censivn.C3DEngine.b.f.i
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
                return;
            case 1:
                b(this.i);
                return;
            case 2:
                b(this.j);
                return;
            case 3:
                b(this.k);
                return;
            case 4:
                b(this.l);
                return;
            default:
                return;
        }
    }

    public void a() {
        if (this.l != null) {
            this.l.c();
        }
    }

    public i b() {
        return this.h;
    }

    public i c() {
        return this.f;
    }

    public f(h hVar) {
        this.e = hVar;
        this.p.moveAllPointsPX(0.0f, (h.F * 2.0f) / 2.0f, 0.0f);
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

    public com.tsf.shell.f.f.a.c.f d() {
        return this.k;
    }

    public void e() {
        final float alpha = this.n.alpha();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.f.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                f.this.n.alpha(alpha + ((0.0f - alpha) * f));
            }
        };
        this.n.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.c.a(this.r);
        com.censivn.C3DEngine.b.g.c.a(this.r, VEasing.Linear.easeNone, dVar);
    }

    public void f() {
        final float alpha = this.n.alpha();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.f.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                f.this.n.alpha(alpha + ((255.0f - alpha) * f));
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                f.this.n.mouseEnabled(true);
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.r);
        com.censivn.C3DEngine.b.g.c.a(this.r, VEasing.Linear.easeNone, dVar);
    }

    public void g() {
        b = 90.0f * com.censivn.C3DEngine.b.b.a.c;
        a = h.F - (120.0f * com.censivn.C3DEngine.b.b.a.c);
        position().y = com.censivn.C3DEngine.b.b.a.C;
        this.p.a(com.censivn.C3DEngine.b.b.a.D);
        Iterator<i> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().a(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B);
        }
    }

    public j h() {
        return this.o;
    }

    public void i() {
        this.n.position().y = (-h.F) / 2.0f;
        this.h = new com.tsf.shell.f.f.a.c.c(this.e, this);
        this.i = new com.tsf.shell.f.f.a.c.d(this.e, this);
        this.j = new m(this.e, this);
        this.k = new com.tsf.shell.f.f.a.c.f(this.e, this);
        this.l = new k(this.e, this);
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
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.f.4
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
                f.this.n.alpha(alpha + ((255.0f - alpha) * f2));
                if (!f.this.q) {
                    f.this.n.position().y = f + (((h.F / 2.0f) - f) * f2);
                }
            }
        };
        dVar.a(com.censivn.C3DEngine.b.g.a.n);
        com.censivn.C3DEngine.b.g.c.a(this.r);
        com.censivn.C3DEngine.b.g.c.a(this.r, 800, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(255);
        dVar2.a(com.censivn.C3DEngine.b.g.a.n);
        com.censivn.C3DEngine.b.g.c.a(this.p);
        com.censivn.C3DEngine.b.g.c.a(this.p, 800, dVar2);
        float f2 = c;
        if (this.n.numChildren() == 0) {
            Iterator<i> it = this.g.iterator();
            while (true) {
                float f3 = f2;
                if (!it.hasNext()) {
                    break;
                }
                com.censivn.C3DEngine.b.f.a.a e = it.next().e();
                e.position().x = f3;
                e.removeFromParent();
                this.n.addChild(e);
                f2 = d + f3;
            }
        }
        Iterator<i> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().n();
        }
    }

    public boolean l() {
        return (this.f == null ? true : this.f.l()) && this.e.ao().g();
    }

    private void o() {
        m();
        final float alpha = this.n.alpha();
        final float f = this.n.position().y;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.f.5
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
                f.this.n.alpha(alpha + ((0.0f - alpha) * f2));
                f.this.n.position().y = f + ((((-h.F) / 2.0f) - f) * f2);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                f.this.m.removeFromParent();
                Iterator it = f.this.g.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).p();
                }
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.r);
        com.censivn.C3DEngine.b.g.c.a(this.r, VEasing.Linear.easeNone, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.p);
        com.censivn.C3DEngine.b.g.c.a(this.p, VEasing.Linear.easeNone, dVar2);
        Iterator<i> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().o();
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
            com.censivn.C3DEngine.b.c.b.a(this);
            Iterator<i> it = this.g.iterator();
            while (it.hasNext()) {
                i next = it.next();
                next.g();
                next.k();
            }
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.h(h.F - b);
            dVar.l(0.6f);
            dVar.m(0.6f);
            com.censivn.C3DEngine.b.g.c.a(this.n);
            com.censivn.C3DEngine.b.g.c.a(this.n, VEasing.Linear.easeNone, dVar);
        }
    }

    private void q() {
        if (this.q) {
            this.q = false;
            com.censivn.C3DEngine.b.c.b.b(this);
            Iterator<i> it = this.g.iterator();
            while (it.hasNext()) {
                i next = it.next();
                next.f();
                next.j();
            }
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.h(h.F / 2.0f);
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.a(255);
            this.n.mouseEnabled(true);
            com.censivn.C3DEngine.b.g.c.a(this.n);
            com.censivn.C3DEngine.b.g.c.a(this.n, VEasing.Linear.easeNone, dVar);
        }
    }

    private boolean b(i iVar) {
        return a(iVar, false);
    }

    private boolean a(i iVar, boolean z) {
        if (iVar != this.f) {
            p();
            if (this.f != null) {
                this.f.i();
                this.f.k();
            }
            this.f = iVar;
            this.f.c(z);
            if (z) {
                this.f.h();
            }
            this.f.j();
            return true;
        }
        return false;
    }

    public boolean a(i iVar) {
        return a(iVar, true);
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public void a(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        if (this.f != null) {
            this.f.a(cVar, motionEvent);
        }
    }

    public void b(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        if (this.f != null) {
            this.f.b(cVar, motionEvent);
        }
    }

    public void c(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        this.h.c(cVar, motionEvent);
        if (this.f != this.h && this.f != this.k) {
            b(this.h);
        }
    }

    public void d(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        if (this.f == null) {
            b(this.h);
        }
        if (this.f != null) {
            this.f.d(cVar, motionEvent);
        }
    }

    public void a(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.f != null) {
            this.f.a(cVar, motionEvent, motionEvent2);
        }
    }

    public void a(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f != null) {
            this.f.a(cVar, motionEvent, motionEvent2, f, f2);
        }
    }

    public void b(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f != null) {
            this.f.b(cVar, motionEvent, motionEvent2, f, f2);
        }
    }

    public void e(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        if (cVar instanceof com.tsf.shell.f.i.b.d.b) {
            ((com.tsf.shell.f.i.b.d.b) cVar).aR();
        } else if (this.f != this.k && this.f != this.h) {
            this.h.e(cVar, motionEvent);
            b(this.h);
        } else if (this.f != null) {
            this.f.e(cVar, motionEvent);
        }
    }
}
