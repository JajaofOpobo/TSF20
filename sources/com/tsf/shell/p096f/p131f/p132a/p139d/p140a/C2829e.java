package com.tsf.shell.p096f.p131f.p132a.p139d.p140a;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.Comparator;
/* renamed from: com.tsf.shell.f.f.a.d.a.e */
/* loaded from: classes.dex */
public class C2829e extends C2826c {
    public C2829e(int i) {
        super(C1306b.C1310d.drawer_sort_time_earliest, C1306b.C1315i.text_sort_earliest_installed);
        this.f9202a = i;
        this.f9203b = new Comparator<C3112b>() { // from class: com.tsf.shell.f.f.a.d.a.e.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(C3112b c3112b, C3112b c3112b2) {
                if ((c3112b instanceof C3145b) && (c3112b2 instanceof C3145b)) {
                    return 0;
                }
                if (c3112b instanceof C3145b) {
                    return -1;
                }
                if (c3112b2 instanceof C3145b) {
                    return 1;
                }
                if (c3112b.mo3098s() > c3112b2.mo3098s()) {
                    return -1;
                }
                return c3112b.mo3098s() < c3112b2.mo3098s() ? 1 : 0;
            }
        };
        this.f9204c = new Comparator<C0975i>() { // from class: com.tsf.shell.f.f.a.d.a.e.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(C0975i c0975i, C0975i c0975i2) {
                if ((c0975i instanceof C3222g) && (c0975i2 instanceof C3222g)) {
                    C3222g c3222g = (C3222g) c0975i;
                    C3222g c3222g2 = (C3222g) c0975i2;
                    if (c3222g.mo3098s() > c3222g2.mo3098s()) {
                        return -1;
                    }
                    if (c3222g.mo3098s() < c3222g2.mo3098s()) {
                        return 1;
                    }
                }
                return 0;
            }
        };
    }
}
