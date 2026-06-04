package com.tsf.shell.theme.inside;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class DefaultIconItem {
    public ThemeIconDescription description;
    public String drawable;
    public String folder;
    public float scale;

    public DefaultIconItem(ThemeIconDescription themeIconDescription, String str, String str2, float f) {
        this.scale = 1.0f;
        this.description = themeIconDescription;
        this.drawable = str;
        this.scale = f;
        this.folder = str2;
    }

    public Bitmap getBitmap() {
        if (this.description == null) {
            return null;
        }
        return this.description.getBitmp(this, this.folder);
    }
}
