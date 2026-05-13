package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.q;
/* loaded from: classes.dex */
public class ThemeUnreadCountManager extends ThemeMixElementManager {
    public ThemeUnreadCountManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(a.d(), getTheme().getContext(), i, i2, true);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
        com.tsf.shell.manager.l.a.a();
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return q.d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        return createPreviewBitmap(ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.UNREAD_COUNT_BG, z));
    }

    public static Bitmap createPreviewBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = null;
        if (bitmap == null) {
            return null;
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * com.censivn.C3DEngine.b.b.a.b), (int) (bitmap.getHeight() * com.censivn.C3DEngine.b.b.a.b), true);
            if (bitmap != createScaledBitmap) {
                bitmap.recycle();
            }
            com.tsf.shell.manager.o.a.a aVar = new com.tsf.shell.manager.o.a.a();
            aVar.h(36);
            aVar.i(-1);
            Bitmap b = aVar.b(Integer.toString((int) (10.0d + (Math.random() * 200.0d))));
            int width = b.getWidth();
            Bitmap e = ((float) width) + (com.censivn.C3DEngine.b.b.a.b * 28.0f) > ((float) createScaledBitmap.getWidth()) ? q.e(createScaledBitmap, createScaledBitmap.getWidth() / 2, width + ((int) (com.censivn.C3DEngine.b.b.a.b * 28.0f))) : createScaledBitmap;
            int width2 = e.getWidth() > e.getHeight() ? e.getWidth() : e.getHeight();
            Bitmap createBitmap = Bitmap.createBitmap(width2, width2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float width3 = (width2 - e.getWidth()) / 2;
            float height = (width2 - e.getHeight()) / 2;
            canvas.drawBitmap(e, width3, height, (Paint) null);
            e.recycle();
            canvas.drawBitmap(b, width3 + (((e.getWidth() - b.getWidth()) / 2) - 1), height + (((e.getHeight() - b.getHeight()) / 2) - 4), (Paint) null);
            b.recycle();
            bitmap2 = createBitmap;
            return bitmap2;
        } catch (Exception e2) {
            return bitmap2;
        }
    }
}
