package com.tsf.shell.manager.p168b;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.manager.p174f.C3470a;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.p096f.p131f.p132a.p133a.C2695c;
import com.tsf.shell.preference.p196a.p197a.C4024b;
import com.tsf.shell.preference.p196a.p197a.C4047f;
import com.tsf.shell.utils.C4170g;
import com.tsf.shell.utils.C4189x;
import com.tsf.shell.utils.C4190y;
/* renamed from: com.tsf.shell.manager.b.e */
/* loaded from: classes.dex */
public class C3430e {

    /* renamed from: A */
    private static int f11326A;

    /* renamed from: B */
    private static boolean f11327B;

    /* renamed from: C */
    private static boolean f11328C;

    /* renamed from: D */
    private static int f11329D;

    /* renamed from: E */
    private static boolean f11330E;

    /* renamed from: F */
    private static SharedPreferences f11331F;

    /* renamed from: f */
    private static int f11337f;

    /* renamed from: h */
    private static float f11339h;

    /* renamed from: i */
    private static float f11340i;

    /* renamed from: j */
    private static float f11341j;

    /* renamed from: k */
    private static float f11342k;

    /* renamed from: l */
    private static float f11343l;

    /* renamed from: m */
    private static float f11344m;

    /* renamed from: p */
    private static float f11347p;

    /* renamed from: q */
    private static float f11348q;

    /* renamed from: r */
    private static float f11349r;

    /* renamed from: s */
    private static float f11350s;

    /* renamed from: x */
    private static int f11355x;

    /* renamed from: y */
    private static int f11356y;

    /* renamed from: z */
    private static int f11357z;

    /* renamed from: a */
    private static boolean f11332a = true;

    /* renamed from: b */
    private static boolean f11333b = true;

    /* renamed from: c */
    private static boolean f11334c = true;

    /* renamed from: d */
    private static boolean f11335d = true;

    /* renamed from: e */
    private static int f11336e = 1;

    /* renamed from: g */
    private static int f11338g = 0;

    /* renamed from: n */
    private static int f11345n = 0;

    /* renamed from: o */
    private static int f11346o = 0;

    /* renamed from: t */
    private static boolean f11351t = false;

    /* renamed from: u */
    private static boolean f11352u = false;

    /* renamed from: v */
    private static boolean f11353v = false;

    /* renamed from: w */
    private static boolean f11354w = true;

    /* renamed from: a */
    public static void m2545a() {
        if (m2561K() < 110) {
            SharedPreferences.Editor m2533aC = m2533aC();
            m2533aC.remove("effect_desktop_border_state");
            m2533aC.remove("effect_desktop_transition_random_state");
            m2533aC.remove("effect_desktop_transition");
            m2533aC.commit();
        }
        m2528aH();
        m2529aG();
        m2524aa();
        m2425s();
        m2519af();
        m2521ad();
        m2548X();
        m2526aJ();
        m2530aF();
        m2525aK();
        m2559M();
        m2527aI();
    }

    /* renamed from: aF */
    private static void m2530aF() {
        f11335d = m2532aD().getBoolean("screen_infinite_scroll", true);
    }

    /* renamed from: aG */
    private static void m2529aG() {
        f11339h = m2532aD().getFloat("slinding_dock_v_width", 0.0f);
        f11340i = m2532aD().getFloat("slinding_dock_h_width", 0.0f);
        f11341j = m2532aD().getFloat("slinding_dock_position_v_x", 0.0f);
        f11342k = m2532aD().getFloat("slinding_dock_position_v_y", 0.0f);
        f11343l = m2532aD().getFloat("slinding_dock_position_h_x", 0.0f);
        f11344m = m2532aD().getFloat("slinding_dock_position_h_y", 0.0f);
    }

    /* renamed from: b */
    public static int m2498b() {
        return C4190y.m586a(m2532aD().getInt("slinding_dock_button_transparency_precent", 50));
    }

    /* renamed from: a */
    public static void m2542a(int i) {
        int m586a = C4190y.m586a(i);
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("slinding_dock_button_transparency_precent", m586a);
        m2533aC.commit();
    }

    /* renamed from: a */
    public static void m2544a(float f) {
        f11339h = f;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("slinding_dock_v_width", f);
        m2533aC.commit();
    }

