package com.tsf.shell;

import android.appwidget.AppWidgetManager;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class bq implements Runnable {
    final /* synthetic */ ShellModel a;
    private Context b;

    bq(ShellModel shellModel, Context context) {
        this.a = shellModel;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        bq bqVar;
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        String str3;
        String str4;
        String str5;
        obj = this.a.f;
        synchronized (obj) {
            Process.setThreadPriority(0);
        }
        Context context = this.b;
        ContentResolver contentResolver = context.getContentResolver();
        PackageManager packageManager = context.getPackageManager();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        packageManager.isSafeMode();
        Cursor query = this.b.getContentResolver().query(ce.b, null, null, null, null);
        query.moveToNext();
        this.a.k = query.getString(query.getColumnIndex("child"));
        query.close();
        Cursor query2 = this.b.getContentResolver().query(ca.b, null, null, null, null);
        query2.moveToNext();
        this.a.l = query2.getString(query2.getColumnIndex("child"));
        query2.close();
        this.a.a.clear();
        this.a.b.clear();
        this.a.c.clear();
        this.a.d.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cursor query3 = contentResolver.query(cb.a, null, null, null, "itemType ASC");
        boolean z4 = true;
        try {
            int columnIndexOrThrow = query3.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = query3.getColumnIndexOrThrow("intent");
            int columnIndexOrThrow3 = query3.getColumnIndexOrThrow("title");
            int columnIndexOrThrow4 = query3.getColumnIndexOrThrow("data");
            int columnIndexOrThrow5 = query3.getColumnIndexOrThrow("container");
            int columnIndexOrThrow6 = query3.getColumnIndexOrThrow("itemType");
            int columnIndexOrThrow7 = query3.getColumnIndexOrThrow("appWidgetId");
            int columnIndexOrThrow8 = query3.getColumnIndexOrThrow("screen");
            int columnIndexOrThrow9 = query3.getColumnIndexOrThrow("cellX");
            int columnIndexOrThrow10 = query3.getColumnIndexOrThrow("cellY");
            int columnIndexOrThrow11 = query3.getColumnIndexOrThrow("rotation");
            int columnIndexOrThrow12 = query3.getColumnIndexOrThrow("spanX");
            int columnIndexOrThrow13 = query3.getColumnIndexOrThrow("spanY");
            int columnIndexOrThrow14 = query3.getColumnIndexOrThrow("classname");
            int columnIndexOrThrow15 = query3.getColumnIndexOrThrow("packagename");
            int columnIndexOrThrow16 = query3.getColumnIndexOrThrow("internal");
            int columnIndexOrThrow17 = query3.getColumnIndexOrThrow("config");
            int columnIndexOrThrow18 = query3.getColumnIndexOrThrow("scale");
            int i = -1;
            while (query3.moveToNext()) {
                try {
                    int i2 = query3.getInt(columnIndexOrThrow6);
                    int i3 = query3.getInt(columnIndexOrThrow7);
                    long j = query3.getLong(columnIndexOrThrow);
                    switch (i2) {
                        case 1:
                            LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo(i3);
                            com.tsf.shell.workspace3D.be.a(launcherFolder3DInfo, query3, j, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow10, columnIndexOrThrow12, columnIndexOrThrow13, columnIndexOrThrow18, columnIndexOrThrow11);
                            launcherFolder3DInfo.classname = com.tsf.shell.workspace3D.k.c.b.c.class.getName();
                            launcherFolder3DInfo.internal = query3.getInt(columnIndexOrThrow16) != 0;
                            launcherFolder3DInfo.container = query3.getInt(columnIndexOrThrow5);
                            switch (launcherFolder3DInfo.container) {
                                case -4:
                                    str5 = this.a.l;
                                    if (!str5.contains(Integer.toString(launcherFolder3DInfo.appWidgetId))) {
                                        com.tsf.shell.workspace3D.bf.l().d(i3);
                                        arrayList.add(Long.valueOf(j));
                                        z = z4;
                                        break;
                                    } else {
                                        this.a.d.add(launcherFolder3DInfo);
                                        z = z4;
                                        break;
                                    }
                                default:
                                    this.a.d.add(launcherFolder3DInfo);
                                    z = z4;
                                    break;
                            }
                            i = i2;
                            z4 = z;
                            break;
                        case 2:
                            if (i != i2) {
                                a(contentResolver, arrayList, arrayList2);
                                z4 = false;
                            }
                            LauncherShortcut3DInfo launcherShortcut3DInfo = new LauncherShortcut3DInfo(i3);
                            com.tsf.shell.workspace3D.be.a(launcherShortcut3DInfo, query3, j, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow10, columnIndexOrThrow12, columnIndexOrThrow13, columnIndexOrThrow18, columnIndexOrThrow11);
                            launcherShortcut3DInfo.itemType = 2;
                            launcherShortcut3DInfo.title = query3.getString(columnIndexOrThrow3);
                            launcherShortcut3DInfo.title = launcherShortcut3DInfo.title == null ? "" : launcherShortcut3DInfo.title;
                            launcherShortcut3DInfo.classname = query3.getString(columnIndexOrThrow14);
                            launcherShortcut3DInfo.packagename = query3.getString(columnIndexOrThrow15);
                            launcherShortcut3DInfo.container = query3.getInt(columnIndexOrThrow5);
                            launcherShortcut3DInfo.internal = true;
                            launcherShortcut3DInfo.parse(query3.getString(columnIndexOrThrow17));
                            switch (launcherShortcut3DInfo.container) {
                                case -4:
                                    str3 = this.a.l;
                                    if (!str3.contains(Integer.toString(launcherShortcut3DInfo.appWidgetId))) {
                                        com.tsf.shell.workspace3D.bf.l().d(i3);
                                        arrayList.add(Long.valueOf(j));
                                        z = z4;
                                        break;
                                    } else {
                                        this.a.c.add(launcherShortcut3DInfo);
                                        z = z4;
                                        break;
                                    }
                                case LauncherShortcut3DInfo.CONTAINER_FOLDER /* -3 */:
                                    Iterator it = this.a.d.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            LauncherFolder3DInfo launcherFolder3DInfo2 = (LauncherFolder3DInfo) it.next();
                                            if (launcherFolder3DInfo2.appWidgetId == launcherShortcut3DInfo.screen) {
                                                launcherShortcut3DInfo.folderInfo = launcherFolder3DInfo2;
                                                this.a.c.add(launcherShortcut3DInfo);
                                                z3 = true;
                                            }
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                    if (!z3) {
                                        com.tsf.shell.workspace3D.bf.l().d(i3);
                                        arrayList.add(Long.valueOf(j));
                                        z = z4;
                                        break;
                                    }
                                    z = z4;
                                    break;
                                case LauncherShortcut3DInfo.CONTAINER_QUICKLAUNCH /* -2 */:
                                    str4 = this.a.k;
                                    if (!str4.contains(Integer.toString(launcherShortcut3DInfo.appWidgetId))) {
                                        com.tsf.shell.workspace3D.bf.l().d(i3);
                                        arrayList.add(Long.valueOf(j));
                                        z = z4;
                                        break;
                                    } else {
                                        this.a.c.add(launcherShortcut3DInfo);
                                        z = z4;
                                        break;
                                    }
                                case -1:
                                    this.a.c.add(launcherShortcut3DInfo);
                                    z = z4;
                                    break;
                                default:
                                    arrayList.add(Long.valueOf(j));
                                    z = z4;
                                    break;
                            }
                            i = i2;
                            z4 = z;
                            break;
                        case 3:
                            appWidgetManager.getAppWidgetInfo(i3);
                            LauncherAppWidgetInfo launcherAppWidgetInfo = new LauncherAppWidgetInfo(i3);
                            com.tsf.shell.workspace3D.be.a(launcherAppWidgetInfo, query3, j, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow10, columnIndexOrThrow12, columnIndexOrThrow13, columnIndexOrThrow18, columnIndexOrThrow11);
                            if (query3.getInt(columnIndexOrThrow5) != -1) {
                                break;
                            } else {
                                launcherAppWidgetInfo.container = query3.getInt(columnIndexOrThrow5);
                                if (com.tsf.shell.workspace3D.bf.j().c(launcherAppWidgetInfo.screen)) {
                                    this.a.a.add(launcherAppWidgetInfo);
                                    z = z4;
                                } else {
                                    arrayList.add(Long.valueOf(j));
                                    z = z4;
                                }
                                i = i2;
                                z4 = z;
                                break;
                            }
                        case 4:
                        default:
                            arrayList.add(Long.valueOf(j));
                            z = z4;
                            i = i2;
                            z4 = z;
                            break;
                        case 5:
                            LauncherWidget3DInfo launcherWidget3DInfo = new LauncherWidget3DInfo(i3);
                            com.tsf.shell.workspace3D.be.a(launcherWidget3DInfo, query3, j, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow10, columnIndexOrThrow12, columnIndexOrThrow13, columnIndexOrThrow18, columnIndexOrThrow11);
                            launcherWidget3DInfo.classname = query3.getString(columnIndexOrThrow14);
                            launcherWidget3DInfo.packagename = query3.getString(columnIndexOrThrow15);
                            launcherWidget3DInfo.internal = query3.getInt(columnIndexOrThrow16) != 0;
                            launcherWidget3DInfo.data = query3.getBlob(columnIndexOrThrow4);
                            launcherWidget3DInfo.config = query3.getString(columnIndexOrThrow17);
                            this.a.b.add(launcherWidget3DInfo);
                            z = z4;
                            i = i2;
                            z4 = z;
                            break;
                        case 6:
                        case R.styleable.CellLayout_longAxisCells /* 7 */:
                            LauncherShortcut3DInfo launcherShortcut3DInfo2 = new LauncherShortcut3DInfo(i3);
                            com.tsf.shell.workspace3D.be.a(launcherShortcut3DInfo2, query3, j, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow10, columnIndexOrThrow12, columnIndexOrThrow13, columnIndexOrThrow18, columnIndexOrThrow11);
                            launcherShortcut3DInfo2.itemType = i2;
                            launcherShortcut3DInfo2.title = query3.getString(columnIndexOrThrow3);
                            launcherShortcut3DInfo2.title = launcherShortcut3DInfo2.title == null ? "" : launcherShortcut3DInfo2.title;
                            if (i2 == 6) {
                                launcherShortcut3DInfo2.classname = com.tsf.shell.workspace3D.k.aj.class.getName();
                            } else {
                                launcherShortcut3DInfo2.classname = query3.getString(columnIndexOrThrow14);
                            }
                            launcherShortcut3DInfo2.packagename = query3.getString(columnIndexOrThrow15);
                            launcherShortcut3DInfo2.intent = query3.getString(columnIndexOrThrow2);
                            launcherShortcut3DInfo2.container = query3.getInt(columnIndexOrThrow5);
                            launcherShortcut3DInfo2.internal = true;
                            launcherShortcut3DInfo2.parse(query3.getString(columnIndexOrThrow17));
                            switch (launcherShortcut3DInfo2.container) {
                                case -4:
                                    str = this.a.l;
                                    if (!str.contains(Integer.toString(launcherShortcut3DInfo2.appWidgetId))) {
                                        com.tsf.shell.workspace3D.bf.l().d(i3);
                                        arrayList.add(Long.valueOf(j));
                                        z = z4;
                                        break;
                                    } else {
                                        this.a.b.add(launcherShortcut3DInfo2);
                                        z = z4;
                                        break;
                                    }
                                case LauncherShortcut3DInfo.CONTAINER_FOLDER /* -3 */:
                                    Iterator it2 = this.a.d.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            LauncherFolder3DInfo launcherFolder3DInfo3 = (LauncherFolder3DInfo) it2.next();
                                            if (launcherFolder3DInfo3.appWidgetId == launcherShortcut3DInfo2.screen) {
                                                launcherShortcut3DInfo2.folderInfo = launcherFolder3DInfo3;
                                                this.a.b.add(launcherShortcut3DInfo2);
                                                z2 = true;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                    if (!z2) {
                                        com.tsf.shell.workspace3D.bf.l().d(i3);
                                        arrayList.add(Long.valueOf(j));
                                        z = z4;
                                        break;
                                    }
                                    z = z4;
                                    break;
                                case LauncherShortcut3DInfo.CONTAINER_QUICKLAUNCH /* -2 */:
                                    str2 = this.a.k;
                                    if (!str2.contains(Integer.toString(launcherShortcut3DInfo2.appWidgetId))) {
                                        com.tsf.shell.workspace3D.bf.l().d(i3);
                                        arrayList.add(Long.valueOf(j));
                                        z = z4;
                                        break;
                                    } else {
                                        this.a.b.add(launcherShortcut3DInfo2);
                                        z = z4;
                                        break;
                                    }
                                case -1:
                                    this.a.b.add(launcherShortcut3DInfo2);
                                    z = z4;
                                    break;
                                default:
                                    arrayList.add(Long.valueOf(j));
                                    z = z4;
                                    break;
                            }
                            i = i2;
                            z4 = z;
                            break;
                    }
                } catch (Exception e) {
                }
            }
            if (z4) {
                a(contentResolver, arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient(cb.a);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    try {
                        acquireContentProviderClient.delete(cb.a(((Long) it3.next()).longValue()), null, null);
                    } catch (RemoteException e2) {
                    }
                }
            }
            if (arrayList2.size() > 0) {
                ContentProviderClient acquireContentProviderClient2 = contentResolver.acquireContentProviderClient(cc.a);
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    try {
                        acquireContentProviderClient2.delete(cc.a(((Long) it4.next()).longValue()), null, null);
                    } catch (RemoteException e3) {
                    }
                }
            }
            a();
            b();
            this.b = null;
            obj2 = this.a.f;
            synchronized (obj2) {
                bqVar = this.a.g;
                if (bqVar == this) {
                    this.a.g = null;
                }
            }
            System.gc();
        } finally {
            query3.close();
        }
    }

    private void a(ContentResolver contentResolver, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        Cursor query = contentResolver.query(cc.a, null, null, null, null);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("appWidgetId");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("child");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("title");
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(columnIndexOrThrow);
                    long j = query.getLong(columnIndexOrThrow2);
                    String string = query.getString(columnIndexOrThrow3);
                    String string2 = query.getString(columnIndexOrThrow4);
                    Iterator it = this.a.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) it.next();
                        if (launcherFolder3DInfo.appWidgetId == i) {
                            if (launcherFolder3DInfo.folderId != -1) {
                                com.tsf.shell.workspace3D.bf.l().d(i);
                                arrayList2.add(Long.valueOf(j));
                                z = true;
                            } else {
                                launcherFolder3DInfo.folderId = j;
                                if (string2 != null && !string2.equals("")) {
                                    launcherFolder3DInfo.title = string2;
                                }
                                if (string == null) {
                                    string = "";
                                }
                                launcherFolder3DInfo.child = string;
                                z = false;
                            }
                        }
                    }
                    if (z) {
                        com.tsf.shell.workspace3D.bf.l().d(i);
                        arrayList2.add(Long.valueOf(j));
                    }
                } catch (Exception e) {
                }
            }
            Iterator it2 = this.a.d.iterator();
            while (it2.hasNext()) {
                LauncherFolder3DInfo launcherFolder3DInfo2 = (LauncherFolder3DInfo) it2.next();
                if (launcherFolder3DInfo2.folderId == -1) {
                    com.tsf.shell.workspace3D.bf.l().d(launcherFolder3DInfo2.appWidgetId);
                    arrayList.add(Long.valueOf(launcherFolder3DInfo2.id));
                }
            }
        } finally {
            query.close();
        }
    }

    private void a() {
        bl blVar;
        bl blVar2;
        bl blVar3;
        blVar = this.a.h;
        blVar.m();
        int size = this.a.a.size();
        for (int i = 0; i < size; i++) {
            br brVar = new br(this, (LauncherAppWidgetInfo) this.a.a.get(i));
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(brVar);
        }
        int size2 = this.a.c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) this.a.c.get(i2);
            blVar3 = this.a.h;
            blVar3.a(launcherShortcut3DInfo);
        }
        blVar2 = this.a.h;
        blVar2.n();
    }

    private void b() {
        com.tsf.shell.h.a aVar;
        com.tsf.shell.h.a aVar2;
        bl blVar;
        String str;
        bl blVar2;
        String str2;
        com.tsf.shell.h.a aVar3;
        List<ResolveInfo> list;
        int i;
        int i2;
        com.tsf.shell.h.a aVar4;
        com.tsf.shell.h.a aVar5;
        bl blVar3;
        int i3;
        int i4;
        bl blVar4;
        com.tsf.shell.h.a aVar6;
        com.tsf.shell.h.a aVar7;
        int size;
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        PackageManager packageManager = this.b.getPackageManager();
        int i5 = -1;
        int i6 = 0;
        int i7 = Integer.MAX_VALUE;
        List<ResolveInfo> list2 = null;
        while (i6 < i7) {
            if (i6 == 0) {
                aVar7 = this.a.i;
                aVar7.a.clear();
                aVar7.e.clear();
                aVar7.b.clear();
                aVar7.c.clear();
                aVar7.d.clear();
                aVar7.f.clear();
                aVar7.g.clear();
                aVar7.h.clear();
                aVar7.j.clear();
                aVar7.k.clear();
                aVar7.l.clear();
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                if (queryIntentActivities == null || (size = queryIntentActivities.size()) == 0) {
                    return;
                }
                i = size;
                list = queryIntentActivities;
                i2 = size;
            } else {
                list = list2;
                i = i7;
                i2 = i5;
            }
            for (int i8 = 0; i6 < i && i8 < i2; i8++) {
                aVar6 = this.a.i;
                aVar6.a(new com.tsf.shell.h.b(list.get(i6)));
                i6++;
            }
            boolean z = i6 <= i2;
            aVar4 = this.a.i;
            ArrayList arrayList = aVar4.b;
            aVar5 = this.a.i;
            aVar5.b = new ArrayList();
            if (z) {
                blVar4 = this.a.h;
                blVar4.a(arrayList);
            } else {
                blVar3 = this.a.h;
                blVar3.a(arrayList, true);
            }
            i3 = this.a.j;
            if (i3 > 0 && i6 < i) {
                try {
                    i4 = this.a.j;
                    Thread.sleep(i4);
                    i5 = i2;
                    i7 = i;
                    list2 = list;
                } catch (InterruptedException e) {
                }
            }
            i5 = i2;
            i7 = i;
            list2 = list;
        }
        i.a().b("ShellModel");
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(new Intent("com.tsf.shell.3dwidget", (Uri) null), 0);
        Collections.sort(queryIntentActivities2, new ResolveInfo.DisplayNameComparator(packageManager));
        int size2 = queryIntentActivities2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ResolveInfo resolveInfo = queryIntentActivities2.get(i9);
            aVar3 = this.a.i;
            aVar3.b(new com.tsf.shell.h.b(resolveInfo));
        }
        aVar = this.a.i;
        ArrayList arrayList2 = aVar.f;
        aVar2 = this.a.i;
        aVar2.f = new ArrayList();
        com.tsf.shell.workspace3D.bf.l().a(arrayList2);
        int size3 = this.a.b.size();
        for (int i10 = 0; i10 < size3; i10++) {
            com.tsf.shell.workspace3D.bf.l().b((LauncherItem3DInfo) this.a.b.get(i10));
        }
        c();
        blVar = this.a.h;
        str = this.a.k;
        blVar.a(str);
        blVar2 = this.a.h;
        str2 = this.a.l;
        blVar2.b(str2);
        bs bsVar = new bs(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(bsVar);
    }

    private void c() {
        int size = this.a.d.size();
        for (int i = 0; i < size; i++) {
            com.tsf.shell.workspace3D.bf.l().b((LauncherItem3DInfo) this.a.d.get(i));
        }
    }
}
