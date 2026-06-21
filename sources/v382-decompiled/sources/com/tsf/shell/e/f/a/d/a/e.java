package com.tsf.shell.e.f.a.d.a;

import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.R;
import com.tsf.shell.e.i.b.e.i;
import java.util.Comparator;

/* loaded from: classes.dex */
public class e extends c {
    public e(int i) {
        super(R.drawable.drawer_sort_time_earliest, R.string.text_sort_earliest_installed);
        this.a = i;
        this.b = new Comparator() { // from class: com.tsf.shell.e.f.a.d.a.e.1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(com.tsf.shell.e.i.c cVar, com.tsf.shell.e.i.c cVar2) {
                if ((cVar instanceof com.tsf.shell.e.i.b.d.b) && (cVar2 instanceof com.tsf.shell.e.i.b.d.b)) {
                    return 0;
                }
                if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
                    return -1;
                }
                if (cVar2 instanceof com.tsf.shell.e.i.b.d.b) {
                    return 1;
                }
                if (cVar.s() > cVar2.s()) {
                    return -1;
                }
                return cVar.s() < cVar2.s() ? 1 : 0;
            }
        };
        this.c = new Comparator() { // from class: com.tsf.shell.e.f.a.d.a.e.2
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(j jVar, j jVar2) {
                if ((jVar instanceof i) && (jVar2 instanceof i)) {
                    i iVar = (i) jVar;
                    i iVar2 = (i) jVar2;
                    if (iVar.s() > iVar2.s()) {
                        return -1;
                    }
                    if (iVar.s() < iVar2.s()) {
                        return 1;
                    }
                }
                return 0;
            }
        };
    }
}
