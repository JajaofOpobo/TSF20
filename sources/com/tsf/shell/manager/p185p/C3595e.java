package com.tsf.shell.manager.p185p;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.p.e */
/* loaded from: classes.dex */
public class C3595e {

    /* renamed from: a */
    public static int f11916a = 100;

    /* renamed from: b */
    public static int f11917b = 110;

    /* renamed from: c */
    public static int f11918c = 120;

    /* renamed from: d */
    public static int f11919d = 121;

    /* renamed from: e */
    public static int f11920e = VEasing.Back.easeIn;

    /* renamed from: f */
    public static int f11921f = 210;

    /* renamed from: g */
    public static int f11922g = 220;

    /* renamed from: h */
    public static int f11923h = 230;

    /* renamed from: i */
    public static int f11924i = 300;

    /* renamed from: j */
    public static int f11925j = 310;

    /* renamed from: k */
    public static int f11926k = 500;

    /* renamed from: l */
    public static int f11927l = 600;

    /* renamed from: m */
    public static int f11928m = 610;

    /* renamed from: n */
    public static int f11929n = 700;

    /* renamed from: o */
    public static int f11930o = 800;

    /* renamed from: p */
    public static int f11931p = 810;

    /* renamed from: r */
    private C3593d f11933r = new C3593d();

    /* renamed from: q */
    private ArrayList<C3597a> f11932q = new ArrayList<>();

    /* renamed from: com.tsf.shell.manager.p.e$a */
    /* loaded from: classes.dex */
    public static class C3597a {

        /* renamed from: a */
        public int f11936a;

        /* renamed from: b */
        public int f11937b;

        /* renamed from: c */
        public int f11938c;

        /* renamed from: d */
        public ArrayList<C3597a> f11939d = new ArrayList<>();

        /* renamed from: e */
        public ArrayList<C3598a> f11940e = new ArrayList<>();

        /* renamed from: f */
        private C3597a f11941f;

        /* renamed from: com.tsf.shell.manager.p.e$a$a */
        /* loaded from: classes.dex */
        public static class C3598a {
            /* renamed from: a */
            public void mo720a() {
            }
        }

