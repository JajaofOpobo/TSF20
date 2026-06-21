package com.tsf.shell.manager.b;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.R;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.utils.x;
import com.tsf.shell.utils.y;

/* loaded from: classes.dex */
public class g {
    private static boolean A;
    private static boolean B;
    private static int C;
    private static boolean D;
    private static SharedPreferences E;
    private static int f;
    private static float g;
    private static float h;
    private static float i;
    private static float j;
    private static float k;
    private static float l;
    private static float o;
    private static float p;
    private static float q;
    private static float r;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private static boolean a = true;
    private static boolean b = true;
    private static boolean c = true;
    private static boolean d = true;
    private static int e = 1;
    private static int m = 0;
    private static int n = 0;
    private static boolean s = false;
    private static boolean t = false;
    private static boolean u = false;
    private static boolean v = true;

    public static void a() {
        if (K() < 110) {
            SharedPreferences.Editor aA = aA();
            aA.remove("effect_desktop_border_state");
            aA.remove("effect_desktop_transition_random_state");
            aA.remove("effect_desktop_transition");
            aA.commit();
        }
        aF();
        aE();
        Y();
        s();
        ad();
        ab();
        W();
        aH();
        aD();
        aI();
        L();
        aG();
    }

    private static void aD() {
        d = aB().getBoolean("screen_infinite_scroll", true);
    }

    private static void aE() {
        g = aB().getFloat("slinding_dock_v_width", 0.0f);
        h = aB().getFloat("slinding_dock_h_width", 0.0f);
        i = aB().getFloat("slinding_dock_position_v_x", 0.0f);
        j = aB().getFloat("slinding_dock_position_v_y", 0.0f);
        k = aB().getFloat("slinding_dock_position_h_x", 0.0f);
        l = aB().getFloat("slinding_dock_position_h_y", 0.0f);
    }

    public static int b() {
        return y.a(aB().getInt("slinding_dock_button_transparency_precent", 50));
    }

    public static void a(int i2) {
        int a2 = y.a(i2);
        SharedPreferences.Editor aA = aA();
        aA.putInt("slinding_dock_button_transparency_precent", a2);
        aA.commit();
    }

    public static void a(float f2) {
        g = f2;
        SharedPreferences.Editor aA = aA();
        aA.putFloat("slinding_dock_v_width", f2);
        aA.commit();
    }

    public static void b(float f2) {
        h = f2;
        SharedPreferences.Editor aA = aA();
        aA.putFloat("slinding_dock_h_width", f2);
        aA.commit();
    }

    public static float c() {
        return g;
    }

    public static float d() {
        return h;
    }

    public static void a(float f2, float f3) {
        i = f2;
        j = f3;
        SharedPreferences.Editor aA = aA();
        aA.putFloat("slinding_dock_position_v_x", f2);
        aA.putFloat("slinding_dock_position_v_y", f3);
        aA.commit();
    }

    public static void b(float f2, float f3) {
        k = f2;
        l = f3;
        SharedPreferences.Editor aA = aA();
        aA.putFloat("slinding_dock_position_h_x", f2);
        aA.putFloat("slinding_dock_position_h_y", f3);
        aA.commit();
    }

    public static void a(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("slinding_dock_hidden", z2);
        aA.commit();
    }

    public static boolean e() {
        return aB().getBoolean("slinding_dock_hidden", true);
    }

    public static Number3d f() {
        Number3d.TEMPNUMBER3D3.x = i;
        Number3d.TEMPNUMBER3D3.y = j;
        return Number3d.TEMPNUMBER3D3;
    }

    public static Number3d g() {
        Number3d.TEMPNUMBER3D3.x = k;
        Number3d.TEMPNUMBER3D3.y = l;
        return Number3d.TEMPNUMBER3D3;
    }

    public static void b(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("side_menu_state", z2);
        aA.commit();
    }

    public static boolean h() {
        return aB().getBoolean("side_menu_state", true);
    }

    public static void b(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("side_menu_direction", i2);
        aA.commit();
    }

    public static int i() {
        return aB().getInt("side_menu_direction", 0);
    }

