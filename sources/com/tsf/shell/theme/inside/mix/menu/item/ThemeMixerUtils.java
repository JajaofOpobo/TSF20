package com.tsf.shell.theme.inside.mix.menu.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.utils.C4181q;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ThemeMixerUtils {
    public static TextureElement createIconTexture(C3560a c3560a, String str, int i) {
        Bitmap m2022a = c3560a.m2022a();
        Bitmap m2011a = c3560a.m2011a(str);
        Canvas canvas = new Canvas(m2022a);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        c3560a.m2017a(canvas, C4181q.m635d(C4189x.m609a(i), c3560a.f11750H, c3560a.f11751I), m2011a, true);
        return C0853a.m10853g().m10544a(m2022a, true);
    }

    public static TextureElement createIconTexture(String str, String str2) {
        Bitmap m2022a = C3566b.f11839a.m2022a();
        Bitmap m2011a = C3566b.f11839a.m2011a(str);
        Canvas canvas = new Canvas(m2022a);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        C3566b.f11839a.m2017a(canvas, getThemeIconBitmap(str2), m2011a, true);
        return C0853a.m10853g().m10544a(m2022a, true);
    }

    private static Bitmap getThemeIconBitmap(String str) {
        Bitmap createScaledBitmap;
        try {
            Context createPackageContext = C0853a.m10856d().createPackageContext(str, 3);
            Drawable loadIcon = createPackageContext.getApplicationInfo().loadIcon(createPackageContext.getPackageManager());
            if (loadIcon != null && (loadIcon instanceof BitmapDrawable) && ((BitmapDrawable) loadIcon).getBitmap() != null) {
                Bitmap bitmap = ((BitmapDrawable) loadIcon).getBitmap();
                createScaledBitmap = Bitmap.createScaledBitmap(bitmap, C3566b.f11839a.f11750H, C3566b.f11839a.f11751I, true);
                if (createScaledBitmap == bitmap) {
                    createScaledBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                }
            } else {
                Bitmap m605a = C4189x.m605a(createPackageContext, createPackageContext.getApplicationInfo().icon);
                createScaledBitmap = Bitmap.createScaledBitmap(m605a, C3566b.f11839a.f11750H, C3566b.f11839a.f11751I, true);
                if (createScaledBitmap != m605a) {
                    m605a.recycle();
                } else {
                    createScaledBitmap = m605a;
                }
            }
            return createScaledBitmap;
        } catch (Exception e) {
            return null;
        }
    }
}
