package com.tsf.shell.manager.l;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.c.a;
import com.tsf.shell.Home;
import com.tsf.shell.d;
import com.tsf.shell.f.i.b.e.c;
import com.tsf.shell.f.i.b.e.f;
import com.tsf.shell.f.i.b.e.g;
import com.tsf.shell.f.i.b.e.i;
import com.tsf.shell.manager.action.b;
import com.tsf.shell.manager.bind.ShellModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a implements a.InterfaceC0025a {
    private static int a = 1;
    private static int b;
    private static int c;

    /* renamed from: com.tsf.shell.manager.l.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0130a implements a.InterfaceC0025a {
        public int a;

        @Override // com.censivn.C3DEngine.b.c.a.InterfaceC0025a
        public void onActivityResult(int i, int i2, Intent intent) {
            if (i2 == -1 && i == this.a) {
                a.a(intent, this);
            }
        }

        public void a(com.tsf.shell.f.i.b.e.b bVar) {
        }

        public com.tsf.shell.manager.o.a a() {
            return com.tsf.shell.manager.o.b.a;
        }
    }

    public void a(Intent intent, float f, float f2) {
        b = (int) f;
        c = (int) f2;
        a = Home.b().a(intent, (a.InterfaceC0025a) this);
    }

    public void a(Intent intent, float f, float f2, C0130a c0130a) {
        b = (int) f;
        c = (int) f2;
        c0130a.a = Home.b().a(intent, (a.InterfaceC0025a) c0130a);
    }

    public static void a(final Intent intent, final C0130a c0130a) {
        d.a().a(new Runnable() { // from class: com.tsf.shell.manager.l.a.1
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.l.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int F = com.tsf.shell.manager.a.h.F();
                        if (F == -1) {
                            F = com.tsf.shell.manager.a.h.q();
                        }
                        Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
                        String stringExtra = intent.getStringExtra("android.intent.extra.shortcut.NAME");
                        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.shortcut.ICON");
                        if (intent2 != null && "android.intent.action.CALL_PRIVILEGED".equals(intent2.getAction())) {
                            intent2.setAction("android.intent.action.CALL");
                        }
                        if (parcelableExtra != null && (parcelableExtra instanceof Bitmap)) {
                            a.a(stringExtra, (Bitmap) parcelableExtra, null, intent2, -1, F, a.b, a.c, c0130a);
                            return;
                        }
                        Parcelable parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                        if (parcelableExtra2 != null && (parcelableExtra2 instanceof Intent.ShortcutIconResource)) {
                            a.a(stringExtra, null, (Intent.ShortcutIconResource) parcelableExtra2, intent2, -1, F, a.b, a.c, c0130a);
                        }
                    }
                });
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.c.a.InterfaceC0025a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == a) {
            a(intent, (C0130a) null);
        }
    }

    public static com.tsf.shell.f.i.b.e.b a(ItemInfo itemInfo, boolean z) {
        return a(itemInfo, com.tsf.shell.manager.o.b.a, z);
    }

    public static com.tsf.shell.f.i.b.e.b a(ItemInfo itemInfo, com.tsf.shell.manager.o.a aVar, boolean z) {
        switch (itemInfo.itemType) {
            case 2:
                return new g((LauncherShortcutAppInfo) itemInfo, aVar, g.a((LauncherShortcut3DInfo) ((LauncherShortcutAppInfo) itemInfo)), z);
            case 7:
                return b(itemInfo, aVar, z);
            default:
                return null;
        }
    }

    private static com.tsf.shell.f.i.b.e.b b(ItemInfo itemInfo, com.tsf.shell.manager.o.a aVar, boolean z) {
        b.a b2;
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) itemInfo;
        int intExtra = launcherShortcut3DInfo.intent != null ? launcherShortcut3DInfo.intent.getIntExtra("action", 0) : 0;
        switch (intExtra) {
            case 100:
            case 500:
                return new c(launcherShortcut3DInfo, aVar, z, intExtra);
            default:
                if (intExtra > 9999) {
                    return new i(intExtra, launcherShortcut3DInfo, aVar, z);
                }
                if (intExtra != 0 && (b2 = com.tsf.shell.manager.action.b.b(intExtra)) != null && b2.d != null) {
                    launcherShortcut3DInfo.themeResourceName = b2.d;
                }
                return new f(launcherShortcut3DInfo, aVar, z);
        }
    }

    public static void a(com.tsf.shell.f.i.b.e.b bVar) {
        com.tsf.shell.f.f.g d = com.tsf.shell.manager.a.h.d(bVar.K().screen);
        bVar.ac();
        d.a(bVar);
    }

    public static LauncherShortcut3DInfo a(int i) {
        switch (i) {
            case 2:
                return new LauncherShortcutAppInfo();
            case 7:
                return new LauncherShortcutStandardInfo();
            default:
                return null;
        }
    }

    public static com.tsf.shell.f.i.b.e.b a(String str, Bitmap bitmap, Intent.ShortcutIconResource shortcutIconResource, Intent intent, int i, int i2, float f, float f2, C0130a c0130a) {
        LauncherShortcutStandardInfo launcherShortcutStandardInfo = new LauncherShortcutStandardInfo();
        launcherShortcutStandardInfo.title = str;
        launcherShortcutStandardInfo.intent = intent;
        launcherShortcutStandardInfo.iconResource = shortcutIconResource;
        launcherShortcutStandardInfo.screen = i2;
        launcherShortcutStandardInfo.cellX = (int) f;
        launcherShortcutStandardInfo.cellY = (int) f2;
        ContentValues contentValues = new ContentValues();
        launcherShortcutStandardInfo.updatePhoto(contentValues, bitmap);
        launcherShortcutStandardInfo.updateContainer(contentValues, i);
        launcherShortcutStandardInfo.updateDatabase(contentValues);
        if (c0130a != null) {
            com.tsf.shell.f.i.b.e.b a2 = a((ItemInfo) launcherShortcutStandardInfo, c0130a.a(), true);
            c0130a.a(a2);
            return a2;
        }
        com.tsf.shell.f.i.b.e.b a3 = a((ItemInfo) launcherShortcutStandardInfo, true);
        a(a3);
        return a3;
    }

    public static com.tsf.shell.f.i.b.e.b a(int i, com.tsf.shell.manager.o.a aVar) {
        return a((ItemInfo) a(i, -1, 0, 0.0f, 0.0f, false), aVar, true);
    }

    private static LauncherShortcutStandardInfo a(int i, int i2, int i3, float f, float f2, boolean z) {
        b.a b2 = com.tsf.shell.manager.action.b.b(i);
        com.tsf.shell.manager.action.b.a(b2);
        b2.e.putExtra("action", i);
        if (b2.c != 0) {
            b2.f = new Intent.ShortcutIconResource();
            b2.f.packageName = Home.b().getPackageName();
            b2.f.resourceName = Integer.toString(b2.c);
        }
        LauncherShortcutStandardInfo launcherShortcutStandardInfo = new LauncherShortcutStandardInfo();
        launcherShortcutStandardInfo.title = b2.b;
        launcherShortcutStandardInfo.intent = b2.e;
        launcherShortcutStandardInfo.iconResource = b2.f;
        launcherShortcutStandardInfo.themeResourceName = b2.d;
        launcherShortcutStandardInfo.screen = i3;
        launcherShortcutStandardInfo.cellX = (int) f;
        launcherShortcutStandardInfo.cellY = (int) f2;
        ContentValues contentValues = new ContentValues();
        launcherShortcutStandardInfo.updatePhoto(contentValues, null);
        launcherShortcutStandardInfo.updateContainer(contentValues, i2);
        if (z) {
            launcherShortcutStandardInfo.updateDatabase(contentValues);
        }
        contentValues.clear();
        return launcherShortcutStandardInfo;
    }

    public static void a() {
        ArrayList arrayList = (ArrayList) com.tsf.shell.manager.bind.a.c().a.clone();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.manager.a.f fVar = (com.tsf.shell.manager.a.f) it.next();
            if (fVar.h() > 0) {
                fVar.f();
            }
        }
        arrayList.clear();
        HashMap hashMap = new HashMap();
        ShellModel.a(hashMap);
        for (Integer num : hashMap.keySet()) {
            ItemInfo itemInfo = (ItemInfo) hashMap.get(num);
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo) && itemInfo.getWidget() != null && (itemInfo.getWidget() instanceof g)) {
                g gVar = (g) itemInfo.getWidget();
                if (gVar.bd() != null && gVar.bd().h() > 0) {
                    ((LauncherShortcutAppInfo) itemInfo).reloadTexture();
                }
            }
        }
        hashMap.clear();
    }

    public static void b() {
        ArrayList arrayList = (ArrayList) com.tsf.shell.manager.bind.a.c().a.clone();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.manager.a.f) it.next()).f();
        }
        arrayList.clear();
        HashMap hashMap = new HashMap();
        ShellModel.a(hashMap);
        for (Integer num : hashMap.keySet()) {
            ItemInfo itemInfo = (ItemInfo) hashMap.get(num);
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo)) {
                ((LauncherShortcutAppInfo) itemInfo).reloadTexture();
            }
        }
        hashMap.clear();
        Iterator<com.tsf.shell.f.i.b> it2 = com.tsf.shell.manager.a.w.d().a().iterator();
        while (it2.hasNext()) {
            com.tsf.shell.f.i.b next = it2.next();
            if (next instanceof com.tsf.shell.f.i.b.d.b) {
                ((com.tsf.shell.f.i.b.d.b) next).aQ();
            }
        }
    }
}
