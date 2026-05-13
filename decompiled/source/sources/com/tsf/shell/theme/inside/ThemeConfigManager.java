package com.tsf.shell.theme.inside;

import android.content.SharedPreferences;
import com.censivn.C3DEngine.a;
import com.tsf.b;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class ThemeConfigManager {
    public static final String CONFIG_FILE_NAME = "theme_config";
    private static ElementConfig config = new ElementConfig();
    private static SharedPreferences mSharedPreferences;

    /* loaded from: classes.dex */
    public static class ElementConfig {
        String name;
        String packagename;
        int version;
    }

    public static SharedPreferences.Editor getConfigSharedPreferencesEditor() {
        return getConfigSharedPreferences().edit();
    }

    public static void setBaseTheme(String str, int i) {
        SharedPreferences.Editor configSharedPreferencesEditor = getConfigSharedPreferencesEditor();
        configSharedPreferencesEditor.putString("base_theme_packagename", str);
        configSharedPreferencesEditor.putInt("base_theme_version", i);
        configSharedPreferencesEditor.commit();
    }

    public static ElementConfig getBaseTheme() {
        config.packagename = getConfigSharedPreferences().getString("base_theme_packagename", a.b());
        config.version = getConfigSharedPreferences().getInt("base_theme_version", a.c());
        return config;
    }

    public static void saveThemeMixConfig(String str, String str2, String str3, int i) {
        SharedPreferences.Editor configSharedPreferencesEditor = getConfigSharedPreferencesEditor();
        configSharedPreferencesEditor.putString(str + "_name", str2);
        configSharedPreferencesEditor.putString(str + "_packagename", str3);
        configSharedPreferencesEditor.putInt(str + "_version", i);
        configSharedPreferencesEditor.commit();
    }

    public static ElementConfig getThemeMixConfig(String str) {
        config.name = getConfigSharedPreferences().getString(str + "_name", x.c(b.i.app_name));
        config.packagename = getConfigSharedPreferences().getString(str + "_packagename", "");
        config.version = getConfigSharedPreferences().getInt(str + "_version", 0);
        return config;
    }

    public static SharedPreferences getConfigSharedPreferences() {
        if (mSharedPreferences == null) {
            mSharedPreferences = a.d().getSharedPreferences(CONFIG_FILE_NAME, 0);
        }
        return mSharedPreferences;
    }

    public static void reset() {
        SharedPreferences.Editor edit = getConfigSharedPreferences().edit();
        edit.clear();
        edit.commit();
    }
}
