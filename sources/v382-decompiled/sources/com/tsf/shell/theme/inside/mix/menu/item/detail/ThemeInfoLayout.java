package com.tsf.shell.theme.inside.mix.menu.item.detail;

import com.tsf.shell.theme.inside.ThemeListsManager;

/* loaded from: classes.dex */
public abstract class ThemeInfoLayout extends com.censivn.C3DEngine.b.b.a.a {
    @Override // com.censivn.C3DEngine.b.b.a.a
    public abstract void recycle();

    public abstract void setTheme(ThemeListsManager.ThemeInfo themeInfo);

    public ThemeInfoLayout() {
        setTitlePosition(com.censivn.C3DEngine.b.b.a.a(280.0f));
        setTitleSize(36);
    }
}
