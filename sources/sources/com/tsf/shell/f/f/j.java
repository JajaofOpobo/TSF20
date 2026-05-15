package com.tsf.shell.f.f;

import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j {
    private static com.tsf.shell.f.a.a.a c;
    private static ArrayList<a> d = new ArrayList<>();
    public static int a = 0;
    public static ArrayList<b> b = new ArrayList<>();

    public static void a() {
        d.add(new a());
        d.add(new a());
    }

    public static void a(int i, int i2, int i3, int i4) {
        g();
        Iterator<a> it = d.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public static void a(Object obj, int i) {
        if (b(obj) == null) {
            b.add(new b(obj, i));
            b();
        }
    }

    public static void b() {
        int i = 0;
        Iterator<b> it = b.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                b next = it.next();
                i = next.b > i2 ? next.b : i2;
            } else {
                a = i2;
                return;
            }
        }
    }

    public static void a(Object obj) {
        b bVarB = b(obj);
        if (bVarB != null) {
            b.remove(bVarB);
            b();
        }
        int size = d.size();
        for (int i = a; i < size; i++) {
            d.get(i).b();
        }
    }

    public static b b(Object obj) {
        for (b bVar : b) {
            if (bVar.a == obj) {
                return bVar;
            }
        }
        return null;
    }

    static class b {
        public Object a;
        public int b;

        public b(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }
    }

    public static class a {
        public Object a;
        public TextureElement b;

        public void a() {
            if (this.b == null) {
                this.b = com.censivn.C3DEngine.a.g().a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, false);
            }
        }

        public void b() {
            boolean z;
            this.a = null;
            if (this.b != null) {
                com.censivn.C3DEngine.a.g().a(this.b);
            }
            this.b = null;
            Iterator it = j.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (((a) it.next()).b != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                j.g();
            }
        }
    }

    public static com.tsf.shell.f.a.a.a c() {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tsf.shell.f.f.j.a c(java.lang.Object r4) {
        /*
            r1 = 0
            java.util.ArrayList<com.tsf.shell.f.f.j$a> r0 = com.tsf.shell.f.f.j.d
            java.util.Iterator r2 = r0.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            com.tsf.shell.f.f.j$a r0 = (com.tsf.shell.f.f.j.a) r0
            java.lang.Object r3 = r0.a
            if (r3 != r4) goto L7
            r1 = r0
        L18:
            java.util.ArrayList<com.tsf.shell.f.f.j$a> r0 = com.tsf.shell.f.f.j.d
            java.util.Iterator r2 = r0.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r2.next()
            com.tsf.shell.f.f.j$a r0 = (com.tsf.shell.f.f.j.a) r0
            java.lang.Object r3 = r0.a
            if (r3 == 0) goto L36
            java.lang.Object r3 = r0.a
            boolean r3 = d(r3)
            if (r3 == 0) goto L1e
        L36:
            if (r1 != 0) goto L47
        L38:
            if (r0 != 0) goto L43
            java.util.ArrayList<com.tsf.shell.f.f.j$a> r0 = com.tsf.shell.f.f.j.d
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            com.tsf.shell.f.f.j$a r0 = (com.tsf.shell.f.f.j.a) r0
        L43:
            r0.a()
            return r0
        L47:
            r0 = r1
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.f.j.c(java.lang.Object):com.tsf.shell.f.f.j$a");
    }

    public static void d() {
        Iterator<a> it = d.iterator();
        while (it.hasNext()) {
            it.next().a = null;
        }
    }
}
