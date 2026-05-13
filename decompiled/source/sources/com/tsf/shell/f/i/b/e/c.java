package com.tsf.shell.f.i.b.e;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends d {
    private static k a;
    private static TextureElement b = new TextureElement(0, false);
    private static float p = 0.0f;
    private static ArrayList<c> q = new ArrayList<>();
    private static com.censivn.C3DEngine.b.g.d r = new com.censivn.C3DEngine.b.g.d();
    private LauncherShortcutStandardInfo.ResourceControler s;
    private int t;

    public static void aV() {
        if (q != null) {
            Iterator<c> it = q.iterator();
            while (it.hasNext()) {
                c next = it.next();
                next.k();
                next.C();
            }
        }
    }

    public c(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar, boolean z, int i) {
        super(launcherShortcut3DInfo, aVar, z);
        this.t = i;
        int i2 = (int) (45.0f * com.censivn.C3DEngine.b.b.a.c * aE().A);
        if (a == null) {
            a = new k(i2, i2, false) { // from class: com.tsf.shell.f.i.b.e.c.1
                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawStart() {
                    if (c.b.id == 0) {
                        int i3 = com.tsf.shell.manager.o.b.a.H;
                        Bitmap bitmap = ThemeManager.mix.action.getTheme().getBitmap(ThemeShellDescription.ACTION_APP_DRAWER_POINT, i3, i3);
                        com.censivn.C3DEngine.a.g().a(c.b, bitmap);
                        bitmap.recycle();
                    }
                }
            };
            a.position().y = aE().Y;
            a.rotation().z = p;
            a.textures().addElement(b);
        }
        q.add(this);
    }

    @Override // com.tsf.shell.f.i.b.e.d
    public LauncherShortcutStandardInfo.ResourceControler aW() {
        if (this.s == null) {
            this.s = new LauncherShortcutStandardInfo.ResourceControler() { // from class: com.tsf.shell.f.i.b.e.c.2
                @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo.ResourceControler
                public Bitmap getThemeBitmap(com.tsf.shell.manager.o.a aVar) {
                    return ThemeManager.mix.action.getTheme().getBitmap(ThemeShellDescription.ACTION_APP_DRAWER_ICON, aVar.H, aVar.I);
                }
            };
        }
        return this.s;
    }

    @Override // com.tsf.shell.f.i.b.e.b
    public com.tsf.shell.f.i.a.c aH() {
        return new a(this);
    }

    @Override // com.tsf.shell.f.i.b.e.b
    public com.censivn.C3DEngine.b.f.a.a aF() {
        com.censivn.C3DEngine.b.f.a.a aVar = new com.censivn.C3DEngine.b.f.a.a(2, 0, aE().V, aE().W) { // from class: com.tsf.shell.f.i.b.e.c.3
            @Override // com.censivn.C3DEngine.b.f.j
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
                r.e(f);
                r.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(a);
                com.censivn.C3DEngine.b.g.c.a(a, 500, r);
            }
        }
    }

    @Override // com.tsf.shell.f.i.b.e.b
    public void aO() {
        aE().a(this, this.m.l());
    }

    @Override // com.tsf.shell.f.i.b.e.b
    public void aP() {
        com.tsf.shell.manager.action.f.a();
        if (this.s.isCustomResource()) {
            super.aP();
        }
    }

    @Override // com.tsf.shell.f.i.b.e.d, com.tsf.shell.f.i.b.e.b, com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void g() {
        if (q.contains(this)) {
            q.remove(this);
        }
        if (q.size() == 0) {
            com.censivn.C3DEngine.a.g().a(b);
            b = null;
        }
        super.g();
    }

    /* loaded from: classes.dex */
    class a extends com.tsf.shell.f.i.a.c {
        private float h;
        private float i;
        private b j;
        private boolean k;

        public a(b bVar) {
            super(bVar);
            this.k = false;
            this.j = bVar;
        }

        @Override // com.tsf.shell.f.i.a.c, com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent) {
            com.tsf.shell.manager.a.d.a(c.this.t);
        }

        @Override // com.tsf.shell.f.i.a.c, com.censivn.C3DEngine.b.d.a
        public void e(MotionEvent motionEvent) {
            this.k = false;
            this.h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.j.aQ();
            com.tsf.shell.manager.action.f.a();
        }

        @Override // com.tsf.shell.f.i.a.c, com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.k) {
                com.tsf.shell.manager.a.h.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
                return;
            }
            com.tsf.shell.manager.a.h.w();
            com.tsf.shell.manager.a.h.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
            this.k = true;
        }

        @Override // com.tsf.shell.f.i.a.c, com.censivn.C3DEngine.b.d.a
        public void f(MotionEvent motionEvent) {
            if (this.k) {
                com.tsf.shell.manager.a.h.x();
                this.k = false;
            }
        }
    }
}
