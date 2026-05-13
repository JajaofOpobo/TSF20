package com.tsf.shell.p096f.p153i.p155b.p159d;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.p119a.C2455c;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.b.d.c */
/* loaded from: classes.dex */
public class C3169c {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m3297a(C3145b c3145b) {
        if (C3359a.f11083A.m2213a()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C0975i> it = c3145b.m3376aG().iterator();
            while (it.hasNext()) {
                C0975i next = it.next();
                if (next instanceof C3222g) {
                    C3222g c3222g = (C3222g) next;
                    if (c3222g.m3106bd() != null) {
                        arrayList.add(c3222g.m3106bd());
                    }
                }
            }
            C2455c.m5526a(c3145b, arrayList);
        }
    }
}
