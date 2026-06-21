package com.tsf.shell.manager.action;

import android.content.ComponentName;
import android.content.Intent;
import com.censivn.C3DEngine.a.i;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.plugin.summary.ShellSummaryActivity;
import com.tsf.shell.preference.SettingAdvancedPerferenceActivity;
import com.tsf.shell.preference.SettingGesturePreferenceActivity;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import org.acra.ACRAConstants;

/* loaded from: classes.dex */
public class b {
    public int b = 0;
    public com.tsf.shell.manager.action.toggle.a c = new com.tsf.shell.manager.action.toggle.a();
    public ArrayList a = a(false);

    public b() {
        com.tsf.shell.manager.a.s.a(new com.censivn.C3DEngine.b.c.h() { // from class: com.tsf.shell.manager.action.b.1
            @Override // com.censivn.C3DEngine.b.c.h
            public void a() {
                if (b.this.b != 0) {
                    b.this.a(b.this.b);
                    b.this.b = 0;
                }
            }
        });
    }

    public ArrayList a() {
        return this.a;
    }

    public static ArrayList a(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(b(0));
        }
        arrayList.add(b(100));
        c b = b(500);
        if (z) {
            b.c = R.drawable.allapps_icon;
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
        if (!i.l()) {
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
                    break;
                }
                break;
            case 13:
                if (com.tsf.shell.manager.a.h.E()) {
                    com.tsf.shell.manager.a.h.t().c(0);
                    break;
                } else {
                    com.tsf.shell.manager.a.h.Q();
                    break;
                }
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
            case 100:
                com.tsf.shell.manager.a.h.s().h();
                break;
            case VEasing.Back.easeIn /* 200 */:
                ThemeManager.mix.ui.show(1);
                break;
            case 300:
                if (com.tsf.shell.manager.a.h.E()) {
                    com.tsf.shell.manager.a.h.t().c(1);
                    break;
                } else {
                    com.tsf.shell.manager.a.h.j().show();
                    break;
                }
            case VEasing.Linear.easeNone /* 400 */:
                SettingGesturePreferenceActivity.a();
                break;
            case 500:
                com.tsf.shell.manager.a.h.t().al();
                break;
            case 600:
                com.tsf.shell.e.b.a();
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

    public static c b(int i) {
        c cVar = new c();
        cVar.a = i;
        switch (i) {
            case 0:
                cVar.b = x.c(R.string.none);
                cVar.c = R.drawable.ic_action_none;
                return cVar;
            case 2:
                cVar.b = x.c(R.string.mn_action_home_screen);
                cVar.c = R.drawable.ic_action_homescreen;
                return cVar;
            case 3:
                cVar.b = x.c(R.string.mn_action_switch_appdrawer_homescreen);
                cVar.c = R.drawable.ic_action_drawer_homescreen;
                return cVar;
            case 4:
                cVar.b = x.c(R.string.mn_action_toggle_notification_bar);
                cVar.c = R.drawable.ic_action_toggle_notification_bar;
                return cVar;
            case 5:
                cVar.b = x.c(R.string.mn_action_expand_notification_bar);
                cVar.c = R.drawable.ic_action_expand_notification_bar;
                return cVar;
            case 7:
                cVar.b = x.c(R.string.mn_action_text_search);
                cVar.c = R.drawable.ic_action_search;
                cVar.d = "ic_action_toggle_dock";
                return cVar;
            case 8:
                cVar.b = x.c(R.string.mn_action_voice_search);
                cVar.c = R.drawable.ic_action_voice;
                return cVar;
            case 11:
                cVar.b = x.c(R.string.mn_action_lasso_mode);
                cVar.c = R.drawable.shortcut_lasso_mode;
                cVar.d = ThemeShellDescription.SHORTCUT_LASSO_MODE;
                return cVar;
            case 12:
                cVar.b = x.c(R.string.menu_add);
                cVar.c = R.drawable.shortcut_add;
                cVar.d = ThemeShellDescription.SHORTCUT_ADD;
                return cVar;
            case 13:
                cVar.b = x.c(R.string.menu_multiple_choice);
                cVar.c = R.drawable.shortcut_multi_choice;
                cVar.d = ThemeShellDescription.SHORTCUT_MULTI_CHOICE;
                return cVar;
            case 14:
                cVar.b = x.c(R.string.menu_desktop_editor);
                cVar.c = R.drawable.shortcut_desktop_editor;
                cVar.d = ThemeShellDescription.SHORTCUT_DESKTOP_EDITOR;
                return cVar;
            case 15:
                cVar.b = x.c(R.string.text_restart);
                cVar.c = R.drawable.shortcut_restart;
                cVar.d = ThemeShellDescription.SHORTCUT_RESTART;
                return cVar;
            case 16:
                cVar.b = x.c(R.string.mn_action_toggle_dock);
                cVar.c = R.drawable.ic_action_toggle_dock;
                return cVar;
            case 17:
                cVar.b = x.c(R.string.mn_action_toggle_sliding_dock);
                cVar.c = R.drawable.ic_action_toggle_sliding_dock;
                return cVar;
            case 18:
                cVar.b = x.c(R.string.mn_action_expand_side_menu);
                cVar.c = R.drawable.ic_action_expand_side_menu;
                return cVar;
            case 100:
                cVar.b = x.c(R.string.mn_action_app_drawer);
                return cVar;
            case VEasing.Back.easeIn /* 200 */:
                cVar.b = x.c(R.string.menu_theme);
                cVar.c = R.drawable.shortcut_theme;
                cVar.d = ThemeShellDescription.SHORTCUT_THEME;
                return cVar;
            case 300:
                cVar.b = x.c(R.string.menu_setting_effect);
                cVar.c = R.drawable.shortcut_desktop_effect;
                cVar.d = ThemeShellDescription.SHORTCUT_DESKTOP_EFFECT;
                return cVar;
            case VEasing.Linear.easeNone /* 400 */:
                cVar.b = x.c(R.string.menu_gestures);
                cVar.c = R.drawable.shortcut_gesture;
                cVar.d = ThemeShellDescription.SHORTCUT_GESTURE;
                return cVar;
            case 500:
                cVar.b = x.c(R.string.text_all_apps);
                return cVar;
            case 600:
                cVar.b = x.c(R.string.text_floating);
                cVar.c = R.drawable.shortcut_snow_icon;
                return cVar;
            case 700:
                cVar.b = x.c(R.string.text_screen_scale);
                cVar.c = R.drawable.shortcut_screen_scale;
                cVar.d = ThemeShellDescription.SHORTCUT_SCALE;
                return cVar;
            case 800:
                cVar.b = x.c(R.string.mn_dock);
                cVar.c = R.drawable.shortcut_dock;
                cVar.d = ThemeShellDescription.SHORTCUT_DOCK;
                return cVar;
            case 900:
                cVar.b = x.c(R.string.text_side_menu);
                cVar.c = R.drawable.shortcut_side_menu;
                cVar.d = ThemeShellDescription.SHORTCUT_SIDE_MENU;
                return cVar;
            case 1000:
                cVar.b = x.c(R.string.mn_drawer);
                return cVar;
            case 1100:
                cVar.b = x.c(R.string.mn_unread_count);
                cVar.c = R.drawable.shortcut_unread;
                cVar.d = ThemeShellDescription.SHORTCUT_UNREAD;
                return cVar;
            case 1200:
                cVar.b = x.c(R.string.mn_backup);
                cVar.c = R.drawable.shortcut_backup;
                cVar.d = ThemeShellDescription.SHORTCUT_BACKUP;
                return cVar;
            case 1300:
                cVar.b = x.c(R.string.advanced_setting);
                cVar.c = R.drawable.shortcut_advanced;
                cVar.d = ThemeShellDescription.SHORTCUT_ADVANCED;
                return cVar;
            case 1400:
                cVar.b = x.c(R.string.mn_about);
                cVar.c = R.drawable.shortcut_about;
                cVar.d = ThemeShellDescription.SHORTCUT_ABOUT;
                return cVar;
            case 1500:
                cVar.b = x.c(R.string.mn_screen);
                cVar.c = R.drawable.shortcut_desktop;
                cVar.d = ThemeShellDescription.SHORTCUT_DESKTOP;
                return cVar;
            case 1600:
                cVar.b = x.c(R.string.text_demo);
                cVar.c = R.drawable.shortcut_demo;
                cVar.d = ThemeShellDescription.SHORTCUT_DEMO;
                return cVar;
            case 1700:
                cVar.b = x.c(R.string.mn_wallpaper);
                cVar.c = R.drawable.shortcut_wallpaper;
                cVar.d = ThemeShellDescription.SHORTCUT_WALLPAPER;
                return cVar;
            case ACRAConstants.DEFAULT_CONNECTION_TIMEOUT /* 3000 */:
                cVar.b = "Phone";
                cVar.c = R.drawable.default_icon_phone;
                return cVar;
            case 3001:
                cVar.b = "Messaging";
                cVar.c = R.drawable.default_icon_sms;
                return cVar;
            case 3002:
                cVar.b = x.c(R.string.mn_wallpaper);
                cVar.c = R.drawable.shortcut_wallpaper;
                return cVar;
            default:
                cVar.b = x.c(R.string.none);
                cVar.c = R.drawable.tsf_ico;
                return cVar;
        }
    }

    public static void a(c cVar) {
        cVar.e = new Intent("android.intent.action.MAIN");
        cVar.e.addCategory("android.intent.category.LAUNCHER");
        cVar.e.setComponent(new ComponentName(com.censivn.C3DEngine.a.b(), Home.class.getName()));
        cVar.e.setFlags(270532608);
    }
}
