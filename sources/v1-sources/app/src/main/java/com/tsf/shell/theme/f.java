package com.tsf.shell.theme;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class f implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ String[] b;

    f(c cVar, String[] strArr) {
        this.a = cVar;
        this.b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        n nVar;
        ThemeDetailedActivity themeDetailedActivity;
        ArrayList arrayList2;
        g gVar;
        for (String str : this.b) {
            arrayList = this.a.d;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n nVar2 = (n) it.next();
                if (j.a() != null) {
                    j.a().a(nVar2.g);
                }
                if (nVar2.g.equals(str)) {
                    nVar = this.a.g;
                    if (nVar2 == nVar) {
                        try {
                            themeDetailedActivity = this.a.h;
                            themeDetailedActivity.finish();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    arrayList2 = this.a.d;
                    arrayList2.remove(nVar2);
                    gVar = this.a.e;
                    gVar.notifyDataSetChanged();
                }
            }
        }
    }
}
