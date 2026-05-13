package com.tsf.shell.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.tsf.shell.utils.b */
/* loaded from: classes.dex */
public class C4165b {

    /* renamed from: a */
    public static ArrayList<ComponentName> f13463a;

    /* renamed from: b */
    public static ArrayList<ComponentName> f13464b;

    /* renamed from: c */
    public static ArrayList<ComponentName> f13465c;

    /* renamed from: d */
    public static ArrayList<ComponentName> f13466d;

    /* renamed from: e */
    public static ArrayList<ComponentName> f13467e;

    /* renamed from: f */
    public static ArrayList<ComponentName> f13468f;

    /* renamed from: g */
    public static ArrayList<ComponentName> f13469g;

    /* renamed from: h */
    public static ArrayList<ComponentName> f13470h;

    /* renamed from: i */
    public static ArrayList<ComponentName> f13471i;

    /* renamed from: j */
    public static ArrayList<ComponentName> f13472j;

    /* renamed from: k */
    public static ArrayList<ComponentName> f13473k;

    /* renamed from: l */
    public static ArrayList<ComponentName> f13474l;

    /* renamed from: m */
    public static ArrayList<ComponentName> f13475m;

    /* renamed from: n */
    public static ArrayList<ComponentName> f13476n;

    /* renamed from: o */
    public static ArrayList<ComponentName> f13477o;

    /* renamed from: p */
    public static ArrayList<ComponentName> f13478p;

    /* renamed from: q */
    public static ArrayList<ArrayList<ComponentName>> f13479q;

    static {
        m707a();
    }

