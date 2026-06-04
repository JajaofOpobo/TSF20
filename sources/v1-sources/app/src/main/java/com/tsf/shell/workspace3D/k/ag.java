package com.tsf.shell.workspace3D.k;

import android.content.Intent;
import android.graphics.Rect;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.au;

/* loaded from: classes.dex */
final class ag implements Runnable {
    final /* synthetic */ ae a;

    ag(ae aeVar) {
        this.a = aeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ae aeVar;
        ae aeVar2;
        LauncherShortcut3DInfo launcherShortcut3DInfo;
        ae aeVar3;
        ae aeVar4;
        ae aeVar5;
        ae aeVar6;
        LauncherShortcut3DInfo launcherShortcut3DInfo2;
        try {
            aeVar = this.a.H;
            float f = aeVar.L().x;
            aeVar2 = this.a.H;
            float[] a = com.censivn.C3DEngine.h.a.a(f, aeVar2.L().y);
            launcherShortcut3DInfo = this.a.a;
            Intent intent = launcherShortcut3DInfo.intentInstance;
            float f2 = a[0];
            aeVar3 = this.a.H;
            int al = (int) (f2 + aeVar3.al());
            float f3 = a[1];
            aeVar4 = this.a.H;
            int am = (int) (f3 + aeVar4.am());
            float f4 = a[0];
            aeVar5 = this.a.H;
            int ao = (int) (f4 + aeVar5.ao());
            float f5 = a[1];
            aeVar6 = this.a.H;
            intent.setSourceBounds(new Rect(al, am, ao, (int) (f5 + aeVar6.ap())));
            Home d = Home.d();
            launcherShortcut3DInfo2 = this.a.a;
            d.b(launcherShortcut3DInfo2.intentInstance);
        } catch (Exception e) {
            e.printStackTrace();
            au.a(com.censivn.C3DEngine.a.c().getString(R.string.activity_not_found));
        }
    }
}
