package com.tsf.shell.theme.inside.element;

import android.content.Context;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public class ThemeMenuManager {
    public ThemeShellDescription mCustomDescription;
    private ThemeManager manager;

    public ThemeMenuManager(ThemeManager themeManager) {
        this.manager = themeManager;
    }

    public void iniConfiguration() {
        initConfiguration();
    }

    private void initConfiguration() {
        this.mCustomDescription = getThemeByThemePackagename(this.manager.getConfig().f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ThemeShellDescription getThemeByThemePackagename(String str) {
        ThemeShellDescription themeShellDescription = null;
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
            if (themeByPackagename != null && themeByPackagename.shell != null) {
                themeShellDescription = themeByPackagename.shell;
            }
            if (themeShellDescription == null) {
                ThemeParser themeParser = new ThemeParser(createPackageContext);
                themeParser.parser(ThemeParser.TYPE_MENU);
                ThemeDescription themeDescription = themeParser.getThemeDescription();
                if (themeDescription != null && themeDescription.shell != null) {
                    return themeDescription.shell;
                }
                return themeShellDescription;
            }
            return themeShellDescription;
        } catch (Exception e) {
            return null;
        }
    }

    public void setCustomTheme(String str) {
        n nVar = new n(this, str);
        com.censivn.C3DEngine.a.a();
        w.a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSetCustomTheme(ThemeShellDescription themeShellDescription) {
        this.mCustomDescription = themeShellDescription;
        resetTheme();
        if (themeShellDescription != null) {
            saveConfig(themeShellDescription.packagename);
        } else {
            saveConfig("");
        }
        ThemeManager.mix.updateSettingButtonInfo(4);
        bf.l().h();
        p pVar = new p(this);
        com.censivn.C3DEngine.a.a();
        w.a(pVar);
    }

    private void saveConfig(String str) {
        ThemeManager.mix.saveThemesMixConfiguration(4, str);
    }

    private void resetTheme() {
        this.manager.getConfig().f = "";
    }

    public ThemeShellDescription getTheme() {
        return this.mCustomDescription == null ? this.manager.getCurrentThemeDescription().shell : this.mCustomDescription;
    }
}
