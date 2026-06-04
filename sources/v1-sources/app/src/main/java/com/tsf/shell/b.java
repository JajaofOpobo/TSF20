package com.tsf.shell;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.TelephonyManager;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b {
    public static String a = "0";
    public static String b = "1";
    public static String c = "2";
    public static String d = "3";
    private static b e;
    private g f;
    private ArrayList g;

    public b() {
        e = this;
        com.tsf.shell.g.b.o = new ArrayList();
        ArrayList arrayList = new ArrayList();
        com.tsf.shell.g.b.a = arrayList;
        arrayList.add("com.android.contacts/com.android.contacts.DialtactsActivity");
        com.tsf.shell.g.b.a.add("com.android.htcdialer/com.android.htcdialer.Dialer");
        com.tsf.shell.g.b.a.add("com.android.htcdialer/com.android.htcdialer.Dialer");
        com.tsf.shell.g.b.a.add("com.sec.android.app.dialertab/com.sec.android.app.dialertab.DialerTabActivity");
        com.tsf.shell.g.b.a.add("com.sonyericsson.android.socialphonebook/com.sonyericsson.android.socialphonebook.DialerEntryActivity");
        com.tsf.shell.g.b.a.add("com.android.htccontacts/com.android.htccontacts.DialerTabActivity");
        com.tsf.shell.g.b.a.add("com.android.contacts/com.android.contacts.activities.DialtactsActivity");
        com.tsf.shell.g.b.a.add("com.motorola.dialer/com.motorola.dialer.DialtactsContactsEntryActivity");
        com.tsf.shell.g.b.a.add("com.android.contacts/com.android.contacts.TwelveKeyDialer");
        com.tsf.shell.g.b.a.add("com.android.contacts/com.android.contacts.activities.TwelveKeyDialer");
        com.tsf.shell.g.b.a.add("com.android.dialer/com.android.dialer.DialtactsActivity");
        com.tsf.shell.g.b.a.add("com.android.htcdialer/com.android.htcdialer.DialerActivity");
        com.tsf.shell.g.b.a.add("com.android.contacts/com.android.contacts.CallDialtactsActivity");
        com.tsf.shell.g.b.a.add("com.zte.smartdialer/com.zte.smartdialer.DialerApp");
        com.tsf.shell.g.b.a.add("com.android.contacts/com.oppo.contacts.OppoDialtactsActivity");
        com.tsf.shell.g.b.a.add("com.yulong.android.contacts.dial/com.yulong.android.contacts.dial.DialActivity");
        com.tsf.shell.g.b.a.add("com.android.contacts/com.sec.android.app.contacts.DialerEntryActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.a);
        ArrayList arrayList2 = new ArrayList();
        com.tsf.shell.g.b.b = arrayList2;
        arrayList2.add("com.android.mms/com.android.mms.ui.ConversationList");
        com.tsf.shell.g.b.b.add("com.sonyericsson.conversations/com.sonyericsson.conversations.ui.ConversationListActivity");
        com.tsf.shell.g.b.b.add("com.android.mms/com.android.mms.ui.MmsTabActivity");
        com.tsf.shell.g.b.b.add("com.motorola.blur.messaging/com.motorola.blur.messaging.MessagingActivity");
        com.tsf.shell.g.b.b.add("com.android.mms/com.android.mms.ui.ConversationComposer");
        com.tsf.shell.g.b.b.add("com.android.mms/com.android.mms.ui.traditional.MessageLaunchActivity");
        com.tsf.shell.g.b.b.add("\tcom.android.mms/com.yulong.android.mms.ui.MmsMainListFormActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.b);
        ArrayList arrayList3 = new ArrayList();
        com.tsf.shell.g.b.c = arrayList3;
        arrayList3.add("com.android.contacts/com.android.contacts.DialtactsContactsEntryActivity");
        com.tsf.shell.g.b.c.add("com.android.htccontacts/com.android.htccontacts.ContactsTabActivity");
        com.tsf.shell.g.b.c.add("com.android.contacts/com.sec.android.app.contacts.PhoneBookTopMenuActivity");
        com.tsf.shell.g.b.c.add("com.sonyericsson.android.socialphonebook/com.sonyericsson.android.socialphonebook.SocialPhonebookActivity");
        com.tsf.shell.g.b.c.add("com.android.htccontacts/com.android.htccontacts.BrowseLayerCarouselActivity");
        com.tsf.shell.g.b.c.add("com.android.contacts/com.android.contacts.activities.PeopleActivity");
        com.tsf.shell.g.b.c.add("com.motorola.blur.contacts/com.motorola.blur.contacts.ViewIdentitiesFacetActivity");
        com.tsf.shell.g.b.c.add("com.sonyericsson.android.socialphonebook/com.sonyericsson.android.socialphonebook.LaunchActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.c);
        ArrayList arrayList4 = new ArrayList();
        com.tsf.shell.g.b.k = arrayList4;
        arrayList4.add("com.google.android.apps.maps/com.google.android.maps.MapsActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.k);
        ArrayList arrayList5 = new ArrayList();
        com.tsf.shell.g.b.g = arrayList5;
        arrayList5.add("com.android.chrome/com.google.android.apps.chrome.Main");
        com.tsf.shell.g.b.g.add("com.android.browser/com.android.browser.BrowserActivity");
        com.tsf.shell.g.b.g.add("com.google.android.browser/com.android.browser.BrowserActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.g);
        ArrayList arrayList6 = new ArrayList();
        com.tsf.shell.g.b.i = arrayList6;
        arrayList6.add("com.cooliris.media/com.cooliris.media.Gallery");
        com.tsf.shell.g.b.i.add("com.google.android.gallery3d/com.cooliris.media.Gallery");
        com.tsf.shell.g.b.i.add("com.android.camera/com.android.camera.GalleryPicker");
        com.tsf.shell.g.b.i.add("com.htc.album/com.htc.album.AlbumMain.ActivityMainDropList");
        com.tsf.shell.g.b.i.add("com.htc.album/com.htc.album.AlbumTabSwitchActivity");
        com.tsf.shell.g.b.i.add("com.google.android.gallery3d/com.android.gallery3d.app.Gallery");
        com.tsf.shell.g.b.i.add("com.motorola.gallery/com.motorola.gallery.TopScreen");
        com.tsf.shell.g.b.i.add("com.android.gallery/com.android.gallery.ui.MainActivity");
        com.tsf.shell.g.b.i.add("com.sonyericsson.gallery/com.sonyericsson.gallery.Gallery");
        com.tsf.shell.g.b.i.add("com.android.gallery/com.android.camera.GalleryPicker");
        com.tsf.shell.g.b.i.add("com.android.gallery3d/com.android.gallery3d.app.Gallery");
        com.tsf.shell.g.b.i.add("com.miui.gallery/com.miui.gallery.app.Gallery");
        com.tsf.shell.g.b.i.add("com.sec.android.gallery3d/com.sec.android.gallery3d.app.Gallery");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.i);
        ArrayList arrayList7 = new ArrayList();
        com.tsf.shell.g.b.h = arrayList7;
        arrayList7.add("com.android.music/com.android.music.MusicBrowserActivity");
        com.tsf.shell.g.b.h.add("com.htc.music/com.htc.music.HtcMusic");
        com.tsf.shell.g.b.h.add("com.sec.android.app.music/com.sec.android.app.music.list.activity.MpMainTabActivity");
        com.tsf.shell.g.b.h.add("com.android.music/com.android.music.MusicBrowserActivity");
        com.tsf.shell.g.b.h.add("com.android.music/com.android.music.list.activity.MpMainTabActivity");
        com.tsf.shell.g.b.h.add("com.htc.music/com.htc.music.browserlayer.MusicBrowserTabActivity");
        com.tsf.shell.g.b.h.add("com.google.android.music/com.android.music.activitymanagement.TopLevelActivity");
        com.tsf.shell.g.b.h.add("com.motorola.cmp/com.motorola.cmp.HomeListActivity");
        com.tsf.shell.g.b.h.add("com.miui.player/com.miui.player.drawerActivityGroup.MainActivityGroup");
        com.tsf.shell.g.b.h.add("com.sonyericsson.music/com.sonyericsson.music.PlayerActivity");
        com.tsf.shell.g.b.h.add("com.samsung.sec.android.MusicPlayer/com.samsung.sec.android.MusicPlayer.activity.MusicPlayerList");
        com.tsf.shell.g.b.h.add("com.sec.android.app.music/com.sec.android.app.music.MusicBrowserTabActivity");
        com.tsf.shell.g.b.h.add("com.miui.player/com.miui.player.ui.MusicBrowserActivity");
        com.tsf.shell.g.b.h.add("com.android.mediacenter/com.android.mediacenter.ListBrowserActivity");
        com.tsf.shell.g.b.h.add("com.sec.android.app.music/com.sec.android.app.music.MusicActionTabActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.h);
        ArrayList arrayList8 = new ArrayList();
        com.tsf.shell.g.b.d = arrayList8;
        arrayList8.add("com.motorola.Camera/com.motorola.Camera.Camera");
        com.tsf.shell.g.b.d.add("com.android.camera/com.android.camera.CameraEntry");
        com.tsf.shell.g.b.d.add("com.sec.android.app.camera/com.sec.android.app.camera.Camera");
        com.tsf.shell.g.b.d.add("com.google.android.camera/com.android.camera.Camera");
        com.tsf.shell.g.b.d.add("com.android.camera/com.android.camera.Camera");
        com.tsf.shell.g.b.d.add("com.sonyericsson.android.camera/com.sonyericsson.android.camera.CameraActivity");
        com.tsf.shell.g.b.d.add("com.miui.camera/com.miui.camera.Camera");
        com.tsf.shell.g.b.d.add("com.samsung.camera/com.samsung.camera.Camera");
        com.tsf.shell.g.b.d.add("com.lge.camera/com.lge.camera.CameraApp");
        com.tsf.shell.g.b.d.add("com.google.android.gallery3d/com.android.camera.CameraLauncher");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.d);
        ArrayList arrayList9 = new ArrayList();
        com.tsf.shell.g.b.f = arrayList9;
        arrayList9.add("com.android.settings/com.android.settings.Settings");
        com.tsf.shell.g.b.f.add("com.android.settings/com.android.settings.framework.activity.HtcSettings");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.f);
        ArrayList arrayList10 = new ArrayList();
        com.tsf.shell.g.b.l = arrayList10;
        arrayList10.add("com.android.calendar/com.android.calendar.LaunchActivity");
        com.tsf.shell.g.b.l.add("com.htc.calendar/com.htc.calendar.LaunchActivity");
        com.tsf.shell.g.b.l.add("com.google.android.calendar/com.android.calendar.LaunchActivity");
        com.tsf.shell.g.b.l.add("com.google.android.calendar/com.android.calendar.AllInOneActivity");
        com.tsf.shell.g.b.l.add("com.android.calendar/com.android.calendar.AllInOneActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.l);
        ArrayList arrayList11 = new ArrayList();
        com.tsf.shell.g.b.e = arrayList11;
        arrayList11.add("com.android.alarmclock/com.android.alarmclock.AlarmClock");
        com.tsf.shell.g.b.e.add("com.htc.android.worldclock/com.htc.android.worldclock.WorldClockTabControl");
        com.tsf.shell.g.b.e.add("com.sec.android.app.clockpackage/com.sec.android.app.clockpackage.ClockPackage");
        com.tsf.shell.g.b.e.add("com.google.android.deskclock/com.android.deskclock.DeskClock");
        com.tsf.shell.g.b.e.add("com.android.deskclock/com.android.deskclock.DeskClock");
        com.tsf.shell.g.b.e.add("com.motorola.blur.alarmclock/com.motorola.blur.alarmclock.AlarmClock");
        com.tsf.shell.g.b.e.add("com.android.deskclock/com.android.deskclock.DeskClockTabActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.e);
        ArrayList arrayList12 = new ArrayList();
        com.tsf.shell.g.b.m = arrayList12;
        arrayList12.add("com.google.android.gm/com.google.android.gm.ConversationListActivityGmail");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.m);
        ArrayList arrayList13 = new ArrayList();
        com.tsf.shell.g.b.n = arrayList13;
        arrayList13.add("com.android.email/com.android.email.activity.Welcome");
        com.tsf.shell.g.b.n.add("com.htc.android.mail/com.htc.android.mail.MailListTab");
        com.tsf.shell.g.b.n.add("com.google.android.email/com.android.email.activity.Welcome");
        com.tsf.shell.g.b.n.add("com.motorola.blur.email/com.motorola.blur.email.mailbox.ViewFolderActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.n);
        ArrayList arrayList14 = new ArrayList();
        com.tsf.shell.g.b.j = arrayList14;
        arrayList14.add("com.android.vending/com.android.vending.AssetBrowserActivity");
        com.tsf.shell.g.b.o.add(com.tsf.shell.g.b.j);
        this.g = new ArrayList();
    }

    public final void a(g gVar) {
        this.f = gVar;
    }

    private static void c(ArrayList arrayList) {
        boolean z = false;
        if (!a(com.censivn.C3DEngine.a.c())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext() && !(z = com.tsf.shell.g.b.a(com.tsf.shell.g.b.a(((com.tsf.shell.h.b) it.next()).c)))) {
            }
            if (!z) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.DIAL");
                arrayList.add(new com.tsf.shell.h.b(com.censivn.C3DEngine.h.a.c(R.string.default_icon_phone), "com.tsf.shell", "com.android.contacts.DialtactsActivity", intent, R.drawable.default_icon_phone));
            }
        }
    }

    private static boolean a(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() == 0;
        } catch (Exception e2) {
            return false;
        }
    }

    public static b a() {
        return e;
    }

    public final void a(ArrayList arrayList) {
        boolean z = false;
        if (!a(com.censivn.C3DEngine.a.c())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext() && !(z = com.tsf.shell.g.b.b(com.tsf.shell.g.b.a(((com.tsf.shell.h.b) it.next()).c)))) {
            }
            if (!z) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setData(Uri.parse("content://mms-sms/"));
                arrayList.add(new com.tsf.shell.h.b(com.censivn.C3DEngine.h.a.c(R.string.default_icon_sms), "com.tsf.shell", "com.android.mms.ui.ConversationList", intent, R.drawable.default_icon_sms));
            }
        }
        c(arrayList);
        ArrayList d2 = d(arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((com.tsf.shell.h.b) it2.next()).g = true;
        }
        Iterator it3 = d2.iterator();
        while (it3.hasNext()) {
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) it3.next();
            bVar.h = true;
            bVar.g = true;
        }
        com.censivn.C3DEngine.a.a().c(new c(this, arrayList, d2));
    }

    public final void a(ArrayList arrayList, boolean z) {
        com.censivn.C3DEngine.a.a().c(new d(this, arrayList, z));
    }

    public final void b(ArrayList arrayList, boolean z) {
        com.censivn.C3DEngine.a.a().c(new e(this, arrayList, z));
    }

    public final void b(ArrayList arrayList) {
        com.censivn.C3DEngine.a.a().c(new f(this, arrayList));
    }

    public final void a(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        this.g.add(launcherShortcut3DInfo);
    }

    private ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            a(arrayList, (LauncherShortcut3DInfo) this.g.get(i), arrayList2);
        }
        this.g.clear();
        return arrayList2;
    }

    private static void a(ArrayList arrayList, LauncherShortcut3DInfo launcherShortcut3DInfo, ArrayList arrayList2) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) arrayList.get(i);
            if (bVar.c.getPackageName().equals(launcherShortcut3DInfo.packagename) && bVar.c.getClassName().equals(launcherShortcut3DInfo.classname)) {
                if (bVar.d == null) {
                    bVar.d = new ArrayList();
                }
                bVar.d.add(launcherShortcut3DInfo);
                return;
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.tsf.shell.h.b bVar2 = (com.tsf.shell.h.b) it.next();
            if (bVar2.c.getPackageName().equals(launcherShortcut3DInfo.packagename) && bVar2.c.getClassName().equals(launcherShortcut3DInfo.classname)) {
                bVar2.d.add(launcherShortcut3DInfo);
                return;
            }
        }
        com.tsf.shell.h.b bVar3 = new com.tsf.shell.h.b(launcherShortcut3DInfo.title, launcherShortcut3DInfo.packagename, launcherShortcut3DInfo.classname, null, 0);
        bVar3.d = new ArrayList();
        bVar3.d.add(launcherShortcut3DInfo);
        arrayList2.add(bVar3);
    }

    public static void a(String[] strArr, int i) {
        switch (i) {
            case 5:
                com.tsf.shell.workspace3D.k.ae.a(strArr);
                break;
        }
    }
}
