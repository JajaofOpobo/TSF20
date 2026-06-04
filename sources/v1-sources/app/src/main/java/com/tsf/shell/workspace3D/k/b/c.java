package com.tsf.shell.workspace3D.k.b;

import android.content.Intent;
import android.net.Uri;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class c implements Runnable {
    c() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Home.d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://market.android.com/details?id=" + com.censivn.C3DEngine.a.c().getPackageName())));
    }
}
