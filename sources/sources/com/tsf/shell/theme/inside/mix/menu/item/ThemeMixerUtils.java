package com.tsf.shell.theme.inside.mix.menu.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.manager.o.a;
import com.tsf.shell.manager.o.b;
import com.tsf.shell.utils.q;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeMixerUtils {
    public static TextureElement createIconTexture(a aVar, String str, int i) {
        Bitmap bitmapA = aVar.a();
        Bitmap bitmapA2 = aVar.a(str);
        Canvas canvas = new Canvas(bitmapA);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        aVar.a(canvas, q.d(x.a(i), aVar.H, aVar.I), bitmapA2, true);
        return com.censivn.C3DEngine.a.g().a(bitmapA, true);
    }

    public static TextureElement createIconTexture(String str, String str2) {
        Bitmap bitmapA = b.a.a();
        Bitmap bitmapA2 = b.a.a(str);
        Canvas canvas = new Canvas(bitmapA);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        b.a.a(canvas, getThemeIconBitmap(str2), bitmapA2, true);
        return com.censivn.C3DEngine.a.g().a(bitmapA, true);
    }

    private static Bitmap getThemeIconBitmap(String str) {
        Bitmap bitmapCreateScaledBitmap;
        try {
            Context contextCreatePackageContext = com.censivn.C3DEngine.a.d().createPackageContext(str, 3);
            Drawable drawableLoadIcon = contextCreatePackageContext.getApplicationInfo().loadIcon(contextCreatePackageContext.getPackageManager());
            if (drawableLoadIcon != null && (drawableLoadIcon instanceof BitmapDrawable) && ((BitmapDrawable) drawableLoadIcon).getBitmap() != null) {
                Bitmap bitmap = ((BitmapDrawable) drawableLoadIcon).getBitmap();
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, b.a.H, b.a.I, true);
                if (bitmapCreateScaledBitmap == bitmap) {
                    bitmapCreateScaledBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                }
            } else {
                Bitmap bitmapA = x.a(contextCreatePackageContext, contextCreatePackageContext.getApplicationInfo().icon);
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, b.a.H, b.a.I, true);
                if (bitmapCreateScaledBitmap != bitmapA) {
                    bitmapA.recycle();
                } else {
                    bitmapCreateScaledBitmap = bitmapA;
                }
            }
            return bitmapCreateScaledBitmap;
        } catch (Exception e) {
            return null;
        }
    }
}
