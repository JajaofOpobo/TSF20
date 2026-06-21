package com.tsf.shell.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class OEMComponentResolver {
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
        OEMComponentResolver();
    }

    public static void a() {
        q = new ArrayList<>();
        a = new ArrayList<>();
        PackageManagerHelper.add(new ComponentName("com.google.android.dialer", "com.google.android.dialer.extensions.GoogleDialtactsActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.contacts", "com.android.dialer.DialtactsActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.htcdialer", "com.android.htcdialer.Dialer"));
        PackageManagerHelper.add(new ComponentName("com.android.htcdialer", "com.android.htcdialer.Dialer"));
        PackageManagerHelper.add(new ComponentName("com.sec.android.app.dialertab", "com.sec.android.app.dialertab.DialerTabActivity"));
        PackageManagerHelper.add(new ComponentName("com.sonyericsson.android.socialphonebook", "com.sonyericsson.android.socialphonebook.DialerEntryActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.htccontacts", "com.android.htccontacts.DialerTabActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.contacts", "com.android.contacts.activities.DialtactsActivity"));
        PackageManagerHelper.add(new ComponentName("com.motorola.dialer", "com.motorola.dialer.DialtactsContactsEntryActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.contacts", "com.android.contacts.TwelveKeyDialer"));
        PackageManagerHelper.add(new ComponentName("com.android.contacts", "com.android.contacts.activities.TwelveKeyDialer"));
        PackageManagerHelper.add(new ComponentName("com.android.dialer", "com.android.dialer.DialtactsActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.htcdialer", "com.android.htcdialer.DialerActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.contacts", "com.android.contacts.CallDialtactsActivity"));
        PackageManagerHelper.add(new ComponentName("com.zte.smartdialer", "com.zte.smartdialer.DialerApp"));
        PackageManagerHelper.add(new ComponentName("com.android.contacts", "com.oppo.contacts.OppoDialtactsActivity"));
        PackageManagerHelper.add(new ComponentName("com.yulong.android.contacts.dial", "com.yulong.android.contacts.dial.DialActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.contacts", "com.sec.android.app.contacts.DialerEntryActivity"));
        PackageManagerHelper.add(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsActivity"));
        PackageManagerHelper.add(new ComponentName("com.asus.contacts", "com.android.contacts.activities.DialtactsActivity"));
        PackageManagerHelper.add(new ComponentName("com.lenovo.ideafriend", "com.lenovo.ideafriend.alias.DialtactsActivity"));
        BitmapTransformationHelper.add(a);
        b = new ArrayList<>();
        OEMComponentResolver.add(new ComponentName("com.android.mms", "com.android.mms.ui.MessagesActivity"));
        OEMComponentResolver.add(new ComponentName("com.android.mms", "com.android.mms.ui.ConversationList"));
        OEMComponentResolver.add(new ComponentName("com.sonyericsson.conversations", "com.sonyericsson.conversations.ui.ConversationListActivity"));
        OEMComponentResolver.add(new ComponentName("com.android.mms", "com.android.mms.ui.MmsTabActivity"));
        OEMComponentResolver.add(new ComponentName("com.motorola.blur.messaging", "com.motorola.blur.messaging.MessagingActivity"));
        OEMComponentResolver.add(new ComponentName("com.android.mms", "com.android.mms.ui.ConversationComposer"));
        OEMComponentResolver.add(new ComponentName("com.android.mms", "com.android.mms.ui.traditional.MessageLaunchActivity"));
        OEMComponentResolver.add(new ComponentName("com.android.mms", "com.yulong.android.mms.ui.MmsMainListFormActivity"));
        OEMComponentResolver.add(new ComponentName("com.google.android.talk", "com.google.android.talk.SigningInActivity"));
        OEMComponentResolver.add(new ComponentName("com.asus.message", "com.android.mms.ui.ConversationList"));
        OEMComponentResolver.add(new ComponentName("com.lenovo.ideafriend", "com.lenovo.ideafriend.alias.MmsActivity"));
        OEMComponentResolver.add(new ComponentName("com.android.mms", "com.android.mms.ui.BootActivity"));
        BitmapTransformationHelper.add(b);
        p = new ArrayList<>();
        ColorMatrixImageFilter.add(new ComponentName("com.google.android.talk", "com.google.android.talk.SigningInActivity"));
        g = new ArrayList<>();
        StatusBarHelper.add(new ComponentName("com.android.chrome", "com.google.android.apps.chrome.Main"));
        StatusBarHelper.add(new ComponentName("com.android.browser", "com.android.browser.BrowserActivity"));
        StatusBarHelper.add(new ComponentName("com.google.android.browser", "com.android.browser.BrowserActivity"));
        StatusBarHelper.add(new ComponentName("com.sec.android.app.sbrowser", "com.sec.android.app.sbrowser.SBrowserMainActivity"));
        StatusBarHelper.add(new ComponentName("com.asus.browser", "com.android.browser.BrowserActivity"));
        StatusBarHelper.add(new ComponentName("com.lenovo.browser", "com.lenovo.browser.BrowserActivity"));
        BitmapTransformationHelper.add(g);
        d = new ArrayList<>();
        LazyBitmapFactory.add(new ComponentName("com.google.android.GoogleCamera", "com.android.camera.CameraLauncher"));
        LazyBitmapFactory.add(new ComponentName("com.motorola.Camera2", "com.android.camera.CameraLauncher"));
        LazyBitmapFactory.add(new ComponentName("com.motorola.Camera", "com.motorola.Camera.Camera"));
        LazyBitmapFactory.add(new ComponentName("com.android.camera", "com.android.camera.CameraEntry"));
        LazyBitmapFactory.add(new ComponentName("com.sec.android.app.camera", "com.sec.android.app.camera.Camera"));
        LazyBitmapFactory.add(new ComponentName("com.google.android.camera", "com.android.camera.Camera"));
        LazyBitmapFactory.add(new ComponentName("com.android.camera", "com.android.camera.Camera"));
        LazyBitmapFactory.add(new ComponentName("com.sonyericsson.android.camera", "com.sonyericsson.android.camera.CameraActivity"));
        LazyBitmapFactory.add(new ComponentName("com.miui.camera", "com.miui.camera.Camera"));
        LazyBitmapFactory.add(new ComponentName("com.samsung.camera", "com.samsung.camera.Camera"));
        LazyBitmapFactory.add(new ComponentName("com.lge.camera", "com.lge.camera.CameraApp"));
        LazyBitmapFactory.add(new ComponentName("com.google.android.gallery3d", "com.android.camera.CameraLauncher"));
        LazyBitmapFactory.add(new ComponentName("com.asus.camera", "com.asus.camera.CameraApp"));
        LazyBitmapFactory.add(new ComponentName("com.lenovo.scg", "com.lenovo.scg.camera.CameraLauncher"));
        BitmapTransformationHelper.add(d);
        i = new ArrayList<>();
        IntentResolver.add(new ComponentName("com.cooliris.media", "com.cooliris.media.Gallery"));
        IntentResolver.add(new ComponentName("com.google.android.gallery3d", "com.cooliris.media.Gallery"));
        IntentResolver.add(new ComponentName("com.android.camera", "com.android.camera.GalleryPicker"));
        IntentResolver.add(new ComponentName("com.htc.album", "com.htc.album.AlbumMain.ActivityMainDropList"));
        IntentResolver.add(new ComponentName("com.htc.album", "com.htc.album.AlbumTabSwitchActivity"));
        IntentResolver.add(new ComponentName("com.google.android.gallery3d", "com.android.gallery3LazyBitmapFactory.app.Gallery"));
        IntentResolver.add(new ComponentName("com.motorola.gallery", "com.motorola.gallery.TopScreen"));
        IntentResolver.add(new ComponentName("com.android.gallery", "com.android.gallery.ui.MainActivity"));
        IntentResolver.add(new ComponentName("com.sonyericsson.gallery", "com.sonyericsson.gallery.Gallery"));
        IntentResolver.add(new ComponentName("com.android.gallery", "com.android.camera.GalleryPicker"));
        IntentResolver.add(new ComponentName("com.android.gallery3d", "com.android.gallery3LazyBitmapFactory.app.Gallery"));
        IntentResolver.add(new ComponentName("com.miui.gallery", "com.miui.gallery.app.Gallery"));
        IntentResolver.add(new ComponentName("com.sec.android.gallery3d", "com.sec.android.gallery3LazyBitmapFactory.app.Gallery"));
        IntentResolver.add(new ComponentName("com.asus.ephoto", "com.asus.ephoto.app.EPhotoActivity"));
        BitmapTransformationHelper.add(i);
        c = new ArrayList<>();
        ReusableBitmapHolder.add(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
        ReusableBitmapHolder.add(new ComponentName("com.android.htccontacts", "com.android.htccontacts.ContactsTabActivity"));
        ReusableBitmapHolder.add(new ComponentName("com.android.contacts", "com.sec.android.app.contacts.PhoneBookTopMenuActivity"));
        ReusableBitmapHolder.add(new ComponentName("com.sonyericsson.android.socialphonebook", "com.sonyericsson.android.socialphonebook.SocialPhonebookActivity"));
        ReusableBitmapHolder.add(new ComponentName("com.android.htccontacts", "com.android.htccontacts.BrowseLayerCarouselActivity"));
        ReusableBitmapHolder.add(new ComponentName("com.android.contacts", "com.android.contacts.activities.PeopleActivity"));
        ReusableBitmapHolder.add(new ComponentName("com.motorola.blur.contacts", "com.motorola.blur.contacts.ViewIdentitiesFacetActivity"));
        ReusableBitmapHolder.add(new ComponentName("com.sonyericsson.android.socialphonebook", "com.sonyericsson.android.socialphonebook.LaunchActivity"));
        BitmapTransformationHelper.add(c);
        k = new ArrayList<>();
        MarketLinkHandler.add(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
        BitmapTransformationHelper.add(k);
        h = new ArrayList<>();
        ItemInfoListSorter.add(new ComponentName("com.android.music", "com.android.music.MusicBrowserActivity"));
        ItemInfoListSorter.add(new ComponentName("com.htc.music", "com.htc.music.HtcMusic"));
        ItemInfoListSorter.add(new ComponentName("com.sec.android.app.music", "com.sec.android.app.music.list.activity.MpMainTabActivity"));
        ItemInfoListSorter.add(new ComponentName("com.android.music", "com.android.music.MusicBrowserActivity"));
        ItemInfoListSorter.add(new ComponentName("com.android.music", "com.android.music.list.activity.MpMainTabActivity"));
        ItemInfoListSorter.add(new ComponentName("com.htc.music", "com.htc.music.browserlayer.MusicBrowserTabActivity"));
        ItemInfoListSorter.add(new ComponentName("com.google.android.music", "com.android.music.activitymanagement.TopLevelActivity"));
        ItemInfoListSorter.add(new ComponentName("com.motorola.cmp", "com.motorola.cmp.HomeListActivity"));
        ItemInfoListSorter.add(new ComponentName("com.miui.player", "com.miui.player.drawerActivityGroup.MainActivityGroup"));
        ItemInfoListSorter.add(new ComponentName("com.sonyericsson.music", "com.sonyericsson.music.PlayerActivity"));
        ItemInfoListSorter.add(new ComponentName("com.samsung.sec.android.MusicPlayer", "com.samsung.sec.android.MusicPlayer.activity.MusicPlayerList"));
        ItemInfoListSorter.add(new ComponentName("com.sec.android.app.music", "com.sec.android.app.music.MusicBrowserTabActivity"));
        ItemInfoListSorter.add(new ComponentName("com.miui.player", "com.miui.player.ui.MusicBrowserActivity"));
        ItemInfoListSorter.add(new ComponentName("com.android.mediacenter", "com.android.mediacenter.ListBrowserActivity"));
        ItemInfoListSorter.add(new ComponentName("com.sec.android.app.music", "com.sec.android.app.music.MusicActionTabActivity"));
        BitmapTransformationHelper.add(h);
        f = new ArrayList<>();
        PercentToAlphaConverter.add(new ComponentName("com.android.settings", "com.android.settings.Settings"));
        PercentToAlphaConverter.add(new ComponentName("com.android.settings", "com.android.settings.framework.activity.HtcSettings"));
        BitmapTransformationHelper.add(f);
        l = new ArrayList<>();
        ErrorThrower.add(new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity"));
        ErrorThrower.add(new ComponentName("com.htc.calendar", "com.htc.calendar.LaunchActivity"));
        ErrorThrower.add(new ComponentName("com.google.android.calendar", "com.android.calendar.LaunchActivity"));
        ErrorThrower.add(new ComponentName("com.google.android.calendar", "com.android.calendar.AllInOneActivity"));
        ErrorThrower.add(new ComponentName("com.android.calendar", "com.android.calendar.AllInOneActivity"));
        BitmapTransformationHelper.add(l);
        e = new ArrayList<>();
        SelectionDotRenderer.add(new ComponentName("com.android.alarmclock", "com.android.alarmclock.AlarmClock"));
        SelectionDotRenderer.add(new ComponentName("com.htc.android.worldclock", "com.htc.android.worldclock.WorldClockTabControl"));
        SelectionDotRenderer.add(new ComponentName("com.sec.android.app.clockpackage", "com.sec.android.app.clockpackage.ClockPackage"));
        SelectionDotRenderer.add(new ComponentName("com.google.android.deskclock", "com.android.deskclock.DeskClock"));
        SelectionDotRenderer.add(new ComponentName("com.android.deskclock", "com.android.deskclock.DeskClock"));
        SelectionDotRenderer.add(new ComponentName("com.motorola.blur.alarmclock", "com.motorola.blur.alarmclock.AlarmClock"));
        SelectionDotRenderer.add(new ComponentName("com.android.deskclock", "com.android.deskclock.DeskClockTabActivity"));
        BitmapTransformationHelper.add(e);
        m = new ArrayList<>();
        FlurryAnalyticsLogger.add(new ComponentName("com.google.android.gm", "com.google.android.gm.ConversationListActivityGmail"));
        BitmapTransformationHelper.add(m);
        n = new ArrayList<>();
        FeedbackComposer.add(new ComponentName("com.android.email", "com.android.email.activity.Welcome"));
        FeedbackComposer.add(new ComponentName("com.htc.android.mail", "com.htc.android.mail.MailListTab"));
        FeedbackComposer.add(new ComponentName("com.google.android.email", "com.android.email.activity.Welcome"));
        FeedbackComposer.add(new ComponentName("com.motorola.blur.email", "com.motorola.blur.email.mailbox.ViewFolderActivity"));
        BitmapTransformationHelper.add(n);
        j = new ArrayList<>();
        DimensionParser.add(new ComponentName("com.android.vending", "com.android.vending.AssetBrowserActivity"));
        BitmapTransformationHelper.add(j);
        o = new ArrayList<>();
        FileSystemHelper.add(new ComponentName("com.whatsapp", "com.whatsapp.Main"));
        BitmapTransformationHelper.add(o);
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

    public static ArrayList<com.tsf.shell.f.i.b.e.DrawerItemVisual> a(int i2) {
        com.tsf.shell.f.i.b.e.DrawerItemVisual gVarBa;
        ArrayList<com.tsf.shell.f.i.b.e.DrawerItemVisual> arrayList = new ArrayList<>();
        Iterator<ComponentName> it = b(i2).iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.DrawerItemVisual gVarA = com.tsf.shell.manager.app.ServiceProvider.a().a(it.next());
            if (gVarA != null && (gVarBa = gVarA.ba()) != null) {
                arrayList.add(gVarBa);
            }
        }
        return arrayList;
    }

    public static ArrayList<ComponentName> b(int i2) {
        int i3 = 0;
        ArrayList<ComponentName> arrayList = new ArrayList<>();
        Iterator<ArrayList<ComponentName>> it = BitmapTransformationHelper.iterator();
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
        PackageManager packageManager = com.censivn.C3DEngine.C3DEngine.d().getPackageManager();
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
