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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d implements c.a {
    private static final Object a = new Object();
    private e e;
    private a f;
    private HashMap<Integer, LauncherDrawerFolder3DInfo> b = new HashMap<>();
    private boolean c = false;
    private boolean d = false;
    private ArrayList<com.tsf.shell.f.i.b.e.g> g = new ArrayList<>();

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
                    final ArrayList arrayListF = d.this.f();
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.d.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.f.a(d.this.a((ArrayList<ItemInfo>) arrayListF));
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
        for (ItemInfo itemInfo : arrayList) {
            if (itemInfo instanceof LauncherShortcutAppInfo) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
                com.tsf.shell.f.i.b.e.g gVarA = a(launcherShortcutAppInfo, arrayList2);
                if (gVarA != null) {
                    gVarA.b(itemInfo);
                } else {
                    gVarA = new com.tsf.shell.f.i.b.e.g(launcherShortcutAppInfo, com.tsf.shell.f.i.b.e.g.a((LauncherShortcut3DInfo) launcherShortcutAppInfo), true);
                    com.tsf.shell.manager.a.w.a().a(gVarA, false, false);
                    gVarA.b(itemInfo);
                    gVarA.setMouseEventListener(com.tsf.shell.manager.a.h.t().f(gVarA));
                }
                arrayList3.add(gVarA);
            } else if (itemInfo instanceof LauncherFolder3DInfo) {
                LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) itemInfo;
                for (ItemInfo itemInfo2 : launcherFolder3DInfo.getItemInfo()) {
                    LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) itemInfo2;
                    com.tsf.shell.f.i.b.e.g gVarA2 = a(launcherShortcutAppInfo2, arrayList2);
                    if (gVarA2 != null) {
                        gVarA2.b(itemInfo2);
                    } else {
                        com.tsf.shell.f.i.b.e.g gVar = new com.tsf.shell.f.i.b.e.g(launcherShortcutAppInfo2, com.tsf.shell.f.i.b.e.g.a((LauncherShortcut3DInfo) launcherShortcutAppInfo2), true);
                        gVar.b(itemInfo2);
                        com.tsf.shell.manager.a.w.a().a(gVar, false, false);
                    }
                }
                com.tsf.shell.f.i.b.d.b bVarA = com.tsf.shell.f.i.b.d.b.a(launcherFolder3DInfo);
                bVarA.setMouseEventListener(com.tsf.shell.manager.a.h.t().f(bVarA));
                arrayList3.add(bVarA);
            }
        }
        com.tsf.shell.manager.a.w.b().a(arrayList3);
        for (com.tsf.shell.f.i.b.e.g gVar2 : arrayList2) {
            gVar2.b(new LauncherShortcutAppInfo());
            arrayList3.add(com.tsf.shell.manager.a.w.b().a(arrayList3, gVar2), gVar2);
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
        Cursor cursorQuery = contentResolver.query(g.b.a, null, null, null, "itemType ASC");
        ArrayList arrayList = new ArrayList();
        ArrayList<ItemInfo> arrayList2 = new ArrayList<>();
        new ArrayList();
        synchronized (a) {
            ArrayList arrayList3 = new ArrayList();
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("clickcnt");
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("ishide");
            int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("vercode");
            int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("vername");
            int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("mindex");
            int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow("intent");
            int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow("title");
            int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow("container");
            int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow("itemType");
            int columnIndexOrThrow11 = cursorQuery.getColumnIndexOrThrow("config");
            int columnIndexOrThrow12 = cursorQuery.getColumnIndexOrThrow("iconType");
            int columnIndexOrThrow13 = cursorQuery.getColumnIndexOrThrow("iconPackage");
            int columnIndexOrThrow14 = cursorQuery.getColumnIndexOrThrow("iconResource");
            int columnIndexOrThrow15 = cursorQuery.getColumnIndexOrThrow("titleType");
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(columnIndexOrThrow10);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow9);
                    int i3 = (int) cursorQuery.getLong(columnIndexOrThrow);
                    if (i2 == 0) {
                        arrayList3.add(Integer.valueOf(i3));
                    } else {
                        switch (i) {
                            case 1:
                                LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfoA = a(this.b, Integer.valueOf(i3));
                                launcherDrawerFolder3DInfoA.id = i3;
                                launcherDrawerFolder3DInfoA.index = cursorQuery.getInt(columnIndexOrThrow6);
                                launcherDrawerFolder3DInfoA.title = cursorQuery.getString(columnIndexOrThrow8);
                                launcherDrawerFolder3DInfoA.title = (launcherDrawerFolder3DInfoA.title == null || launcherDrawerFolder3DInfoA.title.length() == 0) ? x.c(b.i.widget_folder) : launcherDrawerFolder3DInfoA.title;
                                launcherDrawerFolder3DInfoA.container = i2;
                                launcherDrawerFolder3DInfoA.config = cursorQuery.getString(columnIndexOrThrow11);
                                arrayList2.add(launcherDrawerFolder3DInfoA);
                                break;
                            case 2:
                                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) com.tsf.shell.manager.l.a.a(i);
                                launcherShortcutAppInfo.isHide = cursorQuery.getInt(columnIndexOrThrow3) == 1;
                                launcherShortcutAppInfo.clickCount = cursorQuery.getInt(columnIndexOrThrow2);
                                launcherShortcutAppInfo.versionCode = cursorQuery.getInt(columnIndexOrThrow4);
                                launcherShortcutAppInfo.versionName = cursorQuery.getString(columnIndexOrThrow5);
                                launcherShortcutAppInfo.id = i3;
                                launcherShortcutAppInfo.index = cursorQuery.getInt(columnIndexOrThrow6);
                                launcherShortcutAppInfo.title = cursorQuery.getString(columnIndexOrThrow8);
                                launcherShortcutAppInfo.title = launcherShortcutAppInfo.title == null ? "" : launcherShortcutAppInfo.title;
                                launcherShortcutAppInfo.container = i2;
                                launcherShortcutAppInfo.titleType = cursorQuery.getInt(columnIndexOrThrow15);
                                launcherShortcutAppInfo.iconType = cursorQuery.getInt(columnIndexOrThrow12);
                                if (launcherShortcutAppInfo.iconType == 1) {
                                    Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
                                    shortcutIconResource.packageName = cursorQuery.getString(columnIndexOrThrow13);
                                    shortcutIconResource.resourceName = cursorQuery.getString(columnIndexOrThrow14);
                                    launcherShortcutAppInfo.iconResource = shortcutIconResource;
                                }
                                try {
                                    launcherShortcutAppInfo.intent = Intent.parseUri(cursorQuery.getString(columnIndexOrThrow7), 0);
                                    break;
                                } catch (Exception e) {
                                }
                                if (launcherShortcutAppInfo.intent == null || launcherShortcutAppInfo.intent.getComponent() == null || a((ArrayList<LauncherShortcut3DInfo>) arrayList, launcherShortcutAppInfo)) {
                                    arrayList3.add(Integer.valueOf(i3));
                                    break;
                                } else {
                                    arrayList.add(launcherShortcutAppInfo);
                                    switch (i2) {
                                        case ItemInfo.NO_ID /* -1 */:
                                            arrayList2.add(launcherShortcutAppInfo);
                                            break;
                                        default:
                                            a(this.b, Integer.valueOf(i2)).add(launcherShortcutAppInfo);
                                            break;
                                    }
                                }
                                break;
                            default:
                                arrayList3.add(Integer.valueOf(i3));
                                break;
                        }
                    }
                } catch (Exception e2) {
                }
            }
            Iterator<Integer> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = this.b.get(it.next());
                if (launcherDrawerFolder3DInfo.id == -1) {
                    Iterator<ItemInfo> it2 = launcherDrawerFolder3DInfo.getItemInfo().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Integer.valueOf(it2.next().id));
                    }
                    launcherDrawerFolder3DInfo.getItemInfo().clear();
                }
            }
            if (arrayList3.size() > 0) {
                ContentProviderClient contentProviderClientAcquireContentProviderClient = contentResolver.acquireContentProviderClient(g.b.a);
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    try {
                        contentProviderClientAcquireContentProviderClient.delete(g.b.a(((Integer) it3.next()).intValue(), false), null, null);
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

    private static LauncherDrawerFolder3DInfo a(HashMap<Integer, LauncherDrawerFolder3DInfo> map, Integer num) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = map.get(num);
        if (launcherDrawerFolder3DInfo == null) {
            LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo2 = new LauncherDrawerFolder3DInfo(false);
            map.put(num, launcherDrawerFolder3DInfo2);
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
