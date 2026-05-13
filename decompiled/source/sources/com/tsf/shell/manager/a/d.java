package com.tsf.shell.manager.a;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.RemoteException;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.b;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.g;
import com.tsf.shell.manager.a.c;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.utils.l;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class d implements c.a {
    private static final Object a = new Object();
    private e e;
    private a f;
    private HashMap<Integer, LauncherDrawerFolder3DInfo> b = new HashMap<>();
    private boolean c = false;
    private boolean d = false;
    private ArrayList<com.tsf.shell.f.i.b.e.g> g = new ArrayList<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(ArrayList<com.tsf.shell.f.i.b> arrayList);
    }

    public d(e eVar) {
        this.e = eVar;
        eVar.a().a(this);
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    public void c() {
        if (!this.c) {
            this.c = true;
            com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.a.d.1
                @Override // java.lang.Runnable
                public void run() {
                    final ArrayList f = d.this.f();
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.d.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.f.a(d.this.a(f));
                            d.this.c = true;
                            d.this.d();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<com.tsf.shell.f.i.b> a(ArrayList<ItemInfo> arrayList) {
        System.currentTimeMillis();
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayList2 = (ArrayList) com.tsf.shell.manager.a.w.a().d().clone();
        ArrayList<com.tsf.shell.f.i.b> arrayList3 = new ArrayList<>();
        Iterator<ItemInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            ItemInfo next = it.next();
            if (next instanceof LauncherShortcutAppInfo) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) next;
                com.tsf.shell.f.i.b.e.g a2 = a(launcherShortcutAppInfo, arrayList2);
                if (a2 != null) {
                    a2.b(next);
                } else {
                    a2 = new com.tsf.shell.f.i.b.e.g(launcherShortcutAppInfo, com.tsf.shell.f.i.b.e.g.a((LauncherShortcut3DInfo) launcherShortcutAppInfo), true);
                    com.tsf.shell.manager.a.w.a().a(a2, false, false);
                    a2.b(next);
                    a2.setMouseEventListener(com.tsf.shell.manager.a.h.t().f(a2));
                }
                arrayList3.add(a2);
            } else if (next instanceof LauncherFolder3DInfo) {
                LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) next;
                Iterator<ItemInfo> it2 = launcherFolder3DInfo.getItemInfo().iterator();
                while (it2.hasNext()) {
                    ItemInfo next2 = it2.next();
                    LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) next2;
                    com.tsf.shell.f.i.b.e.g a3 = a(launcherShortcutAppInfo2, arrayList2);
                    if (a3 != null) {
                        a3.b(next2);
                    } else {
                        com.tsf.shell.f.i.b.e.g gVar = new com.tsf.shell.f.i.b.e.g(launcherShortcutAppInfo2, com.tsf.shell.f.i.b.e.g.a((LauncherShortcut3DInfo) launcherShortcutAppInfo2), true);
                        gVar.b(next2);
                        com.tsf.shell.manager.a.w.a().a(gVar, false, false);
                    }
                }
                com.tsf.shell.f.i.b.d.b a4 = com.tsf.shell.f.i.b.d.b.a(launcherFolder3DInfo);
                a4.setMouseEventListener(com.tsf.shell.manager.a.h.t().f(a4));
                arrayList3.add(a4);
            }
        }
        com.tsf.shell.manager.a.w.b().a(arrayList3);
        Iterator<com.tsf.shell.f.i.b.e.g> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            com.tsf.shell.f.i.b.e.g next3 = it3.next();
            next3.b(new LauncherShortcutAppInfo());
            arrayList3.add(com.tsf.shell.manager.a.w.b().a(arrayList3, next3), next3);
        }
        return arrayList3;
    }

    private com.tsf.shell.f.i.b.e.g a(LauncherShortcutAppInfo launcherShortcutAppInfo, ArrayList<com.tsf.shell.f.i.b.e.g> arrayList) {
        if (launcherShortcutAppInfo.intent == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.tsf.shell.f.i.b.e.g gVar = arrayList.get(i);
            if (gVar.bd().b.equals(launcherShortcutAppInfo.intent.getComponent())) {
                arrayList.remove(i);
                return gVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<ItemInfo> f() {
        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
        Cursor query = contentResolver.query(g.b.a, null, null, null, "itemType ASC");
        ArrayList arrayList = new ArrayList();
        ArrayList<ItemInfo> arrayList2 = new ArrayList<>();
        new ArrayList();
        synchronized (a) {
            ArrayList arrayList3 = new ArrayList();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("clickcnt");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("ishide");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("vercode");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("vername");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("mindex");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("intent");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("title");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("container");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("itemType");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("config");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("iconType");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("iconPackage");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("iconResource");
            int columnIndexOrThrow15 = query.getColumnIndexOrThrow("titleType");
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(columnIndexOrThrow10);
                    int i2 = query.getInt(columnIndexOrThrow9);
                    int i3 = (int) query.getLong(columnIndexOrThrow);
                    if (i2 == 0) {
                        arrayList3.add(Integer.valueOf(i3));
                    } else {
                        switch (i) {
                            case 1:
                                LauncherDrawerFolder3DInfo a2 = a(this.b, Integer.valueOf(i3));
                                a2.id = i3;
                                a2.index = query.getInt(columnIndexOrThrow6);
                                a2.title = query.getString(columnIndexOrThrow8);
                                a2.title = (a2.title == null || a2.title.length() == 0) ? x.c(b.i.widget_folder) : a2.title;
                                a2.container = i2;
                                a2.config = query.getString(columnIndexOrThrow11);
                                arrayList2.add(a2);
                                continue;
                            case 2:
                                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) com.tsf.shell.manager.l.a.a(i);
                                launcherShortcutAppInfo.isHide = query.getInt(columnIndexOrThrow3) == 1;
                                launcherShortcutAppInfo.clickCount = query.getInt(columnIndexOrThrow2);
                                launcherShortcutAppInfo.versionCode = query.getInt(columnIndexOrThrow4);
                                launcherShortcutAppInfo.versionName = query.getString(columnIndexOrThrow5);
                                launcherShortcutAppInfo.id = i3;
                                launcherShortcutAppInfo.index = query.getInt(columnIndexOrThrow6);
                                launcherShortcutAppInfo.title = query.getString(columnIndexOrThrow8);
                                launcherShortcutAppInfo.title = launcherShortcutAppInfo.title == null ? "" : launcherShortcutAppInfo.title;
                                launcherShortcutAppInfo.container = i2;
                                launcherShortcutAppInfo.titleType = query.getInt(columnIndexOrThrow15);
                                launcherShortcutAppInfo.iconType = query.getInt(columnIndexOrThrow12);
                                if (launcherShortcutAppInfo.iconType == 1) {
                                    Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
                                    shortcutIconResource.packageName = query.getString(columnIndexOrThrow13);
                                    shortcutIconResource.resourceName = query.getString(columnIndexOrThrow14);
                                    launcherShortcutAppInfo.iconResource = shortcutIconResource;
                                }
                                try {
                                    launcherShortcutAppInfo.intent = Intent.parseUri(query.getString(columnIndexOrThrow7), 0);
                                } catch (Exception e) {
                                }
                                if (launcherShortcutAppInfo.intent == null || launcherShortcutAppInfo.intent.getComponent() == null || a(arrayList, launcherShortcutAppInfo)) {
                                    arrayList3.add(Integer.valueOf(i3));
                                    continue;
                                } else {
                                    arrayList.add(launcherShortcutAppInfo);
                                    switch (i2) {
                                        case ItemInfo.NO_ID /* -1 */:
                                            arrayList2.add(launcherShortcutAppInfo);
                                            continue;
                                        default:
                                            a(this.b, Integer.valueOf(i2)).add(launcherShortcutAppInfo);
                                            continue;
                                    }
                                }
                            default:
                                arrayList3.add(Integer.valueOf(i3));
                                continue;
                        }
                    }
                } catch (Exception e2) {
                }
            }
            for (Integer num : this.b.keySet()) {
                LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = this.b.get(num);
                if (launcherDrawerFolder3DInfo.id == -1) {
                    Iterator<ItemInfo> it = launcherDrawerFolder3DInfo.getItemInfo().iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Integer.valueOf(it.next().id));
                    }
                    launcherDrawerFolder3DInfo.getItemInfo().clear();
                }
            }
            if (arrayList3.size() > 0) {
                ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient(g.b.a);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    try {
                        acquireContentProviderClient.delete(g.b.a(((Integer) it2.next()).intValue(), false), null, null);
                    } catch (RemoteException e3) {
                    }
                }
            }
            arrayList.clear();
        }
        return arrayList2;
    }

    private static boolean a(ArrayList<LauncherShortcut3DInfo> arrayList, LauncherShortcut3DInfo launcherShortcut3DInfo) {
        Iterator<LauncherShortcut3DInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().intent.getComponent().equals(launcherShortcut3DInfo.intent.getComponent())) {
                return true;
            }
        }
        return false;
    }

    private static LauncherDrawerFolder3DInfo a(HashMap<Integer, LauncherDrawerFolder3DInfo> hashMap, Integer num) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = hashMap.get(num);
        if (launcherDrawerFolder3DInfo == null) {
            LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo2 = new LauncherDrawerFolder3DInfo(false);
            hashMap.put(num, launcherDrawerFolder3DInfo2);
            return launcherDrawerFolder3DInfo2;
        }
        return launcherDrawerFolder3DInfo;
    }

    private boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public void a(ItemInfo itemInfo, int i) {
        a(itemInfo, i, null);
    }

    private void a(final ItemInfo itemInfo, int i, final Runnable runnable) {
        final ContentValues contentValues = new ContentValues();
        final boolean z = itemInfo.id == -1;
        if (z) {
            itemInfo.id = ShellProvider.a().c();
            contentValues.put("_id", Integer.valueOf(itemInfo.id));
            contentValues.put("itemType", Integer.valueOf(itemInfo.itemType));
            contentValues.put("title", itemInfo.title);
            contentValues.put("container", Integer.valueOf(itemInfo.container));
            if (itemInfo instanceof LauncherShortcutAppInfo) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
                contentValues.put("intent", launcherShortcutAppInfo.intent != null ? launcherShortcutAppInfo.intent.toUri(0) : null);
            }
        }
        if (a(i, 32) && (itemInfo instanceof LauncherShortcutAppInfo)) {
            contentValues.put("clickcnt", Integer.valueOf(((LauncherShortcutAppInfo) itemInfo).clickCount));
        }
        if (a(i, 1)) {
            contentValues.put("title", itemInfo.title);
        }
        if (a(i, 2)) {
            contentValues.put("mindex", Integer.valueOf(itemInfo.index));
        }
        if (a(i, 4)) {
            contentValues.put("container", Integer.valueOf(itemInfo.container));
        }
        if (a(i, 64) && (itemInfo instanceof LauncherShortcutAppInfo)) {
            contentValues.put("ishide", Integer.valueOf(((LauncherShortcutAppInfo) itemInfo).isHide ? 1 : 0));
        }
        if (itemInfo instanceof LauncherShortcutAppInfo) {
            LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) itemInfo;
            String uri = launcherShortcutAppInfo2.intent != null ? launcherShortcutAppInfo2.intent.toUri(0) : null;
            if (a(i, ItemInfo.APP_INTENT)) {
                contentValues.put("intent", uri);
            }
        } else if ((itemInfo instanceof LauncherFolder3DInfo) && a(i, 16)) {
            contentValues.put("config", itemInfo.config);
        }
        if (a(i, 8)) {
            contentValues.put("itemType", Integer.valueOf(itemInfo.itemType));
        }
        ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.a.d.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (d.a) {
                    ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                    if (z) {
                        contentResolver.insert(g.b.a, contentValues);
                        switch (itemInfo.itemType) {
                            case 1:
                                d.this.b.put(Integer.valueOf(itemInfo.id), (LauncherDrawerFolder3DInfo) itemInfo);
                                break;
                        }
                    } else {
                        contentResolver.update(g.b.a(itemInfo.id, false), contentValues, null, null);
                    }
                    contentValues.clear();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
    }

    public void a(final ItemInfo itemInfo) {
        if (itemInfo == null) {
            l.a(this, "ApplicationDataManager -> delete");
        }
        ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.a.d.3
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.d().getContentResolver().delete(g.b.a(itemInfo.id, false), null, null);
            }
        });
    }

    @Override // com.tsf.shell.manager.a.c.a
    public void a(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
    }

    @Override // com.tsf.shell.manager.a.c.a
    public void a(com.tsf.shell.f.i.b.e.g gVar) {
    }

    public void d() {
        Iterator<com.tsf.shell.f.i.b.e.g> it = this.g.iterator();
        while (it.hasNext()) {
            b(it.next(), false);
        }
        com.tsf.shell.manager.a.w.a().a().a();
        this.g.clear();
    }

    @Override // com.tsf.shell.manager.a.c.a
    public void b(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
        if (this.d) {
            a(gVar.K());
        } else {
            this.g.add(gVar);
        }
    }

    @Override // com.tsf.shell.manager.a.c.a
    public void k_() {
    }

    @Override // com.tsf.shell.manager.a.c.a
    public void a() {
    }
}