    /* renamed from: b */
    public static void m2497b(float f) {
        f11340i = f;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("slinding_dock_h_width", f);
        m2533aC.commit();
    }

    /* renamed from: c */
    public static float m2490c() {
        return f11339h;
    }

    /* renamed from: d */
    public static float m2483d() {
        return f11340i;
    }

    /* renamed from: a */
    public static void m2543a(float f, float f2) {
        f11341j = f;
        f11342k = f2;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("slinding_dock_position_v_x", f);
        m2533aC.putFloat("slinding_dock_position_v_y", f2);
        m2533aC.commit();
    }

    /* renamed from: b */
    public static void m2496b(float f, float f2) {
        f11343l = f;
        f11344m = f2;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("slinding_dock_position_h_x", f);
        m2533aC.putFloat("slinding_dock_position_h_y", f2);
        m2533aC.commit();
    }

    /* renamed from: a */
    public static void m2536a(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("slinding_dock_hidden", z);
        m2533aC.commit();
    }

    /* renamed from: e */
    public static boolean m2476e() {
        return m2532aD().getBoolean("slinding_dock_hidden", true);
    }

    /* renamed from: f */
    public static Number3d m2471f() {
        Number3d.TEMPNUMBER3D3.f2526x = f11341j;
        Number3d.TEMPNUMBER3D3.f2527y = f11342k;
        return Number3d.TEMPNUMBER3D3;
    }

    /* renamed from: g */
    public static Number3d m2466g() {
        Number3d.TEMPNUMBER3D3.f2526x = f11343l;
        Number3d.TEMPNUMBER3D3.f2527y = f11344m;
        return Number3d.TEMPNUMBER3D3;
    }

    /* renamed from: b */
    public static void m2491b(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("side_menu_state", z);
        m2533aC.commit();
    }

    /* renamed from: h */
    public static boolean m2462h() {
        return m2532aD().getBoolean("side_menu_state", true);
    }

    /* renamed from: b */
    public static void m2495b(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("side_menu_direction", i);
        m2533aC.commit();
    }

    /* renamed from: i */
    public static int m2458i() {
        return m2532aD().getInt("side_menu_direction", 0);
    }

    /* renamed from: j */
    public static float m2454j() {
        return m2532aD().getFloat("side_menu_toggle_vertical_position", 0.4f);
    }

