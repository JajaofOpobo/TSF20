package com.tsf.shell.theme.inside.mix.menu.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.utils.r;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class ThemeMixerUtils {
    public static TextureElement createIconTexture(com.tsf.shell.manager.o.a aVar, String str, int i) {
        Bitmap a = aVar.a();
        Bitmap a2 = aVar.a(str);
        Canvas canvas = new Canvas(a);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        aVar.a(canvas, r.d(x.a(i), aVar.H, aVar.I), a2, true);
        return com.censivn.C3DEngine.a.g().a(a, true);
    }

    public static TextureElement createIconTexture(String str, String str2) {
        Bitmap a = com.tsf.shell.manager.o.b.a.a();
        Bitmap a2 = com.tsf.shell.manager.o.b.a.a(str);
        Canvas canvas = new Canvas(a);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        com.tsf.shell.manager.o.b.a.a(canvas, getThemeIconBitmap(str2), a2, true);
        return com.censivn.C3DEngine.a.g().a(a, true);
    }

    private static Bitmap getThemeIconBitmap(String str) {
        Bitmap createScaledBitmap;
        try {
            Context createPackageContext = com.censivn.C3DEngine.a.d().createPackageContext(str, 3);
            Drawable loadIcon = createPackageContext.getApplicationInfo().loadIcon(createPackageContext.getPackageManager());
            if (loadIcon != null && (loadIcon instanceof BitmapDrawable) && ((BitmapDrawable) loadIcon).getBitmap() != null) {
                Bitmap bitmap = ((BitmapDrawable) loadIcon).getBitmap();
                createScaledBitmap = Bitmap.createScaledBitmap(bitmap, com.tsf.shell.manager.o.b.a.H, com.tsf.shell.manager.o.b.a.I, true);
                if (createScaledBitmap == bitmap) {
                    createScaledBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                }
            } else {
                Bitmap a = x.a(createPackageContext, createPackageContext.getApplicationInfo().icon);
                createScaledBitmap = Bitmap.createScaledBitmap(a, com.tsf.shell.manager.o.b.a.H, com.tsf.shell.manager.o.b.a.I, true);
                if (createScaledBitmap != a) {
                    a.recycle();
                } else {
                    createScaledBitmap = a;
                }
            }
            return createScaledBitmap;
        } catch (Exception e) {
            return null;
        }
    }
}
