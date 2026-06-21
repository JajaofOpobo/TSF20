package com.tsf.shell.e.e;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;

/* loaded from: classes.dex */
class y extends com.censivn.C3DEngine.b.f.b.a {
    private int a;
    private DynamicTextureElement d;
    private y e;
    private com.censivn.C3DEngine.b.f.m f;
    private com.censivn.C3DEngine.b.f.m g;
    private com.censivn.C3DEngine.b.f.m h;
    private com.censivn.C3DEngine.b.f.m i;
    private com.censivn.C3DEngine.b.g.b.b j;
    private int k;
    private float l;
    private float m;
    private boolean n;

    public y(float f, float f2, com.censivn.C3DEngine.b.f.b.b bVar) {
        super(f, f2, bVar);
        this.k = 3;
        this.l = 1.0f;
        this.m = 1.0f;
        this.n = false;
        this.e = this;
        this.j = new com.censivn.C3DEngine.b.g.b.b();
        this.d = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON, 64, 64);
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.e.y.1
            @Override // java.lang.Runnable
            public void run() {
                y.this.a = y.this.d.id;
            }
        };
        this.d.setReloadThemeRunnable(runnable);
        runnable.run();
        textures().addElement(c.g);
        this.f = c(0);
        this.g = c(1);
        this.h = c(2);
        this.i = c(3);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this));
        mouseSkip(true);
        b(0);
    }

    public int a(com.censivn.C3DEngine.b.f.j jVar) {
        Number3d.TEMPNUMBER3D3.reset();
        Number3d localToGlobal = this.f.localToGlobal(Number3d.TEMPNUMBER3D3);
        Number3d.TEMPNUMBER3D3.reset();
        Number3d localToGlobal2 = this.g.localToGlobal(Number3d.TEMPNUMBER3D3);
        Number3d.TEMPNUMBER3D3.reset();
        Number3d localToGlobal3 = this.h.localToGlobal(Number3d.TEMPNUMBER3D3);
        Number3d.TEMPNUMBER3D3.reset();
        Number3d localToGlobal4 = this.i.localToGlobal(Number3d.TEMPNUMBER3D3);
        float[] fArr = {localToGlobal.x, localToGlobal2.x, localToGlobal3.x, localToGlobal4.x};
        float[] fArr2 = {localToGlobal.y, localToGlobal2.y, localToGlobal3.y, localToGlobal4.y};
        Number3d.TEMPNUMBER3D3.reset();
        Number3d localToGlobal5 = jVar.localToGlobal(Number3d.TEMPNUMBER3D3);
        float f = localToGlobal5.x;
        float f2 = localToGlobal5.y;
        float f3 = 2.1474836E9f;
        float f4 = -2.1474836E9f;
        float f5 = 2.1474836E9f;
        float f6 = -2.1474836E9f;
        int i = 0;
        while (i < 4) {
            float f7 = fArr[i];
            float f8 = fArr2[i];
            if (f7 > f4) {
                f4 = f7;
            }
            if (f7 >= f3) {
                f7 = f3;
            }
            if (f8 > f6) {
                f6 = f8;
            }
            if (f8 >= f5) {
                f8 = f5;
            }
            i++;
            f3 = f7;
            f5 = f8;
        }
        if (f == f4) {
            return 3;
        }
        if (f == f3) {
            return 2;
        }
        if (f2 == f5) {
            return 1;
        }
        if (f2 == f6) {
            return 0;
        }
        return 0;
    }

    private void b(int i) {
        switch (i) {
            case 0:
                textures().removeAll();
                textures().addElement(c.g);
                this.d.id = this.a;
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onKillFocus() {
        x.a.d();
    }

    private com.censivn.C3DEngine.b.f.m c(int i) {
        com.censivn.C3DEngine.b.f.m mVar = new com.censivn.C3DEngine.b.f.m(64.0f, 64.0f);
        switch (i) {
            case 0:
                mVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                mVar.calAABB();
                break;
            case 1:
                mVar.rotation().z = 180.0f;
                mVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                mVar.calAABB();
                break;
            case 2:
                mVar.rotation().z = 90.0f;
                mVar.moveAllPointsSP(0.0f, -33.0f, 0.0f);
                mVar.calAABB();
                break;
            case 3:
                mVar.rotation().z = 270.0f;
                mVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                mVar.calAABB();
                break;
        }
        mVar.maxY(mVar.maxY() + (70.0f * com.censivn.C3DEngine.b.b.a.b));
        mVar.minY(mVar.minY() + (38.0f * com.censivn.C3DEngine.b.b.a.b));
        mVar.minX(mVar.minX() - (com.censivn.C3DEngine.b.b.a.b * 25.0f));
        mVar.maxX(mVar.maxX() + (com.censivn.C3DEngine.b.b.a.b * 25.0f));
        mVar.textures().addElement(this.d);
        mVar.setMouseEventListener(new z(this.e, this, mVar));
        addChild(mVar);
        return mVar;
    }

    public void a(final float f, final float f2, final float f3, final float f4) {
        i(f * 2.0f);
        g(f2 * 2.0f);
        c(f4 * 2.0f);
        e(f3 * 2.0f);
        this.e.updatePointsVBO();
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.y.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f5) {
                float f6 = f + (f * (1.0f - f5));
                float f7 = f2 + (f2 * (1.0f - f5));
                float f8 = (f4 * (1.0f - f5)) + f4;
                float f9 = f3 + (f3 * (1.0f - f5));
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                float f10 = f9 >= 0.0f ? f9 : 0.0f;
                y.this.i(f6);
                y.this.g(f7);
                y.this.c(f8);
                y.this.e(f10);
                y.this.g();
                y.this.e.updatePointsVBO();
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar.a(com.censivn.C3DEngine.b.g.a.a);
        com.censivn.C3DEngine.b.g.w.a(this.j);
        com.censivn.C3DEngine.b.g.w.a(this.j, 250, xVar);
    }

    public void g() {
        PositionNumber3d position = this.h.position();
        PositionNumber3d position2 = this.i.position();
        float a = (a() - d()) / 2.0f;
        position2.y = a;
        position.y = a;
    }

    @Override // com.censivn.C3DEngine.b.f.b.a
    public void i(float f) {
        super.j(f);
        this.h.position().x = (-f) + this.k;
    }

    @Override // com.censivn.C3DEngine.b.f.b.a
    public void g(float f) {
        super.h(f);
        this.i.position().x = (f - this.k) - 3.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.b.a
    public void c(float f) {
        super.d(f);
        this.f.position().y = (f - this.k) - 1.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.b.a
    public void e(float f) {
        super.f(f);
        this.g.position().y = (-f) + this.k + 1.0f;
    }

    public void h() {
    }

    public void i() {
        this.n = false;
        setAnimationObjectState(false);
    }

    public void j() {
        com.tsf.shell.e.i.c cVar;
        cVar = x.d;
        float u = cVar.u();
        this.m = u;
        this.l = u;
        this.n = true;
        setAnimationObjectState(true);
        com.censivn.C3DEngine.b.g.w.a(this.j);
    }

    public void a(int i) {
        this.n = false;
    }

    public void k(float f) {
        this.l = f;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        com.tsf.shell.e.i.c cVar;
        com.tsf.shell.e.i.c cVar2;
        com.tsf.shell.e.i.c cVar3;
        com.tsf.shell.e.i.c cVar4;
        com.tsf.shell.e.i.c cVar5;
        com.tsf.shell.e.i.c cVar6;
        com.tsf.shell.e.i.c cVar7;
        com.tsf.shell.e.i.c cVar8;
        com.tsf.shell.e.i.c cVar9;
        if (this.n || getAnimationObjectState()) {
            float f = this.l;
            cVar = x.d;
            if (f > cVar.V()) {
                cVar9 = x.d;
                this.l = cVar9.V();
            } else {
                float f2 = this.l;
                cVar2 = x.d;
                if (f2 < cVar2.U()) {
                    cVar3 = x.d;
                    this.l = cVar3.U();
                }
            }
            this.m += (this.l - this.m) * 0.2f;
            if (!this.n && Math.abs(this.m - this.l) < 0.005d) {
                setAnimationObjectState(false);
                this.m = this.l;
            }
            cVar4 = x.d;
            cVar4.a(this.m);
            cVar5 = x.d;
            i((-cVar5.minX()) * this.m);
            cVar6 = x.d;
            g(cVar6.maxX() * this.m);
            cVar7 = x.d;
            c(cVar7.maxY() * this.m);
            cVar8 = x.d;
            e((-cVar8.minY()) * this.m);
            g();
            this.e.updatePointsVBO();
        }
    }
}
