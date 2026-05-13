package com.tsf.shell;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ksmobile.launcher.cmbase.utils.C1304e;
import com.ksmobile.launcher.p066a.p067a.C1294a;
import com.ksmobile.p063a.p064a.C1280a;
import com.tsf.extend.C1547h;
import com.tsf.shell.manager.bind.C3444a;
import com.tsf.shell.manager.p168b.C3430e;
/* loaded from: classes.dex */
public class ShellApplication extends Application {

    /* renamed from: a */
    private static Context f7170a;

    /* renamed from: b */
    private C2182a f7171b;

    /* renamed from: com.tsf.shell.ShellApplication$a */
    /* loaded from: classes.dex */
    class C2182a extends BroadcastReceiver {
        C2182a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.tsf.shell.StartHome".equals(intent.getAction())) {
                String m6150b = ShellApplication.m6150b();
                C3430e.m2447k(true);
                if (m6150b == null || m6150b.equals(ShellApplication.this.getPackageName())) {
                    ShellApplication.this.m6149c();
                }
            }
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f7170a = this;
        C3444a.m2358a(this);
        C3444a.m2359a();
        C1547h.m8292a(this);
        String m6150b = m6150b();
        if (C3430e.m2560L()) {
            if (m6150b == null || m6150b.equals(getPackageName())) {
                m6149c();
                return;
            }
            return;
        }
        this.f7171b = new C2182a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tsf.shell.StartHome");
        registerReceiver(this.f7171b, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6149c() {
        C1547h.m8291a(new C1280a());
        C1304e.m9044a();
        C1294a.m9092a();
    }

    /* renamed from: a */
    public static Context m6152a() {
        return f7170a;
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        C3444a.m2359a().m2355d();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: b */
    public static java.lang.String m6150b() {
        /*
            r0 = 0
            java.io.File r2 = new java.io.File
            java.lang.String r1 = "/proc/self/cmdline"
            r2.<init>(r1)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            r2 = 256(0x100, float:3.59E-43)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L49
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L49
            if (r3 <= 0) goto L27
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L49
            r5 = 0
            r4.<init>(r2, r5, r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r4.trim()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L26
            r1.close()     // Catch: java.io.IOException -> L43
        L26:
            return r0
        L27:
            if (r1 == 0) goto L26
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L26
        L2d:
            r1 = move-exception
            goto L26
        L2f:
            r1 = move-exception
            r1 = r0
        L31:
            if (r1 == 0) goto L26
            r1.close()     // Catch: java.io.IOException -> L37
            goto L26
        L37:
            r1 = move-exception
            goto L26
        L39:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L3d:
            if (r1 == 0) goto L42
            r1.close()     // Catch: java.io.IOException -> L45
        L42:
            throw r0
        L43:
            r1 = move-exception
            goto L26
        L45:
            r1 = move-exception
            goto L42
        L47:
            r0 = move-exception
            goto L3d
        L49:
            r2 = move-exception
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.ShellApplication.m6150b():java.lang.String");
    }
}
