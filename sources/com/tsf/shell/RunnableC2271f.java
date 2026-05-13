package com.tsf.shell;

import android.os.Process;
/* renamed from: com.tsf.shell.f */
/* loaded from: classes.dex */
public class RunnableC2271f implements Runnable {

    /* renamed from: a */
    int f7424a;

    /* renamed from: b */
    RestartActivity f7425b;

    /* renamed from: c */
    boolean f7426c;

    public RunnableC2271f(int i, RestartActivity restartActivity, boolean z) {
        this.f7424a = i;
        this.f7425b = restartActivity;
        this.f7426c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                Process.killProcess(this.f7424a);
                this.f7425b.dismissDialog(0);
                this.f7425b.finish();
                if (this.f7426c) {
                    this.f7425b.startActivity(ShellActivity.m6153a(this.f7425b.getPackageName()));
                    return;
                }
                return;
            } catch (Exception e) {
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
