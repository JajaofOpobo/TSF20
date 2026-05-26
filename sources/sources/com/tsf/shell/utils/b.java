package com.tsf.shell.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    public static ArrayList<ComponentName> a;
    public static ArrayList<ComponentName> b;
    public static ArrayList<ComponentName> c;
    public static ArrayList<ComponentName> d;
    public static ArrayList<ComponentName> e;
    public static ArrayList<ComponentName> f;
    public static ArrayList<ComponentName> g;
    public static ArrayList<ComponentName> h;
    public static ArrayList<ComponentName> i;
    public static ArrayList<ComponentName> j;
    public static ArrayList<ComponentName> k;
    public static ArrayList<ComponentName> l;
    public static ArrayList<ComponentName> m;
    public static ArrayList<ComponentName> n;
    public static ArrayList<ComponentName> o;
    public static ArrayList<ComponentName> p;
    public static ArrayList<ArrayList<ComponentName>> q;

    static {
        a();
    }

    public static void a() {
        q = new ArrayList<>();
        a = new ArrayList<>();
        a.add(new ComponentName("com.google.android.dialer", "com.google.android.dialer.extensions.GoogleDialtactsActivity"));
        a.add(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsActivity"));
        a.add(new ComponentName("com.android.contacts", "com.android.dialer.DialtactsActivity"));
        a.add(new ComponentName("com.android.htcdialer", "com.android.htcdialer.Dialer"));
        a.add(new ComponentName("com.android.htcdialer", "com.android.htcdialer.Dialer"));
        a.add(new ComponentName("com.sec.android.app.dialertab", "com.sec.android.app.dialertab.DialerTabActivity"));
        a.add(new ComponentName("com.sonyericsson.android.socialphonebook", "com.sonyericsson.android.socialphonebook.DialerEntryActivity"));
        a.add(new ComponentName("com.android.htccontacts", "com.android.htccontacts.DialerTabActivity"));
        a.add(new ComponentName("com.android.contacts", "com.android.contacts.activities.DialtactsActivity"));
        a.add(new ComponentName("com.motorola.dialer", "com.motorola.dialer.DialtactsContactsEntryActivity"));
        a.add(new ComponentName("com.android.contacts", "com.android.contacts.TwelveKeyDialer"));
        a.add(new ComponentName("com.android.contacts", "com.android.contacts.activities.TwelveKeyDialer"));
        a.add(new ComponentName("com.android.dialer", "com.android.dialer.DialtactsActivity"));
        a.add(new ComponentName("com.android.htcdialer", "com.android.htcdialer.DialerActivity"));
        a.add(new ComponentName("com.android.contacts", "com.android.contacts.CallDialtactsActivity"));
        a.add(new ComponentName("com.zte.smartdialer", "com.zte.smartdialer.DialerApp"));
        a.add(new ComponentName("com.android.contacts", "com.oppo.contacts.OppoDialtactsActivity"));
        a.add(new ComponentName("com.yulong.android.contacts.dial", "com.yulong.android.contacts.dial.DialActivity"));
        a.add(new ComponentName("com.android.contacts", "com.sec.android.app.contacts.DialerEntryActivity"));
        a.add(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsActivity"));
        a.add(new ComponentName("com.asus.contacts", "com.android.contacts.activities.DialtactsActivity"));
        a.add(new ComponentName("com.lenovo.ideafriend", "com.lenovo.ideafriend.alias.DialtactsActivity"));
        q.add(a);
        b = new ArrayList<>();
        b.add(new ComponentName("com.android.mms", "com.android.mms.ui.MessagesActivity"));
        b.add(new ComponentName("com.android.mms", "com.android.mms.ui.ConversationList"));
        b.add(new ComponentName("com.sonyericsson.conversations", "com.sonyericsson.conversations.ui.ConversationListActivity"));
        b.add(new ComponentName("com.android.mms", "com.android.mms.ui.MmsTabActivity"));
        b.add(new ComponentName("com.motorola.blur.messaging", "com.motorola.blur.messaging.MessagingActivity"));
        b.add(new ComponentName("com.android.mms", "com.android.mms.ui.ConversationComposer"));
        b.add(new ComponentName("com.android.mms", "com.android.mms.ui.traditional.MessageLaunchActivity"));
        b.add(new ComponentName("com.android.mms", "com.yulong.android.mms.ui.MmsMainListFormActivity"));
        b.add(new ComponentName("com.google.android.talk", "com.google.android.talk.SigningInActivity"));
        b.add(new ComponentName("com.asus.message", "com.android.mms.ui.ConversationList"));
        b.add(new ComponentName("com.lenovo.ideafriend", "com.lenovo.ideafriend.alias.MmsActivity"));
        b.add(new ComponentName("com.android.mms", "com.android.mms.ui.BootActivity"));
        q.add(b);
        p = new ArrayList<>();
        p.add(new ComponentName("com.google.android.talk", "com.google.android.talk.SigningInActivity"));
        g = new ArrayList<>();
        g.add(new ComponentName("com.android.chrome", "com.google.android.apps.chrome.Main"));
        g.add(new ComponentName("com.android.browser", "com.android.browser.BrowserActivity"));
        g.add(new ComponentName("com.google.android.browser", "com.android.browser.BrowserActivity"));
        g.add(new ComponentName("com.sec.android.app.sbrowser", "com.sec.android.app.sbrowser.SBrowserMainActivity"));
        g.add(new ComponentName("com.asus.browser", "com.android.browser.BrowserActivity"));
        g.add(new ComponentName("com.lenovo.browser", "com.lenovo.browser.BrowserActivity"));
        q.add(g);
        d = new ArrayList<>();
        d.add(new ComponentName("com.google.android.GoogleCamera", "com.android.camera.CameraLauncher"));
        d.add(new ComponentName("com.motorola.Camera2", "com.android.camera.CameraLauncher"));
        d.add(new ComponentName("com.motorola.Camera", "com.motorola.Camera.Camera"));
        d.add(new ComponentName("com.android.camera", "com.android.camera.CameraEntry"));
        d.add(new ComponentName("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
        d.add(new ComponentName("com.google.android.camera", "com.android.camera.Camera"));
        d.add(new ComponentName("com.android.camera", "com.android.camera.Camera"));
        d.add(new ComponentName("com.sonyericsson.android.camera", "com.sonyericsson.android.camera.CameraActivity"));
        d.add(new ComponentName("com.miui.camera", "com.miui.camera.Camera"));
        d.add(new ComponentName("com.samsung.camera", "com.samsung.camera.Camera"));
        d.add(new ComponentName("com.lge.camera", "com.lge.camera.CameraApp"));
        d.add(new ComponentName("com.google.android.gallery3d", "com.android.camera.CameraLauncher"));
        d.add(new ComponentName("com.asus.camera", "com.asus.camera.CameraApp"));
        d.add(new ComponentName("com.lenovo.scg", "com.lenovo.scg.camera.CameraLauncher"));
        q.add(d);
        i = new ArrayList<>();
        i.add(new ComponentName("com.cooliris.media", "com.cooliris.media.Gallery"));
        i.add(new ComponentName("com.google.android.gallery3d", "com.cooliris.media.Gallery"));
        i.add(new ComponentName("com.android.camera", "com.android.camera.GalleryPicker"));
        i.add(new ComponentName("com.htc.album", "com.htc.album.AlbumMain.ActivityMainDropList"));
        i.add(new ComponentName("com.htc.album", "com.htc.album.AlbumTabSwitchActivity"));
        i.add(new ComponentName("com.google.android.gallery3d", "com.android.gallery3d.app.Gallery"));
        i.add(new ComponentName("com.motorola.gallery", "com.motorola.gallery.TopScreen"));
        i.add(new ComponentName("com.android.gallery", "com.android.gallery.ui.MainActivity"));
        i.add(new ComponentName("com.sonyericsson.gallery", "com.sonyericsson.gallery.Gallery"));
        i.add(new ComponentName("com.android.gallery", "com.android.camera.GalleryPicker"));
        i.add(new ComponentName("com.android.gallery3d", "com.android.gallery3d.app.Gallery"));
        i.add(new ComponentName("com.miui.gallery", "com.miui.gallery.app.Gallery"));
        i.add(new ComponentName("com.sec.android.gallery3d", "com.sec.android.gallery3d.app.Gallery"));
        i.add(new ComponentName("com.asus.ephoto", "com.asus.ephoto.app.EPhotoActivity"));
        q.add(i);
        c = new ArrayList<>();
        c.add(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
        c.add(new ComponentName("com.android.htccontacts", "com.android.htccontacts.ContactsTabActivity"));
        c.add(new ComponentName("com.android.contacts", "com.sec.android.app.contacts.PhoneBookTopMenuActivity"));
        c.add(new ComponentName("com.sonyericsson.android.socialphonebook", "com.sonyericsson.android.socialphonebook.SocialPhonebookActivity"));
        c.add(new ComponentName("com.android.htccontacts", "com.android.htccontacts.BrowseLayerCarouselActivity"));
        c.add(new ComponentName("com.android.contacts", "com.android.contacts.activities.PeopleActivity"));
        c.add(new ComponentName("com.motorola.blur.contacts", "com.motorola.blur.contacts.ViewIdentitiesFacetActivity"));
        c.add(new ComponentName("com.sonyericsson.android.socialphonebook", "com.sonyericsson.android.socialphonebook.LaunchActivity"));
        q.add(c);
        k = new ArrayList<>();
        k.add(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
        q.add(k);
        h = new ArrayList<>();
        h.add(new ComponentName("com.android.music", "com.android.music.MusicBrowserActivity"));
        h.add(new ComponentName("com.htc.music", "com.htc.music.HtcMusic"));
        h.add(new ComponentName("com.sec.android.app.music", "com.sec.android.app.music.list.activity.MpMainTabActivity"));
        h.add(new ComponentName("com.android.music", "com.android.music.MusicBrowserActivity"));
        h.add(new ComponentName("com.android.music", "com.android.music.list.activity.MpMainTabActivity"));
        h.add(new ComponentName("com.htc.music", "com.htc.music.browserlayer.MusicBrowserTabActivity"));
        h.add(new ComponentName("com.google.android.music", "com.android.music.activitymanagement.TopLevelActivity"));
        h.add(new ComponentName("com.motorola.cmp", "com.motorola.cmp.HomeListActivity"));
        h.add(new ComponentName("com.miui.player", "com.miui.player.drawerActivityGroup.MainActivityGroup"));
        h.add(new ComponentName("com.sonyericsson.music", "com.sonyericsson.music.PlayerActivity"));
        h.add(new ComponentName("com.samsung.sec.android.MusicPlayer", "com.samsung.sec.android.MusicPlayer.activity.MusicPlayerList"));
        h.add(new ComponentName("com.sec.android.app.music", "com.sec.android.app.music.MusicBrowserTabActivity"));
        h.add(new ComponentName("com.miui.player", "com.miui.player.ui.MusicBrowserActivity"));
        h.add(new ComponentName("com.android.mediacenter", "com.android.mediacenter.ListBrowserActivity"));
        h.add(new ComponentName("com.sec.android.app.music", "com.sec.android.app.music.MusicActionTabActivity"));
        q.add(h);
        f = new ArrayList<>();
        f.add(new ComponentName("com.android.settings", "com.android.settings.Settings"));
        f.add(new ComponentName("com.android.settings", "com.android.settings.framework.activity.HtcSettings"));
        q.add(f);
        l = new ArrayList<>();
        l.add(new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity"));
        l.add(new ComponentName("com.htc.calendar", "com.htc.calendar.LaunchActivity"));
        l.add(new ComponentName("com.google.android.calendar", "com.android.calendar.LaunchActivity"));
        l.add(new ComponentName("com.google.android.calendar", "com.android.calendar.AllInOneActivity"));
        l.add(new ComponentName("com.android.calendar", "com.android.calendar.AllInOneActivity"));
        q.add(l);
        e = new ArrayList<>();
        e.add(new ComponentName("com.android.alarmclock", "com.android.alarmclock.AlarmClock"));
        e.add(new ComponentName("com.htc.android.worldclock", "com.htc.android.worldclock.WorldClockTabControl"));
        e.add(new ComponentName("com.sec.android.app.clockpackage", "com.sec.android.app.clockpackage.ClockPackage"));
        e.add(new ComponentName("com.google.android.deskclock", "com.android.deskclock.DeskClock"));
        e.add(new ComponentName("com.android.deskclock", "com.android.deskclock.DeskClock"));
        e.add(new ComponentName("com.motorola.blur.alarmclock", "com.motorola.blur.alarmclock.AlarmClock"));
        e.add(new ComponentName("com.android.deskclock", "com.android.deskclock.DeskClockTabActivity"));
        q.add(e);
        m = new ArrayList<>();
        m.add(new ComponentName("com.google.android.gm", "com.google.android.gm.ConversationListActivityGmail"));
        q.add(m);
        n = new ArrayList<>();
        n.add(new ComponentName("com.android.email", "com.android.email.activity.Welcome"));
        n.add(new ComponentName("com.htc.android.mail", "com.htc.android.mail.MailListTab"));
        n.add(new ComponentName("com.google.android.email", "com.android.email.activity.Welcome"));
        n.add(new ComponentName("com.motorola.blur.email", "com.motorola.blur.email.mailbox.ViewFolderActivity"));
        q.add(n);
        j = new ArrayList<>();
        j.add(new ComponentName("com.android.vending", "com.android.vending.AssetBrowserActivity"));
        q.add(j);
        o = new ArrayList<>();
        o.add(new ComponentName("com.whatsapp", "com.whatsapp.Main"));
        q.add(o);
    }

    public static boolean a(ComponentName componentName) {
        return a(componentName, a);
    }

    public static boolean b(ComponentName componentName) {
        return a(componentName, b);
    }

    public static boolean c(ComponentName componentName) {
        return a(componentName, o);
    }

    public static boolean d(ComponentName componentName) {
        return a(componentName, m);
    }

    public static boolean e(ComponentName componentName) {
        return a(componentName, p);
    }

    public static ArrayList<com.tsf.shell.f.i.b.e.g> a(int i2) {
        com.tsf.shell.f.i.b.e.g gVarBa;
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayList = new ArrayList<>();
        Iterator<ComponentName> it = b(i2).iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g gVarA = com.tsf.shell.manager.a.w.a().a(it.next());
            if (gVarA != null && (gVarBa = gVarA.ba()) != null) {
                arrayList.add(gVarBa);
            }
        }
        return arrayList;
    }

    public static ArrayList<ComponentName> b(int i2) {
        int i3 = 0;
        ArrayList<ComponentName> arrayList = new ArrayList<>();
        Iterator<ArrayList<ComponentName>> it = q.iterator();
        do {
            int i4 = i3;
            if (!it.hasNext()) {
                break;
            }
            Iterator<ComponentName> it2 = it.next().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i3 = i4;
                    break;
                }
                ComponentName next = it2.next();
                if (f(next)) {
                    arrayList.add(next);
                    i3 = i4 + 1;
                    break;
                }
            }
        } while (i3 < i2);
        return arrayList;
    }

    private static boolean f(ComponentName componentName) {
        PackageManager packageManager = com.censivn.C3DEngine.a.d().getPackageManager();
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = null;
        try {
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        } catch (Exception e2) {
        }
        if (listQueryIntentActivities != null) {
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                String str = resolveInfo.activityInfo.packageName;
                String str2 = resolveInfo.activityInfo.name;
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                if (str.equals(packageName) && str2.equals(className)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(ComponentName componentName, ArrayList<ComponentName> arrayList) {
        Iterator<ComponentName> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(componentName)) {
                return true;
            }
        }
        return false;
    }
}
