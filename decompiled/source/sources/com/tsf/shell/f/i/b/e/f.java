package com.tsf.shell.f.i.b.e;

import android.graphics.Rect;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends a {
    public f(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar, boolean z) {
        super(launcherShortcut3DInfo, aVar);
        if (z) {
            com.tsf.shell.manager.bind.b.b.a(this);
        } else if (com.censivn.C3DEngine.a.e.l()) {
            k();
        } else {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.f.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.f.i.b.e.b
    public void k() {
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

    @Override // com.tsf.shell.f.i.b.e.b
    public void l() {
        super.l();
        if (A() == null ? true : A().a((b) this)) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.i.b.e.f.2
                @Override // java.lang.Runnable
                public void run() {
                    LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) f.this.K();
                    try {
                        f fVar = f.this;
                        float[] a = x.a(fVar.position().x, fVar.position().y);
                        launcherShortcut3DInfo.intent.setSourceBounds(new Rect((int) (a[0] + fVar.minX()), (int) (a[1] + fVar.minY()), (int) (a[0] + fVar.maxX()), (int) (fVar.maxY() + a[1])));
                        Home.b().a(launcherShortcut3DInfo.intent, (Object) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                        com.tsf.shell.e.a(com.censivn.C3DEngine.a.d().getString(b.i.activity_not_found));
                    }
                }
            });
        }
    }

    @Override // com.tsf.shell.f.i.b.e.b, com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void g() {
        super.g();
    }

    @Override // com.tsf.shell.f.i.c
    public ArrayList<Integer> a(ArrayList<Integer> arrayList) {
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
