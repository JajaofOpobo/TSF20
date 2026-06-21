package com.tsf.shell.manager.p;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    private ArrayList a = new ArrayList();

    public d() {
        try {
            for (String str : com.tsf.shell.manager.b.g.am().split(",")) {
                e a = a(str);
                if (a != null) {
                    a(a);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(e eVar) {
        if (b(eVar.a) == null) {
            this.a.add(eVar);
        }
    }

    private e b(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.a == i) {
                return eVar;
            }
        }
        return null;
    }

    private e a(String str) {
        e eVar;
        Exception e;
        try {
            String[] split = str.split(":");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                if (parseInt > 0 && parseInt2 > 0) {
                    eVar = new e(this);
                    try {
                        eVar.a = parseInt;
                        eVar.b = parseInt2;
                        return eVar;
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        return eVar;
                    }
                }
            }
            return null;
        } catch (Exception e3) {
            eVar = null;
            e = e3;
        }
    }

    public int a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.a == i) {
                return eVar.b;
            }
        }
        return 0;
    }

    public void a(int i, int i2) {
        e b = b(i);
        if (b == null) {
            b = new e(this);
            b.a = i;
            this.a.add(b);
        }
        b.b = i2;
        a();
    }

    private void a() {
        String str = "";
        Iterator it = this.a.iterator();
        while (true) {
            String str2 = str;
            if (it.hasNext()) {
                e eVar = (e) it.next();
                str = String.valueOf(str2) + eVar.a + ":" + eVar.b + ",";
            } else {
                com.tsf.shell.manager.b.g.j(str2);
                return;
            }
        }
    }
}
