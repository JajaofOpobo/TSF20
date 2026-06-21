package com.tsf.shell.e.f;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l {
    private static com.tsf.shell.e.a.a.a c;
    private static ArrayList d = new ArrayList();
    public static int a = 0;
    public static ArrayList b = new ArrayList();

    public static void a() {
        d.add(new m());
        d.add(new m());
    }

    public static void a(int i, int i2, int i3, int i4) {
        g();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            ((m) it.next()).b();
        }
    }

    public static void a(Object obj, int i) {
        if (b(obj) == null) {
            b.add(new n(obj, i));
            b();
        }
    }

    public static void b() {
        Iterator it = b.iterator();
        int i = 0;
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar.b > i) {
                i = nVar.b;
            }
        }
        a = i;
    }

    public static void a(Object obj) {
        n b2 = b(obj);
        if (b2 != null) {
            b.remove(b2);
            b();
        }
        int size = d.size();
        for (int i = a; i < size; i++) {
            ((m) d.get(i)).b();
        }
    }

    public static n b(Object obj) {
        Iterator it = b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar.a == obj) {
                return nVar;
            }
        }
        return null;
    }

    public static com.tsf.shell.e.a.a.a c() {
        if (c == null) {
            c = com.tsf.shell.manager.a.t.a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g() {
        if (c != null) {
            com.tsf.shell.manager.a.t.a(c);
            c = null;
        }
    }

    private static boolean d(Object obj) {
        return (obj instanceof g) && ((g) obj).parent() == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m c(Object obj) {
        m mVar;
        m mVar2 = null;
        Iterator it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            m mVar3 = (m) it.next();
            if (mVar3.a == obj) {
                mVar2 = mVar3;
                break;
            }
        }
        Iterator it2 = d.iterator();
        while (it2.hasNext()) {
            mVar = (m) it2.next();
            if (mVar.a == null || d(mVar.a)) {
            }
        }
        mVar = mVar2;
        if (mVar == null) {
            mVar = (m) d.get(1);
        }
        mVar.a();
        return mVar;
    }

    public static void d() {
        Iterator it = d.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a = null;
        }
    }
}
