package com.tsf.shell.p092c.p093a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.ksmobile.launcher.p066a.p067a.C1296b;
import com.tsf.extend.base.p080j.C1427f;
import com.tsf.extend.base.p080j.C1438q;
import com.tsf.extend.base.p080j.C1448t;
import com.tsf.shell.Home;
import com.tsf.shell.ShellApplication;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.manager.action.C3386b;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.utils.C4165b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.c.a.a */
/* loaded from: classes.dex */
public class C2229a {

    /* renamed from: a */
    public static boolean f7324a = false;

    /* renamed from: b */
    public static boolean f7325b = false;

    /* renamed from: a */
    public static void m6042a(ShellProvider.C2183a c2183a, SQLiteDatabase sQLiteDatabase) {
        System.currentTimeMillis();
        f7324a = true;
        m6037c(c2183a, sQLiteDatabase);
        m6036d(c2183a, sQLiteDatabase);
        m6038b(c2183a, sQLiteDatabase);
        m6035e(c2183a, sQLiteDatabase);
        ShellWallpaperManager.m1600a(C0853a.m10858b());
    }

    /* renamed from: b */
    public static void m6038b(ShellProvider.C2183a c2183a, SQLiteDatabase sQLiteDatabase) {
        LauncherShortcut3DInfo launcherShortcut3DInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m6044a(12000, -2, 0));
        arrayList.add(m6044a(11000, -2, 0));
        arrayList.add(m6044a(14000, -2, 0));
        String str = "";
        Iterator it = arrayList.iterator();
        while (true) {
            String str2 = str;
            if (it.hasNext()) {
                ShellModel.C3435a.m2368a((LauncherShortcut3DInfo) it.next(), c2183a, sQLiteDatabase);
                str = str2 + launcherShortcut3DInfo.f2532id + ",";
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", str2);
                sQLiteDatabase.update("quicklaunch", contentValues, "_id=1", null);
                contentValues.clear();
                return;
            }
        }
    }

    /* renamed from: c */
    public static void m6037c(ShellProvider.C2183a c2183a, SQLiteDatabase sQLiteDatabase) {
        LauncherShortcut3DInfo launcherShortcut3DInfo;
        ArrayList<ComponentName> m703b = C4165b.m703b(4);
        ArrayList arrayList = new ArrayList();
        Iterator<ComponentName> it = m703b.iterator();
        while (it.hasNext()) {
            arrayList.add(m6043a(-3, "", 0, it.next()));
        }
        arrayList.add(arrayList.size() < 3 ? arrayList.size() : 2, m6044a(100, -3, 0));
        String str = "";
        Iterator it2 = arrayList.iterator();
        while (true) {
            String str2 = str;
            if (it2.hasNext()) {
                ShellModel.C3435a.m2368a((LauncherShortcut3DInfo) it2.next(), c2183a, sQLiteDatabase);
                str = str2 + launcherShortcut3DInfo.f2532id + ",";
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", str2);
                sQLiteDatabase.update("dock", contentValues, "_id=1", null);
                contentValues.clear();
                return;
            }
        }
    }

    /* renamed from: d */
    public static void m6036d(ShellProvider.C2183a c2183a, SQLiteDatabase sQLiteDatabase) {
        LauncherShortcut3DInfo launcherShortcut3DInfo;
        ArrayList<ComponentName> m703b = C4165b.m703b(6);
        ArrayList arrayList = new ArrayList();
        Iterator<ComponentName> it = m703b.iterator();
        while (it.hasNext()) {
            arrayList.add(m6043a(-4, "", 0, it.next()));
        }
        String str = "";
        Iterator it2 = arrayList.iterator();
        while (true) {
            String str2 = str;
            if (it2.hasNext()) {
                ShellModel.C3435a.m2368a((LauncherShortcut3DInfo) it2.next(), c2183a, sQLiteDatabase);
                str = str2 + launcherShortcut3DInfo.f2532id + ",";
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", str2);
                sQLiteDatabase.update("slidingdock", contentValues, "_id=1", null);
                contentValues.clear();
                return;
            }
        }
    }

    /* renamed from: e */
    public static void m6035e(ShellProvider.C2183a c2183a, SQLiteDatabase sQLiteDatabase) {
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m6044a(VEasing.Back.easeIn, -1, 0));
        arrayList.add(m6044a(800, -1, 0));
        arrayList.add(m6044a(300, -1, 0));
        arrayList.add(m6044a(VEasing.Linear.easeNone, -1, 0));
        boolean m6039b = m6039b();
        boolean m6045a = m6045a();
        if (m6039b) {
            arrayList.add(m6044a(19, -1, 0));
            C1438q.m8608a("sadqdqdqdqdq", "showTheme");
            C1296b.m9073a(false, "tsflauncher_themecenter_display", "display", "1");
        }
        if (m6045a) {
            arrayList.add(m6044a(20, -1, 0));
            C1438q.m8608a("sadqdqdqdqdq", "showPanda");
            C1296b.m9073a(false, "tsflauncher_keyboard_display", "display", "1");
        }
        int size = arrayList.size();
        float f3 = C0892a.f2571g + C0892a.f2572h;
        float f4 = C0892a.f2559J;
        float width = Home.m6177b().getWindowManager().getDefaultDisplay().getWidth();
        float height = Home.m6177b().getWindowManager().getDefaultDisplay().getHeight();
        if (width <= height) {
            height = width;
            width = height;
        }
        C3560a c3560a = C3566b.f11839a;
        float f5 = 8.0f * C0892a.f2567c;
        float f6 = 25.0f * C0892a.f2567c;
        float f7 = size / 4.0f;
        float f8 = ((float) size) % 4.0f == 0.0f ? f7 : f7 + 1.0f;
        float f9 = size / 4.0f;
        if (size % 4.0f != 0.0f) {
            f9 += 1.0f;
        }
        float f10 = (c3560a.f11762T * 4.0f) + ((4.0f - 1.0f) * f5);
        float f11 = (c3560a.f11763U * f8) + ((f8 - 1.0f) * f6);
        float f12 = (c3560a.f11762T * 4.0f) + ((4.0f - 1.0f) * f5);
        float f13 = (c3560a.f11763U * f9) + ((f9 - 1.0f) * f6);
        float f14 = 780.0f * C0892a.f2567c;
        float f15 = 780.0f * C0892a.f2567c;
        float f16 = 90.0f * C0892a.f2567c;
        if (C0892a.f2564O) {
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
        float f24 = (c3560a.f11762T / 2.0f) + ((-f2) / 2.0f) + ((f2 - f10) / 2.0f);
        float f25 = ((f21 - ((f14 / 2.0f) * f17)) - f16) - (c3560a.f11763U / 2.0f);
        float f26 = ((f2 / 2.0f) - (((f2 - f3) - f13) / 2.0f)) - (c3560a.f11763U / 2.0f);
        float f27 = f20 + (f15 * f18) + f16 + (c3560a.f11762T / 2.0f);
        float f28 = c3560a.f11762T + f5;
        float f29 = c3560a.f11763U + f6;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < arrayList.size()) {
                LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) arrayList.get(i2);
                if (!m6045a || !m6039b || i2 < 4) {
                    launcherShortcut3DInfo.cellX = (int) (((i2 % 4.0f) * f28) + f24);
                    launcherShortcut3DInfo.cellY = (int) (f25 - (((int) (i2 / 4.0f)) * f29));
                    launcherShortcut3DInfo.cellXH = (int) (((i2 % 4.0f) * f28) + f27);
                    launcherShortcut3DInfo.cellYH = (int) (f26 - (((int) (i2 / 4.0f)) * f29));
                    ShellModel.C3435a.m2368a(launcherShortcut3DInfo, c2183a, sQLiteDatabase);
                } else {
                    launcherShortcut3DInfo.cellX = (int) ((((i2 + 1) % 4.0f) * f28) + f24);
                    launcherShortcut3DInfo.cellY = (int) (f25 - (((int) (i2 / 4.0f)) * f29));
                    launcherShortcut3DInfo.cellXH = (int) ((((i2 + 1) % 4.0f) * f28) + f27);
                    launcherShortcut3DInfo.cellYH = (int) (f26 - (((int) (i2 / 4.0f)) * f29));
                    ShellModel.C3435a.m2368a(launcherShortcut3DInfo, c2183a, sQLiteDatabase);
                }
                i = i2 + 1;
            } else {
                ShellModel.C3435a.m2368a(m6041a("cloud2", 0, (300.0f * C0892a.f2567c) + 0.0f, (120.0f * C0892a.f2567c) + f21, (300.0f * C0892a.f2567c) + f22, (120.0f * C0892a.f2567c) + f23, 0.8f, 0.9f), c2183a, sQLiteDatabase);
                ShellModel.C3435a.m2368a(m6041a("cloud4", 0, 0.0f - (200.0f * C0892a.f2567c), f21 - (250.0f * C0892a.f2567c), f22 - (200.0f * C0892a.f2567c), f23 - (250.0f * C0892a.f2567c), 1.3f, 1.8f), c2183a, sQLiteDatabase);
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
                ShellModel.C3435a.m2368a(launcherWidget3DInfo, c2183a, sQLiteDatabase);
                return;
            }
        }
    }

    /* renamed from: a */
    public static ItemInfo m6041a(String str, int i, float f, float f2, float f3, float f4, float f5, float f6) {
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
        launcherWidget3DInfo.config = "{\"totalFrame\":0,\"packageName\":\"" + C0853a.m10858b() + "\",\"currentSpeed\":" + f6 + ",\"unitHeight\":0,\"drawable\":\"" + str + "\",\"overturn\":false,\"unitCount\":0,\"maxSpeed\":3,\"horizontal\":true,\"wave\":0,\"unitWidth\":0,\"miniSpeed\":0.10000000149011612,\"positionIncrease\":true,\"isSequence\":false}";
        launcherWidget3DInfo.packagename = "com.tsf.shell.widget.floating";
        return launcherWidget3DInfo;
    }

    /* renamed from: a */
    public static LauncherShortcut3DInfo m6043a(int i, String str, int i2, ComponentName componentName) {
        return m6040a(str, i, i2, componentName);
    }

    /* renamed from: a */
    public static LauncherShortcut3DInfo m6040a(String str, int i, int i2, ComponentName componentName) {
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

    /* renamed from: a */
    public static LauncherShortcut3DInfo m6044a(int i, int i2, int i3) {
        LauncherShortcutStandardInfo launcherShortcutStandardInfo = new LauncherShortcutStandardInfo() { // from class: com.tsf.shell.c.a.a.2
            @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo, com.censivn.C3DEngine.api.element.info.ItemInfo
            public void onAddToDatabase(ContentValues contentValues) {
                updatePhoto(contentValues, null);
                super.onAddToDatabase(contentValues);
            }
        };
        Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
        C3386b.C3389a m2664b = C3386b.m2664b(i);
        shortcutIconResource.packageName = C0853a.m10858b();
        shortcutIconResource.resourceName = Integer.toString(m2664b.f11196c);
        launcherShortcutStandardInfo.title = m2664b.f11195b;
        launcherShortcutStandardInfo.iconResource = shortcutIconResource;
        launcherShortcutStandardInfo.container = i2;
        launcherShortcutStandardInfo.screen = i3;
        new Intent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(new ComponentName(C0853a.m10858b(), Home.class.getName()));
        intent.setFlags(270532608);
        intent.putExtra("action", i);
        launcherShortcutStandardInfo.intent = intent;
        return launcherShortcutStandardInfo;
    }

    /* renamed from: a */
    private static boolean m6045a() {
        return C1448t.m8591a(ShellApplication.m6152a()) && !C1427f.m8664a(ShellApplication.m6152a(), "panda.keyboard.emoji.theme");
    }

    /* renamed from: b */
    private static boolean m6039b() {
        return !C1427f.m8664a(ShellApplication.m6152a(), "com.ksmobile.launcher");
    }
}
