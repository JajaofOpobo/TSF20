package com.tsf.shell.f.i.b.d;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private static Number3d i = new Number3d();
    private static Number3d j = new Number3d();
    private static Number3d k = new Number3d();
    private static float l;
    public ThemeFolderDescription a;
    public com.tsf.shell.f.a.a.a b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public d() {
        a();
    }

    private void b() {
        this.c = (int) (j.Q - j.P);
        this.d = (int) (j.S - j.R);
        this.e = (int) j.P;
        this.f = (int) j.R;
        this.g = (int) j.Q;
        this.h = (int) j.S;
    }

    public void a() {
        this.a = ThemeManager.mix.folder.getTheme().folder;
        b();
        if (this.b != null) {
            com.tsf.shell.manager.a.t.a(this.b);
        } else {
            this.b = com.tsf.shell.manager.a.t.a(this.c, this.d);
        }
    }

    public void a(b bVar) {
        if (bVar.u != null) {
            boolean z = bVar.x;
            if (z) {
                b(bVar);
            }
            if (bVar.y) {
                bVar.r.visible(false);
            }
            Color4 defaultColor = bVar.getDefaultColor();
            bVar.clearDefaultColor();
            i.setAllFrom(bVar.position());
            j.setAllFrom(bVar.rotation());
            k.setAllFrom(bVar.scale());
            l = bVar.alpha();
            boolean zVisible = bVar.visible();
            float fX = bVar.x();
            bVar.b(0.0f);
            bVar.position().setAll((-(this.e + this.g)) / 2.0f, (-(this.f + this.h)) / 2.0f, 0.0f);
            bVar.rotation().setAll(0.0f, 0.0f, 0.0f);
            bVar.scale().setAll(1.0f, 1.0f, 1.0f);
            bVar.alpha(255.0f);
            bVar.visible(true);
            com.tsf.shell.manager.a.t.b(this.b, bVar.u);
            GLES20.glViewport(0, 0, this.c, this.d);
            com.censivn.C3DEngine.a.e().a(this.c, this.d);
            if (bVar.visible()) {
                MatrixStack.glPushMatrix();
                bVar.draw();
                MatrixStack.glColor(bVar.alpha(), bVar.getDefaultColor());
                if (bVar.renderChildren()) {
                    int size = bVar.children().size();
                    for (int i2 = 0; i2 < size; i2++) {
                        com.censivn.C3DEngine.b.f.i iVar = bVar.children().get(i2);
                        if (!(iVar instanceof com.tsf.shell.f.i.b)) {
                            iVar.dispatchDraw();
                        }
                    }
                }
                MatrixStack.glPopMatrix();
            }
            com.tsf.shell.manager.a.t.b();
            GLES20.glViewport(0, 0, com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
            com.censivn.C3DEngine.a.e().a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
            bVar.position().setAllFrom(i);
            bVar.rotation().setAllFrom(j);
            bVar.b(fX);
            bVar.scale().setAllFrom(k);
            bVar.setDefaultColor(defaultColor);
            bVar.alpha(l);
            bVar.visible(Boolean.valueOf(zVisible));
            if (z) {
                c(bVar);
            }
        }
    }

    public void b(b bVar) {
        if (bVar.x) {
            bVar.x = false;
            d(bVar);
        }
    }

    public void c(b bVar) {
        if (!bVar.x) {
            bVar.x = true;
            e(bVar);
        }
    }

    public void d(b bVar) {
        bVar.o.visible(true);
        if (bVar.q != null) {
            bVar.q.visible(true);
        }
        if (bVar.p != null) {
            bVar.p.visible(true);
        }
        if (bVar.s != null) {
            bVar.s.visible(true);
        }
        if (!bVar.y) {
            bVar.r.visible(true);
        }
        bVar.t.visible(false);
    }

    public void e(b bVar) {
        bVar.o.visible(false);
        if (bVar.q != null) {
            bVar.q.visible(false);
        }
        if (bVar.p != null) {
            bVar.p.visible(false);
        }
        if (bVar.s != null) {
            bVar.s.visible(false);
        }
        bVar.r.visible(false);
        bVar.t.visible(true);
    }
}