    /* renamed from: a */
    public static void m707a() {
        f13479q = new ArrayList<>();
        f13463a = new ArrayList<>();
        f13463a.add(new ComponentName("com.google.android.dialer", "com.google.android.dialer.extensions.GoogleDialtactsActivity"));
        f13463a.add(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsActivity"));
        f13463a.add(new ComponentName("com.android.contacts", "com.android.dialer.DialtactsActivity"));
        f13463a.add(new ComponentName("com.android.htcdialer", "com.android.htcdialer.Dialer"));
        f13463a.add(new ComponentName("com.android.htcdialer", "com.android.htcdialer.Dialer"));
        f13463a.add(new ComponentName("com.sec.android.app.dialertab", "com.sec.android.app.dialertab.DialerTabActivity"));
        f13463a.add(new ComponentName("com.sonyericsson.android.socialphonebook", "com.sonyericsson.android.socialphonebook.DialerEntryActivity"));
        f13463a.add(new ComponentName("com.android.htccontacts", "com.android.htccontacts.DialerTabActivity"));
        f13463a.add(new ComponentName("com.android.contacts", "com.android.contacts.activities.DialtactsActivity"));
        f13463a.add(new ComponentName("com.motorola.dialer", "com.motorola.dialer.DialtactsContactsEntryActivity"));
        f13463a.add(new ComponentName("com.android.contacts", "com.android.contacts.TwelveKeyDialer"));
        f13463a.add(new ComponentName("com.android.contacts", "com.android.contacts.activities.TwelveKeyDialer"));
        f13463a.add(new ComponentName("com.android.dialer", "com.android.dialer.DialtactsActivity"));
        f13463a.add(new ComponentName("com.android.htcdialer", "com.android.htcdialer.DialerActivity"));
        f13463a.add(new ComponentName("com.android.contacts", "com.android.contacts.CallDialtactsActivity"));
        f13463a.add(new ComponentName("com.zte.smartdialer", "com.zte.smartdialer.DialerApp"));
        f13463a.add(new ComponentName("com.android.contacts", "com.oppo.contacts.OppoDialtactsActivity"));
        f13463a.add(new ComponentName("com.yulong.android.contacts.dial", "com.yulong.android.contacts.dial.DialActivity"));
        f13463a.add(new ComponentName("com.android.contacts", "com.sec.android.app.contacts.DialerEntryActivity"));
        f13463a.add(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsActivity"));
        f13463a.add(new ComponentName("com.asus.contacts", "com.android.contacts.activities.DialtactsActivity"));
        f13463a.add(new ComponentName("com.lenovo.ideafriend", "com.lenovo.ideafriend.alias.DialtactsActivity"));
        f13479q.add(f13463a);
        f13464b = new ArrayList<>();
        f13464b.add(new ComponentName("com.android.mms", "com.android.mms.ui.MessagesActivity"));
        f13464b.add(new ComponentName("com.android.mms", "com.android.mms.ui.ConversationList"));
        f13464b.add(new ComponentName("com.sonyericsson.conversations", "com.sonyericsson.conversations.ui.ConversationListActivity"));
        f13464b.add(new ComponentName("com.android.mms", "com.android.mms.ui.MmsTabActivity"));
        f13464b.add(new ComponentName("com.motorola.blur.messaging", "com.motorola.blur.messaging.MessagingActivity"));
        f13464b.add(new ComponentName("com.android.mms", "com.android.mms.ui.ConversationComposer"));
        f13464b.add(new ComponentName("com.android.mms", "com.android.mms.ui.traditional.MessageLaunchActivity"));
        f13464b.add(new ComponentName("com.android.mms", "com.yulong.android.mms.ui.MmsMainListFormActivity"));
        f13464b.add(new ComponentName("com.google.android.talk", "com.google.android.talk.SigningInActivity"));
        f13464b.add(new ComponentName("com.asus.message", "com.android.mms.ui.ConversationList"));
        f13464b.add(new ComponentName("com.lenovo.ideafriend", "com.lenovo.ideafriend.alias.MmsActivity"));
        f13464b.add(new ComponentName("com.android.mms", "com.android.mms.ui.BootActivity"));
        f13479q.add(f13464b);
        f13478p = new ArrayList<>();
        f13478p.add(new ComponentName("com.google.android.talk", "com.google.android.talk.SigningInActivity"));
        f13469g = new ArrayList<>();
        f13469g.add(new ComponentName("com.android.chrome", "com.google.android.apps.chrome.Main"));
        f13469g.add(new ComponentName("com.android.browser", "com.android.browser.BrowserActivity"));
        f13469g.add(new ComponentName("com.google.android.browser", "com.android.browser.BrowserActivity"));
        f13469g.add(new ComponentName("com.sec.android.app.sbrowser", "com.sec.android.app.sbrowser.SBrowserMainActivity"));
        f13469g.add(new ComponentName("com.asus.browser", "com.android.browser.BrowserActivity"));
        f13469g.add(new ComponentName("com.lenovo.browser", "com.lenovo.browser.BrowserActivity"));
        f13479q.add(f13469g);
        f13466d = new ArrayList<>();
        f13466d.add(new ComponentName("com.google.android.GoogleCamera", "com.android.camera.CameraLauncher"));
        f13466d.add(new ComponentName("com.motorola.Camera2", "com.android.camera.CameraLauncher"));
        f13466d.add(new ComponentName("com.motorola.Camera", "com.motorola.Camera.Camera"));
        f13466d.add(new ComponentName("com.android.camera", "com.android.camera.CameraEntry"));
        f13466d.add(new ComponentName("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
        f13466d.add(new ComponentName("com.google.android.camera", "com.android.camera.Camera"));
        f13466d.add(new ComponentName("com.android.camera", "com.android.camera.Camera"));
        f13466d.add(new ComponentName("com.sonyericsson.android.camera", "com.sonyericsson.android.camera.CameraActivity"));
        f13466d.add(new ComponentName("com.miui.camera", "com.miui.camera.Camera"));
        f13466d.add(new ComponentName("com.samsung.camera", "com.samsung.camera.Camera"));
        f13466d.add(new ComponentName("com.lge.camera", "com.lge.camera.CameraApp"));
        f13466d.add(new ComponentName("com.google.android.gallery3d", "com.android.camera.CameraLauncher"));
        f13466d.add(new ComponentName("com.asus.camera", "com.asus.camera.CameraApp"));
        f13466d.add(new ComponentName("com.lenovo.scg", "com.lenovo.scg.camera.CameraLauncher"));
        f13479q.add(f13466d);
        f13471i = new ArrayList<>();
        f13471i.add(new ComponentName("com.cooliris.media", "com.cooliris.media.Gallery"));
        f13471i.add(new ComponentName("com.google.android.gallery3d", "com.cooliris.media.Gallery"));
        f13471i.add(new ComponentName("com.android.camera", "com.android.camera.GalleryPicker"));
        f13471i.add(new ComponentName("com.htc.album", "com.htc.album.AlbumMain.ActivityMainDropList"));
        f13471i.add(new ComponentName("com.htc.album", "com.htc.album.AlbumTabSwitchActivity"));
        f13471i.add(new ComponentName("com.google.android.gallery3d", "com.android.gallery3d.app.Gallery"));
        f13471i.add(new ComponentName("com.motorola.gallery", "com.motorola.gallery.TopScreen"));
        f13471i.add(new ComponentName("com.android.gallery", "com.android.gallery.ui.MainActivity"));
        f13471i.add(new ComponentName("com.sonyericsson.gallery", "com.sonyericsson.gallery.Gallery"));
        f13471i.add(new ComponentName("com.android.gallery", "com.android.camera.GalleryPicker"));
        f13471i.add(new ComponentName("com.android.gallery3d", "com.android.gallery3d.app.Gallery"));
        f13471i.add(new ComponentName("com.miui.gallery", "com.miui.gallery.app.Gallery"));
        f13471i.add(new ComponentName("com.sec.android.gallery3d", "com.sec.android.gallery3d.app.Gallery"));
        f13471i.add(new ComponentName("com.asus.ephoto", "com.asus.ephoto.app.EPhotoActivity"));
        f13479q.add(f13471i);
        f13465c = new ArrayList<>();
        f13465c.add(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
        f13465c.add(new ComponentName("com.android.htccontacts", "com.android.htccontacts.ContactsTabActivity"));
        f13465c.add(new ComponentName("com.android.contacts", "com.sec.android.app.contacts.PhoneBookTopMenuActivity"));
        f13465c.add(new ComponentName("com.sonyericsson.android.socialphonebook", "com.sonyericsson.android.socialphonebook.SocialPhonebookActivity"));
        f13465c.add(new ComponentName("com.android.htccontacts", "com.android.htccontacts.BrowseLayerCarouselActivity"));
        f13465c.add(new ComponentName("com.android.contacts", "com.android.contacts.activities.PeopleActivity"));
        f13465c.add(new ComponentName("com.motorola.blur.contacts", "com.motorola.blur.contacts.ViewIdentitiesFacetActivity"));
        f13465c.add(new ComponentName("com.sonyericsson.android.socialphonebook", "com.sonyericsson.android.socialphonebook.LaunchActivity"));
        f13479q.add(f13465c);
        f13473k = new ArrayList<>();
        f13473k.add(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
        f13479q.add(f13473k);
        f13470h = new ArrayList<>();
        f13470h.add(new ComponentName("com.android.music", "com.android.music.MusicBrowserActivity"));
        f13470h.add(new ComponentName("com.htc.music", "com.htc.music.HtcMusic"));
        f13470h.add(new ComponentName("com.sec.android.app.music", "com.sec.android.app.music.list.activity.MpMainTabActivity"));
        f13470h.add(new ComponentName("com.android.music", "com.android.music.MusicBrowserActivity"));
        f13470h.add(new ComponentName("com.android.music", "com.android.music.list.activity.MpMainTabActivity"));
        f13470h.add(new ComponentName("com.htc.music", "com.htc.music.browserlayer.MusicBrowserTabActivity"));
        f13470h.add(new ComponentName("com.google.android.music", "com.android.music.activitymanagement.TopLevelActivity"));
        f13470h.add(new ComponentName("com.motorola.cmp", "com.motorola.cmp.HomeListActivity"));
        f13470h.add(new ComponentName("com.miui.player", "com.miui.player.drawerActivityGroup.MainActivityGroup"));
        f13470h.add(new ComponentName("com.sonyericsson.music", "com.sonyericsson.music.PlayerActivity"));
        f13470h.add(new ComponentName("com.samsung.sec.android.MusicPlayer", "com.samsung.sec.android.MusicPlayer.activity.MusicPlayerList"));
        f13470h.add(new ComponentName("com.sec.android.app.music", "com.sec.android.app.music.MusicBrowserTabActivity"));
        f13470h.add(new ComponentName("com.miui.player", "com.miui.player.ui.MusicBrowserActivity"));
        f13470h.add(new ComponentName("com.android.mediacenter", "com.android.mediacenter.ListBrowserActivity"));
        f13470h.add(new ComponentName("com.sec.android.app.music", "com.sec.android.app.music.MusicActionTabActivity"));
        f13479q.add(f13470h);
        f13468f = new ArrayList<>();
        f13468f.add(new ComponentName("com.android.settings", "com.android.settings.Settings"));
        f13468f.add(new ComponentName("com.android.settings", "com.android.settings.framework.activity.HtcSettings"));
        f13479q.add(f13468f);
        f13474l = new ArrayList<>();
        f13474l.add(new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity"));
        f13474l.add(new ComponentName("com.htc.calendar", "com.htc.calendar.LaunchActivity"));
        f13474l.add(new ComponentName("com.google.android.calendar", "com.android.calendar.LaunchActivity"));
        f13474l.add(new ComponentName("com.google.android.calendar", "com.android.calendar.AllInOneActivity"));
        f13474l.add(new ComponentName("com.android.calendar", "com.android.calendar.AllInOneActivity"));
        f13479q.add(f13474l);
        f13467e = new ArrayList<>();
        f13467e.add(new ComponentName("com.android.alarmclock", "com.android.alarmclock.AlarmClock"));
        f13467e.add(new ComponentName("com.htc.android.worldclock", "com.htc.android.worldclock.WorldClockTabControl"));
        f13467e.add(new ComponentName("com.sec.android.app.clockpackage", "com.sec.android.app.clockpackage.ClockPackage"));
        f13467e.add(new ComponentName("com.google.android.deskclock", "com.android.deskclock.DeskClock"));
        f13467e.add(new ComponentName("com.android.deskclock", "com.android.deskclock.DeskClock"));
        f13467e.add(new ComponentName("com.motorola.blur.alarmclock", "com.motorola.blur.alarmclock.AlarmClock"));
        f13467e.add(new ComponentName("com.android.deskclock", "com.android.deskclock.DeskClockTabActivity"));
        f13479q.add(f13467e);
        f13475m = new ArrayList<>();
        f13475m.add(new ComponentName("com.google.android.gm", "com.google.android.gm.ConversationListActivityGmail"));
        f13479q.add(f13475m);
        f13476n = new ArrayList<>();
        f13476n.add(new ComponentName("com.android.email", "com.android.email.activity.Welcome"));
        f13476n.add(new ComponentName("com.htc.android.mail", "com.htc.android.mail.MailListTab"));
        f13476n.add(new ComponentName("com.google.android.email", "com.android.email.activity.Welcome"));
        f13476n.add(new ComponentName("com.motorola.blur.email", "com.motorola.blur.email.mailbox.ViewFolderActivity"));
        f13479q.add(f13476n);
        f13472j = new ArrayList<>();
        f13472j.add(new ComponentName("com.android.vending", "com.android.vending.AssetBrowserActivity"));
        f13479q.add(f13472j);
        f13477o = new ArrayList<>();
        f13477o.add(new ComponentName("com.whatsapp", "com.whatsapp.Main"));
        f13479q.add(f13477o);
    }

    /* renamed from: a */
    public static boolean m705a(ComponentName componentName) {
        return m704a(componentName, f13463a);
    }

    /* renamed from: b */
    public static boolean m702b(ComponentName componentName) {
        return m704a(componentName, f13464b);
    }

    /* renamed from: c */
    public static boolean m701c(ComponentName componentName) {
        return m704a(componentName, f13477o);
    }

    /* renamed from: d */
    public static boolean m700d(ComponentName componentName) {
        return m704a(componentName, f13475m);
    }

    /* renamed from: e */
    public static boolean m699e(ComponentName componentName) {
        return m704a(componentName, f13478p);
    }

    /* renamed from: a */
    public static ArrayList<C3222g> m706a(int i) {
        C3222g m3109ba;
        ArrayList<C3222g> arrayList = new ArrayList<>();
        Iterator<ComponentName> it = m703b(i).iterator();
        while (it.hasNext()) {
            C3222g m2747a = C3359a.f11109w.m2716a().m2747a(it.next());
            if (m2747a != null && (m3109ba = m2747a.m3109ba()) != null) {
                arrayList.add(m3109ba);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static ArrayList<ComponentName> m703b(int i) {
        int i2 = 0;
        ArrayList<ComponentName> arrayList = new ArrayList<>();
        Iterator<ArrayList<ComponentName>> it = f13479q.iterator();
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                break;
            }
            Iterator<ComponentName> it2 = it.next().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i2 = i3;
                    break;
                }
                ComponentName next = it2.next();
                if (m698f(next)) {
                    arrayList.add(next);
                    i2 = i3 + 1;
                    break;
                }
            }
            if (i2 >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private static boolean m698f(ComponentName componentName) {
        PackageManager packageManager = C0853a.m10856d().getPackageManager();
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> list = null;
        try {
            list = packageManager.queryIntentActivities(intent, 0);
        } catch (Exception e) {
        }
        if (list != null) {
            for (ResolveInfo resolveInfo : list) {
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

    /* renamed from: a */
    private static boolean m704a(ComponentName componentName, ArrayList<ComponentName> arrayList) {
        Iterator<ComponentName> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(componentName)) {
                return true;
            }
        }
        return false;
    }
}
