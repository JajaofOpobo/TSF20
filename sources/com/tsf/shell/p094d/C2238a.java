package com.tsf.shell.p094d;

import android.content.Context;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p168b.C3430e;
/* renamed from: com.tsf.shell.d.a */
/* loaded from: classes.dex */
public class C2238a {
    /* renamed from: a */
    public static void m6026a(Context context, boolean z) {
        C3430e.m2406z(z);
        C2244e.m6017a(context, C1306b.C1315i.memory_pemanent, C1306b.C1315i.restart_warning, C1306b.C1315i.restart_now, C1306b.C1315i.restart_latter, new Runnable() { // from class: com.tsf.shell.d.a.1
            @Override // java.lang.Runnable
            public void run() {
                Home.m6177b().m6186a(300);
            }
        }, (Runnable) null);
    }
}
