package com.tsf.shell.manager.r.c.a;

import android.content.ContentValues;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.tsf.shell.e.i.c.i;
import com.tsf.shell.manager.bind.d;

/* loaded from: classes.dex */
public class c {
    public static void a(final i iVar, final float f, final float f2, final b bVar) {
        if (com.tsf.shell.manager.a.h.F() == -1) {
            com.tsf.shell.manager.a.h.a(com.tsf.shell.manager.a.h.o(), (Runnable) null, new Runnable() { // from class: com.tsf.shell.manager.r.c.a.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.a(i.this, f, f2, bVar);
                }
            });
        } else {
            if (!iVar.j()) {
                iVar.k();
                return;
            }
            ItemInfo a = a(iVar, com.tsf.shell.manager.a.h.F(), f, f2, f, f2, 1.0f, 1.0f, 0.0f, 0.0f);
            if (a != null) {
                a.a(iVar, a, false, bVar);
            }
        }
    }

    private static ItemInfo a(i iVar, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        ItemInfo launcherFolder3DInfo;
        if (!com.tsf.shell.manager.r.c.c.a(iVar, true)) {
            return null;
        }
        switch (iVar.d) {
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
        launcherFolder3DInfo.packagename = iVar.c == null ? iVar.a : iVar.c;
        d.a(new ContentValues(), launcherFolder3DInfo, (Runnable) null);
        return launcherFolder3DInfo;
    }
}
