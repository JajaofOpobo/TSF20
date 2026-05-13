package com.tsf.shell.theme.inside.mix.menu;

import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
/* loaded from: classes.dex */
public class DynamicThemeRunnable implements ThemeMixElementManager.DynamicThemeElement {
    private ThemeMixElementManager target;

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
    public void onReloadTheme(ThemeDescription themeDescription) {
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
    public void setListenerTarget(ThemeMixElementManager themeMixElementManager) {
        this.target = themeMixElementManager;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
    public ThemeMixElementManager getListenerTarget() {
        return this.target;
    }
}
