package com.censivn.C3DEngine.api.element.info.shortcut;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.b;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.o.a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.q;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public abstract class LauncherShortcut3DInfo extends ItemInfo {
    public Intent intent;
    public TextureElement texture;

    public abstract Bitmap getIconBitmap();

    public LauncherShortcut3DInfo(int i) {
        super(i);
        this.texture = new TextureElement(0, false);
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public LauncherShortcut3DInfo copy() {
        return null;
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public void onAddToDatabase(ContentValues contentValues) {
        super.onAddToDatabase(contentValues);
        contentValues.put("title", this.title != null ? this.title.toString() : "");
        contentValues.put("intent", this.intent != null ? this.intent.toUri(0) : null);
    }

    public boolean isCustomTexture() {
        return this.iconType != 0 || this.titleType == 1;
    }

    public boolean isFullCustomTexture() {
        return this.iconType != 0 && this.titleType == 1;
    }

    public Bitmap getIcon(boolean z, a aVar) {
        return getIcon(z, aVar.H, aVar.I);
    }

    public Bitmap getIcon(boolean z, int i, int i2) {
        Bitmap bitmap = null;
        switch (this.iconType) {
            case 1:
                try {
                    if (this.themeResourceName != null) {
                        bitmap = ThemeManager.getInstance().getCacheThemeDescription().getBitmap(this.themeResourceName, i, i2);
                    } else {
                        Resources resourcesForApplication = com.censivn.C3DEngine.a.d().getPackageManager().getResourcesForApplication(this.iconResource.packageName);
                        if (resourcesForApplication != null) {
                            bitmap = x.a(resourcesForApplication, resourcesForApplication.getIdentifier(this.iconResource.resourceName, null, null));
                        }
                    }
                    break;
                } catch (Exception e) {
                    break;
                }
            case 2:
                bitmap = q.a(ShellModel.a.a(this));
                break;
        }
        if (bitmap != null) {
            return q.d(bitmap, i, i2);
        }
        if (bitmap == null && !z) {
            return q.d(x.a(b.d.sym_def_app_icon), i, i2);
        }
        return bitmap;
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public void unbindGL() {
        super.unbindGL();
        if (this.texture.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.texture);
        }
    }
}
