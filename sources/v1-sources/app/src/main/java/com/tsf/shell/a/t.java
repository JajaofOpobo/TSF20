package com.tsf.shell.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.bz;
import com.tsf.shell.workspace3D.ShellWallpaperManager;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t {
    private static float A;
    private static int B;
    private static boolean C;
    private static SharedPreferences D;
    private static int f;
    private static int j;
    private static float k;
    private static float l;
    private static float m;
    private static float n;
    private static float o;
    private static float p;
    private static com.tsf.shell.workspace3D.j.f q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static boolean v;
    private static boolean w;
    private static float x;
    private static float y;
    private static float z;
    private static boolean a = true;
    private static boolean b = true;
    private static boolean c = true;
    private static boolean d = false;
    private static int e = 1;
    private static boolean g = false;
    private static boolean h = true;
    private static boolean i = true;

    public static void a() {
        x = aa().getFloat("360_button_x", 0.0f);
        y = aa().getFloat("360_button_y", 0.0f);
        z = aa().getFloat("360_button_x_horizontal", 0.0f);
        A = aa().getFloat("360_button_y_horizontal", 0.0f);
        k = aa().getFloat("dock_bar_width", 0.0f);
        l = aa().getFloat("dock_bar_width_horizontal", 0.0f);
        m = aa().getFloat("dock_bar_position_x", 0.0f);
        n = aa().getFloat("dock_bar_position_y", 0.0f);
        o = aa().getFloat("dock_bar_position_x_horizontal", 0.0f);
        p = aa().getFloat("dock_bar_position_y_horizontal", 0.0f);
        int i2 = aa().getInt("sliding_sensitivity", 1);
        e = i2;
        if (i2 < 0) {
            e = 0;
        } else if (e > 4) {
            e = 4;
        }
        a = aa().getBoolean("indicator_mode", true);
        b = aa().getBoolean("vibration_feedback", true);
        int i3 = aa().getInt("wallpaper_mode", ShellWallpaperManager.a);
        f = i3;
        if (i3 != ShellWallpaperManager.a) {
            f = ShellWallpaperManager.b;
        }
        r = aa().getInt("drawer_rows_v", 0);
        s = aa().getInt("drawer_columns_v", 0);
        t = aa().getInt("drawer_rows_h", 0);
        u = aa().getInt("drawer_columns_h", 0);
        v = aa().getBoolean("drawer_autosize", true);
        com.tsf.shell.workspace3D.a.a(aa().getInt("drawer_background_alpha", 70));
        i = aa().getBoolean("desktop_select_countdown", true);
        c = aa().getBoolean("screen_infinite_scroll", false);
        boolean z2 = aa().getBoolean("desktop_lock", false);
        g = z2;
        com.tsf.shell.workspace3D.z.a = z2;
        h = aa().getBoolean("desktop_relock", true);
        d = aa().getBoolean("auto_hide_side_bar", false);
        ShellWallpaperManager.a(aa().getInt("wallpaper_transition_speed", 1));
        j = aa().getInt("perference_direction", 0);
        B = com.tsf.shell.preference.t.a(aa().getInt("perference_folder_animation", 0));
        C = aa().getBoolean("perference_folder_auto_close", false);
    }

    public static String b() {
        return aa().getString("video_version_name", "1.0.0");
    }

    public static void a(String str) {
        SharedPreferences.Editor Z = Z();
        Z.putString("video_version_name", str);
        Z.commit();
    }

    public static int c() {
        return aa().getInt("shake_animation_type", 0);
    }

    public static void a(int i2) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("shake_animation_type", i2);
        Z.commit();
    }

    public static String d() {
        return aa().getString("tips_configuration", "");
    }

    public static void b(String str) {
        SharedPreferences.Editor Z = Z();
        Z.putString("tips_configuration", str);
        Z.commit();
    }

    public static void b(int i2) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("wallpaper_transition_speed", i2);
        Z.commit();
    }

    public static boolean e() {
        return g;
    }

    public static void a(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        g = booleanValue;
        com.tsf.shell.workspace3D.z.a = booleanValue;
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("desktop_lock", bool.booleanValue());
        Z.commit();
    }

    public static void a(boolean z2) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("desktop_relock", z2);
        Z.commit();
        h = z2;
    }

    public static boolean f() {
        return h;
    }

    public static void b(boolean z2) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("dock_hidden", z2);
        Z.commit();
    }

    public static boolean g() {
        return aa().getBoolean("dock_hidden", true);
    }

    public static void h() {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("dock_default", false);
        Z.commit();
    }

    public static boolean i() {
        return aa().getBoolean("dock_default", true);
    }

    public static void a(float f2) {
        k = f2;
        SharedPreferences.Editor Z = Z();
        Z.putFloat("dock_bar_width", f2);
        Z.commit();
    }

    public static void b(float f2) {
        l = f2;
        SharedPreferences.Editor Z = Z();
        Z.putFloat("dock_bar_width_horizontal", f2);
        Z.commit();
    }

    public static float j() {
        return k;
    }

    public static float k() {
        return l;
    }

    public static void a(float f2, float f3) {
        m = f2;
        n = f3;
        SharedPreferences.Editor Z = Z();
        Z.putFloat("dock_bar_position_x", f2);
        Z.putFloat("dock_bar_position_y", f3);
        Z.commit();
    }

    public static void b(float f2, float f3) {
        o = f2;
        p = f3;
        SharedPreferences.Editor Z = Z();
        Z.putFloat("dock_bar_position_x_horizontal", f2);
        Z.putFloat("dock_bar_position_y_horizontal", f3);
        Z.commit();
    }

    public static Number3d l() {
        Number3d.TEMPNUMBER3D3.x = m;
        Number3d.TEMPNUMBER3D3.y = n;
        return Number3d.TEMPNUMBER3D3;
    }

    public static Number3d m() {
        Number3d.TEMPNUMBER3D3.x = o;
        Number3d.TEMPNUMBER3D3.y = p;
        return Number3d.TEMPNUMBER3D3;
    }

    public static void c(int i2) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("dock_bar_transparency", i2);
        Z.commit();
    }

    public static int n() {
        int i2 = aa().getInt("dock_bar_transparency", 200);
        if (i2 > 255) {
            return 255;
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public static void d(int i2) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("dock_button_transparency", i2);
        Z.commit();
    }

    public static int o() {
        int i2 = aa().getInt("dock_button_transparency", 255);
        if (i2 > 255) {
            return 255;
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public static boolean p() {
        return i;
    }

    public static void c(boolean z2) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("desktop_select_countdown", z2);
        Z.commit();
        i = z2;
    }

    public static int q() {
        return aa().getInt("desktop_transition_effect", 0);
    }

    public static void e(int i2) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("desktop_transition_effect", i2);
        Z.commit();
    }

    public static boolean r() {
        return d;
    }

    public static void a(com.tsf.shell.workspace3D.j.f fVar) {
        q = fVar;
    }

    public static void b(Boolean bool) {
        d = bool.booleanValue();
        if (bool.booleanValue()) {
            bf.l().d(false);
        } else {
            bf.l().c(false);
        }
        if (q != null) {
            com.censivn.C3DEngine.a.a().c(new u());
        }
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("auto_hide_side_bar", bool.booleanValue());
        Z.commit();
    }

    public static void f(int i2) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("defaultTextStyle", i2);
        Z.commit();
    }

    public static int s() {
        switch (aa().getInt("defaultTextStyle", 0)) {
            case 0:
            default:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
        }
    }

    public static boolean t() {
        return c;
    }

    public static void c(Boolean bool) {
        c = bool.booleanValue();
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("screen_infinite_scroll", bool.booleanValue());
        Z.commit();
    }

    public static int u() {
        return aa().getInt("version", 1);
    }

    public static void g(int i2) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("version", i2);
        Z.commit();
    }

    public static boolean v() {
        return aa().getBoolean("notification_bar_transparent_status", false);
    }

    public static void d(Boolean bool) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("notification_bar_transparent_status", bool.booleanValue());
        Z.commit();
    }

    public static boolean w() {
        return aa().getBoolean("notification_status", true);
    }

    public static void e(Boolean bool) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("notification_status", bool.booleanValue());
        Z.commit();
    }

    public static void h(int i2) {
        SharedPreferences.Editor Z = Z();
        com.tsf.shell.workspace3D.a.a(i2);
        Z.putInt("drawer_background_alpha", com.tsf.shell.workspace3D.a.a());
        Z.commit();
    }

    public static int x() {
        return r;
    }

    public static int y() {
        return s;
    }

    public static int z() {
        return t;
    }

    public static int A() {
        return u;
    }

    public static boolean B() {
        return v;
    }

    public static void a(int i2, int i3) {
        SharedPreferences.Editor Z = Z();
        if (com.censivn.C3DEngine.a.q) {
            r = i2;
            s = i3;
            Z.putInt("drawer_rows_v", i2);
            Z.putInt("drawer_columns_v", i3);
        } else {
            t = i2;
            u = i3;
            Z.putInt("drawer_rows_h", i2);
            Z.putInt("drawer_columns_h", i3);
        }
        Z.commit();
    }

    public static void d(boolean z2) {
        v = z2;
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("drawer_autosize", z2);
        Z.commit();
    }

    public static int C() {
        return f;
    }

    public static void i(int i2) {
        f = i2;
        if (i2 != ShellWallpaperManager.a) {
            f = ShellWallpaperManager.b;
        }
        SharedPreferences.Editor Z = Z();
        Z.putInt("wallpaper_mode", f);
        Z.commit();
    }

    public static ArrayList D() {
        ArrayList arrayList = new ArrayList();
        String string = aa().getString("hidden_app", "");
        if (string.length() != 0) {
            String[] split = string.split(",");
            for (String str : split) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void a(ArrayList arrayList) {
        String str;
        String str2 = "";
        Iterator it = arrayList.iterator();
        while (true) {
            str = str2;
            if (!it.hasNext()) {
                break;
            }
            str2 = String.valueOf(str) + ((String) it.next()) + ",";
        }
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        SharedPreferences.Editor Z = Z();
        Z.putString("hidden_app", str);
        Z.commit();
    }

    public static boolean E() {
        return b;
    }

    public static void e(boolean z2) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("vibration_feedback", z2);
        Z.commit();
        b = z2;
    }

    public static boolean F() {
        return a;
    }

    public static void f(boolean z2) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("indicator_mode", z2);
        Z.commit();
        a = z2;
    }

    public static boolean G() {
        return w;
    }

    public static void g(boolean z2) {
        w = z2;
    }

    public static boolean H() {
        return aa().getBoolean("standard_sliding_mode", true);
    }

    public static void h(boolean z2) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("standard_sliding_mode", z2);
        Z.commit();
    }

    public static boolean I() {
        return aa().getBoolean("sliding_360_mode", true);
    }

    public static void i(boolean z2) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("sliding_360_mode", z2);
        Z.commit();
    }

    public static void c(float f2, float f3) {
        x = f2;
        y = f3;
        SharedPreferences.Editor Z = Z();
        Z.putFloat("360_button_x", f2);
        Z.putFloat("360_button_y", f3);
        Z.commit();
    }

    public static void d(float f2, float f3) {
        z = f2;
        A = f3;
        SharedPreferences.Editor Z = Z();
        Z.putFloat("360_button_x_horizontal", f2);
        Z.putFloat("360_button_y_horizontal", f3);
        Z.commit();
    }

    public static float[] e(float f2, float f3) {
        float[] fArr = new float[2];
        if (x == 0.0f && y == 0.0f) {
            fArr[0] = f2;
            fArr[1] = f3;
        } else {
            fArr[0] = x;
            fArr[1] = y;
        }
        return fArr;
    }

    public static float[] f(float f2, float f3) {
        float[] fArr = new float[2];
        if (z == 0.0f && A == 0.0f) {
            fArr[0] = f2;
            fArr[1] = f3;
        } else {
            fArr[0] = z;
            fArr[1] = A;
        }
        return fArr;
    }

    public static void c(float f2) {
        SharedPreferences.Editor Z = Z();
        Z.putFloat("screenscale", f2);
        Z.commit();
    }

    public static float J() {
        float f2 = aa().getFloat("screenscale", 0.0f);
        if (f2 != 0.0f) {
            if (f2 > com.tsf.shell.setting.f.a) {
                return com.tsf.shell.setting.f.a;
            }
            if (f2 < 0.8f) {
                return 0.8f;
            }
        }
        return f2;
    }

    public static void j(int i2) {
        com.censivn.C3DEngine.a.a().d(new v(i2));
    }

    public static int K() {
        return aa().getInt("screen", -1);
    }

    public static void k(int i2) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("homescreen", i2);
        Z.commit();
    }

    public static int L() {
        return aa().getInt("homescreen", -1);
    }

    public static void a(s sVar) {
        com.censivn.C3DEngine.a.a().d(new w(sVar));
    }

    public static s M() {
        String str;
        int i2;
        Cursor query = com.censivn.C3DEngine.a.c().getContentResolver().query(bz.b, null, null, null, null);
        query.moveToNext();
        try {
            i2 = query.getInt(query.getColumnIndex("extrascreen"));
            str = query.getString(query.getColumnIndex("screenorder"));
        } catch (Exception e2) {
            str = "";
            i2 = 1;
        }
        if (i2 > 12) {
            i2 = 12;
        } else if (i2 <= 0) {
            i2 = 1;
        }
        query.close();
        s sVar = new s();
        sVar.a = i2;
        sVar.b = str;
        return sVar;
    }

    public static int[] N() {
        SharedPreferences aa = aa();
        return new int[]{aa.getInt("transition", 1), aa.getInt("transition3d", 0)};
    }

    public static void b(int i2, int i3) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("transition", i2);
        Z.putInt("transition3d", i3);
        Z.commit();
    }

    public static int O() {
        return aa().getInt("appsort", 0);
    }

    public static void l(int i2) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("appsort", i2);
        Z.commit();
    }

    public static r P() {
        SharedPreferences aa = aa();
        return new r(aa.getString("menuorder", "0,1,2,3"), aa.getInt("menuindex", 1), aa.getInt("menuposition", 0));
    }

    public static void a(String str, int i2, int i3) {
        SharedPreferences.Editor Z = Z();
        Z.putString("menuorder", str);
        Z.putInt("menuindex", i2);
        Z.putInt("menuposition", i3);
        Z.commit();
    }

    public static String Q() {
        return aa().getString("settingmenu", "0,1,2,3,4,5");
    }

    public static void c(String str) {
        SharedPreferences.Editor Z = Z();
        Z.putString("settingmenu", str);
        Z.commit();
    }

    public static int R() {
        return B;
    }

    public static boolean S() {
        return C;
    }

    public static void m(int i2) {
        B = com.tsf.shell.preference.t.a(i2);
        SharedPreferences.Editor Z = Z();
        Z.putInt("perference_folder_animation", B);
        Z.commit();
    }

    public static void j(boolean z2) {
        C = z2;
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("perference_folder_auto_close", z2);
        Z.commit();
    }

    public static int T() {
        if (j < 0) {
            j = 0;
        } else if (j > 1) {
            j = 1;
        }
        return j;
    }

    public static void n(int i2) {
        j = i2;
        SharedPreferences.Editor Z = Z();
        Z.putInt("perference_direction", i2);
        Z.commit();
    }

    public static int a(Context context) {
        int i2 = aa().getInt("screen_orientation_value", context.getResources().getBoolean(R.bool.allow_rotation) ? 0 : 1);
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 2) {
            return 2;
        }
        return i2;
    }

    public static void a(int i2, Activity activity) {
        SharedPreferences.Editor Z = Z();
        Z.putInt("screen_orientation_value", i2);
        Z.commit();
        if (activity != null) {
            b(i2, activity);
        }
    }

    public static void U() {
        Home d2 = Home.d();
        b(d2.getResources().getConfiguration().orientation != 2 ? 1 : 2, d2);
    }

    public static void V() {
        Home d2 = Home.d();
        b(a(d2), d2);
    }

    public static void b(int i2, Activity activity) {
        switch (i2) {
            case 0:
                activity.setRequestedOrientation(-1);
                break;
            case 1:
                activity.setRequestedOrientation(1);
                break;
            case 2:
                activity.setRequestedOrientation(0);
                break;
            default:
                activity.setRequestedOrientation(1);
                break;
        }
    }

    public static boolean W() {
        return aa().getBoolean("widgetanimation", true);
    }

    public static void k(boolean z2) {
        SharedPreferences.Editor Z = Z();
        Z.putBoolean("widgetanimation", z2);
        Z.commit();
    }

    public static int X() {
        return aa().getInt("iconeffect", 0);
    }

    public static void Y() {
        SharedPreferences.Editor Z = Z();
        Z.putInt("iconeffect", 0);
        Z.commit();
    }

    public static SharedPreferences.Editor Z() {
        return aa().edit();
    }

    public static SharedPreferences aa() {
        if (D == null) {
            D = com.censivn.C3DEngine.a.c().getSharedPreferences("config", 0);
        }
        return D;
    }

    public static void ab() {
        SharedPreferences.Editor edit = aa().edit();
        edit.clear();
        edit.commit();
    }
}
