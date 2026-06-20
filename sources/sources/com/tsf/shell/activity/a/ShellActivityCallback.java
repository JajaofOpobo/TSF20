package com.tsf.shell.activity.a;

import android.content.Intent;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ShellActivityCallback implements com.censivn.C3DEngine.b.c.ActivityResultBridge.InterfaceC0025a {
    private int a;

    @Override // com.censivn.C3DEngine.b.c.ActivityResultBridge.InterfaceC0025a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.a) {
            a(i2, intent);
        }
    }

    public void a(int i, Intent intent) {
        if (i == -1) {
        }
    }

    public void a(Intent intent) {
        this.a = Home.b().a(intent, (com.censivn.C3DEngine.b.c.ActivityResultBridge.InterfaceC0025a) this);
    }
}
