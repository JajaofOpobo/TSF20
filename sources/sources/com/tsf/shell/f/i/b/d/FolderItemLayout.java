package com.tsf.shell.f.i.b.d;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderItemLayout {
    private static Number3d i = new Number3d();
    private static Number3d j = new Number3d();
    private static Number3d k = new Number3d();
    private static float l;
    public ThemeFolderDescription a;
    public com.tsf.shell.f.a.a.GlTextureBinding b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public FolderItemLayout() {
        ThemeFolderDescription();
    }

    private void b() {
        this.c = (int) (com.tsf.shell.f.i.b.d.FolderItemPositioner.Q - com.tsf.shell.f.i.b.d.FolderItemPositioner.P);
        this.d = (int) (com.tsf.shell.f.i.b.d.FolderItemPositioner.S - com.tsf.shell.f.i.b.d.FolderItemPositioner.R);
        this.e = (int) com.tsf.shell.f.i.b.d.FolderItemPositioner.P;
        this.f = (int) com.tsf.shell.f.i.b.d.FolderItemPositioner.R;
        this.g = (int) com.tsf.shell.f.i.b.d.FolderItemPositioner.Q;
        this.h = (int) com.tsf.shell.f.i.b.d.FolderItemPositioner.S;
    }

    public void a() {
        this.a = ThemeManager.mix.folder.getTheme().folder;
        ThemeFolderDescription();
        if (this.b != null) {
            com.tsf.shell.manager.app.TextureCache.a(this.b);
        } else {
            this.b = com.tsf.shell.manager.app.TextureCache.a(this.c, this.d);
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
            FolderItemDotIndicator.setAllFrom(bVar.position());
            FolderItemPositioner.setAllFrom(bVar.rotation());
            FolderItemSorter.setAllFrom(bVar.scale());
            l = bVar.alpha();
            boolean zVisible = bVar.visible();
            float fX = bVar.x();
            bVar.b(0.0f);
            bVar.position().setAll((-(this.e + this.g)) / 2.0f, (-(this.f + this.h)) / 2.0f, 0.0f);
            bVar.rotation().setAll(0.0f, 0.0f, 0.0f);
            bVar.scale().setAll(1.0f, 1.0f, 1.0f);
            bVar.alpha(255.0f);
            bVar.visible(true);
            com.tsf.shell.manager.app.TextureCache.b(this.b, bVar.u);
            GLES20.glViewport(0, 0, this.c, this.d);
            com.censivn.C3DEngine.C3DEngine.e().a(this.c, this.d);
            if (bVar.visible()) {
                MatrixStack.glPushMatrix();
                bVar.draw();
                MatrixStack.glColor(bVar.alpha(), bVar.getDefaultColor());
                if (bVar.renderChildren()) {
                    int size = bVar.children().size();
                    for (int i2 = 0; i2 < size; i2++) {
                        com.censivn.C3DEngine.b.f.IRenderable iVar = bVar.children().get(i2);
                        if (!(iVar instanceof com.tsf.shell.f.i.PageItem)) {
                            iVar.dispatchDraw();
                        }
                    }
                }
                MatrixStack.glPopMatrix();
            }
            com.tsf.shell.manager.app.TextureCache.b();
            GLES20.glViewport(0, 0, com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G);
            com.censivn.C3DEngine.C3DEngine.e().a(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G);
            bVar.position().setAllFrom(FolderItemDotIndicator);
            bVar.rotation().setAllFrom(FolderItemPositioner);
            bVar.b(fX);
            bVar.scale().setAllFrom(FolderItemSorter);
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
