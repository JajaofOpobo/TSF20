package com.tsf.shell.e.f.a.a;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends ArrayList {
    public void a(c cVar) {
        String ch = Character.toString(b.a(cVar.p_()));
        Iterator it = iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (ch.equals(eVar.a())) {
                eVar.b().add(cVar);
                return;
            }
        }
        e eVar2 = new e(ch);
        eVar2.b().add(cVar);
        add(eVar2);
    }
}
