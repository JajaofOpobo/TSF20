package com.tsf.shell.manager.p187r.p193c.p194a;

import android.content.ContentValues;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p187r.p193c.C3705c;
import com.tsf.shell.manager.p187r.p193c.p194a.C3696a;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
/* renamed from: com.tsf.shell.manager.r.c.a.b */
/* loaded from: classes.dex */
public class C3700b {
    /* renamed from: a */
    public static void m1677a(final C3343g c3343g, final float f, final float f2, final C3696a.AbstractC3699a abstractC3699a) {
        if (C3359a.f11094h.m4121F() == -1) {
            C3359a.f11094h.m4096a(C3359a.f11094h.m4029o(), (Runnable) null, new Runnable() { // from class: com.tsf.shell.manager.r.c.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C3700b.m1677a(C3343g.this, f, f2, abstractC3699a);
                }
            });
        } else if (!c3343g.m2789j()) {
            c3343g.m2788k();
        } else {
            ItemInfo m1676a = m1676a(c3343g, C3359a.f11094h.m4121F(), f, f2, f, f2, 1.0f, 1.0f, 0.0f, 0.0f);
            if (m1676a != null) {
                C3696a.m1686a(c3343g, m1676a, false, abstractC3699a);
            }
        }
    }

    /* renamed from: a */
    private static ItemInfo m1676a(C3343g c3343g, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        ItemInfo launcherFolder3DInfo;
        if (C3705c.m1670a(c3343g, true)) {
            switch (c3343g.f11055d) {
                case 1:
                    launcherFolder3DInfo = new LauncherFolder3DInfo();
                    break;
                case 5:
                    launcherFolder3DInfo = new LauncherWidget3DInfo();
                    break;
                default:
                    launcherFolder3DInfo = null;
                    break;
            }
            launcherFolder3DInfo.screen = i;
            launcherFolder3DInfo.cellX = (int) f;
            launcherFolder3DInfo.cellY = (int) f2;
            launcherFolder3DInfo.cellXH = (int) f3;
            launcherFolder3DInfo.cellYH = (int) f4;
            launcherFolder3DInfo.scale = f5;
            launcherFolder3DInfo.scaleH = f6;
            launcherFolder3DInfo.rotation = (int) f7;
            launcherFolder3DInfo.rotationH = (int) f8;
            launcherFolder3DInfo.packagename = c3343g.f11054c == null ? c3343g.f11052a : c3343g.f11054c;
            ShellModel.C3435a.m2371a(new ContentValues(), launcherFolder3DInfo, (Runnable) null);
            return launcherFolder3DInfo;
        }
        return null;
    }
}
