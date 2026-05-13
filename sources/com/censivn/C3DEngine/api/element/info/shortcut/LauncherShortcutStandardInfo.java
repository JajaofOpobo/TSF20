package com.censivn.C3DEngine.api.element.info.shortcut;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4181q;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class LauncherShortcutStandardInfo extends LauncherShortcut3DInfo {
    public boolean notifPointState;

    /* loaded from: classes.dex */
    public static class ResourceControler {
        boolean isCustomResource = false;

        public Bitmap getThemeBitmap(C3560a c3560a) {
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
        return createTextureBitmap(null, ((AbstractC3208b) getWidget()).m3159aE());
    }

    public TextureElement getTexture(C3560a c3560a) {
        return getTexture(null, c3560a);
    }

    public TextureElement getTexture(ResourceControler resourceControler, C3560a c3560a) {
        C0853a.m10853g().m10540a(this.texture, createTextureBitmap(resourceControler, c3560a));
        return this.texture;
    }

    private Bitmap createTextureBitmap(ResourceControler resourceControler, C3560a c3560a) {
        return createTextureBitmap(resourceControler, this.title, getIcon(true, c3560a.f11750H, c3560a.f11751I), c3560a, c3560a.f11750H, c3560a.f11751I, this.notifPointState);
    }

    public static Bitmap createTextureBitmap(String str, Bitmap bitmap, C3560a c3560a, boolean z) {
        return createTextureBitmap(null, str, bitmap, c3560a, c3560a.f11750H, c3560a.f11751I, z);
    }

    public static Bitmap createTextureBitmap(ResourceControler resourceControler, String str, Bitmap bitmap, C3560a c3560a, int i, int i2, boolean z) {
        Bitmap m2022a = c3560a.m2022a();
        if (str == null) {
            str = "";
        }
        Bitmap m2011a = c3560a.m2011a(str);
        Canvas canvas = new Canvas(m2022a);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        if (bitmap == null) {
            Bitmap themeBitmap = resourceControler != null ? resourceControler.getThemeBitmap(c3560a) : null;
            if (themeBitmap == null) {
                themeBitmap = C4189x.m609a(C1306b.C1310d.sym_def_app_icon);
                if (resourceControler != null) {
                    resourceControler.onLoadCustomResource();
                }
            } else if (resourceControler != null) {
                resourceControler.onLoadThemeResource();
            }
            bitmap = C4181q.m635d(themeBitmap, i, i2);
        } else if (resourceControler != null) {
            resourceControler.onLoadCustomResource();
        }
        c3560a.m2017a(canvas, bitmap, m2011a, true);
        if (z) {
            C4181q.m642a(canvas, 10.0f, 175.0f, 5.0f, -49152);
        }
        AbstractC3208b.m3171a(m2022a);
        return m2022a;
    }
}
