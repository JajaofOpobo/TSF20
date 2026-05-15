package com.tsf.shell.manager.r.c.a;

import android.content.ContentValues;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.tsf.shell.f.i.c.g;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.r.c.a.a;
import com.tsf.shell.manager.r.c.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    public static void a(final g gVar, final float f, final float f2, final a.AbstractC0146a abstractC0146a) {
        if (com.tsf.shell.manager.a.h.F() == -1) {
            com.tsf.shell.manager.a.h.a(com.tsf.shell.manager.a.h.o(), (Runnable) null, new Runnable() { // from class: com.tsf.shell.manager.r.c.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.a(gVar, f, f2, abstractC0146a);
                }
            });
        } else {
            if (!gVar.j()) {
                gVar.k();
                return;
            }
            ItemInfo itemInfoA = a(gVar, com.tsf.shell.manager.a.h.F(), f, f2, f, f2, 1.0f, 1.0f, 0.0f, 0.0f);
            if (itemInfoA != null) {
                a.a(gVar, itemInfoA, false, abstractC0146a);
            }
        }
    }

    private static ItemInfo a(g gVar, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        ItemInfo launcherFolder3DInfo;
        if (!c.a(gVar, true)) {
            return null;
        }
        switch (gVar.d) {
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
        launcherFolder3DInfo.packagename = gVar.c == null ? gVar.a : gVar.c;
        ShellModel.a.a(new ContentValues(), launcherFolder3DInfo, (Runnable) null);
        return launcherFolder3DInfo;
    }
}
