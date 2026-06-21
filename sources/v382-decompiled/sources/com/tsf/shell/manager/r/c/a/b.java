package com.tsf.shell.manager.r.c.a;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.e.i.c.i;

/* loaded from: classes.dex */
public abstract class b {
    private int a = 0;

    public abstract void a(ItemInfo itemInfo);

    public abstract void a(com.tsf.shell.e.i.c cVar, i iVar);

    public void b(com.tsf.shell.e.i.c cVar, i iVar) {
        this.a++;
        a(cVar, iVar);
    }

    public void b(ItemInfo itemInfo) {
        this.a++;
        a(itemInfo);
    }
}
