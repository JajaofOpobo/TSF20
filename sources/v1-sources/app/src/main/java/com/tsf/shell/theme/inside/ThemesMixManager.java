package com.tsf.shell.theme.inside;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tsf.shell.R;
import com.tsf.shell.a.z;
import com.tsf.shell.theme.inside.element.ThemeContactManager;
import com.tsf.shell.theme.inside.element.ThemeDockManager;
import com.tsf.shell.theme.inside.element.ThemeFolderManager;
import com.tsf.shell.theme.inside.element.ThemeIconManager;
import com.tsf.shell.theme.inside.element.ThemeMenuManager;
import com.tsf.shell.theme.inside.element.ThemePageManager;
import com.tsf.shell.theme.inside.widget.SystemContactTheme;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;
import com.tsf.shell.workspace3D.j.b.d;

/* loaded from: classes.dex */
public class ThemesMixManager {
    public static final int TYPE_CONTACT = 3;
    public static final int TYPE_DOCK = 1;
    public static final int TYPE_FOLDER = 2;
    public static final int TYPE_ICON = 0;
    public static final int TYPE_MENU = 4;
    public static final int TYPE_PAGE_PREVIEW = 5;
    private com.tsf.shell.workspace3D.j.b.a BUTTON_CONTACT;
    private com.tsf.shell.workspace3D.j.b.a BUTTON_DOCK;
    private com.tsf.shell.workspace3D.j.b.a BUTTON_FOLDER;
    private com.tsf.shell.workspace3D.j.b.a BUTTON_ICON;
    private com.tsf.shell.workspace3D.j.b.a BUTTON_MENU;
    private com.tsf.shell.workspace3D.j.b.a BUTTON_PAGE;
    public ThemeContactManager contact;
    public ThemeDockManager dock;
    public ThemeFolderManager folder;
    public ThemeIconManager icon;
    private ThemeManager manager;
    public ThemeMenuManager menu;
    public ThemePageManager page;
    public d ui = new d();

    public ThemesMixManager(ThemeManager themeManager) {
        this.manager = themeManager;
        this.icon = new ThemeIconManager(themeManager);
        this.contact = new ThemeContactManager(themeManager);
        this.folder = new ThemeFolderManager(themeManager);
        this.menu = new ThemeMenuManager(themeManager);
        this.dock = new ThemeDockManager(themeManager);
        this.page = new ThemePageManager(themeManager);
    }

    public void iniConfiguration() {
        this.icon.iniConfiguration();
        this.contact.iniConfiguration();
        this.folder.iniConfiguration();
        this.menu.iniConfiguration();
        this.dock.iniConfiguration();
        this.page.iniConfiguration();
    }

    public void registerSettingButton(com.tsf.shell.workspace3D.j.b.a aVar, int i) {
        switch (i) {
            case 0:
                this.BUTTON_ICON = aVar;
                break;
            case 1:
                this.BUTTON_DOCK = aVar;
                break;
            case 2:
                this.BUTTON_FOLDER = aVar;
                break;
            case 3:
                this.BUTTON_CONTACT = aVar;
                break;
            case 4:
                this.BUTTON_MENU = aVar;
                break;
            case 5:
                this.BUTTON_PAGE = aVar;
                break;
        }
    }

    public void saveThemesMixConfiguration(int i, String str) {
        z config = this.manager.getConfig();
        switch (i) {
            case 0:
                config.c = str;
                break;
            case 1:
                config.g = str;
                break;
            case 2:
                config.e = str;
                break;
            case 3:
                config.d = str;
                break;
            case 4:
                config.f = str;
                break;
            case 5:
                config.h = str;
                break;
        }
        this.manager.saveConfigurationToDatabase();
    }

    public String getSettingButtonName(int i) {
        switch (i) {
            case 0:
                return com.censivn.C3DEngine.h.a.c(R.string.menu_setting_icon);
            case 1:
                return com.censivn.C3DEngine.h.a.c(R.string.mn_dock);
            case 2:
                return com.censivn.C3DEngine.h.a.c(R.string.widget_folder);
            case 3:
                return com.censivn.C3DEngine.h.a.c(R.string.widget_contact);
            case 4:
                return com.censivn.C3DEngine.h.a.c(R.string.menu_setting_menu);
            case 5:
                return com.censivn.C3DEngine.h.a.c(R.string.mn_screen);
            default:
                return "";
        }
    }

    public void updateSettingButtonInfo(int i) {
        switch (i) {
            case 0:
                this.BUTTON_ICON.a(this.icon.getIconThemeIcon(), com.censivn.C3DEngine.h.a.c(R.string.menu_setting_icon), this.icon.getIconThemeName());
                break;
            case 1:
                ThemeDockDescription theme = ThemeManager.mix.dock.getTheme();
                Bitmap bitmap = theme.getBitmap(ThemeDockDescription.DOCK_BAR);
                Canvas canvas = new Canvas(bitmap);
                Bitmap bitmap2 = theme.getBitmap(ThemeDockDescription.DOCK_DESKTOP_SELECTOR_BUTTON_OFF);
                canvas.drawBitmap(bitmap2, (bitmap.getWidth() - bitmap2.getWidth()) / 2, (bitmap.getHeight() - bitmap2.getHeight()) / 2, (Paint) null);
                bitmap2.recycle();
                this.BUTTON_DOCK.a(bitmap, com.censivn.C3DEngine.h.a.c(R.string.mn_dock), theme.themeName);
                break;
            case 2:
                SystemFolderTheme theme2 = ThemeManager.mix.folder.getTheme();
                this.BUTTON_FOLDER.a(theme2.getIconBitmap(), com.censivn.C3DEngine.h.a.c(R.string.widget_folder), theme2.themeName);
                break;
            case 3:
                SystemContactTheme theme3 = ThemeManager.mix.contact.getTheme();
                this.BUTTON_CONTACT.a(theme3.getIconBitmap(), com.censivn.C3DEngine.h.a.c(R.string.widget_contact), theme3.themeName);
                break;
            case 4:
                ThemeShellDescription theme4 = ThemeManager.mix.menu.getTheme();
                this.BUTTON_MENU.a(theme4.getBitmap(201), com.censivn.C3DEngine.h.a.c(R.string.menu_setting_menu), theme4.themeName);
                break;
            case 5:
                ThemeShellDescription theme5 = ThemeManager.mix.page.getTheme();
                this.BUTTON_PAGE.a(ThemePageManager.createPreviewBitmap(theme5), com.censivn.C3DEngine.h.a.c(R.string.mn_screen), theme5.themeName);
                break;
        }
    }

    public void onSetIconTheme(String str) {
        this.icon.setCustomTheme(str);
    }

    public void onSetFolderTheme(String str) {
        this.folder.setCustomTheme(str);
    }

    public void onSetContact(String str) {
        this.contact.setCustomTheme(str);
    }

    public void onSetMenu(String str) {
        this.menu.setCustomTheme(str);
    }

    public void onSetPagePreview(String str) {
        this.page.setCustomTheme(str);
    }

    public void onSetDock(String str) {
        this.dock.setCustomTheme(str);
    }
}
