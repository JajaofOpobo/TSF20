package com.tsf.shell.theme.inside.description;
/* loaded from: classes.dex */
public abstract class ThemeDescriptionInterface {
    private ThemeDescription mDescription;

    public ThemeDescriptionInterface(ThemeDescription themeDescription) {
        this.mDescription = themeDescription;
    }

    public ThemeDescription getDescription() {
        return this.mDescription;
    }
}
