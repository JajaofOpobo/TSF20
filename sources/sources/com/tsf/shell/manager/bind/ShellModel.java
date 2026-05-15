package com.tsf.shell.manager.bind;

import android.annotation.SuppressLint;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.f.c.a.f;
import com.tsf.shell.f.c.b.e;
import com.tsf.shell.g;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ShellModel extends BroadcastReceiver {
    public static Handler b;
    private static final Object f = new Object();
    private static final HashMap<Integer, ItemInfo> g = new HashMap<>();
    private static final HashMap<Integer, LauncherFolder3DInfo> h = new HashMap<>();
    private static final ArrayList<ItemInfo> i = new ArrayList<>();
    private static final ArrayList<LauncherAppWidgetInfo> j = new ArrayList<>();
    private static final ArrayList<ItemInfo> k = new ArrayList<>();
    private static final ArrayList<ItemInfo> l = new ArrayList<>();
    private static final ArrayList<ItemInfo> m = new ArrayList<>();
    private static final ArrayList<ItemInfo> n = new ArrayList<>();
    private static final HandlerThread q = new HandlerThread("launcher-loader");
    public com.tsf.shell.manager.a.a a;
    private b c;
    private Context d;
    private int e;
    private com.tsf.shell.manager.bind.b o;
    private boolean p;

    @SuppressLint({"NewApi"})
    ShellModel(Context context) {
        this.d = context;
        this.p = Build.VERSION.SDK_INT < 9 ? true : Environment.isExternalStorageRemovable();
        this.o = new com.tsf.shell.manager.bind.b();
        this.a = new com.tsf.shell.manager.a.a();
        this.e = this.d.getResources().getInteger(b.f.config_allAppsBatchLoadDelay);
    }

    public static void a(String str) {
    }

    public void a() {
        q.start();
        b = new Handler(q.getLooper());
    }

    private ItemInfo a(int i2) {
        LauncherShortcutStandardInfo launcherShortcutStandardInfo;
        for (ItemInfo itemInfo : i) {
            if ((itemInfo instanceof LauncherShortcutStandardInfo) && (launcherShortcutStandardInfo = (LauncherShortcutStandardInfo) itemInfo) != null && launcherShortcutStandardInfo.intent != null && launcherShortcutStandardInfo.intent.getIntExtra("action", -1) == i2) {
                return itemInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ItemInfo b(String str) {
        if (TextUtils.equals(str, "com.ksmobile.launcher")) {
            return a(19);
        }
        if (TextUtils.equals(str, "panda.keyboard.emoji.theme")) {
            return a(20);
        }
        return null;
    }

    public static void a(HashMap<Integer, ItemInfo> map) {
        synchronized (f) {
            map.putAll(g);
        }
    }

    public void a(Home home) {
        synchronized (f) {
            this.o.a(home);
            this.c = new b(home);
            b.post(this.c);
        }
    }

    public static void a(Runnable runnable) {
        if (q.getThreadId() == Process.myTid()) {
            runnable.run();
        } else {
            b.post(runnable);
        }
    }

    public com.tsf.shell.manager.a.a b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LauncherFolder3DInfo b(HashMap<Integer, LauncherFolder3DInfo> map, Integer num) {
        LauncherFolder3DInfo launcherFolder3DInfo = map.get(num);
        if (launcherFolder3DInfo == null) {
            LauncherFolder3DInfo launcherFolder3DInfo2 = new LauncherFolder3DInfo();
            map.put(num, launcherFolder3DInfo2);
            return launcherFolder3DInfo2;
        }
        return launcherFolder3DInfo;
    }

    public static class a {
        public static byte[] a(ItemInfo itemInfo) {
            byte[] blob;
            Cursor cursorQuery = com.censivn.C3DEngine.a.d().getContentResolver().query(g.e.a(itemInfo.id, false), null, null, null, null);
            try {
                cursorQuery.moveToNext();
                blob = cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("icon"));
                try {
                    cursorQuery.close();
                } catch (Exception e) {
                    cursorQuery.close();
                }
            } catch (Exception e2) {
                blob = null;
            }
            return blob;
        }

        public static void a(ItemInfo itemInfo, ShellProvider.a aVar, SQLiteDatabase sQLiteDatabase) {
            if (itemInfo.id == -1) {
                ContentValues contentValues = new ContentValues();
                itemInfo.id = aVar.a();
                contentValues.put("_id", Integer.valueOf(itemInfo.id));
                itemInfo.onAddToDatabase(contentValues);
                sQLiteDatabase.insert("favorites", null, contentValues);
                contentValues.clear();
            }
        }

        public static void a(final ContentValues contentValues, final ItemInfo itemInfo, final Runnable runnable) {
            final boolean z = itemInfo.id == -1;
            if (z) {
                itemInfo.id = ShellProvider.a().b();
                contentValues.put("_id", Integer.valueOf(itemInfo.id));
                itemInfo.onAddToDatabase(contentValues);
            }
            ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.a.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (ShellModel.f) {
                        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                        if (z) {
                            contentResolver.insert(g.e.a, contentValues);
                            ShellModel.g.put(Integer.valueOf(itemInfo.id), itemInfo);
                            switch (itemInfo.itemType) {
                                case 1:
                                    ShellModel.h.put(Integer.valueOf(itemInfo.id), (LauncherFolder3DInfo) itemInfo);
                                    switch (itemInfo.container) {
                                        case -5:
                                            ShellModel.n.add(itemInfo);
                                            break;
                                        case -4:
                                            ShellModel.m.add(itemInfo);
                                            break;
                                        case -3:
                                            ShellModel.k.add(itemInfo);
                                            break;
                                        case ItemInfo.NO_ID /* -1 */:
                                            ShellModel.i.add(itemInfo);
                                            break;
                                    }
                                    break;
                                case 2:
                                case 7:
                                    switch (itemInfo.container) {
                                        case -5:
                                            ShellModel.n.add(itemInfo);
                                            break;
                                        case -4:
                                            ShellModel.m.add(itemInfo);
                                            break;
                                        case -3:
                                            ShellModel.k.add(itemInfo);
                                            break;
                                        case -2:
                                            ShellModel.l.add(itemInfo);
                                            break;
                                        case ItemInfo.NO_ID /* -1 */:
                                            ShellModel.i.add(itemInfo);
                                            break;
                                    }
                                    break;
                                case 3:
                                    ShellModel.j.add((LauncherAppWidgetInfo) itemInfo);
                                    break;
                                case 5:
                                    ShellModel.i.add(itemInfo);
                                    break;
                            }
                            ShellModel.a("insert");
                        } else {
                            contentResolver.update(g.e.a(itemInfo.id, false), contentValues, null, null);
                        }
                        contentValues.clear();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
            });
        }

        public static void b(final ItemInfo itemInfo) {
            ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.a.2
                @Override // java.lang.Runnable
                public void run() {
                    ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                    contentResolver.delete(g.e.a(itemInfo.id, false), null, null);
                    synchronized (ShellModel.f) {
                        switch (itemInfo.itemType) {
                            case 1:
                                contentResolver.delete(g.e.a, "container=" + itemInfo.id, null);
                                ShellModel.h.remove(Integer.valueOf(itemInfo.id));
                                switch (itemInfo.container) {
                                    case -5:
                                        ShellModel.n.remove(itemInfo);
                                        break;
                                    case -4:
                                        ShellModel.m.remove(itemInfo);
                                        break;
                                    case -3:
                                        ShellModel.k.remove(itemInfo);
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        ShellModel.i.remove(itemInfo);
                                        break;
                                }
                                break;
                            case 2:
                            case 7:
                                switch (itemInfo.container) {
                                    case -5:
                                        ShellModel.n.remove(itemInfo);
                                        break;
                                    case -4:
                                        ShellModel.m.remove(itemInfo);
                                        break;
                                    case -3:
                                        ShellModel.k.remove(itemInfo);
                                        break;
                                    case -2:
                                        ShellModel.l.remove(itemInfo);
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        ShellModel.i.remove(itemInfo);
                                        break;
                                }
                                break;
                            case 3:
                                ShellModel.j.remove((LauncherAppWidgetInfo) itemInfo);
                                break;
                            case 5:
                                ShellModel.i.remove(itemInfo);
                                break;
                        }
                        ShellModel.g.remove(Integer.valueOf(itemInfo.id));
                        itemInfo.unbind();
                        ShellModel.a("delete");
                    }
                }
            });
        }

        public static void a(final ItemInfo itemInfo, final int i, final int i2) {
            ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.a.3
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (ShellModel.f) {
                        if (i == -1) {
                            ShellModel.i.remove(itemInfo);
                        } else if (i == -3) {
                            ShellModel.k.remove(itemInfo);
                        } else if (i == -2) {
                            ShellModel.l.remove(itemInfo);
                        } else if (i == -4) {
                            ShellModel.m.remove(itemInfo);
                        } else if (i == -5) {
                            ShellModel.n.remove(itemInfo);
                        }
                        if (i2 == -1) {
                            if (!ShellModel.i.contains(ShellModel.i)) {
                                ShellModel.i.add(itemInfo);
                            }
                        } else if (i2 == -3) {
                            if (!ShellModel.k.contains(itemInfo)) {
                                ShellModel.k.add(itemInfo);
                            }
                        } else if (i2 == -4) {
                            if (!ShellModel.m.contains(itemInfo)) {
                                ShellModel.m.add(itemInfo);
                            }
                        } else if (i2 == -2) {
                            if (!ShellModel.l.contains(itemInfo)) {
                                ShellModel.l.add(itemInfo);
                            }
                        } else if (i2 == -5 && !ShellModel.n.contains(itemInfo)) {
                            ShellModel.n.add(itemInfo);
                        }
                        ShellModel.a("changeContainer");
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            r0 = 2
            r2 = 1
            r1 = 0
            java.lang.String r3 = r9.getAction()
            java.lang.String r4 = "android.intent.action.PACKAGE_CHANGED"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L1f
            java.lang.String r4 = "android.intent.action.PACKAGE_REMOVED"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L1f
            java.lang.String r4 = "android.intent.action.PACKAGE_ADDED"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L71
        L1f:
            android.net.Uri r4 = r9.getData()
            java.lang.String r4 = r4.getSchemeSpecificPart()
            java.lang.String r5 = "android.intent.extra.REPLACING"
            boolean r5 = r9.getBooleanExtra(r5, r1)
            if (r4 == 0) goto L35
            int r6 = r4.length()
            if (r6 != 0) goto L36
        L35:
            return
        L36:
            java.lang.String r6 = "android.intent.action.PACKAGE_CHANGED"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L4d
        L3e:
            if (r0 == 0) goto L35
            com.tsf.shell.manager.bind.ShellModel$c r3 = new com.tsf.shell.manager.bind.ShellModel$c
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r1] = r4
            r3.<init>(r0, r2)
            r7.a(r3)
            goto L35
        L4d:
            java.lang.String r6 = "android.intent.action.PACKAGE_REMOVED"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L59
            if (r5 != 0) goto La1
            r0 = 3
            goto L3e
        L59:
            java.lang.String r6 = "android.intent.action.PACKAGE_ADDED"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto La1
            com.tsf.shell.manager.bind.ShellModel$1 r3 = new com.tsf.shell.manager.bind.ShellModel$1
            r3.<init>()
            com.censivn.C3DEngine.b.c.c r6 = com.censivn.C3DEngine.a.a()
            r6.d(r3)
            if (r5 != 0) goto L3e
            r0 = r2
            goto L3e
        L71:
            java.lang.String r0 = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L89
            java.lang.String r0 = "android.intent.extra.changed_package_list"
            java.lang.String[] r0 = r9.getStringArrayExtra(r0)
            com.tsf.shell.manager.bind.ShellModel$c r1 = new com.tsf.shell.manager.bind.ShellModel$c
            r2 = 5
            r1.<init>(r2, r0)
            r7.a(r1)
            goto L35
        L89:
            java.lang.String r0 = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L35
            java.lang.String r0 = "android.intent.extra.changed_package_list"
            java.lang.String[] r0 = r9.getStringArrayExtra(r0)
            com.tsf.shell.manager.bind.ShellModel$c r1 = new com.tsf.shell.manager.bind.ShellModel$c
            r2 = 4
            r1.<init>(r2, r0)
            r7.a(r1)
            goto L35
        La1:
            r0 = r1
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.manager.bind.ShellModel.onReceive(android.content.Context, android.content.Intent):void");
    }

    private class b implements Runnable {
        private Context b;

        b(Context context) {
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ShellModel.f) {
                Process.setThreadPriority(0);
            }
            a(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.b.1
                @Override // java.lang.Runnable
                public void run() {
                    ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.b.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (ShellModel.f) {
                                Process.setThreadPriority(10);
                            }
                            b.this.c();
                            b.this.b = null;
                            synchronized (ShellModel.f) {
                                if (ShellModel.this.c == b.this) {
                                    ShellModel.this.c = null;
                                }
                            }
                            System.gc();
                        }
                    });
                }
            }, b());
            Home.b().i();
        }

        private void a() {
            synchronized (ShellModel.f) {
                ShellModel.i.clear();
                ShellModel.j.clear();
                ShellModel.h.clear();
                ShellModel.g.clear();
            }
        }

        private int a(String str) {
            int iIndexOf;
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf("i.action")) > 0) {
                String[] strArrSplit = str.substring(iIndexOf).split(";");
                if (strArrSplit.length > 0) {
                    return Integer.valueOf(strArrSplit[0].split("=")[1]).intValue();
                }
            }
            return -1;
        }

        private d b() {
            boolean z;
            LauncherAppWidgetInfo launcherAppWidgetInfo;
            d dVar = ShellModel.this.new d();
            Context context = this.b;
            ContentResolver contentResolver = context.getContentResolver();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            a();
            synchronized (ShellModel.f) {
                ArrayList arrayList = new ArrayList();
                Cursor cursorQuery = contentResolver.query(g.e.a, null, null, null, "itemType ASC");
                try {
                    Uri uri = g.e.a;
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("intent");
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("title");
                    int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("container");
                    int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("itemType");
                    int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("appWidgetId");
                    int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow("screen");
                    int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow("cellX");
                    int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow("cellY");
                    int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow("rotation");
                    int columnIndexOrThrow11 = cursorQuery.getColumnIndexOrThrow("spanX");
                    int columnIndexOrThrow12 = cursorQuery.getColumnIndexOrThrow("spanY");
                    cursorQuery.getColumnIndexOrThrow("classname");
                    int columnIndexOrThrow13 = cursorQuery.getColumnIndexOrThrow("packagename");
                    cursorQuery.getColumnIndexOrThrow("internal");
                    int columnIndexOrThrow14 = cursorQuery.getColumnIndexOrThrow("config");
                    int columnIndexOrThrow15 = cursorQuery.getColumnIndexOrThrow("scale");
                    int columnIndexOrThrow16 = cursorQuery.getColumnIndexOrThrow("appWidgetProvider");
                    int columnIndexOrThrow17 = cursorQuery.getColumnIndexOrThrow("iconType");
                    cursorQuery.getColumnIndexOrThrow("icon");
                    int columnIndexOrThrow18 = cursorQuery.getColumnIndexOrThrow("iconPackage");
                    int columnIndexOrThrow19 = cursorQuery.getColumnIndexOrThrow("iconResource");
                    int columnIndexOrThrow20 = cursorQuery.getColumnIndexOrThrow("titleType");
                    while (cursorQuery.moveToNext()) {
                        try {
                            int iA = a(cursorQuery.getString(columnIndexOrThrow2));
                            int i = cursorQuery.getInt(columnIndexOrThrow5);
                            int i2 = (int) cursorQuery.getLong(columnIndexOrThrow);
                            int i3 = cursorQuery.getInt(columnIndexOrThrow7);
                            if (i3 != -1) {
                                switch (i) {
                                    case 1:
                                        LauncherFolder3DInfo launcherFolder3DInfoB = ShellModel.b(ShellModel.h, Integer.valueOf(i2));
                                        com.tsf.shell.manager.r.a.a(launcherFolder3DInfoB, cursorQuery, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                        launcherFolder3DInfoB.title = cursorQuery.getString(columnIndexOrThrow3);
                                        launcherFolder3DInfoB.title = (launcherFolder3DInfoB.title == null || launcherFolder3DInfoB.title.length() == 0) ? x.c(b.i.widget_folder) : launcherFolder3DInfoB.title;
                                        int i4 = cursorQuery.getInt(columnIndexOrThrow4);
                                        launcherFolder3DInfoB.container = i4;
                                        launcherFolder3DInfoB.config = cursorQuery.getString(columnIndexOrThrow14);
                                        switch (i4) {
                                            case -5:
                                                ShellModel.n.add(launcherFolder3DInfoB);
                                                ShellModel.g.put(Integer.valueOf(launcherFolder3DInfoB.id), launcherFolder3DInfoB);
                                                break;
                                            case -4:
                                                ShellModel.m.add(launcherFolder3DInfoB);
                                                ShellModel.g.put(Integer.valueOf(launcherFolder3DInfoB.id), launcherFolder3DInfoB);
                                                break;
                                            case -3:
                                                ShellModel.k.add(launcherFolder3DInfoB);
                                                ShellModel.g.put(Integer.valueOf(launcherFolder3DInfoB.id), launcherFolder3DInfoB);
                                                break;
                                            case -2:
                                            default:
                                                arrayList.add(Integer.valueOf(i2));
                                                break;
                                            case ItemInfo.NO_ID /* -1 */:
                                                ShellModel.i.add(launcherFolder3DInfoB);
                                                ShellModel.g.put(Integer.valueOf(launcherFolder3DInfoB.id), launcherFolder3DInfoB);
                                                break;
                                        }
                                        break;
                                    case 2:
                                    case 7:
                                        LauncherShortcut3DInfo launcherShortcut3DInfoA = com.tsf.shell.manager.l.a.a(i);
                                        com.tsf.shell.manager.r.a.a(launcherShortcut3DInfoA, cursorQuery, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                        launcherShortcut3DInfoA.title = cursorQuery.getString(columnIndexOrThrow3);
                                        launcherShortcut3DInfoA.title = launcherShortcut3DInfoA.title == null ? "" : launcherShortcut3DInfoA.title;
                                        launcherShortcut3DInfoA.packagename = cursorQuery.getString(columnIndexOrThrow13);
                                        int i5 = cursorQuery.getInt(columnIndexOrThrow4);
                                        launcherShortcut3DInfoA.container = i5;
                                        launcherShortcut3DInfoA.titleType = cursorQuery.getInt(columnIndexOrThrow20);
                                        launcherShortcut3DInfoA.iconType = cursorQuery.getInt(columnIndexOrThrow17);
                                        if (launcherShortcut3DInfoA.iconType == 1) {
                                            Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
                                            shortcutIconResource.packageName = cursorQuery.getString(columnIndexOrThrow18);
                                            shortcutIconResource.resourceName = cursorQuery.getString(columnIndexOrThrow19);
                                            launcherShortcut3DInfoA.iconResource = shortcutIconResource;
                                        }
                                        try {
                                            launcherShortcut3DInfoA.intent = Intent.parseUri(cursorQuery.getString(columnIndexOrThrow2), 0);
                                            break;
                                        } catch (Exception e) {
                                        }
                                        if (iA != -1) {
                                            com.tsf.shell.manager.action.b.a(launcherShortcut3DInfoA, iA);
                                        }
                                        switch (i5) {
                                            case -5:
                                                ShellModel.n.add(launcherShortcut3DInfoA);
                                                break;
                                            case -4:
                                                ShellModel.m.add(launcherShortcut3DInfoA);
                                                break;
                                            case -3:
                                                ShellModel.k.add(launcherShortcut3DInfoA);
                                                break;
                                            case -2:
                                                ShellModel.l.add(launcherShortcut3DInfoA);
                                                break;
                                            case ItemInfo.NO_ID /* -1 */:
                                                ShellModel.i.add(launcherShortcut3DInfoA);
                                                break;
                                            default:
                                                ShellModel.b(ShellModel.h, Integer.valueOf(i5)).add(launcherShortcut3DInfoA);
                                                break;
                                        }
                                        ShellModel.g.put(Integer.valueOf(launcherShortcut3DInfoA.id), launcherShortcut3DInfoA);
                                        break;
                                    case 3:
                                        int i6 = cursorQuery.getInt(columnIndexOrThrow6);
                                        String string = cursorQuery.getString(columnIndexOrThrow16);
                                        AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i6);
                                        if (!com.tsf.shell.manager.a.h.b(i3)) {
                                            arrayList.add(Integer.valueOf(i2));
                                        } else {
                                            if (appWidgetInfo == null || appWidgetInfo.provider == null || appWidgetInfo.provider.getPackageName() == null) {
                                                launcherAppWidgetInfo = new LauncherAppWidgetInfo(i6, ComponentName.unflattenFromString(string));
                                            } else {
                                                launcherAppWidgetInfo = new LauncherAppWidgetInfo(i6, appWidgetInfo.provider);
                                            }
                                            com.tsf.shell.manager.r.a.a(launcherAppWidgetInfo, cursorQuery, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                            launcherAppWidgetInfo.container = cursorQuery.getInt(columnIndexOrThrow4);
                                            if (appWidgetInfo != null) {
                                                String strFlattenToString = appWidgetInfo.provider.flattenToString();
                                                if (!strFlattenToString.equals(string)) {
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("appWidgetProvider", strFlattenToString);
                                                    contentResolver.update(uri, contentValues, "_id= ?", new String[]{Integer.toString(cursorQuery.getInt(columnIndexOrThrow))});
                                                }
                                            }
                                            ShellModel.j.add(launcherAppWidgetInfo);
                                            ShellModel.g.put(Integer.valueOf(launcherAppWidgetInfo.id), launcherAppWidgetInfo);
                                        }
                                        break;
                                    case 4:
                                    case 6:
                                    default:
                                        arrayList.add(Integer.valueOf(i2));
                                        break;
                                    case 5:
                                        LauncherWidget3DInfo launcherWidget3DInfo = new LauncherWidget3DInfo();
                                        com.tsf.shell.manager.r.a.a(launcherWidget3DInfo, cursorQuery, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                        launcherWidget3DInfo.packagename = cursorQuery.getString(columnIndexOrThrow13);
                                        launcherWidget3DInfo.config = cursorQuery.getString(columnIndexOrThrow14);
                                        if (launcherWidget3DInfo.packagename.equals("com.tsf.shell")) {
                                            launcherWidget3DInfo.packagename = "com.tsf.shell.widget.alarm";
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("packagename", launcherWidget3DInfo.packagename);
                                            contentValues2.put("classname", "");
                                            launcherWidget3DInfo.updateDatabase(contentValues2);
                                        }
                                        ShellModel.i.add(launcherWidget3DInfo);
                                        ShellModel.g.put(Integer.valueOf(launcherWidget3DInfo.id), launcherWidget3DInfo);
                                        break;
                                }
                            } else {
                                arrayList.add(Integer.valueOf(i2));
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    cursorQuery.close();
                    ArrayList<String> arrayListI = e.i();
                    dVar.a = arrayListI;
                    ArrayList arrayList2 = new ArrayList();
                    for (ItemInfo itemInfo : ShellModel.k) {
                        Iterator<String> it = arrayListI.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                            } else if (it.next().contains(Integer.toString(itemInfo.id))) {
                                z = true;
                            }
                        }
                        if (!z) {
                            arrayList2.add(itemInfo);
                            arrayList.add(Integer.valueOf(itemInfo.id));
                            itemInfo.id = -1;
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ShellModel.k.remove((ItemInfo) it2.next());
                    }
                    arrayList2.clear();
                    String strB = f.b();
                    dVar.b = strB;
                    ArrayList arrayList3 = new ArrayList();
                    for (ItemInfo itemInfo2 : ShellModel.m) {
                        if (!strB.contains(Integer.toString(itemInfo2.id))) {
                            arrayList3.add(itemInfo2);
                            arrayList.add(Integer.valueOf(itemInfo2.id));
                            itemInfo2.id = -1;
                        }
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        ShellModel.m.remove((ItemInfo) it3.next());
                    }
                    arrayList3.clear();
                    String strN = com.tsf.shell.manager.m.b.n();
                    dVar.d = strN;
                    ArrayList arrayList4 = new ArrayList();
                    for (ItemInfo itemInfo3 : ShellModel.n) {
                        if (!strN.contains(Integer.toString(itemInfo3.id))) {
                            arrayList4.add(itemInfo3);
                            arrayList.add(Integer.valueOf(itemInfo3.id));
                            itemInfo3.id = -1;
                        }
                    }
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ShellModel.n.remove((ItemInfo) it4.next());
                    }
                    arrayList4.clear();
                    String strQ = com.tsf.shell.f.h.f.q();
                    dVar.c = strQ;
                    ArrayList arrayList5 = new ArrayList();
                    for (ItemInfo itemInfo4 : ShellModel.l) {
                        if (!strQ.contains(Integer.toString(itemInfo4.id))) {
                            arrayList5.add(itemInfo4);
                            arrayList.add(Integer.valueOf(itemInfo4.id));
                            itemInfo4.id = -1;
                        }
                    }
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        ShellModel.l.remove((ItemInfo) it5.next());
                    }
                    arrayList5.clear();
                    ArrayList arrayList6 = new ArrayList();
                    for (Integer num : ShellModel.h.keySet()) {
                        LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) ShellModel.h.get(num);
                        if (launcherFolder3DInfo.id == -1) {
                            com.censivn.C3DEngine.a.d().getContentResolver().delete(g.e.a, "container=" + num, null);
                            for (ItemInfo itemInfo5 : launcherFolder3DInfo.getItemInfo()) {
                                ShellModel.g.remove(Integer.valueOf(itemInfo5.id));
                                itemInfo5.unbind();
                            }
                            launcherFolder3DInfo.getItemInfo().clear();
                            arrayList6.add(num);
                        }
                    }
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        ShellModel.h.remove((Integer) it6.next());
                    }
                    if (arrayList.size() > 0) {
                        ContentProviderClient contentProviderClientAcquireContentProviderClient = contentResolver.acquireContentProviderClient(g.e.a);
                        Iterator it7 = arrayList.iterator();
                        while (it7.hasNext()) {
                            try {
                                contentProviderClientAcquireContentProviderClient.delete(g.e.a(((Integer) it7.next()).intValue(), false), null, null);
                            } catch (RemoteException e3) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            return dVar;
        }

        private void a(Runnable runnable, d dVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList<ItemInfo> arrayList2 = new ArrayList<>();
            ArrayList<ItemInfo> arrayList3 = new ArrayList<>();
            ArrayList<ItemInfo> arrayList4 = new ArrayList<>();
            ArrayList<ItemInfo> arrayList5 = new ArrayList<>();
            ArrayList arrayList6 = new ArrayList();
            synchronized (ShellModel.f) {
                arrayList.addAll(ShellModel.i);
                arrayList2.addAll(ShellModel.k);
                arrayList6.addAll(ShellModel.j);
                arrayList4.addAll(ShellModel.l);
                arrayList5.addAll(ShellModel.n);
                arrayList3.addAll(ShellModel.m);
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                ShellModel.this.o.a((LauncherAppWidgetInfo) it.next());
            }
            ShellModel.this.o.c(arrayList4, dVar.c);
            ShellModel.this.o.b(arrayList5, dVar.d);
            com.tsf.shell.manager.bind.b unused = ShellModel.this.o;
            com.tsf.shell.manager.bind.b.a(arrayList, null, null);
            ShellModel.this.o.a(arrayList2, dVar.a);
            ShellModel.this.o.a(arrayList3, dVar.b);
            runnable.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            PackageManager packageManager = this.b.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            System.currentTimeMillis();
            if (listQueryIntentActivities != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    com.tsf.shell.manager.a.f fVarB = com.tsf.shell.manager.bind.a.c().b(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
                    if (fVarB == null) {
                        ShellModel.this.a.c(new com.tsf.shell.manager.a.f(resolveInfo));
                    } else {
                        ShellModel.this.a.e(fVarB);
                    }
                }
                ArrayList<com.tsf.shell.manager.a.f> arrayList = ShellModel.this.a.b;
                ShellModel.this.a.b = new ArrayList<>();
                ShellModel.this.o.a(arrayList);
            }
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addDataScheme("package");
            this.b.registerReceiver(ShellModel.this, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
            intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
            this.b.registerReceiver(ShellModel.this, intentFilter2);
            List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(new Intent("com.tsf.shell.3dwidget", (Uri) null), 0);
            if (listQueryIntentActivities2 != null && !listQueryIntentActivities2.isEmpty()) {
                Collections.sort(listQueryIntentActivities2, new ResolveInfo.DisplayNameComparator(packageManager));
                for (int i2 = 0; i2 < listQueryIntentActivities2.size(); i2++) {
                    ResolveInfo resolveInfo2 = listQueryIntentActivities2.get(i2);
                    if (com.tsf.shell.manager.bind.a.c().c(new ComponentName(resolveInfo2.activityInfo.applicationInfo.packageName, resolveInfo2.activityInfo.name)) == null) {
                        ShellModel.this.a.f(new com.tsf.shell.manager.a.f(resolveInfo2));
                    }
                }
                ArrayList<com.tsf.shell.manager.a.f> arrayList2 = ShellModel.this.a.f;
                ShellModel.this.a.f = new ArrayList<>();
                com.tsf.shell.manager.a.i.a(arrayList2);
            }
        }
    }

    void a(c cVar) {
        com.tsf.shell.d.a().a(cVar);
    }

    public class c implements Runnable {
        int a;
        String[] b;

        public c(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<com.tsf.shell.manager.a.f> arrayList;
            ArrayList<com.tsf.shell.manager.a.f> arrayList2;
            ArrayList<com.tsf.shell.manager.a.f> arrayList3;
            ArrayList<com.tsf.shell.manager.a.f> arrayList4;
            ArrayList<com.tsf.shell.manager.a.f> arrayList5;
            ArrayList<com.tsf.shell.manager.a.f> arrayList6;
            Context context = ShellModel.this.d;
            String[] strArr = this.b;
            switch (this.a) {
                case 1:
                case 5:
                    for (String str : strArr) {
                        ShellModel.this.a.a(context, str);
                    }
                    break;
                case 2:
                    for (String str2 : strArr) {
                        ShellModel.this.a.c(context, str2);
                    }
                    break;
                case 3:
                    for (String str3 : strArr) {
                        ShellModel.this.a.b(context, str3);
                    }
                    break;
            }
            if (ShellModel.this.a.b.size() > 0) {
                arrayList = ShellModel.this.a.b;
                ShellModel.this.a.b = new ArrayList<>();
            } else {
                arrayList = null;
            }
            if (ShellModel.this.a.c.size() > 0) {
                arrayList2 = ShellModel.this.a.c;
                ShellModel.this.a.c = new ArrayList<>();
            } else {
                arrayList2 = null;
            }
            if (ShellModel.this.a.d.size() > 0) {
                arrayList3 = ShellModel.this.a.d;
                ShellModel.this.a.d = new ArrayList<>();
            } else {
                arrayList3 = null;
            }
            if (ShellModel.this.a.f.size() > 0) {
                arrayList4 = ShellModel.this.a.f;
                ShellModel.this.a.f = new ArrayList<>();
            } else {
                arrayList4 = null;
            }
            if (ShellModel.this.a.g.size() > 0) {
                arrayList5 = ShellModel.this.a.g;
                ShellModel.this.a.g = new ArrayList<>();
            } else {
                arrayList5 = null;
            }
            if (ShellModel.this.a.h.size() > 0) {
                ArrayList<com.tsf.shell.manager.a.f> arrayList7 = ShellModel.this.a.h;
                ShellModel.this.a.h = new ArrayList<>();
                arrayList6 = arrayList7;
            } else {
                arrayList6 = null;
            }
            if (arrayList != null) {
                ShellModel.this.o.a(arrayList, this.a != 5);
            }
            if (arrayList3 != null) {
                ShellModel.this.o.b(arrayList3);
            }
            if (arrayList2 != null) {
                ShellModel.this.o.b(arrayList2, this.a != 4);
            }
            if (arrayList4 != null) {
                com.tsf.shell.manager.a.i.b(arrayList4);
            }
            if (arrayList6 != null) {
                com.tsf.shell.manager.a.i.c(arrayList6);
            }
            if (arrayList5 != null) {
                com.tsf.shell.manager.a.i.a(arrayList5, this.a != 4);
            }
        }
    }

    class d {
        public ArrayList<String> a;
        public String b;
        public String c;
        public String d;

        d() {
        }
    }
}
