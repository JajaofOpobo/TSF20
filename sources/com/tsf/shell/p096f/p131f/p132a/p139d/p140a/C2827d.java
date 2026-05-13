package com.tsf.shell.p096f.p131f.p132a.p139d.p140a;

import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.C3112b;
import java.util.Comparator;
/* renamed from: com.tsf.shell.f.f.a.d.a.d */
/* loaded from: classes.dex */
public class C2827d extends C2826c {
    public C2827d(int i) {
        super(C1306b.C1310d.drawer_sort_name, C1306b.C1315i.text_sort_alphabetical);
        this.f9202a = i;
        this.f9203b = new Comparator<C3112b>() { // from class: com.tsf.shell.f.f.a.d.a.d.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(C3112b c3112b, C3112b c3112b2) {
                int i2 = c3112b.m3534K().index;
                int i3 = c3112b2.m3534K().index;
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
