package com.tsf.shell.theme.inside.mix;

import android.content.Intent;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.b.c.a;
import com.tsf.shell.Home;
import com.tsf.shell.plugin.themepicker.theme.ThemePickerActivity;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeIconDescription;
import com.tsf.shell.theme.inside.parser.ThemeIconPackageParser;
import com.tsf.shell.theme.inside.parser.ThemeParser;
import com.tsf.shell.utils.q;
/* loaded from: classes.dex */
public class ThemeIconManager extends ThemeMixElementManager implements a.InterfaceC0025a {
    private ThemeIconDescription mIconDescription;
    private int mPickerActivityResultId;

    public ThemeIconManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
        setIconFilterPackage(getThemePackageName());
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return q.d(getIconThemeIcon(), i, i2);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void openThemeElementSelecter() {
        startIconPackagePicker();
    }

    public void recycleResouece() {
    }

    public boolean polyEffectEnable() {
        return this.mIconDescription.effectPolyParam != null;
    }

    public float[] getPolyEffectParam() {
        return this.mIconDescription.effectPolyParam;
    }

    public boolean isColorize() {
        return this.mIconDescription.isColorize;
    }

    public int colorize() {
        return this.mIconDescription.colorize;
    }

    public Bitmap getDefaultIconBackBitmap(com.tsf.shell.manager.o.a aVar) {
        return this.mIconDescription.getBackBitmap(aVar);
    }

    public Bitmap getDefaultIconUponBitmap(com.tsf.shell.manager.o.a aVar) {
        return this.mIconDescription.getUponBitmap(aVar);
    }

    public Bitmap getDefaultIconMaskBitmap(com.tsf.shell.manager.o.a aVar) {
        return this.mIconDescription.getMaskBitmap(aVar);
    }

    public float getDefaultIconScale() {
        return this.mIconDescription.scale;
    }

    public Bitmap getIconThemeIcon() {
        return this.mIconDescription.getPackageIcon();
    }

    public Bitmap getIconFilterBitmap(String str, com.tsf.shell.manager.o.a aVar) {
        return this.mIconDescription.getIconFilterBitmap(str, aVar);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void setTheme(ThemeParser.ThemeInfo themeInfo) {
        setIconFilterPackage(themeInfo.packagename);
        super.setTheme(themeInfo);
    }

    private void setIconFilterPackage(String str) {
        try {
            if (this.mIconDescription != null) {
                this.mIconDescription.destroy();
                this.mIconDescription = null;
            }
            if (str != null && !str.equals("")) {
                System.currentTimeMillis();
                this.mIconDescription = new ThemeIconPackageParser().parser(com.censivn.C3DEngine.a.d().createPackageContext(str, 3));
            }
        } catch (Exception e) {
        }
        if (this.mIconDescription == null) {
            this.mIconDescription = new ThemeIconDescription(com.censivn.C3DEngine.a.d());
        }
        updateShortcutBackgroud();
    }

    public void startIconPackagePicker() {
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.d(), ThemePickerActivity.class);
        this.mPickerActivityResultId = Home.b().a(intent, (a.InterfaceC0025a) this);
    }

    @Override // com.censivn.C3DEngine.b.c.a.InterfaceC0025a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.mPickerActivityResultId) {
            String stringExtra = intent.getStringExtra(ThemePickerActivity.s);
            if (stringExtra == null || stringExtra.equals("")) {
                stringExtra = com.censivn.C3DEngine.a.b();
            }
            ThemeManager.mix.setTheme(getType(), stringExtra, true);
        }
    }

    public void updateShortcutBackgroud() {
        com.tsf.shell.manager.l.a.b();
    }
}
