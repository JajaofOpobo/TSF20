package com.tsf.shell.theme;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

public class ThemeManager {

    private static ThemeManager instance;
    private final Context context;
    private String currentThemePackage;

    private ThemeManager(Context context) {
        this.context = context.getApplicationContext();
    }

    public static synchronized ThemeManager getInstance(Context context) {
        if (instance == null) {
            instance = new ThemeManager(context);
        }
        return instance;
    }

    public List<ThemeInfo> getInstalledThemes() {
        List<ThemeInfo> themes = new ArrayList<>();
        Intent intent = new Intent("com.tsf.shell.themes");
        PackageManager pm = context.getPackageManager();
        List<ResolveInfo> infos = pm.queryIntentActivities(intent, 0);
        for (ResolveInfo info : infos) {
            ThemeInfo theme = new ThemeInfo();
            theme.packageName = info.activityInfo.packageName;
            theme.label = info.activityInfo.loadLabel(pm).toString();
            theme.icon = info.activityInfo.loadIcon(pm);
            themes.add(theme);
        }
        return themes;
    }

    public void applyTheme(String packageName) {
        currentThemePackage = packageName;
        context.getSharedPreferences("theme", Context.MODE_PRIVATE)
                .edit().putString("current_theme", packageName).apply();
    }

    public String getCurrentThemePackage() {
        if (currentThemePackage == null) {
            currentThemePackage = context.getSharedPreferences("theme", Context.MODE_PRIVATE)
                    .getString("current_theme", null);
        }
        return currentThemePackage;
    }

    public Drawable getThemeDrawable(String drawableName) {
        String pkg = getCurrentThemePackage();
        if (pkg == null) return null;
        try {
            PackageManager pm = context.getPackageManager();
            android.content.res.Resources themeRes = pm.getResourcesForApplication(pkg);
            int resId = themeRes.getIdentifier(drawableName, "drawable", pkg);
            if (resId != 0) {
                return themeRes.getDrawable(resId);
            }
        } catch (Exception ignored) {}
        return null;
    }

    public Drawable getIconForPackage(String packageName) {
        String pkg = getCurrentThemePackage();
        if (pkg == null) return null;
        try {
            PackageManager pm = context.getPackageManager();
            android.content.res.Resources themeRes = pm.getResourcesForApplication(pkg);
            int resId = themeRes.getIdentifier(
                    packageName.replace('.', '_'), "drawable", pkg);
            if (resId != 0) {
                return themeRes.getDrawable(resId);
            }
        } catch (Exception ignored) {}
        return null;
    }

    public static class ThemeInfo {
        public String packageName;
        public String label;
        public Drawable icon;
    }
}
