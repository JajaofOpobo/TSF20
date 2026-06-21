package com.tsf.shell.e.f.a.d.a;

import com.tsf.shell.R;
import java.util.Comparator;

/* loaded from: classes.dex */
public class d extends c {
    public d(int i) {
        super(R.drawable.drawer_sort_name, R.string.text_sort_alphabetical);
        this.a = i;
        this.b = new Comparator() { // from class: com.tsf.shell.e.f.a.d.a.d.1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(com.tsf.shell.e.i.c cVar, com.tsf.shell.e.i.c cVar2) {
                int i2 = cVar.K().index;
                int i3 = cVar2.K().index;
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
