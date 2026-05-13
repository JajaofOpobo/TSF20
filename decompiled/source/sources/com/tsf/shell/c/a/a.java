package com.tsf.shell.c.a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.extend.base.j.f;
import com.tsf.extend.base.j.q;
import com.tsf.extend.base.j.t;
import com.tsf.shell.Home;
import com.tsf.shell.ShellApplication;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.manager.action.b;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.utils.b;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a {
    public static boolean a = false;
    public static boolean b = false;

    public static void a(ShellProvider.a aVar, SQLiteDatabase sQLiteDatabase) {
        System.currentTimeMillis();
        a = true;
        c(aVar, sQLiteDatabase);
        d(aVar, sQLiteDatabase);
        b(aVar, sQLiteDatabase);
        e(aVar, sQLiteDatabase);
        ShellWallpaperManager.a(com.censivn.C3DEngine.a.b());
    }

    public static void b(ShellProvider.a aVar, SQLiteDatabase sQLiteDatabase) {
        LauncherShortcut3DInfo launcherShortcut3DInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(12000, -2, 0));
        arrayList.add(a(11000, -2, 0));
        arrayList.add(a(14000, -2, 0));
        String str = "";
        Iterator it = arrayList.iterator();
        while (true) {
            String str2 = str;
            if (it.hasNext()) {
                ShellModel.a.a((LauncherShortcut3DInfo) it.next(), aVar, sQLiteDatabase);
                str = str2 + launcherShortcut3DInfo.id + ",";
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", str2);
                sQLiteDatabase.update("quicklaunch", contentValues, "_id=1", null);
                contentValues.clear();
                return;
            }
        }
    }

    public static void c(ShellProvider.a aVar, SQLiteDatabase sQLiteDatabase) {
        LauncherShortcut3DInfo launcherShortcut3DInfo;
        ArrayList<ComponentName> b2 = b.b(4);
        ArrayList arrayList = new ArrayList();
        Iterator<ComponentName> it = b2.iterator();
        while (it.hasNext()) {
            arrayList.add(a(-3, "", 0, it.next()));
        }
        arrayList.add(arrayList.size() < 3 ? arrayList.size() : 2, a(100, -3, 0));
        String str = "";
        Iterator it2 = arrayList.iterator();
        while (true) {
            String str2 = str;
            if (it2.hasNext()) {
                ShellModel.a.a((LauncherShortcut3DInfo) it2.next(), aVar, sQLiteDatabase);
                str = str2 + launcherShortcut3DInfo.id + ",";
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", str2);
                sQLiteDatabase.update("dock", contentValues, "_id=1", null);
                contentValues.clear();
                return;
            }
        }
    }

    public static void d(ShellProvider.a aVar, SQLiteDatabase sQLiteDatabase) {
        LauncherShortcut3DInfo launcherShortcut3DInfo;
        ArrayList<ComponentName> b2 = b.b(6);
        ArrayList arrayList = new ArrayList();
        Iterator<ComponentName> it = b2.iterator();
        while (it.hasNext()) {
            arrayList.add(a(-4, "", 0, it.next()));
        }
        String str = "";
        Iterator it2 = arrayList.iterator();
        while (true) {
            String str2 = str;
            if (it2.hasNext()) {
                ShellModel.a.a((LauncherShortcut3DInfo) it2.next(), aVar, sQLiteDatabase);
                str = str2 + launcherShortcut3DInfo.id + ",";
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", str2);
                sQLiteDatabase.update("slidingdock", contentValues, "_id=1", null);
                contentValues.clear();
                return;
            }
        }
    }

    public static void e(ShellProvider.a aVar, SQLiteDatabase sQLiteDatabase) {
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(VEasing.Back.easeIn, -1, 0));
        arrayList.add(a(800, -1, 0));
        arrayList.add(a(300, -1, 0));
        arrayList.add(a(VEasing.Linear.easeNone, -1, 0));
        boolean b2 = b();
        boolean a2 = a();
        if (b2) {
            arrayList.add(a(19, -1, 0));
            q.a("sadqdqdqdqdq", "showTheme");
            com.ksmobile.launcher.a.a.b.a(false, "tsflauncher_themecenter_display", "display", "1");
        }
        if (a2) {
            arrayList.add(a(20, -1, 0));
            q.a("sadqdqdqdqdq", "showPanda");
            com.ksmobile.launcher.a.a.b.a(false, "tsflauncher_keyboard_display", "display", "1");
        }
        int size = arrayList.size();
        float f3 = com.censivn.C3DEngine.b.b.a.g + com.censivn.C3DEngine.b.b.a.h;
        float f4 = com.censivn.C3DEngine.b.b.a.J;
        float width = Home.b().getWindowManager().getDefaultDisplay().getWidth();
        float height = Home.b().getWindowManager().getDefaultDisplay().getHeight();
        if (width <= height) {
            height = width;
            width = height;
        }
        com.tsf.shell.manager.o.a aVar2 = com.tsf.shell.manager.o.b.a;
        float f5 = 8.0f * com.censivn.C3DEngine.b.b.a.c;
        float f6 = 25.0f * com.censivn.C3DEngine.b.b.a.c;
        float f7 = size / 4.0f;
        float f8 = ((float) size) % 4.0f == 0.0f ? f7 : f7 + 1.0f;
        float f9 = size / 4.0f;
        if (size % 4.0f != 0.0f) {
            f9 += 1.0f;
        }
        float f10 = (aVar2.T * 4.0f) + ((4.0f - 1.0f) * f5);
        float f11 = (aVar2.U * f8) + ((f8 - 1.0f) * f6);
        float f12 = (aVar2.T * 4.0f) + ((4.0f - 1.0f) * f5);
        float f13 = (aVar2.U * f9) + ((f9 - 1.0f) * f6);
        float f14 = 780.0f * com.censivn.C3DEngine.b.b.a.c;
        float f15 = 780.0f * com.censivn.C3DEngine.b.b.a.c;
        float f16 = 90.0f * com.censivn.C3DEngine.b.b.a.c;
        if (com.censivn.C3DEngine.b.b.a.O) {
            f = width;
            f2 = height;
        } else {
            f = height;
            f2 = width;
        }
        float f17 = 1.0f;
        float f18 = 1.0f;
        if (f11 + f14 > (f - f3) - f4) {
            f17 = (((f - f3) - f4) - f11) / f14;
        }
        if (f14 > (f2 - f3) - f4) {
            f18 = ((f2 - f3) - f4) / f14;
        }
        float f19 = (width / 2.0f) - (((width - f3) - (f11 + ((f14 * f17) + f16))) / 2.0f);
        float f20 = ((width - (f12 + ((f15 * f18) + f16))) / 2.0f) + ((-width) / 2.0f);
        float f21 = f19 - ((f14 * f17) / 2.0f);
        float f22 = f20 + ((f15 * f18) / 2.0f);
        float f23 = ((height / 2.0f) - (((height - f3) - (f14 * f18)) / 2.0f)) - ((f14 * f18) / 2.0f);
        float f24 = (aVar2.T / 2.0f) + ((-f2) / 2.0f) + ((f2 - f10) / 2.0f);
        float f25 = ((f21 - ((f14 / 2.0f) * f17)) - f16) - (aVar2.U / 2.0f);
        float f26 = ((f2 / 2.0f) - (((f2 - f3) - f13) / 2.0f)) - (aVar2.U / 2.0f);
        float f27 = f20 + (f15 * f18) + f16 + (aVar2.T / 2.0f);
        float f28 = aVar2.T + f5;
        float f29 = aVar2.U + f6;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < arrayList.size()) {
                LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) arrayList.get(i2);
                if (!a2 || !b2 || i2 < 4) {
                    launcherShortcut3DInfo.cellX = (int) (((i2 % 4.0f) * f28) + f24);
                    launcherShortcut3DInfo.cellY = (int) (f25 - (((int) (i2 / 4.0f)) * f29));
                    launcherShortcut3DInfo.cellXH = (int) (((i2 % 4.0f) * f28) + f27);
                    launcherShortcut3DInfo.cellYH = (int) (f26 - (((int) (i2 / 4.0f)) * f29));
                    ShellModel.a.a(launcherShortcut3DInfo, aVar, sQLiteDatabase);
                } else {
                    launcherShortcut3DInfo.cellX = (int) ((((i2 + 1) % 4.0f) * f28) + f24);
                    launcherShortcut3DInfo.cellY = (int) (f25 - (((int) (i2 / 4.0f)) * f29));
                    launcherShortcut3DInfo.cellXH = (int) ((((i2 + 1) % 4.0f) * f28) + f27);
                    launcherShortcut3DInfo.cellYH = (int) (f26 - (((int) (i2 / 4.0f)) * f29));
                    ShellModel.a.a(launcherShortcut3DInfo, aVar, sQLiteDatabase);
                }
                i = i2 + 1;
            } else {
                ShellModel.a.a(a("cloud2", 0, (300.0f * com.censivn.C3DEngine.b.b.a.c) + 0.0f, (120.0f * com.censivn.C3DEngine.b.b.a.c) + f21, (300.0f * com.censivn.C3DEngine.b.b.a.c) + f22, (120.0f * com.censivn.C3DEngine.b.b.a.c) + f23, 0.8f, 0.9f), aVar, sQLiteDatabase);
                ShellModel.a.a(a("cloud4", 0, 0.0f - (200.0f * com.censivn.C3DEngine.b.b.a.c), f21 - (250.0f * com.censivn.C3DEngine.b.b.a.c), f22 - (200.0f * com.censivn.C3DEngine.b.b.a.c), f23 - (250.0f * com.censivn.C3DEngine.b.b.a.c), 1.3f, 1.8f), aVar, sQLiteDatabase);
                LauncherWidget3DInfo launcherWidget3DInfo = new LauncherWidget3DInfo();
                launcherWidget3DInfo.container = -1;
                launcherWidget3DInfo.screen = 0;
                launcherWidget3DInfo.cellX = (int) 0.0f;
                launcherWidget3DInfo.cellY = (int) f21;
                launcherWidget3DInfo.cellXH = (int) f22;
                launcherWidget3DInfo.cellYH = (int) f23;
                launcherWidget3DInfo.rotation = 0;
                launcherWidget3DInfo.rotationH = 0;
                launcherWidget3DInfo.scale = 1.0f;
                launcherWidget3DInfo.scaleH = 1.0f;
                launcherWidget3DInfo.packagename = "com.tsf.shell.widget.alarm";
                ShellModel.a.a(launcherWidget3DInfo, aVar, sQLiteDatabase);
                return;
            }
        }
    }

    public static ItemInfo a(String str, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        LauncherWidget3DInfo launcherWidget3DInfo = new LauncherWidget3DInfo() { // from class: com.tsf.shell.c.a.a.1
            @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
            public void onAddToDatabase(ContentValues contentValues) {
                updateConfig(contentValues, this.config);
                super.onAddToDatabase(contentValues);
            }
        };
        launcherWidget3DInfo.container = -1;
        launcherWidget3DInfo.screen = i;
        launcherWidget3DInfo.cellX = (int) f;
        launcherWidget3DInfo.cellY = (int) f2;
        launcherWidget3DInfo.cellXH = (int) f3;
        launcherWidget3DInfo.cellYH = (int) f4;
        launcherWidget3DInfo.rotationH = 0;
        launcherWidget3DInfo.rotation = 0;
        launcherWidget3DInfo.scaleH = f5;
        launcherWidget3DInfo.scale = f5;
        launcherWidget3DInfo.itemType = 5;
        launcherWidget3DInfo.config = "{\"totalFrame\":0,\"packageName\":\"" + com.censivn.C3DEngine.a.b() + "\",\"currentSpeed\":" + f6 + ",\"unitHeight\":0,\"drawable\":\"" + str + "\",\"overturn\":false,\"unitCount\":0,\"maxSpeed\":3,\"horizontal\":true,\"wave\":0,\"unitWidth\":0,\"miniSpeed\":0.10000000149011612,\"positionIncrease\":true,\"isSequence\":false}";
        launcherWidget3DInfo.packagename = "com.tsf.shell.widget.floating";
        return launcherWidget3DInfo;
    }

    public static LauncherShortcut3DInfo a(int i, String str, int i2, ComponentName componentName) {
        return a(str, i, i2, componentName);
    }

    public static LauncherShortcut3DInfo a(String str, int i, int i2, ComponentName componentName) {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = str;
        launcherShortcutAppInfo.container = i;
        launcherShortcutAppInfo.screen = i2;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(new ComponentName(componentName.getPackageName(), componentName.getClassName()));
        intent.setFlags(270532608);
        launcherShortcutAppInfo.intent = intent;
        return launcherShortcutAppInfo;
    }

    public static LauncherShortcut3DInfo a(int i, int i2, int i3) {
        LauncherShortcutStandardInfo launcherShortcutStandardInfo = new LauncherShortcutStandardInfo() { // from class: com.tsf.shell.c.a.a.2
            @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo, com.censivn.C3DEngine.api.element.info.ItemInfo
            public void onAddToDatabase(ContentValues contentValues) {
                updatePhoto(contentValues, null);
                super.onAddToDatabase(contentValues);
            }
        };
        Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
        b.a b2 = com.tsf.shell.manager.action.b.b(i);
        shortcutIconResource.packageName = com.censivn.C3DEngine.a.b();
        shortcutIconResource.resourceName = Integer.toString(b2.c);
        launcherShortcutStandardInfo.title = b2.b;
        launcherShortcutStandardInfo.iconResource = shortcutIconResource;
        launcherShortcutStandardInfo.container = i2;
        launcherShortcutStandardInfo.screen = i3;
        new Intent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(new ComponentName(com.censivn.C3DEngine.a.b(), Home.class.getName()));
        intent.setFlags(270532608);
        intent.putExtra("action", i);
        launcherShortcutStandardInfo.intent = intent;
        return launcherShortcutStandardInfo;
    }

    private static boolean a() {
        return t.a(ShellApplication.a()) && !f.a(ShellApplication.a(), "panda.keyboard.emoji.theme");
    }

    private static boolean b() {
        return !f.a(ShellApplication.a(), "com.ksmobile.launcher");
    }
}
