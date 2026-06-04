package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class m implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ com.tsf.shell.h.b b;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.s c;

    m(k kVar, com.tsf.shell.h.b bVar, com.tsf.shell.workspace3D.k.s sVar) {
        this.a = kVar;
        this.b = bVar;
        this.c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String packageName = this.b.c.getPackageName();
            z.a(this.c, com.censivn.C3DEngine.a.c().createPackageContext(packageName, 3), (String) this.b.a, packageName, this.b.c.getClassName());
            ArrayList arrayList = (ArrayList) this.c.c().clone();
            this.c.a();
            String str = "onWidgetUpdate delete old item size:" + arrayList.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
                String str2 = "onWidgetUpdate delete old item:" + arrayList;
                LauncherItem3DInfo be = jVar.be();
                k kVar = this.a;
                k.b(jVar);
                this.a.a(this.c, be, true, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
