package com.tsf.shell.f.f.a.d.a;

import com.censivn.C3DEngine.b.f.i;
import com.tsf.b;
import com.tsf.shell.f.i.b.e.g;
import java.util.Comparator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends c {
    public f(int i) {
        super(b.d.drawer_sort_time_latest, b.i.text_sort_latest_installed);
        this.a = i;
        this.b = new Comparator<com.tsf.shell.f.i.b>() { // from class: com.tsf.shell.f.f.a.d.a.f.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(com.tsf.shell.f.i.b bVar, com.tsf.shell.f.i.b bVar2) {
                if ((bVar instanceof com.tsf.shell.f.i.b.d.b) && (bVar2 instanceof com.tsf.shell.f.i.b.d.b)) {
                    return 0;
                }
                if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
                    return -1;
                }
                if (!(bVar2 instanceof com.tsf.shell.f.i.b.d.b) && bVar.s() <= bVar2.s()) {
                    return bVar.s() < bVar2.s() ? -1 : 0;
                }
                return 1;
            }
        };
        this.c = new Comparator<i>() { // from class: com.tsf.shell.f.f.a.d.a.f.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(i iVar, i iVar2) {
                if ((iVar instanceof g) && (iVar2 instanceof g)) {
                    g gVar = (g) iVar;
                    g gVar2 = (g) iVar2;
                    if (gVar.s() > gVar2.s()) {
                        return 1;
                    }
                    if (gVar.s() < gVar2.s()) {
                        return -1;
                    }
                }
                return 0;
            }
        };
    }
}
