package com.tsf.shell.f.i._b.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.shell.e.CellLayout;
import com.tsf.shell.f.e.WidgetFreeResizeController;
import com.tsf.shell.f.f.WorkspacePage;
import com.tsf.shell.f.i._a.WidgetItemTouchHandler;
import com.tsf.shell.f.i.PageItem;
import com.tsf.shell.manager.bind.ShellModel;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetShell extends com.tsf.shell.f.i.PageItem {
    public boolean a;
    public GridRenderable b;
    public String a;
    public com.tsf.shell.e.WidgetContainer g;
    public TextureElement a;
    public Object a;
    public Runnable a;
    private c k;
    private com.tsf.shell.manager.r.a.WidgetInstanceTracker l;
    private Runnable m;
    private boolean n;

    public WidgetShell(LauncherAppWidgetInfo launcherAppWidgetInfo, String str) {
        super(launcherAppWidgetInfo);
        this.a = false;
        this.n = false;
        this.m = new Runnable() { // from class: com.tsf.shell.f.i._b.b.WidgetShell.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.n = true;
                t.a();
            }
        };
        this.i = new Object();
        i(false);
        this.f = str;
        this.b = new GridRenderable(0.0f, 0.0f, 1, 1, false);
        addChild(this.b);
        this.b.visible(false);
        this.k = new c(this);
        e(false);
        this.l = com.tsf.shell.manager.app.WidgetLayoutManager;
        this.l.a(this);
    }

    public void k() {
        LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) K();
        if (com.censivn.C3DEngine.b.b.A.O) {
            this.b.a(launcherAppWidgetInfo.width);
            this.b.b(launcherAppWidgetInfo.height);
            c(launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY);
        } else {
            this.b.a(launcherAppWidgetInfo.widthH);
            this.b.b(launcherAppWidgetInfo.heightH);
            c(launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public float minX() {
        return (-this.b.b()) / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public float minY() {
        return (-this.b.c()) / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public float maxX() {
        return this.b.b() / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public float maxY() {
        return this.b.c() / 2.0f;
    }

    @Override // com.tsf.shell.f.i.PageItem
    public boolean ac() {
        boolean z;
        t.a();
        ItemInfo itemInfoK = K();
        d.b bVar = (d.b) this.g.getLayoutParams();
        if (com.censivn.C3DEngine.b.b.A.O) {
            bVar.a = itemInfoK.cellX;
            bVar.b = itemInfoK.cellY;
            bVar.d = itemInfoK.width;
            bVar.e = itemInfoK.height;
            int[] iArr = {bVar.a, bVar.b, bVar.d, bVar.e};
            boolean zC = com.tsf.shell.manager.r.BoundsHelper.c(iArr);
            if (zC) {
                int i = iArr[0];
                bVar.a = i;
                itemInfoK.cellX = i;
                int i2 = iArr[1];
                bVar.b = i2;
                itemInfoK.cellY = i2;
                int i3 = iArr[2];
                bVar.d = i3;
                itemInfoK.width = i3;
                int i4 = iArr[3];
                bVar.e = i4;
                itemInfoK.height = i4;
            }
            c(itemInfoK.cellX, itemInfoK.cellY);
            z = zC;
        } else {
            bVar.a = itemInfoK.cellXH;
            bVar.b = itemInfoK.cellYH;
            bVar.d = itemInfoK.widthH;
            bVar.e = itemInfoK.heightH;
            int[] iArr2 = {bVar.a, bVar.b, bVar.d, bVar.e};
            boolean zC2 = com.tsf.shell.manager.r.BoundsHelper.c(iArr2);
            if (zC2) {
                int i5 = iArr2[0];
                bVar.a = i5;
                itemInfoK.cellXH = i5;
                int i6 = iArr2[1];
                bVar.b = i6;
                itemInfoK.cellYH = i6;
                int i7 = iArr2[2];
                bVar.d = i7;
                itemInfoK.widthH = i7;
                int i8 = iArr2[3];
                bVar.e = i8;
                itemInfoK.heightH = i8;
            }
            c(itemInfoK.cellXH, itemInfoK.cellYH);
            z = zC2;
        }
        ag();
        rotation().z = itemInfoK.rotation;
        return z;
    }

    public void a(Bitmap bitmap) {
        if (this.h == null) {
            this.h = com.censivn.C3DEngine.C3DEngine.g().a(bitmap, false);
            this.b.textures().addElement(this.h);
            this.b.visible(true);
            b(this.h.width, this.h.height);
            d.b bVar = (d.b) this.g.getLayoutParams();
            c(bVar.a, bVar.b);
        } else if (bitmap.getWidth() != this.h.width || bitmap.getHeight() != this.h.height) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.h, bitmap);
            b(this.h.width, this.h.height);
            d.b bVar2 = (d.b) this.g.getLayoutParams();
            c(bVar2.a, bVar2.b);
        } else {
            com.censivn.C3DEngine.C3DEngine.g().a(this.h, bitmap);
        }
        invalidate();
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        synchronized (this.i) {
            if (this.j != null) {
                this.j.run();
                this.j = null;
            }
        }
    }

    public void b(int i, int i2) {
        this.b.a(i);
        this.b.b(i2);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c getMouseEventListener() {
        return this.k;
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void ab() {
        com.censivn.C3DEngine.C3DEngine.a().c(this.m);
    }

    public void q() {
        this.b.alpha(0.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 500, dVar);
    }

    public void ag() {
        com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.i._b.b.WidgetShell.2
            @Override // java.lang.Runnable
            public void run() {
                d.b bVar = (d.b) a.this.g.getLayoutParams();
                a.this.g.a(bVar.d, bVar.e);
                a.this.g.requestLayout();
                a.this.g.invalidate();
            }
        });
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void n_() {
        this.n = false;
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(180);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 500, dVar);
        setAnimationObjectState(true);
        t.a(this);
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void m_() {
        super.m_();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 500, dVar);
        if (!this.a) {
            d.b bVar = (d.b) this.g.getLayoutParams();
            int i = bVar.a;
            int i2 = bVar.b;
            float fB = (i + (this.b.b() / 2.0f)) - com.censivn.C3DEngine.b.b.A.H;
            float fC = com.censivn.C3DEngine.b.b.A.I - (i2 + (this.b.c() / 2.0f));
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i._b.b.WidgetShell.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.c();
                }
            };
            dVar2.f(fB);
            dVar2.h(fC);
            com.censivn.C3DEngine.b.g.c.a(this);
            com.censivn.C3DEngine.b.g.c.a(this, 250, dVar2);
        }
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void a(com.tsf.shell.f.i.MultiSelectController aVar) {
        super.a(aVar);
        final g gVarZ = z();
        if (gVarZ != null && K().screen != gVarZ.t()) {
            K().screen = gVarZ.t();
            com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.i._b.b.WidgetShell.4
                @Override // java.lang.Runnable
                public void run() {
                    ((d) a.this.g.getParent()).b(a.this.g);
                    gVarZ.s().a(a.this.g);
                }
            });
        }
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void p_() {
        super.p_();
        this.a = true;
        this.b.mouseEnabled(false);
    }

    @Override // com.tsf.shell.f.i.PageItem, com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderable
    public void destroy() {
        this.l.b(this);
        com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.i._b.b.WidgetShell.5
            @Override // java.lang.Runnable
            public void run() {
                ((d) a.this.g.getParent()).b(a.this.g);
            }
        });
        com.censivn.C3DEngine.C3DEngine.a().e(new Runnable() { // from class: com.tsf.shell.f.i._b.b.WidgetShell.6
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.app.WidgetLayoutManager.a.a(((LauncherAppWidgetInfo) a.this.K()).appWidgetId);
                ShellModel.a.b(a.this.K());
            }
        });
        if (this.b != null) {
            this.b.destroy();
            this.b = null;
        }
        com.censivn.C3DEngine.C3DEngine.g().a(this.h);
        this.h = null;
        this.k = null;
        removeFromParent();
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void q_() {
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.i._b.b.WidgetShell.7
            @Override // java.lang.Runnable
            public void run() {
                t.a();
            }
        });
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void j() {
    }

    public void c(int i, int i2) {
        position().x = b(i);
        position().y = c(i2);
    }

    public float b(int i) {
        return (i + (this.b.b() / 2.0f)) - com.censivn.C3DEngine.b.b.A.H;
    }

    public float c(int i) {
        return com.censivn.C3DEngine.b.b.A.I - (i + (this.b.c() / 2.0f));
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void E() {
        com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.i._b.b.WidgetShell.8
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.e == null) {
                    a.this.e = com.tsf.shell.f.e._b.OverlayBackground((int) (a.this.b.b() + (com.censivn.C3DEngine.b.b.A.b * 10.0f)), (int) (a.this.b.c() + (com.censivn.C3DEngine.b.b.A.b * 10.0f)));
                    a.this.e.useVBO(false);
                    a.this.e.textures().addElement(com.tsf.shell.f.e._b.h);
                    a.this.e.position().y = (this.minY() + this.maxY()) / 2.0f;
                    this.addChild(a.this.e);
                }
            }
        });
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void F() {
        com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.i._b.b.WidgetShell.9
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.e != null) {
                    a.this.e.textures().removeAll();
                    a.this.e.removeFromParent();
                    a.this.e.destroy();
                    a.this.e = null;
                }
            }
        });
    }
}
