package com.tsf.shell.activity.a;

import android.content.Intent;
import com.censivn.C3DEngine.b.c.b;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
public class a implements b {
    private int a;

    @Override // com.censivn.C3DEngine.b.c.b
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.a) {
            a(i2, intent);
        }
    }

    public void a(int i, Intent intent) {
    }

    public void a(Intent intent) {
        this.a = Home.b().a(intent, (b) this);
    }
}
