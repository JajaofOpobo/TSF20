package com.tsf.shell.c;

import android.content.Context;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.k;
import com.tsf.shell.manager.b.g;

/* loaded from: classes.dex */
public class a {
    public static void a(Context context, boolean z) {
        g.y(z);
        k.a(context, R.string.memory_pemanent, R.string.restart_warning, R.string.restart_now, R.string.restart_latter, new Runnable() { // from class: com.tsf.shell.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                Home.b().a(300);
            }
        }, (Runnable) null);
    }
}
