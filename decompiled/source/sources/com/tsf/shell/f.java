package com.tsf.shell;

import android.os.Process;
/* loaded from: classes.dex */
public class f implements Runnable {
    int a;
    RestartActivity b;
    boolean c;

    public f(int i, RestartActivity restartActivity, boolean z) {
        this.a = i;
        this.b = restartActivity;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                Process.killProcess(this.a);
                this.b.dismissDialog(0);
                this.b.finish();
                if (this.c) {
                    this.b.startActivity(ShellActivity.a(this.b.getPackageName()));
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
