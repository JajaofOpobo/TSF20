package com.tsf.shell.theme.inside.mix;

import android.content.Intent;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.plugin.themepicker.theme.ThemePickerActivity;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeIconDescription;
import com.tsf.shell.theme.inside.parser.ThemeIconPackageParser;
import com.tsf.shell.theme.inside.parser.ThemeParser;
import com.tsf.shell.utils.C4181q;
/* loaded from: classes.dex */
public class ThemeIconManager extends ThemeMixElementManager implements C0913a.InterfaceC0914a {
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
        return C4181q.m635d(getIconThemeIcon(), i, i2);
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

    public Bitmap getDefaultIconBackBitmap(C3560a c3560a) {
        return this.mIconDescription.getBackBitmap(c3560a);
    }

    public Bitmap getDefaultIconUponBitmap(C3560a c3560a) {
        return this.mIconDescription.getUponBitmap(c3560a);
    }

    public Bitmap getDefaultIconMaskBitmap(C3560a c3560a) {
        return this.mIconDescription.getMaskBitmap(c3560a);
    }

    public float getDefaultIconScale() {
        return this.mIconDescription.scale;
    }

    public Bitmap getIconThemeIcon() {
        return this.mIconDescription.getPackageIcon();
    }

    public Bitmap getIconFilterBitmap(String str, C3560a c3560a) {
        return this.mIconDescription.getIconFilterBitmap(str, c3560a);
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
                this.mIconDescription = new ThemeIconPackageParser().parser(C0853a.m10856d().createPackageContext(str, 3));
            }
        } catch (Exception e) {
        }
        if (this.mIconDescription == null) {
            this.mIconDescription = new ThemeIconDescription(C0853a.m10856d());
        }
        updateShortcutBackgroud();
    }

    public void startIconPackagePicker() {
        Intent intent = new Intent();
        intent.setClass(C0853a.m10856d(), ThemePickerActivity.class);
        this.mPickerActivityResultId = Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) this);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.mPickerActivityResultId) {
            String stringExtra = intent.getStringExtra(ThemePickerActivity.f12802s);
            if (stringExtra == null || stringExtra.equals("")) {
                stringExtra = C0853a.m10858b();
            }
            ThemeManager.mix.setTheme(getType(), stringExtra, true);
        }
    }

    public void updateShortcutBackgroud() {
        C3519a.m2143b();
    }
}
