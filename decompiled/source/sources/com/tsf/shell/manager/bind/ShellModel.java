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
import com.tsf.extend.base.j.q;
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
/* loaded from: classes.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public ShellModel(Context context) {
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
        Iterator<ItemInfo> it = i.iterator();
        while (it.hasNext()) {
            ItemInfo next = it.next();
            if ((next instanceof LauncherShortcutStandardInfo) && (launcherShortcutStandardInfo = (LauncherShortcutStandardInfo) next) != null && launcherShortcutStandardInfo.intent != null && launcherShortcutStandardInfo.intent.getIntExtra("action", -1) == i2) {
                return next;
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

    public static void a(HashMap<Integer, ItemInfo> hashMap) {
        synchronized (f) {
            hashMap.putAll(g);
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
    public static LauncherFolder3DInfo b(HashMap<Integer, LauncherFolder3DInfo> hashMap, Integer num) {
        LauncherFolder3DInfo launcherFolder3DInfo = hashMap.get(num);
        if (launcherFolder3DInfo == null) {
            LauncherFolder3DInfo launcherFolder3DInfo2 = new LauncherFolder3DInfo();
            hashMap.put(num, launcherFolder3DInfo2);
            return launcherFolder3DInfo2;
        }
        return launcherFolder3DInfo;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static byte[] a(ItemInfo itemInfo) {
            byte[] bArr;
            Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(g.e.a(itemInfo.id, false), null, null, null, null);
            try {
                query.moveToNext();
                bArr = query.getBlob(query.getColumnIndexOrThrow("icon"));
                try {
                    query.close();
                } catch (Exception e) {
                    query.close();
                    return bArr;
                }
            } catch (Exception e2) {
                bArr = null;
            }
            return bArr;
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
                    contentResolver.delete(g.e.a(ItemInfo.this.id, false), null, null);
                    synchronized (ShellModel.f) {
                        switch (ItemInfo.this.itemType) {
                            case 1:
                                contentResolver.delete(g.e.a, "container=" + ItemInfo.this.id, null);
                                ShellModel.h.remove(Integer.valueOf(ItemInfo.this.id));
                                switch (ItemInfo.this.container) {
                                    case -5:
                                        ShellModel.n.remove(ItemInfo.this);
                                        break;
                                    case -4:
                                        ShellModel.m.remove(ItemInfo.this);
                                        break;
                                    case -3:
                                        ShellModel.k.remove(ItemInfo.this);
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        ShellModel.i.remove(ItemInfo.this);
                                        break;
                                }
                            case 2:
                            case 7:
                                switch (ItemInfo.this.container) {
                                    case -5:
                                        ShellModel.n.remove(ItemInfo.this);
                                        break;
                                    case -4:
                                        ShellModel.m.remove(ItemInfo.this);
                                        break;
                                    case -3:
                                        ShellModel.k.remove(ItemInfo.this);
                                        break;
                                    case -2:
                                        ShellModel.l.remove(ItemInfo.this);
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        ShellModel.i.remove(ItemInfo.this);
                                        break;
                                }
                            case 3:
                                ShellModel.j.remove((LauncherAppWidgetInfo) ItemInfo.this);
                                break;
                            case 5:
                                ShellModel.i.remove(ItemInfo.this);
                                break;
                        }
                        ShellModel.g.remove(Integer.valueOf(ItemInfo.this.id));
                        ItemInfo.this.unbind();
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

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i2 = 2;
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_CHANGED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_ADDED".equals(action)) {
            final String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (schemeSpecificPart != null && schemeSpecificPart.length() != 0) {
                if (!"android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        if (!booleanExtra) {
                            i2 = 3;
                        }
                        i2 = 0;
                    } else {
                        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                            com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ItemInfo b2 = ShellModel.this.b(schemeSpecificPart);
                                    if (b2 != null) {
                                        final com.tsf.shell.f.i.b widget = b2.getWidget();
                                        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.1.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                if (widget != null) {
                                                    q.a("szxasasqsq", "ShellModel...542");
                                                    widget.removeFromParent();
                                                    com.tsf.shell.manager.a.i.b(widget);
                                                }
                                            }
                                        });
                                    }
                                }
                            });
                            if (!booleanExtra) {
                                i2 = 1;
                            }
                        }
                        i2 = 0;
                    }
                }
                if (i2 != 0) {
                    a(new c(i2, new String[]{schemeSpecificPart}));
                }
            }
        } else if ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action)) {
            a(new c(5, intent.getStringArrayExtra("android.intent.extra.changed_package_list")));
        } else if ("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action)) {
            a(new c(4, intent.getStringArrayExtra("android.intent.extra.changed_package_list")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
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
            int indexOf;
            if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf("i.action")) > 0) {
                String[] split = str.substring(indexOf).split(";");
                if (split.length > 0) {
                    return Integer.valueOf(split[0].split("=")[1]).intValue();
                }
            }
            return -1;
        }

        private d b() {
            boolean z;
            LauncherAppWidgetInfo launcherAppWidgetInfo;
            d dVar = new d();
            Context context = this.b;
            ContentResolver contentResolver = context.getContentResolver();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            a();
            synchronized (ShellModel.f) {
                ArrayList arrayList = new ArrayList();
                Cursor query = contentResolver.query(g.e.a, null, null, null, "itemType ASC");
                Uri uri = g.e.a;
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("intent");
                int columnIndexOrThrow3 = query.getColumnIndexOrThrow("title");
                int columnIndexOrThrow4 = query.getColumnIndexOrThrow("container");
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("itemType");
                int columnIndexOrThrow6 = query.getColumnIndexOrThrow("appWidgetId");
                int columnIndexOrThrow7 = query.getColumnIndexOrThrow("screen");
                int columnIndexOrThrow8 = query.getColumnIndexOrThrow("cellX");
                int columnIndexOrThrow9 = query.getColumnIndexOrThrow("cellY");
                int columnIndexOrThrow10 = query.getColumnIndexOrThrow("rotation");
                int columnIndexOrThrow11 = query.getColumnIndexOrThrow("spanX");
                int columnIndexOrThrow12 = query.getColumnIndexOrThrow("spanY");
                query.getColumnIndexOrThrow("classname");
                int columnIndexOrThrow13 = query.getColumnIndexOrThrow("packagename");
                query.getColumnIndexOrThrow("internal");
                int columnIndexOrThrow14 = query.getColumnIndexOrThrow("config");
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("scale");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("appWidgetProvider");
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("iconType");
                query.getColumnIndexOrThrow("icon");
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("iconPackage");
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("iconResource");
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("titleType");
                while (query.moveToNext()) {
                    try {
                        int a = a(query.getString(columnIndexOrThrow2));
                        int i = query.getInt(columnIndexOrThrow5);
                        int i2 = (int) query.getLong(columnIndexOrThrow);
                        int i3 = query.getInt(columnIndexOrThrow7);
                        if (i3 != -1) {
                            switch (i) {
                                case 1:
                                    LauncherFolder3DInfo b = ShellModel.b(ShellModel.h, Integer.valueOf(i2));
                                    com.tsf.shell.manager.r.a.a(b, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                    b.title = query.getString(columnIndexOrThrow3);
                                    b.title = (b.title == null || b.title.length() == 0) ? x.c(b.i.widget_folder) : b.title;
                                    int i4 = query.getInt(columnIndexOrThrow4);
                                    b.container = i4;
                                    b.config = query.getString(columnIndexOrThrow14);
                                    switch (i4) {
                                        case -5:
                                            ShellModel.n.add(b);
                                            ShellModel.g.put(Integer.valueOf(b.id), b);
                                            continue;
                                        case -4:
                                            ShellModel.m.add(b);
                                            ShellModel.g.put(Integer.valueOf(b.id), b);
                                            continue;
                                        case -3:
                                            ShellModel.k.add(b);
                                            ShellModel.g.put(Integer.valueOf(b.id), b);
                                            continue;
                                        case -2:
                                        default:
                                            arrayList.add(Integer.valueOf(i2));
                                            continue;
                                        case ItemInfo.NO_ID /* -1 */:
                                            ShellModel.i.add(b);
                                            ShellModel.g.put(Integer.valueOf(b.id), b);
                                            continue;
                                            continue;
                                    }
                                case 2:
                                case 7:
                                    LauncherShortcut3DInfo a2 = com.tsf.shell.manager.l.a.a(i);
                                    com.tsf.shell.manager.r.a.a(a2, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                    a2.title = query.getString(columnIndexOrThrow3);
                                    a2.title = a2.title == null ? "" : a2.title;
                                    a2.packagename = query.getString(columnIndexOrThrow13);
                                    int i5 = query.getInt(columnIndexOrThrow4);
                                    a2.container = i5;
                                    a2.titleType = query.getInt(columnIndexOrThrow20);
                                    a2.iconType = query.getInt(columnIndexOrThrow17);
                                    if (a2.iconType == 1) {
                                        Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
                                        shortcutIconResource.packageName = query.getString(columnIndexOrThrow18);
                                        shortcutIconResource.resourceName = query.getString(columnIndexOrThrow19);
                                        a2.iconResource = shortcutIconResource;
                                    }
                                    try {
                                        a2.intent = Intent.parseUri(query.getString(columnIndexOrThrow2), 0);
                                    } catch (Exception e) {
                                    }
                                    if (a != -1) {
                                        com.tsf.shell.manager.action.b.a(a2, a);
                                    }
                                    switch (i5) {
                                        case -5:
                                            ShellModel.n.add(a2);
                                            break;
                                        case -4:
                                            ShellModel.m.add(a2);
                                            break;
                                        case -3:
                                            ShellModel.k.add(a2);
                                            break;
                                        case -2:
                                            ShellModel.l.add(a2);
                                            break;
                                        case ItemInfo.NO_ID /* -1 */:
                                            ShellModel.i.add(a2);
                                            break;
                                        default:
                                            ShellModel.b(ShellModel.h, Integer.valueOf(i5)).add(a2);
                                            break;
                                    }
                                    ShellModel.g.put(Integer.valueOf(a2.id), a2);
                                    continue;
                                case 3:
                                    int i6 = query.getInt(columnIndexOrThrow6);
                                    String string = query.getString(columnIndexOrThrow16);
                                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i6);
                                    if (!com.tsf.shell.manager.a.h.b(i3)) {
                                        arrayList.add(Integer.valueOf(i2));
                                        break;
                                    } else {
                                        if (appWidgetInfo == null || appWidgetInfo.provider == null || appWidgetInfo.provider.getPackageName() == null) {
                                            launcherAppWidgetInfo = new LauncherAppWidgetInfo(i6, ComponentName.unflattenFromString(string));
                                        } else {
                                            launcherAppWidgetInfo = new LauncherAppWidgetInfo(i6, appWidgetInfo.provider);
                                        }
                                        com.tsf.shell.manager.r.a.a(launcherAppWidgetInfo, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                        launcherAppWidgetInfo.container = query.getInt(columnIndexOrThrow4);
                                        if (appWidgetInfo != null) {
                                            String flattenToString = appWidgetInfo.provider.flattenToString();
                                            if (!flattenToString.equals(string)) {
                                                ContentValues contentValues = new ContentValues();
                                                contentValues.put("appWidgetProvider", flattenToString);
                                                contentResolver.update(uri, contentValues, "_id= ?", new String[]{Integer.toString(query.getInt(columnIndexOrThrow))});
                                            }
                                        }
                                        ShellModel.j.add(launcherAppWidgetInfo);
                                        ShellModel.g.put(Integer.valueOf(launcherAppWidgetInfo.id), launcherAppWidgetInfo);
                                        continue;
                                    }
                                    break;
                                case 4:
                                case 6:
                                default:
                                    arrayList.add(Integer.valueOf(i2));
                                    continue;
                                case 5:
                                    LauncherWidget3DInfo launcherWidget3DInfo = new LauncherWidget3DInfo();
                                    com.tsf.shell.manager.r.a.a(launcherWidget3DInfo, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                    launcherWidget3DInfo.packagename = query.getString(columnIndexOrThrow13);
                                    launcherWidget3DInfo.config = query.getString(columnIndexOrThrow14);
                                    if (launcherWidget3DInfo.packagename.equals("com.tsf.shell")) {
                                        launcherWidget3DInfo.packagename = "com.tsf.shell.widget.alarm";
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("packagename", launcherWidget3DInfo.packagename);
                                        contentValues2.put("classname", "");
                                        launcherWidget3DInfo.updateDatabase(contentValues2);
                                    }
                                    ShellModel.i.add(launcherWidget3DInfo);
                                    ShellModel.g.put(Integer.valueOf(launcherWidget3DInfo.id), launcherWidget3DInfo);
                                    continue;
                            }
                        } else {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                query.close();
                ArrayList<String> i7 = e.i();
                dVar.a = i7;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ShellModel.k.iterator();
                while (it.hasNext()) {
                    ItemInfo itemInfo = (ItemInfo) it.next();
                    Iterator<String> it2 = i7.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                        } else if (it2.next().contains(Integer.toString(itemInfo.id))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        arrayList2.add(itemInfo);
                        arrayList.add(Integer.valueOf(itemInfo.id));
                        itemInfo.id = -1;
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ShellModel.k.remove((ItemInfo) it3.next());
                }
                arrayList2.clear();
                String b2 = f.b();
                dVar.b = b2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = ShellModel.m.iterator();
                while (it4.hasNext()) {
                    ItemInfo itemInfo2 = (ItemInfo) it4.next();
                    if (!b2.contains(Integer.toString(itemInfo2.id))) {
                        arrayList3.add(itemInfo2);
                        arrayList.add(Integer.valueOf(itemInfo2.id));
                        itemInfo2.id = -1;
                    }
                }
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    ShellModel.m.remove((ItemInfo) it5.next());
                }
                arrayList3.clear();
                String n = com.tsf.shell.manager.m.b.n();
                dVar.d = n;
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = ShellModel.n.iterator();
                while (it6.hasNext()) {
                    ItemInfo itemInfo3 = (ItemInfo) it6.next();
                    if (!n.contains(Integer.toString(itemInfo3.id))) {
                        arrayList4.add(itemInfo3);
                        arrayList.add(Integer.valueOf(itemInfo3.id));
                        itemInfo3.id = -1;
                    }
                }
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    ShellModel.n.remove((ItemInfo) it7.next());
                }
                arrayList4.clear();
                String q = com.tsf.shell.f.h.f.q();
                dVar.c = q;
                ArrayList arrayList5 = new ArrayList();
                Iterator it8 = ShellModel.l.iterator();
                while (it8.hasNext()) {
                    ItemInfo itemInfo4 = (ItemInfo) it8.next();
                    if (!q.contains(Integer.toString(itemInfo4.id))) {
                        arrayList5.add(itemInfo4);
                        arrayList.add(Integer.valueOf(itemInfo4.id));
                        itemInfo4.id = -1;
                    }
                }
                Iterator it9 = arrayList5.iterator();
                while (it9.hasNext()) {
                    ShellModel.l.remove((ItemInfo) it9.next());
                }
                arrayList5.clear();
                ArrayList arrayList6 = new ArrayList();
                for (Integer num : ShellModel.h.keySet()) {
                    LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) ShellModel.h.get(num);
                    if (launcherFolder3DInfo.id == -1) {
                        com.censivn.C3DEngine.a.d().getContentResolver().delete(g.e.a, "container=" + num, null);
                        Iterator<ItemInfo> it10 = launcherFolder3DInfo.getItemInfo().iterator();
                        while (it10.hasNext()) {
                            ItemInfo next = it10.next();
                            ShellModel.g.remove(Integer.valueOf(next.id));
                            next.unbind();
                        }
                        launcherFolder3DInfo.getItemInfo().clear();
                        arrayList6.add(num);
                    }
                }
                Iterator it11 = arrayList6.iterator();
                while (it11.hasNext()) {
                    ShellModel.h.remove((Integer) it11.next());
                }
                if (arrayList.size() > 0) {
                    ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient(g.e.a);
                    Iterator it12 = arrayList.iterator();
                    while (it12.hasNext()) {
                        try {
                            acquireContentProviderClient.delete(g.e.a(((Integer) it12.next()).intValue(), false), null, null);
                        } catch (RemoteException e3) {
                        }
                    }
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
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            System.currentTimeMillis();
            if (queryIntentActivities != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i);
                    com.tsf.shell.manager.a.f b = com.tsf.shell.manager.bind.a.c().b(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
                    if (b == null) {
                        ShellModel.this.a.c(new com.tsf.shell.manager.a.f(resolveInfo));
                    } else {
                        ShellModel.this.a.e(b);
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
            List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(new Intent("com.tsf.shell.3dwidget", (Uri) null), 0);
            if (queryIntentActivities2 != null && !queryIntentActivities2.isEmpty()) {
                Collections.sort(queryIntentActivities2, new ResolveInfo.DisplayNameComparator(packageManager));
                for (int i2 = 0; i2 < queryIntentActivities2.size(); i2++) {
                    ResolveInfo resolveInfo2 = queryIntentActivities2.get(i2);
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

    /* loaded from: classes.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d {
        public ArrayList<String> a;
        public String b;
        public String c;
        public String d;

        d() {
        }
    }
}
