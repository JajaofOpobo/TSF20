package com.tsf.shell.manager.p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private ArrayList<a> a = new ArrayList<>();

    class a {
        public int a;
        public int b;

        a() {
        }
    }

    public d() {
        try {
            for (String str : com.tsf.shell.manager.b.e.ao().split(",")) {
                a aVarA = a(str);
                if (aVarA != null) {
                    a(aVarA);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(a aVar) {
        if (b(aVar.a) == null) {
            this.a.add(aVar);
        }
    }

    private a b(int i) {
        for (a aVar : this.a) {
            if (aVar.a == i) {
                return aVar;
            }
        }
        return null;
    }

    private a a(String str) {
        a aVar;
        Exception e;
        try {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 2) {
                int i = Integer.parseInt(strArrSplit[0]);
                int i2 = Integer.parseInt(strArrSplit[1]);
                if (i > 0 && i2 > 0) {
                    aVar = new a();
                    try {
                        aVar.a = i;
                        aVar.b = i2;
                        return aVar;
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        return aVar;
                    }
                }
            }
            return null;
        } catch (Exception e3) {
            aVar = null;
            e = e3;
        }
    }

    public int a(int i) {
        for (a aVar : this.a) {
            if (aVar.a == i) {
                return aVar.b;
            }
        }
        return 0;
    }

    public void a(int i, int i2) {
        a aVarB = b(i);
        if (aVarB == null) {
            aVarB = new a();
            aVarB.a = i;
            this.a.add(aVarB);
        }
        aVarB.b = i2;
        a();
    }

    private void a() {
        String str = "";
        Iterator<a> it = this.a.iterator();
        while (true) {
            String str2 = str;
            if (it.hasNext()) {
                a next = it.next();
                str = str2 + next.a + ":" + next.b + ",";
            } else {
                com.tsf.shell.manager.b.e.j(str2);
                return;
            }
        }
    }
}
