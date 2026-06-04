package com.tsf.shell.theme.inside.element;

import android.content.Context;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.theme.inside.widget.SystemContactTheme;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.aj;

/* loaded from: classes.dex */
public class ThemeContactManager {
    public SystemContactTheme mCustomDescription;
    private ThemeManager manager;

    public ThemeContactManager(ThemeManager themeManager) {
        this.manager = themeManager;
    }

    public void iniConfiguration() {
        initConfiguration();
    }

    private void initConfiguration() {
        this.mCustomDescription = getThemeByThemePackagename(this.manager.getConfig().d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SystemContactTheme getThemeByThemePackagename(String str) {
        SystemContactTheme systemContactTheme = null;
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
                systemContactTheme = themeByPackagename.widget.contact;
            }
            if (systemContactTheme == null) {
                ThemeParser themeParser = new ThemeParser(createPackageContext);
                themeParser.parser(16);
                ThemeDescription themeDescription = themeParser.getThemeDescription();
                if (themeDescription != null && themeDescription.widget != null) {
                    return themeDescription.widget.contact;
                }
                return systemContactTheme;
            }
            return systemContactTheme;
        } catch (Exception e) {
            return null;
        }
    }

    public void setCustomTheme(String str) {
        a aVar = new a(this, str);
        com.censivn.C3DEngine.a.a();
        w.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSetCustomTheme(SystemContactTheme systemContactTheme) {
        this.mCustomDescription = systemContactTheme;
        resetTheme();
        if (systemContactTheme != null) {
            saveConfig(systemContactTheme.packagename);
        } else {
            saveConfig("");
        }
        ThemeManager.mix.updateSettingButtonInfo(3);
        aj.bW();
        bf.j().E();
        c cVar = new c(this);
        com.censivn.C3DEngine.a.a();
        w.a(cVar);
    }

    private void saveConfig(String str) {
        ThemeManager.mix.saveThemesMixConfiguration(3, str);
    }

    private void resetTheme() {
        this.manager.getConfig().d = "";
    }

    public SystemContactTheme getTheme() {
        return this.mCustomDescription == null ? this.manager.getCurrentThemeDescription().widget.contact : this.mCustomDescription;
    }
}
