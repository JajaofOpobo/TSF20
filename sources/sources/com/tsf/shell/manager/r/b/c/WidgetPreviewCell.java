package com.tsf.shell.manager.r.b.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetPreviewCell extends BaseRenderable {
    private static k a;
    private static TextureElement b = new TextureElement(0, false);
    private com.censivn.C3DEngine.b.f.ColoredRectRenderable c;
    private i d;
    private BaseRenderable e;
    private i f;
    private com.tsf.shell.f.i.c.ItemLabelProvider g;
    private float h;
    private float i;
    private float j;
    private float k = 0.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c;

    public WidgetPreviewCell(float f, float f2, float f3, boolean z) {
        this.i = f;
        this.j = f2;
        this.h = f3;
        this.c = new com.censivn.C3DEngine.b.f.ColoredRectRenderable(f, f2 - this.h);
        this.c.a(553648127, ThemeElementType.PARSER_CONFIG_ALL);
        if (z) {
            addChild(this.c);
        }
        this.e = new BaseRenderable() { // from class: com.tsf.shell.manager.r.b.c.WidgetPreviewCell.1
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                Number3WidgetPanelOrchestrator.TEMPNUMBER3WidgetPanelOrchestrator.reset();
                Number3d number3dLocalToGlobal = localToGlobal(Number3WidgetPanelOrchestrator.TEMPNUMBER3D);
                com.censivn.C3DEngine.C3DEngine.e().b(number3dLocalToGlobal.x, number3dLocalToGlobal.y);
            }

            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawEnd() {
                com.censivn.C3DEngine.C3DEngine.e().f();
            }
        };
        addChild(this.e);
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildEnd() {
        if ((this.g instanceof com.tsf.shell.f.i.c.ItemGroupBase) && !((com.tsf.shell.f.i.c.ItemGroupBase) this.g).j()) {
            if (SystemWidgetProviderBrowser.id == 0) {
                Bitmap bitmapA = x.a(b.d.widget_item_download);
                com.censivn.C3DEngine.C3DEngine.g().a(b, bitmapA);
                bitmapA.recycle();
            }
            if (a == null) {
                a = new GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.c * 84.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 84.0f, false);
                WidgetProviderInfoBar.textures().addElement(b);
                WidgetProviderInfoBar.position().x = ((this.i / 2.0f) - (a.b() / 2.0f)) - com.censivn.C3DEngine.b.b.ScreenConstants.a(10.0f);
                WidgetProviderInfoBar.position().y = (((this.j - this.h) / 2.0f) - (a.c() / 2.0f)) - com.censivn.C3DEngine.b.b.ScreenConstants.a(10.0f);
            }
            WidgetProviderInfoBar.dispatchDraw();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
    }

    public void a(i iVar) {
        iVar.removeFromParent();
        this.e.addChild(iVar);
    }

    public i a() {
        return this.f;
    }

    public void a(com.tsf.shell.f.i.c.ItemLabelProvider eVar, boolean z) {
        i iVarA = eVar.a((int) this.i, (int) this.j, z);
        if (this.c.b() != this.j) {
            this.c.b(this.j - this.h);
        }
        if (this.f != iVarA) {
            this.e.removeChild(this.f);
            this.f = iVarA;
            this.g = eVar;
            if (this.g != null) {
                this.g.h();
            }
            this.f.removeFromParent();
            this.e.addChild(this.f);
            this.f.position().z = this.k;
        } else if (this.g != null) {
            this.g.h();
        }
        i iVarB = eVar.b((int) (this.i - com.censivn.C3DEngine.b.b.ScreenConstants.a(20.0f)));
        if (this.d != iVarB) {
            removeChild(this.d);
            this.d = iVarB;
            this.d.removeFromParent();
            addChild(this.d);
            this.d.position().y = (-this.j) / 2.0f;
        }
    }

    public float b() {
        return this.i;
    }

    public float c() {
        return this.j;
    }

    public void a(float f, float f2) {
        this.i = f;
        this.j = f2;
        this.c.a(f);
        this.c.b(f2 - this.h);
    }

    public void d() {
        if (this.f != null) {
            this.e.removeChild(this.f);
            this.g.g();
            this.f = null;
            this.g = null;
        }
        if (this.d != null) {
            removeChild(this.d);
            this.d = null;
        }
    }
}
