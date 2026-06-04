package com.censivn.C3DEngine.api.core;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ VObjectManager a;

    b(VObjectManager vObjectManager) {
        this.a = vObjectManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        StringBuilder sb = new StringBuilder("widget:");
        i = this.a.appWidgetId;
        StringBuilder append = sb.append(i).append(" destroy all object,total object:");
        i2 = this.a.count;
        append.append(i2).toString();
        arrayList = this.a.mObjectList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((VObject3d) it.next()).destroy();
        }
        arrayList2 = this.a.mObjectList;
        arrayList2.clear();
    }
}
