package com.tsf.shell.theme.inside.mix.menu;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.element.ThemeElementType;
/* loaded from: classes.dex */
public class DynamicTextureElement extends TextureElement implements ThemeMixElementManager.DynamicThemeElement {
    private int height;
    private Runnable reloadThemeRunnable;
    public String resourceName;
    private ThemeMixElementManager target;
    private int type;
    private int width;

    public DynamicTextureElement(ThemeDescription themeDescription, int i, String str, int i2, int i3) {
        super(0, false);
        this.resourceName = str;
        this.width = i2;
        this.height = i3;
        this.type = i;
        resetTheme(themeDescription);
    }

    public void setReloadThemeRunnable(Runnable runnable) {
        this.reloadThemeRunnable = runnable;
    }

    public void resetTheme(ThemeDescription themeDescription) {
        if (themeDescription != null) {
            Bitmap bitmap = null;
            if (ThemeElementType.getParserState(this.type, 1)) {
                bitmap = themeDescription.getBitmap(this.resourceName, this.width, this.height);
            }
            if (bitmap != null) {
                a.g().a(this, bitmap);
                bitmap.recycle();
                if (this.reloadThemeRunnable != null) {
                    this.reloadThemeRunnable.run();
                }
            }
        }
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
    public void setListenerTarget(ThemeMixElementManager themeMixElementManager) {
        this.target = themeMixElementManager;
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
    public ThemeMixElementManager getListenerTarget() {
        return this.target;
    }

    public void onRecycle() {
        if (this.target != null) {
            this.target.removeElementListener(this);
            this.target = null;
            this.reloadThemeRunnable = null;
        }
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
    public void onReloadTheme(ThemeDescription themeDescription) {
        resetTheme(themeDescription);
    }
}
