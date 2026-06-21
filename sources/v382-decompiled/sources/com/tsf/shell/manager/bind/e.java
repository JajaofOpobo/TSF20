package com.tsf.shell.manager.bind;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
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
import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.manager.a.i;
import com.tsf.shell.u;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class e implements Runnable {
    final /* synthetic */ ShellModel a;
    private Context b;

    e(ShellModel shellModel, Context context) {
        this.a = shellModel;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        obj = ShellModel.f;
        synchronized (obj) {
            Process.setThreadPriority(0);
        }
        a(new Runnable() { // from class: com.tsf.shell.manager.bind.e.1
            @Override // java.lang.Runnable
            public void run() {
                ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.e.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Object obj2;
                        Object obj3;
                        e eVar;
                        obj2 = ShellModel.f;
                        synchronized (obj2) {
                            Process.setThreadPriority(10);
                        }
                        e.this.c();
                        e.this.b = null;
                        obj3 = ShellModel.f;
                        synchronized (obj3) {
                            eVar = e.this.a.c;
                            if (eVar == e.this) {
                                e.this.a.c = null;
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
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        HashMap hashMap2;
        obj = ShellModel.f;
        synchronized (obj) {
            arrayList = ShellModel.i;
            arrayList.clear();
            arrayList2 = ShellModel.j;
            arrayList2.clear();
            hashMap = ShellModel.h;
            hashMap.clear();
            hashMap2 = ShellModel.g;
            hashMap2.clear();
        }
    }

    private g b() {
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        boolean z;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        HashMap hashMap5;
        HashMap hashMap6;
        LauncherFolder3DInfo b;
        HashMap hashMap7;
        LauncherFolder3DInfo b2;
        ArrayList arrayList14;
        HashMap hashMap8;
        ArrayList arrayList15;
        HashMap hashMap9;
        ArrayList arrayList16;
        HashMap hashMap10;
        ArrayList arrayList17;
        HashMap hashMap11;
        ArrayList arrayList18;
        HashMap hashMap12;
        LauncherAppWidgetInfo launcherAppWidgetInfo;
        ArrayList arrayList19;
        HashMap hashMap13;
        g gVar = new g(this.a);
        Context context = this.b;
        ContentResolver contentResolver = context.getContentResolver();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        a();
        obj = ShellModel.f;
        synchronized (obj) {
            ArrayList arrayList20 = new ArrayList();
            Cursor query = contentResolver.query(u.a, null, null, null, "itemType ASC");
            try {
                Uri uri = u.a;
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
                        int i = query.getInt(columnIndexOrThrow5);
                        int i2 = (int) query.getLong(columnIndexOrThrow);
                        int i3 = query.getInt(columnIndexOrThrow7);
                        if (i3 != -1) {
                            switch (i) {
                                case 1:
                                    hashMap7 = ShellModel.h;
                                    b2 = ShellModel.b(hashMap7, Integer.valueOf(i2));
                                    com.tsf.shell.manager.r.a.a(b2, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                    b2.title = query.getString(columnIndexOrThrow3);
                                    b2.title = (b2.title == null || b2.title.length() == 0) ? x.c(R.string.widget_folder) : b2.title;
                                    int i4 = query.getInt(columnIndexOrThrow4);
                                    b2.container = i4;
                                    b2.config = query.getString(columnIndexOrThrow14);
                                    switch (i4) {
                                        case -5:
                                            arrayList14 = ShellModel.n;
                                            arrayList14.add(b2);
                                            hashMap8 = ShellModel.g;
                                            hashMap8.put(Integer.valueOf(b2.id), b2);
                                            break;
                                        case -4:
                                            arrayList15 = ShellModel.m;
                                            arrayList15.add(b2);
                                            hashMap9 = ShellModel.g;
                                            hashMap9.put(Integer.valueOf(b2.id), b2);
                                            break;
                                        case -3:
                                            arrayList16 = ShellModel.k;
                                            arrayList16.add(b2);
                                            hashMap10 = ShellModel.g;
                                            hashMap10.put(Integer.valueOf(b2.id), b2);
                                            break;
                                        case -2:
                                        default:
                                            arrayList20.add(Integer.valueOf(i2));
                                            break;
                                        case ItemInfo.NO_ID /* -1 */:
                                            arrayList17 = ShellModel.i;
                                            arrayList17.add(b2);
                                            hashMap11 = ShellModel.g;
                                            hashMap11.put(Integer.valueOf(b2.id), b2);
                                            break;
                                    }
                                case 2:
                                case 7:
                                    LauncherShortcut3DInfo a = com.tsf.shell.manager.l.a.a(i);
                                    com.tsf.shell.manager.r.a.a(a, query, i2, columnIndexOrThrow7, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow15, columnIndexOrThrow10);
                                    a.title = query.getString(columnIndexOrThrow3);
                                    a.title = a.title == null ? "" : a.title;
                                    a.packagename = query.getString(columnIndexOrThrow13);
                                    int i5 = query.getInt(columnIndexOrThrow4);
                                    a.container = i5;
                                    a.titleType = query.getInt(columnIndexOrThrow20);
                                    a.iconType = query.getInt(columnIndexOrThrow17);
                                    if (a.iconType == 1) {
                                        Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
                                        shortcutIconResource.packageName = query.getString(columnIndexOrThrow18);
                                        shortcutIconResource.resourceName = query.getString(columnIndexOrThrow19);
                                        a.iconResource = shortcutIconResource;
                                    }
                                    try {
                                        a.intent = Intent.parseUri(query.getString(columnIndexOrThrow2), 0);
                                    } catch (Exception e) {
                                    }
                                    switch (i5) {
                                        case -5:
                                            arrayList9 = ShellModel.n;
                                            arrayList9.add(a);
                                            break;
                                        case -4:
                                            arrayList10 = ShellModel.m;
                                            arrayList10.add(a);
                                            break;
                                        case -3:
                                            arrayList11 = ShellModel.k;
                                            arrayList11.add(a);
                                            break;
                                        case -2:
                                            arrayList12 = ShellModel.l;
                                            arrayList12.add(a);
                                            break;
                                        case ItemInfo.NO_ID /* -1 */:
                                            arrayList13 = ShellModel.i;
                                            arrayList13.add(a);
                                            break;
                                        default:
                                            hashMap6 = ShellModel.h;
                                            b = ShellModel.b(hashMap6, Integer.valueOf(i5));
                                            b.add(a);
                                            break;
                                    }
                                    hashMap5 = ShellModel.g;
                                    hashMap5.put(Integer.valueOf(a.id), a);
                                    break;
                                case 3:
                                    int i6 = query.getInt(columnIndexOrThrow6);
                                    String string = query.getString(columnIndexOrThrow16);
                                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i6);
                                    if (!com.tsf.shell.manager.a.h.b(i3)) {
                                        arrayList20.add(Integer.valueOf(i2));
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
                                        arrayList19 = ShellModel.j;
                                        arrayList19.add(launcherAppWidgetInfo);
                                        hashMap13 = ShellModel.g;
                                        hashMap13.put(Integer.valueOf(launcherAppWidgetInfo.id), launcherAppWidgetInfo);
                                        break;
                                    }
                                    break;
                                case 4:
                                case 6:
                                default:
                                    arrayList20.add(Integer.valueOf(i2));
                                    break;
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
                                    arrayList18 = ShellModel.i;
                                    arrayList18.add(launcherWidget3DInfo);
                                    hashMap12 = ShellModel.g;
                                    hashMap12.put(Integer.valueOf(launcherWidget3DInfo.id), launcherWidget3DInfo);
                                    break;
                            }
                        } else {
                            arrayList20.add(Integer.valueOf(i2));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                query.close();
                ArrayList i7 = com.tsf.shell.e.c.b.e.i();
                gVar.a = i7;
                ArrayList arrayList21 = new ArrayList();
                arrayList = ShellModel.k;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ItemInfo itemInfo = (ItemInfo) it.next();
                    Iterator it2 = i7.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                        } else if (((String) it2.next()).contains(Integer.toString(itemInfo.id))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        arrayList21.add(itemInfo);
                        arrayList20.add(Integer.valueOf(itemInfo.id));
                        itemInfo.id = -1;
                    }
                }
                Iterator it3 = arrayList21.iterator();
                while (it3.hasNext()) {
                    ItemInfo itemInfo2 = (ItemInfo) it3.next();
                    arrayList8 = ShellModel.k;
                    arrayList8.remove(itemInfo2);
                }
                arrayList21.clear();
                String b3 = com.tsf.shell.e.c.a.f.b();
                gVar.b = b3;
                ArrayList arrayList22 = new ArrayList();
                arrayList2 = ShellModel.m;
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    ItemInfo itemInfo3 = (ItemInfo) it4.next();
                    if (!b3.contains(Integer.toString(itemInfo3.id))) {
                        arrayList22.add(itemInfo3);
                        arrayList20.add(Integer.valueOf(itemInfo3.id));
                        itemInfo3.id = -1;
                    }
                }
                Iterator it5 = arrayList22.iterator();
                while (it5.hasNext()) {
                    ItemInfo itemInfo4 = (ItemInfo) it5.next();
                    arrayList7 = ShellModel.m;
                    arrayList7.remove(itemInfo4);
                }
                arrayList22.clear();
                String n = com.tsf.shell.manager.m.c.n();
                gVar.d = n;
                ArrayList arrayList23 = new ArrayList();
                arrayList3 = ShellModel.n;
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    ItemInfo itemInfo5 = (ItemInfo) it6.next();
                    if (!n.contains(Integer.toString(itemInfo5.id))) {
                        arrayList23.add(itemInfo5);
                        arrayList20.add(Integer.valueOf(itemInfo5.id));
                        itemInfo5.id = -1;
                    }
                }
                Iterator it7 = arrayList23.iterator();
                while (it7.hasNext()) {
                    ItemInfo itemInfo6 = (ItemInfo) it7.next();
                    arrayList6 = ShellModel.n;
                    arrayList6.remove(itemInfo6);
                }
                arrayList23.clear();
                String q = com.tsf.shell.e.h.g.q();
                gVar.c = q;
                ArrayList arrayList24 = new ArrayList();
                arrayList4 = ShellModel.l;
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    ItemInfo itemInfo7 = (ItemInfo) it8.next();
                    if (!q.contains(Integer.toString(itemInfo7.id))) {
                        arrayList24.add(itemInfo7);
                        arrayList20.add(Integer.valueOf(itemInfo7.id));
                        itemInfo7.id = -1;
                    }
                }
                Iterator it9 = arrayList24.iterator();
                while (it9.hasNext()) {
                    ItemInfo itemInfo8 = (ItemInfo) it9.next();
                    arrayList5 = ShellModel.l;
                    arrayList5.remove(itemInfo8);
                }
                arrayList24.clear();
                hashMap = ShellModel.h;
                ArrayList arrayList25 = new ArrayList();
                for (Integer num : hashMap.keySet()) {
                    hashMap3 = ShellModel.h;
                    LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) hashMap3.get(num);
                    if (launcherFolder3DInfo.id == -1) {
                        com.censivn.C3DEngine.a.d().getContentResolver().delete(u.a, "container=" + num, null);
                        Iterator it10 = launcherFolder3DInfo.getItemInfo().iterator();
                        while (it10.hasNext()) {
                            ItemInfo itemInfo9 = (ItemInfo) it10.next();
                            hashMap4 = ShellModel.g;
                            hashMap4.remove(Integer.valueOf(itemInfo9.id));
                            itemInfo9.unbind();
                        }
                        launcherFolder3DInfo.getItemInfo().clear();
                        arrayList25.add(num);
                    }
                }
                Iterator it11 = arrayList25.iterator();
                while (it11.hasNext()) {
                    Integer num2 = (Integer) it11.next();
                    hashMap2 = ShellModel.h;
                    hashMap2.remove(num2);
                }
                if (arrayList20.size() > 0) {
                    ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient(u.a);
                    Iterator it12 = arrayList20.iterator();
                    while (it12.hasNext()) {
                        try {
                            acquireContentProviderClient.delete(u.a(((Integer) it12.next()).intValue(), false), null, null);
                        } catch (RemoteException e3) {
                        }
                    }
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        return gVar;
    }

    private void a(Runnable runnable, g gVar) {
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        obj = ShellModel.f;
        synchronized (obj) {
            arrayList = ShellModel.i;
            arrayList7.addAll(arrayList);
            arrayList2 = ShellModel.k;
            arrayList8.addAll(arrayList2);
            arrayList3 = ShellModel.j;
            arrayList12.addAll(arrayList3);
            arrayList4 = ShellModel.l;
            arrayList10.addAll(arrayList4);
            arrayList5 = ShellModel.n;
            arrayList11.addAll(arrayList5);
            arrayList6 = ShellModel.m;
            arrayList9.addAll(arrayList6);
        }
        Iterator it = arrayList12.iterator();
        while (it.hasNext()) {
            LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) it.next();
            bVar5 = this.a.o;
            bVar5.a(launcherAppWidgetInfo);
        }
        bVar = this.a.o;
        bVar.c(arrayList10, gVar.c);
        bVar2 = this.a.o;
        bVar2.b(arrayList11, gVar.d);
        b.a(arrayList7, null, null);
        bVar3 = this.a.o;
        bVar3.a(arrayList8, gVar.a);
        bVar4 = this.a.o;
        bVar4.a(arrayList9, gVar.b);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b bVar;
        PackageManager packageManager = this.b.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        System.currentTimeMillis();
        if (queryIntentActivities != null) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                ResolveInfo resolveInfo = queryIntentActivities.get(i);
                i b = a.c().b(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
                if (b == null) {
                    this.a.a.c(new i(resolveInfo));
                } else {
                    this.a.a.e(b);
                }
            }
            ArrayList arrayList = this.a.a.b;
            this.a.a.b = new ArrayList();
            bVar = this.a.o;
            bVar.a(arrayList);
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        this.b.registerReceiver(this.a, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
        this.b.registerReceiver(this.a, intentFilter2);
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(new Intent("com.tsf.shell.3dwidget", (Uri) null), 0);
        if (queryIntentActivities2 != null && !queryIntentActivities2.isEmpty()) {
            Collections.sort(queryIntentActivities2, new ResolveInfo.DisplayNameComparator(packageManager));
            for (int i2 = 0; i2 < queryIntentActivities2.size(); i2++) {
                ResolveInfo resolveInfo2 = queryIntentActivities2.get(i2);
                if (a.c().c(new ComponentName(resolveInfo2.activityInfo.applicationInfo.packageName, resolveInfo2.activityInfo.name)) == null) {
                    this.a.a.f(new i(resolveInfo2));
                }
            }
            ArrayList arrayList2 = this.a.a.f;
            this.a.a.f = new ArrayList();
            com.tsf.shell.manager.a.i.a(arrayList2);
        }
    }
}
