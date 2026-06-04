package com.tsf.shell.action;

import android.content.Context;
import android.content.Intent;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.bd;
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r {
    public static ArrayList a;
    private static boolean b;

    public static void a(String str) {
        switch (Integer.parseInt(str.substring(6, str.length()))) {
            case 1:
                bf.j().u();
                break;
            case 2:
                bf.j().v();
                break;
            case 3:
                bf.j().w();
                break;
            case 4:
                bd.b();
                break;
            case 5:
                t tVar = new t();
                com.censivn.C3DEngine.a.a();
                w.a(tVar);
                break;
            case 6:
                bf.l().f();
                break;
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                Home.d().b(new Intent("android.search.action.GLOBAL_SEARCH"));
                break;
            case ThemeParser.TYPE_FOLDER /* 8 */:
                Home.d().b(new Intent("android.speech.action.WEB_SEARCH"));
                break;
            case 9:
                bf.h().a();
                break;
            case 10:
                bf.l().g();
                break;
            case 11:
                com.censivn.C3DEngine.a.a().c(new s());
                break;
        }
    }

    public static String a(Context context, int i, int i2) {
        return String.valueOf(i) + ",'" + a(context, i2) + "','tsf://" + i2 + "'";
    }

    public static String a(Context context, int i) {
        switch (i) {
            case 0:
                return context.getString(R.string.none);
            case 1:
                return context.getString(R.string.mn_action_app_drawer);
            case 2:
                return context.getString(R.string.mn_action_home_screen);
            case 3:
                return context.getString(R.string.mn_action_switch_appdrawer_homescreen);
            case 4:
                return context.getString(R.string.mn_action_toggle_notification_bar);
            case 5:
                return context.getString(R.string.mn_action_expand_notification_bar);
            case 6:
                return context.getString(R.string.mn_action_expand_shrink_menu_bar);
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                return context.getString(R.string.mn_action_text_search);
            case ThemeParser.TYPE_FOLDER /* 8 */:
                return context.getString(R.string.mn_action_voice_search);
            case 9:
                return context.getString(R.string.mn_action_tsf_settings);
            case 10:
                return context.getString(R.string.mn_action_toggle_menu_bar);
            case 11:
                return context.getString(R.string.mn_action_lasso_mode);
            default:
                return "";
        }
    }

    public static void a(boolean z) {
        if (b && z) {
            bd.a(true);
            b = false;
        }
    }
}
