package com.tsf.shell.utils;

import android.os.Vibrator;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class w {
    public static Runnable a;
    private static Vibrator b = (Vibrator) Home.b().getSystemService("vibrator");

    public static void a() {
        if (com.tsf.shell.manager.b.e.ae()) {
            b.vibrate(8L);
        }
    }

    public static void a(int i) {
        if (com.tsf.shell.manager.b.e.ae()) {
            b.vibrate(i);
        }
    }

    public static void b() {
        if (com.tsf.shell.manager.b.e.ae()) {
            if (a == null) {
                a = new Runnable() { // from class: com.tsf.shell.utils.w.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.censivn.C3DEngine.a.f().playSoundEffect(0);
                    }
                };
            }
            com.censivn.C3DEngine.a.a().a(a);
        }
    }
}
