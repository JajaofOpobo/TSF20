package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tsf.b;
import com.tsf.shell.manager.a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.q;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemePageManager extends ThemeMixElementManager {
    public ThemePageManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
        a.h.e();
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(com.censivn.C3DEngine.a.d(), getTheme().getContext(), i, i2, true);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return q.d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        return createPreviewBitmap(ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.PAGE_PREVIEW_UNSELECT, z), ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.PAGE_PREVIEW_SELECT, z));
    }

    public static Bitmap createPreviewBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(82, 82, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Bitmap bitmapA = x.a(b.d.theme_mix_desktop_thumb);
        Bitmap bitmapCreatePreviewBitmap = createPreviewBitmap(bitmap);
        canvas.drawBitmap(bitmapCreatePreviewBitmap, 22.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapA, 35.0f, 13.0f, (Paint) null);
        bitmapCreatePreviewBitmap.recycle();
        Bitmap bitmapCreatePreviewBitmap2 = createPreviewBitmap(bitmap2);
        canvas.drawBitmap(bitmapCreatePreviewBitmap2, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapA, 13.0f, 13.0f, (Paint) null);
        bitmapCreatePreviewBitmap2.recycle();
        bitmapA.recycle();
        return bitmapCreateBitmap;
    }

    private static Bitmap createPreviewBitmap(Bitmap bitmap) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 40, 40, true);
        bitmap.recycle();
        Bitmap bitmapA = q.a(bitmapCreateScaledBitmap, 20, 20, 60, 82);
        bitmapCreateScaledBitmap.recycle();
        return bitmapA;
    }
}
