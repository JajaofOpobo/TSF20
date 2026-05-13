package com.tsf.shell.p096f.p131f;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p097a.p098a.C2273a;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.j */
/* loaded from: classes.dex */
public class C2942j {

    /* renamed from: c */
    private static C2273a f9571c;

    /* renamed from: d */
    private static ArrayList<C2943a> f9572d = new ArrayList<>();

    /* renamed from: a */
    public static int f9569a = 0;

    /* renamed from: b */
    public static ArrayList<C2944b> f9570b = new ArrayList<>();

    /* renamed from: a */
    public static void m4165a() {
        f9572d.add(new C2943a());
        f9572d.add(new C2943a());
    }

    /* renamed from: a */
    public static void m4164a(int i, int i2, int i3, int i4) {
        m4153g();
        Iterator<C2943a> it = f9572d.iterator();
        while (it.hasNext()) {
            it.next().m4151b();
        }
    }

    /* renamed from: a */
    public static void m4162a(Object obj, int i) {
        if (m4160b(obj) == null) {
            f9570b.add(new C2944b(obj, i));
            m4161b();
        }
    }

    /* renamed from: b */
    public static void m4161b() {
        int i = 0;
        Iterator<C2944b> it = f9570b.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                C2944b next = it.next();
                i = next.f9576b > i2 ? next.f9576b : i2;
            } else {
                f9569a = i2;
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m4163a(Object obj) {
        C2944b m4160b = m4160b(obj);
        if (m4160b != null) {
            f9570b.remove(m4160b);
            m4161b();
        }
        int size = f9572d.size();
        for (int i = f9569a; i < size; i++) {
            f9572d.get(i).m4151b();
        }
    }

    /* renamed from: b */
    public static C2944b m4160b(Object obj) {
        Iterator<C2944b> it = f9570b.iterator();
        while (it.hasNext()) {
            C2944b next = it.next();
            if (next.f9575a == obj) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.f.j$b */
    /* loaded from: classes.dex */
    public static class C2944b {

        /* renamed from: a */
        public Object f9575a;

        /* renamed from: b */
        public int f9576b;

        public C2944b(Object obj, int i) {
            this.f9575a = obj;
            this.f9576b = i;
        }
    }

    /* renamed from: com.tsf.shell.f.f.j$a */
    /* loaded from: classes.dex */
    public static class C2943a {

        /* renamed from: a */
        public Object f9573a;

        /* renamed from: b */
        public TextureElement f9574b;

        /* renamed from: a */
        public void m4152a() {
            if (this.f9574b == null) {
                this.f9574b = C0853a.m10853g().m10545a(C0892a.f2555F, C0892a.f2556G, false);
            }
        }

        /* renamed from: b */
        public void m4151b() {
            boolean z;
            this.f9573a = null;
            if (this.f9574b != null) {
                C0853a.m10853g().m10543a(this.f9574b);
            }
            this.f9574b = null;
            Iterator it = C2942j.f9572d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (((C2943a) it.next()).f9574b != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                C2942j.m4153g();
            }
        }
    }

    /* renamed from: c */
    public static C2273a m4159c() {
        if (f9571c == null) {
            f9571c = C3359a.f11106t.m5977a(C0892a.f2555F, C0892a.f2556G);
        }
        return f9571c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static void m4153g() {
        if (f9571c != null) {
            C3359a.f11106t.m5976a(f9571c);
            f9571c = null;
        }
    }

    /* renamed from: d */
    private static boolean m4156d(Object obj) {
        return (obj instanceof C2932g) && ((C2932g) obj).parent() == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tsf.shell.p096f.p131f.C2942j.C2943a m4158c(java.lang.Object r4) {
        /*
            r1 = 0
            java.util.ArrayList<com.tsf.shell.f.f.j$a> r0 = com.tsf.shell.p096f.p131f.C2942j.f9572d
            java.util.Iterator r2 = r0.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            com.tsf.shell.f.f.j$a r0 = (com.tsf.shell.p096f.p131f.C2942j.C2943a) r0
            java.lang.Object r3 = r0.f9573a
            if (r3 != r4) goto L7
            r1 = r0
        L18:
            java.util.ArrayList<com.tsf.shell.f.f.j$a> r0 = com.tsf.shell.p096f.p131f.C2942j.f9572d
            java.util.Iterator r2 = r0.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r2.next()
            com.tsf.shell.f.f.j$a r0 = (com.tsf.shell.p096f.p131f.C2942j.C2943a) r0
            java.lang.Object r3 = r0.f9573a
            if (r3 == 0) goto L36
            java.lang.Object r3 = r0.f9573a
            boolean r3 = m4156d(r3)
            if (r3 == 0) goto L1e
        L36:
            if (r1 != 0) goto L47
        L38:
            if (r0 != 0) goto L43
            java.util.ArrayList<com.tsf.shell.f.f.j$a> r0 = com.tsf.shell.p096f.p131f.C2942j.f9572d
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            com.tsf.shell.f.f.j$a r0 = (com.tsf.shell.p096f.p131f.C2942j.C2943a) r0
        L43:
            r0.m4152a()
            return r0
        L47:
            r0 = r1
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.p096f.p131f.C2942j.m4158c(java.lang.Object):com.tsf.shell.f.f.j$a");
    }

    /* renamed from: d */
    public static void m4157d() {
        Iterator<C2943a> it = f9572d.iterator();
        while (it.hasNext()) {
            it.next().f9573a = null;
        }
    }
}
