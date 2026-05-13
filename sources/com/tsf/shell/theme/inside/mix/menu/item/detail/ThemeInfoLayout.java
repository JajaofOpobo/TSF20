package com.tsf.shell.theme.inside.mix.menu.item.detail;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0894a;
import com.tsf.shell.theme.inside.ThemeListsManager;
/* loaded from: classes.dex */
public abstract class ThemeInfoLayout extends C0894a {
    @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0894a
    public abstract void recycle();

    public abstract void setTheme(ThemeListsManager.ThemeInfo themeInfo);

    public ThemeInfoLayout() {
        setTitlePosition(C0892a.m10742a(280.0f));
        setTitleSize(36);
    }
}
