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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    public int b = 0;
    public com.tsf.shell.manager.action.toggle.a c = new com.tsf.shell.manager.action.toggle.a();
    public ArrayList<a> a = a(false);

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
        a aVarB = b(500);
        if (z) {
            aVarB.c = b.d.allapps_icon;
        }
        arrayList.add(aVarB);
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
        int i = Integer.parseInt(str.substring(6, str.length()));
        if (i > 10000) {
            this.c.a(i);
        } else {
            a(i);
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
        }
        if (com.tsf.shell.manager.a.s.b() && !z) {
            this.b = i;
            com.tsf.shell.manager.a.s.a();
            return;
        }
        switch (i) {
            case 2:
                com.tsf.shell.manager.a.h.z();
                break;
            case 3:
                com.tsf.shell.manager.a.h.A();
                break;
            case 4:
                com.tsf.shell.manager.a.b.d();
                break;
            case 5:
                com.tsf.shell.manager.a.b.e();
                break;
            case 7:
                Home.b().a(new Intent("android.search.action.GLOBAL_SEARCH"), (Object) null);
                break;
            case 8:
                Home.b().a(new Intent("android.speech.action.WEB_SEARCH"), (Object) null);
                break;
            case 11:
                com.tsf.shell.manager.a.h.R();
                break;
            case 12:
                if (!com.tsf.shell.manager.a.h.E()) {
                    com.tsf.shell.manager.a.i.a.show();
                }
                break;
            case 13:
                if (com.tsf.shell.manager.a.h.E()) {
                    com.tsf.shell.manager.a.h.t().c(0);
                } else {
                    com.tsf.shell.manager.a.h.Q();
                }
                break;
            case 14:
                com.tsf.shell.manager.a.h.L();
                break;
            case 15:
                Home.b().a(500);
                break;
            case 16:
                com.tsf.shell.manager.a.g.a.k();
                break;
            case 17:
                com.tsf.shell.manager.a.g.b.c();
                break;
            case 18:
                com.tsf.shell.manager.a.n.c(true);
                break;
            case 19:
                PersonalizationActivity.a(Home.b(), "1", "theme_push_notifition_invalid", null, true);
                com.ksmobile.launcher.a.a.b.a(false, "tsflauncher_themecenter_click", "click", "1");
                break;
            case 20:
                x.b(Home.b(), "https://play.google.com/store/apps/details?id=panda.keyboard.emoji.theme", "&referrer=utm_source%3Dtsf_keyboard");
                com.ksmobile.launcher.a.a.b.a(false, "tsflauncher_keyboard_click", "click", "1");
                break;
            case 100:
                com.tsf.shell.manager.a.h.s().h();
                break;
            case VEasing.Back.easeIn /* 200 */:
                ThemeManager.mix.ui.show(1);
                break;
            case 300:
                if (com.tsf.shell.manager.a.h.E()) {
                    com.tsf.shell.manager.a.h.t().c(1);
                } else {
                    com.tsf.shell.manager.a.h.j().show();
                }
                break;
            case VEasing.Linear.easeNone /* 400 */:
                SettingGesturePreferenceActivity.a();
                break;
            case 500:
                com.tsf.shell.manager.a.h.t().al();
                break;
            case 600:
                com.tsf.shell.f.b.a();
                break;
            case 700:
                com.tsf.shell.manager.a.B.e().d();
                break;
            case 800:
                com.tsf.shell.manager.a.B.b().d();
                break;
            case 900:
                com.tsf.shell.manager.a.B.f().d();
                break;
            case 1000:
                com.tsf.shell.manager.a.B.d().d();
                break;
            case 1100:
                com.tsf.shell.manager.a.r.a();
                break;
            case 1200:
                com.tsf.shell.manager.a.B.g().d();
                break;
            case 1300:
                SettingAdvancedPerferenceActivity.a();
                break;
            case 1400:
                com.tsf.shell.manager.a.B.a().d();
                break;
            case 1500:
                com.tsf.shell.manager.a.B.h().d();
                break;
            case 1600:
                Intent intent = new Intent();
                intent.setClass(com.censivn.C3DEngine.a.d(), ShellSummaryActivity.class);
                Home.b().a(intent, (Object) null);
                break;
            case 1700:
                com.tsf.shell.manager.a.f.a().show();
                break;
            case 1800:
                com.tsf.shell.manager.a.B.c().d();
                break;
            case ACRAConstants.DEFAULT_SOCKET_TIMEOUT /* 5000 */:
                com.tsf.shell.manager.a.D.a();
                break;
        }
    }

    public static void a(LauncherShortcut3DInfo launcherShortcut3DInfo, int i) {
        Intent.ShortcutIconResource shortcutIconResource = launcherShortcut3DInfo.iconResource;
        switch (i) {
            case 0:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_none);
                break;
            case 2:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_homescreen);
                break;
            case 3:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_drawer_homescreen);
                break;
            case 4:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_toggle_notification_bar);
                break;
            case 5:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_expand_notification_bar);
                break;
            case 7:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_search);
                break;
            case 8:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_voice);
                break;
            case 11:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_lasso_mode);
                break;
            case 12:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_add);
                break;
            case 13:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_multi_choice);
                break;
            case 14:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_desktop_editor);
                break;
            case 15:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_restart);
                break;
            case 16:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_toggle_dock);
                break;
            case 17:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_toggle_sliding_dock);
                break;
            case 18:
                shortcutIconResource.resourceName = String.valueOf(b.d.ic_action_expand_side_menu);
                break;
            case 19:
                shortcutIconResource.resourceName = String.valueOf(b.d.cml_theme);
                break;
            case 20:
                shortcutIconResource.resourceName = String.valueOf(b.d.cml_panda);
                break;
            case 100:
            case 500:
            case 1000:
                break;
            case VEasing.Back.easeIn /* 200 */:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_theme);
                break;
            case 300:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_desktop_effect);
                break;
            case VEasing.Linear.easeNone /* 400 */:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_gesture);
                break;
            case 600:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_snow_icon);
                break;
            case 700:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_screen_scale);
                break;
            case 800:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_dock);
                break;
            case 900:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_side_menu);
                break;
            case 1100:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_unread);
                break;
            case 1200:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_backup);
                break;
            case 1300:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_advanced);
                break;
            case 1400:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_about);
                break;
            case 1500:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_desktop);
                break;
            case 1600:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_demo);
                break;
            case 1700:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_wallpaper);
                break;
            case ACRAConstants.DEFAULT_CONNECTION_TIMEOUT /* 3000 */:
                shortcutIconResource.resourceName = String.valueOf(b.d.default_icon_phone);
                break;
            case 3001:
                shortcutIconResource.resourceName = String.valueOf(b.d.default_icon_sms);
                break;
            case 3002:
                shortcutIconResource.resourceName = String.valueOf(b.d.shortcut_wallpaper);
                break;
            default:
                shortcutIconResource.resourceName = String.valueOf(b.d.tsf_ico);
                break;
        }
    }

    public static a b(int i) {
        a aVar = new a();
        aVar.a = i;
        switch (i) {
            case 0:
                aVar.b = com.tsf.shell.utils.x.c(b.i.none);
                aVar.c = b.d.ic_action_none;
                return aVar;
            case 2:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_home_screen);
                aVar.c = b.d.ic_action_homescreen;
                return aVar;
            case 3:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_switch_appdrawer_homescreen);
                aVar.c = b.d.ic_action_drawer_homescreen;
                return aVar;
            case 4:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_toggle_notification_bar);
                aVar.c = b.d.ic_action_toggle_notification_bar;
                return aVar;
            case 5:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_expand_notification_bar);
                aVar.c = b.d.ic_action_expand_notification_bar;
                return aVar;
            case 7:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_text_search);
                aVar.c = b.d.ic_action_search;
                aVar.d = "ic_action_toggle_dock";
                return aVar;
            case 8:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_voice_search);
                aVar.c = b.d.ic_action_voice;
                return aVar;
            case 11:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_lasso_mode);
                aVar.c = b.d.shortcut_lasso_mode;
                aVar.d = ThemeShellDescription.SHORTCUT_LASSO_MODE;
                return aVar;
            case 12:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_add);
                aVar.c = b.d.shortcut_add;
                aVar.d = ThemeShellDescription.SHORTCUT_ADD;
                return aVar;
            case 13:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_multiple_choice);
                aVar.c = b.d.shortcut_multi_choice;
                aVar.d = ThemeShellDescription.SHORTCUT_MULTI_CHOICE;
                return aVar;
            case 14:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_desktop_editor);
                aVar.c = b.d.shortcut_desktop_editor;
                aVar.d = ThemeShellDescription.SHORTCUT_DESKTOP_EDITOR;
                return aVar;
            case 15:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_restart);
                aVar.c = b.d.shortcut_restart;
                aVar.d = ThemeShellDescription.SHORTCUT_RESTART;
                return aVar;
            case 16:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_toggle_dock);
                aVar.c = b.d.ic_action_toggle_dock;
                return aVar;
            case 17:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_toggle_sliding_dock);
                aVar.c = b.d.ic_action_toggle_sliding_dock;
                return aVar;
            case 18:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_expand_side_menu);
                aVar.c = b.d.ic_action_expand_side_menu;
                return aVar;
            case 19:
                aVar.b = com.tsf.shell.utils.x.c(b.i.theme);
                aVar.c = b.d.cml_theme;
                return aVar;
            case 20:
                aVar.b = com.tsf.shell.utils.x.c(b.i.panda);
                aVar.c = b.d.cml_panda;
                return aVar;
            case 100:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_action_app_drawer);
                return aVar;
            case VEasing.Back.easeIn /* 200 */:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_theme);
                aVar.c = b.d.shortcut_theme;
                aVar.d = ThemeShellDescription.SHORTCUT_THEME;
                return aVar;
            case 300:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_setting_effect);
                aVar.c = b.d.shortcut_desktop_effect;
                aVar.d = ThemeShellDescription.SHORTCUT_DESKTOP_EFFECT;
                return aVar;
            case VEasing.Linear.easeNone /* 400 */:
                aVar.b = com.tsf.shell.utils.x.c(b.i.menu_gestures);
                aVar.c = b.d.shortcut_gesture;
                aVar.d = ThemeShellDescription.SHORTCUT_GESTURE;
                return aVar;
            case 500:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_all_apps);
                return aVar;
            case 600:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_floating);
                aVar.c = b.d.shortcut_snow_icon;
                return aVar;
            case 700:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_screen_scale);
                aVar.c = b.d.shortcut_screen_scale;
                aVar.d = ThemeShellDescription.SHORTCUT_SCALE;
                return aVar;
            case 800:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_dock);
                aVar.c = b.d.shortcut_dock;
                aVar.d = ThemeShellDescription.SHORTCUT_DOCK;
                return aVar;
            case 900:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_side_menu);
                aVar.c = b.d.shortcut_side_menu;
                aVar.d = ThemeShellDescription.SHORTCUT_SIDE_MENU;
                return aVar;
            case 1000:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_drawer);
                return aVar;
            case 1100:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_unread_count);
                aVar.c = b.d.shortcut_unread;
                aVar.d = ThemeShellDescription.SHORTCUT_UNREAD;
                return aVar;
            case 1200:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_backup);
                aVar.c = b.d.shortcut_backup;
                aVar.d = ThemeShellDescription.SHORTCUT_BACKUP;
                return aVar;
            case 1300:
                aVar.b = com.tsf.shell.utils.x.c(b.i.advanced_setting);
                aVar.c = b.d.shortcut_advanced;
                aVar.d = ThemeShellDescription.SHORTCUT_ADVANCED;
                return aVar;
            case 1400:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_about);
                aVar.c = b.d.shortcut_about;
                aVar.d = ThemeShellDescription.SHORTCUT_ABOUT;
                return aVar;
            case 1500:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_screen);
                aVar.c = b.d.shortcut_desktop;
                aVar.d = ThemeShellDescription.SHORTCUT_DESKTOP;
                return aVar;
            case 1600:
                aVar.b = com.tsf.shell.utils.x.c(b.i.text_demo);
                aVar.c = b.d.shortcut_demo;
                aVar.d = ThemeShellDescription.SHORTCUT_DEMO;
                return aVar;
            case 1700:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_wallpaper);
                aVar.c = b.d.shortcut_wallpaper;
                aVar.d = ThemeShellDescription.SHORTCUT_WALLPAPER;
                return aVar;
            case ACRAConstants.DEFAULT_CONNECTION_TIMEOUT /* 3000 */:
                aVar.b = "Phone";
                aVar.c = b.d.default_icon_phone;
                return aVar;
            case 3001:
                aVar.b = "Messaging";
                aVar.c = b.d.default_icon_sms;
                return aVar;
            case 3002:
                aVar.b = com.tsf.shell.utils.x.c(b.i.mn_wallpaper);
                aVar.c = b.d.shortcut_wallpaper;
                return aVar;
            default:
                aVar.b = com.tsf.shell.utils.x.c(b.i.none);
                aVar.c = b.d.tsf_ico;
                return aVar;
        }
    }

    public static void a(a aVar) {
        aVar.e = new Intent("android.intent.action.MAIN");
        aVar.e.addCategory("android.intent.category.LAUNCHER");
        aVar.e.setComponent(new ComponentName(com.censivn.C3DEngine.a.b(), Home.class.getName()));
        aVar.e.setFlags(270532608);
    }
}
