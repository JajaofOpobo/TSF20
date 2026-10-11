package com.censivn.C3DEngine.api.element.info.shortcut;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.manager.o.ButtonMetrics;
import com.tsf.shell.utils.BitmapTransformationHelper;
import com.tsf.shell.utils.GraphicsEngineBridge;
import com.tsf.shell.f.i.b.e.DrawerShortcutItemBase;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LauncherShortcutStandardInfo extends LauncherShortcut3DInfo {
    public boolean notifPointState;

    public static class ResourceControler {
        boolean isCustomResource = false;

        public Bitmap getThemeBitmap(ButtonMetrics aVar) {
            return null;
        }

        public void onLoadCustomResource() {
            this.isCustomResource = true;
        }

        public void onLoadThemeResource() {
            this.isCustomResource = false;
        }

        public boolean isCustomResource() {
            return this.isCustomResource;
        }
    }

    public void enableNotifPoint() {
        if (!this.notifPointState) {
            this.notifPointState = true;
        }
    }

    public void disableNotifPoint() {
        if (this.notifPointState) {
            this.notifPointState = false;
        }
    }

    public LauncherShortcutStandardInfo() {
        super(7);
        this.notifPointState = false;
    }

    @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo
    public Bitmap getIconBitmap() {
        return createTextureBitmap(null, ((DrawerShortcutItemBase) getWidget()).aE());
    }

    public TextureElement getTexture(ButtonMetrics aVar) {
        return getTexture(null, aVar);
    }

    public TextureElement getTexture(ResourceControler resourceControler, ButtonMetrics aVar) {
        com.censivn.C3DEngine.C3DEngine.g().a(this.texture, createTextureBitmap(resourceControler, aVar));
        return this.texture;
    }

    private Bitmap createTextureBitmap(ResourceControler resourceControler, ButtonMetrics aVar) {
        return createTextureBitmap(resourceControler, this.title, getIcon(true, aVar.H, aVar.I), aVar, aVar.H, aVar.I, this.notifPointState);
    }

    public static Bitmap createTextureBitmap(String str, Bitmap bitmap, ButtonMetrics aVar, boolean z) {
        return createTextureBitmap(null, str, bitmap, aVar, aVar.H, aVar.I, z);
    }

    public static Bitmap createTextureBitmap(ResourceControler resourceControler, String str, Bitmap bitmap, ButtonMetrics aVar, int i, int i2, boolean z) {
        Bitmap bitmapA = aVar.a();
        if (str == null) {
            str = "";
        }
        Bitmap bitmapA2 = aVar.a(str);
        Canvas canvas = new Canvas(bitmapA);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        if (bitmap == null) {
            Bitmap themeBitmap = resourceControler != null ? resourceControler.getThemeBitmap(aVar) : null;
            if (themeBitmap == null) {
                themeBitmap = GraphicsEngineBridge.a(com.tsf.b.d.sym_def_app_icon);
                if (resourceControler != null) {
                    resourceControler.onLoadCustomResource();
                }
            } else if (resourceControler != null) {
                resourceControler.onLoadThemeResource();
            }
            bitmap = BitmapTransformationHelper.d(themeBitmap, i, i2);
        } else if (resourceControler != null) {
            resourceControler.onLoadCustomResource();
        }
        aVar.a(canvas, bitmap, bitmapA2, true);
        if (z) {
            BitmapTransformationHelper.a(canvas, 10.0f, 175.0f, 5.0f, -49152);
        }
        DrawerShortcutItemBase.a(bitmapA);
        return bitmapA;
    }
}
