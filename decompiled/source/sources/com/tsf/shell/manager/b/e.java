package com.tsf.shell.manager.b;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.b;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.utils.g;
import com.tsf.shell.utils.x;
import com.tsf.shell.utils.y;
/* loaded from: classes.dex */
public class e {
    private static int A;
    private static boolean B;
    private static boolean C;
    private static int D;
    private static boolean E;
    private static SharedPreferences F;
    private static int f;
    private static float h;
    private static float i;
    private static float j;
    private static float k;
    private static float l;
    private static float m;
    private static float p;
    private static float q;
    private static float r;
    private static float s;
    private static int x;
    private static int y;
    private static int z;
    private static boolean a = true;
    private static boolean b = true;
    private static boolean c = true;
    private static boolean d = true;
    private static int e = 1;
    private static int g = 0;
    private static int n = 0;
    private static int o = 0;
    private static boolean t = false;
    private static boolean u = false;
    private static boolean v = false;
    private static boolean w = true;

    public static void a() {
        if (K() < 110) {
            SharedPreferences.Editor aC = aC();
            aC.remove("effect_desktop_border_state");
            aC.remove("effect_desktop_transition_random_state");
            aC.remove("effect_desktop_transition");
            aC.commit();
        }
        aH();
        aG();
        aa();
        s();
        af();
        ad();
        X();
        aJ();
        aF();
        aK();
        M();
        aI();
    }

    private static void aF() {
        d = aD().getBoolean("screen_infinite_scroll", true);
    }

    private static void aG() {
        h = aD().getFloat("slinding_dock_v_width", 0.0f);
        i = aD().getFloat("slinding_dock_h_width", 0.0f);
        j = aD().getFloat("slinding_dock_position_v_x", 0.0f);
        k = aD().getFloat("slinding_dock_position_v_y", 0.0f);
        l = aD().getFloat("slinding_dock_position_h_x", 0.0f);
        m = aD().getFloat("slinding_dock_position_h_y", 0.0f);
    }

    public static int b() {
        return y.a(aD().getInt("slinding_dock_button_transparency_precent", 50));
    }

    public static void a(int i2) {
        int a2 = y.a(i2);
        SharedPreferences.Editor aC = aC();
        aC.putInt("slinding_dock_button_transparency_precent", a2);
        aC.commit();
    }

    public static void a(float f2) {
        h = f2;
        SharedPreferences.Editor aC = aC();
        aC.putFloat("slinding_dock_v_width", f2);
        aC.commit();
    }

    public static void b(float f2) {
        i = f2;
        SharedPreferences.Editor aC = aC();
        aC.putFloat("slinding_dock_h_width", f2);
        aC.commit();
    }

    public static float c() {
        return h;
    }

    public static float d() {
        return i;
    }

    public static void a(float f2, float f3) {
        j = f2;
        k = f3;
        SharedPreferences.Editor aC = aC();
        aC.putFloat("slinding_dock_position_v_x", f2);
        aC.putFloat("slinding_dock_position_v_y", f3);
        aC.commit();
    }

    public static void b(float f2, float f3) {
        l = f2;
        m = f3;
        SharedPreferences.Editor aC = aC();
        aC.putFloat("slinding_dock_position_h_x", f2);
        aC.putFloat("slinding_dock_position_h_y", f3);
        aC.commit();
    }

    public static void a(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("slinding_dock_hidden", z2);
        aC.commit();
    }

    public static boolean e() {
        return aD().getBoolean("slinding_dock_hidden", true);
    }

    public static Number3d f() {
        Number3d.TEMPNUMBER3D3.x = j;
        Number3d.TEMPNUMBER3D3.y = k;
        return Number3d.TEMPNUMBER3D3;
    }

    public static Number3d g() {
        Number3d.TEMPNUMBER3D3.x = l;
        Number3d.TEMPNUMBER3D3.y = m;
        return Number3d.TEMPNUMBER3D3;
    }

    public static void b(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("side_menu_state", z2);
        aC.commit();
    }

    public static boolean h() {
        return aD().getBoolean("side_menu_state", true);
    }

    public static void b(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("side_menu_direction", i2);
        aC.commit();
    }

    public static int i() {
        return aD().getInt("side_menu_direction", 0);
    }

