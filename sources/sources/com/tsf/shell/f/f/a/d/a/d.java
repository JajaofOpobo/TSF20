package com.tsf.shell.f.f.a.d.a;

import com.tsf.b;
import java.util.Comparator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends c {
    public d(int i) {
        super(b.d.drawer_sort_name, b.i.text_sort_alphabetical);
        this.a = i;
        this.b = new Comparator<com.tsf.shell.f.i.b>() { // from class: com.tsf.shell.f.f.a.d.a.d.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(com.tsf.shell.f.i.b bVar, com.tsf.shell.f.i.b bVar2) {
                int i2 = bVar.K().index;
                int i3 = bVar2.K().index;
                if (i2 > i3) {
                    return 1;
                }
                if (i2 < i3) {
                    return -1;
                }
                return 0;
            }
        };
    }
}
