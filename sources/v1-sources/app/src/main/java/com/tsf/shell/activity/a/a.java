package com.tsf.shell.activity.a;

import android.content.Intent;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
public class a implements com.tsf.shell.a {
    private int a;

    @Override // com.tsf.shell.a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.a) {
            a(i2, intent);
        }
    }

    public void a(int i, Intent intent) {
    }

    public final void a(Intent intent) {
        this.a = Home.d().a(intent, this);
    }
}
