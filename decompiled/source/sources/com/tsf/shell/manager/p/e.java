package com.tsf.shell.manager.p;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e {
    public static int a = 100;
    public static int b = 110;
    public static int c = 120;
    public static int d = 121;
    public static int e = VEasing.Back.easeIn;
    public static int f = 210;
    public static int g = 220;
    public static int h = 230;
    public static int i = 300;
    public static int j = 310;
    public static int k = 500;
    public static int l = 600;
    public static int m = 610;
    public static int n = 700;
    public static int o = 800;
    public static int p = 810;
    private d r = new d();
    private ArrayList<a> q = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public int c;
        public ArrayList<a> d = new ArrayList<>();
        public ArrayList<C0142a> e = new ArrayList<>();
        private a f;

        /* renamed from: com.tsf.shell.manager.p.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0142a {
            public void a() {
            }
        }

        public boolean a() {
            if (this.d.isEmpty()) {
                return this.c > this.b;
            }
            Iterator<a> it = this.d.iterator();
            while (it.hasNext()) {
                if (it.next().a()) {
                    return true;
                }
            }
            return false;
        }

        public void a(C0142a c0142a) {
            if (!this.e.contains(c0142a)) {
                this.e.add(c0142a);
            }
        }

        public void b() {
            if (!this.d.isEmpty()) {
                if (this.f != null) {
                    this.f.b();
                }
                c();
            } else if (this.b != this.c) {
                boolean z = false;
                if (this.f != null) {
                    z = this.f.a();
                }
                this.b = this.c;
                com.tsf.shell.manager.a.a.a().a(this.a, this.b);
                c();
                if (this.f != null && this.f.a() != z) {
                    this.f.b();
                }
            }
        }

        public void c() {
            Iterator<C0142a> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public void a(a aVar) {
            this.d.add(aVar);
            aVar.b(this);
        }

        public void b(a aVar) {
            this.f = aVar;
        }
    }

    public d a() {
        return this.r;
    }

    public a a(final com.tsf.shell.f.e.g.a.b bVar, int i2) {
        a a2 = com.tsf.shell.manager.a.a.a(i2);
        if (a2.a()) {
            bVar.getTitleIcon().a();
            a2.a(new a.C0142a() { // from class: com.tsf.shell.manager.p.e.1
                @Override // com.tsf.shell.manager.p.e.a.C0142a
                public void a() {
                    bVar.getTitleIcon().b();
                }
            });
        }
        return a2;
    }

    public e() {
        this.q.add(b());
        this.q.add(f());
        this.q.add(g());
        this.q.add(c());
        this.q.add(d());
        a aVar = new a();
        aVar.a = k;
        aVar.c = 125;
        this.q.add(aVar);
        a aVar2 = new a();
        aVar2.a = n;
        aVar2.c = 132;
        this.q.add(aVar2);
        a(this.q);
    }

    private a b() {
        a aVar = new a();
        aVar.a = a;
        a aVar2 = new a();
        aVar2.a = b;
        aVar2.c = ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130;
        aVar.a(aVar2);
        aVar.a(e());
        return aVar;
    }

    private a c() {
        a aVar = new a();
        aVar.a = o;
        a aVar2 = new a();
        aVar2.a = p;
        aVar2.c = 135;
        aVar.a(aVar2);
        return aVar;
    }

    private a d() {
        a aVar = new a();
        aVar.a = l;
        a aVar2 = new a();
        aVar2.c = 126;
        aVar2.a = m;
        aVar.a(aVar2);
        return aVar;
    }

    private void a(ArrayList<a> arrayList) {
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.d.isEmpty()) {
                if (next.a != 0) {
                    next.b = this.r.a(next.a);
                }
            } else {
                a(next.d);
            }
        }
    }

    private a e() {
        a aVar = new a();
        aVar.a = c;
        a aVar2 = new a();
        aVar2.c = 110;
        aVar2.a = d;
        aVar.a(aVar2);
        return aVar;
    }

    private a f() {
        a aVar = new a();
        aVar.a = e;
        a aVar2 = new a();
        aVar2.a = f;
        aVar2.c = 110;
        aVar.a(aVar2);
        a aVar3 = new a();
        aVar3.a = g;
        aVar3.c = 120;
        aVar.a(aVar3);
        a aVar4 = new a();
        aVar4.a = h;
        aVar4.c = 122;
        aVar.a(aVar4);
        return aVar;
    }

    private a g() {
        a aVar = new a();
        aVar.a = i;
        a aVar2 = new a();
        aVar2.a = j;
        aVar2.c = 110;
        aVar.a(aVar2);
        return aVar;
    }

    public a a(int i2) {
        return a(i2, this.q);
    }

    public a a(int i2, ArrayList<a> arrayList) {
        a a2;
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.a != i2) {
                if (!next.d.isEmpty() && (a2 = a(i2, next.d)) != null) {
                    return a2;
                }
            } else {
                return next;
            }
        }
        return null;
    }
}
