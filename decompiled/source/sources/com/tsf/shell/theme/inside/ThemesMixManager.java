package com.tsf.shell.theme.inside;

import android.content.Context;
import android.content.pm.PackageManager;
import com.censivn.C3DEngine.a;
import com.tsf.b;
import com.tsf.shell.manager.b.f;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.element.ThemeElementCacher;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.theme.inside.mix.ThemeActionManager;
import com.tsf.shell.theme.inside.mix.ThemeAppMutilChoiceManager;
import com.tsf.shell.theme.inside.mix.ThemeArrangeManager;
import com.tsf.shell.theme.inside.mix.ThemeClockManager;
import com.tsf.shell.theme.inside.mix.ThemeContactManager;
import com.tsf.shell.theme.inside.mix.ThemeDesktopEffectManager;
import com.tsf.shell.theme.inside.mix.ThemeFolderManager;
import com.tsf.shell.theme.inside.mix.ThemeIconManager;
import com.tsf.shell.theme.inside.mix.ThemeIconMenuManager;
import com.tsf.shell.theme.inside.mix.ThemeLassoManager;
import com.tsf.shell.theme.inside.mix.ThemePageManager;
import com.tsf.shell.theme.inside.mix.ThemeShellOtherManager;
import com.tsf.shell.theme.inside.mix.ThemeSmartButtonManager;
import com.tsf.shell.theme.inside.mix.ThemeUnreadCountManager;
import com.tsf.shell.theme.inside.mix.ThemeWidgetResizeManager;
import com.tsf.shell.theme.inside.mix.menu.ThemeSettingMenu;
import com.tsf.shell.theme.inside.parser.ThemeParser;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ThemesMixManager {
    public ThemeActionManager action;
    public ThemeAppMutilChoiceManager appMutilChoice;
    public ThemeClockManager clock;
    public ThemeContactManager contact;
    public ThemeDesktopEffectManager desktopEffect;
    public ThemeFolderManager folder;
    public ThemeIconManager icon;
    public ThemeIconMenuManager iconMenu;
    public ThemeArrangeManager interactiveArrange;
    public ThemeLassoManager lasso;
    private ThemeManager manager;
    private ArrayList<ThemeMixElementManager> managerLists;
    public ThemePageManager page;
    public ThemeShellOtherManager shellOther;
    public ThemeSmartButtonManager smartButton;
    public ThemeSettingMenu ui;
    public ThemeUnreadCountManager unreadCount;
    public ThemeWidgetResizeManager widgetResize;

    public static String getTypeTitle(Context context, int i) {
        int i2 = 0;
        switch (i) {
            case 2:
                i2 = b.i.text_icon_theme;
                break;
            case 4:
                i2 = b.i.text_clock;
                break;
            case 8:
                i2 = b.i.widget_folder;
                break;
            case 16:
                i2 = b.i.widget_contact;
                break;
            case 33:
                i2 = b.i.theme_element_other;
                break;
            case ThemeElementType.TYPE_DESKTOP /* 257 */:
                i2 = b.i.mn_screen;
                break;
            case ThemeElementType.TYPE_DESKTOP_EFFECT /* 513 */:
                i2 = b.i.text_desktop_effect;
                break;
            case ThemeElementType.TYPE_SMART_BUTTON /* 1025 */:
                i2 = b.i.text_smart_button;
                break;
            case ThemeElementType.TYPE_ICON_MENU /* 2049 */:
                i2 = b.i.theme_element_icon_menu;
                break;
            case ThemeElementType.TYPE_WIDGET_RESIZE /* 4097 */:
                i2 = b.i.theme_element_resize;
                break;
            case ThemeElementType.TYPE_LASSO /* 8193 */:
                i2 = b.i.mn_action_lasso_mode;
                break;
            case ThemeElementType.TYPE_ARRANGE /* 16385 */:
                i2 = b.i.pop_menu_arrangement;
                break;
            case ThemeElementType.TYPE_UNREAD_COUNT /* 32769 */:
                i2 = b.i.mn_unread_count;
                break;
            case ThemeElementType.TYPE_APP_MUTIL_CHOICE /* 131073 */:
                i2 = b.i.menu_multiple_choice;
                break;
            case ThemeElementType.TYPE_ACTION /* 524289 */:
                i2 = b.i.mn_action_app_drawer;
                break;
        }
        if (i2 != 0) {
            return x.b(context, i2);
        }
        return "";
    }

    public ThemesMixManager(ThemeManager themeManager) {
        this.manager = themeManager;
        ThemeManager.mix = this;
        System.currentTimeMillis();
        this.icon = new ThemeIconManager(this.manager, 2, "element_icon");
        this.folder = new ThemeFolderManager(this.manager, 8, "element_folder");
        this.contact = new ThemeContactManager(this.manager, 16, "element_contact");
        this.clock = new ThemeClockManager(this.manager, 4, "element_clock");
        this.page = new ThemePageManager(this.manager, ThemeElementType.TYPE_DESKTOP, "element_desktop");
        this.smartButton = new ThemeSmartButtonManager(this.manager, ThemeElementType.TYPE_SMART_BUTTON, "element_smart_button");
        this.iconMenu = new ThemeIconMenuManager(this.manager, ThemeElementType.TYPE_ICON_MENU, "element_icon_menu");
        this.lasso = new ThemeLassoManager(this.manager, ThemeElementType.TYPE_LASSO, "element_lasso");
        this.desktopEffect = new ThemeDesktopEffectManager(this.manager, ThemeElementType.TYPE_DESKTOP_EFFECT, "element_effect_color");
        this.interactiveArrange = new ThemeArrangeManager(this.manager, ThemeElementType.TYPE_ARRANGE, "element_arrangement");
        this.appMutilChoice = new ThemeAppMutilChoiceManager(this.manager, ThemeElementType.TYPE_APP_MUTIL_CHOICE, "element_mutil_choice");
        this.unreadCount = new ThemeUnreadCountManager(this.manager, ThemeElementType.TYPE_UNREAD_COUNT, "element_unread_count");
        this.shellOther = new ThemeShellOtherManager(this.manager, 33, "element_other");
        this.widgetResize = new ThemeWidgetResizeManager(this.manager, ThemeElementType.TYPE_WIDGET_RESIZE, "element_widget_resize");
        this.action = new ThemeActionManager(this.manager, ThemeElementType.TYPE_ACTION, "element_action");
        this.managerLists = new ArrayList<>();
        this.managerLists.add(this.icon);
        this.managerLists.add(this.folder);
        this.managerLists.add(this.contact);
        this.managerLists.add(this.clock);
        this.managerLists.add(this.page);
        this.managerLists.add(this.smartButton);
        this.managerLists.add(this.action);
        this.managerLists.add(this.iconMenu);
        this.managerLists.add(this.lasso);
        this.managerLists.add(this.desktopEffect);
        this.managerLists.add(this.interactiveArrange);
        this.managerLists.add(this.appMutilChoice);
        this.managerLists.add(this.unreadCount);
        this.managerLists.add(this.widgetResize);
        this.managerLists.add(this.shellOther);
        if (f.d()) {
            f.b(false);
            Iterator<ThemeMixElementManager> it = this.managerLists.iterator();
            while (it.hasNext()) {
                ThemeMixElementManager next = it.next();
                resetTheme(next.getType(), next.getThemePackageName());
            }
            this.manager.refreshCacheThemeDescription();
        }
        this.ui = new ThemeSettingMenu();
        ThemeManager.getInstance().addListener(new ThemeManager.ThemeListener() { // from class: com.tsf.shell.theme.inside.ThemesMixManager.1
            @Override // com.tsf.shell.theme.inside.ThemeManager.ThemeListener
            public void onThemeAdd(String str) {
            }

            @Override // com.tsf.shell.theme.inside.ThemeManager.ThemeListener
            public void onThemeRemove(String str) {
            }

            @Override // com.tsf.shell.theme.inside.ThemeManager.ThemeListener
            public void onThemeUpdate(String str) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ThemesMixManager.this.managerLists.iterator();
                while (it2.hasNext()) {
                    ThemeMixElementManager themeMixElementManager = (ThemeMixElementManager) it2.next();
                    if (themeMixElementManager.themeUpdate(str)) {
                        Context context = null;
                        try {
                            context = a.d().createPackageContext(themeMixElementManager.getThemePackageName(), 3);
                        } catch (PackageManager.NameNotFoundException e) {
                        }
                        if (context != null) {
                            ThemeElementCacher.cacheThemeImage(context, themeMixElementManager.getType());
                            ThemeElementCacher.cacheThemeXml(context, themeMixElementManager.getType());
                            arrayList.add(themeMixElementManager);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    ThemesMixManager.this.manager.refreshCacheThemeDescription();
                    Iterator it3 = ThemesMixManager.this.managerLists.iterator();
                    while (it3.hasNext()) {
                        ((ThemeMixElementManager) it3.next()).refresh();
                    }
                }
            }
        });
    }

    public ArrayList<ThemeMixElementManager> getThemeMixElementManagerLists() {
        return this.managerLists;
    }

    public void showLoading() {
        a.a().a(new Runnable() { // from class: com.tsf.shell.theme.inside.ThemesMixManager.2
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.f.a.a(x.c(b.i.tsf_loading_content));
            }
        });
    }

    public void hideLoading() {
        a.a().a(new Runnable() { // from class: com.tsf.shell.theme.inside.ThemesMixManager.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.f.a.a();
            }
        });
    }

    public void resetAllTheme() {
    }

    public void resetTheme(int i, String str) {
        Context context = null;
        try {
            context = a.d().createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (context != null) {
            ThemeElementCacher.cacheThemeImage(context, i);
            ThemeElementCacher.cacheThemeXml(context, i);
        }
    }

    public void setTheme(int i, String str, boolean z) {
        Context context = null;
        try {
            context = a.d().createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (context != null) {
            setTheme(i, context, z);
        }
    }

    public void setTheme(final int i, final Context context, final boolean z) {
        if (z) {
            com.tsf.shell.f.a.a(x.c(b.i.tsf_loading_content));
        }
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.theme.inside.ThemesMixManager.4
            @Override // java.lang.Runnable
            public void run() {
                ThemeParser.ThemeInfo themeInfo = null;
                try {
                    themeInfo = ThemeParser.getThemeInfo(context);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ThemeElementCacher.cacheThemeImage(context, i);
                if (ThemeElementCacher.cacheThemeXml(context, i)) {
                    ThemesMixManager.this.manager.refreshCacheThemeDescription();
                }
                if (themeInfo != null) {
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_ACTION)) {
                        ThemesMixManager.this.action.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_APP_MUTIL_CHOICE)) {
                        ThemesMixManager.this.appMutilChoice.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, 8)) {
                        ThemesMixManager.this.folder.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, 16)) {
                        ThemesMixManager.this.contact.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, 4)) {
                        ThemesMixManager.this.clock.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_ICON_MENU)) {
                        ThemesMixManager.this.iconMenu.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_ARRANGE)) {
                        ThemesMixManager.this.interactiveArrange.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_LASSO)) {
                        ThemesMixManager.this.lasso.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_DESKTOP_EFFECT)) {
                        ThemesMixManager.this.desktopEffect.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_DESKTOP)) {
                        ThemesMixManager.this.page.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, 2)) {
                        ThemesMixManager.this.icon.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, 33)) {
                        ThemesMixManager.this.shellOther.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_UNREAD_COUNT)) {
                        ThemesMixManager.this.unreadCount.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_WALLPAPER)) {
                        ShellWallpaperManager shellWallpaperManager = com.tsf.shell.manager.a.f;
                        ShellWallpaperManager.a(themeInfo.packagename);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_WIDGET_RESIZE)) {
                        ThemesMixManager.this.widgetResize.setTheme(themeInfo);
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_SMART_BUTTON)) {
                        ThemesMixManager.this.smartButton.setTheme(themeInfo);
                    }
                }
                if (ThemesMixManager.this.ui != null && ThemesMixManager.this.ui.localMenu != null) {
                    ThemesMixManager.this.ui.localMenu.notifyDataSetChanged();
                }
                if (z) {
                    ThemesMixManager.this.hideLoading();
                }
            }
        };
        if (z) {
            a.a().b(runnable, 500L);
        } else {
            a.a().c(runnable);
        }
    }
}
