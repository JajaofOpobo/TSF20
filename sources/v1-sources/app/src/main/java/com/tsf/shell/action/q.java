package com.tsf.shell.action;

import android.content.Context;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;

/* loaded from: classes.dex */
public final class q {
    public int a;
    public int b;
    public String c;

    public q(Context context, int i) {
        this.a = i;
        int i2 = 0;
        switch (i) {
            case 0:
                i2 = R.drawable.ic_action_none;
                break;
            case 1:
                i2 = R.drawable.ic_action_drawer;
                break;
            case 2:
                i2 = R.drawable.ic_action_homescreen;
                break;
            case 3:
                i2 = R.drawable.ic_action_drawer_homescreen;
                break;
            case 4:
                i2 = R.drawable.ic_action_toggle_notification_bar;
                break;
            case 5:
                i2 = R.drawable.ic_action_expand_notification_bar;
                break;
            case 6:
                i2 = R.drawable.ic_action_expand_shrink_menu;
                break;
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                i2 = R.drawable.ic_action_search;
                break;
            case ThemeParser.TYPE_FOLDER /* 8 */:
                i2 = R.drawable.ic_action_voice;
                break;
            case 9:
                i2 = R.drawable.ic_action_tsf_setting;
                break;
            case 10:
                i2 = R.drawable.ic_action_toggle_menu;
                break;
            case 11:
                i2 = R.drawable.ic_action_lasso_mode;
                break;
        }
        this.b = i2;
        this.c = r.a(context, i);
    }
}
