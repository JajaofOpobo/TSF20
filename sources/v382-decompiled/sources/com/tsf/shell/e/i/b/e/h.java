package com.tsf.shell.e.i.b.e;

import android.graphics.Rect;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h extends a {
    public h(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar, boolean z) {
        super(launcherShortcut3DInfo, aVar);
        if (z) {
            com.tsf.shell.manager.bind.b.b.a(this);
        } else if (com.censivn.C3DEngine.a.i.l()) {
            k();
        } else {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.i.b.e.h.1
                @Override // java.lang.Runnable
                public void run() {
                    h.this.k();
                }
            });
        }
    }

    @Override // com.tsf.shell.e.i.b.e.b
    protected void k() {
        this.k.textures().clear();
        this.k.textures().addElement(((LauncherShortcutStandardInfo) K()).getTexture(aE()));
        this.k.visible(true);
    }

    public void aV() {
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) K();
        if (launcherShortcut3DInfo.packagename != null) {
            com.tsf.shell.utils.a.a(com.censivn.C3DEngine.a.d(), launcherShortcut3DInfo.packagename);
        }
    }

    @Override // com.tsf.shell.e.i.b.e.b
    public void l() {
        super.l();
        if (A() == null ? true : A().a((b) this)) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.i.b.e.h.2
                @Override // java.lang.Runnable
                public void run() {
                    LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) h.this.K();
                    try {
                        h hVar = h.this;
                        float[] a = x.a(hVar.position().x, hVar.position().y);
                        launcherShortcut3DInfo.intent.setSourceBounds(new Rect((int) (a[0] + hVar.minX()), (int) (a[1] + hVar.minY()), (int) (a[0] + hVar.maxX()), (int) (hVar.maxY() + a[1])));
                        Home.b().a(launcherShortcut3DInfo.intent, (Object) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                        com.tsf.shell.k.a(com.censivn.C3DEngine.a.d().getString(R.string.activity_not_found));
                    }
                }
            });
        }
    }

    @Override // com.tsf.shell.e.i.b.e.b, com.tsf.shell.e.i.e, com.tsf.shell.e.i.c
    public void g() {
        super.g();
    }

    @Override // com.tsf.shell.e.i.e
    public ArrayList a(ArrayList arrayList) {
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(3);
        if (rotation().z != 0.0f) {
            arrayList.add(6);
        }
        arrayList.add(7);
        return arrayList;
    }
}
