package com.tsf.shell.manager.p;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class d {
    private ArrayList<a> a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {
        public int a;
        public int b;

        a() {
        }
    }

    public d() {
        try {
            for (String str : com.tsf.shell.manager.b.e.ao().split(",")) {
                a a2 = a(str);
                if (a2 != null) {
                    a(a2);
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
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.a == i) {
                return next;
            }
        }
        return null;
    }

    private a a(String str) {
        a aVar;
        Exception e;
        try {
            String[] split = str.split(":");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                if (parseInt > 0 && parseInt2 > 0) {
                    aVar = new a();
                    try {
                        aVar.a = parseInt;
                        aVar.b = parseInt2;
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
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.a == i) {
                return next.b;
            }
        }
        return 0;
    }

    public void a(int i, int i2) {
        a b = b(i);
        if (b == null) {
            b = new a();
            b.a = i;
            this.a.add(b);
        }
        b.b = i2;
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
