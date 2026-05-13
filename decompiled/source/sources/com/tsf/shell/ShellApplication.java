package com.tsf.shell;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes.dex */
public class ShellApplication extends Application {
    private static Context a;
    private a b;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.tsf.shell.StartHome".equals(intent.getAction())) {
                String b = ShellApplication.b();
                com.tsf.shell.manager.b.e.k(true);
                if (b == null || b.equals(ShellApplication.this.getPackageName())) {
                    ShellApplication.this.c();
                }
            }
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        a = this;
        com.tsf.shell.manager.bind.a.a(this);
        com.tsf.shell.manager.bind.a.a();
        com.tsf.extend.h.a(this);
        String b = b();
        if (com.tsf.shell.manager.b.e.L()) {
            if (b == null || b.equals(getPackageName())) {
                c();
                return;
            }
            return;
        }
        this.b = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tsf.shell.StartHome");
        registerReceiver(this.b, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.tsf.extend.h.a(new com.ksmobile.a.a.a());
        com.ksmobile.launcher.cmbase.utils.e.a();
        com.ksmobile.launcher.a.a.a.a();
    }

    public static Context a() {
        return a;
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        com.tsf.shell.manager.bind.a.a().d();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String b() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.ShellApplication.b():java.lang.String");
    }
}
