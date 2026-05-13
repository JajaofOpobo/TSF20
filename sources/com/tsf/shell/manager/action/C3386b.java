package com.tsf.shell.manager.action;

import android.content.ComponentName;
import android.content.Intent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p030a.C0869e;
import com.censivn.C3DEngine.p031b.p035c.C0922d;
import com.ksmobile.launcher.p066a.p067a.C1296b;
import com.tsf.C1306b;
import com.tsf.extend.theme.C1920x;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.toggle.C3403a;
import com.tsf.shell.p096f.C2279b;
import com.tsf.shell.plugin.summary.ShellSummaryActivity;
import com.tsf.shell.preference.SettingAdvancedPerferenceActivity;
import com.tsf.shell.preference.SettingGesturePreferenceActivity;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import org.acra.ACRAConstants;
/* renamed from: com.tsf.shell.manager.action.b */
/* loaded from: classes.dex */
public class C3386b {

    /* renamed from: b */
    public int f11188b = 0;

    /* renamed from: c */
    public C3403a f11189c = new C3403a();

    /* renamed from: a */
    public ArrayList<C3389a> f11187a = m2665a(false);

    /* renamed from: com.tsf.shell.manager.action.b$a */
    /* loaded from: classes.dex */
    public static class C3389a {

        /* renamed from: a */
        public int f11194a;

        /* renamed from: b */
        public String f11195b;

        /* renamed from: c */
        public int f11196c;

        /* renamed from: d */
        public String f11197d;

        /* renamed from: e */
        public Intent f11198e;

        /* renamed from: f */
        public Intent.ShortcutIconResource f11199f;
    }

    public C3386b() {
        C3359a.f11105s.m10575a(new C0922d.C0923a() { // from class: com.tsf.shell.manager.action.b.1
            @Override // com.censivn.C3DEngine.p031b.p035c.C0922d.C0923a
            /* renamed from: a */
            public void mo2663a() {
                if (C3386b.this.f11188b != 0) {
                    C3386b.this.m2670a(C3386b.this.f11188b);
                    C3386b.this.f11188b = 0;
                }
            }
        });
    }

    /* renamed from: a */
    public ArrayList<C3389a> m2671a() {
        return this.f11187a;
    }

    /* renamed from: a */
    public static ArrayList<C3389a> m2665a(boolean z) {
        ArrayList<C3389a> arrayList = new ArrayList<>();
        if (z) {
            arrayList.add(m2664b(0));
        }
        arrayList.add(m2664b(100));
        C3389a m2664b = m2664b(500);
        if (z) {
            m2664b.f11196c = C1306b.C1310d.allapps_icon;
        }
        arrayList.add(m2664b);
        arrayList.add(m2664b(1400));
        arrayList.add(m2664b(11));
        arrayList.add(m2664b(16));
        arrayList.add(m2664b(17));
        arrayList.add(m2664b(3));
        arrayList.add(m2664b(2));
        arrayList.add(m2664b(18));
        arrayList.add(m2664b(4));
        arrayList.add(m2664b(5));
        arrayList.add(m2664b(7));
        arrayList.add(m2664b(8));
        return arrayList;
    }

    /* renamed from: a */
    public void m2666a(String str) {
        int parseInt = Integer.parseInt(str.substring(6, str.length()));
        if (parseInt > 10000) {
            this.f11189c.m2632a(parseInt);
        } else {
            m2670a(parseInt);
        }
    }

    /* renamed from: a */
    public void m2670a(int i) {
        m2669a(i, false);
    }

