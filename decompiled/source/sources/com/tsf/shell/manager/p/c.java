package com.tsf.shell.manager.p;

import android.content.Intent;
import com.censivn.C3DEngine.b.c.a;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.activity.tips.TipsDialogActivity;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c implements a.InterfaceC0025a {
    public static c a;
    public static a b;
    private static ArrayList<f> c;
    private static ArrayList<Integer> d;
    private static boolean e = false;
    private static int f;
    private static int g;

    public static void a() {
        if (c == null) {
            a = new c();
            b = new a();
            c = new ArrayList<>();
            d = new ArrayList<>();
            c.add(new f(1, true));
            c.add(new f(2, true));
            c.add(new f(5, true));
            c.add(new f(12, true));
            c.add(new f(13, true));
            c.add(new f(14, true));
            c.add(new f(6, true));
            for (String str : com.tsf.shell.manager.b.e.p().split("/")) {
                try {
                    String[] split = str.split(",");
                    a(Integer.parseInt(split[0]), split[1].equals("1"), false);
                } catch (Exception e2) {
                }
            }
        }
        c();
    }

    @Override // com.censivn.C3DEngine.b.c.a.InterfaceC0025a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1 || i == f) {
        }
        a(g, false);
        e = false;
        if (!d.isEmpty()) {
            a(d.remove(0).intValue());
        }
    }

    public static void a(int i) {
        a(i, 0);
    }

    public static void a(final int i, int i2) {
        if (Home.b().d() && b(i) && i != -1) {
            if (e) {
                if (!d.contains(Integer.valueOf(i))) {
                    d.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            e = true;
            g = i;
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.p.c.1
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent();
                    intent.setClass(com.censivn.C3DEngine.a.d(), TipsDialogActivity.class);
                    intent.putExtra("type", i);
                    int unused = c.f = Home.b().a(intent, c.a, b.a.app_alpha_enter, b.a.app_alpha_exit);
                }
            };
            if (i2 == 0) {
                com.censivn.C3DEngine.a.a().a(runnable);
            } else {
                com.censivn.C3DEngine.a.a().a(runnable, i2);
            }
        }
    }

    public static void b() {
        f fVar;
        int size = c.size();
        int i = 0;
        String str = "";
        while (i < size) {
            String str2 = str + fVar.a + "," + (c.get(i).b ? "1" : "0");
            if (i != size - 1) {
                str2 = str2 + "/";
            }
            i++;
            str = str2;
        }
        com.tsf.shell.manager.b.e.c(str);
    }

    public static void a(int i, boolean z) {
        a(i, z, true);
    }

    public static void c() {
    }

    public static void a(int i, boolean z, boolean z2) {
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = c.get(i2);
            if (fVar.a == i) {
                fVar.b = z;
                if (z2) {
                    b();
                    return;
                }
                return;
            }
        }
    }

    public static boolean b(int i) {
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = c.get(i2);
            if (fVar.a == i) {
                return fVar.b;
            }
        }
        return false;
    }
}