    public static float j() {
        return aD().getFloat("side_menu_toggle_vertical_position", 0.4f);
    }

    public static void c(float f2) {
        SharedPreferences.Editor aC = aC();
        aC.putFloat("side_menu_toggle_vertical_position", f2);
        aC.commit();
    }

    public static float k() {
        return aD().getFloat("side_menu_toggle_horizontal_position", 0.4f);
    }

    public static void d(float f2) {
        SharedPreferences.Editor aC = aC();
        aC.putFloat("side_menu_toggle_horizontal_position", f2);
        aC.commit();
    }

    public static String l() {
        return aD().getString("video_version_name", "1.0.0");
    }

    public static void a(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("video_version_name", str);
        aC.commit();
    }

    public static boolean m() {
        return aD().getBoolean("effect_icon_click_random_state", false);
    }

    public static void c(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("effect_icon_click_random_state", z2);
        aC.commit();
    }

    public static String n() {
        return aD().getString("effect_icon_click", "10");
    }

    public static void b(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("effect_icon_click", str);
        aC.commit();
    }

    public static int o() {
        return aD().getInt("shake_animation_type", 1);
    }

    public static void c(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("shake_animation_type", i2);
        aC.commit();
    }

    public static String p() {
        return aD().getString("tips_configuration", "");
    }

    public static void c(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("tips_configuration", str);
        aC.commit();
    }

    public static boolean q() {
        return aD().getBoolean("desktop_lock", false);
    }

