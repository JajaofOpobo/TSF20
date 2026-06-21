package com.tsf.shell.e.i.b.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends f {
    private static m a;
    private static TextureElement b = new TextureElement(0, false);
    private static float p = 0.0f;
    private static ArrayList q = new ArrayList();
    private static x r = new x();
    private LauncherShortcutStandardInfo.ResourceControler s;
    private int t;

    public static void aV() {
        if (q != null) {
            Iterator it = q.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.k();
                dVar.C();
            }
        }
    }

    public d(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar, boolean z, int i) {
        super(launcherShortcut3DInfo, aVar, z);
        this.t = i;
        int i2 = (int) (45.0f * com.censivn.C3DEngine.b.b.a.c * aE().A);
        if (a == null) {
            a = new m(i2, i2, false) { // from class: com.tsf.shell.e.i.b.e.d.1
                @Override // com.censivn.C3DEngine.b.f.j
                public void onDrawStart() {
                    if (d.b.id == 0) {
                        int i3 = com.tsf.shell.manager.o.b.a.H;
                        Bitmap bitmap = ThemeManager.mix.action.getTheme().getBitmap(ThemeShellDescription.ACTION_APP_DRAWER_POINT, i3, i3);
                        com.censivn.C3DEngine.a.g().a(d.b, bitmap);
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

    @Override // com.tsf.shell.e.i.b.e.f
    public LauncherShortcutStandardInfo.ResourceControler aW() {
        if (this.s == null) {
            this.s = new LauncherShortcutStandardInfo.ResourceControler() { // from class: com.tsf.shell.e.i.b.e.d.2
                @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo.ResourceControler
                public Bitmap getThemeBitmap(com.tsf.shell.manager.o.a aVar) {
                    return ThemeManager.mix.action.getTheme().getBitmap(ThemeShellDescription.ACTION_APP_DRAWER_ICON, aVar.H, aVar.I);
                }
            };
        }
        return this.s;
    }

    @Override // com.tsf.shell.e.i.b.e.b
    public com.tsf.shell.e.i.a.c aH() {
        return new e(this, this);
    }

    @Override // com.tsf.shell.e.i.b.e.b
    public com.censivn.C3DEngine.b.f.a.a aF() {
        com.censivn.C3DEngine.b.f.a.a aVar = new com.censivn.C3DEngine.b.f.a.a(2, 0, aE().V, aE().W) { // from class: com.tsf.shell.e.i.b.e.d.3
            @Override // com.censivn.C3DEngine.b.f.l
            public void onDrawChildStart() {
                super.onDrawChildStart();
                if (parent() != null && d.b != null && d.this.s != null && !d.this.s.isCustomResource()) {
                    d.a.dispatchDraw();
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
                w.a(a);
                w.a(a, 500, r);
            }
        }
    }

    @Override // com.tsf.shell.e.i.b.e.b
    public void aO() {
        aE().a(this, this.m.l());
    }

    @Override // com.tsf.shell.e.i.b.e.b
    public void aP() {
        com.tsf.shell.manager.action.h.a();
        if (this.s.isCustomResource()) {
            super.aP();
        }
    }

    @Override // com.tsf.shell.e.i.b.e.f, com.tsf.shell.e.i.b.e.b, com.tsf.shell.e.i.e, com.tsf.shell.e.i.c
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
}
