package com.tsf.shell.manager.p180l;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.shell.C2234d;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3386b;
import com.tsf.shell.manager.bind.C3444a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3211c;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3219f;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3225i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.l.a */
/* loaded from: classes.dex */
public class C3519a implements C0913a.InterfaceC0914a {

    /* renamed from: a */
    private static int f11620a = 1;

    /* renamed from: b */
    private static int f11621b;

    /* renamed from: c */
    private static int f11622c;

    /* renamed from: com.tsf.shell.manager.l.a$a */
    /* loaded from: classes.dex */
    public static class C3522a implements C0913a.InterfaceC0914a {

        /* renamed from: a */
        public int f11626a;

        @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
        public void onActivityResult(int i, int i2, Intent intent) {
            if (i2 == -1 && i == this.f11626a) {
                C3519a.m2148a(intent, this);
            }
        }

        /* renamed from: a */
        public void mo1708a(AbstractC3208b abstractC3208b) {
        }

        /* renamed from: a */
        public C3560a mo1709a() {
            return C3566b.f11839a;
        }
    }

    /* renamed from: a */
    public void m2150a(Intent intent, float f, float f2) {
        f11621b = (int) f;
        f11622c = (int) f2;
        f11620a = Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) this);
    }

    /* renamed from: a */
    public void m2149a(Intent intent, float f, float f2, C3522a c3522a) {
        f11621b = (int) f;
        f11622c = (int) f2;
        c3522a.f11626a = Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) c3522a);
    }

    /* renamed from: a */
    public static void m2148a(final Intent intent, final C3522a c3522a) {
        C2234d.m6033a().m6031a(new Runnable() { // from class: com.tsf.shell.manager.l.a.1
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.l.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int m4121F = C3359a.f11094h.m4121F();
                        if (m4121F == -1) {
                            m4121F = C3359a.f11094h.m4025q();
                        }
                        Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
                        String stringExtra = intent.getStringExtra("android.intent.extra.shortcut.NAME");
                        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.shortcut.ICON");
                        if (intent2 != null && "android.intent.action.CALL_PRIVILEGED".equals(intent2.getAction())) {
                            intent2.setAction("android.intent.action.CALL");
                        }
                        if (parcelableExtra != null && (parcelableExtra instanceof Bitmap)) {
                            C3519a.m2144a(stringExtra, (Bitmap) parcelableExtra, null, intent2, -1, m4121F, C3519a.f11621b, C3519a.f11622c, c3522a);
                            return;
                        }
                        Parcelable parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                        if (parcelableExtra2 != null && (parcelableExtra2 instanceof Intent.ShortcutIconResource)) {
                            C3519a.m2144a(stringExtra, null, (Intent.ShortcutIconResource) parcelableExtra2, intent2, -1, m4121F, C3519a.f11621b, C3519a.f11622c, c3522a);
                        }
                    }
                });
            }
        });
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == f11620a) {
            m2148a(intent, (C3522a) null);
        }
    }

    /* renamed from: a */
    public static AbstractC3208b m2146a(ItemInfo itemInfo, boolean z) {
        return m2147a(itemInfo, C3566b.f11839a, z);
    }

    /* renamed from: a */
    public static AbstractC3208b m2147a(ItemInfo itemInfo, C3560a c3560a, boolean z) {
        switch (itemInfo.itemType) {
            case 2:
                return new C3222g((LauncherShortcutAppInfo) itemInfo, c3560a, C3222g.m3116a((LauncherShortcut3DInfo) ((LauncherShortcutAppInfo) itemInfo)), z);
            case 7:
                return m2142b(itemInfo, c3560a, z);
            default:
                return null;
        }
    }

    /* renamed from: b */
    private static AbstractC3208b m2142b(ItemInfo itemInfo, C3560a c3560a, boolean z) {
        C3386b.C3389a m2664b;
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) itemInfo;
        int intExtra = launcherShortcut3DInfo.intent != null ? launcherShortcut3DInfo.intent.getIntExtra("action", 0) : 0;
        switch (intExtra) {
            case 100:
            case 500:
                return new C3211c(launcherShortcut3DInfo, c3560a, z, intExtra);
            default:
                if (intExtra > 9999) {
                    return new C3225i(intExtra, launcherShortcut3DInfo, c3560a, z);
                }
                if (intExtra != 0 && (m2664b = C3386b.m2664b(intExtra)) != null && m2664b.f11197d != null) {
                    launcherShortcut3DInfo.themeResourceName = m2664b.f11197d;
                }
                return new C3219f(launcherShortcut3DInfo, c3560a, z);
        }
    }

    /* renamed from: a */
    public static void m2145a(AbstractC3208b abstractC3208b) {
        C2932g m4054d = C3359a.f11094h.m4054d(abstractC3208b.m3534K().screen);
        abstractC3208b.mo3458ac();
        m4054d.m4229a(abstractC3208b);
    }

    /* renamed from: a */
    public static LauncherShortcut3DInfo m2153a(int i) {
        switch (i) {
            case 2:
                return new LauncherShortcutAppInfo();
            case 7:
                return new LauncherShortcutStandardInfo();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static AbstractC3208b m2144a(String str, Bitmap bitmap, Intent.ShortcutIconResource shortcutIconResource, Intent intent, int i, int i2, float f, float f2, C3522a c3522a) {
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
        if (c3522a != null) {
            AbstractC3208b m2147a = m2147a((ItemInfo) launcherShortcutStandardInfo, c3522a.mo1709a(), true);
            c3522a.mo1708a(m2147a);
            return m2147a;
        }
        AbstractC3208b m2146a = m2146a((ItemInfo) launcherShortcutStandardInfo, true);
        m2145a(m2146a);
        return m2146a;
    }

    /* renamed from: a */
    public static AbstractC3208b m2151a(int i, C3560a c3560a) {
        return m2147a((ItemInfo) m2152a(i, -1, 0, 0.0f, 0.0f, false), c3560a, true);
    }

    /* renamed from: a */
    private static LauncherShortcutStandardInfo m2152a(int i, int i2, int i3, float f, float f2, boolean z) {
        C3386b.C3389a m2664b = C3386b.m2664b(i);
        C3386b.m2667a(m2664b);
        m2664b.f11198e.putExtra("action", i);
        if (m2664b.f11196c != 0) {
            m2664b.f11199f = new Intent.ShortcutIconResource();
            m2664b.f11199f.packageName = Home.m6177b().getPackageName();
            m2664b.f11199f.resourceName = Integer.toString(m2664b.f11196c);
        }
        LauncherShortcutStandardInfo launcherShortcutStandardInfo = new LauncherShortcutStandardInfo();
        launcherShortcutStandardInfo.title = m2664b.f11195b;
        launcherShortcutStandardInfo.intent = m2664b.f11198e;
        launcherShortcutStandardInfo.iconResource = m2664b.f11199f;
        launcherShortcutStandardInfo.themeResourceName = m2664b.f11197d;
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

    /* renamed from: a */
    public static void m2154a() {
        ArrayList arrayList = (ArrayList) C3444a.m2356c().f11113a.clone();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3377f c3377f = (C3377f) it.next();
            if (c3377f.m2694h() > 0) {
                c3377f.m2696f();
            }
        }
        arrayList.clear();
        HashMap hashMap = new HashMap();
        ShellModel.m2387a(hashMap);
        for (Integer num : hashMap.keySet()) {
            ItemInfo itemInfo = (ItemInfo) hashMap.get(num);
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo) && itemInfo.getWidget() != null && (itemInfo.getWidget() instanceof C3222g)) {
                C3222g c3222g = (C3222g) itemInfo.getWidget();
                if (c3222g.m3106bd() != null && c3222g.m3106bd().m2694h() > 0) {
                    ((LauncherShortcutAppInfo) itemInfo).reloadTexture();
                }
            }
        }
        hashMap.clear();
    }

    /* renamed from: b */
    public static void m2143b() {
        ArrayList arrayList = (ArrayList) C3444a.m2356c().f11113a.clone();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3377f) it.next()).m2696f();
        }
        arrayList.clear();
        HashMap hashMap = new HashMap();
        ShellModel.m2387a(hashMap);
        for (Integer num : hashMap.keySet()) {
            ItemInfo itemInfo = (ItemInfo) hashMap.get(num);
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo)) {
                ((LauncherShortcutAppInfo) itemInfo).reloadTexture();
            }
        }
        hashMap.clear();
        Iterator<C3112b> it2 = C3359a.f11109w.m2707d().m4815a().iterator();
        while (it2.hasNext()) {
            C3112b next = it2.next();
            if (next instanceof C3145b) {
                ((C3145b) next).m3366aQ();
            }
        }
    }
}
