package com.tsf.shell.theme.inside.element;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.Home;
import com.tsf.shell.a.z;
import com.tsf.shell.plugin.iconpicker.IconPackagePicker;
import com.tsf.shell.theme.inside.DefaultIconItem;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeIconDescription;
import com.tsf.shell.theme.inside.ThemeIconPackageParser;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.ae;

/* loaded from: classes.dex */
public class ThemeIconManager implements com.tsf.shell.a {
    private boolean isRandomIconBack = false;
    private ThemeIconDescription mCustomThemeIconDescription;
    private Bitmap mDefaultIconBackBitmap;
    private float mDefaultIconScale;
    private Bitmap mDefaultIconUponBitmap;
    private int mPickerActivityResultId;
    private ThemeManager manager;

    public ThemeIconManager(ThemeManager themeManager) {
        this.manager = themeManager;
    }

    public void iniConfiguration() {
        updateIconTheme();
        initIconConfiguration();
    }

    private void initIconConfiguration() {
        setIconFilterPackage(this.manager.getConfig().c, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconFilterPackage(String str, boolean z) {
        ThemeIconDescription parser;
        if (str != null) {
            try {
                if (!str.equals("")) {
                    Context c = com.censivn.C3DEngine.a.c();
                    com.censivn.C3DEngine.a.c();
                    com.censivn.C3DEngine.a.c();
                    Context createPackageContext = c.createPackageContext(str, 3);
                    try {
                        ThemeParser themeParser = new ThemeParser(createPackageContext);
                        themeParser.parser(6);
                        ThemeDescription themeDescription = themeParser.getThemeDescription();
                        parser = themeDescription != null ? themeDescription.icon : null;
                        this.isRandomIconBack = false;
                    } catch (Exception e) {
                        parser = new ThemeIconPackageParser().parser(createPackageContext);
                        this.isRandomIconBack = true;
                    }
                    this.mCustomThemeIconDescription = parser;
                    if (this.mCustomThemeIconDescription != null && !z) {
                        setConfiguration(this.manager.getConfig(), this.mCustomThemeIconDescription);
                        return;
                    }
                    return;
                }
            } catch (Exception e2) {
                return;
            }
        }
        this.mCustomThemeIconDescription = null;
    }

    public void startIconPackagePicker() {
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.c(), IconPackagePicker.class);
        this.mPickerActivityResultId = Home.d().a(intent, this);
    }

    @Override // com.tsf.shell.a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.mPickerActivityResultId) {
            com.censivn.C3DEngine.a.a().c(new j(this, intent.getStringExtra("packagename")));
        }
    }

    public float getDefaultIconScale() {
        return this.mDefaultIconScale;
    }

    public boolean isDefaultIconBackBitmap(Bitmap bitmap) {
        return this.mDefaultIconBackBitmap == bitmap;
    }

    public Bitmap getDefaultIconBackBitmap() {
        if (this.mDefaultIconBackBitmap != null) {
            return this.mDefaultIconBackBitmap;
        }
        if (this.mCustomThemeIconDescription != null && this.isRandomIconBack) {
            return this.mCustomThemeIconDescription.getRandomDefaultIconBack();
        }
        return null;
    }

    public Bitmap getDefaultIconUponBitmap() {
        if (this.mDefaultIconUponBitmap != null) {
            return this.mDefaultIconUponBitmap;
        }
        return null;
    }

    public boolean isRandomIconBack() {
        return this.isRandomIconBack;
    }

    public String getCurrentIconThemePackageName() {
        return this.mCustomThemeIconDescription != null ? this.mCustomThemeIconDescription.packagename : this.manager.getCurrentThemeDescription().icon.packagename;
    }

    public Bitmap getIconThemeIcon() {
        return this.mCustomThemeIconDescription != null ? this.mCustomThemeIconDescription.getPackageIcon() : this.manager.getCurrentThemeDescription().icon.getPackageIcon();
    }

    public String getIconThemeName() {
        return this.mCustomThemeIconDescription != null ? this.mCustomThemeIconDescription.themeName : this.manager.getCurrentThemeDescription().icon.themeName;
    }

    public Bitmap getIconFilterBitmap(String str) {
        return this.mCustomThemeIconDescription != null ? this.mCustomThemeIconDescription.getIconFilterBitmap(str) : this.manager.getCurrentThemeDescription().icon.getIconFilterBitmap(str);
    }

    public void setCustomTheme(String str) {
        if (!str.equals(getCurrentIconThemePackageName())) {
            k kVar = new k(this, str);
            com.censivn.C3DEngine.a.a();
            w.a(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSetCustomIconFilter(ThemeIconDescription themeIconDescription) {
        this.mCustomThemeIconDescription = themeIconDescription;
        if (themeIconDescription != null) {
            saveConfig(themeIconDescription.packagename);
            updateIconTheme();
        } else {
            restoreIconConfigToCurrentTheme();
            updateIconTheme();
        }
        updateShortcutBackgroud();
        ThemeManager.mix.updateSettingButtonInfo(0);
        bf.j().E();
        m mVar = new m(this);
        com.censivn.C3DEngine.a.a();
        w.a(mVar);
    }

    private void saveConfig(String str) {
        ThemeManager.mix.saveThemesMixConfiguration(0, str);
    }

    public static void setConfiguration(z zVar, ThemeIconDescription themeIconDescription) {
        zVar.i = themeIconDescription.packagename;
        zVar.j = themeIconDescription.getDefaultMaskFilename();
        zVar.k = themeIconDescription.packagename;
        DefaultIconItem defaultIconBackFilename = themeIconDescription.getDefaultIconBackFilename();
        if (defaultIconBackFilename == null) {
            zVar.l = "";
            zVar.m = themeIconDescription.scale;
        } else {
            zVar.l = defaultIconBackFilename.drawable;
            zVar.m = defaultIconBackFilename.scale;
        }
    }

    public void updateIconTheme() {
        if (this.mDefaultIconBackBitmap != null) {
            this.mDefaultIconBackBitmap.recycle();
            this.mDefaultIconBackBitmap = null;
        }
        z config = this.manager.getConfig();
        this.mDefaultIconScale = config.m;
        Bitmap defaultIconBack = ThemeIconDescription.getDefaultIconBack(config.k, config.l);
        if (defaultIconBack != null) {
            this.mDefaultIconBackBitmap = defaultIconBack;
            this.isRandomIconBack = false;
        }
        if (this.mDefaultIconUponBitmap != null) {
            this.mDefaultIconUponBitmap.recycle();
            this.mDefaultIconUponBitmap = null;
        }
        this.mDefaultIconUponBitmap = ThemeIconDescription.getDefaultIconMask(config.i, config.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetIconTheme() {
        if (this.mDefaultIconBackBitmap != null) {
            this.mDefaultIconBackBitmap.recycle();
            this.mDefaultIconBackBitmap = null;
            this.isRandomIconBack = false;
            this.mDefaultIconScale = 1.0f;
        }
        if (this.mDefaultIconUponBitmap != null) {
            this.mDefaultIconUponBitmap.recycle();
            this.mDefaultIconUponBitmap = null;
        }
        z config = this.manager.getConfig();
        config.l = "";
        config.k = "";
        config.j = "";
        config.i = "";
    }

    private void restoreIconConfigToCurrentTheme() {
        ThemeDescription currentThemeDescription = this.manager.getCurrentThemeDescription();
        z config = this.manager.getConfig();
        if (currentThemeDescription != null) {
            config.a = currentThemeDescription.packagename;
            config.i = currentThemeDescription.packagename;
            config.j = currentThemeDescription.icon.getDefaultMaskFilename();
            config.k = currentThemeDescription.packagename;
            DefaultIconItem defaultIconBackFilename = currentThemeDescription.icon.getDefaultIconBackFilename();
            if (defaultIconBackFilename == null) {
                config.l = "";
                config.m = 1.0f;
                config.k = "";
            } else {
                config.l = defaultIconBackFilename.drawable;
                config.m = defaultIconBackFilename.scale;
            }
            config.c = currentThemeDescription.packagename;
            this.manager.saveConfigurationToDatabase();
        }
    }

    public void setIconConfig(String str, String str2, float f, String str3, String str4) {
        z config = this.manager.getConfig();
        config.k = str;
        config.l = str2;
        config.i = str3;
        config.j = str4;
        config.m = f;
        updateIconTheme();
        updateShortcutBackgroud();
        this.manager.saveConfigurationToDatabase();
        bf.j().E();
    }

    public void updateShortcutBackgroud() {
        bf.j().p().bA();
        ae.bX();
    }
}