    public static float j() {
        return aB().getFloat("side_menu_toggle_vertical_position", 0.4f);
    }

    public static void c(float f2) {
        SharedPreferences.Editor aA = aA();
        aA.putFloat("side_menu_toggle_vertical_position", f2);
        aA.commit();
    }

    public static float k() {
        return aB().getFloat("side_menu_toggle_horizontal_position", 0.4f);
    }

    public static void d(float f2) {
        SharedPreferences.Editor aA = aA();
        aA.putFloat("side_menu_toggle_horizontal_position", f2);
        aA.commit();
    }

    public static String l() {
        return aB().getString("video_version_name", "1.0.0");
    }

    public static void a(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("video_version_name", str);
        aA.commit();
    }

    public static boolean m() {
        return aB().getBoolean("effect_icon_click_random_state", false);
    }

    public static void c(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("effect_icon_click_random_state", z2);
        aA.commit();
    }

    public static String n() {
        return aB().getString("effect_icon_click", "10");
    }

    public static void b(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("effect_icon_click", str);
        aA.commit();
    }

    public static int o() {
        return aB().getInt("shake_animation_type", 1);
    }

    public static void c(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("shake_animation_type", i2);
        aA.commit();
    }

    public static String p() {
        return aB().getString("tips_configuration", "");
    }

    public static void c(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("tips_configuration", str);
        aA.commit();
    }

    public static boolean q() {
        return aB().getBoolean("desktop_lock", false);
    }

