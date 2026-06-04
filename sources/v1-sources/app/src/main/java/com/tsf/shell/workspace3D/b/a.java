package com.tsf.shell.workspace3D.b;

import android.view.View;
import com.tsf.shell.h.b;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a {
    private Object b = new Object();
    private ArrayList a = new ArrayList();

    public final com.tsf.shell.workspace3D.k.a a(View view) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            com.tsf.shell.workspace3D.k.a aVar = (com.tsf.shell.workspace3D.k.a) this.a.get(i);
            if (aVar.C == view) {
                if (aVar.a) {
                    return null;
                }
                return aVar;
            }
        }
        return null;
    }

    public final void a(com.tsf.shell.workspace3D.k.a aVar) {
        if (!this.a.contains(aVar)) {
            synchronized (this.b) {
                this.a.add(aVar);
            }
        }
    }

    public final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String packageName = ((b) it.next()).c.getPackageName();
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                com.tsf.shell.workspace3D.k.a aVar = (com.tsf.shell.workspace3D.k.a) it2.next();
                if (packageName.equals(aVar.B)) {
                    aVar.e_();
                    ap.a(aVar, 1, null);
                }
            }
        }
    }

    public final void b(com.tsf.shell.workspace3D.k.a aVar) {
        synchronized (this.b) {
            this.a.remove(aVar);
        }
    }
}
