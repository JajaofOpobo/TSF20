package com.tsf.shell.manager.p;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {
    public static int a = 100;
    public static int b = ThemeIconDesignerMenu.NOTIF_POINT_VERSION_CODE_110;
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
    private d p = new d();
    private ArrayList o = new ArrayList();

    public d a() {
        return this.p;
    }

    public g a(final com.tsf.shell.e.e.g.a.d dVar, int i2) {
        g a2 = com.tsf.shell.manager.a.a.a(i2);
        if (a2.a()) {
            dVar.getTitleIcon().a();
            a2.a(new h() { // from class: com.tsf.shell.manager.p.f.1
                @Override // com.tsf.shell.manager.p.h
                public void a() {
                    dVar.getTitleIcon().b();
                }
            });
        }
        return a2;
    }

    public f() {
        this.o.add(b());
        this.o.add(e());
        this.o.add(f());
        this.o.add(c());
        g gVar = new g();
        gVar.a = k;
        gVar.c = 125;
        this.o.add(gVar);
        g gVar2 = new g();
        gVar2.a = n;
        gVar2.c = 132;
        this.o.add(gVar2);
        a(this.o);
    }

    private g b() {
        g gVar = new g();
        gVar.a = a;
        g gVar2 = new g();
        gVar2.a = b;
        gVar2.c = ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130;
        gVar.a(gVar2);
        gVar.a(d());
        return gVar;
    }

    private g c() {
        g gVar = new g();
        gVar.a = l;
        g gVar2 = new g();
        gVar2.c = 126;
        gVar2.a = m;
        gVar.a(gVar2);
        return gVar;
    }

    private void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar.d.isEmpty()) {
                if (gVar.a != 0) {
                    gVar.b = this.p.a(gVar.a);
                }
            } else {
                a(gVar.d);
            }
        }
    }

    private g d() {
        g gVar = new g();
        gVar.a = c;
        g gVar2 = new g();
        gVar2.c = ThemeIconDesignerMenu.NOTIF_POINT_VERSION_CODE_110;
        gVar2.a = d;
        gVar.a(gVar2);
        return gVar;
    }

    private g e() {
        g gVar = new g();
        gVar.a = e;
        g gVar2 = new g();
        gVar2.a = f;
        gVar2.c = ThemeIconDesignerMenu.NOTIF_POINT_VERSION_CODE_110;
        gVar.a(gVar2);
        g gVar3 = new g();
        gVar3.a = g;
        gVar3.c = 120;
        gVar.a(gVar3);
        g gVar4 = new g();
        gVar4.a = h;
        gVar4.c = 122;
        gVar.a(gVar4);
        return gVar;
    }

    private g f() {
        g gVar = new g();
        gVar.a = i;
        g gVar2 = new g();
        gVar2.a = j;
        gVar2.c = ThemeIconDesignerMenu.NOTIF_POINT_VERSION_CODE_110;
        gVar.a(gVar2);
        return gVar;
    }

    public g a(int i2) {
        return a(i2, this.o);
    }

    public g a(int i2, ArrayList arrayList) {
        g a2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar.a == i2) {
                return gVar;
            }
            if (!gVar.d.isEmpty() && (a2 = a(i2, gVar.d)) != null) {
                return a2;
            }
        }
        return null;
    }
}
