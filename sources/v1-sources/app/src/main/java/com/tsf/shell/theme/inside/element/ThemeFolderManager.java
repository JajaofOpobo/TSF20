package com.tsf.shell.theme.inside.element;

import android.content.Context;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public class ThemeFolderManager {
    public SystemFolderTheme mCustomDescription;
    private ThemeManager manager;

    public ThemeFolderManager(ThemeManager themeManager) {
        this.manager = themeManager;
    }

    public void iniConfiguration() {
        initConfiguration();
    }

    private void initConfiguration() {
        this.mCustomDescription = getThemeByThemePackagename(this.manager.getConfig().e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SystemFolderTheme getThemeByThemePackagename(String str) {
        SystemFolderTheme systemFolderTheme = null;
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
            if (themeByPackagename != null && themeByPackagename.widget != null) {
                systemFolderTheme = themeByPackagename.widget.folder;
            }
            if (systemFolderTheme == null) {
                ThemeParser themeParser = new ThemeParser(createPackageContext);
                themeParser.parser(8);
                ThemeDescription themeDescription = themeParser.getThemeDescription();
                if (themeDescription != null && themeDescription.widget != null) {
                    return themeDescription.widget.folder;
                }
                return systemFolderTheme;
            }
            return systemFolderTheme;
        } catch (Exception e) {
            return null;
        }
    }

    public void setCustomTheme(String str) {
        g gVar = new g(this, str);
        com.censivn.C3DEngine.a.a();
        w.a(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSetCustomTheme(SystemFolderTheme systemFolderTheme) {
        this.mCustomDescription = systemFolderTheme;
        resetTheme();
        if (systemFolderTheme != null) {
            saveConfig(systemFolderTheme.packagename);
        } else {
            saveConfig("");
        }
        ThemeManager.mix.updateSettingButtonInfo(2);
        com.tsf.shell.workspace3D.k.c.b.c.f();
        bf.j().E();
        i iVar = new i(this);
        com.censivn.C3DEngine.a.a();
        w.a(iVar);
    }

    private void saveConfig(String str) {
        ThemeManager.mix.saveThemesMixConfiguration(2, str);
    }

    private void resetTheme() {
        this.manager.getConfig().e = "";
    }

    public SystemFolderTheme getTheme() {
        return this.mCustomDescription == null ? this.manager.getCurrentThemeDescription().widget.folder : this.mCustomDescription;
    }
}