        /* renamed from: a */
        public boolean m1919a() {
            if (this.f11939d.isEmpty()) {
                return this.f11938c > this.f11937b;
            }
            Iterator<C3597a> it = this.f11939d.iterator();
            while (it.hasNext()) {
                if (it.next().m1919a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public void m1918a(C3598a c3598a) {
            if (!this.f11940e.contains(c3598a)) {
                this.f11940e.add(c3598a);
            }
        }

        /* renamed from: b */
        public void m1916b() {
            if (!this.f11939d.isEmpty()) {
                if (this.f11941f != null) {
                    this.f11941f.m1916b();
                }
                m1914c();
            } else if (this.f11937b != this.f11938c) {
                boolean z = false;
                if (this.f11941f != null) {
                    z = this.f11941f.m1919a();
                }
                this.f11937b = this.f11938c;
                C3359a.f11087a.m1930a().m1934a(this.f11936a, this.f11937b);
                m1914c();
                if (this.f11941f != null && this.f11941f.m1919a() != z) {
                    this.f11941f.m1916b();
                }
            }
        }

        /* renamed from: c */
        public void m1914c() {
            Iterator<C3598a> it = this.f11940e.iterator();
            while (it.hasNext()) {
                it.next().mo720a();
            }
        }

        /* renamed from: a */
        public void m1917a(C3597a c3597a) {
            this.f11939d.add(c3597a);
            c3597a.m1915b(this);
        }

        /* renamed from: b */
        public void m1915b(C3597a c3597a) {
            this.f11941f = c3597a;
        }
    }

    /* renamed from: a */
    public C3593d m1930a() {
        return this.f11933r;
    }

    /* renamed from: a */
    public C3597a m1927a(final C2578b c2578b, int i) {
        C3597a m1929a = C3359a.f11087a.m1929a(i);
        if (m1929a.m1919a()) {
            c2578b.getTitleIcon().m5214a();
            m1929a.m1918a(new C3597a.C3598a() { // from class: com.tsf.shell.manager.p.e.1
                @Override // com.tsf.shell.manager.p185p.C3595e.C3597a.C3598a
                /* renamed from: a */
                public void mo720a() {
                    c2578b.getTitleIcon().m5212b();
                }
            });
        }
        return m1929a;
    }

    public C3595e() {
        this.f11932q.add(m1925b());
        this.f11932q.add(m1921f());
        this.f11932q.add(m1920g());
        this.f11932q.add(m1924c());
        this.f11932q.add(m1923d());
        C3597a c3597a = new C3597a();
        c3597a.f11936a = f11926k;
        c3597a.f11938c = 125;
        this.f11932q.add(c3597a);
        C3597a c3597a2 = new C3597a();
        c3597a2.f11936a = f11929n;
        c3597a2.f11938c = 132;
        this.f11932q.add(c3597a2);
        m1926a(this.f11932q);
    }

    /* renamed from: b */
    private C3597a m1925b() {
        C3597a c3597a = new C3597a();
        c3597a.f11936a = f11916a;
        C3597a c3597a2 = new C3597a();
        c3597a2.f11936a = f11917b;
        c3597a2.f11938c = ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130;
        c3597a.m1917a(c3597a2);
        c3597a.m1917a(m1922e());
        return c3597a;
    }

    /* renamed from: c */
    private C3597a m1924c() {
        C3597a c3597a = new C3597a();
        c3597a.f11936a = f11930o;
        C3597a c3597a2 = new C3597a();
        c3597a2.f11936a = f11931p;
        c3597a2.f11938c = 135;
        c3597a.m1917a(c3597a2);
        return c3597a;
    }

    /* renamed from: d */
    private C3597a m1923d() {
        C3597a c3597a = new C3597a();
        c3597a.f11936a = f11927l;
        C3597a c3597a2 = new C3597a();
        c3597a2.f11938c = 126;
        c3597a2.f11936a = f11928m;
        c3597a.m1917a(c3597a2);
        return c3597a;
    }

    /* renamed from: a */
    private void m1926a(ArrayList<C3597a> arrayList) {
        Iterator<C3597a> it = arrayList.iterator();
        while (it.hasNext()) {
            C3597a next = it.next();
            if (next.f11939d.isEmpty()) {
                if (next.f11936a != 0) {
                    next.f11937b = this.f11933r.m1935a(next.f11936a);
                }
            } else {
                m1926a(next.f11939d);
            }
        }
    }

    /* renamed from: e */
    private C3597a m1922e() {
        C3597a c3597a = new C3597a();
        c3597a.f11936a = f11918c;
        C3597a c3597a2 = new C3597a();
        c3597a2.f11938c = 110;
        c3597a2.f11936a = f11919d;
        c3597a.m1917a(c3597a2);
        return c3597a;
    }

    /* renamed from: f */
    private C3597a m1921f() {
        C3597a c3597a = new C3597a();
        c3597a.f11936a = f11920e;
        C3597a c3597a2 = new C3597a();
        c3597a2.f11936a = f11921f;
        c3597a2.f11938c = 110;
        c3597a.m1917a(c3597a2);
        C3597a c3597a3 = new C3597a();
        c3597a3.f11936a = f11922g;
        c3597a3.f11938c = 120;
        c3597a.m1917a(c3597a3);
        C3597a c3597a4 = new C3597a();
        c3597a4.f11936a = f11923h;
        c3597a4.f11938c = 122;
        c3597a.m1917a(c3597a4);
        return c3597a;
    }

    /* renamed from: g */
    private C3597a m1920g() {
        C3597a c3597a = new C3597a();
        c3597a.f11936a = f11924i;
        C3597a c3597a2 = new C3597a();
        c3597a2.f11936a = f11925j;
        c3597a2.f11938c = 110;
        c3597a.m1917a(c3597a2);
        return c3597a;
    }

    /* renamed from: a */
    public C3597a m1929a(int i) {
        return m1928a(i, this.f11932q);
    }

    /* renamed from: a */
    public C3597a m1928a(int i, ArrayList<C3597a> arrayList) {
        C3597a m1928a;
        Iterator<C3597a> it = arrayList.iterator();
        while (it.hasNext()) {
            C3597a next = it.next();
            if (next.f11936a != i) {
                if (!next.f11939d.isEmpty() && (m1928a = m1928a(i, next.f11939d)) != null) {
                    return m1928a;
                }
            } else {
                return next;
            }
        }
        return null;
    }
}
