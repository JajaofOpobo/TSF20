package com.tsf.shell.settings;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;

public final class LauncherPreferences {

    private static final String PREFIX = "tsf_";

    public static final String KEY_HOME_ACTION = "home_key_action";
    public static final String KEY_BACK_ACTION = "back_key_action";
    public static final String KEY_DOUBLE_TAP = "gesture_double_tap";
    public static final String KEY_SWIPE_UP = "gesture_swipe_up";
    public static final String KEY_SWIPE_DOWN = "gesture_swipe_down";
    public static final String KEY_PINCH_IN = "gesture_pinch_in";
    public static final String KEY_PINCH_OUT = "gesture_pinch_out";
    public static final String KEY_TWO_UP = "gesture_two_up";
    public static final String KEY_TWO_DOWN = "gesture_two_down";
    public static final String KEY_TWO_LEFT = "gesture_two_left";
    public static final String KEY_TWO_RIGHT = "gesture_two_right";
    public static final String KEY_THEME_PACKAGE = "current_theme_package";
    public static final String KEY_DESKTOP_COLUMNS = "desktop_columns";
    public static final String KEY_DESKTOP_ROWS = "desktop_rows";
    public static final String KEY_SCREEN_COUNT = "desktop_screen_count";
    public static final String KEY_DOCK_ENABLED = "dock_enabled";
    public static final String KEY_HIDDEN_APPS = "hidden_apps";
    public static final String KEY_FIRST_RUN = "first_run";

    public static final int ACTION_NONE = 0;
    public static final int ACTION_HOME = 1;
    public static final int ACTION_BACK = 2;
    public static final int ACTION_MENU = 3;
    public static final int ACTION_APP_DRAWER = 4;
    public static final int ACTION_SEARCH = 5;
    public static final int ACTION_LOCK = 6;
    public static final int ACTION_SCREENSHOT = 7;
    public static final int ACTION_POWER = 8;

    private final SharedPreferences prefs;

    public LauncherPreferences(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public int getHomeAction() {
        return Integer.parseInt(prefs.getString(PREFIX + KEY_HOME_ACTION, String.valueOf(ACTION_HOME)));
    }

    public int getBackAction() {
        return Integer.parseInt(prefs.getString(PREFIX + KEY_BACK_ACTION, String.valueOf(ACTION_NONE)));
    }

    public int getGestureAction(String key) {
        return Integer.parseInt(prefs.getString(PREFIX + key, String.valueOf(ACTION_NONE)));
    }

    public void setGestureAction(String key, int action) {
        prefs.edit().putString(PREFIX + key, String.valueOf(action)).apply();
    }

    public void setHomeAction(int action) {
        prefs.edit().putString(PREFIX + KEY_HOME_ACTION, String.valueOf(action)).apply();
    }

    public void setBackAction(int action) {
        prefs.edit().putString(PREFIX + KEY_BACK_ACTION, String.valueOf(action)).apply();
    }

    public int getDesktopColumns() {
        return Integer.parseInt(prefs.getString(PREFIX + KEY_DESKTOP_COLUMNS, "4"));
    }

    public int getDesktopRows() {
        return Integer.parseInt(prefs.getString(PREFIX + KEY_DESKTOP_ROWS, "4"));
    }

    public int getScreenCount() {
        return Integer.parseInt(prefs.getString(PREFIX + KEY_SCREEN_COUNT, "5"));
    }

    public boolean isDockEnabled() {
        return prefs.getBoolean(PREFIX + KEY_DOCK_ENABLED, true);
    }

    public boolean isFirstRun() {
        return prefs.getBoolean(PREFIX + KEY_FIRST_RUN, true);
    }

    public void setFirstRun(boolean value) {
        prefs.edit().putBoolean(PREFIX + KEY_FIRST_RUN, value).apply();
    }

    public static String getActionLabel(Context context, int action) {
        switch (action) {
            case ACTION_HOME: return "Go Home";
            case ACTION_BACK: return "Go Back";
            case ACTION_MENU: return "Open Menu";
            case ACTION_APP_DRAWER: return "App Drawer";
            case ACTION_SEARCH: return "Search";
            case ACTION_LOCK: return "Lock Screen";
            case ACTION_SCREENSHOT: return "Screenshot";
            case ACTION_POWER: return "Power Menu";
            default: return "None";
        }
    }

    public static int[] getAvailableActions() {
        return new int[]{ACTION_NONE, ACTION_HOME, ACTION_BACK, ACTION_MENU,
                ACTION_APP_DRAWER, ACTION_SEARCH, ACTION_LOCK, ACTION_SCREENSHOT, ACTION_POWER};
    }
}