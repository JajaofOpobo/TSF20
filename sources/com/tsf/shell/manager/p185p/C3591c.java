package com.tsf.shell.manager.p185p;

import android.content.Intent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.activity.tips.TipsDialogActivity;
import com.tsf.shell.manager.p168b.C3430e;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.p.c */
/* loaded from: classes.dex */
public class C3591c implements C0913a.InterfaceC0914a {

    /* renamed from: a */
    public static C3591c f11904a;

    /* renamed from: b */
    public static C3569a f11905b;

    /* renamed from: c */
    private static ArrayList<C3599f> f11906c;

    /* renamed from: d */
    private static ArrayList<Integer> f11907d;

    /* renamed from: e */
    private static boolean f11908e = false;

    /* renamed from: f */
    private static int f11909f;

    /* renamed from: g */
    private static int f11910g;

    /* renamed from: a */
    public static void m1945a() {
        if (f11906c == null) {
            f11904a = new C3591c();
            f11905b = new C3569a();
            f11906c = new ArrayList<>();
            f11907d = new ArrayList<>();
            f11906c.add(new C3599f(1, true));
            f11906c.add(new C3599f(2, true));
            f11906c.add(new C3599f(5, true));
            f11906c.add(new C3599f(12, true));
            f11906c.add(new C3599f(13, true));
            f11906c.add(new C3599f(14, true));
            f11906c.add(new C3599f(6, true));
            for (String str : C3430e.m2434p().split("/")) {
                try {
                    String[] split = str.split(",");
                    m1941a(Integer.parseInt(split[0]), split[1].equals("1"), false);
                } catch (Exception e) {
                }
            }
        }
        m1938c();
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1 || i == f11909f) {
        }
        m1942a(f11910g, false);
        f11908e = false;
        if (!f11907d.isEmpty()) {
            m1944a(f11907d.remove(0).intValue());
        }
    }

    /* renamed from: a */
    public static void m1944a(int i) {
        m1943a(i, 0);
    }

    /* renamed from: a */
    public static void m1943a(final int i, int i2) {
        if (Home.m6177b().m6172d() && m1939b(i) && i != -1) {
            if (f11908e) {
                if (!f11907d.contains(Integer.valueOf(i))) {
                    f11907d.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            f11908e = true;
            f11910g = i;
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.p.c.1
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent();
                    intent.setClass(C0853a.m10856d(), TipsDialogActivity.class);
                    intent.putExtra("type", i);
                    int unused = C3591c.f11909f = Home.m6177b().m6183a(intent, C3591c.f11904a, C1306b.C1307a.app_alpha_enter, C1306b.C1307a.app_alpha_exit);
                }
            };
            if (i2 == 0) {
                C0853a.m10865a().m10588a(runnable);
            } else {
                C0853a.m10865a().m10587a(runnable, i2);
            }
        }
    }

    /* renamed from: b */
    public static void m1940b() {
        C3599f c3599f;
        int size = f11906c.size();
        int i = 0;
        String str = "";
        while (i < size) {
            String str2 = str + c3599f.f11942a + "," + (f11906c.get(i).f11943b ? "1" : "0");
            if (i != size - 1) {
                str2 = str2 + "/";
            }
            i++;
            str = str2;
        }
        C3430e.m2485c(str);
    }

    /* renamed from: a */
    public static void m1942a(int i, boolean z) {
        m1941a(i, z, true);
    }

    /* renamed from: c */
    public static void m1938c() {
    }

    /* renamed from: a */
    public static void m1941a(int i, boolean z, boolean z2) {
        int size = f11906c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3599f c3599f = f11906c.get(i2);
            if (c3599f.f11942a == i) {
                c3599f.f11943b = z;
                if (z2) {
                    m1940b();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: b */
    public static boolean m1939b(int i) {
        int size = f11906c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3599f c3599f = f11906c.get(i2);
            if (c3599f.f11942a == i) {
                return c3599f.f11943b;
            }
        }
        return false;
    }
}
