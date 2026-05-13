package com.tsf.shell.d;

import android.content.Context;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.b.e;
/* loaded from: classes.dex */
public class a {
    public static void a(Context context, boolean z) {
        e.z(z);
        com.tsf.shell.e.a(context, b.i.memory_pemanent, b.i.restart_warning, b.i.restart_now, b.i.restart_latter, new Runnable() { // from class: com.tsf.shell.d.a.1
            @Override // java.lang.Runnable
            public void run() {
                Home.b().a(300);
            }
        }, (Runnable) null);
    }
}