    /* renamed from: c */
    public static void m2489c(float f) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("side_menu_toggle_vertical_position", f);
        m2533aC.commit();
    }

    /* renamed from: k */
    public static float m2450k() {
        return m2532aD().getFloat("side_menu_toggle_horizontal_position", 0.4f);
    }

    /* renamed from: d */
    public static void m2482d(float f) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("side_menu_toggle_horizontal_position", f);
        m2533aC.commit();
    }

    /* renamed from: l */
    public static String m2446l() {
        return m2532aD().getString("video_version_name", "1.0.0");
    }

    /* renamed from: a */
    public static void m2537a(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("video_version_name", str);
        m2533aC.commit();
    }

    /* renamed from: m */
    public static boolean m2443m() {
        return m2532aD().getBoolean("effect_icon_click_random_state", false);
    }

    /* renamed from: c */
    public static void m2484c(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("effect_icon_click_random_state", z);
        m2533aC.commit();
    }

    /* renamed from: n */
    public static String m2440n() {
        return m2532aD().getString("effect_icon_click", "10");
    }

    /* renamed from: b */
    public static void m2492b(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("effect_icon_click", str);
        m2533aC.commit();
    }

    /* renamed from: o */
    public static int m2437o() {
        return m2532aD().getInt("shake_animation_type", 1);
    }

    /* renamed from: c */
    public static void m2487c(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("shake_animation_type", i);
        m2533aC.commit();
    }

    /* renamed from: p */
    public static String m2434p() {
        return m2532aD().getString("tips_configuration", "");
    }

    /* renamed from: c */
    public static void m2485c(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("tips_configuration", str);
        m2533aC.commit();
    }

    /* renamed from: q */
    public static boolean m2431q() {
        return m2532aD().getBoolean("desktop_lock", false);
    }

    /* renamed from: a */
    public static void m2538a(Boolean bool) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("desktop_lock", bool.booleanValue());
        m2533aC.commit();
    }

    /* renamed from: d */
    public static void m2477d(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("desktop_relock", z);
        m2533aC.commit();
    }

    /* renamed from: r */
    public static boolean m2428r() {
        return m2532aD().getBoolean("desktop_relock", true);
    }

    /* renamed from: s */
    public static void m2425s() {
        f11345n = m2532aD().getInt("static_dock_vertical_width_margin_precent", 0);
        f11345n = C4190y.m586a(f11345n);
        f11346o = m2532aD().getInt("static_dock_horizontal_width_margin_precent", 0);
        f11346o = C4190y.m586a(f11346o);
    }

    /* renamed from: t */
    public static int m2422t() {
        return f11345n;
    }

    /* renamed from: u */
    public static int m2419u() {
        return f11346o;
    }

    /* renamed from: d */
    public static void m2480d(int i) {
        int m586a = C4190y.m586a(i);
        f11345n = m586a;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("static_dock_vertical_width_margin_precent", m586a);
        m2533aC.commit();
    }

    /* renamed from: e */
    public static void m2474e(int i) {
        int m586a = C4190y.m586a(i);
        f11346o = m586a;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("static_dock_horizontal_width_margin_precent", m586a);
        m2533aC.commit();
    }

    /* renamed from: e */
    public static void m2472e(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("static_dock_hidden", z);
        m2533aC.commit();
    }

    /* renamed from: f */
    public static void m2469f(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("dock_mode", i);
        m2533aC.commit();
    }

    /* renamed from: v */
    public static int m2416v() {
        return m2532aD().getInt("dock_mode", 0);
    }

    /* renamed from: aH */
    private static void m2528aH() {
        f11347p = m2532aD().getFloat("smart_button_position_vertical_x", 0.0f);
        f11348q = m2532aD().getFloat("smart_button_position_vertical_y", 0.0f);
        f11349r = m2532aD().getFloat("smart_button_position_horizontal_x", 0.0f);
        f11350s = m2532aD().getFloat("smart_button_position_horizontal_y", 0.0f);
    }

    /* renamed from: c */
    public static void m2488c(float f, float f2) {
        f11347p = f;
        f11348q = f2;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("smart_button_position_vertical_x", f);
        m2533aC.putFloat("smart_button_position_vertical_y", f2);
        m2533aC.commit();
    }

    /* renamed from: d */
    public static void m2481d(float f, float f2) {
        f11349r = f;
        f11350s = f2;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("smart_button_position_horizontal_x", f);
        m2533aC.putFloat("smart_button_position_horizontal_y", f2);
        m2533aC.commit();
    }

    /* renamed from: w */
    public static Number3d m2413w() {
        Number3d.TEMPNUMBER3D3.f2526x = f11347p;
        Number3d.TEMPNUMBER3D3.f2527y = f11348q;
        return Number3d.TEMPNUMBER3D3;
    }

    /* renamed from: x */
    public static Number3d m2411x() {
        Number3d.TEMPNUMBER3D3.f2526x = f11349r;
        Number3d.TEMPNUMBER3D3.f2527y = f11350s;
        return Number3d.TEMPNUMBER3D3;
    }

    /* renamed from: y */
    public static boolean m2409y() {
        return m2532aD().getBoolean("effect_desktop_border_state", true);
    }

    /* renamed from: f */
    public static void m2467f(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("effect_desktop_border_state", z);
        m2533aC.commit();
    }

    /* renamed from: z */
    public static boolean m2407z() {
        return m2532aD().getBoolean("effect_desktop_transition_random_state", false);
    }

    /* renamed from: g */
    public static void m2463g(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("effect_desktop_transition_random_state", z);
        m2533aC.commit();
    }

    /* renamed from: A */
    public static String m2571A() {
        return m2532aD().getString("effect_desktop_transition", "190");
    }

    /* renamed from: d */
    public static void m2478d(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("effect_desktop_transition", str);
        m2533aC.commit();
    }

    /* renamed from: B */
    public static boolean m2570B() {
        return m2532aD().getBoolean("effect_icon_menu_random_state", false);
    }

    /* renamed from: h */
    public static void m2459h(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("effect_icon_menu_random_state", z);
        m2533aC.commit();
    }

    /* renamed from: C */
    public static String m2569C() {
        return m2532aD().getString("effect_icon_menu", "0");
    }

    /* renamed from: e */
    public static void m2473e(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("effect_icon_menu", str);
        m2533aC.commit();
    }

    /* renamed from: D */
    public static String m2568D() {
        return m2532aD().getString("effect_mark", "0");
    }

    /* renamed from: f */
    public static void m2468f(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("effect_mark", str);
        m2533aC.commit();
    }

    /* renamed from: E */
    public static boolean m2567E() {
        return m2532aD().getBoolean("effect_drawer_inout_transition_random_state", false);
    }

    /* renamed from: i */
    public static void m2455i(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("effect_drawer_inout_transition_random_state", z);
        m2533aC.commit();
    }

    /* renamed from: F */
    public static String m2566F() {
        return m2532aD().getString("effect_drawer_inout_transition", "10");
    }

    /* renamed from: g */
    public static void m2464g(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("effect_drawer_inout_transition", str);
        m2533aC.commit();
    }

    /* renamed from: G */
    public static boolean m2565G() {
        return m2532aD().getBoolean("effect_drawer_transition_random_state", false);
    }

    /* renamed from: j */
    public static void m2451j(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("effect_drawer_transition_random_state", z);
        m2533aC.commit();
    }

    /* renamed from: H */
    public static String m2564H() {
        return m2532aD().getString("effect_drawer_transition", "40");
    }

    /* renamed from: h */
    public static void m2460h(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("effect_drawer_transition", str);
        m2533aC.commit();
    }

    /* renamed from: g */
    public static void m2465g(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("launcher_shortcut_text_style", i);
        m2533aC.commit();
    }

    /* renamed from: h */
    public static int m2461h(int i) {
        return m2532aD().getInt("launcher_shortcut_text_style", i);
    }

    /* renamed from: e */
    public static void m2475e(float f) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("style_icon_scale", f);
        m2533aC.commit();
    }

    /* renamed from: I */
    public static float m2563I() {
        return m2532aD().getFloat("style_icon_scale", 1.15f);
    }

    /* renamed from: J */
    public static boolean m2562J() {
        return f11335d;
    }

    /* renamed from: b */
    public static void m2493b(Boolean bool) {
        f11335d = bool.booleanValue();
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("screen_infinite_scroll", bool.booleanValue());
        m2533aC.commit();
    }

    /* renamed from: K */
    public static int m2561K() {
        return m2532aD().getInt("version", 1);
    }

    /* renamed from: i */
    public static void m2457i(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("version", i);
        m2533aC.commit();
    }

    /* renamed from: k */
    public static void m2447k(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("GDPREnable", z);
        m2533aC.commit();
    }

    /* renamed from: L */
    public static boolean m2560L() {
        return m2532aD().getBoolean("GDPREnable", false);
    }

    /* renamed from: M */
    public static void m2559M() {
        f11351t = m2532aD().getBoolean("navigation_bar_transparent_status", C4170g.m684b());
    }

    /* renamed from: N */
    public static boolean m2558N() {
        return f11351t;
    }

    /* renamed from: O */
    public static boolean m2557O() {
        return m2532aD().getBoolean("notification_bar_transparent_status", C4170g.m684b());
    }

    /* renamed from: c */
    public static void m2486c(Boolean bool) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("notification_bar_transparent_status", bool.booleanValue());
        m2533aC.commit();
    }

    /* renamed from: aI */
    private static void m2527aI() {
        f11352u = m2532aD().getBoolean("notification_status", true);
    }

    /* renamed from: P */
    public static boolean m2556P() {
        return f11352u;
    }

    /* renamed from: d */
    public static void m2479d(Boolean bool) {
        f11352u = bool.booleanValue();
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("notification_status", bool.booleanValue());
        m2533aC.commit();
    }

    /* renamed from: aJ */
    private static void m2526aJ() {
        f11355x = m2532aD().getInt("drawer_rows_v", 0);
        f11356y = m2532aD().getInt("drawer_columns_v", 0);
        f11357z = m2532aD().getInt("drawer_rows_h", 0);
        f11326A = m2532aD().getInt("drawer_columns_h", 0);
        f11327B = m2532aD().getBoolean("drawer_autosize", true);
        f11353v = m2532aD().getBoolean("drawer_action_bar_state", true);
        f11354w = m2532aD().getBoolean("drawer_menu_bar_state", false);
        C3470a.m2283b(m2532aD().getInt("drawer_bg_alpha", C3470a.f11457a));
    }

    /* renamed from: j */
    public static void m2453j(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("drawer_bg_alpha", i);
        m2533aC.commit();
    }

    /* renamed from: Q */
    public static boolean m2555Q() {
        return f11353v;
    }

    /* renamed from: R */
    public static boolean m2554R() {
        return f11354w;
    }

    /* renamed from: S */
    public static int m2553S() {
        return f11355x;
    }

    /* renamed from: T */
    public static int m2552T() {
        return f11356y;
    }

    /* renamed from: U */
    public static int m2551U() {
        return f11357z;
    }

    /* renamed from: V */
    public static int m2550V() {
        return f11326A;
    }

    /* renamed from: W */
    public static boolean m2549W() {
        return f11327B;
    }

    /* renamed from: a */
    public static void m2541a(int i, int i2) {
        SharedPreferences.Editor m2533aC = m2533aC();
        if (C0892a.f2564O) {
            f11355x = i;
            f11356y = i2;
            m2533aC.putInt("drawer_rows_v", i);
            m2533aC.putInt("drawer_columns_v", i2);
        } else {
            f11357z = i;
            f11326A = i2;
            m2533aC.putInt("drawer_rows_h", i);
            m2533aC.putInt("drawer_columns_h", i2);
        }
        m2533aC.commit();
    }

    /* renamed from: l */
    public static void m2444l(boolean z) {
        f11327B = z;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("drawer_autosize", z);
        m2533aC.commit();
    }

    /* renamed from: m */
    public static void m2441m(boolean z) {
        f11353v = z;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("drawer_action_bar_state", z);
        m2533aC.commit();
    }

    /* renamed from: n */
    public static void m2438n(boolean z) {
        f11354w = z;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("drawer_menu_bar_state", z);
        m2533aC.commit();
    }

    /* renamed from: X */
    public static void m2548X() {
        f11337f = m2532aD().getInt("wallpaper_scroll_mode", ShellWallpaperManager.f12289a);
        f11338g = m2532aD().getInt("wallpaper_blur_level", 0);
        if (f11338g < 0) {
            f11338g = 0;
        } else if (f11338g > 100) {
            f11338g = 100;
        }
        if (f11337f != ShellWallpaperManager.f12289a) {
            f11337f = ShellWallpaperManager.f12290b;
        }
    }

    /* renamed from: Y */
    public static int m2547Y() {
        return f11337f;
    }

    /* renamed from: Z */
    public static int m2546Z() {
        return f11338g;
    }

    /* renamed from: k */
    public static void m2449k(int i) {
        f11338g = i;
        if (f11338g < 0) {
            f11338g = 0;
        } else if (f11338g > 100) {
            f11338g = 100;
        }
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("wallpaper_blur_level", f11338g);
        m2533aC.commit();
    }

    /* renamed from: l */
    public static void m2445l(int i) {
        f11337f = i;
        if (f11337f != ShellWallpaperManager.f12289a) {
            f11337f = ShellWallpaperManager.f12290b;
        }
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("wallpaper_scroll_mode", f11337f);
        m2533aC.commit();
    }

    /* renamed from: aa */
    public static void m2524aa() {
        f11336e = m2532aD().getInt("sliding_sensitivity", 1);
        if (f11336e < 0) {
            f11336e = 0;
        } else if (f11336e > 4) {
            f11336e = 4;
        }
    }

    /* renamed from: ab */
    public static int m2523ab() {
        return C4190y.m586a(m2532aD().getInt("floating_button_transparency_precent", 47));
    }

    /* renamed from: m */
    public static void m2442m(int i) {
        int m586a = C4190y.m586a(i);
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("floating_button_transparency_precent", m586a);
        m2533aC.commit();
    }

    /* renamed from: ac */
    public static boolean m2522ac() {
        return m2532aD().getBoolean("floating_button_state", true);
    }

    /* renamed from: o */
    public static void m2435o(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("floating_button_state", z);
        m2533aC.commit();
    }

    /* renamed from: ad */
    public static void m2521ad() {
        f11334c = m2532aD().getBoolean("vibration_feedback", true);
    }

    /* renamed from: ae */
    public static boolean m2520ae() {
        return f11334c;
    }

    /* renamed from: p */
    public static void m2432p(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("vibration_feedback", z);
        m2533aC.commit();
        f11334c = z;
    }

    /* renamed from: af */
    public static void m2519af() {
        f11332a = m2532aD().getBoolean("desktop_indicator_static_dock", true);
        f11333b = m2532aD().getBoolean("desktop_indicator_sliding_dock", false);
    }

    /* renamed from: ag */
    public static boolean m2518ag() {
        return f11332a;
    }

    /* renamed from: ah */
    public static boolean m2517ah() {
        return f11333b;
    }

    /* renamed from: q */
    public static void m2429q(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("desktop_indicator_static_dock", z);
        m2533aC.commit();
        f11332a = z;
    }

    /* renamed from: r */
    public static void m2426r(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("desktop_indicator_sliding_dock", z);
        m2533aC.commit();
        f11333b = z;
    }

    /* renamed from: ai */
    public static boolean m2516ai() {
        return f11328C;
    }

    /* renamed from: s */
    public static void m2423s(boolean z) {
        f11328C = z;
    }

    /* renamed from: f */
    public static void m2470f(float f) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putFloat("density", f);
        m2533aC.commit();
    }

    /* renamed from: aj */
    public static float m2515aj() {
        return C4024b.m882a(m2532aD().getFloat("density", 0.0f));
    }

    /* renamed from: n */
    public static void m2439n(final int i) {
        C0853a.m10865a().m10580e(new Runnable() { // from class: com.tsf.shell.manager.b.e.1
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences.Editor m2533aC = C3430e.m2533aC();
                m2533aC.putInt("screen", i);
                m2533aC.commit();
            }
        });
    }

    /* renamed from: ak */
    public static int m2514ak() {
        return m2532aD().getInt("screen", 0);
    }

    /* renamed from: o */
    public static void m2436o(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("homescreen", i);
        m2533aC.commit();
    }

    /* renamed from: al */
    public static int m2513al() {
        return m2532aD().getInt("homescreen", 0);
    }

    /* renamed from: i */
    public static void m2456i(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("screenorder", str);
        m2533aC.commit();
    }

    /* renamed from: am */
    public static String m2512am() {
        return m2532aD().getString("screenorder", "-1,0,1,2,3,4");
    }

    /* renamed from: an */
    public static int m2511an() {
        return m2532aD().getInt("appsort", 0);
    }

    /* renamed from: p */
    public static void m2433p(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("appsort", i);
        m2533aC.commit();
    }

    /* renamed from: ao */
    public static String m2510ao() {
        return m2532aD().getString("new_notif_point_config", "");
    }

    /* renamed from: j */
    public static void m2452j(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("new_notif_point_config", str);
        m2533aC.commit();
    }

    /* renamed from: ap */
    public static String m2509ap() {
        return m2532aD().getString("app_drawer_customize_title", C4189x.m588c(C1306b.C1315i.app_drawer_customize_title));
    }

    /* renamed from: k */
    public static void m2448k(String str) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putString("app_drawer_customize_title", str);
        m2533aC.commit();
    }

    /* renamed from: aq */
    public static int m2508aq() {
        return m2532aD().getInt("all_apps_direction", C2695c.f8877b);
    }

    /* renamed from: q */
    public static void m2430q(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("all_apps_direction", i);
        m2533aC.commit();
    }

    /* renamed from: aK */
    private static void m2525aK() {
        f11329D = C4047f.m846c(m2532aD().getInt("perference_folder_animation", 0));
        f11330E = m2532aD().getBoolean("perference_folder_auto_close", false);
    }

    /* renamed from: ar */
    public static int m2507ar() {
        return f11329D;
    }

    /* renamed from: as */
    public static boolean m2506as() {
        return f11330E;
    }

    /* renamed from: r */
    public static void m2427r(int i) {
        f11329D = C4047f.m846c(i);
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("perference_folder_animation", f11329D);
        m2533aC.commit();
    }

    /* renamed from: t */
    public static void m2420t(boolean z) {
        f11330E = z;
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("perference_folder_auto_close", z);
        m2533aC.commit();
    }

    /* renamed from: at */
    public static int m2505at() {
        return m2532aD().getInt("natural_orientation", -1) % 4;
    }

    /* renamed from: s */
    public static void m2424s(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("natural_orientation", i);
        m2533aC.commit();
    }

    /* renamed from: a */
    public static int m2539a(Context context) {
        int i = m2532aD().getInt("setting_screen_orientation", context.getResources().getBoolean(C1306b.C1308b.allow_rotation) ? -1 : 1);
        if (i < -1) {
            return -1;
        }
        if (i > 1) {
            return 1;
        }
        return i;
    }

    /* renamed from: a */
    public static void m2540a(int i, Activity activity) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("setting_screen_orientation", i);
        m2533aC.commit();
        if (activity != null) {
            m2494b(i, activity);
        }
    }

    /* renamed from: b */
    public static void m2494b(int i, Activity activity) {
        switch (i) {
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

    /* renamed from: u */
    public static boolean m2417u(boolean z) {
        return m2532aD().getBoolean("decoration_snow_state", z);
    }

    /* renamed from: v */
    public static void m2414v(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("decoration_snow_state", z);
        m2533aC.commit();
    }

    /* renamed from: au */
    public static int m2504au() {
        return m2532aD().getInt("smart_menu_content_type", 0);
    }

    /* renamed from: t */
    public static void m2421t(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("smart_menu_content_type", i);
        m2533aC.commit();
    }

    /* renamed from: av */
    public static boolean m2503av() {
        return m2532aD().getBoolean("smart_menu_state", true);
    }

    /* renamed from: w */
    public static void m2412w(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("smart_menu_state", z);
        m2533aC.commit();
    }

    /* renamed from: aw */
    public static boolean m2502aw() {
        return m2532aD().getBoolean("contact_menu_recents_state", true);
    }

    /* renamed from: x */
    public static void m2410x(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("contact_menu_recents_state", z);
        m2533aC.commit();
    }

    /* renamed from: ax */
    public static int m2501ax() {
        return m2532aD().getInt("recent_apps_menu_display_count", 8);
    }

    /* renamed from: u */
    public static void m2418u(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("recent_apps_menu_display_count", i);
        m2533aC.commit();
    }

    /* renamed from: ay */
    public static boolean m2500ay() {
        return m2532aD().getBoolean("widgetanimation", true);
    }

    /* renamed from: y */
    public static void m2408y(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("widgetanimation", z);
        m2533aC.commit();
    }

    /* renamed from: az */
    public static boolean m2499az() {
        return m2532aD().getBoolean("auto_clear_memory", true);
    }

    /* renamed from: aA */
    public static boolean m2535aA() {
        return m2532aD().getBoolean("memory_pemanent", true);
    }

    /* renamed from: z */
    public static void m2406z(boolean z) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putBoolean("memory_pemanent", z);
        m2533aC.commit();
    }

    /* renamed from: aB */
    public static int m2534aB() {
        return m2532aD().getInt("shortcut_menu_direction", 0);
    }

    /* renamed from: v */
    public static void m2415v(int i) {
        SharedPreferences.Editor m2533aC = m2533aC();
        m2533aC.putInt("shortcut_menu_direction", i);
        m2533aC.commit();
    }

    /* renamed from: aC */
    public static SharedPreferences.Editor m2533aC() {
        return m2532aD().edit();
    }

    /* renamed from: aD */
    public static SharedPreferences m2532aD() {
        if (f11331F == null) {
            f11331F = C0853a.m10856d().getSharedPreferences("config", 0);
        }
        return f11331F;
    }

    /* renamed from: aE */
    public static void m2531aE() {
        SharedPreferences.Editor edit = m2532aD().edit();
        edit.clear();
        edit.commit();
    }
}
