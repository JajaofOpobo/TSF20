package com.tsf.shell.f.i._b.e;

import android.graphics.Rect;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetDrawerItemEditAction extends WidgetDrawerItemBase {
    public WidgetDrawerItemEditAction(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.ButtonMetrics aVar, boolean z) {
        super(launcherShortcut3DInfo, aVar);
        if (z) {
            com.tsf.shell.manager.bind.ShellBindController.b.a(this);
        } else if (com.censivn.C3DEngine.a.e.l()) {
            WidgetDrawerItemEditAction();
        } else {
            com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.i._b.e.WidgetDrawerItemEditAction.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.k();
                }
            });
        }
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase
    protected void k() {
        this.k.textures().clear();
        this.k.textures().addElement(((LauncherShortcutStandardInfo) K()).getTexture(aE()));
        this.k.visible(true);
    }

    public void aV() {
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) K();
        if (launcherShortcut3DInfo.packagename != null) {
            com.tsf.shell.utils.PackageManagerHelper.a(com.censivn.C3DEngine.A.d(), launcherShortcut3DInfo.packagename);
        }
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase
    public void l() {
        super.l();
        if (A() == null ? true : A().a((WidgetDrawerShortcutItemBase) this)) {
            com.censivn.C3DEngine.A.a().a(new Runnable() { // from class: com.tsf.shell.f.i._b.e.WidgetDrawerItemEditAction.2
                @Override // java.lang.Runnable
                public void run() {
                    LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) f.this.K();
                    try {
                        f fVar = f.this;
                        float[] fArrA = x.a(fVar.position().x, fVar.position().y);
                        launcherShortcut3DInfo.intent.setSourceBounds(new Rect((int) (fArrA[0] + fVar.minX()), (int) (fArrA[1] + fVar.minY()), (int) (fArrA[0] + fVar.maxX()), (int) (fVar.maxY() + fArrA[1])));
                        Home.b().a(launcherShortcut3DInfo.intent, (Object) null);
                    } catch (Exception e) {
                        ItemStubHelper.printStackTrace();
                        com.tsf.shell.e.a(com.censivn.C3DEngine.A.d().getString(WidgetDrawerShortcutItemBase.i.activity_not_found));
                    }
                }
            });
        }
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase, com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void g() {
        super.g();
    }

    @Override // com.tsf.shell.f.i.ShortcutItem
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
