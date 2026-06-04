package com.tsf.shell.e;

import android.content.Intent;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.ae;

/* loaded from: classes.dex */
public final class a {
    public static ae a(String str, Bitmap bitmap, Intent intent, int i, float f, float f2) {
        return a(str, bitmap, null, intent, i, f, f2);
    }

    public static ae a(String str, Intent.ShortcutIconResource shortcutIconResource, Intent intent, int i, float f, float f2) {
        return a(str, null, shortcutIconResource, intent, i, f, f2);
    }

    private static ae a(String str, Bitmap bitmap, Intent.ShortcutIconResource shortcutIconResource, Intent intent, int i, float f, float f2) {
        LauncherShortcut3DInfo launcherShortcut3DInfo = new LauncherShortcut3DInfo(bf.l().t());
        launcherShortcut3DInfo.itemType = 7;
        launcherShortcut3DInfo.title = str;
        launcherShortcut3DInfo.intentInstance = intent;
        launcherShortcut3DInfo.iconResource = shortcutIconResource;
        if (shortcutIconResource != null) {
            launcherShortcut3DInfo.packagename = shortcutIconResource.packageName;
        }
        launcherShortcut3DInfo.screen = i;
        ae aeVar = new ae(launcherShortcut3DInfo);
        aeVar.L().x = f;
        aeVar.L().y = f2;
        launcherShortcut3DInfo.cellX = (int) f;
        launcherShortcut3DInfo.cellY = (int) f2;
        if (launcherShortcut3DInfo.intentInstance != null) {
            launcherShortcut3DInfo.intent = launcherShortcut3DInfo.intentInstance.toUri(0);
        }
        launcherShortcut3DInfo.onUpdatePhoto(bitmap);
        aeVar.aJ();
        bf.l().onLoadWidgetComplete(aeVar, null);
        aeVar.bs();
        return aeVar;
    }
}
