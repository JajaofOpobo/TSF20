package com.tsf.shell.f.i._b.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.shell.f.e.ILassoSelectable;
import com.tsf.shell.utils.HapticFeedbackManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class WidgetDrawerShortcutItemBase extends com.tsf.shell.f.i.ShortcutItem implements ILassoSelectable {
    private static int[] a = {0, 0};
    private static ArrayList<WidgetDrawerItemBase> v = new ArrayList<>();
    private static int w = 0;
    private static int x = 2;
    private boolean b;
    public com.censivn.C3DEngine.b.f._a.AltTextureSpriteRenderable k;
    public com.censivn.C3DEngine.b.f._a.AltSpriteItemData l;
    public com.censivn.C3DEngine.b.f._a.AltSpriteItemData m;
    public com.tsf.shell.manager.o.ButtonMetrics n;
    public boolean o;
    private boolean p;
    private float q;
    private boolean r;
    private com.tsf.shell.f._d.a.DashElementBase s;
    private boolean t;
    private WidgetDrawerItemBase u;

    protected abstract void k();

    public WidgetDrawerShortcutItemBase(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.ButtonMetrics aVar) {
        super(launcherShortcut3DInfo);
        this.b = true;
        this.p = true;
        this.r = false;
        this.o = false;
        this.t = false;
        this.n = aVar;
        useVBO(false);
        i(false);
        this.k = aF();
        this.l = this.k.a(0);
        this.m = this.k.a(1);
        c(1.2f);
        k(true);
        aO();
        setMouseEventListener(aH());
        addChild(this.k);
        j(true);
    }

    public void f(float f) {
        this.q = f;
    }

    public float az() {
        return this.q;
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        aA();
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        if (fVar instanceof b) {
            a((com.censivn.C3DEngine.b.f.IRenderable) fVar);
        }
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        if (fVar instanceof b) {
            b((com.censivn.C3DEngine.b.f.IRenderable) fVar);
        }
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        if ((fVar instanceof b) && this.u != null) {
            com.tsf.shell.f.i._b.d.WorkspaceShortcutItem bVarA = a((WidgetDrawerShortcutItemBase) fVar, false);
            bVarA.K().screen = K().screen;
            bVarA.ad();
            bVarA.setMouseEventListener(new com.tsf.shell.f.i._a.WidgetItemTouchHandler(bVarA));
        }
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public boolean a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar, float f, float f2) {
        return (fVar instanceof com.tsf.shell.f.i.ShortcutItem) && ((com.tsf.shell.f.i.ShortcutItem) fVar).au();
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        return fVar instanceof b;
    }

    public void aA() {
        if (!this.r) {
            if (this.k.textures().size() == 0 || this.k.textures().get(0).textureElement.id == 0) {
                this.r = true;
                WidgetDrawerShortcutItemBase();
            } else {
                this.r = true;
            }
        }
    }

    public void aB() {
        WidgetDrawerShortcutItemBase();
    }

    public boolean aC() {
        return this.r;
    }

    public void aD() {
        this.r = false;
    }

    private void q() {
        if (!t()) {
            WidgetDrawerShortcutItemBase();
        }
    }

    public com.tsf.shell.manager.o.ButtonMetrics aE() {
        return this.n;
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public boolean doubleSidedEnabled() {
        return this.k.doubleSidedEnabled();
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void doubleSidedEnabled(boolean z) {
        this.k.doubleSidedEnabled(z);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void alpha(float f) {
        this.k.alpha(WidgetDrawerItemEditAction);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public float alpha() {
        return this.k.alpha();
    }

    public com.censivn.C3DEngine.b.f._a.AltTextureSpriteRenderable aF() {
        return this.n.b();
    }

    public int[] aG() {
        a[0] = this.n.H;
        a[1] = this.n.I;
        return a;
    }

    public com.tsf.shell.f.i._a.WidgetItemTouchHandler aH() {
        return new com.tsf.shell.f.i._a.WidgetItemDropHandler(this);
    }

    public void l(boolean z) {
        this.p = z;
    }

    public boolean aI() {
        return this.p;
    }

    @Override // com.tsf.shell.f.i.ShortcutItem, com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void g(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        I();
        super.g(fVar);
    }

    public static void a(Bitmap bitmap) {
    }

    public float aJ() {
        return this.m.o.x;
    }

    public void g(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.m.o.x) {
            this.m.o.x = f;
            this.m.o.y = f;
            this.ILassoSelectable.f();
            if (f == 0.0f) {
                aL();
            } else if (!this.ILassoSelectable.l()) {
                aM();
            }
        }
    }

    public boolean aK() {
        return !this.ILassoSelectable.l();
    }

    public void aL() {
        if (this.ILassoSelectable.l()) {
            this.ILassoSelectable.a((Boolean) false);
            aO();
        }
    }

    public void aM() {
        if (!this.ILassoSelectable.l()) {
            this.ILassoSelectable.a((Boolean) true);
            aO();
        }
    }

    public void aN() {
        this.b = false;
    }

    public void aO() {
        if (this.n != null) {
            this.n.a(this, this.ILassoSelectable.l());
        }
    }

    public void a(Number3d number3d, Number3d number3d2) {
        b(number3d, number3d2);
    }

    public void a(com.tsf.shell.f._d.a.DashElementBase aVar) {
        b(aVar);
    }

    public void b(Number3d number3d, Number3d number3d2) {
        if (this.b) {
            this.s = com.tsf.shell.manager.app.v.AnimationHelper.a(this, number3d, number3d2);
        }
    }

    public void aP() {
        if (this.b) {
            this.s = com.tsf.shell.manager.app.v.AnimationHelper.a(this);
        }
    }

    public void b(com.tsf.shell.f._d.a.DashElementBase aVar) {
        if (this.b) {
            com.tsf.shell.manager.app.v.AnimationHelper.a(this, aVar);
        }
    }

    public void aQ() {
        if (aC()) {
            aP();
        }
    }

    public void l() {
        HapticFeedbackManager.b();
    }

    @Override // com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void g() {
        this.n = null;
        this.s = null;
        super.g();
    }

    @Override // com.tsf.shell.f.e.ILassoSelectable
    public boolean e_() {
        return this.t;
    }

    @Override // com.tsf.shell.f.e.ILassoSelectable
    public void b(boolean z) {
        this.t = z;
    }

    @Override // com.tsf.shell.f.e.ILassoSelectable
    public boolean d() {
        return true;
    }

    public boolean a(com.censivn.C3DEngine.b.f.IRenderable iVar) {
        if (this.u == null) {
            this.u = aS();
        }
        if (this.u == null) {
            return false;
        }
        this.u.WidgetDrawerItemBase.a(this, this.u.b, iVar);
        return true;
    }

    public void b(com.censivn.C3DEngine.b.f.IRenderable iVar) {
        if (this.u != null) {
            this.u.WidgetDrawerItemBase.a(iVar, new Runnable() { // from class: com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.u.WidgetDrawerShortcutItemBase.removeFromParent();
                    b.this.k.visible(true);
                    WidgetDrawerShortcutItemBase.a(b.this.u);
                    b.this.u = null;
                }
            });
        }
    }

    public com.tsf.shell.f.i._b.d.WorkspaceShortcutItem a(WidgetDrawerShortcutItemBase bVar, boolean z) {
        com.tsf.shell.f.i._b.d.WorkspaceShortcutItem bVar2 = this.u.a;
        this.u.WidgetDrawerItemBase.removeFromParent();
        this.u.WidgetDrawerItemBase.a(this, bVar, z);
        this.u = null;
        this.k.visible(true);
        aT();
        return bVar2;
    }

    public static boolean aR() {
        return w < x || v.size() > 0;
    }

    public static WidgetDrawerItemBase aS() {
        if (v.isEmpty()) {
            if (w >= x) {
                return null;
            }
            return aU();
        }
        return v.remove(0);
    }

    public static void aT() {
        w--;
    }

    public static WidgetDrawerItemBase aU() {
        a aVar = new WidgetDrawerItemBase();
        aVar.a = new com.tsf.shell.f.i._b.WidgetDrawerItemAction.WorkspaceShortcutItem(new LauncherDrawerFolder3DInfo(true));
        aVar.b = new WidgetDrawerItemButton();
        w++;
        return aVar;
    }

    public static void a(WidgetDrawerItemBase aVar) {
        aVar.b.k.textures().clear();
        v.add(aVar);
    }

    static class a {
        public com.tsf.shell.f.i._b.d.WorkspaceShortcutItem a;
        public WidgetDrawerItemButton b;

        a() {
        }
    }
}
