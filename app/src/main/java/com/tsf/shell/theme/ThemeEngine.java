package com.tsf.shell.theme;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

public class ThemeEngine {

    public static final String ACTION_TSF_THEME = "com.tsf.shell.themes";
    public static final String ACTION_ADW_THEME = "org.adw.launcher.THEMES";
    public static final String ACTION_GO_THEME = "com.gau.go.launcherex.theme";

    private final Context context;
    private final PackageManager pm;

    public ThemeEngine(Context context) {
        this.context = context.getApplicationContext();
        this.pm = context.getPackageManager();
    }

    public List<ThemeInfo> discoverThemes() {
        List<ThemeInfo> themes = new ArrayList<>();

        for (String action : new String[]{ACTION_TSF_THEME, ACTION_ADW_THEME, ACTION_GO_THEME}) {
            Intent query = new Intent(action);
            for (ResolveInfo ri : pm.queryIntentActivities(query, PackageManager.GET_META_DATA)) {
                ThemeInfo info = new ThemeInfo();
                info.packageName = ri.activityInfo.packageName;
                info.name = ri.loadLabel(pm).toString();
                info.icon = ri.loadIcon(pm);
                themes.add(info);
            }
        }
        return themes;
    }

    public void applyTheme(String packageName) {
        Intent intent = pm.getLaunchIntentForPackage(packageName);
        if (intent != null) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }

    public static class ThemeInfo {
        public String packageName;
        public String name;
        public Drawable icon;
    }
}