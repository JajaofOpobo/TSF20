package com.tsf.shell.workspace3D.k;

import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class af implements Runnable {
    private final /* synthetic */ String[] a;

    af(String[] strArr) {
        this.a = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        arrayList = ae.I;
        if (arrayList == null) {
            ae.I = new ArrayList();
        }
        for (String str : this.a) {
            arrayList2 = ae.I;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ae aeVar = (ae) it.next();
                LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) aeVar.be();
                if (launcherShortcut3DInfo.iconResource != null && launcherShortcut3DInfo.packagename.equals(str)) {
                    aeVar.aJ();
                    aeVar.aX();
                }
            }
        }
    }
}