    public static void a(Boolean bool) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("desktop_lock", bool.booleanValue());
        aC.commit();
    }

    public static void d(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("desktop_relock", z2);
        aC.commit();
    }

    public static boolean r() {
        return aD().getBoolean("desktop_relock", true);
    }

    public static void s() {
        n = aD().getInt("static_dock_vertical_width_margin_precent", 0);
        n = y.a(n);
        o = aD().getInt("static_dock_horizontal_width_margin_precent", 0);
        o = y.a(o);
    }

    public static int t() {
        return n;
    }

    public static int u() {
        return o;
    }

    public static void d(int i2) {
        int a2 = y.a(i2);
        n = a2;
        SharedPreferences.Editor aC = aC();
        aC.putInt("static_dock_vertical_width_margin_precent", a2);
        aC.commit();
    }

    public static void e(int i2) {
        int a2 = y.a(i2);
        o = a2;
        SharedPreferences.Editor aC = aC();
        aC.putInt("static_dock_horizontal_width_margin_precent", a2);
        aC.commit();
    }

    public static void e(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("static_dock_hidden", z2);
        aC.commit();
    }

    public static void f(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("dock_mode", i2);
        aC.commit();
    }

    public static int v() {
        return aD().getInt("dock_mode", 0);
    }

    private static void aH() {
        p = aD().getFloat("smart_button_position_vertical_x", 0.0f);
        q = aD().getFloat("smart_button_position_vertical_y", 0.0f);
        r = aD().getFloat("smart_button_position_horizontal_x", 0.0f);
        s = aD().getFloat("smart_button_position_horizontal_y", 0.0f);
    }

    public static void c(float f2, float f3) {
        p = f2;
        q = f3;
        SharedPreferences.Editor aC = aC();
        aC.putFloat("smart_button_position_vertical_x", f2);
        aC.putFloat("smart_button_position_vertical_y", f3);
        aC.commit();
    }

    public static void d(float f2, float f3) {
        r = f2;
        s = f3;
        SharedPreferences.Editor aC = aC();
        aC.putFloat("smart_button_position_horizontal_x", f2);
        aC.putFloat("smart_button_position_horizontal_y", f3);
        aC.commit();
    }

    public static Number3d w() {
        Number3d.TEMPNUMBER3D3.x = p;
        Number3d.TEMPNUMBER3D3.y = q;
        return Number3d.TEMPNUMBER3D3;
    }

    public static Number3d x() {
        Number3d.TEMPNUMBER3D3.x = r;
        Number3d.TEMPNUMBER3D3.y = s;
        return Number3d.TEMPNUMBER3D3;
    }

    public static boolean y() {
        return aD().getBoolean("effect_desktop_border_state", true);
    }

    public static void f(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("effect_desktop_border_state", z2);
        aC.commit();
    }

    public static boolean z() {
        return aD().getBoolean("effect_desktop_transition_random_state", false);
    }

    public static void g(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("effect_desktop_transition_random_state", z2);
        aC.commit();
    }

    public static String A() {
        return aD().getString("effect_desktop_transition", "190");
    }

    public static void d(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("effect_desktop_transition", str);
        aC.commit();
    }

    public static boolean B() {
        return aD().getBoolean("effect_icon_menu_random_state", false);
    }

    public static void h(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("effect_icon_menu_random_state", z2);
        aC.commit();
    }

    public static String C() {
        return aD().getString("effect_icon_menu", "0");
    }

    public static void e(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("effect_icon_menu", str);
        aC.commit();
    }

    public static String D() {
        return aD().getString("effect_mark", "0");
    }

    public static void f(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("effect_mark", str);
        aC.commit();
    }

    public static boolean E() {
        return aD().getBoolean("effect_drawer_inout_transition_random_state", false);
    }

    public static void i(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("effect_drawer_inout_transition_random_state", z2);
        aC.commit();
    }

    public static String F() {
        return aD().getString("effect_drawer_inout_transition", "10");
    }

    public static void g(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("effect_drawer_inout_transition", str);
        aC.commit();
    }

    public static boolean G() {
        return aD().getBoolean("effect_drawer_transition_random_state", false);
    }

    public static void j(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("effect_drawer_transition_random_state", z2);
        aC.commit();
    }

    public static String H() {
        return aD().getString("effect_drawer_transition", "40");
    }

    public static void h(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("effect_drawer_transition", str);
        aC.commit();
    }

    public static void g(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("launcher_shortcut_text_style", i2);
        aC.commit();
    }

    public static int h(int i2) {
        return aD().getInt("launcher_shortcut_text_style", i2);
    }

    public static void e(float f2) {
        SharedPreferences.Editor aC = aC();
        aC.putFloat("style_icon_scale", f2);
        aC.commit();
    }

    public static float I() {
        return aD().getFloat("style_icon_scale", 1.15f);
    }

    public static boolean J() {
        return d;
    }

    public static void b(Boolean bool) {
        d = bool.booleanValue();
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("screen_infinite_scroll", bool.booleanValue());
        aC.commit();
    }

    public static int K() {
        return aD().getInt("version", 1);
    }

    public static void i(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("version", i2);
        aC.commit();
    }

    public static void k(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("GDPREnable", z2);
        aC.commit();
    }

    public static boolean L() {
        return aD().getBoolean("GDPREnable", false);
    }

    public static void M() {
        t = aD().getBoolean("navigation_bar_transparent_status", g.b());
    }

    public static boolean N() {
        return t;
    }

    public static boolean O() {
        return aD().getBoolean("notification_bar_transparent_status", g.b());
    }

    public static void c(Boolean bool) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("notification_bar_transparent_status", bool.booleanValue());
        aC.commit();
    }

    private static void aI() {
        u = aD().getBoolean("notification_status", true);
    }

    public static boolean P() {
        return u;
    }

    public static void d(Boolean bool) {
        u = bool.booleanValue();
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("notification_status", bool.booleanValue());
        aC.commit();
    }

    private static void aJ() {
        x = aD().getInt("drawer_rows_v", 0);
        y = aD().getInt("drawer_columns_v", 0);
        z = aD().getInt("drawer_rows_h", 0);
        A = aD().getInt("drawer_columns_h", 0);
        B = aD().getBoolean("drawer_autosize", true);
        v = aD().getBoolean("drawer_action_bar_state", true);
        w = aD().getBoolean("drawer_menu_bar_state", false);
        com.tsf.shell.manager.f.a.b(aD().getInt("drawer_bg_alpha", com.tsf.shell.manager.f.a.a));
    }

    public static void j(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("drawer_bg_alpha", i2);
        aC.commit();
    }

    public static boolean Q() {
        return v;
    }

    public static boolean R() {
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

    public static int V() {
        return A;
    }

    public static boolean W() {
        return B;
    }

    public static void a(int i2, int i3) {
        SharedPreferences.Editor aC = aC();
        if (com.censivn.C3DEngine.b.b.a.O) {
            x = i2;
            y = i3;
            aC.putInt("drawer_rows_v", i2);
            aC.putInt("drawer_columns_v", i3);
        } else {
            z = i2;
            A = i3;
            aC.putInt("drawer_rows_h", i2);
            aC.putInt("drawer_columns_h", i3);
        }
        aC.commit();
    }

    public static void l(boolean z2) {
        B = z2;
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("drawer_autosize", z2);
        aC.commit();
    }

    public static void m(boolean z2) {
        v = z2;
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("drawer_action_bar_state", z2);
        aC.commit();
    }

    public static void n(boolean z2) {
        w = z2;
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("drawer_menu_bar_state", z2);
        aC.commit();
    }

    public static void X() {
        f = aD().getInt("wallpaper_scroll_mode", ShellWallpaperManager.a);
        g = aD().getInt("wallpaper_blur_level", 0);
        if (g < 0) {
            g = 0;
        } else if (g > 100) {
            g = 100;
        }
        if (f != ShellWallpaperManager.a) {
            f = ShellWallpaperManager.b;
        }
    }

    public static int Y() {
        return f;
    }

    public static int Z() {
        return g;
    }

    public static void k(int i2) {
        g = i2;
        if (g < 0) {
            g = 0;
        } else if (g > 100) {
            g = 100;
        }
        SharedPreferences.Editor aC = aC();
        aC.putInt("wallpaper_blur_level", g);
        aC.commit();
    }

    public static void l(int i2) {
        f = i2;
        if (f != ShellWallpaperManager.a) {
            f = ShellWallpaperManager.b;
        }
        SharedPreferences.Editor aC = aC();
        aC.putInt("wallpaper_scroll_mode", f);
        aC.commit();
    }

    public static void aa() {
        e = aD().getInt("sliding_sensitivity", 1);
        if (e < 0) {
            e = 0;
        } else if (e > 4) {
            e = 4;
        }
    }

    public static int ab() {
        return y.a(aD().getInt("floating_button_transparency_precent", 47));
    }

    public static void m(int i2) {
        int a2 = y.a(i2);
        SharedPreferences.Editor aC = aC();
        aC.putInt("floating_button_transparency_precent", a2);
        aC.commit();
    }

    public static boolean ac() {
        return aD().getBoolean("floating_button_state", true);
    }

    public static void o(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("floating_button_state", z2);
        aC.commit();
    }

    public static void ad() {
        c = aD().getBoolean("vibration_feedback", true);
    }

    public static boolean ae() {
        return c;
    }

    public static void p(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("vibration_feedback", z2);
        aC.commit();
        c = z2;
    }

    public static void af() {
        a = aD().getBoolean("desktop_indicator_static_dock", true);
        b = aD().getBoolean("desktop_indicator_sliding_dock", false);
    }

    public static boolean ag() {
        return a;
    }

    public static boolean ah() {
        return b;
    }

    public static void q(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("desktop_indicator_static_dock", z2);
        aC.commit();
        a = z2;
    }

    public static void r(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("desktop_indicator_sliding_dock", z2);
        aC.commit();
        b = z2;
    }

    public static boolean ai() {
        return C;
    }

    public static void s(boolean z2) {
        C = z2;
    }

    public static void f(float f2) {
        SharedPreferences.Editor aC = aC();
        aC.putFloat("density", f2);
        aC.commit();
    }

    public static float aj() {
        return com.tsf.shell.preference.a.a.b.a(aD().getFloat("density", 0.0f));
    }

    public static void n(final int i2) {
        com.censivn.C3DEngine.a.a().e(new Runnable() { // from class: com.tsf.shell.manager.b.e.1
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences.Editor aC = e.aC();
                aC.putInt("screen", i2);
                aC.commit();
            }
        });
    }

    public static int ak() {
        return aD().getInt("screen", 0);
    }

    public static void o(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("homescreen", i2);
        aC.commit();
    }

    public static int al() {
        return aD().getInt("homescreen", 0);
    }

    public static void i(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("screenorder", str);
        aC.commit();
    }

    public static String am() {
        return aD().getString("screenorder", "-1,0,1,2,3,4");
    }

    public static int an() {
        return aD().getInt("appsort", 0);
    }

    public static void p(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("appsort", i2);
        aC.commit();
    }

    public static String ao() {
        return aD().getString("new_notif_point_config", "");
    }

    public static void j(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("new_notif_point_config", str);
        aC.commit();
    }

    public static String ap() {
        return aD().getString("app_drawer_customize_title", x.c(b.i.app_drawer_customize_title));
    }

    public static void k(String str) {
        SharedPreferences.Editor aC = aC();
        aC.putString("app_drawer_customize_title", str);
        aC.commit();
    }

    public static int aq() {
        return aD().getInt("all_apps_direction", com.tsf.shell.f.f.a.a.c.b);
    }

    public static void q(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("all_apps_direction", i2);
        aC.commit();
    }

    private static void aK() {
        D = com.tsf.shell.preference.a.a.f.c(aD().getInt("perference_folder_animation", 0));
        E = aD().getBoolean("perference_folder_auto_close", false);
    }

    public static int ar() {
        return D;
    }

    public static boolean as() {
        return E;
    }

    public static void r(int i2) {
        D = com.tsf.shell.preference.a.a.f.c(i2);
        SharedPreferences.Editor aC = aC();
        aC.putInt("perference_folder_animation", D);
        aC.commit();
    }

    public static void t(boolean z2) {
        E = z2;
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("perference_folder_auto_close", z2);
        aC.commit();
    }

    public static int at() {
        return aD().getInt("natural_orientation", -1) % 4;
    }

    public static void s(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("natural_orientation", i2);
        aC.commit();
    }

    public static int a(Context context) {
        int i2 = aD().getInt("setting_screen_orientation", context.getResources().getBoolean(b.C0044b.allow_rotation) ? -1 : 1);
        if (i2 < -1) {
            return -1;
        }
        if (i2 > 1) {
            return 1;
        }
        return i2;
    }

    public static void a(int i2, Activity activity) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("setting_screen_orientation", i2);
        aC.commit();
        if (activity != null) {
            b(i2, activity);
        }
    }

    public static void b(int i2, Activity activity) {
        switch (i2) {
            case ItemInfo.NO_ID /* -1 */:
                activity.setRequestedOrientation(-1);
                return;
            case 0:
                activity.setRequestedOrientation(0);
                return;
            case 1:
                activity.setRequestedOrientation(1);
                return;
            default:
                activity.setRequestedOrientation(1);
                return;
        }
    }

    public static boolean u(boolean z2) {
        return aD().getBoolean("decoration_snow_state", z2);
    }

    public static void v(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("decoration_snow_state", z2);
        aC.commit();
    }

    public static int au() {
        return aD().getInt("smart_menu_content_type", 0);
    }

    public static void t(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("smart_menu_content_type", i2);
        aC.commit();
    }

    public static boolean av() {
        return aD().getBoolean("smart_menu_state", true);
    }

    public static void w(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("smart_menu_state", z2);
        aC.commit();
    }

    public static boolean aw() {
        return aD().getBoolean("contact_menu_recents_state", true);
    }

    public static void x(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("contact_menu_recents_state", z2);
        aC.commit();
    }

    public static int ax() {
        return aD().getInt("recent_apps_menu_display_count", 8);
    }

    public static void u(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("recent_apps_menu_display_count", i2);
        aC.commit();
    }

    public static boolean ay() {
        return aD().getBoolean("widgetanimation", true);
    }

    public static void y(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("widgetanimation", z2);
        aC.commit();
    }

    public static boolean az() {
        return aD().getBoolean("auto_clear_memory", true);
    }

    public static boolean aA() {
        return aD().getBoolean("memory_pemanent", true);
    }

    public static void z(boolean z2) {
        SharedPreferences.Editor aC = aC();
        aC.putBoolean("memory_pemanent", z2);
        aC.commit();
    }

    public static int aB() {
        return aD().getInt("shortcut_menu_direction", 0);
    }

    public static void v(int i2) {
        SharedPreferences.Editor aC = aC();
        aC.putInt("shortcut_menu_direction", i2);
        aC.commit();
    }

    public static SharedPreferences.Editor aC() {
        return aD().edit();
    }

    public static SharedPreferences aD() {
        if (F == null) {
            F = com.censivn.C3DEngine.a.d().getSharedPreferences("config", 0);
        }
        return F;
    }

    public static void aE() {
        SharedPreferences.Editor edit = aD().edit();
        edit.clear();
        edit.commit();
    }
}
