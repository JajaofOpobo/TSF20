package com.tsf.shell.manager.o;

import com.tsf.shell.manager.b.e;
import com.tsf.shell.manager.o.a.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    public static a a;
    public static a b;
    public static a c;

    public static void a() {
        a = new a(b(), 1.15f);
        c = new a(1.15f, 1.15f);
        b = new a(1.0f, 1.0f, 144, 144, 215, 42, 0);
        c.a aVar = new c.a();
        aVar.g = 30;
        b.ab = new com.tsf.shell.manager.o.a.b(0, aVar);
        com.tsf.shell.manager.o.a.c.a();
    }

    public static float b() {
        return b(e.I());
    }

    public static void c() {
        e.e(1.15f);
    }

    public static void a(float f) {
        e.e(b(f));
    }

    public static float b(float f) {
        if (f < 0.7f) {
            return 0.7f;
        }
        if (f > 1.9f) {
            return 1.9f;
        }
        return f;
    }
}
