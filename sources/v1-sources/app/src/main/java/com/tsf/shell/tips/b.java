package com.tsf.shell.tips;

import android.content.Intent;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.R;
import com.tsf.shell.a.t;
import com.tsf.shell.au;
import com.tsf.shell.setting.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements com.tsf.shell.a {
    public static b a;
    private static ArrayList b;
    private static ArrayList c;
    private static boolean d = false;
    private static e e;
    private static int f;
    private static int g;

    public static void a() {
        if (b == null) {
            a = new b();
            b = new ArrayList();
            c = new ArrayList();
            b.add(new d(1));
            b.add(new d(2));
            b.add(new d(3));
            b.add(new d(4));
            b.add(new d(5));
            b.add(new d(6));
            b.add(new d(7));
            b.add(new d(8));
            b.add(new d(9));
            b.add(new d(12));
            b.add(new d(13));
            for (String str : t.d().split("/")) {
                try {
                    String[] split = str.split(",");
                    a(Integer.parseInt(split[0]), split[1].equals("1"), false);
                } catch (Exception e2) {
                }
            }
        }
        f();
    }

    @Override // com.tsf.shell.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        a(g, false, true);
        d = false;
        if (!c.isEmpty()) {
            a(((Integer) c.remove(0)).intValue());
        }
    }

    public static void a(int i) {
        boolean z;
        int size = b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            d dVar = (d) b.get(i2);
            if (dVar.a == i) {
                z = dVar.b;
                break;
            }
            i2++;
        }
        if (z && i != -1) {
            if (d) {
                if (!c.contains(Integer.valueOf(i))) {
                    c.add(Integer.valueOf(i));
                }
            } else {
                d = true;
                g = i;
                c cVar = new c(i);
                com.censivn.C3DEngine.a.a();
                w.a(cVar);
            }
        }
    }

    private static void e() {
        int size = b.size();
        int i = 0;
        String str = "";
        while (i < size) {
            d dVar = (d) b.get(i);
            String str2 = String.valueOf(str) + dVar.a + "," + (dVar.b ? "1" : "0");
            if (i != size - 1) {
                str2 = String.valueOf(str2) + "/";
            }
            i++;
            str = str2;
        }
        t.b(str);
    }

    public static void a(e eVar) {
        e = eVar;
    }

    public static boolean b() {
        int size = b.size();
        for (int i = 0; i < size; i++) {
            if (((d) b.get(i)).b) {
                return true;
            }
        }
        return false;
    }

    private static void f() {
        if (e != null && b != null) {
            if (b()) {
                e.e(1);
            } else {
                e.e(0);
            }
        }
    }

    public static void c() {
        int size = b.size();
        for (int i = 0; i < size; i++) {
            ((d) b.get(i)).b = true;
        }
        e();
        f();
        au.a(R.string.tips_switch_on);
    }

    public static void d() {
        int size = b.size();
        for (int i = 0; i < size; i++) {
            ((d) b.get(i)).b = false;
        }
        e();
        f();
    }

    private static void a(int i, boolean z, boolean z2) {
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) b.get(i2);
            if (dVar.a == i) {
                dVar.b = z;
                if (z2) {
                    e();
                    return;
                }
                return;
            }
        }
    }
}
