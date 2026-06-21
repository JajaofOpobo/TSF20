package com.tsf.shell.e.i.b.e;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends a {
    public f(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar, boolean z) {
        super(launcherShortcut3DInfo, aVar);
        if (z) {
            com.tsf.shell.manager.bind.b.b.a(this);
        } else if (com.censivn.C3DEngine.a.i.l()) {
            k();
        } else {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.i.b.e.f.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.k();
                }
            });
        }
    }

    @Override // com.tsf.shell.e.i.b.e.b
    protected void k() {
        this.k.textures().clear();
        this.k.textures().addElement(((LauncherShortcutStandardInfo) K()).getTexture(aW(), aE()));
        this.k.visible(true);
    }

    @Override // com.tsf.shell.e.i.b.e.b, com.tsf.shell.e.i.e, com.tsf.shell.e.i.c
    public void g() {
        super.g();
    }

    public LauncherShortcutStandardInfo.ResourceControler aW() {
        return null;
    }

    @Override // com.tsf.shell.e.i.e
    public ArrayList a(ArrayList arrayList) {
        arrayList.add(1);
        if (rotation().z != 0.0f) {
            arrayList.add(6);
        }
        arrayList.add(7);
        return arrayList;
    }
}
