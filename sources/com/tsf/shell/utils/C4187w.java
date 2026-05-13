package com.tsf.shell.utils;

import android.os.Vibrator;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p168b.C3430e;
/* renamed from: com.tsf.shell.utils.w */
/* loaded from: classes.dex */
public class C4187w {

    /* renamed from: a */
    public static Runnable f13503a;

    /* renamed from: b */
    private static Vibrator f13504b = (Vibrator) Home.m6177b().getSystemService("vibrator");

    /* renamed from: a */
    public static void m616a() {
        if (C3430e.m2520ae()) {
            f13504b.vibrate(8L);
        }
    }

    /* renamed from: a */
    public static void m615a(int i) {
        if (C3430e.m2520ae()) {
            f13504b.vibrate(i);
        }
    }

    /* renamed from: b */
    public static void m614b() {
        if (C3430e.m2520ae()) {
            if (f13503a == null) {
                f13503a = new Runnable() { // from class: com.tsf.shell.utils.w.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0853a.m10854f().playSoundEffect(0);
                    }
                };
            }
            C0853a.m10865a().m10588a(f13503a);
        }
    }
}
