package com.tsf.shell.p096f.p118e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tsf.shell.manager.p183o.p184a.C3561a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.e.o */
/* loaded from: classes.dex */
class C2649o {
    /* renamed from: a */
    public static Bitmap m5063a(ArrayList<String> arrayList) {
        ThemeShellDescription themeShellDescription = ThemeManager.mix.lasso.getTheme().shell;
        Bitmap createBitmap = Bitmap.createBitmap(160, 160, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(160, 32, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            C3561a c3561a = new C3561a();
            c3561a.m2004a(160);
            c3561a.m1999b(32);
            c3561a.m2001a(true);
            c3561a.m1997b(true);
            c3561a.m1988i(themeShellDescription.lassoLabelTextColor);
            c3561a.m2006a(22.0f);
            c3561a.m2000b(12.0f);
            c3561a.m1990g(themeShellDescription.lassoLabelBgColor);
            Bitmap m1998b = c3561a.m1998b(arrayList.get(i));
            canvas2.drawBitmap(m1998b, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(createBitmap2, 0.0f, i * 32, (Paint) null);
            m1998b.recycle();
            createBitmap2.recycle();
        }
        return createBitmap;
    }
}
