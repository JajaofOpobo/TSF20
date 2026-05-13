package com.tsf.shell.manager.action;

import android.content.ComponentName;
import android.content.Intent;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.d;
import com.tsf.b;
import com.tsf.extend.theme.x;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.shell.Home;
import com.tsf.shell.plugin.summary.ShellSummaryActivity;
import com.tsf.shell.preference.SettingAdvancedPerferenceActivity;
import com.tsf.shell.preference.SettingGesturePreferenceActivity;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public class b {
    public int b = 0;
    public com.tsf.shell.manager.action.toggle.a c = new com.tsf.shell.manager.action.toggle.a();
    public ArrayList<a> a = a(false);

    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b;
        public int c;
        public String d;
        public Intent e;
        public Intent.ShortcutIconResource f;
    }

    public b() {
        com.tsf.shell.manager.a.s.a(new d.a() { // from class: com.tsf.shell.manager.action.b.1
            @Override // com.censivn.C3DEngine.b.c.d.a
            public void a() {
                if (b.this.b != 0) {
                    b.this.a(b.this.b);
                    b.this.b = 0;
                }
            }
        });
    }

    public ArrayList<a> a() {
        return this.a;
    }

    public static ArrayList<a> a(boolean z) {
        ArrayList<a> arrayList = new ArrayList<>();
        if (z) {
            arrayList.add(b(0));
        }
        arrayList.add(b(100));
        a b = b(500);
        if (z) {
            b.c = b.d.allapps_icon;
        }
        arrayList.add(b);
        arrayList.add(b(1400));
        arrayList.add(b(11));
        arrayList.add(b(16));
        arrayList.add(b(17));
        arrayList.add(b(3));
        arrayList.add(b(2));
        arrayList.add(b(18));
        arrayList.add(b(4));
        arrayList.add(b(5));
        arrayList.add(b(7));
        arrayList.add(b(8));
        return arrayList;
    }

    public void a(String str) {
        int parseInt = Integer.parseInt(str.substring(6, str.length()));
        if (parseInt > 10000) {
            this.c.a(parseInt);
        } else {
            a(parseInt);
        }
    }

    public void a(int i) {
        a(i, false);
    }

    public void a(final int i, final boolean z) {
        if (!com.censivn.C3DEngine.a.e.l()) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.action.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.a(i, z);
                }
            });
        } else if (com.tsf.shell.manager.a.s.b() && !z) {
            this.b = i;
            com.tsf.shell.manager.a.s.a();
        } else {
            switch (i) {
                case 0:
                default:
                    return;
                case 2:
                    com.tsf.shell.manager.a.h.z();
                    return;
                case 3:
                    com.tsf.shell.manager.a.h.A();
                    return;
                case 4:
                    com.tsf.shell.manager.a.b.d();
                    return;
                case 5:
                    com.tsf.shell.manager.a.b.e();
                    return;
                case 7:
                    Home.b().a(new Intent("android.search.action.GLOBAL_SEARCH"), (Object) null);
                    return;
                case 8:
                    Home.b().a(new Intent("android.speech.action.WEB_SEARCH"), (Object) null);
                    return;
                case 11:
                    com.tsf.shell.manager.a.h.R();
                    return;
                case 12:
                    if (!com.tsf.shell.manager.a.h.E()) {
                        com.tsf.shell.manager.a.i.a.show();
                        return;
                    }
                    return;
                case 13:
                    if (com.tsf.shell.manager.a.h.E()) {
                        com.tsf.shell.manager.a.h.t().c(0);
                        return;
                    } else {
                        com.tsf.shell.manager.a.h.Q();
                        return;
                    }
                case 14:
                    com.tsf.shell.manager.a.h.L();
                    return;
                case 15:
                    Home.b().a(500);
                    return;
                case 16:
                    com.tsf.shell.manager.a.g.a.k();
                    return;
                case 17:
                    com.tsf.shell.manager.a.g.b.c();
                    return;
                case 18:
                    com.tsf.shell.manager.a.n.c(true);
                    return;
                case 19:
                    PersonalizationActivity.a(Home.b(), "1", "theme_push_notifition_invalid", null, true);
                    com.ksmobile.launcher.a.a.b.a(false, "tsflauncher_themecenter_click", "click", "1");
                    return;
                case 20:
                    x.b(Home.b(), "https://play.google.com/store/apps/details?id=panda.keyboard.emoji.theme", "&referrer=utm_source%3Dtsf_keyboard");
                    com.ksmobile.launcher.a.a.b.a(false, "tsflauncher_keyboard_click", "click", "1");
                    return;
                case 100:
                    com.tsf.shell.manager.a.h.s().h();
                    return;
                case VEasing.Back.easeIn /* 200 */:
                    ThemeManager.mix.ui.show(1);
                    return;
                case 300:
                    if (com.tsf.shell.manager.a.h.E()) {
                        com.tsf.shell.manager.a.h.t().c(1);
                        return;
                    } else {
                        com.tsf.shell.manager.a.h.j().show();
                        return;
                    }
                case VEasing.Linear.easeNone /* 400 */:
                    SettingGesturePreferenceActivity.a();
                    return;
                case 500:
                    com.tsf.shell.manager.a.h.t().al();
                    return;
                case 600:
                    com.tsf.shell.f.b.a();
                    return;
                case 700:
                    com.tsf.shell.manager.a.B.e().d();
                    return;
                case 800:
                    com.tsf.shell.manager.a.B.b().d();
                    return;
                case 900:
                    com.tsf.shell.manager.a.B.f().d();
                    return;
                case 1000:
                    com.tsf.shell.manager.a.B.d().d();
                    return;
                case 1100:
                    com.tsf.shell.manager.a.r.a();
                    return;
                case 1200:
                    com.tsf.shell.manager.a.B.g().d();
                    return;
                case 1300:
                    SettingAdvancedPerferenceActivity.a();
                    return;
                case 1400:
                    com.tsf.shell.manager.a.B.a().d();
                    return;
                case 1500:
                    com.tsf.shell.manager.a.B.h().d();
                    return;
                case 1600:
                    Intent intent = new Intent();
                    intent.setClass(com.censivn.C3DEngine.a.d(), ShellSummaryActivity.class);
                    Home.b().a(intent, (Object) null);
                    return;
                case 1700:
                    com.tsf.shell.manager.a.f.a().show();
                    return;
                case 1800:
                    com.tsf.shell.manager.a.B.c().d();
                    return;
                case ACRAConstants.DEFAULT_SOCKET_TIMEOUT /* 5000 */:
                    com.tsf.shell.manager.a.D.a();
                    return;
            }
        }
    }

    public static void a(LauncherShortcut3DInfo launcherShortcut3DInfo, int i) {
        Intent.ShortcutIconResource shortcutIconResource = launcherShortcut3DInfo.iconResource;
        switch (i) {
            case 0:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_none);
                return;
            case 2:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_homescreen);
                return;
            case 3:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_drawer_homescreen);
                return;
            case 4:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_toggle_notification_bar);
                return;
            case 5:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_expand_notification_bar);
                return;
            case 7:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_search);
                return;
            case 8:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_voice);
                return;
            case 11:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_lasso_mode);
                return;
            case 12:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_add);
                return;
            case 13:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_multi_choice);
                return;
            case 14:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_desktop_editor);
                return;
            case 15:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_restart);
                return;
            case 16:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_toggle_dock);
                return;
            case 17:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_toggle_sliding_dock);
                return;
            case 18:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_expand_side_menu);
                return;
            case 19:
                shortcutIconResource.resourceName = String.valueOf(b.d.cml_theme);
                return;
            case 20:
                shortcutIconResource.resourceName = String.valueOf(b.d.cml_panda);
                return;
            case 100:
            case 500:
            case 1000:
                return;
            case VEasing.Back.easeIn /* 200 */:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_theme);
                return;
            case 300:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_desktop_effect);
                return;
            case VEasing.Linear.easeNone /* 400 */:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_gesture);
                return;
            case 600:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_snow_icon);
                return;
            case 700:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_screen_scale);
                return;
            case 800:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_dock);
                return;
            case 900:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_side_menu);
                return;
            case 1100:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_unread);
                return;
            case 1200:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_backup);
                return;
            case 1300:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_advanced);
                return;
            case 1400:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_about);
                return;
            case 1500:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_desktop);
                return;
            case 1600:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_demo);
                return;
            case 1700:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_wallpaper);
                return;
            case ACRAConstants.DEFAULT_CONNECTION_TIMEOUT /* 3000 */:
                shortcutIconResource.resourceName = String.valueOf(b.d.default_icon_phone);
                return;
            case 3001:
                shortcutIconResource.resourceName = String.valueOf(b.d.default_icon_sms);
                return;
            case 3002:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_wallpaper);
                return;
            default:
                shortcutIconResource.resourceName = String.valueOf(b.d.tsf_ico);
                return;
        }
    }

    public static a b(int i) {
        a aVar = new a();
        aVar.a = i;
        switch (i) {
            case 0:
                aVar.b = com.tsf.shell.utils.x.c(b.i.none);
                aVar.c = b.d.ic_action_none;
                break;
            case 2:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_home_screen);
                aVar.c = b.d.ic_action_homescreen;
                break;
            case 3:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_switch_appdrawer_homescreen);
                aVar.c = b.d.ic_action_drawer_homescreen;
                break;
            case 4:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_toggle_notification_bar);
                aVar.c = b.d.ic_action_toggle_notification_bar;
                break;
            case 5:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_expand_notification_bar);
                aVar.c = b.d.ic_action_expand_notification_bar;
                break;
            case 7:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_text_search);
                aVar.c = b.d.ic_action_search;
                aVar.d = "ic_action_toggle_dock";
                break;
            case 8:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_voice_search);
                aVar.c = b.d.ic_action_voice;
                break;
            case 11:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_lasso_mode);
                aVar.c = b.d.shortcut_lasso_mode;
                aVar.d = ThemeShellDescription.SHORTCUT_LASSO_MODE;
                break;
            case 12:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_add);
                aVar.c = b.d.shortcut_add;
                aVar.d = ThemeShellDescription.SHORTCUT_ADD;
                break;
            case 13:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_multiple_choice);
                aVar.c = b.d.shortcut_multi_choice;
                aVar.d = ThemeShellDescription.SHORTCUT_MULTI_CHOICE;
                break;
            case 14:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_desktop_editor);
                aVar.c = b.d.shortcut_desktop_editor;
                aVar.d = ThemeShellDescription.SHORTCUT_DESKTOP_EDITOR;
                break;
            case 15:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_restart);
                aVar.c = b.d.shortcut_restart;
                aVar.d = ThemeShellDescription.SHORTCUT_RESTART;
                break;
            case 16:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_toggle_dock);
                aVar.c = b.d.ic_action_toggle_dock;
                break;
            case 17:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_toggle_sliding_dock);
                aVar.c = b.d.ic_action_toggle_sliding_dock;
                break;
            case 18:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_expand_side_menu);
                aVar.c = b.d.ic_action_expand_side_menu;
                break;
            case 19:
                aVar.b = com.tsf.shell.utils.x.c(b.i.theme);
                aVar.c = b.d.cml_theme;
                break;
            case 20:
                aVar.b = com.tsf.shell.utils.x.c(b.i.panda);
                aVar.c = b.d.cml_panda;
                break;
            case 100:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_app_drawer);
                break;
            case VEasing.Back.easeIn /* 200 */:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_theme);
                aVar.c = b.d.shortcut_theme;
                aVar.d = ThemeShellDescription.SHORTCUT_THEME;
                break;
            case 300:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_setting_effect);
                aVar.c = b.d.shortcut_desktop_effect;
                aVar.d = ThemeShellDescription.SHORTCUT_DESKTOP_EFFECT;
                break;
            case VEasing.Linear.easeNone /* 400 */:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_gestures);
                aVar.c = b.d.shortcut_gesture;
                aVar.d = ThemeShellDescription.SHORTCUT_GESTURE;
                break;
            case 500:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_all_apps);
                break;
            case 600:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_floating);
                aVar.c = b.d.shortcut_snow_icon;
                break;
            case 700:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_screen_scale);
                aVar.c = b.d.shortcut_screen_scale;
                aVar.d = ThemeShellDescription.SHORTCUT_SCALE;
                break;
            case 800:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_dock);
                aVar.c = b.d.shortcut_dock;
                aVar.d = ThemeShellDescription.SHORTCUT_DOCK;
                break;
            case 900:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_side_menu);
                aVar.c = b.d.shortcut_side_menu;
                aVar.d = ThemeShellDescription.SHORTCUT_SIDE_MENU;
                break;
            case 1000:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_drawer);
                break;
            case 1100:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_unread_count);
                aVar.c = b.d.shortcut_unread;
                aVar.d = ThemeShellDescription.SHORTCUT_UNREAD;
                break;
            case 1200:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_backup);
                aVar.c = b.d.shortcut_backup;
                aVar.d = ThemeShellDescription.SHORTCUT_BACKUP;
                break;
            case 1300:
                aVar.b = com.tsf.shell.utils.x.c(b.i.advanced_setting);
                aVar.c = b.d.shortcut_advanced;
                aVar.d = ThemeShellDescription.SHORTCUT_ADVANCED;
                break;
            case 1400:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_about);
                aVar.c = b.d.shortcut_about;
                aVar.d = ThemeShellDescription.SHORTCUT_ABOUT;
                break;
            case 1500:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_screen);
                aVar.c = b.d.shortcut_desktop;
                aVar.d = ThemeShellDescription.SHORTCUT_DESKTOP;
                break;
            case 1600:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_demo);
                aVar.c = b.d.shortcut_demo;
                aVar.d = ThemeShellDescription.SHORTCUT_DEMO;
                break;
            case 1700:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_wallpaper);
                aVar.c = b.d.shortcut_wallpaper;
                aVar.d = ThemeShellDescription.SHORTCUT_WALLPAPER;
                break;
            case ACRAConstants.DEFAULT_CONNECTION_TIMEOUT /* 3000 */:
                aVar.b = "Phone";
                aVar.c = b.d.default_icon_phone;
                break;
            case 3001:
                aVar.b = "Messaging";
                aVar.c = b.d.default_icon_sms;
                break;
            case 3002:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_wallpaper);
                aVar.c = b.d.shortcut_wallpaper;
                break;
            default:
                aVar.b = com.tsf.shell.utils.x.c(b.i.none);
                aVar.c = b.d.tsf_ico;
                break;
        }
        return aVar;
    }

    public static void a(a aVar) {
        aVar.e = new Intent("android.intent.action.MAIN");
        aVar.e.addCategory("android.intent.category.LAUNCHER");
        aVar.e.setComponent(new ComponentName(com.censivn.C3DEngine.a.b(), Home.class.getName()));
        aVar.e.setFlags(270532608);
    }
}
