package com.tsf.shell.manager.p166a;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.RemoteException;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.C1306b;
import com.tsf.shell.C3345g;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p166a.C3364c;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.utils.C4176l;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.a.d */
/* loaded from: classes.dex */
public class C3366d implements C3364c.InterfaceC3365a {

    /* renamed from: a */
    private static final Object f11132a = new Object();

    /* renamed from: e */
    private C3372e f11136e;

    /* renamed from: f */
    private InterfaceC3371a f11137f;

    /* renamed from: b */
    private HashMap<Integer, LauncherDrawerFolder3DInfo> f11133b = new HashMap<>();

    /* renamed from: c */
    private boolean f11134c = false;

    /* renamed from: d */
    private boolean f11135d = false;

    /* renamed from: g */
    private ArrayList<C3222g> f11138g = new ArrayList<>();

    /* renamed from: com.tsf.shell.manager.a.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3371a {
        /* renamed from: a */
        void mo2717a(ArrayList<C3112b> arrayList);
    }

    public C3366d(C3372e c3372e) {
        this.f11136e = c3372e;
        c3372e.m2716a().m2743a(this);
    }

    /* renamed from: a */
    public void m2730a(InterfaceC3371a interfaceC3371a) {
        this.f11137f = interfaceC3371a;
    }

    /* renamed from: c */
    public void m2722c() {
        if (!this.f11134c) {
            this.f11134c = true;
            C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.manager.a.d.1
                @Override // java.lang.Runnable
                public void run() {
                    final ArrayList m2718f = C3366d.this.m2718f();
                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.a.d.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3366d.this.f11137f.mo2717a(C3366d.this.m2726a(m2718f));
                            C3366d.this.f11134c = true;
                            C3366d.this.m2720d();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public ArrayList<C3112b> m2726a(ArrayList<ItemInfo> arrayList) {
        System.currentTimeMillis();
        ArrayList<C3222g> arrayList2 = (ArrayList) C3359a.f11109w.m2716a().m2736d().clone();
        ArrayList<C3112b> arrayList3 = new ArrayList<>();
        Iterator<ItemInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            ItemInfo next = it.next();
            if (next instanceof LauncherShortcutAppInfo) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) next;
                C3222g m2731a = m2731a(launcherShortcutAppInfo, arrayList2);
                if (m2731a != null) {
                    m2731a.m3110b(next);
                } else {
                    m2731a = new C3222g(launcherShortcutAppInfo, C3222g.m3116a((LauncherShortcut3DInfo) launcherShortcutAppInfo), true);
                    C3359a.f11109w.m2716a().m2744a(m2731a, false, false);
                    m2731a.m3110b(next);
                    m2731a.setMouseEventListener(C3359a.f11094h.m4019t().m4406f(m2731a));
                }
                arrayList3.add(m2731a);
            } else if (next instanceof LauncherFolder3DInfo) {
                LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) next;
                Iterator<ItemInfo> it2 = launcherFolder3DInfo.getItemInfo().iterator();
                while (it2.hasNext()) {
                    ItemInfo next2 = it2.next();
                    LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) next2;
                    C3222g m2731a2 = m2731a(launcherShortcutAppInfo2, arrayList2);
                    if (m2731a2 != null) {
                        m2731a2.m3110b(next2);
                    } else {
                        C3222g c3222g = new C3222g(launcherShortcutAppInfo2, C3222g.m3116a((LauncherShortcut3DInfo) launcherShortcutAppInfo2), true);
                        c3222g.m3110b(next2);
                        C3359a.f11109w.m2716a().m2744a(c3222g, false, false);
                    }
                }
                C3145b m3404a = C3145b.m3404a(launcherFolder3DInfo);
                m3404a.setMouseEventListener(C3359a.f11094h.m4019t().m4406f(m3404a));
                arrayList3.add(m3404a);
            }
        }
        C3359a.f11109w.m2712b().m4593a(arrayList3);
        Iterator<C3222g> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C3222g next3 = it3.next();
            next3.m3110b(new LauncherShortcutAppInfo());
            arrayList3.add(C3359a.f11109w.m2712b().m4592a(arrayList3, next3), next3);
        }
        return arrayList3;
    }

    /* renamed from: a */
    private C3222g m2731a(LauncherShortcutAppInfo launcherShortcutAppInfo, ArrayList<C3222g> arrayList) {
        if (launcherShortcutAppInfo.intent == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3222g c3222g = arrayList.get(i);
            if (c3222g.m3106bd().f11169b.equals(launcherShortcutAppInfo.intent.getComponent())) {
                arrayList.remove(i);
                return c3222g;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public ArrayList<ItemInfo> m2718f() {
        ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
        Cursor query = contentResolver.query(C3345g.C3347b.f11067a, null, null, null, "itemType ASC");
        ArrayList arrayList = new ArrayList();
        ArrayList<ItemInfo> arrayList2 = new ArrayList<>();
        new ArrayList();
        synchronized (f11132a) {
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
                                LauncherDrawerFolder3DInfo m2724a = m2724a(this.f11133b, Integer.valueOf(i3));
                                m2724a.f2532id = i3;
                                m2724a.index = query.getInt(columnIndexOrThrow6);
                                m2724a.title = query.getString(columnIndexOrThrow8);
                                m2724a.title = (m2724a.title == null || m2724a.title.length() == 0) ? C4189x.m588c(C1306b.C1315i.widget_folder) : m2724a.title;
                                m2724a.container = i2;
                                m2724a.config = query.getString(columnIndexOrThrow11);
                                arrayList2.add(m2724a);
                                continue;
                            case 2:
                                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) C3519a.m2153a(i);
                                launcherShortcutAppInfo.isHide = query.getInt(columnIndexOrThrow3) == 1;
                                launcherShortcutAppInfo.clickCount = query.getInt(columnIndexOrThrow2);
                                launcherShortcutAppInfo.versionCode = query.getInt(columnIndexOrThrow4);
                                launcherShortcutAppInfo.versionName = query.getString(columnIndexOrThrow5);
                                launcherShortcutAppInfo.f2532id = i3;
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
                                if (launcherShortcutAppInfo.intent == null || launcherShortcutAppInfo.intent.getComponent() == null || m2725a(arrayList, launcherShortcutAppInfo)) {
                                    arrayList3.add(Integer.valueOf(i3));
                                    continue;
                                } else {
                                    arrayList.add(launcherShortcutAppInfo);
                                    switch (i2) {
                                        case ItemInfo.NO_ID /* -1 */:
                                            arrayList2.add(launcherShortcutAppInfo);
                                            continue;
                                        default:
                                            m2724a(this.f11133b, Integer.valueOf(i2)).add(launcherShortcutAppInfo);
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
            for (Integer num : this.f11133b.keySet()) {
                LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = this.f11133b.get(num);
                if (launcherDrawerFolder3DInfo.f2532id == -1) {
                    Iterator<ItemInfo> it = launcherDrawerFolder3DInfo.getItemInfo().iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Integer.valueOf(it.next().f2532id));
                    }
                    launcherDrawerFolder3DInfo.getItemInfo().clear();
                }
            }
            if (arrayList3.size() > 0) {
                ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient(C3345g.C3347b.f11067a);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    try {
                        acquireContentProviderClient.delete(C3345g.C3347b.m2782a(((Integer) it2.next()).intValue(), false), null, null);
                    } catch (RemoteException e3) {
                    }
                }
            }
            arrayList.clear();
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static boolean m2725a(ArrayList<LauncherShortcut3DInfo> arrayList, LauncherShortcut3DInfo launcherShortcut3DInfo) {
        Iterator<LauncherShortcut3DInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().intent.getComponent().equals(launcherShortcut3DInfo.intent.getComponent())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static LauncherDrawerFolder3DInfo m2724a(HashMap<Integer, LauncherDrawerFolder3DInfo> hashMap, Integer num) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = hashMap.get(num);
        if (launcherDrawerFolder3DInfo == null) {
            LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo2 = new LauncherDrawerFolder3DInfo(false);
            hashMap.put(num, launcherDrawerFolder3DInfo2);
            return launcherDrawerFolder3DInfo2;
        }
        return launcherDrawerFolder3DInfo;
    }

    /* renamed from: a */
    private boolean m2735a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public void m2733a(ItemInfo itemInfo, int i) {
        m2732a(itemInfo, i, null);
    }

    /* renamed from: a */
    private void m2732a(final ItemInfo itemInfo, int i, final Runnable runnable) {
        final ContentValues contentValues = new ContentValues();
        final boolean z = itemInfo.f2532id == -1;
        if (z) {
            itemInfo.f2532id = ShellProvider.m6147a().m6144c();
            contentValues.put("_id", Integer.valueOf(itemInfo.f2532id));
            contentValues.put("itemType", Integer.valueOf(itemInfo.itemType));
            contentValues.put("title", itemInfo.title);
            contentValues.put("container", Integer.valueOf(itemInfo.container));
            if (itemInfo instanceof LauncherShortcutAppInfo) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
                contentValues.put("intent", launcherShortcutAppInfo.intent != null ? launcherShortcutAppInfo.intent.toUri(0) : null);
            }
        }
        if (m2735a(i, 32) && (itemInfo instanceof LauncherShortcutAppInfo)) {
            contentValues.put("clickcnt", Integer.valueOf(((LauncherShortcutAppInfo) itemInfo).clickCount));
        }
        if (m2735a(i, 1)) {
            contentValues.put("title", itemInfo.title);
        }
        if (m2735a(i, 2)) {
            contentValues.put("mindex", Integer.valueOf(itemInfo.index));
        }
        if (m2735a(i, 4)) {
            contentValues.put("container", Integer.valueOf(itemInfo.container));
        }
        if (m2735a(i, 64) && (itemInfo instanceof LauncherShortcutAppInfo)) {
            contentValues.put("ishide", Integer.valueOf(((LauncherShortcutAppInfo) itemInfo).isHide ? 1 : 0));
        }
        if (itemInfo instanceof LauncherShortcutAppInfo) {
            LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) itemInfo;
            String uri = launcherShortcutAppInfo2.intent != null ? launcherShortcutAppInfo2.intent.toUri(0) : null;
            if (m2735a(i, ItemInfo.APP_INTENT)) {
                contentValues.put("intent", uri);
            }
        } else if ((itemInfo instanceof LauncherFolder3DInfo) && m2735a(i, 16)) {
            contentValues.put("config", itemInfo.config);
        }
        if (m2735a(i, 8)) {
            contentValues.put("itemType", Integer.valueOf(itemInfo.itemType));
        }
        ShellModel.f11360b.post(new Runnable() { // from class: com.tsf.shell.manager.a.d.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C3366d.f11132a) {
                    ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
                    if (z) {
                        contentResolver.insert(C3345g.C3347b.f11067a, contentValues);
                        switch (itemInfo.itemType) {
                            case 1:
                                C3366d.this.f11133b.put(Integer.valueOf(itemInfo.f2532id), (LauncherDrawerFolder3DInfo) itemInfo);
                                break;
                        }
                    } else {
                        contentResolver.update(C3345g.C3347b.m2782a(itemInfo.f2532id, false), contentValues, null, null);
                    }
                    contentValues.clear();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void m2734a(final ItemInfo itemInfo) {
        if (itemInfo == null) {
            C4176l.m668a(this, "ApplicationDataManager -> delete");
        }
        ShellModel.f11360b.post(new Runnable() { // from class: com.tsf.shell.manager.a.d.3
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10856d().getContentResolver().delete(C3345g.C3347b.m2782a(itemInfo.f2532id, false), null, null);
            }
        });
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: a */
    public void mo2677a(C3222g c3222g, boolean z) {
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: a */
    public void mo2678a(C3222g c3222g) {
    }

    /* renamed from: d */
    public void m2720d() {
        Iterator<C3222g> it = this.f11138g.iterator();
        while (it.hasNext()) {
            mo2676b(it.next(), false);
        }
        C3359a.f11109w.m2716a().m2749a().m2693a();
        this.f11138g.clear();
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: b */
    public void mo2676b(C3222g c3222g, boolean z) {
        if (this.f11135d) {
            m2734a(c3222g.m3534K());
        } else {
            this.f11138g.add(c3222g);
        }
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: k_ */
    public void mo2675k_() {
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: a */
    public void mo2679a() {
    }
}
