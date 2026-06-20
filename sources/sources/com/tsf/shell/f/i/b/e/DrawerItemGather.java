package com.tsf.shell.f.i.b.e;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerItemGather extends DrawerItemAction {
    private static k a;
    private static TextureElement b = new TextureElement(0, false);
    private static float p = 0.0f;
    private static ArrayList<c> q = new ArrayList<>();
    private static com.censivn.C3DEngine.b.g.TweenParams r = new com.censivn.C3DEngine.b.g.TweenParams();
    private LauncherShortcutStandardInfo.ResourceControler s;
    private int t;

    public static void aV() {
        if (q != null) {
            for (c cVar : q) {
                cVar.k();
                cVar.C();
            }
        }
    }

    public DrawerItemGather(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.ButtonMetrics aVar, boolean z, int i) {
        super(launcherShortcut3DInfo, aVar, z);
        this.t = i;
        int i2 = (int) (45.0f * com.censivn.C3DEngine.b.b.A.c * aE().A);
        if (a == null) {
            a = new GridRenderable(i2, i2, false) { // from class: com.tsf.shell.f.i.b.e.DrawerItemGather.1
                @Override // com.censivn.C3DEngine.b.f.IRenderable
                public void onDrawStart() {
                    if (c.b.id == 0) {
                        int i3 = com.tsf.shell.manager.o.ButtonPresetManager.a.H;
                        Bitmap bitmap = ThemeManager.mix.action.getTheme().getBitmap(ThemeShellDescription.ACTION_APP_DRAWER_POINT, i3, i3);
                        com.censivn.C3DEngine.C3DEngine.g().a(c.b, bitmap);
                        bitmap.recycle();
                    }
                }
            };
            DrawerItemBase.position().y = aE().Y;
            DrawerItemBase.rotation().z = p;
            DrawerItemBase.textures().addElement(DrawerShortcutItemBase);
        }
        q.add(this);
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerItemAction
    public LauncherShortcutStandardInfo.ResourceControler aW() {
        if (this.s == null) {
            this.s = new LauncherShortcutStandardInfo.ResourceControler() { // from class: com.tsf.shell.f.i.b.e.DrawerItemGather.2
                @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo.ResourceControler
                public Bitmap c() {
                                        return ThemeManager.mix.action.getTheme().getBitmap(ThemeShellDescription.ACTION_APP_DRAWER_ICON, aVar.H, aVar.I);
                }
            };
        }
        return this.s;
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
    public com.tsf.shell.f.i.a.PageItemTouchHandler aH() {
        return new DrawerItemBase(this);
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
    public com.censivn.C3DEngine.b.f.a.TextureSpriteRenderable aF() {
        com.censivn.C3DEngine.b.f.a.TextureSpriteRenderable aVar = new com.censivn.C3DEngine.b.f.a.TextureSpriteRenderable(2, 0, aE().V, aE().W) { // from class: com.tsf.shell.f.i.b.e.DrawerItemGather.3
            @Override // com.censivn.C3DEngine.b.f.BaseRenderable
            public void onDrawChildStart() {
                super.onDrawChildStart();
                if (parent() != null && c.b != null && c.this.s != null && !c.this.s.isCustomResource()) {
                    c.a.dispatchDraw();
                }
            }
        };
        aE().a(aVar);
        return aVar;
    }

    public static void h(float f) {
        if (f != p) {
            p = f;
            if (a != null) {
                r.e(DrawerItemEditAction);
                r.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.TweenUtils.a(DrawerItemBase);
                com.censivn.C3DEngine.b.g.TweenUtils.a(a, 500, r);
            }
        }
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
    public void aO() {
        aE().a(this, this.m.l());
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
    public void aP() {
        com.tsf.shell.manager.action.GestureHandler.a();
        if (this.s.isCustomResource()) {
            super.aP();
        }
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerItemAction, com.tsf.shell.f.i.b.e.DrawerShortcutItemBase, com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void g() {
        if (q.contains(this)) {
            q.remove(this);
        }
        if (q.size() == 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(DrawerShortcutItemBase);
            b = null;
        }
        super.g();
    }

    class a extends com.tsf.shell.f.i.a.PageItemTouchHandler {
        private float h;
        private float i;
        private b j;
        private boolean k;

        public a(b bVar) {
            super(bVar);
            this.k = false;
            this.j = bVar;
        }

        @Override // com.tsf.shell.f.i.a.PageItemTouchHandler, com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent) {
            com.tsf.shell.manager.app.FolderManager.a(c.this.t);
        }

        @Override // com.tsf.shell.f.i.a.PageItemTouchHandler, com.censivn.C3DEngine.b.d.a
        public void e(MotionEvent motionEvent) {
            this.k = false;
            this.h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.j.aQ();
            com.tsf.shell.manager.action.GestureHandler.a();
        }

        @Override // com.tsf.shell.f.i.a.PageItemTouchHandler, com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.k) {
                com.tsf.shell.manager.app.StateHub.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
                return;
            }
            com.tsf.shell.manager.app.StateHub.w();
            com.tsf.shell.manager.app.StateHub.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
            this.k = true;
        }

        @Override // com.tsf.shell.f.i.a.PageItemTouchHandler, com.censivn.C3DEngine.b.d.a
        public void f(MotionEvent motionEvent) {
            if (this.k) {
                com.tsf.shell.manager.app.StateHub.x();
                this.k = false;
            }
        }
    }
}
