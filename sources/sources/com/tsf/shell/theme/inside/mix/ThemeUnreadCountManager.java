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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * com.censivn.C3DEngine.b.b.a.b), (int) (bitmap.getHeight() * com.censivn.C3DEngine.b.b.a.b), true);
            if (bitmap != bitmapCreateScaledBitmap) {
                bitmap.recycle();
            }
            int iRandom = (int) (10.0d + (Math.random() * 200.0d));
            com.tsf.shell.manager.o.a.a aVar = new com.tsf.shell.manager.o.a.a();
            aVar.h(36);
            aVar.i(-1);
            Bitmap bitmapB = aVar.b(Integer.toString(iRandom));
            int width = bitmapB.getWidth();
            Bitmap bitmapE = ((float) width) + (com.censivn.C3DEngine.b.b.a.b * 28.0f) > ((float) bitmapCreateScaledBitmap.getWidth()) ? q.e(bitmapCreateScaledBitmap, bitmapCreateScaledBitmap.getWidth() / 2, width + ((int) (com.censivn.C3DEngine.b.b.a.b * 28.0f))) : bitmapCreateScaledBitmap;
            int width2 = bitmapE.getWidth() > bitmapE.getHeight() ? bitmapE.getWidth() : bitmapE.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width2, width2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float width3 = (width2 - bitmapE.getWidth()) / 2;
            float height = (width2 - bitmapE.getHeight()) / 2;
            canvas.drawBitmap(bitmapE, width3, height, (Paint) null);
            bitmapE.recycle();
            canvas.drawBitmap(bitmapB, width3 + (((bitmapE.getWidth() - bitmapB.getWidth()) / 2) - 1), height + (((bitmapE.getHeight() - bitmapB.getHeight()) / 2) - 4), (Paint) null);
            bitmapB.recycle();
            bitmap2 = bitmapCreateBitmap;
            return bitmap2;
        } catch (Exception e) {
            return bitmap2;
        }
    }
}
