package com.tsf.shell.f.i.b.e;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends a {
    public d(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar, boolean z) {
        super(launcherShortcut3DInfo, aVar);
        if (z) {
            com.tsf.shell.manager.bind.b.b.a(this);
        } else if (com.censivn.C3DEngine.a.e.l()) {
            k();
        } else {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.f.i.b.e.b
    public void k() {
        this.k.textures().clear();
        this.k.textures().addElement(((LauncherShortcutStandardInfo) K()).getTexture(aW(), aE()));
        this.k.visible(true);
    }

    @Override // com.tsf.shell.f.i.b.e.b, com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void g() {
        super.g();
    }

    public LauncherShortcutStandardInfo.ResourceControler aW() {
        return null;
    }

    @Override // com.tsf.shell.f.i.c
    public ArrayList<Integer> a(ArrayList<Integer> arrayList) {
        arrayList.add(1);
        if (rotation().z != 0.0f) {
            arrayList.add(6);
        }
        arrayList.add(7);
        return arrayList;
    }
}
