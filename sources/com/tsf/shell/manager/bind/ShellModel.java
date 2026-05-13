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
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.tsf.C1306b;
import com.tsf.extend.base.p080j.C1438q;
import com.tsf.shell.C2234d;
import com.tsf.shell.C3345g;
import com.tsf.shell.Home;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3386b;
import com.tsf.shell.manager.p166a.C3360a;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p181m.C3529b;
import com.tsf.shell.manager.p187r.C3613a;
import com.tsf.shell.p096f.p101c.p102a.C2326f;
import com.tsf.shell.p096f.p101c.p105b.C2359e;
import com.tsf.shell.p096f.p148h.C3100f;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class ShellModel extends BroadcastReceiver {

    /* renamed from: b */
    public static Handler f11360b;

    /* renamed from: f */
    private static final Object f11361f = new Object();

    /* renamed from: g */
    private static final HashMap<Integer, ItemInfo> f11362g = new HashMap<>();

    /* renamed from: h */
    private static final HashMap<Integer, LauncherFolder3DInfo> f11363h = new HashMap<>();

    /* renamed from: i */
    private static final ArrayList<ItemInfo> f11364i = new ArrayList<>();

    /* renamed from: j */
    private static final ArrayList<LauncherAppWidgetInfo> f11365j = new ArrayList<>();

    /* renamed from: k */
    private static final ArrayList<ItemInfo> f11366k = new ArrayList<>();

    /* renamed from: l */
    private static final ArrayList<ItemInfo> f11367l = new ArrayList<>();

    /* renamed from: m */
    private static final ArrayList<ItemInfo> f11368m = new ArrayList<>();

    /* renamed from: n */
    private static final ArrayList<ItemInfo> f11369n = new ArrayList<>();

    /* renamed from: q */
    private static final HandlerThread f11370q = new HandlerThread("launcher-loader");

    /* renamed from: a */
    public C3360a f11371a;

    /* renamed from: c */
    private RunnableC3439b f11372c;

    /* renamed from: d */
    private Context f11373d;

    /* renamed from: e */
    private int f11374e;

    /* renamed from: o */
    private C3445b f11375o;

    /* renamed from: p */
    private boolean f11376p;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public ShellModel(Context context) {
        this.f11373d = context;
        this.f11376p = Build.VERSION.SDK_INT < 9 ? true : Environment.isExternalStorageRemovable();
        this.f11375o = new C3445b();
        this.f11371a = new C3360a();
        this.f11374e = this.f11373d.getResources().getInteger(C1306b.C1312f.config_allAppsBatchLoadDelay);
    }

    /* renamed from: a */
    public static void m2388a(String str) {
    }

    /* renamed from: a */
    public void m2396a() {
        f11370q.start();
        f11360b = new Handler(f11370q.getLooper());
    }

    /* renamed from: a */
    private ItemInfo m2395a(int i) {
        LauncherShortcutStandardInfo launcherShortcutStandardInfo;
        Iterator<ItemInfo> it = f11364i.iterator();
        while (it.hasNext()) {
            ItemInfo next = it.next();
            if ((next instanceof LauncherShortcutStandardInfo) && (launcherShortcutStandardInfo = (LauncherShortcutStandardInfo) next) != null && launcherShortcutStandardInfo.intent != null && launcherShortcutStandardInfo.intent.getIntExtra("action", -1) == i) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public ItemInfo m2383b(String str) {
        if (TextUtils.equals(str, "com.ksmobile.launcher")) {
            return m2395a(19);
        }
        if (TextUtils.equals(str, "panda.keyboard.emoji.theme")) {
            return m2395a(20);
        }
        return null;
    }

    /* renamed from: a */
    public static void m2387a(HashMap<Integer, ItemInfo> hashMap) {
        synchronized (f11361f) {
            hashMap.putAll(f11362g);
        }
    }

    /* renamed from: a */
    public void m2394a(Home home) {
        synchronized (f11361f) {
            this.f11375o.m2351a(home);
            this.f11372c = new RunnableC3439b(home);
            f11360b.post(this.f11372c);
        }
    }

    /* renamed from: a */
    public static void m2389a(Runnable runnable) {
        if (f11370q.getThreadId() == Process.myTid()) {
            runnable.run();
        } else {
            f11360b.post(runnable);
        }
    }

    /* renamed from: b */
    public C3360a m2385b() {
        return this.f11371a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static LauncherFolder3DInfo m2382b(HashMap<Integer, LauncherFolder3DInfo> hashMap, Integer num) {
        LauncherFolder3DInfo launcherFolder3DInfo = hashMap.get(num);
        if (launcherFolder3DInfo == null) {
            LauncherFolder3DInfo launcherFolder3DInfo2 = new LauncherFolder3DInfo();
            hashMap.put(num, launcherFolder3DInfo2);
            return launcherFolder3DInfo2;
        }
        return launcherFolder3DInfo;
    }

    /* renamed from: com.tsf.shell.manager.bind.ShellModel$a */
    /* loaded from: classes.dex */
    public static class C3435a {
        /* renamed from: a */
        public static byte[] m2370a(ItemInfo itemInfo) {
            byte[] bArr;
            Cursor query = C0853a.m10856d().getContentResolver().query(C3345g.C3350e.m2781a(itemInfo.f2532id, false), null, null, null, null);
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

        /* renamed from: a */
        public static void m2368a(ItemInfo itemInfo, ShellProvider.C2183a c2183a, SQLiteDatabase sQLiteDatabase) {
            if (itemInfo.f2532id == -1) {
                ContentValues contentValues = new ContentValues();
                itemInfo.f2532id = c2183a.m6142a();
                contentValues.put("_id", Integer.valueOf(itemInfo.f2532id));
                itemInfo.onAddToDatabase(contentValues);
                sQLiteDatabase.insert("favorites", null, contentValues);
                contentValues.clear();
            }
        }

        /* renamed from: a */
        public static void m2371a(final ContentValues contentValues, final ItemInfo itemInfo, final Runnable runnable) {
            final boolean z = itemInfo.f2532id == -1;
            if (z) {
                itemInfo.f2532id = ShellProvider.m6147a().m6145b();
                contentValues.put("_id", Integer.valueOf(itemInfo.f2532id));
                itemInfo.onAddToDatabase(contentValues);
            }
            ShellModel.f11360b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.a.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (ShellModel.f11361f) {
                        ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
                        if (z) {
                            contentResolver.insert(C3345g.C3350e.f11069a, contentValues);
                            ShellModel.f11362g.put(Integer.valueOf(itemInfo.f2532id), itemInfo);
                            switch (itemInfo.itemType) {
                                case 1:
                                    ShellModel.f11363h.put(Integer.valueOf(itemInfo.f2532id), (LauncherFolder3DInfo) itemInfo);
                                    switch (itemInfo.container) {
                                        case -5:
                                            ShellModel.f11369n.add(itemInfo);
                                            break;
                                        case -4:
                                            ShellModel.f11368m.add(itemInfo);
                                            break;
                                        case -3:
                                            ShellModel.f11366k.add(itemInfo);
                                            break;
                                        case ItemInfo.NO_ID /* -1 */:
                                            ShellModel.f11364i.add(itemInfo);
                                            break;
                                    }
                                case 2:
                                case 7:
                                    switch (itemInfo.container) {
                                        case -5:
                                            ShellModel.f11369n.add(itemInfo);
                                            break;
                                        case -4:
                                            ShellModel.f11368m.add(itemInfo);
                                            break;
                                        case -3:
                                            ShellModel.f11366k.add(itemInfo);
                                            break;
                                        case -2:
                                            ShellModel.f11367l.add(itemInfo);
                                            break;
                                        case ItemInfo.NO_ID /* -1 */:
                                            ShellModel.f11364i.add(itemInfo);
                                            break;
                                    }
                                case 3:
                                    ShellModel.f11365j.add((LauncherAppWidgetInfo) itemInfo);
                                    break;
                                case 5:
                                    ShellModel.f11364i.add(itemInfo);
                                    break;
                            }
                            ShellModel.m2388a("insert");
                        } else {
                            contentResolver.update(C3345g.C3350e.m2781a(itemInfo.f2532id, false), contentValues, null, null);
                        }
                        contentValues.clear();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
            });
        }

        /* renamed from: b */
        public static void m2367b(final ItemInfo itemInfo) {
            ShellModel.f11360b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.a.2
                @Override // java.lang.Runnable
                public void run() {
                    ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
                    contentResolver.delete(C3345g.C3350e.m2781a(ItemInfo.this.f2532id, false), null, null);
                    synchronized (ShellModel.f11361f) {
                        switch (ItemInfo.this.itemType) {
                            case 1:
                                contentResolver.delete(C3345g.C3350e.f11069a, "container=" + ItemInfo.this.f2532id, null);
                                ShellModel.f11363h.remove(Integer.valueOf(ItemInfo.this.f2532id));
                                switch (ItemInfo.this.container) {
                                    case -5:
                                        ShellModel.f11369n.remove(ItemInfo.this);
                                        break;
                                    case -4:
                                        ShellModel.f11368m.remove(ItemInfo.this);
                                        break;
                                    case -3:
                                        ShellModel.f11366k.remove(ItemInfo.this);
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        ShellModel.f11364i.remove(ItemInfo.this);
                                        break;
                                }
                            case 2:
                            case 7:
                                switch (ItemInfo.this.container) {
                                    case -5:
                                        ShellModel.f11369n.remove(ItemInfo.this);
                                        break;
                                    case -4:
                                        ShellModel.f11368m.remove(ItemInfo.this);
                                        break;
                                    case -3:
                                        ShellModel.f11366k.remove(ItemInfo.this);
                                        break;
                                    case -2:
                                        ShellModel.f11367l.remove(ItemInfo.this);
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        ShellModel.f11364i.remove(ItemInfo.this);
                                        break;
                                }
                            case 3:
                                ShellModel.f11365j.remove((LauncherAppWidgetInfo) ItemInfo.this);
                                break;
                            case 5:
                                ShellModel.f11364i.remove(ItemInfo.this);
                                break;
                        }
                        ShellModel.f11362g.remove(Integer.valueOf(ItemInfo.this.f2532id));
                        ItemInfo.this.unbind();
                        ShellModel.m2388a("delete");
                    }
                }
            });
        }

        /* renamed from: a */
        public static void m2369a(final ItemInfo itemInfo, final int i, final int i2) {
            ShellModel.f11360b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.a.3
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (ShellModel.f11361f) {
                        if (i == -1) {
                            ShellModel.f11364i.remove(itemInfo);
                        } else if (i == -3) {
                            ShellModel.f11366k.remove(itemInfo);
                        } else if (i == -2) {
                            ShellModel.f11367l.remove(itemInfo);
                        } else if (i == -4) {
                            ShellModel.f11368m.remove(itemInfo);
                        } else if (i == -5) {
                            ShellModel.f11369n.remove(itemInfo);
                        }
                        if (i2 == -1) {
                            if (!ShellModel.f11364i.contains(ShellModel.f11364i)) {
                                ShellModel.f11364i.add(itemInfo);
                            }
                        } else if (i2 == -3) {
                            if (!ShellModel.f11366k.contains(itemInfo)) {
                                ShellModel.f11366k.add(itemInfo);
                            }
                        } else if (i2 == -4) {
                            if (!ShellModel.f11368m.contains(itemInfo)) {
                                ShellModel.f11368m.add(itemInfo);
                            }
                        } else if (i2 == -2) {
                            if (!ShellModel.f11367l.contains(itemInfo)) {
                                ShellModel.f11367l.add(itemInfo);
                            }
                        } else if (i2 == -5 && !ShellModel.f11369n.contains(itemInfo)) {
                            ShellModel.f11369n.add(itemInfo);
                        }
                        ShellModel.m2388a("changeContainer");
                    }
                }
            });
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i = 2;
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_CHANGED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_ADDED".equals(action)) {
            final String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (schemeSpecificPart != null && schemeSpecificPart.length() != 0) {
                if (!"android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        if (!booleanExtra) {
                            i = 3;
                        }
                        i = 0;
                    } else {
                        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                            C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ItemInfo m2383b = ShellModel.this.m2383b(schemeSpecificPart);
                                    if (m2383b != null) {
                                        final C3112b widget = m2383b.getWidget();
                                        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.1.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                if (widget != null) {
                                                    C1438q.m8608a("szxasasqsq", "ShellModel...542");
                                                    widget.removeFromParent();
                                                    C3359a.f11095i.m1639b(widget);
                                                }
                                            }
                                        });
                                    }
                                }
                            });
                            if (!booleanExtra) {
                                i = 1;
                            }
                        }
                        i = 0;
                    }
                }
                if (i != 0) {
                    m2393a(new RunnableC3442c(i, new String[]{schemeSpecificPart}));
                }
            }
        } else if ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action)) {
            m2393a(new RunnableC3442c(5, intent.getStringArrayExtra("android.intent.extra.changed_package_list")));
        } else if ("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action)) {
            m2393a(new RunnableC3442c(4, intent.getStringArrayExtra("android.intent.extra.changed_package_list")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.manager.bind.ShellModel$b */
    /* loaded from: classes.dex */
    public class RunnableC3439b implements Runnable {

        /* renamed from: b */
        private Context f11390b;

        RunnableC3439b(Context context) {
            this.f11390b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ShellModel.f11361f) {
                Process.setThreadPriority(0);
            }
            m2363a(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.b.1
                @Override // java.lang.Runnable
                public void run() {
                    ShellModel.f11360b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.ShellModel.b.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (ShellModel.f11361f) {
                                Process.setThreadPriority(10);
                            }
                            RunnableC3439b.this.m2360c();
                            RunnableC3439b.this.f11390b = null;
                            synchronized (ShellModel.f11361f) {
                                if (ShellModel.this.f11372c == RunnableC3439b.this) {
                                    ShellModel.this.f11372c = null;
                                }
                            }
                            System.gc();
                        }
                    });
                }
            }, m2361b());
            Home.m6177b().m6167i();
        }

        /* renamed from: a */
        private void m2366a() {
            synchronized (ShellModel.f11361f) {
                ShellModel.f11364i.clear();
                ShellModel.f11365j.clear();
                ShellModel.f11363h.clear();
                ShellModel.f11362g.clear();
            }
        }

        /* renamed from: a */
        private int m2362a(String str) {
            int indexOf;
            if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf("i.action")) > 0) {
                String[] split = str.substring(indexOf).split(";");
                if (split.length > 0) {
                    return Integer.valueOf(split[0].split("=")[1]).intValue();
                }
            }
            return -1;
        }

        /* renamed from: b */
        private C3443d m2361b() {
            boolean z;
            LauncherAppWidgetInfo launcherAppWidgetInfo;
            C3443d c3443d = new C3443d();
            Context context = this.f11390b;
            ContentResolver contentResolver = context.getContentResolver();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            m2366a();
            synchronized (ShellModel.f11361f) {
                ArrayList arrayList = new ArrayList();
                Cursor query = contentResolver.query(C3345g.C3350e.f11069a, null, null, null, "itemType ASC");
                Uri uri = C3345g.C3350e.f11069a;
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
                        int m2362a = m2362a(query.getString(columnIndexOrThrow2));
                        int i = query.getInt(columnIndexOrThrow5);
                        int i2 = (int) query.getLong(columnIndexOrThrow);
                        int i3 = query.getInt(columnIndexOrThrow7);
                        if (i3 != -1) {
                            switch (i) {
                                case 1:
                                    LauncherFolder3DInfo m2382b = ShellModel.m2382b(ShellModel.f11363h, Integer.valueOf(i2));
                                    C3613a.m1892a(m2382b, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                    m2382b.title = query.getString(columnIndexOrThrow3);
                                    m2382b.title = (m2382b.title == null || m2382b.title.length() == 0) ? C4189x.m588c(C1306b.C1315i.widget_folder) : m2382b.title;
                                    int i4 = query.getInt(columnIndexOrThrow4);
                                    m2382b.container = i4;
                                    m2382b.config = query.getString(columnIndexOrThrow14);
                                    switch (i4) {
                                        case -5:
                                            ShellModel.f11369n.add(m2382b);
                                            ShellModel.f11362g.put(Integer.valueOf(m2382b.f2532id), m2382b);
                                            continue;
                                        case -4:
                                            ShellModel.f11368m.add(m2382b);
                                            ShellModel.f11362g.put(Integer.valueOf(m2382b.f2532id), m2382b);
                                            continue;
                                        case -3:
                                            ShellModel.f11366k.add(m2382b);
                                            ShellModel.f11362g.put(Integer.valueOf(m2382b.f2532id), m2382b);
                                            continue;
                                        case -2:
                                        default:
                                            arrayList.add(Integer.valueOf(i2));
                                            continue;
                                        case ItemInfo.NO_ID /* -1 */:
                                            ShellModel.f11364i.add(m2382b);
                                            ShellModel.f11362g.put(Integer.valueOf(m2382b.f2532id), m2382b);
                                            continue;
                                            continue;
                                    }
                                case 2:
                                case 7:
                                    LauncherShortcut3DInfo m2153a = C3519a.m2153a(i);
                                    C3613a.m1892a(m2153a, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                    m2153a.title = query.getString(columnIndexOrThrow3);
                                    m2153a.title = m2153a.title == null ? "" : m2153a.title;
                                    m2153a.packagename = query.getString(columnIndexOrThrow13);
                                    int i5 = query.getInt(columnIndexOrThrow4);
                                    m2153a.container = i5;
                                    m2153a.titleType = query.getInt(columnIndexOrThrow20);
                                    m2153a.iconType = query.getInt(columnIndexOrThrow17);
                                    if (m2153a.iconType == 1) {
                                        Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
                                        shortcutIconResource.packageName = query.getString(columnIndexOrThrow18);
                                        shortcutIconResource.resourceName = query.getString(columnIndexOrThrow19);
                                        m2153a.iconResource = shortcutIconResource;
                                    }
                                    try {
                                        m2153a.intent = Intent.parseUri(query.getString(columnIndexOrThrow2), 0);
                                    } catch (Exception e) {
                                    }
                                    if (m2362a != -1) {
                                        C3386b.m2668a(m2153a, m2362a);
                                    }
                                    switch (i5) {
                                        case -5:
                                            ShellModel.f11369n.add(m2153a);
                                            break;
                                        case -4:
                                            ShellModel.f11368m.add(m2153a);
                                            break;
                                        case -3:
                                            ShellModel.f11366k.add(m2153a);
                                            break;
                                        case -2:
                                            ShellModel.f11367l.add(m2153a);
                                            break;
                                        case ItemInfo.NO_ID /* -1 */:
                                            ShellModel.f11364i.add(m2153a);
                                            break;
                                        default:
                                            ShellModel.m2382b(ShellModel.f11363h, Integer.valueOf(i5)).add(m2153a);
                                            break;
                                    }
                                    ShellModel.f11362g.put(Integer.valueOf(m2153a.f2532id), m2153a);
                                    continue;
                                case 3:
                                    int i6 = query.getInt(columnIndexOrThrow6);
                                    String string = query.getString(columnIndexOrThrow16);
                                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i6);
                                    if (!C3359a.f11094h.m4065b(i3)) {
                                        arrayList.add(Integer.valueOf(i2));
                                        break;
                                    } else {
                                        if (appWidgetInfo == null || appWidgetInfo.provider == null || appWidgetInfo.provider.getPackageName() == null) {
                                            launcherAppWidgetInfo = new LauncherAppWidgetInfo(i6, ComponentName.unflattenFromString(string));
                                        } else {
                                            launcherAppWidgetInfo = new LauncherAppWidgetInfo(i6, appWidgetInfo.provider);
                                        }
                                        C3613a.m1892a(launcherAppWidgetInfo, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                        launcherAppWidgetInfo.container = query.getInt(columnIndexOrThrow4);
                                        if (appWidgetInfo != null) {
                                            String flattenToString = appWidgetInfo.provider.flattenToString();
                                            if (!flattenToString.equals(string)) {
                                                ContentValues contentValues = new ContentValues();
                                                contentValues.put("appWidgetProvider", flattenToString);
                                                contentResolver.update(uri, contentValues, "_id= ?", new String[]{Integer.toString(query.getInt(columnIndexOrThrow))});
                                            }
                                        }
                                        ShellModel.f11365j.add(launcherAppWidgetInfo);
                                        ShellModel.f11362g.put(Integer.valueOf(launcherAppWidgetInfo.f2532id), launcherAppWidgetInfo);
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
                                    C3613a.m1892a(launcherWidget3DInfo, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                    launcherWidget3DInfo.packagename = query.getString(columnIndexOrThrow13);
                                    launcherWidget3DInfo.config = query.getString(columnIndexOrThrow14);
                                    if (launcherWidget3DInfo.packagename.equals("com.tsf.shell")) {
                                        launcherWidget3DInfo.packagename = "com.tsf.shell.widget.alarm";
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("packagename", launcherWidget3DInfo.packagename);
                                        contentValues2.put("classname", "");
                                        launcherWidget3DInfo.updateDatabase(contentValues2);
                                    }
                                    ShellModel.f11364i.add(launcherWidget3DInfo);
                                    ShellModel.f11362g.put(Integer.valueOf(launcherWidget3DInfo.f2532id), launcherWidget3DInfo);
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
                ArrayList<String> m5710i = C2359e.m5710i();
                c3443d.f11396a = m5710i;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ShellModel.f11366k.iterator();
                while (it.hasNext()) {
                    ItemInfo itemInfo = (ItemInfo) it.next();
                    Iterator<String> it2 = m5710i.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                        } else if (it2.next().contains(Integer.toString(itemInfo.f2532id))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        arrayList2.add(itemInfo);
                        arrayList.add(Integer.valueOf(itemInfo.f2532id));
                        itemInfo.f2532id = -1;
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ShellModel.f11366k.remove((ItemInfo) it3.next());
                }
                arrayList2.clear();
                String m5841b = C2326f.m5841b();
                c3443d.f11397b = m5841b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = ShellModel.f11368m.iterator();
                while (it4.hasNext()) {
                    ItemInfo itemInfo2 = (ItemInfo) it4.next();
                    if (!m5841b.contains(Integer.toString(itemInfo2.f2532id))) {
                        arrayList3.add(itemInfo2);
                        arrayList.add(Integer.valueOf(itemInfo2.f2532id));
                        itemInfo2.f2532id = -1;
                    }
                }
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    ShellModel.f11368m.remove((ItemInfo) it5.next());
                }
                arrayList3.clear();
                String m2079n = C3529b.m2079n();
                c3443d.f11399d = m2079n;
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = ShellModel.f11369n.iterator();
                while (it6.hasNext()) {
                    ItemInfo itemInfo3 = (ItemInfo) it6.next();
                    if (!m2079n.contains(Integer.toString(itemInfo3.f2532id))) {
                        arrayList4.add(itemInfo3);
                        arrayList.add(Integer.valueOf(itemInfo3.f2532id));
                        itemInfo3.f2532id = -1;
                    }
                }
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    ShellModel.f11369n.remove((ItemInfo) it7.next());
                }
                arrayList4.clear();
                String m3572q = C3100f.m3572q();
                c3443d.f11398c = m3572q;
                ArrayList arrayList5 = new ArrayList();
                Iterator it8 = ShellModel.f11367l.iterator();
                while (it8.hasNext()) {
                    ItemInfo itemInfo4 = (ItemInfo) it8.next();
                    if (!m3572q.contains(Integer.toString(itemInfo4.f2532id))) {
                        arrayList5.add(itemInfo4);
                        arrayList.add(Integer.valueOf(itemInfo4.f2532id));
                        itemInfo4.f2532id = -1;
                    }
                }
                Iterator it9 = arrayList5.iterator();
                while (it9.hasNext()) {
                    ShellModel.f11367l.remove((ItemInfo) it9.next());
                }
                arrayList5.clear();
                ArrayList arrayList6 = new ArrayList();
                for (Integer num : ShellModel.f11363h.keySet()) {
                    LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) ShellModel.f11363h.get(num);
                    if (launcherFolder3DInfo.f2532id == -1) {
                        C0853a.m10856d().getContentResolver().delete(C3345g.C3350e.f11069a, "container=" + num, null);
                        Iterator<ItemInfo> it10 = launcherFolder3DInfo.getItemInfo().iterator();
                        while (it10.hasNext()) {
                            ItemInfo next = it10.next();
                            ShellModel.f11362g.remove(Integer.valueOf(next.f2532id));
                            next.unbind();
                        }
                        launcherFolder3DInfo.getItemInfo().clear();
                        arrayList6.add(num);
                    }
                }
                Iterator it11 = arrayList6.iterator();
                while (it11.hasNext()) {
                    ShellModel.f11363h.remove((Integer) it11.next());
                }
                if (arrayList.size() > 0) {
                    ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient(C3345g.C3350e.f11069a);
                    Iterator it12 = arrayList.iterator();
                    while (it12.hasNext()) {
                        try {
                            acquireContentProviderClient.delete(C3345g.C3350e.m2781a(((Integer) it12.next()).intValue(), false), null, null);
                        } catch (RemoteException e3) {
                        }
                    }
                }
            }
            return c3443d;
        }

        /* renamed from: a */
        private void m2363a(Runnable runnable, C3443d c3443d) {
            ArrayList arrayList = new ArrayList();
            ArrayList<ItemInfo> arrayList2 = new ArrayList<>();
            ArrayList<ItemInfo> arrayList3 = new ArrayList<>();
            ArrayList<ItemInfo> arrayList4 = new ArrayList<>();
            ArrayList<ItemInfo> arrayList5 = new ArrayList<>();
            ArrayList arrayList6 = new ArrayList();
            synchronized (ShellModel.f11361f) {
                arrayList.addAll(ShellModel.f11364i);
                arrayList2.addAll(ShellModel.f11366k);
                arrayList6.addAll(ShellModel.f11365j);
                arrayList4.addAll(ShellModel.f11367l);
                arrayList5.addAll(ShellModel.f11369n);
                arrayList3.addAll(ShellModel.f11368m);
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                ShellModel.this.f11375o.m2353a((LauncherAppWidgetInfo) it.next());
            }
            ShellModel.this.f11375o.m2341c(arrayList4, c3443d.f11398c);
            ShellModel.this.f11375o.m2343b(arrayList5, c3443d.f11399d);
            C3445b unused = ShellModel.this.f11375o;
            C3445b.m2348a(arrayList, null, null);
            ShellModel.this.f11375o.m2346a(arrayList2, c3443d.f11396a);
            ShellModel.this.f11375o.m2347a(arrayList3, c3443d.f11397b);
            runnable.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m2360c() {
            PackageManager packageManager = this.f11390b.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            System.currentTimeMillis();
            if (queryIntentActivities != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i);
                    C3377f m2769b = C3444a.m2356c().m2769b(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
                    if (m2769b == null) {
                        ShellModel.this.f11371a.m2764c(new C3377f(resolveInfo));
                    } else {
                        ShellModel.this.f11371a.m2760e(m2769b);
                    }
                }
                ArrayList<C3377f> arrayList = ShellModel.this.f11371a.f11114b;
                ShellModel.this.f11371a.f11114b = new ArrayList<>();
                ShellModel.this.f11375o.m2350a(arrayList);
            }
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addDataScheme("package");
            this.f11390b.registerReceiver(ShellModel.this, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
            intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
            this.f11390b.registerReceiver(ShellModel.this, intentFilter2);
            List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(new Intent("com.tsf.shell.3dwidget", (Uri) null), 0);
            if (queryIntentActivities2 != null && !queryIntentActivities2.isEmpty()) {
                Collections.sort(queryIntentActivities2, new ResolveInfo.DisplayNameComparator(packageManager));
                for (int i2 = 0; i2 < queryIntentActivities2.size(); i2++) {
                    ResolveInfo resolveInfo2 = queryIntentActivities2.get(i2);
                    if (C3444a.m2356c().m2766c(new ComponentName(resolveInfo2.activityInfo.applicationInfo.packageName, resolveInfo2.activityInfo.name)) == null) {
                        ShellModel.this.f11371a.m2758f(new C3377f(resolveInfo2));
                    }
                }
                ArrayList<C3377f> arrayList2 = ShellModel.this.f11371a.f11118f;
                ShellModel.this.f11371a.f11118f = new ArrayList<>();
                C3359a.f11095i.m1642a(arrayList2);
            }
        }
    }

    /* renamed from: a */
    void m2393a(RunnableC3442c runnableC3442c) {
        C2234d.m6033a().m6031a(runnableC3442c);
    }

    /* renamed from: com.tsf.shell.manager.bind.ShellModel$c */
    /* loaded from: classes.dex */
    public class RunnableC3442c implements Runnable {

        /* renamed from: a */
        int f11393a;

        /* renamed from: b */
        String[] f11394b;

        public RunnableC3442c(int i, String[] strArr) {
            this.f11393a = i;
            this.f11394b = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<C3377f> arrayList;
            ArrayList<C3377f> arrayList2;
            ArrayList<C3377f> arrayList3;
            ArrayList<C3377f> arrayList4;
            ArrayList<C3377f> arrayList5;
            ArrayList<C3377f> arrayList6;
            Context context = ShellModel.this.f11373d;
            String[] strArr = this.f11394b;
            switch (this.f11393a) {
                case 1:
                case 5:
                    for (String str : strArr) {
                        ShellModel.this.f11371a.m2774a(context, str);
                    }
                    break;
                case 2:
                    for (String str2 : strArr) {
                        ShellModel.this.f11371a.m2765c(context, str2);
                    }
                    break;
                case 3:
                    for (String str3 : strArr) {
                        ShellModel.this.f11371a.m2768b(context, str3);
                    }
                    break;
            }
            if (ShellModel.this.f11371a.f11114b.size() > 0) {
                arrayList = ShellModel.this.f11371a.f11114b;
                ShellModel.this.f11371a.f11114b = new ArrayList<>();
            } else {
                arrayList = null;
            }
            if (ShellModel.this.f11371a.f11115c.size() > 0) {
                arrayList2 = ShellModel.this.f11371a.f11115c;
                ShellModel.this.f11371a.f11115c = new ArrayList<>();
            } else {
                arrayList2 = null;
            }
            if (ShellModel.this.f11371a.f11116d.size() > 0) {
                arrayList3 = ShellModel.this.f11371a.f11116d;
                ShellModel.this.f11371a.f11116d = new ArrayList<>();
            } else {
                arrayList3 = null;
            }
            if (ShellModel.this.f11371a.f11118f.size() > 0) {
                arrayList4 = ShellModel.this.f11371a.f11118f;
                ShellModel.this.f11371a.f11118f = new ArrayList<>();
            } else {
                arrayList4 = null;
            }
            if (ShellModel.this.f11371a.f11119g.size() > 0) {
                arrayList5 = ShellModel.this.f11371a.f11119g;
                ShellModel.this.f11371a.f11119g = new ArrayList<>();
            } else {
                arrayList5 = null;
            }
            if (ShellModel.this.f11371a.f11120h.size() > 0) {
                ArrayList<C3377f> arrayList7 = ShellModel.this.f11371a.f11120h;
                ShellModel.this.f11371a.f11120h = new ArrayList<>();
                arrayList6 = arrayList7;
            } else {
                arrayList6 = null;
            }
            if (arrayList != null) {
                ShellModel.this.f11375o.m2345a(arrayList, this.f11393a != 5);
            }
            if (arrayList3 != null) {
                ShellModel.this.f11375o.m2344b(arrayList3);
            }
            if (arrayList2 != null) {
                ShellModel.this.f11375o.m2342b(arrayList2, this.f11393a != 4);
            }
            if (arrayList4 != null) {
                C3359a.f11095i.m1638b(arrayList4);
            }
            if (arrayList6 != null) {
                C3359a.f11095i.m1635c(arrayList6);
            }
            if (arrayList5 != null) {
                C3359a.f11095i.m1641a(arrayList5, this.f11393a != 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.bind.ShellModel$d */
    /* loaded from: classes.dex */
    public class C3443d {

        /* renamed from: a */
        public ArrayList<String> f11396a;

        /* renamed from: b */
        public String f11397b;

        /* renamed from: c */
        public String f11398c;

        /* renamed from: d */
        public String f11399d;

        C3443d() {
        }
    }
}