    /* renamed from: a */
    public void m2669a(final int i, final boolean z) {
        if (!C0869e.m10758l()) {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.action.b.2
                @Override // java.lang.Runnable
                public void run() {
                    C3386b.this.m2669a(i, z);
                }
            });
        } else if (C3359a.f11105s.m10573b() && !z) {
            this.f11188b = i;
            C3359a.f11105s.m10576a();
        } else {
            switch (i) {
                case 0:
                default:
                    return;
                case 2:
                    C3359a.f11094h.m4007z();
                    return;
                case 3:
                    C3359a.f11094h.m4129A();
                    return;
                case 4:
                    C3359a.f11088b.m10550d();
                    return;
                case 5:
                    C3359a.f11088b.m10548e();
                    return;
                case 7:
                    Home.m6177b().m6182a(new Intent("android.search.action.GLOBAL_SEARCH"), (Object) null);
                    return;
                case 8:
                    Home.m6177b().m6182a(new Intent("android.speech.action.WEB_SEARCH"), (Object) null);
                    return;
                case 11:
                    C3359a.f11094h.m4109R();
                    return;
                case 12:
                    if (!C3359a.f11094h.m4122E()) {
                        C3359a.f11095i.f12255a.show();
                        return;
                    }
                    return;
                case 13:
                    if (C3359a.f11094h.m4122E()) {
                        C3359a.f11094h.m4019t().m4419c(0);
                        return;
                    } else {
                        C3359a.f11094h.m4110Q();
                        return;
                    }
                case 14:
                    C3359a.f11094h.m4115L();
                    return;
                case 15:
                    Home.m6177b().m6186a(500);
                    return;
                case 16:
                    C3359a.f11093g.f7458a.m5708k();
                    return;
                case 17:
                    C3359a.f11093g.f7459b.m5835c();
                    return;
                case 18:
                    C3359a.f11100n.m2093c(true);
                    return;
                case 19:
                    PersonalizationActivity.m7011a(Home.m6177b(), "1", "theme_push_notifition_invalid", null, true);
                    C1296b.m9073a(false, "tsflauncher_themecenter_click", "click", "1");
                    return;
                case 20:
                    C1920x.m7048b(Home.m6177b(), "https://play.google.com/store/apps/details?id=panda.keyboard.emoji.theme", "&referrer=utm_source%3Dtsf_keyboard");
                    C1296b.m9073a(false, "tsflauncher_keyboard_click", "click", "1");
                    return;
                case 100:
                    C3359a.f11094h.m4021s().m3881h();
                    return;
                case VEasing.Back.easeIn /* 200 */:
                    ThemeManager.mix.f13393ui.show(1);
                    return;
                case 300:
                    if (C3359a.f11094h.m4122E()) {
                        C3359a.f11094h.m4019t().m4419c(1);
                        return;
                    } else {
                        C3359a.f11094h.m4039j().show();
                        return;
                    }
                case VEasing.Linear.easeNone /* 400 */:
                    SettingGesturePreferenceActivity.m931a();
                    return;
                case 500:
                    C3359a.f11094h.m4019t().m4455al();
                    return;
                case 600:
                    C2279b.m5964a();
                    return;
                case 700:
                    C3359a.f11084B.m805e().m10506d();
                    return;
                case 800:
                    C3359a.f11084B.m808b().m10506d();
                    return;
                case 900:
                    C3359a.f11084B.m804f().m10506d();
                    return;
                case 1000:
                    C3359a.f11084B.m806d().m10506d();
                    return;
                case 1100:
                    C3359a.f11104r.m1913a();
                    return;
                case 1200:
                    C3359a.f11084B.m803g().m10506d();
                    return;
                case 1300:
                    SettingAdvancedPerferenceActivity.m933a();
                    return;
                case 1400:
                    C3359a.f11084B.m809a().m10506d();
                    return;
                case 1500:
                    C3359a.f11084B.m802h().m10506d();
                    return;
                case 1600:
                    Intent intent = new Intent();
                    intent.setClass(C0853a.m10856d(), ShellSummaryActivity.class);
                    Home.m6177b().m6182a(intent, (Object) null);
                    return;
                case 1700:
                    C3359a.f11092f.m1616a().show();
                    return;
                case 1800:
                    C3359a.f11084B.m807c().m10506d();
                    return;
                case ACRAConstants.DEFAULT_SOCKET_TIMEOUT /* 5000 */:
                    C3359a.f11086D.m2162a();
                    return;
            }
        }
    }

    /* renamed from: a */
    public static void m2668a(LauncherShortcut3DInfo launcherShortcut3DInfo, int i) {
        Intent.ShortcutIconResource shortcutIconResource = launcherShortcut3DInfo.iconResource;
        switch (i) {
            case 0:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_none);
                return;
            case 2:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_homescreen);
                return;
            case 3:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_drawer_homescreen);
                return;
            case 4:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_toggle_notification_bar);
                return;
            case 5:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_expand_notification_bar);
                return;
            case 7:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_search);
                return;
            case 8:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_voice);
                return;
            case 11:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_lasso_mode);
                return;
            case 12:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_add);
                return;
            case 13:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_multi_choice);
                return;
            case 14:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_desktop_editor);
                return;
            case 15:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_restart);
                return;
            case 16:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_toggle_dock);
                return;
            case 17:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_toggle_sliding_dock);
                return;
            case 18:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.ic_action_expand_side_menu);
                return;
            case 19:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.cml_theme);
                return;
            case 20:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.cml_panda);
                return;
            case 100:
            case 500:
            case 1000:
                return;
            case VEasing.Back.easeIn /* 200 */:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_theme);
                return;
            case 300:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_desktop_effect);
                return;
            case VEasing.Linear.easeNone /* 400 */:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_gesture);
                return;
            case 600:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_snow_icon);
                return;
            case 700:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_screen_scale);
                return;
            case 800:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_dock);
                return;
            case 900:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_side_menu);
                return;
            case 1100:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_unread);
                return;
            case 1200:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_backup);
                return;
            case 1300:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_advanced);
                return;
            case 1400:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_about);
                return;
            case 1500:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_desktop);
                return;
            case 1600:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_demo);
                return;
            case 1700:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_wallpaper);
                return;
            case ACRAConstants.DEFAULT_CONNECTION_TIMEOUT /* 3000 */:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.default_icon_phone);
                return;
            case 3001:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.default_icon_sms);
                return;
            case 3002:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.shortcut_wallpaper);
                return;
            default:
                shortcutIconResource.resourceName = String.valueOf(C1306b.C1310d.tsf_ico);
                return;
        }
    }

    /* renamed from: b */
    public static C3389a m2664b(int i) {
        C3389a c3389a = new C3389a();
        c3389a.f11194a = i;
        switch (i) {
            case 0:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.none);
                c3389a.f11196c = C1306b.C1310d.ic_action_none;
                break;
            case 2:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_home_screen);
                c3389a.f11196c = C1306b.C1310d.ic_action_homescreen;
                break;
            case 3:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_switch_appdrawer_homescreen);
                c3389a.f11196c = C1306b.C1310d.ic_action_drawer_homescreen;
                break;
            case 4:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_toggle_notification_bar);
                c3389a.f11196c = C1306b.C1310d.ic_action_toggle_notification_bar;
                break;
            case 5:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_expand_notification_bar);
                c3389a.f11196c = C1306b.C1310d.ic_action_expand_notification_bar;
                break;
            case 7:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_text_search);
                c3389a.f11196c = C1306b.C1310d.ic_action_search;
                c3389a.f11197d = "ic_action_toggle_dock";
                break;
            case 8:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_voice_search);
                c3389a.f11196c = C1306b.C1310d.ic_action_voice;
                break;
            case 11:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_lasso_mode);
                c3389a.f11196c = C1306b.C1310d.shortcut_lasso_mode;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_LASSO_MODE;
                break;
            case 12:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.menu_add);
                c3389a.f11196c = C1306b.C1310d.shortcut_add;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_ADD;
                break;
            case 13:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.menu_multiple_choice);
                c3389a.f11196c = C1306b.C1310d.shortcut_multi_choice;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_MULTI_CHOICE;
                break;
            case 14:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.menu_desktop_editor);
                c3389a.f11196c = C1306b.C1310d.shortcut_desktop_editor;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_DESKTOP_EDITOR;
                break;
            case 15:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_restart);
                c3389a.f11196c = C1306b.C1310d.shortcut_restart;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_RESTART;
                break;
            case 16:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_toggle_dock);
                c3389a.f11196c = C1306b.C1310d.ic_action_toggle_dock;
                break;
            case 17:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_toggle_sliding_dock);
                c3389a.f11196c = C1306b.C1310d.ic_action_toggle_sliding_dock;
                break;
            case 18:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_expand_side_menu);
                c3389a.f11196c = C1306b.C1310d.ic_action_expand_side_menu;
                break;
            case 19:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.theme);
                c3389a.f11196c = C1306b.C1310d.cml_theme;
                break;
            case 20:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.panda);
                c3389a.f11196c = C1306b.C1310d.cml_panda;
                break;
            case 100:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_action_app_drawer);
                break;
            case VEasing.Back.easeIn /* 200 */:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.menu_theme);
                c3389a.f11196c = C1306b.C1310d.shortcut_theme;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_THEME;
                break;
            case 300:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.menu_setting_effect);
                c3389a.f11196c = C1306b.C1310d.shortcut_desktop_effect;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_DESKTOP_EFFECT;
                break;
            case VEasing.Linear.easeNone /* 400 */:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.menu_gestures);
                c3389a.f11196c = C1306b.C1310d.shortcut_gesture;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_GESTURE;
                break;
            case 500:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_all_apps);
                break;
            case 600:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_floating);
                c3389a.f11196c = C1306b.C1310d.shortcut_snow_icon;
                break;
            case 700:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_screen_scale);
                c3389a.f11196c = C1306b.C1310d.shortcut_screen_scale;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_SCALE;
                break;
            case 800:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_dock);
                c3389a.f11196c = C1306b.C1310d.shortcut_dock;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_DOCK;
                break;
            case 900:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_side_menu);
                c3389a.f11196c = C1306b.C1310d.shortcut_side_menu;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_SIDE_MENU;
                break;
            case 1000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_drawer);
                break;
            case 1100:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_unread_count);
                c3389a.f11196c = C1306b.C1310d.shortcut_unread;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_UNREAD;
                break;
            case 1200:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_backup);
                c3389a.f11196c = C1306b.C1310d.shortcut_backup;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_BACKUP;
                break;
            case 1300:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.advanced_setting);
                c3389a.f11196c = C1306b.C1310d.shortcut_advanced;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_ADVANCED;
                break;
            case 1400:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_about);
                c3389a.f11196c = C1306b.C1310d.shortcut_about;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_ABOUT;
                break;
            case 1500:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_screen);
                c3389a.f11196c = C1306b.C1310d.shortcut_desktop;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_DESKTOP;
                break;
            case 1600:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_demo);
                c3389a.f11196c = C1306b.C1310d.shortcut_demo;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_DEMO;
                break;
            case 1700:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_wallpaper);
                c3389a.f11196c = C1306b.C1310d.shortcut_wallpaper;
                c3389a.f11197d = ThemeShellDescription.SHORTCUT_WALLPAPER;
                break;
            case ACRAConstants.DEFAULT_CONNECTION_TIMEOUT /* 3000 */:
                c3389a.f11195b = "Phone";
                c3389a.f11196c = C1306b.C1310d.default_icon_phone;
                break;
            case 3001:
                c3389a.f11195b = "Messaging";
                c3389a.f11196c = C1306b.C1310d.default_icon_sms;
                break;
            case 3002:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.mn_wallpaper);
                c3389a.f11196c = C1306b.C1310d.shortcut_wallpaper;
                break;
            default:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.none);
                c3389a.f11196c = C1306b.C1310d.tsf_ico;
                break;
        }
        return c3389a;
    }

    /* renamed from: a */
    public static void m2667a(C3389a c3389a) {
        c3389a.f11198e = new Intent("android.intent.action.MAIN");
        c3389a.f11198e.addCategory("android.intent.category.LAUNCHER");
        c3389a.f11198e.setComponent(new ComponentName(C0853a.m10858b(), Home.class.getName()));
        c3389a.f11198e.setFlags(270532608);
    }
}
