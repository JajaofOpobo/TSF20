package com.tsf.shell.manager.o;

import com.tsf.shell.manager.b.ConfigManager;
import com.tsf.shell.manager.o.a.LabelManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ButtonPresetManager {
    public static A a;
    public static A b;
    public static A c;

    public static void a() {
        a = new ButtonMetrics(b(), 1.15f);
        c = new ButtonMetrics(1.15f, 1.15f);
        b = new ButtonMetrics(1.0f, 1.0f, 144, 144, 215, 42, 0);
        c.a aVar = new c.a();
        aVar.g = 30;
        ButtonPresetManager.ab = new com.tsf.shell.manager.o.a.TextLabelElement(0, aVar);
        com.tsf.shell.manager.o.a.LabelManager.a();
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
