package com.tsf.shell.theme.inside.element;

import android.content.Context;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeDockDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public class ThemeDockManager {
    public ThemeDockDescription mCustomDescription;
    private ThemeManager manager;

    public ThemeDockManager(ThemeManager themeManager) {
        this.manager = themeManager;
    }

    public void iniConfiguration() {
        initConfiguration();
    }

    private void initConfiguration() {
        this.mCustomDescription = getThemeByThemePackagename(this.manager.getConfig().g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ThemeDockDescription getThemeByThemePackagename(String str) {
        ThemeDockDescription themeDockDescription = null;
        if (str == null) {
            return null;
        }
        try {
            if (str.equals("") || str.equals(getTheme().packagename)) {
                return null;
            }
            Context c = com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.c();
            Context createPackageContext = c.createPackageContext(str, 3);
            ThemeDescription themeByPackagename = this.manager.getThemeByPackagename(str);
            if (themeByPackagename != null && themeByPackagename.dock != null) {
                themeDockDescription = themeByPackagename.dock;
            }
            if (themeDockDescription == null) {
                ThemeParser themeParser = new ThemeParser(createPackageContext);
                themeParser.parser(65);
                ThemeDescription themeDescription = themeParser.getThemeDescription();
                if (themeDescription != null && themeDescription.shell != null) {
                    return themeDescription.dock;
                }
                return themeDockDescription;
            }
            return themeDockDescription;
        } catch (Exception e) {
            return null;
        }
    }

    public void setCustomTheme(String str) {
        d dVar = new d(this, str);
        com.censivn.C3DEngine.a.a();
        w.a(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSetCustomTheme(ThemeDockDescription themeDockDescription) {
        this.mCustomDescription = themeDockDescription;
        resetTheme();
        if (themeDockDescription != null) {
            saveConfig(themeDockDescription.packagename);
        } else {
            saveConfig("");
        }
        ThemeManager.mix.updateSettingButtonInfo(1);
        bf.s().e();
        f fVar = new f(this);
        com.censivn.C3DEngine.a.a();
        w.a(fVar);
    }

    private void saveConfig(String str) {
        ThemeManager.mix.saveThemesMixConfiguration(1, str);
    }

    private void resetTheme() {
        this.manager.getConfig().g = "";
    }

    public ThemeDockDescription getTheme() {
        return this.mCustomDescription == null ? this.manager.getCurrentThemeDescription().dock : this.mCustomDescription;
    }
}
