package com.tsf.shell;

import android.content.Intent;
import android.os.Process;

/* loaded from: classes.dex */
final class bc implements Runnable {
    int a;
    RestartActivity b;

    public bc(int i, RestartActivity restartActivity) {
        this.a = i;
        this.b = restartActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Process.killProcess(this.a);
                this.b.dismissDialog(0);
                this.b.finish();
                this.b.startActivity(new Intent(this.b, (Class<?>) Home.class));
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
