package com.tsf.shell.manager.p185p;

import com.tsf.shell.manager.p168b.C3430e;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.p.d */
/* loaded from: classes.dex */
public class C3593d {

    /* renamed from: a */
    private ArrayList<C3594a> f11912a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.p.d$a */
    /* loaded from: classes.dex */
    public class C3594a {

        /* renamed from: a */
        public int f11913a;

        /* renamed from: b */
        public int f11914b;

        C3594a() {
        }
    }

    public C3593d() {
        try {
            for (String str : C3430e.m2510ao().split(",")) {
                C3594a m1932a = m1932a(str);
                if (m1932a != null) {
                    m1933a(m1932a);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1933a(C3594a c3594a) {
        if (m1931b(c3594a.f11913a) == null) {
            this.f11912a.add(c3594a);
        }
    }

    /* renamed from: b */
    private C3594a m1931b(int i) {
        Iterator<C3594a> it = this.f11912a.iterator();
        while (it.hasNext()) {
            C3594a next = it.next();
            if (next.f11913a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private C3594a m1932a(String str) {
        C3594a c3594a;
        Exception e;
        try {
            String[] split = str.split(":");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                if (parseInt > 0 && parseInt2 > 0) {
                    c3594a = new C3594a();
                    try {
                        c3594a.f11913a = parseInt;
                        c3594a.f11914b = parseInt2;
                        return c3594a;
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        return c3594a;
                    }
                }
            }
            return null;
        } catch (Exception e3) {
            c3594a = null;
            e = e3;
        }
    }

    /* renamed from: a */
    public int m1935a(int i) {
        Iterator<C3594a> it = this.f11912a.iterator();
        while (it.hasNext()) {
            C3594a next = it.next();
            if (next.f11913a == i) {
                return next.f11914b;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void m1934a(int i, int i2) {
        C3594a m1931b = m1931b(i);
        if (m1931b == null) {
            m1931b = new C3594a();
            m1931b.f11913a = i;
            this.f11912a.add(m1931b);
        }
        m1931b.f11914b = i2;
        m1936a();
    }

    /* renamed from: a */
    private void m1936a() {
        String str = "";
        Iterator<C3594a> it = this.f11912a.iterator();
        while (true) {
            String str2 = str;
            if (it.hasNext()) {
                C3594a next = it.next();
                str = str2 + next.f11913a + ":" + next.f11914b + ",";
            } else {
                C3430e.m2452j(str2);
                return;
            }
        }
    }
}