    public static void a(Boolean bool) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("desktop_lock", bool.booleanValue());
        aA.commit();
    }

    public static void d(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("desktop_relock", z2);
        aA.commit();
    }

    public static boolean r() {
        return aB().getBoolean("desktop_relock", true);
    }

    public static void s() {
        m = aB().getInt("static_dock_vertical_width_margin_precent", 0);
        m = y.a(m);
        n = aB().getInt("static_dock_horizontal_width_margin_precent", 0);
        n = y.a(n);
    }

    public static int t() {
        return m;
    }

    public static int u() {
        return n;
    }

    public static void d(int i2) {
        int a2 = y.a(i2);
        m = a2;
        SharedPreferences.Editor aA = aA();
        aA.putInt("static_dock_vertical_width_margin_precent", a2);
        aA.commit();
    }

    public static void e(int i2) {
        int a2 = y.a(i2);
        n = a2;
        SharedPreferences.Editor aA = aA();
        aA.putInt("static_dock_horizontal_width_margin_precent", a2);
        aA.commit();
    }

    public static void e(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("static_dock_hidden", z2);
        aA.commit();
    }

    public static void f(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("dock_mode", i2);
        aA.commit();
    }

    public static int v() {
        return aB().getInt("dock_mode", 0);
    }

    private static void aF() {
        o = aB().getFloat("smart_button_position_vertical_x", 0.0f);
        p = aB().getFloat("smart_button_position_vertical_y", 0.0f);
        q = aB().getFloat("smart_button_position_horizontal_x", 0.0f);
        r = aB().getFloat("smart_button_position_horizontal_y", 0.0f);
    }

    public static void c(float f2, float f3) {
        o = f2;
        p = f3;
        SharedPreferences.Editor aA = aA();
        aA.putFloat("smart_button_position_vertical_x", f2);
        aA.putFloat("smart_button_position_vertical_y", f3);
        aA.commit();
    }

    public static void d(float f2, float f3) {
        q = f2;
        r = f3;
        SharedPreferences.Editor aA = aA();
        aA.putFloat("smart_button_position_horizontal_x", f2);
        aA.putFloat("smart_button_position_horizontal_y", f3);
        aA.commit();
    }

    public static Number3d w() {
        Number3d.TEMPNUMBER3D3.x = o;
        Number3d.TEMPNUMBER3D3.y = p;
        return Number3d.TEMPNUMBER3D3;
    }

    public static Number3d x() {
        Number3d.TEMPNUMBER3D3.x = q;
        Number3d.TEMPNUMBER3D3.y = r;
        return Number3d.TEMPNUMBER3D3;
    }

    public static boolean y() {
        return aB().getBoolean("effect_desktop_border_state", true);
    }

    public static void f(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("effect_desktop_border_state", z2);
        aA.commit();
    }

    public static boolean z() {
        return aB().getBoolean("effect_desktop_transition_random_state", false);
    }

    public static void g(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("effect_desktop_transition_random_state", z2);
        aA.commit();
    }

    public static String A() {
        return aB().getString("effect_desktop_transition", "190");
    }

    public static void d(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("effect_desktop_transition", str);
        aA.commit();
    }

    public static boolean B() {
        return aB().getBoolean("effect_icon_menu_random_state", false);
    }

    public static void h(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("effect_icon_menu_random_state", z2);
        aA.commit();
    }

    public static String C() {
        return aB().getString("effect_icon_menu", "0");
    }

    public static void e(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("effect_icon_menu", str);
        aA.commit();
    }

    public static String D() {
        return aB().getString("effect_mark", "0");
    }

    public static void f(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("effect_mark", str);
        aA.commit();
    }

    public static boolean E() {
        return aB().getBoolean("effect_drawer_inout_transition_random_state", false);
    }

    public static void i(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("effect_drawer_inout_transition_random_state", z2);
        aA.commit();
    }

    public static String F() {
        return aB().getString("effect_drawer_inout_transition", "10");
    }

    public static void g(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("effect_drawer_inout_transition", str);
        aA.commit();
    }

    public static boolean G() {
        return aB().getBoolean("effect_drawer_transition_random_state", false);
    }

    public static void j(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("effect_drawer_transition_random_state", z2);
        aA.commit();
    }

    public static String H() {
        return aB().getString("effect_drawer_transition", "40");
    }

    public static void h(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("effect_drawer_transition", str);
        aA.commit();
    }

    public static void g(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("launcher_shortcut_text_style", i2);
        aA.commit();
    }

    public static int h(int i2) {
        return aB().getInt("launcher_shortcut_text_style", i2);
    }

    public static void e(float f2) {
        SharedPreferences.Editor aA = aA();
        aA.putFloat("style_icon_scale", f2);
        aA.commit();
    }

    public static float I() {
        return aB().getFloat("style_icon_scale", 1.15f);
    }

    public static boolean J() {
        return d;
    }

    public static void b(Boolean bool) {
        d = bool.booleanValue();
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("screen_infinite_scroll", bool.booleanValue());
        aA.commit();
    }

    public static int K() {
        return aB().getInt("version", 1);
    }

    public static void i(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("version", i2);
        aA.commit();
    }

    public static void L() {
        s = aB().getBoolean("navigation_bar_transparent_status", com.tsf.shell.utils.g.b());
    }

    public static boolean M() {
        return s;
    }

    public static boolean N() {
        return aB().getBoolean("notification_bar_transparent_status", com.tsf.shell.utils.g.b());
    }

    public static void c(Boolean bool) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("notification_bar_transparent_status", bool.booleanValue());
        aA.commit();
    }

    private static void aG() {
        t = aB().getBoolean("notification_status", true);
    }

    public static boolean O() {
        return t;
    }

    public static void d(Boolean bool) {
        t = bool.booleanValue();
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("notification_status", bool.booleanValue());
        aA.commit();
    }

    private static void aH() {
        w = aB().getInt("drawer_rows_v", 0);
        x = aB().getInt("drawer_columns_v", 0);
        y = aB().getInt("drawer_rows_h", 0);
        z = aB().getInt("drawer_columns_h", 0);
        A = aB().getBoolean("drawer_autosize", true);
        u = aB().getBoolean("drawer_action_bar_state", true);
        v = aB().getBoolean("drawer_menu_bar_state", false);
        com.tsf.shell.manager.f.a.b(aB().getInt("drawer_bg_alpha", com.tsf.shell.manager.f.a.a));
    }

    public static void j(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("drawer_bg_alpha", i2);
        aA.commit();
    }

    public static boolean P() {
        return u;
    }

    public static boolean Q() {
        return v;
    }

    public static int R() {
        return w;
    }

    public static int S() {
        return x;
    }

    public static int T() {
        return y;
    }

    public static int U() {
        return z;
    }

    public static boolean V() {
        return A;
    }

    public static void a(int i2, int i3) {
        SharedPreferences.Editor aA = aA();
        if (com.censivn.C3DEngine.b.b.a.O) {
            w = i2;
            x = i3;
            aA.putInt("drawer_rows_v", i2);
            aA.putInt("drawer_columns_v", i3);
        } else {
            y = i2;
            z = i3;
            aA.putInt("drawer_rows_h", i2);
            aA.putInt("drawer_columns_h", i3);
        }
        aA.commit();
    }

    public static void k(boolean z2) {
        A = z2;
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("drawer_autosize", z2);
        aA.commit();
    }

    public static void l(boolean z2) {
        u = z2;
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("drawer_action_bar_state", z2);
        aA.commit();
    }

    public static void m(boolean z2) {
        v = z2;
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("drawer_menu_bar_state", z2);
        aA.commit();
    }

    public static void W() {
        f = aB().getInt("wallpaper_scroll_mode", ShellWallpaperManager.a);
        if (f != ShellWallpaperManager.a) {
            f = ShellWallpaperManager.b;
        }
    }

    public static int X() {
        return f;
    }

    public static void k(int i2) {
        f = i2;
        if (f != ShellWallpaperManager.a) {
            f = ShellWallpaperManager.b;
        }
        SharedPreferences.Editor aA = aA();
        aA.putInt("wallpaper_scroll_mode", f);
        aA.commit();
    }

    public static void Y() {
        e = aB().getInt("sliding_sensitivity", 1);
        if (e < 0) {
            e = 0;
        } else if (e > 4) {
            e = 4;
        }
    }

    public static int Z() {
        return y.a(aB().getInt("floating_button_transparency_precent", 47));
    }

    public static void l(int i2) {
        int a2 = y.a(i2);
        SharedPreferences.Editor aA = aA();
        aA.putInt("floating_button_transparency_precent", a2);
        aA.commit();
    }

    public static boolean aa() {
        return aB().getBoolean("floating_button_state", true);
    }

    public static void n(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("floating_button_state", z2);
        aA.commit();
    }

    public static void ab() {
        c = aB().getBoolean("vibration_feedback", true);
    }

    public static boolean ac() {
        return c;
    }

    public static void o(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("vibration_feedback", z2);
        aA.commit();
        c = z2;
    }

    public static void ad() {
        a = aB().getBoolean("desktop_indicator_static_dock", true);
        b = aB().getBoolean("desktop_indicator_sliding_dock", false);
    }

    public static boolean ae() {
        return a;
    }

    public static boolean af() {
        return b;
    }

    public static void p(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("desktop_indicator_static_dock", z2);
        aA.commit();
        a = z2;
    }

    public static void q(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("desktop_indicator_sliding_dock", z2);
        aA.commit();
        b = z2;
    }

    public static boolean ag() {
        return B;
    }

    public static void r(boolean z2) {
        B = z2;
    }

    public static void f(float f2) {
        SharedPreferences.Editor aA = aA();
        aA.putFloat("density", f2);
        aA.commit();
    }

    public static float ah() {
        return com.tsf.shell.preference.a.a.b.a(aB().getFloat("density", 0.0f));
    }

    public static void m(final int i2) {
        com.censivn.C3DEngine.a.a().e(new Runnable() { // from class: com.tsf.shell.manager.b.g.1
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences.Editor aA = g.aA();
                aA.putInt("screen", i2);
                aA.commit();
            }
        });
    }

    public static int ai() {
        return aB().getInt("screen", 0);
    }

    public static void n(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("homescreen", i2);
        aA.commit();
    }

    public static int aj() {
        return aB().getInt("homescreen", 0);
    }

    public static void i(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("screenorder", str);
        aA.commit();
    }

    public static String ak() {
        return aB().getString("screenorder", "-1,0,1,2,3,4");
    }

    public static int al() {
        return aB().getInt("appsort", 0);
    }

    public static void o(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("appsort", i2);
        aA.commit();
    }

    public static String am() {
        return aB().getString("new_notif_point_config", "");
    }

    public static void j(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("new_notif_point_config", str);
        aA.commit();
    }

    public static String an() {
        return aB().getString("app_drawer_customize_title", x.c(R.string.app_drawer_customize_title));
    }

    public static void k(String str) {
        SharedPreferences.Editor aA = aA();
        aA.putString("app_drawer_customize_title", str);
        aA.commit();
    }

    public static int ao() {
        return aB().getInt("all_apps_direction", com.tsf.shell.e.f.a.a.f.b);
    }

    public static void p(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("all_apps_direction", i2);
        aA.commit();
    }

    private static void aI() {
        C = com.tsf.shell.preference.a.a.g.c(aB().getInt("perference_folder_animation", 0));
        D = aB().getBoolean("perference_folder_auto_close", false);
    }

    public static int ap() {
        return C;
    }

    public static boolean aq() {
        return D;
    }

    public static void q(int i2) {
        C = com.tsf.shell.preference.a.a.g.c(i2);
        SharedPreferences.Editor aA = aA();
        aA.putInt("perference_folder_animation", C);
        aA.commit();
    }

    public static void s(boolean z2) {
        D = z2;
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("perference_folder_auto_close", z2);
        aA.commit();
    }

    public static int ar() {
        return aB().getInt("natural_orientation", -1) % 4;
    }

    public static void r(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("natural_orientation", i2);
        aA.commit();
    }

    public static int a(Context context) {
        int i2 = aB().getInt("setting_screen_orientation", context.getResources().getBoolean(R.bool.allow_rotation) ? -1 : 1);
        if (i2 < -1) {
            return -1;
        }
        if (i2 > 1) {
            return 1;
        }
        return i2;
    }

    public static void a(int i2, Activity activity) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("setting_screen_orientation", i2);
        aA.commit();
        if (activity != null) {
            b(i2, activity);
        }
    }

    public static void b(int i2, Activity activity) {
        switch (i2) {
            case ItemInfo.NO_ID /* -1 */:
                activity.setRequestedOrientation(-1);
                break;
            case 0:
                activity.setRequestedOrientation(0);
                break;
            case 1:
                activity.setRequestedOrientation(1);
                break;
            default:
                activity.setRequestedOrientation(1);
                break;
        }
    }

    public static boolean t(boolean z2) {
        return aB().getBoolean("decoration_snow_state", z2);
    }

    public static void u(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("decoration_snow_state", z2);
        aA.commit();
    }

    public static int as() {
        return aB().getInt("smart_menu_content_type", 0);
    }

    public static void s(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("smart_menu_content_type", i2);
        aA.commit();
    }

    public static boolean at() {
        return aB().getBoolean("smart_menu_state", true);
    }

    public static void v(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("smart_menu_state", z2);
        aA.commit();
    }

    public static boolean au() {
        return aB().getBoolean("contact_menu_recents_state", true);
    }

    public static void w(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("contact_menu_recents_state", z2);
        aA.commit();
    }

    public static int av() {
        return aB().getInt("recent_apps_menu_display_count", 8);
    }

    public static void t(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("recent_apps_menu_display_count", i2);
        aA.commit();
    }

    public static boolean aw() {
        return aB().getBoolean("widgetanimation", true);
    }

    public static void x(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("widgetanimation", z2);
        aA.commit();
    }

    public static boolean ax() {
        return aB().getBoolean("auto_clear_memory", true);
    }

    public static boolean ay() {
        return aB().getBoolean("memory_pemanent", true);
    }

    public static void y(boolean z2) {
        SharedPreferences.Editor aA = aA();
        aA.putBoolean("memory_pemanent", z2);
        aA.commit();
    }

    public static int az() {
        return aB().getInt("shortcut_menu_direction", 0);
    }

    public static void u(int i2) {
        SharedPreferences.Editor aA = aA();
        aA.putInt("shortcut_menu_direction", i2);
        aA.commit();
    }

    public static SharedPreferences.Editor aA() {
        return aB().edit();
    }

    public static SharedPreferences aB() {
        if (E == null) {
            E = com.censivn.C3DEngine.a.d().getSharedPreferences("config", 0);
        }
        return E;
    }

    public static void aC() {
        SharedPreferences.Editor edit = aB().edit();
        edit.clear();
        edit.commit();
    }
}
