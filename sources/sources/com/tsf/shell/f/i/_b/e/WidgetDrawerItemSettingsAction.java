package com.tsf.shell.f.i._b.e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.shell.manager.action.ActionManager;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetDrawerItemSettingsAction extends WidgetDrawerShortcutItemBase {
    private com.tsf.shell.manager.action.toggle.ToggleAction a;
    private GridRenderable b;
    private TextureElement p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private int u;
    private com.censivn.C3DEngine.b.f._a.AltSpriteItemData v;
    private com.censivn.C3DEngine.b.f._a.AltSpriteItemData w;
    private String x;

    public WidgetDrawerItemSettingsAction(com.tsf.shell.manager.action.toggle.ToggleAction bVar) {
        super(null, com.tsf.shell.manager.o.ButtonPresetManager.b);
        this.q = 0;
        this.r = -1;
        this.s = false;
        this.t = 0;
        this.u = 0;
        this.a = bVar;
        this.p = new TextureElement(0, false);
        this.b = new GridRenderable(this.n.H, this.n.I, false) { // from class: com.tsf.shell.f.i._b.e.WidgetDrawerItemSettingsAction.1
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (j.this.q == 1) {
                    rotation().z += 5.0f;
                }
            }
        };
        float fA = com.censivn.C3DEngine.b.b.A.a(4.0f);
        this.b.position().y = this.n.Y - fA;
        addChild(this.b);
        this.b.visible(false);
        this.v = this.k.a(0);
        this.v.i().y -= fA;
        this.v.h();
        this.w = this.k.a(1);
        this.k.visible(false);
        this.k.textures().addElement(this.p);
        WidgetDrawerShortcutItemBase.a aVarB = com.tsf.shell.manager.action.toggle.a.ToggleActionBrightness(this.a.a);
        this.x = aVarB.b;
        int i = aVarB.c;
        this.u = i;
        this.t = i;
    }

    public TextureElement c() {
                return this.p;
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void j() {
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void q_() {
    }

    public void aV() {
        this.a.c();
    }

    public void b(int i) {
        this.t = i;
    }

    private void aY() {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.i._b.e.WidgetDrawerItemSettingsAction.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                com.censivn.C3DEngine.C3DEngine.g().a(j.this.p);
                j.this.aW();
                com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.i._b.e.WidgetDrawerItemSettingsAction.2.1
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                    }
                };
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.TweenUtils.a(j.this.v);
                com.censivn.C3DEngine.b.g.TweenUtils.a(j.this.v, 300, dVar2);
            }
        };
        dVar.l(0.0f);
        dVar.m(0.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.v);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.v, 300, dVar);
    }

    public void c(int i) {
        this.q = i;
        invalidate();
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase, com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (this.r != this.q) {
            this.r = this.q;
            switch (this.q) {
                case 0:
                    com.tsf.shell.manager.o.ThemeColorConstants.a(this.k, com.tsf.shell.manager.o.ThemeColorConstants.g);
                    com.tsf.shell.manager.o.ThemeColorConstants.a(this.b, com.tsf.shell.manager.o.ThemeColorConstants.g);
                    this.b.setAnimationObjectState(false);
                    this.b.textures().clear();
                    this.b.textures().addElement(com.tsf.shell.manager.app.FolderManager.c.b());
                    break;
                case 1:
                    this.b.textures().clear();
                    this.b.textures().addElement(com.tsf.shell.manager.app.FolderManager.c.c());
                    this.b.setAnimationObjectState(true);
                    break;
                case 2:
                    com.tsf.shell.manager.o.ThemeColorConstants.a(this.k, com.tsf.shell.manager.o.ThemeColorConstants.e);
                    com.tsf.shell.manager.o.ThemeColorConstants.a(this.b, com.tsf.shell.manager.o.ThemeColorConstants.e);
                    this.b.setAnimationObjectState(false);
                    this.b.textures().clear();
                    this.b.textures().addElement(com.tsf.shell.manager.app.FolderManager.c.b());
                    break;
            }
        }
        if (this.u != this.t) {
            this.u = this.t;
            aY();
        }
    }

    public void aW() {
        if (this.p.id == 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.n.H, this.n.I, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Bitmap bitmapA = x.a(this.u, com.censivn.C3DEngine.b.b.A.a(96.0f), com.censivn.C3DEngine.b.b.A.a(96.0f));
            canvas.drawBitmap(bitmapA, (bitmapCreateBitmap.getWidth() - bitmapA.getWidth()) / 2, (bitmapCreateBitmap.getHeight() - bitmapA.getHeight()) / 2, (Paint) null);
            bitmapA.recycle();
            Bitmap bitmapCreateTextureBitmap = LauncherShortcutStandardInfo.createTextureBitmap(this.x, bitmapCreateBitmap, this.n, false);
            bitmapCreateBitmap.recycle();
            com.censivn.C3DEngine.C3DEngine.g().a(this.p, bitmapCreateTextureBitmap);
            bitmapCreateTextureBitmap.recycle();
        }
        if (this.b.textures().size() == 0) {
            this.b.textures().addElement(com.tsf.shell.manager.app.FolderManager.c.b());
        }
        this.b.visible(true);
        this.k.visible(true);
    }

    public void aX() {
        if (this.p.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.p);
        }
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase, com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void g() {
        this.b.textures().clear();
        super.g();
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase
    protected void k() {
    }
}
